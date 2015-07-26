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
package com.github.horrorho.liquiddonkey.settings.config;

import com.github.horrorho.liquiddonkey.settings.Property;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;

/**
 * FileFilter configuration.
 *
 * @author Ahseya
 */
@Immutable
@ThreadSafe
public final class FileFilterConfig {

    public static FileFilterConfig newInstance(Properties properties) {
        Props<Property> props = Props.from(properties);
        
        Collection<String> domains = new HashSet<>();
        ItemTypes itemTypes = ItemTypes.newInstance(props);

        if (props.contains(Property.FILTER_DOMAIN)) {
            domains.addAll(props.get(Property.FILTER_DOMAIN, props::asList));
        }

        if (domains.isEmpty()) {
            domains.add("");
        }

        Collection<String> relativePath = new HashSet<>();

        if (props.contains(Property.FILTER_RELATIVE_PATH)) {
            relativePath.addAll(props.get(Property.FILTER_RELATIVE_PATH, props::asList));
        }

        if (props.contains(Property.FILTER_ITEM_TYPES)) {
            relativePath.addAll(itemTypes.paths(props.get(Property.FILTER_ITEM_TYPES, props::asList)));
        }

        if (relativePath.isEmpty()) {
            relativePath.add("");
        }

        Collection<String> extensions = new HashSet<>();

        if (props.contains(Property.FILTER_EXTENSION)) {
            extensions.addAll(props.get(Property.FILTER_EXTENSION, props::asList).stream()
                    .map(ext -> ext.startsWith(".") || ext.isEmpty() ? ext : "." + ext)
                    .collect(Collectors.toSet()));
        }

        if (extensions.isEmpty()) {
            extensions.add("");
        }

        return newInstance(domains,
                relativePath,
                extensions,
                props.get(Property.FILTER_DATE_MAX, props::asTimestamp),
                props.get(Property.FILTER_DATE_MIN, props::asTimestamp),
                // * 1024 as kilobytes to bytes
                props.get(Property.FILTER_SIZE_MAX, props::asLong) * 1024,
                props.get(Property.FILTER_SIZE_MIN, props::asLong) * 1024);
    }

    public static FileFilterConfig newInstance(
            Collection<String> domainContains,
            Collection<String> relativePathContains,
            Collection<String> extensions,
            long maxDate,
            long minDate,
            long maxSize,
            long minSize) {

        if (minDate > maxDate) {
            throw new IllegalArgumentException("Bad min/ max timestamp combination, no files will match");
        }

        if (minSize > maxSize) {
            throw new IllegalArgumentException("Bad min/ max size combination, No files will match");
        }

        return new FileFilterConfig(
                domainContains,
                relativePathContains,
                extensions,
                maxDate,
                minDate,
                maxSize,
                minSize);
    }

    private final Set<String> domainContains;
    private final Set<String> relativePathContains;
    private final Set<String> extensions;
    private final Long maxDate;
    private final Long minDate;
    private final Long maxSize;
    private final Long minSize;

    FileFilterConfig(
            Collection<String> domainContains,
            Collection<String> relativePathContains,
            Collection<String> extensions,
            Long maxDate,
            Long minDate,
            Long maxSize,
            Long minSize) {

        this.domainContains = new HashSet<>(domainContains);
        this.relativePathContains = new HashSet<>(relativePathContains);
        this.extensions = new HashSet<>(extensions);
        this.maxDate = maxDate;
        this.minDate = minDate;
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    public Set<String> domainContains() {
        return new HashSet<>(domainContains);
    }

    public Set<String> relativePathContains() {
        return new HashSet<>(relativePathContains);
    }

    public Set<String> extensions() {
        return new HashSet<>(extensions);
    }

    public long maxDate() {
        return maxDate;
    }

    public long minDate() {
        return minDate;
    }

    public long minSize() {
        return minSize;
    }

    public long maxSize() {
        return maxSize;
    }

    @Override
    public String toString() {
        return "FileFilterConfig{"
                + "domainContains=" + domainContains
                + ", relativePathContains=" + relativePathContains
                + ", extensions=" + extensions
                + ", maxDate=" + maxDate
                + ", minDate=" + minDate
                + ", maxSize=" + maxSize
                + ", minSize=" + minSize
                + '}';
    }
}
