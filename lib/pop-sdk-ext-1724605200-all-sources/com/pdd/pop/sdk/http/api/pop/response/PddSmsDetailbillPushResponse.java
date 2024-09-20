package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddSmsDetailbillPushResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("sms_detailbill_push_resposne")
    private SmsDetailbillPushResposne smsDetailbillPushResposne;

    public SmsDetailbillPushResposne getSmsDetailbillPushResposne() {
        return smsDetailbillPushResposne;
    }

    public static class SmsDetailbillPushResposne {

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}