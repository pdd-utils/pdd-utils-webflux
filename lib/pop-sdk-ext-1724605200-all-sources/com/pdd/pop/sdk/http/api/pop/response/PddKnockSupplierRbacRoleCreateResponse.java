package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKnockSupplierRbacRoleCreateResponse extends PopBaseHttpResponse {

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
    @JsonProperty("success")
    private Boolean success;

    /**
     * 
     */
    @JsonProperty("result")
    private Result result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Result getResult() {
        return result;
    }

    public static class Result {

        /**
         * 
         */
        @JsonProperty("roleKey")
        private String roleKey;

        public String getRoleKey() {
            return roleKey;
        }
    }
}