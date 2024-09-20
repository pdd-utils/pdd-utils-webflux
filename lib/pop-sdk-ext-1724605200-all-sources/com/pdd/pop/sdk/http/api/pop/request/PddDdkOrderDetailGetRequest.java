package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOrderDetailGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOrderDetailGetRequest extends PopBaseHttpRequest<PddDdkOrderDetailGetResponse> {

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 订单类型：1-推广订单；2-直播间订单
     */
    @JsonProperty("query_order_type")
    private Integer queryOrderType;

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
        return "pdd.ddk.order.detail.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOrderDetailGetResponse> getResponseClass() {
        return PddDdkOrderDetailGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "query_order_type", queryOrderType);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setQueryOrderType(Integer queryOrderType) {
        this.queryOrderType = queryOrderType;
    }
}