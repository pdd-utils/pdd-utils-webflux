package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddRdcPddgeniusSendgoodsCancelResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("rdc_pddgenius_sendgoods_cancel_response")
    private RdcPddgeniusSendgoodsCancelResponse rdcPddgeniusSendgoodsCancelResponse;

    public RdcPddgeniusSendgoodsCancelResponse getRdcPddgeniusSendgoodsCancelResponse() {
        return rdcPddgeniusSendgoodsCancelResponse;
    }

    public static class RdcPddgeniusSendgoodsCancelResponse {

        /**
         * result
         */
        @JsonProperty("result")
        private RdcPddgeniusSendgoodsCancelResponseResult result;

        public RdcPddgeniusSendgoodsCancelResponseResult getResult() {
            return result;
        }
    }

    public static class RdcPddgeniusSendgoodsCancelResponseResult {

        /**
         * result_data
         */
        @JsonProperty("result_data")
        private RdcPddgeniusSendgoodsCancelResponseResultResultData resultData;

        public RdcPddgeniusSendgoodsCancelResponseResultResultData getResultData() {
            return resultData;
        }
    }

    public static class RdcPddgeniusSendgoodsCancelResponseResultResultData {

        /**
         * 退款单ID
         */
        @JsonProperty("refund_id")
        private Long refundId;

        public Long getRefundId() {
            return refundId;
        }
    }
}