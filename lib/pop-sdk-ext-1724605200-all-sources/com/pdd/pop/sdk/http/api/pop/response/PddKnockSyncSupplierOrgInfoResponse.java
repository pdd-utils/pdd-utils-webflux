package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;


import java.util.Map;


public class PddKnockSyncSupplierOrgInfoResponse extends PopBaseHttpResponse {

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
     * 结果
     */
    @JsonProperty("result")
    private Map<String, ResultValue> result;

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

    public Map<String, ResultValue> getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public static class ResultValue {

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
         * 结果
         */
        @JsonProperty("result")
        private ResultValueResult result;

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

        public ResultValueResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResultValueResult {

        /**
         * 加密组织编号，系统分配的唯一组织编号
         */
        @JsonProperty("encrypted_org_no")
        private String encryptedOrgNo;

        /**
         * 组织名称
         */
        @JsonProperty("org_name")
        private String orgName;

        /**
         * 传入的组织编号
         */
        @JsonProperty("org_number")
        private String orgNumber;

        public String getEncryptedOrgNo() {
            return encryptedOrgNo;
        }

        public String getOrgName() {
            return orgName;
        }

        public String getOrgNumber() {
            return orgNumber;
        }
    }
}