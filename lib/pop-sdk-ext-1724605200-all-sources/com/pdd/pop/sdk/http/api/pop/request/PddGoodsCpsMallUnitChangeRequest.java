package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCpsMallUnitChangeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCpsMallUnitChangeRequest extends PopBaseHttpRequest<PddGoodsCpsMallUnitChangeResponse> {

    /**
     * 全店推广计划佣金比（千分比）
     */
    @JsonProperty("rate")
    private Integer rate;

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
        return "pdd.goods.cps.mall.unit.change";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCpsMallUnitChangeResponse> getResponseClass() {
        return PddGoodsCpsMallUnitChangeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "rate", rate);
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}