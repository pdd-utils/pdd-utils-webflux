/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014-2016 Oracle and/or its affiliates. All rights reserved.
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
package com.pdd.pop.ext.glassfish.tyrus.client;


import java.net.URI;

import com.pdd.pop.ext.glassfish.tyrus.client.auth.AuthConfig;
import com.pdd.pop.ext.glassfish.tyrus.client.auth.AuthenticationException;
import com.pdd.pop.ext.glassfish.tyrus.client.auth.Authenticator;
import com.pdd.pop.ext.glassfish.tyrus.client.auth.Credentials;
import com.pdd.pop.ext.glassfish.tyrus.spi.UpgradeResponse;

/**
 * Tyrus client configuration properties.
 *
 * @author Petr Janouch
 */
public final class ClientProperties {

    /**
     * Property usable in {@link ClientManager#getProperties()}.
     * <p>
     * Value must be {@code int} and represents handshake timeout in milliseconds. Default value is 30000 (30 seconds).
     */
    public static final String HANDSHAKE_TIMEOUT = "com.pdd.pop.ext.glassfish.tyrus.client.ClientManager.ContainerTimeout";

    /**
     * Property usable in {@link ClientManager#getProperties()}.
     * <p>
     * Value must be {@link com.pdd.pop.ext.glassfish.tyrus.client.ClientManager.ReconnectHandler} instance.
     *
     * @see ClientProperties#RETRY_AFTER_SERVICE_UNAVAILABLE
     */
    public static final String RECONNECT_HANDLER = "com.pdd.pop.ext.glassfish.tyrus.client.ClientManager.ReconnectHandler";

    /**
     * User property to set proxy URI.
     * <p>
     * Value is expected to be {@link String} and represent proxy URI. Protocol part is currently ignored
     * but must be present ({@link java.net.URI#URI(String)} is used for parsing).
     * <pre>
     *     client.getProperties().put(ClientProperties.PROXY_URI, "http://my.proxy.com:80");
     *     client.connectToServer(...);
     * </pre>
     *
     * @see javax.websocket.ClientEndpointConfig#getUserProperties()
     */
    public static final String PROXY_URI = "com.pdd.pop.ext.glassfish.tyrus.client.proxy";

    /**
     * User property to set additional proxy headers.
     * <p>
     * Value is expected to be {@link java.util.Map}&lt;{@link String}, {@link String}&gt; and represent raw http headers
     * to be added to initial request which is sent to proxy. Key corresponds to header name, value is header
     * value.
     * <p>
     * Sample below demonstrates use of this feature to set preemptive basic proxy authentication:
     * <pre>
     *     final HashMap&lt;String, String&gt; proxyHeaders = new HashMap&lt;String, String&gt;();
     *     proxyHeaders.put("Proxy-Authorization", "Basic " +
     *         Base64Utils.encodeToString("username:password".getBytes(Charset.forName("UTF-8")), false));
     *
     *     client.getProperties().put(ClientProperties.PROXY_HEADERS, proxyHeaders);
     *     client.connectToServer(...);
     * </pre>
     * Please note that these headers will be used only when establishing proxy connection, for modifying
     * WebSocket handshake headers, see
     * {@link javax.websocket.ClientEndpointConfig.Configurator#beforeRequest(java.util.Map)}.
     *
     * @see javax.websocket.ClientEndpointConfig#getUserProperties()
     */
    public static final String PROXY_HEADERS = "com.pdd.pop.ext.glassfish.tyrus.client.proxy.headers";

    /**
     * Property usable in {@link ClientManager#getProperties()} as a key for SSL configuration.
     * <p>
     * Value is expected to be either {@code com.pdd.pop.ext.glassfish.grizzly.ssl.SSLEngineConfigurator} or
     * {@link com.pdd.pop.ext.glassfish.tyrus.client.SslEngineConfigurator} when configuring Grizzly client or only
     * {@link com.pdd.pop.ext.glassfish.tyrus.client.SslEngineConfigurator} when configuring JDK client.
     * <p>
     * The advantage of using {@link com.pdd.pop.ext.glassfish.tyrus.client.SslEngineConfigurator} with Grizzly client is that
     * {@link com.pdd.pop.ext.glassfish.tyrus.client.SslEngineConfigurator} allows configuration of host name verification
     * (which is turned on by default)
     * <p>
     * Example configuration for JDK client:
     * <pre>
     *      SslContextConfigurator sslContextConfigurator = new SslContextConfigurator();
     *      sslContextConfigurator.setTrustStoreFile("...");
     *      sslContextConfigurator.setTrustStorePassword("...");
     *      sslContextConfigurator.setTrustStoreType("...");
     *      sslContextConfigurator.setKeyStoreFile("...");
     *      sslContextConfigurator.setKeyStorePassword("...");
     *      sslContextConfigurator.setKeyStoreType("...");
     *      SslEngineConfigurator sslEngineConfigurator = new SslEngineConfigurator(sslContextConfigurator, true,
     *          false, false);
     *      client.getProperties().put(ClientProperties.SSL_ENGINE_CONFIGURATOR, sslEngineConfigurator);
     * </pre>
     */
    public static final String SSL_ENGINE_CONFIGURATOR = "com.pdd.pop.ext.glassfish.tyrus.client.sslEngineConfigurator";

    /**
     * Property name for maximal incoming buffer size.
     * <p>
     * Can be set in properties map (see {@link
     * com.pdd.pop.ext.glassfish.tyrus.spi.ClientContainer#openClientSocket(javax.websocket.ClientEndpointConfig, java.util.Map,
     * com.pdd.pop.ext.glassfish.tyrus.spi.ClientEngine)}.
     */
    public static final String INCOMING_BUFFER_SIZE = "com.pdd.pop.ext.glassfish.tyrus.incomingBufferSize";

    /**
     * When set to {@code true} (boolean value), client runtime preserves used container and reuses it for outgoing
     * connections.
     * <p>
     * A single thread pool is reused by all clients with this property set to {@code true}.
     * JDK client supports only shared container option, so setting this property has no effect.
     *
     * @see #SHARED_CONTAINER_IDLE_TIMEOUT
     */
    public static final String SHARED_CONTAINER = "com.pdd.pop.ext.glassfish.tyrus.client.sharedContainer";

    /**
     * Container idle timeout in seconds ({@link Integer} value).
     * <p>
     * When the timeout elapses, the shared thread pool will be destroyed.
     *
     * @see #SHARED_CONTAINER
     */
    public static final String SHARED_CONTAINER_IDLE_TIMEOUT = "com.pdd.pop.ext.glassfish.tyrus.client.sharedContainerIdleTimeout";

    /**
     * User property to set worker thread pool configuration.
     * <p>
     * An instance of {@link com.pdd.pop.ext.glassfish.tyrus.client.ThreadPoolConfig} is expected for both JDK
     * and Grizzly client. Instance of {@code com.pdd.pop.ext.glassfish.grizzly.threadpool.ThreadPoolConfig}, can be used
     * for Grizzly client.
     * <p>
     * Sample below demonstrates how to use this property:
     * <pre>
     *     client.getProperties().put(ClientProperties.WORKER_THREAD_POOL_CONFIG, ThreadPoolConfig.defaultConfig());
     * </pre>
     */
    public static final String WORKER_THREAD_POOL_CONFIG = "com.pdd.pop.ext.glassfish.tyrus.client.workerThreadPoolConfig";

    /**
     * Authentication configuration. If no AuthConfig is specified then default configuration will be used,
     * containing both Basic and Digest provided authenticators.
     * <p>
     * Value must be {@link AuthConfig} instance.
     * <p>
     * Sample below demonstrates how to use this property:
     * <pre>
     *     client.getProperties().put(ClientProperties.AUTH_CONFIG, AuthConfig.builder().enableProvidedBasicAuth()
     *     .build());
     * </pre>
     *
     * @see AuthConfig
     * @see AuthConfig.Builder
     * @see Authenticator
     */
    public static final String AUTH_CONFIG = "com.pdd.pop.ext.glassfish.tyrus.client.http.auth.AuthConfig";

    /**
     * Authentication credentials.
     * <p>
     * Value must be {@link Credentials} instance.
     * <p>
     * Provided authenticators (both Basic and Digest) require this property set,
     * otherwise {@link AuthenticationException} will be thrown during a handshake.
     * User defined authenticators may look up credentials in another sources.
     * <p>
     * Sample below demonstrates how to use this property:
     * <pre>
     *     client.getProperties().put(ClientProperties.CREDENTIALS, new Credentials("websocket_user", "password");
     * </pre>
     *
     * @see Credentials
     * @see AuthConfig
     * @see Authenticator
     */
    public static final String CREDENTIALS = "com.pdd.pop.ext.glassfish.tyrus.client.http.auth.Credentials";

    /**
     * HTTP Redirect support.
     * <p>
     * Value is expected to be {@code boolean}. Default value is {@code false}.
     * <p>
     * When set to {@code true} and one of the following redirection HTTP response status code (3xx) is received during
     * a handshake, client will attempt to connect to the {@link URI} contained in {@value UpgradeResponse#LOCATION}
     * header from handshake response. Number of redirection is limited by property {@link #REDIRECT_THRESHOLD}
     * (integer value), while default value is {@value TyrusClientEngine#DEFAULT_REDIRECT_THRESHOLD}.
     * <p>
     * List of supported HTTP status codes:
     * <ul>
     * <li>{@code 300 - Multiple Choices}</li>
     * <li>{@code 301 - Moved permanently}</li>
     * <li>{@code 302 - Found}</li>
     * <li>{@code 303 - See Other (since HTTP/1.1)}</li>
     * <li>{@code 307 - Temporary Redirect (since HTTP/1.1)}</li>
     * <li>{@code 308 - Permanent Redirect (Experimental RFC; RFC 7238)}</li>
     * </ul>
     *
     * @see #REDIRECT_THRESHOLD
     */
    public static final String REDIRECT_ENABLED = "com.pdd.pop.ext.glassfish.tyrus.client.http.redirect";

    /**
     * The maximal number of redirects during single handshake.
     * <p>
     * Value is expected to be positive {@link Integer}. Default value is {@value
     * TyrusClientEngine#DEFAULT_REDIRECT_THRESHOLD}.
     * <p>
     * HTTP redirection must be enabled by property {@link #REDIRECT_ENABLED}, otherwise {@code REDIRECT_THRESHOLD} is
     * not applied.
     *
     * @see #REDIRECT_ENABLED
     * @see RedirectException
     */
    public static final String REDIRECT_THRESHOLD = "com.pdd.pop.ext.glassfish.tyrus.client.http.redirect.threshold";

    /**
     * HTTP Service Unavailable - {@value UpgradeResponse#RETRY_AFTER} reconnect support.
     * <p>
     * Value is expected to be {@code boolean}. Default value is {@code false}.
     * <p>
     * When set to {@code true} and HTTP response code {@code 503 - Service Unavailable} is received, client will
     * attempt to reconnect after delay specified in {@value UpgradeResponse#RETRY_AFTER} header from handshake
     * response. According to RFC 2616 the value must be decimal integer (representing delay in seconds) or {@code
     * http-date}.
     * <p>
     * Tyrus client will try to reconnect after this delay if:
     * <ul>
     * <li>{@value UpgradeResponse#RETRY_AFTER} header is present and is not empty</li>
     * <li>{@value UpgradeResponse#RETRY_AFTER} header can be parsed</li>
     * <li>number of reconnection attempts does not exceed 5</li>
     * <li>delay is not longer then 300 seconds</li>
     * </ul>
     *
     * @see RetryAfterException
     * @see ClientProperties#RECONNECT_HANDLER
     * @see ClientManager.ReconnectHandler
     * @see ClientManager.ReconnectHandler#onConnectFailure(Exception)
     */
    public static final String RETRY_AFTER_SERVICE_UNAVAILABLE = "com.pdd.pop.ext.glassfish.tyrus.client.http.retryAfter";

    /**
     * User property to configure logging of HTTP upgrade messages.
     * <p>
     * Value is expected to be {@code boolean}. Default value is {@code false}.
     * <p>
     * When set to {@code true} upgrade request and response messages will be logged regardless of the logging
     * level configuration. When the logging is configured to {@link java.util.logging.Level#FINE} or lower,
     * this setting will have no effect as at this level HTTP upgrade messages will be logged anyway.
     */
    public static final String LOG_HTTP_UPGRADE = "com.pdd.pop.ext.glassfish.tyrus.client.http.logUpgrade";

    /**
     * Property name for registering a custom masking key generator. The expected value is an instance of
     * {@link com.pdd.pop.ext.glassfish.tyrus.core.MaskingKeyGenerator}.
     * <p>
     * As a security measure, all frames originating on websocket client have to be masked with random 4B value, which
     * should be freshly generated for each frame. Moreover to fully comply with the security requirements of RFC 6455,
     * a masking key of a frame must not be predictable from masking keys of previous frames and therefore Tyrus uses
     * {@link java.security.SecureRandom} as a default masking key generator. While this is perfectly OK for most Tyrus
     * client use cases, usage of {@link java.security.SecureRandom} might prove to be a performance issue,
     * when the client is used for instance for highly parallel stress testing as {@link java.security.SecureRandom}
     * uses a synchronized singleton as a random entropy provider in its internals.
     * <p>
     * This property allows replacing the default {@link java.security.SecureRandom} with a more scalable provider
     * of masking keys.
     */
    public static final String MASKING_KEY_GENERATOR = "com.pdd.pop.ext.glassfish.tyrus.client.maskingKeyGenerator";
}
