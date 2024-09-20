package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddVasMultimallAddResponse extends PopBaseHttpResponse {

    /**
     * 错误列表
     */
    @JsonProperty("error_list")
    private List<ErrorListItem> errorList;

    public List<ErrorListItem> getErrorList() {
        return errorList;
    }

    public static class ErrorListItem {

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private String errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 错误mall_id列表
         */
        @JsonProperty("mall_ids")
        private List<Long> mallIds;

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public List<Long> getMallIds() {
            return mallIds;
        }
    }
}