package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPmcAccrueQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pmc_user_get_response")
    private PmcUserGetResponse pmcUserGetResponse;

    public PmcUserGetResponse getPmcUserGetResponse() {
        return pmcUserGetResponse;
    }

    public static class PmcUserGetResponse {

        /**
         * 消息积压数量
         */
        @JsonProperty("number")
        private Long number;

        public Long getNumber() {
            return number;
        }
    }
}