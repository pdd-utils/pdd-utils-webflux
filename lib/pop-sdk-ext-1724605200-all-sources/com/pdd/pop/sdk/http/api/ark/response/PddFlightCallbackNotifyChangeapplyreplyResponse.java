package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightCallbackNotifyChangeapplyreplyResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("flight_callback_notify_changeapplyreply_response")
    private FlightCallbackNotifyChangeapplyreplyResponse flightCallbackNotifyChangeapplyreplyResponse;

    public FlightCallbackNotifyChangeapplyreplyResponse getFlightCallbackNotifyChangeapplyreplyResponse() {
        return flightCallbackNotifyChangeapplyreplyResponse;
    }

    public static class FlightCallbackNotifyChangeapplyreplyResponse {

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