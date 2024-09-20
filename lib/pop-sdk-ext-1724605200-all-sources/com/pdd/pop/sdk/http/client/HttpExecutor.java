package com.pdd.pop.sdk.http.client;

import com.pdd.pop.sdk.common.constant.PddCharset;
import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.common.logger.PopLogger;
import com.pdd.pop.sdk.common.logger.PopLoggerFactory;
import com.pdd.pop.sdk.common.util.IOSupport;
import com.pdd.pop.sdk.http.ClientErrorCode;
import com.pdd.pop.ext.apache.http.Header;
import com.pdd.pop.ext.apache.http.HttpEntity;
import com.pdd.pop.ext.apache.http.client.methods.CloseableHttpResponse;
import com.pdd.pop.ext.apache.http.client.methods.HttpPost;
import com.pdd.pop.ext.apache.http.client.methods.HttpUriRequest;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;
import com.pdd.pop.ext.apache.http.util.EntityUtils;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/4 19:08
 */
public class HttpExecutor {
    
    protected static final PopLogger logger = PopLoggerFactory.getLogger(HttpExecutor.class);
    
    /**
     * 执行请求
     *
     * @param httpUriRequest
     * @return
     * @throws Exception
     */
    protected String syncExecute(CloseableHttpClient httpClient, HttpUriRequest httpUriRequest) throws Exception {
        CloseableHttpResponse httpResponse = null;
        try {
            httpUriRequest.setHeader("Pdd-Sdk-Version","0.0.6");
            httpUriRequest.setHeader("Pdd-Sdk-Type","JAVA");

            httpResponse = httpClient.execute(httpUriRequest);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (!isSuccess(statusCode)) {
                String requestBody = "";
                if (httpUriRequest instanceof HttpPost) {
                    requestBody = EntityUtils.toString(((HttpPost) httpUriRequest).getEntity(), PddCharset.UTF_8);
                }
                logger.error(String.format("ERROR ! URL : %s ; Header: %s ; requestBody: %s", httpUriRequest.getURI(), printHeader(httpUriRequest.getAllHeaders()), requestBody));
                HttpEntity entity = httpResponse.getEntity();
                if (null != entity) {
                    String responseContent = EntityUtils.toString(entity, PddCharset.UTF_8);
                    logger.error(String.format("ERROR responseContent :\n %s ", responseContent));
                }
                throw new PopClientException(ClientErrorCode.HTTP_STATUS_FAIL);
            }
            HttpEntity entity = httpResponse.getEntity();
            String responseContent = EntityUtils.toString(entity, PddCharset.UTF_8);
            EntityUtils.consume(entity);
            return responseContent;
        } finally {
            IOSupport.closeQuietly(httpResponse);
        }
    }

    private String printHeader(Header[] headers) {
        StringBuilder stringBuffer = new StringBuilder("[");
        if (headers != null) {
            for (Header header : headers) {
                stringBuffer.append(header.getName()).append(":").append(header.getValue()).append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
    
    /**
     * 响应是否成功
     *
     * @param statusCode
     * @return
     */
    private boolean isSuccess(int statusCode) {
        return (200 <= statusCode && statusCode < 300);
    }

}
