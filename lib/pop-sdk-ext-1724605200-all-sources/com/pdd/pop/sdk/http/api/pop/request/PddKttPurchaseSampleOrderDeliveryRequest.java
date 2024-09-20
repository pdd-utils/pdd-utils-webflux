package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSampleOrderDeliveryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSampleOrderDeliveryRequest extends PopBaseHttpRequest<PddKttPurchaseSampleOrderDeliveryResponse> {

    /**
     * 请求信息
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
        return "pdd.ktt.purchase.sample.order.delivery";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSampleOrderDeliveryResponse> getResponseClass() {
        return PddKttPurchaseSampleOrderDeliveryResponse.class;
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
         * 物流公司id
         */
        @JsonProperty("logistics_id")
        private Integer logisticsId;

        /**
         * 物流公司名
         */
        @JsonProperty("logistics_name")
        private String logisticsName;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 物流单号
         */
        @JsonProperty("waybill_no")
        private String waybillNo;

        public void setLogisticsId(Integer logisticsId) {
            this.logisticsId = logisticsId;
        }

        public void setLogisticsName(String logisticsName) {
            this.logisticsName = logisticsName;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setWaybillNo(String waybillNo) {
            this.waybillNo = waybillNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}