package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddUtilDivideBase64ImageResponse extends PopBaseHttpResponse {

    /**
     * 切图后的地址列表
     */
    @JsonProperty("open_api_response")
    private List<String> openApiResponse;

    public List<String> getOpenApiResponse() {
        return openApiResponse;
    }
}