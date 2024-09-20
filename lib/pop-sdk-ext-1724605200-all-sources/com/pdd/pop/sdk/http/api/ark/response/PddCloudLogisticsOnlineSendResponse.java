package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudLogisticsOnlineSendResponse extends PopBaseHttpResponse {

    /**
     * 发货通知响应对象
     */
    @JsonProperty("logistics_online_send_response")
    private LogisticsOnlineSendResponse logisticsOnlineSendResponse;

    public LogisticsOnlineSendResponse getLogisticsOnlineSendResponse() {
        return logisticsOnlineSendResponse;
    }

    public static class LogisticsOnlineSendResponse {

        /**
         * 子错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        /**
         * 错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }
    }
}