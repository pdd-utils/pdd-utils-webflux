package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddKnockSupplierQueryMemberInfoByKnockIdResponse extends PopBaseHttpResponse {

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
         * 是否离职
         */
        @JsonProperty("dismissed")
        private Boolean dismissed;

        /**
         * 加密的uuid
         */
        @JsonProperty("encrypted_uuid")
        private String encryptedUuid;

        /**
         * 职务列表
         */
        @JsonProperty("jobs")
        private List<ResultValueJobsItem> jobs;

        /**
         * knockID
         */
        @JsonProperty("knock_id")
        private String knockId;

        /**
         * 手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        public Boolean getDismissed() {
            return dismissed;
        }

        public String getEncryptedUuid() {
            return encryptedUuid;
        }

        public List<ResultValueJobsItem> getJobs() {
            return jobs;
        }

        public String getKnockId() {
            return knockId;
        }

        public String getMobile() {
            return mobile;
        }
    }

    public static class ResultValueJobsItem {

        /**
         * 加密uuid
         */
        @JsonProperty("encrypted_job_id")
        private String encryptedJobId;

        /**
         * 加密的公司信息
         */
        @JsonProperty("encrypted_supplier_org")
        private ResultValueJobsItemEncryptedSupplierOrg encryptedSupplierOrg;

        /**
         * 职务名
         */
        @JsonProperty("job_nick_name")
        private String jobNickName;

        /**
         * 外键
         */
        @JsonProperty("user_number")
        private String userNumber;

        public String getEncryptedJobId() {
            return encryptedJobId;
        }

        public ResultValueJobsItemEncryptedSupplierOrg getEncryptedSupplierOrg() {
            return encryptedSupplierOrg;
        }

        public String getJobNickName() {
            return jobNickName;
        }

        public String getUserNumber() {
            return userNumber;
        }
    }

    public static class ResultValueJobsItemEncryptedSupplierOrg {

        /**
         * 加密公司编号
         */
        @JsonProperty("encrypted_org_no")
        private String encryptedOrgNo;

        /**
         * 公司名称
         */
        @JsonProperty("org_name")
        private String orgName;

        /**
         * 外部公司key
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