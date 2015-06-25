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

import com.github.horrorho.liquiddonkey.settings.config.CommandLineConfig;
import com.github.horrorho.liquiddonkey.settings.config.Config;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import junitparams.JUnitParamsRunner;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Ahseya
 */
@RunWith(JUnitParamsRunner.class)
public class CommandLinePropsFactoryTest {

    private final CommandLineOptions options = CommandLineOptions.newInstance(Property.props()); // TODO can pass empty here? or create

    @Test
    @Parameters
    public void testCommandLine(Property property, String in, String expected) throws Exception {
        String[] args = in.split("\\s");
        Props<Property> props = CommandLineConfig.getInstance().commandLine(null, options, args);
        String value = props.contains(property)
                ? props.get(property)
                : null;
        assertThat(value, is(expected));
    }

    public static Object[] parametersForTestCommandLine() {
        return new Object[]{
            $(Property.AUTHENTICATION_TOKEN, "token", "token"),
            $(Property.AUTHENTICATION_APPLEID, "username password", "username"),
            $(Property.AUTHENTICATION_PASSWORD, "username password", "password"),
            $(Property.ENGINE_AGGRESSIVE, "u p", null),
            $(Property.ENGINE_AGGRESSIVE, "u p -a", "true"),
            $(Property.ENGINE_AGGRESSIVE, "u p --aggressive", "true"),
            $(Property.ENGINE_PERSISTENT, "u p", null),
            $(Property.ENGINE_PERSISTENT, "u p -p", "true"),
            $(Property.ENGINE_PERSISTENT, "u p --persistent", "true"),
            $(Property.ENGINE_PRINT_STACK_TRACE, "u p", null),
            $(Property.ENGINE_PRINT_STACK_TRACE, "u p -x", "true"),
            $(Property.ENGINE_PRINT_STACK_TRACE, "u p --stack-trace", "true"),
            $(Property.ENGINE_THREAD_COUNT, "u p", null),
            $(Property.ENGINE_THREAD_COUNT, "u p -t 4", "4"),
            $(Property.ENGINE_THREAD_COUNT, "u p --threads 4", "4"),
            $(Property.FILE_COMBINED, "u p", null),
            $(Property.FILE_COMBINED, "u p -c", true),
            $(Property.FILE_COMBINED, "u p --combined", true),
            $(Property.FILE_FORCE, "u p", null),
            $(Property.FILE_FORCE, "u p -f", true),
            $(Property.FILE_FORCE, "u p --force", true),
            $(Property.FILE_OUTPUT_DIRECTORY, "u p", null),
            $(Property.FILE_OUTPUT_DIRECTORY, "u p -o test/folder", "test/folder"),
            $(Property.FILE_OUTPUT_DIRECTORY, "u p --output test/folder", "test/folder"),
            $(Property.FILTER_DATE_MAX, "u p", null),
            $(Property.FILTER_DATE_MAX, "u p --max-date 9999-09-09", "9999-09-09"),
            $(Property.FILTER_DATE_MIN, "u p", null),
            $(Property.FILTER_DATE_MIN, "u p --min-date 1111-11-11", "1111-11-11"),
            $(Property.FILTER_DOMAIN, "u p", null),
            $(Property.FILTER_DOMAIN, "u p -d one", "one"),
            $(Property.FILTER_DOMAIN, "u p -d one two", "one two"),
            $(Property.FILTER_DOMAIN, "u p --domain one two three", "one two three"),
            $(Property.FILTER_EXTENSION, "u p", null),
            $(Property.FILTER_EXTENSION, "u p -e .one", ".one"),
            $(Property.FILTER_EXTENSION, "u p -e one .two", "one .two"),
            $(Property.FILTER_EXTENSION, "u p --extension one two three", "one two three"),
            $(Property.FILTER_ITEM_TYPES, "u p", null),
            $(Property.FILTER_ITEM_TYPES, "u p --item-types one", "one"),
            $(Property.FILTER_ITEM_TYPES, "u p --item-types one two", "one two"),
            $(Property.FILTER_ITEM_TYPES, "u p --item-types one two three", "one two three"),
            $(Property.FILTER_RELATIVE_PATH, "u p", null),
            $(Property.FILTER_RELATIVE_PATH, "u p -r one", "one"),
            $(Property.FILTER_RELATIVE_PATH, "u p -r one two", "one two"),
            $(Property.FILTER_RELATIVE_PATH, "u p --relative-path one two three", "one two three"),
            $(Property.FILTER_SIZE_MAX, "u p", null),
            $(Property.FILTER_SIZE_MAX, "u p --max-size 4096", "4096"),
            $(Property.FILTER_SIZE_MIN, "u p", null),
            $(Property.FILTER_SIZE_MIN, "u p --min-size 1024", "1024"),
            $(Property.HTTP_RELAX_SSL, "u p", null),
            $(Property.HTTP_RELAX_SSL, "u p --relax-ssl", "true"),
            $(Property.SELECTION_SNAPSHOT, "u p", null),
            $(Property.SELECTION_SNAPSHOT, "u p -s 1", "1"),
            $(Property.SELECTION_SNAPSHOT, "u p -s 1 2", "1 2"),
            $(Property.SELECTION_SNAPSHOT, "u p --snapshot 1 2 3", "1 2 3"),
            $(Property.SELECTION_UDID, "u p", null),
            $(Property.SELECTION_UDID, "u p -u", ""),
            $(Property.SELECTION_UDID, "u p -u 1", "1"),
            $(Property.SELECTION_UDID, "u p -u 1 2", "1 2"),
            $(Property.SELECTION_UDID, "u p --udid 1 2 3", "1 2 3")
        };
    }

    public static <T> Object[] o(String in, Function<Config, T> function, T expected) {
        return new Object[]{in, function, expected};
    }

    public static Set<String> set(Property... properties) {
        return set(
                Stream.of(properties)
                .map(property -> property.getDefaultValue().split("\\s"))
                .collect(Collectors.toList()));
    }

    public static <T> Set<T> set(T... t) {
        return Stream.of(t).collect(Collectors.toSet());
    }

    public static Set<String> set(List<String[]> strings) {
        return strings.stream().map(Arrays::asList).flatMap(List::stream).collect(Collectors.toSet());
    }

}
