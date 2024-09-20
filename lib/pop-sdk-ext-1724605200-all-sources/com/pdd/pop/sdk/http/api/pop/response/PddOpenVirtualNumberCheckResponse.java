package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOpenVirtualNumberCheckResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("open_virtual_number_check_response")
    private OpenVirtualNumberCheckResponse openVirtualNumberCheckResponse;

    public OpenVirtualNumberCheckResponse getOpenVirtualNumberCheckResponse() {
        return openVirtualNumberCheckResponse;
    }

    public static class OpenVirtualNumberCheckResponse {

        /**
         * 
         */
        @JsonProperty("result")
        private OpenVirtualNumberCheckResponseResult result;

        public OpenVirtualNumberCheckResponseResult getResult() {
            return result;
        }
    }

    public static class OpenVirtualNumberCheckResponseResult {

        /**
         * 虚拟号绑定的时间戳
         */
        @JsonProperty("bind_timestamp")
        private Long bindTimestamp;

        /**
         * 错误码, 0:成功
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 是否订单所绑定的虚拟号，true是，false否
         */
        @JsonProperty("match")
        private Boolean match;

        /**
         * 11位入参号码是否是虚拟号
         */
        @JsonProperty("virtual")
        private Boolean virtual;

        public Long getBindTimestamp() {
            return bindTimestamp;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getMatch() {
            return match;
        }

        public Boolean getVirtual() {
            return virtual;
        }
    }
}