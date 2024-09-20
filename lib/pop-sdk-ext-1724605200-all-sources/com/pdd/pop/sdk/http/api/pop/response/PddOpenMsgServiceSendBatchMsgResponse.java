package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOpenMsgServiceSendBatchMsgResponse extends PopBaseHttpResponse {

    /**
     * 回执id
     */
    @JsonProperty("biz_id")
    private String bizId;

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

    public String getBizId() {
        return bizId;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}