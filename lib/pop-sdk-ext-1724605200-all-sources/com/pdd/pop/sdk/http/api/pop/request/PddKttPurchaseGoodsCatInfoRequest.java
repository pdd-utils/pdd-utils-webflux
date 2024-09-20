package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseGoodsCatInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseGoodsCatInfoRequest extends PopBaseHttpRequest<PddKttPurchaseGoodsCatInfoResponse> {

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
        return "pdd.ktt.purchase.goods.cat.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseGoodsCatInfoResponse> getResponseClass() {
        return PddKttPurchaseGoodsCatInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}