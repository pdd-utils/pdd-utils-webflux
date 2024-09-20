package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFdsWaybillReturnSlaveResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_waybill_return_slave_response")
    private InnerPddFdsWaybillReturnSlaveResponse pddFdsWaybillReturnSlaveResponse;

    public InnerPddFdsWaybillReturnSlaveResponse getPddFdsWaybillReturnSlaveResponse() {
        return pddFdsWaybillReturnSlaveResponse;
    }

    public static class InnerPddFdsWaybillReturnSlaveResponse {

        /**
         * 回传结果true：成功  false：失败
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}