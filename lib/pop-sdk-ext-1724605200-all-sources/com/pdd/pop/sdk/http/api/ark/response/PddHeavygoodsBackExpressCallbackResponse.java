package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddHeavygoodsBackExpressCallbackResponse extends PopBaseHttpResponse {

    /**
     * 1
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
    private Boolean result;

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

    public Boolean getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }
}