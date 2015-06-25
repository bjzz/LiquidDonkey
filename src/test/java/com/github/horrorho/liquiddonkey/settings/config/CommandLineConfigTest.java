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
 * values copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.horrorho.liquiddonkey.settings.config;

import com.github.horrorho.liquiddonkey.settings.CommandLineOptions;
import com.github.horrorho.liquiddonkey.settings.Property;
import com.github.horrorho.liquiddonkey.settings.Props;
import java.nio.file.Paths;
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
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Ahseya
 */
@RunWith(JUnitParamsRunner.class)
public class CommandLineConfigTest {

    private final CommandLineOptions options = CommandLineOptions.newInstance(Property.props()); // TODO can pass empty here? or create

    @Test
    @Parameters
    public <T> void testFromArgs(String in, Function<Config, T> function, T expected) {
        String[] args = in.split("\\s");
        Config config = CommandLineConfig.getInstance().fromArgs(args);
        T value = function.apply(config);
        assertThat(value, is(expected));
    }

    public static Object[] parametersForTestFromArgs() {
        return new Object[]{
            o("user password", config -> ((AuthenticationConfig.AuthenticationConfigAppleIdPassword) config.authentication()).id(), "user"),
            o("user password", config -> ((AuthenticationConfig.AuthenticationConfigAppleIdPassword) config.authentication()).password(), "password"),
            o("u p --output test/folder", config -> config.directory().base(), Paths.get("test/folder").toAbsolutePath()),
            o("u p --udid", config -> config.selection().udids(), set("")),
            o("u p --udid 1FfF", config -> config.selection().udids(), set("1FfF")),
            o("u p --udid 1fff 2FFF", config -> config.selection().udids(), set("1fff", "2FFF")),
            o("u p --udid 1fff 2FFF 2FFF", config -> config.selection().udids(), set("1fff", "2FFF")),
            o("u p --snapshot 1", config -> config.selection().snapshots(), set(1)),
            o("u p --snapshot 1 2", config -> config.selection().snapshots(), set(1, 2)),
            o("u p --snapshot 1 2 2", config -> config.selection().snapshots(), set(1, 2)),
            o("u p --snapshot -1", config -> config.selection().snapshots(), set(-1)),
            o("u p", config -> config.fileFilter().relativePathContains(), set("")),
            o("u p --relative-path first", config -> config.fileFilter().relativePathContains(), set("first")),
            o("u p --relative-path first second", config -> config.fileFilter().relativePathContains(), set("first", "second")),
            o("u p --relative-path first second second", config -> config.fileFilter().relativePathContains(), set("first", "second")),
            o("u p --item-types PHOTOS", config -> config.fileFilter().relativePathContains(), set(Property.ITEM_TYPE_PHOTOS)),
            o("u p --item-types photos", config -> config.fileFilter().relativePathContains(), set(Property.ITEM_TYPE_PHOTOS)),
            o("u p --item-types photos MOVIES", config -> config.fileFilter().relativePathContains(), set(Property.ITEM_TYPE_PHOTOS, Property.ITEM_TYPE_MOVIES)),
            o("u p --item-types photos MOVIES Movies", config -> config.fileFilter().relativePathContains(), set(Property.ITEM_TYPE_PHOTOS, Property.ITEM_TYPE_MOVIES)),
            o("u p", config -> config.fileFilter().extensions(), set("")),
            o("u p --extension Abc", config -> config.fileFilter().extensions(), set(".Abc")),
            o("u p --extension .Abc", config -> config.fileFilter().extensions(), set(".Abc")),
            o("u p --extension .Abc efg", config -> config.fileFilter().extensions(), set(".Abc", ".efg")),
            o("u p --extension .Abc efg efg", config -> config.fileFilter().extensions(), set(".Abc", ".efg")),
            o("u p", config -> config.fileFilter().domainContains(), set("")),
            o("u p --domain first", config -> config.fileFilter().domainContains(), set("first")),
            o("u p --domain first Second", config -> config.fileFilter().domainContains(), set("first", "Second")),
            o("u p --min-date 0000-01-01", config -> config.fileFilter().minDate(), -62167219125L),
            o("u p --max-date 9999-01-01", config -> config.fileFilter().maxDate(), 253370764800L),
            o("u p --min-size 0", config -> config.fileFilter().minSize(), 0L),
            o("u p --min-size 64", config -> config.fileFilter().minSize(), 65536L),
            o("u p --max-size 0", config -> config.fileFilter().maxSize(), 0L),
            o("u p --max-size 64", config -> config.fileFilter().maxSize(), 65536L)
        };
    }

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
