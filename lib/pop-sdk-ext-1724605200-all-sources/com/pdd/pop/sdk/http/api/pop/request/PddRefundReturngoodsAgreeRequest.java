package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundReturngoodsAgreeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundReturngoodsAgreeRequest extends PopBaseHttpRequest<PddRefundReturngoodsAgreeResponse> {

    /**
     * 请求入参
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
        return "pdd.refund.returngoods.agree";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundReturngoodsAgreeResponse> getResponseClass() {
        return PddRefundReturngoodsAgreeResponse.class;
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
         * 给用户留言
         */
        @JsonProperty("operate_desc")
        private String operateDesc;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 退货地址列表中已有的退货地址id
         */
        @JsonProperty("return_address_id")
        private String returnAddressId;

        public void setAfterSalesId(Long afterSalesId) {
            this.afterSalesId = afterSalesId;
        }

        public void setOperateDesc(String operateDesc) {
            this.operateDesc = operateDesc;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setReturnAddressId(String returnAddressId) {
            this.returnAddressId = returnAddressId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}