package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddTicketSkuRuleEditResponse extends PopBaseHttpResponse {

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
         * 规则 ID
         */
        @JsonProperty("rule_id")
        private String ruleId;

        /**
         * 版本
         */
        @JsonProperty("rule_version")
        private String ruleVersion;

        public String getRuleId() {
            return ruleId;
        }

        public String getRuleVersion() {
            return ruleVersion;
        }
    }
}