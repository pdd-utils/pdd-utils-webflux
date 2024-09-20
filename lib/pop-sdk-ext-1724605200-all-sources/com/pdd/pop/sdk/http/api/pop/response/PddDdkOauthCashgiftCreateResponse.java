package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkOauthCashgiftCreateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("create_cashgift_response")
    private CreateCashgiftResponse createCashgiftResponse;

    public CreateCashgiftResponse getCreateCashgiftResponse() {
        return createCashgiftResponse;
    }

    public static class CreateCashgiftResponse {

        /**
         * 礼金ID
         */
        @JsonProperty("cash_gift_id")
        private Long cashGiftId;

        /**
         * 创建结果
         */
        @JsonProperty("success")
        private Boolean success;

        public Long getCashGiftId() {
            return cashGiftId;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}