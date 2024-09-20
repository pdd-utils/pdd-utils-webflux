package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkUrlShortParseResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkUrlShortParseRequest extends PopBaseHttpRequest<PddDdkUrlShortParseResponse> {

    /**
     * 需要解析出长链的多多进宝短连接，仅支持短链接（即为pdd.ddk.goods.promotion.url.generate接口生成的短链）
     */
    @JsonProperty("original_url")
    private String originalUrl;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.ddk.url.short.parse";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkUrlShortParseResponse> getResponseClass() {
        return PddDdkUrlShortParseResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "original_url", originalUrl);
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}