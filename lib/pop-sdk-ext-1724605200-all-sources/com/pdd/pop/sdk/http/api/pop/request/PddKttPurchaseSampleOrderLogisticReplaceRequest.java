package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSampleOrderLogisticReplaceResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSampleOrderLogisticReplaceRequest extends PopBaseHttpRequest<PddKttPurchaseSampleOrderLogisticReplaceResponse> {

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
        return "pdd.ktt.purchase.sample.order.logistic.replace";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSampleOrderLogisticReplaceResponse> getResponseClass() {
        return PddKttPurchaseSampleOrderLogisticReplaceResponse.class;
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
         * 新物流公司id（与物流公司名两者至少填一）
         */
        @JsonProperty("new_logistics_id")
        private Integer newLogisticsId;

        /**
         * 新物流公司名（与物流公司id两者至少填一）
         */
        @JsonProperty("new_logistics_name")
        private String newLogisticsName;

        /**
         * 新运单号
         */
        @JsonProperty("new_waybill_no")
        private String newWaybillNo;

        /**
         * 旧运单号
         */
        @JsonProperty("old_waybill_no")
        private String oldWaybillNo;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public void setNewLogisticsId(Integer newLogisticsId) {
            this.newLogisticsId = newLogisticsId;
        }

        public void setNewLogisticsName(String newLogisticsName) {
            this.newLogisticsName = newLogisticsName;
        }

        public void setNewWaybillNo(String newWaybillNo) {
            this.newWaybillNo = newWaybillNo;
        }

        public void setOldWaybillNo(String oldWaybillNo) {
            this.oldWaybillNo = oldWaybillNo;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}