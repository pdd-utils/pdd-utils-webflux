/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011 Oracle and/or its affiliates. All rights reserved.
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

package com.pdd.pop.ext.glassfish.grizzly.utils;

import com.pdd.pop.ext.glassfish.grizzly.AbstractTransformer;
import com.pdd.pop.ext.glassfish.grizzly.Buffer;
import com.pdd.pop.ext.glassfish.grizzly.Grizzly;
import com.pdd.pop.ext.glassfish.grizzly.TransformationException;
import com.pdd.pop.ext.glassfish.grizzly.TransformationResult;
import com.pdd.pop.ext.glassfish.grizzly.attributes.AttributeStorage;
import com.pdd.pop.ext.glassfish.grizzly.filterchain.AbstractCodecFilter;
import com.pdd.pop.ext.glassfish.grizzly.filterchain.FilterChain;
import com.pdd.pop.ext.glassfish.grizzly.memory.Buffers;
import java.util.logging.Logger;


/**
 * The Filter is responsible to break the incoming/outgoing data into chunks and
 * pass them down/up by the {@link FilterChain}.
 * This Filter could be useful for testing reasons to check if all Filters in
 * the {@link FilterChain} work properly with chunked data.
 * 
 * @author Alexey Stashok
 */
public class ChunkingFilter extends AbstractCodecFilter<Buffer, Buffer> {
    private static final Logger LOGGER = Grizzly.logger(ChunkingFilter.class);

    private final int chunkSize;

    /**
     * Construct a <tt>ChunkFilter</tt>, which will break incoming/outgoing data
     * into chunks of the specified size.
     *
     * @param chunkSize the chunk size.
     */
    public ChunkingFilter(int chunkSize) {
        super(new ChunkingDecoder(chunkSize),
                new ChunkingEncoder(chunkSize));
        this.chunkSize = chunkSize;
    }

    public int getChunkSize() {
        return chunkSize;
    }

    public static final class ChunkingDecoder extends ChunkingTransformer {

        public ChunkingDecoder(int chunk) {
            super(chunk);
        }

    }

    public static final class ChunkingEncoder extends ChunkingTransformer {

        public ChunkingEncoder(int chunk) {
            super(chunk);
        }

    }

    public static abstract class ChunkingTransformer
            extends AbstractTransformer<Buffer, Buffer> {
        private final int chunk;

        public ChunkingTransformer(int chunk) {
            this.chunk = chunk;
        }

        @Override
        public String getName() {
            return "ChunkingTransformer";
        }

        @Override
        protected TransformationResult<Buffer, Buffer> transformImpl(
                AttributeStorage storage, Buffer input)
                throws TransformationException {

            if (!input.hasRemaining()) {
                return TransformationResult.createIncompletedResult(input);
            }

            final int chunkSize = Math.min(chunk, input.remaining());

            final int oldInputPos = input.position();
            final int oldInputLimit = input.limit();

            Buffers.setPositionLimit(input, oldInputPos, oldInputPos + chunkSize);
            
            final Buffer output = obtainMemoryManager(storage).allocate(chunkSize);
            output.put(input).flip();

            Buffers.setPositionLimit(input, oldInputPos + chunkSize, oldInputLimit);

            return TransformationResult.createCompletedResult(
                    output, input);
        }

        @Override
        public boolean hasInputRemaining(AttributeStorage storage, Buffer input) {
            return input != null && input.hasRemaining();
        }
    }
}
