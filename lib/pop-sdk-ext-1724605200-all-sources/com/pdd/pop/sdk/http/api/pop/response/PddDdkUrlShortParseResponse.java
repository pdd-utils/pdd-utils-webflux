package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkUrlShortParseResponse extends PopBaseHttpResponse {

    /**
     * 普通长链，与短链接功能一致
     */
    @JsonProperty("url")
    private String url;

    public String getUrl() {
        return url;
    }
}