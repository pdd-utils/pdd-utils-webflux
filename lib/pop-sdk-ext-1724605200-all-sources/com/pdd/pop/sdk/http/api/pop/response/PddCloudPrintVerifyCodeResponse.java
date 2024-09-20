package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudPrintVerifyCodeResponse extends PopBaseHttpResponse {

    /**
     * 云打印验证码响应
     */
    @JsonProperty("cloud_print_verify_code_response")
    private CloudPrintVerifyCodeResponse cloudPrintVerifyCodeResponse;

    public CloudPrintVerifyCodeResponse getCloudPrintVerifyCodeResponse() {
        return cloudPrintVerifyCodeResponse;
    }

    public static class CloudPrintVerifyCodeResponse {

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 响应结果
         */
        @JsonProperty("result")
        private CloudPrintVerifyCodeResponseResult result;

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public CloudPrintVerifyCodeResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class CloudPrintVerifyCodeResponseResult {

        /**
         * true:请求验证码成功 false:请求验证码失败
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}