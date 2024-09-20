package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddServicemarketActivityIsvSendResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

        public ResponseResult getResult() {
            return result;
        }
    }

    public static class ResponseResult {

        /**
         * 
         */
        @JsonProperty("coupon_id")
        private List<Long> couponId;

        public List<Long> getCouponId() {
            return couponId;
        }
    }
}