package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOverseaDeclarationFailNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOverseaDeclarationFailNotifyRequest extends PopBaseHttpRequest<PddOverseaDeclarationFailNotifyResponse> {

    /**
     * 1-超过购买额度，2-清关异常（如重量超标、退运、扣留等）
     */
    @JsonProperty("fail_reason")
    private Integer failReason;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.oversea.declaration.fail.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOverseaDeclarationFailNotifyResponse> getResponseClass() {
        return PddOverseaDeclarationFailNotifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "fail_reason", failReason);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}