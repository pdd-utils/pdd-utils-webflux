package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderCustomSuborderQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderCustomSuborderQueryRequest extends PopBaseHttpRequest<PddOrderCustomSuborderQueryResponse> {

    /**
     * 订单号，是订单的唯一标示，用于后端对订单的所有操作唯一键
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 子订单号32位，商家需要用来报关
     */
    @JsonProperty("sub_order_no")
    private String subOrderNo;

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
        return "pdd.order.custom.suborder.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderCustomSuborderQueryResponse> getResponseClass() {
        return PddOrderCustomSuborderQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sub_order_no", subOrderNo);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }
}