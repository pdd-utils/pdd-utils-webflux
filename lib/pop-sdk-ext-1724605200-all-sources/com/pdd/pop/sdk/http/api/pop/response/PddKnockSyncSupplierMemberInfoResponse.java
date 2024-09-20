package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddKnockSyncSupplierMemberInfoResponse extends PopBaseHttpResponse {

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
         * 是否离职
         */
        @JsonProperty("dismissed")
        private Boolean dismissed;

        /**
         * 加密人员uuid这个是系统分配的唯一uuid
         */
        @JsonProperty("encrypted_uuid")
        private String encryptedUuid;

        /**
         * 职务
         */
        @JsonProperty("jobs")
        private List<ResultValueResultJobsItem> jobs;

        /**
         * 人员knockId
         */
        @JsonProperty("knock_id")
        private String knockId;

        /**
         * 人员手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        public Boolean getDismissed() {
            return dismissed;
        }

        public String getEncryptedUuid() {
            return encryptedUuid;
        }

        public List<ResultValueResultJobsItem> getJobs() {
            return jobs;
        }

        public String getKnockId() {
            return knockId;
        }

        public String getMobile() {
            return mobile;
        }
    }

    public static class ResultValueResultJobsItem {

        /**
         * 职务id
         */
        @JsonProperty("encrypted_job_id")
        private String encryptedJobId;

        /**
         * 加密的组织信息
         */
        @JsonProperty("encrypted_supplier_org")
        private ResultValueResultJobsItemEncryptedSupplierOrg encryptedSupplierOrg;

        public String getEncryptedJobId() {
            return encryptedJobId;
        }

        public ResultValueResultJobsItemEncryptedSupplierOrg getEncryptedSupplierOrg() {
            return encryptedSupplierOrg;
        }
    }

    public static class ResultValueResultJobsItemEncryptedSupplierOrg {

        /**
         * 加密的组织编号
         */
        @JsonProperty("encrypted_org_no")
        private String encryptedOrgNo;

        /**
         * 组织名称
         */
        @JsonProperty("org_name")
        private String orgName;

        /**
         * 组织编号
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