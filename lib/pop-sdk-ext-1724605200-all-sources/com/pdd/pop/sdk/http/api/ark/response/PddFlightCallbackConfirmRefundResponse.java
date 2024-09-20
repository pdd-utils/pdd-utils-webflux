package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightCallbackConfirmRefundResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("flight_callback_confirm_refund_response")
    private FlightCallbackConfirmRefundResponse flightCallbackConfirmRefundResponse;

    public FlightCallbackConfirmRefundResponse getFlightCallbackConfirmRefundResponse() {
        return flightCallbackConfirmRefundResponse;
    }

    public static class FlightCallbackConfirmRefundResponse {

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}