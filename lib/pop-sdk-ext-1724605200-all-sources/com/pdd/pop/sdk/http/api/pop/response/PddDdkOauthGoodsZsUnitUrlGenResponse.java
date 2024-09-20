package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkOauthGoodsZsUnitUrlGenResponse extends PopBaseHttpResponse {

    /**
     * goods_zs_unit_generate_response
     */
    @JsonProperty("goods_zs_unit_generate_response")
    private GoodsZsUnitGenerateResponse goodsZsUnitGenerateResponse;

    public GoodsZsUnitGenerateResponse getGoodsZsUnitGenerateResponse() {
        return goodsZsUnitGenerateResponse;
    }

    public static class GoodsZsUnitGenerateResponse {

        /**
         * 推广短链接（可唤起拼多多app）
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 推广长链接（唤起拼多多app）
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 推广短链接（唤起拼多多app）
         */
        @JsonProperty("multi_group_mobile_short_url")
        private String multiGroupMobileShortUrl;

        /**
         * 推广长链接（可唤起拼多多app）
         */
        @JsonProperty("multi_group_mobile_url")
        private String multiGroupMobileUrl;

        /**
         * 双人团推广短链接
         */
        @JsonProperty("multi_group_short_url")
        private String multiGroupShortUrl;

        /**
         * 双人团推广长链接
         */
        @JsonProperty("multi_group_url")
        private String multiGroupUrl;

        /**
         * schema的链接
         */
        @JsonProperty("schema_url")
        private String schemaUrl;

        /**
         * 单人团推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 单人团推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 微信小程序longLink
         */
        @JsonProperty("weixin_long_link")
        private String weixinLongLink;

        /**
         * 微信小程序shortLink
         */
        @JsonProperty("weixin_short_link")
        private String weixinShortLink;

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
        }

        public String getMultiGroupMobileShortUrl() {
            return multiGroupMobileShortUrl;
        }

        public String getMultiGroupMobileUrl() {
            return multiGroupMobileUrl;
        }

        public String getMultiGroupShortUrl() {
            return multiGroupShortUrl;
        }

        public String getMultiGroupUrl() {
            return multiGroupUrl;
        }

        public String getSchemaUrl() {
            return schemaUrl;
        }

        public String getShortUrl() {
            return shortUrl;
        }

        public String getUrl() {
            return url;
        }

        public String getWeixinLongLink() {
            return weixinLongLink;
        }

        public String getWeixinShortLink() {
            return weixinShortLink;
        }
    }
}