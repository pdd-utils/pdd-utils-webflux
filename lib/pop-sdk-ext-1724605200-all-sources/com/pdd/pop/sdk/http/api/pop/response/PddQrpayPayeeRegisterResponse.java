package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddQrpayPayeeRegisterResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("qrpay_payee_register_response")
    private QrpayPayeeRegisterResponse qrpayPayeeRegisterResponse;

    public QrpayPayeeRegisterResponse getQrpayPayeeRegisterResponse() {
        return qrpayPayeeRegisterResponse;
    }

    public static class QrpayPayeeRegisterResponse {

        /**
         * 参数注册结果
         */
        @JsonProperty("payee_result_list")
        private List<QrpayPayeeRegisterResponsePayeeResultListItem> payeeResultList;

        public List<QrpayPayeeRegisterResponsePayeeResultListItem> getPayeeResultList() {
            return payeeResultList;
        }
    }

    public static class QrpayPayeeRegisterResponsePayeeResultListItem {

        /**
         * 参数名
         */
        @JsonProperty("payee")
        private String payee;

        /**
         * 参数id
         */
        @JsonProperty("payee_id")
        private Long payeeId;

        /**
         * 交易二维码图片UR
         */
        @JsonProperty("qr_image_url")
        private String qrImageUrl;

        /**
         * 交易二维码页面URL
         */
        @JsonProperty("qr_pay_page_url")
        private String qrPayPageUrl;

        public String getPayee() {
            return payee;
        }

        public Long getPayeeId() {
            return payeeId;
        }

        public String getQrImageUrl() {
            return qrImageUrl;
        }

        public String getQrPayPageUrl() {
            return qrPayPageUrl;
        }
    }
}