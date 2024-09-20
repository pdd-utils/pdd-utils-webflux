package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoStoreCreatePostNopoiResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("res")
    private Void res;

    public Void getRes() {
        return res;
    }
}