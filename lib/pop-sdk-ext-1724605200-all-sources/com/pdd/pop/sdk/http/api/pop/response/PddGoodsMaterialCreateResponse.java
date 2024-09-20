package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsMaterialCreateResponse extends PopBaseHttpResponse {

    /**
     * 错误码
     */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
     * 错误文案
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 返回素材id
     */
    @JsonProperty("result")
    private Long result;

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

    public Long getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }
}