package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFdsWaybillCancelResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_waybill_cancel_response")
    private InnerPddFdsWaybillCancelResponse pddFdsWaybillCancelResponse;

    public InnerPddFdsWaybillCancelResponse getPddFdsWaybillCancelResponse() {
        return pddFdsWaybillCancelResponse;
    }

    public static class InnerPddFdsWaybillCancelResponse {

        /**
         * 取消回传结果true:成功false：失败
         */
        @JsonProperty("return_result")
        private Boolean returnResult;

        public Boolean getReturnResult() {
            return returnResult;
        }
    }
}