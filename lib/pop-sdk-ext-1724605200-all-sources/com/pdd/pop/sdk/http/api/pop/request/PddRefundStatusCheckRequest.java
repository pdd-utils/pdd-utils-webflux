package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundStatusCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundStatusCheckRequest extends PopBaseHttpRequest<PddRefundStatusCheckResponse> {

    /**
     * 20150909-452750051,20150909-452750134 用逗号分开
     */
    @JsonProperty("order_sns")
    private String orderSns;

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
        return "pdd.refund.status.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundStatusCheckResponse> getResponseClass() {
        return PddRefundStatusCheckResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sns", orderSns);
    }

    public void setOrderSns(String orderSns) {
        this.orderSns = orderSns;
    }
}