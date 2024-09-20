package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddLogisticsFulfillmentSendResponse extends PopBaseHttpResponse {

    /**
     * 发货响应对象
     */
    @JsonProperty("logistics_send_response")
    private LogisticsSendResponse logisticsSendResponse;

    public LogisticsSendResponse getLogisticsSendResponse() {
        return logisticsSendResponse;
    }

    public static class LogisticsSendResponse {

        /**
         * 发货失败信息（发货失败时有值）
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}