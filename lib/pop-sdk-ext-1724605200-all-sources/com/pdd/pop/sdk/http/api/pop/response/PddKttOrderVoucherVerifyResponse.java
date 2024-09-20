package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttOrderVoucherVerifyResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

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

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 
         */
        @JsonProperty("refund_times")
        private Integer refundTimes;

        /**
         * 
         */
        @JsonProperty("total_verification_times")
        private Integer totalVerificationTimes;

        /**
         * 
         */
        @JsonProperty("verified_times")
        private Integer verifiedTimes;

        public Integer getRefundTimes() {
            return refundTimes;
        }

        public Integer getTotalVerificationTimes() {
            return totalVerificationTimes;
        }

        public Integer getVerifiedTimes() {
            return verifiedTimes;
        }
    }
}