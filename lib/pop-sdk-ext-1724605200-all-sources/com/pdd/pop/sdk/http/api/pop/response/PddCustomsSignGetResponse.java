package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCustomsSignGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("customs_sign_get_resonpse")
    private CustomsSignGetResonpse customsSignGetResonpse;

    public CustomsSignGetResonpse getCustomsSignGetResonpse() {
        return customsSignGetResonpse;
    }

    public static class CustomsSignGetResonpse {

        /**
         * 数据的签名
         */
        @JsonProperty("data_signature")
        private String dataSignature;

        /**
         * 报关商的一次请求的id
         */
        @JsonProperty("trace_id")
        private String traceId;

        public String getDataSignature() {
            return dataSignature;
        }

        public String getTraceId() {
            return traceId;
        }
    }
}