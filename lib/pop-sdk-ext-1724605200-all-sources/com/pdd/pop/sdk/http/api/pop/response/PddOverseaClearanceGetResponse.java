package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOverseaClearanceGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("clearance_response")
    private ClearanceResponse clearanceResponse;

    public ClearanceResponse getClearanceResponse() {
        return clearanceResponse;
    }

    public static class ClearanceResponse {

        /**
         * 身份证姓名
         */
        @JsonProperty("id_card_name")
        private String idCardName;

        /**
         * 身份证号
         */
        @JsonProperty("id_card_no")
        private String idCardNo;

        /**
         * 支付申报订单号
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 支付单号
         */
        @JsonProperty("pay_no")
        private String payNo;

        /**
         * 支付方式，枚举值：WEIXIN,ALIPAY,DUODUOPAY
         */
        @JsonProperty("pay_type")
        private String payType;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public String getIdCardName() {
            return idCardName;
        }

        public String getIdCardNo() {
            return idCardNo;
        }

        public String getInnerTransactionId() {
            return innerTransactionId;
        }

        public String getPayNo() {
            return payNo;
        }

        public String getPayType() {
            return payType;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}