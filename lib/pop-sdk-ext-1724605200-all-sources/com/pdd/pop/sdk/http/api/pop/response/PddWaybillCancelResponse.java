package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddWaybillCancelResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_waybill_cancel_response")
    private InnerPddWaybillCancelResponse pddWaybillCancelResponse;

    public InnerPddWaybillCancelResponse getPddWaybillCancelResponse() {
        return pddWaybillCancelResponse;
    }

    public static class InnerPddWaybillCancelResponse {

        /**
         * 调用取消是否成功
         */
        @JsonProperty("cancel_result")
        private Boolean cancelResult;

        public Boolean getCancelResult() {
            return cancelResult;
        }
    }
}