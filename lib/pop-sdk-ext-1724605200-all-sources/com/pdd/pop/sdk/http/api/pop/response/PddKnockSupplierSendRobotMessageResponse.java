package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKnockSupplierSendRobotMessageResponse extends PopBaseHttpResponse {

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
        @JsonProperty("fail_encrypt_uuid_list")
        private List<String> failEncryptUuidList;

        public List<String> getFailEncryptUuidList() {
            return failEncryptUuidList;
        }
    }
}