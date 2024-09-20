package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudWebsessionSendResponse extends PopBaseHttpResponse {

    /**
     * 响应
     */
    @JsonProperty("send_response")
    private SendResponse sendResponse;

    public SendResponse getSendResponse() {
        return sendResponse;
    }

    public static class SendResponse {

        /**
         * 响应列表
         */
        @JsonProperty("res_list")
        private List<SendResponseResListItem> resList;

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        /**
         * 错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 子错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        public List<SendResponseResListItem> getResList() {
            return resList;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public String getSubMsg() {
            return subMsg;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public Integer getErrorCode() {
            return errorCode;
        }
    }

    public static class SendResponseResListItem {

        /**
         * 健名
         */
        @JsonProperty("key")
        private String key;

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        /**
         * 错误异常
         */
        @JsonProperty("error_info")
        private String errorInfo;

        public String getKey() {
            return key;
        }

        public Boolean getSuccess() {
            return success;
        }

        public String getErrorInfo() {
            return errorInfo;
        }
    }
}