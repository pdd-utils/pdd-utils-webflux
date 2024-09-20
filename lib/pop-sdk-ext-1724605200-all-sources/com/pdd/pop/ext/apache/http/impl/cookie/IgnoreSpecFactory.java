/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package com.pdd.pop.ext.apache.http.impl.cookie;

import com.pdd.pop.ext.apache.http.annotation.Contract;
import com.pdd.pop.ext.apache.http.annotation.ThreadingBehavior;
import com.pdd.pop.ext.apache.http.cookie.CookieSpec;
import com.pdd.pop.ext.apache.http.cookie.CookieSpecFactory;
import com.pdd.pop.ext.apache.http.cookie.CookieSpecProvider;
import com.pdd.pop.ext.apache.http.params.HttpParams;
import com.pdd.pop.ext.apache.http.protocol.HttpContext;

/**
 * {@link CookieSpecProvider} implementation that ignores all cookies.
 *
 * @deprecated (4.4) Use {@link com.pdd.pop.ext.apache.http.impl.cookie.IgnoreSpecProvider}.
 *
 * @since 4.1
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class IgnoreSpecFactory implements CookieSpecFactory, CookieSpecProvider {

    public IgnoreSpecFactory() {
        super();
    }

    @Override
    public CookieSpec newInstance(final HttpParams params) {
        return new IgnoreSpec();
    }

    @Override
    public CookieSpec create(final HttpContext context) {
        return new IgnoreSpec();
    }

}
