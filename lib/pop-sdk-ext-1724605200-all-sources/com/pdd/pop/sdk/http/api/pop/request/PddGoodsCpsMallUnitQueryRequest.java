package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCpsMallUnitQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCpsMallUnitQueryRequest extends PopBaseHttpRequest<PddGoodsCpsMallUnitQueryResponse> {

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
        return "pdd.goods.cps.mall.unit.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCpsMallUnitQueryResponse> getResponseClass() {
        return PddGoodsCpsMallUnitQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}