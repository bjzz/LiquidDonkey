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
package com.github.horrorho.liquiddonkey.cloud.data;

import com.dd.plist.NSDictionary;
import com.github.horrorho.liquiddonkey.cloud.client.AuthClient;
import static com.github.horrorho.liquiddonkey.cloud.data.PropertyLists.get;
import static com.github.horrorho.liquiddonkey.cloud.data.PropertyLists.parse;
import static com.github.horrorho.liquiddonkey.cloud.data.PropertyLists.string;
import com.github.horrorho.liquiddonkey.exception.BadDataException;
import java.io.IOException;
import java.util.Objects;
import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Auth.
 *
 * @author Ahseya
 */
@Immutable
@ThreadSafe
public final class Auth {

    public static Auth from(Auth auth, String mmeAuthToken) {
        return from(auth.dsPrsID, mmeAuthToken);
    }

    public static Auth from(String dsPrsID, String mmeAuthToken) {
        logger.trace("<< from() < dsPrsID: {} mmeAuthToken: {}", dsPrsID, mmeAuthToken);

        Auth auth = new Auth(dsPrsID, mmeAuthToken);

        logger.trace(">> from > auth: {}", auth);
        return auth;
    }

    public static Auth from(HttpClient client, String id, String password) throws BadDataException, IOException {
        logger.trace("<< from() < id: {} password: {}", id, password);

        byte[] data = authClient.get(client, id, password);

        NSDictionary authentication = parse(data);
        logger.debug("-- from() > authentication: {}", authentication.toASCIIPropertyList());
        
        NSDictionary appleAccountInfo = get(authentication, "appleAccountInfo");
        String dsPrsID = string(appleAccountInfo, "dsPrsID");

        NSDictionary tokens = get(authentication, "tokens");
        String mmeAuthToken = string(tokens, "mmeAuthToken");
        
        logger.debug("-- from() >  dsPrsID: {}", dsPrsID);
        logger.debug("-- from() >   mmeAuthToken: {}", mmeAuthToken);

        Auth auth = new Auth(dsPrsID, mmeAuthToken);

        logger.trace(">> from > auth: {}", auth);
        return auth;
    }

    private static final Logger logger = LoggerFactory.getLogger(Auth.class);

    private static final AuthClient authClient = AuthClient.create();

    private final String dsPrsID;
    private final String mmeAuthToken;

    Auth(String dsPrsId, String mmeAuthToken) {
        this.dsPrsID = Objects.requireNonNull(dsPrsId);
        this.mmeAuthToken = Objects.requireNonNull(mmeAuthToken);
    }

    public final String dsPrsID() {
        return dsPrsID;
    }

    public final String mmeAuthToken() {
        return mmeAuthToken;
    }

    @Override
    public String toString() {
        return "Auth{" + "dsPrsID=" + dsPrsID + ", mmeAuthToken=" + mmeAuthToken + '}';
    }
}
