package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddServicemarketContractSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddServicemarketContractSearchRequest extends PopBaseHttpRequest<PddServicemarketContractSearchResponse> {

    /**
     * 买家店铺id
     */
    @JsonProperty("mallId")
    private Long mallId;

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
        return "pdd.servicemarket.contract.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServicemarketContractSearchResponse> getResponseClass() {
        return PddServicemarketContractSearchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "mallId", mallId);
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
}