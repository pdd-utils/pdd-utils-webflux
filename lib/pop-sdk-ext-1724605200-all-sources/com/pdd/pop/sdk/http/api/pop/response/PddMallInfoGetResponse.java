package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("mall_info_get_response")
    private MallInfoGetResponse mallInfoGetResponse;

    public MallInfoGetResponse getMallInfoGetResponse() {
        return mallInfoGetResponse;
    }

    public static class MallInfoGetResponse {

        /**
         * 店铺logo
         */
        @JsonProperty("logo")
        private String logo;

        /**
         * 店铺描述
         */
        @JsonProperty("mall_desc")
        private String mallDesc;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 店铺类型,1:个人 2:企业 3:旗舰店 4:专卖店 5:专营店 6:普通店
         */
        @JsonProperty("merchant_type")
        private Integer merchantType;

        /**
         * 店铺身份,0:厂商 1:分销商 2:都不是 3:都是
         */
        @JsonProperty("mall_character")
        private Integer mallCharacter;

        public String getLogo() {
            return logo;
        }

        public String getMallDesc() {
            return mallDesc;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getMallName() {
            return mallName;
        }

        public Integer getMerchantType() {
            return merchantType;
        }

        public Integer getMallCharacter() {
            return mallCharacter;
        }
    }
}