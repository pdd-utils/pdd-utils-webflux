package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightCallbackConfirmOrderResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("flight_callback_confirm_order_response")
    private FlightCallbackConfirmOrderResponse flightCallbackConfirmOrderResponse;

    public FlightCallbackConfirmOrderResponse getFlightCallbackConfirmOrderResponse() {
        return flightCallbackConfirmOrderResponse;
    }

    public static class FlightCallbackConfirmOrderResponse {

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