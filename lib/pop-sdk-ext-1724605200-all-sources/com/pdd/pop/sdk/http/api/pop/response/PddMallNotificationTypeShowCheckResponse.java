package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallNotificationTypeShowCheckResponse extends PopBaseHttpResponse {

    /**
     * 是否展示通知：true-展示,false-不展示
     */
    @JsonProperty("result")
    private Boolean result;

    public Boolean getResult() {
        return result;
    }
}