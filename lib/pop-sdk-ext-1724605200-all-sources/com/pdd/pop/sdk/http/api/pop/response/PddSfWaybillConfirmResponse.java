package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddSfWaybillConfirmResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_sf_waybill_confirm_response")
    private InnerPddSfWaybillConfirmResponse pddSfWaybillConfirmResponse;

    public InnerPddSfWaybillConfirmResponse getPddSfWaybillConfirmResponse() {
        return pddSfWaybillConfirmResponse;
    }

    public static class InnerPddSfWaybillConfirmResponse {

        /**
         * 请求结果
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}