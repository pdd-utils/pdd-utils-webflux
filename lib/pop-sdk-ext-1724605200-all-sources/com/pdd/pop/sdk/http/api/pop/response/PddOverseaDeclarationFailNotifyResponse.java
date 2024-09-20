package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOverseaDeclarationFailNotifyResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("notify_exceeded_response")
    private NotifyExceededResponse notifyExceededResponse;

    public NotifyExceededResponse getNotifyExceededResponse() {
        return notifyExceededResponse;
    }

    public static class NotifyExceededResponse {

        /**
         * true=处理成功
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}