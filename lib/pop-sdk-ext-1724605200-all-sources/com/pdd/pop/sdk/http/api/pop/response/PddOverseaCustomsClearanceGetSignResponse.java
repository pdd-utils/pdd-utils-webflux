package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOverseaCustomsClearanceGetSignResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 签名节点（不包含KeyInfo）
         */
        @JsonProperty("data_signature")
        private String dataSignature;

        public String getDataSignature() {
            return dataSignature;
        }
    }
}