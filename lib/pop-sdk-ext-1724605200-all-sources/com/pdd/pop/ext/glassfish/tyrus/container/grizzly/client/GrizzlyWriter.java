/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012-2016 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
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
package com.pdd.pop.ext.glassfish.tyrus.container.grizzly.client;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.pdd.pop.ext.glassfish.tyrus.spi.CompletionHandler;
import com.pdd.pop.ext.glassfish.tyrus.spi.Writer;

import com.pdd.pop.ext.glassfish.grizzly.Buffer;
import com.pdd.pop.ext.glassfish.grizzly.Connection;
import com.pdd.pop.ext.glassfish.grizzly.EmptyCompletionHandler;
import com.pdd.pop.ext.glassfish.grizzly.WriteHandler;
import com.pdd.pop.ext.glassfish.grizzly.memory.Buffers;

import static com.pdd.pop.ext.glassfish.tyrus.container.grizzly.client.TaskProcessor.Task;

/**
 * @author Pavel Bucek (pavel.bucek at oracle.com)
 */
public class GrizzlyWriter extends Writer {

    private final TaskProcessor taskProcessor;
    final com.pdd.pop.ext.glassfish.grizzly.Connection connection;

    public GrizzlyWriter(final com.pdd.pop.ext.glassfish.grizzly.Connection connection) {
        this.connection = connection;
        this.connection.configureBlocking(false);
        this.taskProcessor = new TaskProcessor(new WriterCondition());
    }

    @Override
    public void write(final ByteBuffer buffer, final CompletionHandler<ByteBuffer> completionHandler) {
        if (!connection.isOpen()) {
            completionHandler.failed(new IllegalStateException("Connection is not open."));
            return;
        }

        final Buffer message = Buffers.wrap(connection.getTransport().getMemoryManager(), buffer);

        final EmptyCompletionHandler emptyCompletionHandler = new EmptyCompletionHandler() {
            @Override
            public void cancelled() {
                if (completionHandler != null) {
                    completionHandler.cancelled();
                }
            }

            @Override
            public void completed(Object result) {
                if (completionHandler != null) {
                    completionHandler.completed(buffer);
                }
            }

            @Override
            public void failed(Throwable throwable) {
                if (completionHandler != null) {
                    completionHandler.failed(throwable);
                }
            }
        };

        taskProcessor.processTask(new WriteTask(connection, message, emptyCompletionHandler));
    }

    private class WriterCondition implements TaskProcessor.Condition {

        private final AtomicBoolean writeHandlerRegistered = new AtomicBoolean(false);

        @Override
        public boolean isValid() {
            if (!connection.canWrite() && writeHandlerRegistered.compareAndSet(false, true)) {
                connection.notifyCanWrite(new WriteHandler() {
                    @Override
                    public void onWritePossible() throws Exception {
                        writeHandlerRegistered.set(false);
                        taskProcessor.processTask();
                    }

                    @Override
                    public void onError(Throwable t) {
                        writeHandlerRegistered.set(false);
                        Logger.getLogger(GrizzlyWriter.class.getName()).log(Level.WARNING, t.getMessage(), t);
                        // TODO: do what?
                    }
                });

                return false;
            }

            return true;
        }
    }

    @Override
    public void close() {
        taskProcessor.processTask(new CloseTask(connection));
    }

    @Override
    public int hashCode() {
        return connection.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GrizzlyWriter && connection.equals(((GrizzlyWriter) obj).connection);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + connection.toString() + " " + connection.hashCode();
    }

    private class WriteTask extends Task {
        private final Connection connection;
        private final Buffer message;
        private final EmptyCompletionHandler completionHandler;

        private WriteTask(Connection connection, Buffer message, EmptyCompletionHandler completionHandler) {
            this.connection = connection;
            this.message = message;
            this.completionHandler = completionHandler;
        }

        @Override
        public void execute() {
            //noinspection unchecked
            connection.write(message, completionHandler);
        }
    }

    private class CloseTask extends Task {
        private final Connection connection;

        private CloseTask(Connection connection) {
            this.connection = connection;
        }

        @Override
        public void execute() {
            connection.closeSilently();
        }
    }
}
