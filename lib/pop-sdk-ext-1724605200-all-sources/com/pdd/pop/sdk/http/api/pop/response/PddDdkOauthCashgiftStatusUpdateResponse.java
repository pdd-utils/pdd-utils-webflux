package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkOauthCashgiftStatusUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("update_cashgift_response")
    private UpdateCashgiftResponse updateCashgiftResponse;

    public UpdateCashgiftResponse getUpdateCashgiftResponse() {
        return updateCashgiftResponse;
    }

    public static class UpdateCashgiftResponse {

        /**
         * 多多礼金ID
         */
        @JsonProperty("cash_gift_id")
        private Long cashGiftId;

        public Long getCashGiftId() {
            return cashGiftId;
        }
    }
}