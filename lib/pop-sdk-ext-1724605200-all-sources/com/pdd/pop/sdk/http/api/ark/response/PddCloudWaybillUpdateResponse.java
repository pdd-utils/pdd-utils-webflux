package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudWaybillUpdateResponse extends PopBaseHttpResponse {

    /**
     * 响应
     */
    @JsonProperty("pdd_waybill_update_response")
    private PddWaybillUpdateResponse pddWaybillUpdateResponse;

    public PddWaybillUpdateResponse getPddWaybillUpdateResponse() {
        return pddWaybillUpdateResponse;
    }

    public static class PddWaybillUpdateResponse {

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
         * 模板内容
         */
        @JsonProperty("print_data")
        private String printData;

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

        /**
         * 面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public String getPrintData() {
            return printData;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }

        public String getWaybillCode() {
            return waybillCode;
        }
    }
}