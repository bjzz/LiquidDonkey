/*
 * The MIT License
 *
 * Copyright 2015 Ahseya.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.horrorho.liquiddonkey.settings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.stream.Collectors;
import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * CommandLineConfiguration.
 *
 * @author Ahseya
 */
@Immutable
@ThreadSafe
public final class CommandLineConfiguration {

    private static final CommandLineConfiguration instance = new CommandLineConfiguration();

    public static CommandLineConfiguration newInstance() {
        return instance;
    }

    CommandLineConfiguration() {
    }

    public Properties properties(
            CommandLineOptions commandLineOptions,
            String[] args,
            String version
    ) throws ParseException {

        CommandLineParser parser = new DefaultParser();
        Options options = commandLineOptions.options();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption(commandLineOptions.help())) {
            HelpFormatter helpFormatter = new HelpFormatter();
            helpFormatter.setOptionComparator(null);
            helpFormatter.printHelp("DonkeyLooter appleid password [OPTION]...", options);
            return null;
        }

        if (cmd.hasOption(commandLineOptions.version())) {
            System.out.println(version);
            return null;
        }

        switch (cmd.getArgList().size()) {
            case 0:
                throw new ParseException("Missing appleid and password.");
            case 1:
                throw new ParseException("Missing password.");
            case 2:
                break;
            default:
                throw new ParseException("Too many non-optional arguments, expected appleid and password only.");
        }

        Properties properties = new Properties();

        properties.setProperty(Property.AUTHENTICATION_APPLEID.key(), cmd.getArgList().get(0));
        properties.setProperty(Property.AUTHENTICATION_PASSWORD.key(), cmd.getArgList().get(1));

        Iterator<Option> it = cmd.iterator();

        while (it.hasNext()) {
            Option option = it.next();
            String opt = commandLineOptions.opt(option);
            String key = commandLineOptions.property(option).key();

            if (option.hasArgs()) {
                properties.setProperty(
                        key,
                        Arrays.asList(cmd.getOptionValues(opt)).stream().collect(Collectors.joining(" ")));
            } else if (option.hasArg()) {
                properties.setProperty(
                        key,
                        cmd.getOptionValue(opt));
            } else {
                properties.setProperty(
                        key,
                        Boolean.toString(cmd.hasOption(opt)));
            }
        }

        return properties;
    }
}