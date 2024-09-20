package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKnockOauthExchangeIdentityResponse extends PopBaseHttpResponse {

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
        @JsonProperty("knock_id")
        private String knockId;

        public String getKnockId() {
            return knockId;
        }
    }
}