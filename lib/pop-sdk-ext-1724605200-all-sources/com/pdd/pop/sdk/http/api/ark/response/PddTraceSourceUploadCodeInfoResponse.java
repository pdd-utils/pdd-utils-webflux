package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddTraceSourceUploadCodeInfoResponse extends PopBaseHttpResponse {

    /**
     * 1成功，0失败
     */
    @JsonProperty("status")
    private Integer status;

    public Integer getStatus() {
        return status;
    }
}