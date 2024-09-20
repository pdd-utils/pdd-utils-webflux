package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudPrinterSettingResponse extends PopBaseHttpResponse {

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
         * 打印机设置修改结果
         */
        @JsonProperty("cloud_printer_setting_result")
        private Boolean cloudPrinterSettingResult;

        public Boolean getCloudPrinterSettingResult() {
            return cloudPrinterSettingResult;
        }
    }
}