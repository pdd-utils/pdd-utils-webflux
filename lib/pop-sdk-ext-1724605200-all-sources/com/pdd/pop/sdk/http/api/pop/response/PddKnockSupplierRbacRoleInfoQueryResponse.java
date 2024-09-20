package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddKnockSupplierRbacRoleInfoQueryResponse extends PopBaseHttpResponse {

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
    private Result result;

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

    public Result getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public static class Result {

        /**
         * 
         */
        @JsonProperty("role_key_info_map")
        private Map<String, ResultRoleKeyInfoMapValue> roleKeyInfoMap;

        public Map<String, ResultRoleKeyInfoMapValue> getRoleKeyInfoMap() {
            return roleKeyInfoMap;
        }
    }

    public static class ResultRoleKeyInfoMapValue {

        /**
         * 
         */
        @JsonProperty("bound_role_key")
        private String boundRoleKey;

        /**
         * 
         */
        @JsonProperty("contain_user_numbers")
        private List<String> containUserNumbers;

        /**
         * 
         */
        @JsonProperty("org_number")
        private String orgNumber;

        /**
         * 
         */
        @JsonProperty("role_key")
        private String roleKey;

        public String getBoundRoleKey() {
            return boundRoleKey;
        }

        public List<String> getContainUserNumbers() {
            return containUserNumbers;
        }

        public String getOrgNumber() {
            return orgNumber;
        }

        public String getRoleKey() {
            return roleKey;
        }
    }
}