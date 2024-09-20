package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOpenMsgServiceSendMsgResponse extends PopBaseHttpResponse {

    /**
     * 状态码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 状态原因
     */
    @JsonProperty("message")
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}