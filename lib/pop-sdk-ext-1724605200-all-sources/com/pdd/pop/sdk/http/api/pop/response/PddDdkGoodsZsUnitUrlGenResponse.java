package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkGoodsZsUnitUrlGenResponse extends PopBaseHttpResponse {

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
         * 对应出参mobile_url的短链接，与mobile_url功能一致
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 普通长链，微信环境下进入领券页点领券拉起小程序，浏览器环境下直接拉起APP，未安装拼多多APP时落地页点领券拉起登录页
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
         * 对应出参url的短链接，与url功能一致
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 普通长链。微信环境下进入领券页点领券拉起小程序，浏览器环境下优先拉起微信小程序
         */
        @JsonProperty("url")
        private String url;

        /**
         * 小程序短链，点击可直接唤起微信小程序
         */
        @JsonProperty("weixin_short_link")
        private String weixinShortLink;

        /**
         * 微信小程序longLink
         */
        @JsonProperty("weixin_long_link")
        private String weixinLongLink;

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

        public String getShortUrl() {
            return shortUrl;
        }

        public String getUrl() {
            return url;
        }

        public String getWeixinShortLink() {
            return weixinShortLink;
        }

        public String getWeixinLongLink() {
            return weixinLongLink;
        }
    }
}