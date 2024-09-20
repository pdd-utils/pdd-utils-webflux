/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2010-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.pdd.pop.ext.glassfish.grizzly.http;

import com.pdd.pop.ext.glassfish.grizzly.ThreadCache;

/**
 *
 * @author Alexey Stashok
 */
class HttpRequestPacketImpl extends HttpRequestPacket {
    private static final ThreadCache.CachedTypeIndex<HttpRequestPacketImpl> CACHE_IDX =
            ThreadCache.obtainIndex(HttpRequestPacketImpl.class, 16);

    public static HttpRequestPacketImpl create() {
        final HttpRequestPacketImpl httpRequestImpl =
                ThreadCache.takeFromCache(CACHE_IDX);
        if (httpRequestImpl != null) {
            return httpRequestImpl;
        }

        return new HttpRequestPacketImpl() {
            @Override
            public void recycle() {
                super.recycle();
                ThreadCache.putToCache(CACHE_IDX, this);
            }
        };
    }

    private final ProcessingState processingState;

    protected HttpRequestPacketImpl() {
        this.processingState = new ProcessingState();
        isExpectContent = true;
    }

    @Override
    public ProcessingState getProcessingState() {
        return processingState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void reset() {
//        headerParsingState.recycle();
//        contentParsingState.recycle();
        processingState.recycle();
//        isHeaderParsed = false;
        isExpectContent = true;
        super.reset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void recycle() {
        if (isExpectContent()) {
            return;
        }
        reset();
//        ThreadCache.putToCache(CACHE_IDX, this);
    }
}
