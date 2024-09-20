package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundExchangeShippingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundExchangeShippingRequest extends PopBaseHttpRequest<PddRefundExchangeShippingResponse> {

    /**
     * request
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.refund.exchange.shipping";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundExchangeShippingResponse> getResponseClass() {
        return PddRefundExchangeShippingResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 售后id
         */
        @JsonProperty("after_sales_id")
        private Long afterSalesId;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 物流公司id
         */
        @JsonProperty("shipping_id")
        private Integer shippingId;

        /**
         * 物流公司名称
         */
        @JsonProperty("shipping_name")
        private String shippingName;

        /**
         * 换货物流单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public void setAfterSalesId(Long afterSalesId) {
            this.afterSalesId = afterSalesId;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setShippingId(Integer shippingId) {
            this.shippingId = shippingId;
        }

        public void setShippingName(String shippingName) {
            this.shippingName = shippingName;
        }

        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}