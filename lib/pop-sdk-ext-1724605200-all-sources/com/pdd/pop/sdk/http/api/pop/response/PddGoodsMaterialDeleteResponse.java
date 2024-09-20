package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsMaterialDeleteResponse extends PopBaseHttpResponse {

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
     * 返回非0代表删除成功
     */
    @JsonProperty("result")
    private Integer result;

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

    public Integer getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }
}