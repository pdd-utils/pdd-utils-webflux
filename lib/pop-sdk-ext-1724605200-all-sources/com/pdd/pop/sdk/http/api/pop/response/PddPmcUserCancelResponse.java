package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPmcUserCancelResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("tmc_user_cancel_response")
    private TmcUserCancelResponse tmcUserCancelResponse;

    public TmcUserCancelResponse getTmcUserCancelResponse() {
        return tmcUserCancelResponse;
    }

    public static class TmcUserCancelResponse {

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