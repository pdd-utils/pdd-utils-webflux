package com.pdd.pop.sdk.http.client;

import com.pdd.pop.sdk.common.constant.Constants;
import com.pdd.pop.sdk.common.constant.PddCharset;
import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.common.logger.PopLogger;
import com.pdd.pop.sdk.common.logger.PopLoggerFactory;
import com.pdd.pop.sdk.common.util.CollectionUtil;
import com.pdd.pop.sdk.common.util.IOSupport;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.common.util.SignUtils;
import com.pdd.pop.sdk.common.util.StringUtils;
import com.pdd.pop.sdk.http.ClientErrorCode;
import com.pdd.pop.sdk.http.FileItem;
import com.pdd.pop.sdk.http.HttpClientConfig;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.ext.apache.http.HttpEntity;
import com.pdd.pop.ext.apache.http.NameValuePair;
import com.pdd.pop.ext.apache.http.client.entity.EntityBuilder;
import com.pdd.pop.ext.apache.http.client.methods.HttpGet;
import com.pdd.pop.ext.apache.http.client.methods.HttpPost;
import com.pdd.pop.ext.apache.http.client.utils.URLEncodedUtils;
import com.pdd.pop.ext.apache.http.entity.ContentType;
import com.pdd.pop.ext.apache.http.entity.mime.MultipartEntityBuilder;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;
import com.pdd.pop.ext.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xuanli
 * @Description: AbstractPopClient
 * @date 2018/12/4 16:57
 */
public abstract class AbstractPopClient extends HttpExecutor implements PopClient {

    protected static final PopLogger logger = PopLoggerFactory.getLogger(AbstractPopClient.class);

    protected String apiServerUrl;

    /**
     * 客户端秘钥
     */
    protected String clientSecret;

    /**
     * 客户端编号
     */
    protected String clientId;

    /**
     * httpClient客户端实例
     */
    protected CloseableHttpClient httpClient;

    /**
     * 获取默认的执行线程池
     *
     * @return
     */
    protected ExecutorService getDefaultExecutorService() {
        HttpClientConfig config = HttpClientConfig.getDefault();
        return new ThreadPoolExecutor(0, config.getMaxParallel(), config.getThreadKeepAliveTime(), TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    /**
     * 同步执行Get请求
     *
     * @param request
     * @param <T>
     * @return
     * @throws Exception
     */
    protected <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncGet(PopBaseHttpRequest<T> request, String accessToken, String url, Class<K> valueType)
            throws Exception {
        StringBuilder sb = new StringBuilder(url).append("?");
        List<NameValuePair> formParams = assemblyNameValuePair(request.getParamsMap(), accessToken);
        if (!CollectionUtil.isEmpty(formParams)) {
            sb.append(URLEncodedUtils.format(formParams, PddCharset.UTF_8));
        }
        HttpGet httpGet = new HttpGet(sb.toString());

        if (!CollectionUtil.isEmpty(request.getHeaders())) {
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                httpGet.setHeader(entry.getKey(), entry.getValue());
            }
        }

        String responseContent = syncExecute(httpClient, httpGet);
        return JsonUtil.transferToObj(responseContent, valueType);

    }

    /**
     * 同步执行Post请求
     *
     * @param request
     * @param <T>
     * @return
     * @throws Exception
     */
    protected <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncPost(PopBaseHttpRequest<T> request, String accessToken, String url, Class<K> valueType)
            throws Exception {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(getEntity(request, accessToken));
        if (!CollectionUtil.isEmpty(request.getHeaders())) {
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                httpPost.setHeader(entry.getKey(), entry.getValue());
            }
        }

        String responseContent = syncExecute(httpClient, httpPost);
        return JsonUtil.transferToObj(responseContent, valueType);

    }

    private <T> HttpEntity getEntity(PopBaseHttpRequest<T> request, String accessToken) {
        List<NameValuePair> formParams = assemblyNameValuePair(request.getParamsMap(), accessToken);
        FileItem fileItem = request.getFileItem();
        if (fileItem != null) {
            // 有文件
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody(fileItem.getFileName(), fileItem.getFile());
            for (NameValuePair pair : formParams) {
                builder.addTextBody(pair.getName(), pair.getValue());
            }
            return builder.build();
        }
        final Map<String, String> requestBody = new HashMap<String, String>();
        for (NameValuePair formParam : formParams) {
            requestBody.put(formParam.getName(), formParam.getValue());
        }
        String json = JsonUtil.transferToJson(requestBody);
        return EntityBuilder.create().setContentType(ContentType.APPLICATION_JSON).setText(json).build();
    }

    /**
     * 组装请求URL
     *
     * @param requestParams
     * @return
     */
    private List<NameValuePair> assemblyNameValuePair(Map<String, String> requestParams, String accessToken) {
        requestParams.put(Constants.CLIENT_ID, clientId);
        if (!StringUtils.isEmpty(accessToken)) {
            requestParams.put(Constants.ACCESS_TOKEN, accessToken);
        }
        // 签名原串
        String signSrc = SignUtils.buildSignSource(requestParams, this.clientSecret);

        // 签名
        String sign = SignUtils.sign(signSrc, Constants.MD5);
        logger.debug(String.format("SIGN_SRC:[%s],SIGN:[%s]", signSrc, sign));

        // 设置签名至请求参数
        requestParams.put(Constants.SIGN, sign);
        List<NameValuePair> formParams = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String> entry : requestParams.entrySet()) {
            formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return formParams;
    }

    /**
     * 销毁连接
     */
    public void destroy() {
        try {
            if (httpClient != null) {
                httpClient.close();
                logger.debug("PopClient destroy success");
            }
        } catch (IOException e) {
            logger.debug("PopClient destroy fail");
            throw new PopClientException(ClientErrorCode.DESTROY_CLIENT_ERROR);
        } finally {
            IOSupport.closeQuietly(httpClient);
        }
    }
}
