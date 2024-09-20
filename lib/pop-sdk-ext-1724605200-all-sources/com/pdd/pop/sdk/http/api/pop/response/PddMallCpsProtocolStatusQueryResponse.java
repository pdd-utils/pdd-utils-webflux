package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallCpsProtocolStatusQueryResponse extends PopBaseHttpResponse {

    /**
     * mall_cps_protocol_status_query_response
     */
    @JsonProperty("mall_cps_protocol_status_query_response")
    private MallCpsProtocolStatusQueryResponse mallCpsProtocolStatusQueryResponse;

    public MallCpsProtocolStatusQueryResponse getMallCpsProtocolStatusQueryResponse() {
        return mallCpsProtocolStatusQueryResponse;
    }

    public static class MallCpsProtocolStatusQueryResponse {

        /**
         * 是否签署协议
         */
        @JsonProperty("status")
        private Boolean status;

        public Boolean getStatus() {
            return status;
        }
    }
}