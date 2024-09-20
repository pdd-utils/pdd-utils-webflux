package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkGoodsPromotionRightAuthResponse extends PopBaseHttpResponse {

    /**
     * 返回结果
     */
    @JsonProperty("goods_promotion_right_auth_response")
    private GoodsPromotionRightAuthResponse goodsPromotionRightAuthResponse;

    public GoodsPromotionRightAuthResponse getGoodsPromotionRightAuthResponse() {
        return goodsPromotionRightAuthResponse;
    }

    public static class GoodsPromotionRightAuthResponse {

        /**
         * 备案失败原因
         */
        @JsonProperty("reason")
        private String reason;

        /**
         * 备案结果
         */
        @JsonProperty("result")
        private Boolean result;

        public String getReason() {
            return reason;
        }

        public Boolean getResult() {
            return result;
        }
    }
}