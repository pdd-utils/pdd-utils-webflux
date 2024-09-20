package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudPrinterStatusQueryResponse extends PopBaseHttpResponse {

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
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 信号强度dbm
         */
        @JsonProperty("signal_strength")
        private String signalStrength;

        /**
         * 信号格度0-5,未查询到为null
         */
        @JsonProperty("signal_strength_friendly")
        private Integer signalStrengthFriendly;

        /**
         * 打印机状态 -1:未知  0:未找到打印机  1:不在线  2:在线
         */
        @JsonProperty("status")
        private String status;

        public String getPrinterId() {
            return printerId;
        }

        public String getSignalStrength() {
            return signalStrength;
        }

        public Integer getSignalStrengthFriendly() {
            return signalStrengthFriendly;
        }

        public String getStatus() {
            return status;
        }
    }
}