package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallTicketNotifyResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_ticket_notify_respone")
    private MallTicketNotifyRespone mallTicketNotifyRespone;

    public MallTicketNotifyRespone getMallTicketNotifyRespone() {
        return mallTicketNotifyRespone;
    }

    public static class MallTicketNotifyRespone {

        /**
         * 
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}