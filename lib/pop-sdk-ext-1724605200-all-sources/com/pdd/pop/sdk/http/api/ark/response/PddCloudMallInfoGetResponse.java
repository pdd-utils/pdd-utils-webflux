package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudMallInfoGetResponse extends PopBaseHttpResponse {

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
         * 店铺身份,0:厂商 1:分销商 2:都不是 3:都是
         */
        @JsonProperty("mall_character")
        private Integer mallCharacter;

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
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 子错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        public String getLogo() {
            return logo;
        }

        public Integer getMallCharacter() {
            return mallCharacter;
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

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }
    }
}