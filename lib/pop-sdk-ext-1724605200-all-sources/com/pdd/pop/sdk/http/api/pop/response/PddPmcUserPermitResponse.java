package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPmcUserPermitResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pmc_user_permit_response")
    private PmcUserPermitResponse pmcUserPermitResponse;

    public PmcUserPermitResponse getPmcUserPermitResponse() {
        return pmcUserPermitResponse;
    }

    public static class PmcUserPermitResponse {

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}