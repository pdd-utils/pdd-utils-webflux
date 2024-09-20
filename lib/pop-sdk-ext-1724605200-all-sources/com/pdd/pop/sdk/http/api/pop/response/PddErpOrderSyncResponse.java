package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddErpOrderSyncResponse extends PopBaseHttpResponse {

    /**
     * 错误代码
     */
    @JsonProperty("error_code")
    private Long errorCode;

    /**
     * 错误参数
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 是否有结果
     */
    @JsonProperty("result")
    private Boolean result;

    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;

    public Long getErrorCode() {
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