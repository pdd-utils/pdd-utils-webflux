package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseOrderInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseOrderInfoRequest extends PopBaseHttpRequest<PddKttPurchaseOrderInfoResponse> {

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
        return "pdd.ktt.purchase.order.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseOrderInfoResponse> getResponseClass() {
        return PddKttPurchaseOrderInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}