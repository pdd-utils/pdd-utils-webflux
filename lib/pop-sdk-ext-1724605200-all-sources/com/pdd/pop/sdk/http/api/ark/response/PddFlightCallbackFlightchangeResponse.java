package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightCallbackFlightchangeResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("flight_callback_flightchange_response")
    private FlightCallbackFlightchangeResponse flightCallbackFlightchangeResponse;

    public FlightCallbackFlightchangeResponse getFlightCallbackFlightchangeResponse() {
        return flightCallbackFlightchangeResponse;
    }

    public static class FlightCallbackFlightchangeResponse {

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