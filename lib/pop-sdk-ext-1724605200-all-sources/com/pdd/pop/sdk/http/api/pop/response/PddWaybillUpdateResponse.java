package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddWaybillUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_waybill_update_response")
    private InnerPddWaybillUpdateResponse pddWaybillUpdateResponse;

    public InnerPddWaybillUpdateResponse getPddWaybillUpdateResponse() {
        return pddWaybillUpdateResponse;
    }

    public static class InnerPddWaybillUpdateResponse {

        /**
         * 模板内容
         */
        @JsonProperty("print_data")
        private String printData;

        /**
         * 面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        public String getPrintData() {
            return printData;
        }

        public String getWaybillCode() {
            return waybillCode;
        }
    }
}