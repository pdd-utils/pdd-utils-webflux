package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightCallbackConfirmChangeResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("flight_callback_confirm_change_response")
    private FlightCallbackConfirmChangeResponse flightCallbackConfirmChangeResponse;

    public FlightCallbackConfirmChangeResponse getFlightCallbackConfirmChangeResponse() {
        return flightCallbackConfirmChangeResponse;
    }

    public static class FlightCallbackConfirmChangeResponse {

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