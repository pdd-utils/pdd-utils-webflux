package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddMallCpsProtocolStatusQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallCpsProtocolStatusQueryRequest extends PopBaseHttpRequest<PddMallCpsProtocolStatusQueryResponse> {

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
        return "pdd.mall.cps.protocol.status.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallCpsProtocolStatusQueryResponse> getResponseClass() {
        return PddMallCpsProtocolStatusQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}