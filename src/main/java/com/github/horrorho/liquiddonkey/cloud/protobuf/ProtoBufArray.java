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
package com.github.horrorho.liquiddonkey.cloud.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Parser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;

/**
 * ProfoBuf Arrays.
 *
 * iCloud array encoding. 32 bit varint n (denoting array size) followed by n items. 
 *
 * @author ahseya
 */
@Immutable
@ThreadSafe
public final class ProtoBufArray {

    /**
     * Decode custom protobuf variable length array.
     *
     * @param <T> the item type
     * @param data the raw input, not null
     * @param parser the parser to decode each message, not null
     * @return the decoded list of items, not null
     * @throws IOException
     * @throws NullPointerException if any arguments are null
     */
    public static <T> List<T> decode(InputStream data, Parser<T> parser) throws IOException {
        CodedInputStream stream = CodedInputStream.newInstance(data);
        List<T> list = new ArrayList<>();
        while (!stream.isAtEnd()) {
            int size = stream.readRawVarint32();
            byte[] element = stream.readRawBytes(size);
            T decoded = parser.parseFrom(element);
            list.add(decoded);
        }
        return list;
    }

    /**
     * Encode custom protobuf variable length array.
     *
     * @param <T> the item type
     * @param items the list of items, not null
     * @return the encoded list, not null
     * @throws IOException, not null
     * @throws NullPointerException if any arguments are null
     */
    public static <T extends GeneratedMessage> byte[] encode(List<T> items) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        CodedOutputStream stream = CodedOutputStream.newInstance(bytes);
        for (T item : items) {
            byte[] encoded = item.toByteArray();
            stream.writeRawVarint32(encoded.length);
            stream.writeRawBytes(encoded);
        }
        stream.flush();
        return bytes.toByteArray();
    }
}
