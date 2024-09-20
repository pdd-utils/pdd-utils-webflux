package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSampleOrderInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSampleOrderInfoRequest extends PopBaseHttpRequest<PddKttPurchaseSampleOrderInfoResponse> {

    /**
     * 请求参数
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
        return "pdd.ktt.purchase.sample.order.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSampleOrderInfoResponse> getResponseClass() {
        return PddKttPurchaseSampleOrderInfoResponse.class;
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
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}