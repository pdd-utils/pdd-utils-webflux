package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFdsWaybillReturnResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_waybill_return_response")
    private InnerPddFdsWaybillReturnResponse pddFdsWaybillReturnResponse;

    public InnerPddFdsWaybillReturnResponse getPddFdsWaybillReturnResponse() {
        return pddFdsWaybillReturnResponse;
    }

    public static class InnerPddFdsWaybillReturnResponse {

        /**
         * 回传结果true:成功false：失败
         */
        @JsonProperty("return_result")
        private Boolean returnResult;

        public Boolean getReturnResult() {
            return returnResult;
        }
    }
}