package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundAgreeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundAgreeRequest extends PopBaseHttpRequest<PddRefundAgreeResponse> {

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
        return "pdd.refund.agree";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundAgreeResponse> getResponseClass() {
        return PddRefundAgreeResponse.class;
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
         * 退款备注，商家留言
         */
        @JsonProperty("operate_desc")
        private String operateDesc;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public void setAfterSalesId(Long afterSalesId) {
            this.afterSalesId = afterSalesId;
        }

        public void setOperateDesc(String operateDesc) {
            this.operateDesc = operateDesc;
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