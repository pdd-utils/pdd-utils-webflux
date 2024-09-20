package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOpenLogisticsPreCheckResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("logistics_pre_check_response")
    private LogisticsPreCheckResponse logisticsPreCheckResponse;

    public LogisticsPreCheckResponse getLogisticsPreCheckResponse() {
        return logisticsPreCheckResponse;
    }

    public static class LogisticsPreCheckResponse {

        /**
         * 是否允许发货
         */
        @JsonProperty("allowed")
        private Boolean allowed;

        public Boolean getAllowed() {
            return allowed;
        }
    }
}