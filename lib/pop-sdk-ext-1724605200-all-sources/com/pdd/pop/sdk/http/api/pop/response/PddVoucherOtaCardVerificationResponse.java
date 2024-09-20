package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVoucherOtaCardVerificationResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("voucher_ota_card_verification_response")
    private VoucherOtaCardVerificationResponse voucherOtaCardVerificationResponse;

    public VoucherOtaCardVerificationResponse getVoucherOtaCardVerificationResponse() {
        return voucherOtaCardVerificationResponse;
    }

    public static class VoucherOtaCardVerificationResponse {

        /**
         * 
         */
        @JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("errorMsg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private VoucherOtaCardVerificationResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public VoucherOtaCardVerificationResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class VoucherOtaCardVerificationResponseResult {

        /**
         * 券码
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 店铺编码
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 核销状态（1-未核销，2-已核销， 3-已过期，4-已销毁，99-核销中）
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 门店编码
         */
        @JsonProperty("store_id")
        private Long storeId;

        /**
         * 门店名称
         */
        @JsonProperty("store_name")
        private String storeName;

        /**
         * 核销时间（yyyy-MM-dd HH:mm:ss格式）
         */
        @JsonProperty("verification_time")
        private String verificationTime;

        public String getCardNo() {
            return cardNo;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getStatus() {
            return status;
        }

        public Long getStoreId() {
            return storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public String getVerificationTime() {
            return verificationTime;
        }
    }
}