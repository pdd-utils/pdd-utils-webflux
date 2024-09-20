package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsPromotionUrlGenerateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_promotion_url_generate_response")
    private GoodsPromotionUrlGenerateResponse goodsPromotionUrlGenerateResponse;

    public GoodsPromotionUrlGenerateResponse getGoodsPromotionUrlGenerateResponse() {
        return goodsPromotionUrlGenerateResponse;
    }

    public static class GoodsPromotionUrlGenerateResponse {

        /**
         * 多多进宝推广链接对象列表
         */
        @JsonProperty("goods_promotion_url_list")
        private List<GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItem> goodsPromotionUrlList;

        public List<GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItem> getGoodsPromotionUrlList() {
            return goodsPromotionUrlList;
        }
    }

    public static class GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItem {

        /**
         * 对应出参mobile_url的短链接，与mobile_url功能一致。
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 普通长链，微信环境下进入领券页点领券拉起小程序，浏览器环境下直接拉起APP，未安装拼多多APP时落地页点领券拉起登录页
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * qq小程序信息
         */
        @JsonProperty("qq_app_info")
        private GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemQqAppInfo qqAppInfo;

        /**
         * 使用此推广链接，用户安装拼多多APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("schema_url")
        private String schemaUrl;

        /**
         * 商品推广分享图
         */
        @JsonProperty("share_image_url")
        private String shareImageUrl;

        /**
         * 对应出参url的短链接，与url功能一致
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 使用此推广链接，用户安装多多团长APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("tz_schema_url")
        private String tzSchemaUrl;

        /**
         * 普通长链。微信环境下进入领券页点领券拉起小程序，浏览器环境下优先拉起微信小程序
         */
        @JsonProperty("url")
        private String url;

        /**
         * 拼多多福利券微信小程序信息
         */
        @JsonProperty("we_app_info")
        private GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemWeAppInfo weAppInfo;

        /**
         * 微信小程序码
         */
        @JsonProperty("weixin_code")
        private String weixinCode;

        /**
         * 小程序短链，点击可直接唤起微信小程序
         */
        @JsonProperty("weixin_short_link")
        private String weixinShortLink;

        /**
         * 微信小程序schema长链
         */
        @JsonProperty("weixin_long_link")
        private String weixinLongLink;

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
        }

        public GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemQqAppInfo getQqAppInfo() {
            return qqAppInfo;
        }

        public String getSchemaUrl() {
            return schemaUrl;
        }

        public String getShareImageUrl() {
            return shareImageUrl;
        }

        public String getShortUrl() {
            return shortUrl;
        }

        public String getTzSchemaUrl() {
            return tzSchemaUrl;
        }

        public String getUrl() {
            return url;
        }

        public GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemWeAppInfo getWeAppInfo() {
            return weAppInfo;
        }

        public String getWeixinCode() {
            return weixinCode;
        }

        public String getWeixinShortLink() {
            return weixinShortLink;
        }

        public String getWeixinLongLink() {
            return weixinLongLink;
        }
    }

    public static class GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemQqAppInfo {

        /**
         * 拼多多小程序id
         */
        @JsonProperty("app_id")
        private String appId;

        /**
         * Banner图
         */
        @JsonProperty("banner_url")
        private String bannerUrl;

        /**
         * 描述
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 小程序path值
         */
        @JsonProperty("page_path")
        private String pagePath;

        /**
         * 小程序icon
         */
        @JsonProperty("qq_app_icon_url")
        private String qqAppIconUrl;

        /**
         * 来源名
         */
        @JsonProperty("source_display_name")
        private String sourceDisplayName;

        /**
         * 小程序标题
         */
        @JsonProperty("title")
        private String title;

        /**
         * 用户名
         */
        @JsonProperty("user_name")
        private String userName;

        public String getAppId() {
            return appId;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public String getDesc() {
            return desc;
        }

        public String getPagePath() {
            return pagePath;
        }

        public String getQqAppIconUrl() {
            return qqAppIconUrl;
        }

        public String getSourceDisplayName() {
            return sourceDisplayName;
        }

        public String getTitle() {
            return title;
        }

        public String getUserName() {
            return userName;
        }
    }

    public static class GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItemWeAppInfo {

        /**
         * 小程序id
         */
        @JsonProperty("app_id")
        private String appId;

        /**
         * Banner图
         */
        @JsonProperty("banner_url")
        private String bannerUrl;

        /**
         * 描述
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 小程序path值
         */
        @JsonProperty("page_path")
        private String pagePath;

        /**
         * 来源名
         */
        @JsonProperty("source_display_name")
        private String sourceDisplayName;

        /**
         * 小程序标题
         */
        @JsonProperty("title")
        private String title;

        /**
         * 用户名
         */
        @JsonProperty("user_name")
        private String userName;

        /**
         * 小程序图片
         */
        @JsonProperty("we_app_icon_url")
        private String weAppIconUrl;

        public String getAppId() {
            return appId;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public String getDesc() {
            return desc;
        }

        public String getPagePath() {
            return pagePath;
        }

        public String getSourceDisplayName() {
            return sourceDisplayName;
        }

        public String getTitle() {
            return title;
        }

        public String getUserName() {
            return userName;
        }

        public String getWeAppIconUrl() {
            return weAppIconUrl;
        }
    }
}