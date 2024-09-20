package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenLogisticsPreCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOpenLogisticsPreCheckRequest extends PopBaseHttpRequest<PddOpenLogisticsPreCheckResponse> {

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 快递公司编号
     */
    @JsonProperty("ship_code")
    private String shipCode;

    /**
     * 快递单号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

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
        return "pdd.open.logistics.pre.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenLogisticsPreCheckResponse> getResponseClass() {
        return PddOpenLogisticsPreCheckResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "ship_code", shipCode);
        setUserParam(params, "tracking_number", trackingNumber);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}