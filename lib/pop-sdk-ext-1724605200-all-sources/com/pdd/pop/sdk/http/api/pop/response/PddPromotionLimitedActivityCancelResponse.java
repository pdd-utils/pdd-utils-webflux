package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPromotionLimitedActivityCancelResponse extends PopBaseHttpResponse {

    /**
     * 是否成功
     */
    @JsonProperty("result")
    private Boolean result;

    public Boolean getResult() {
        return result;
    }
}