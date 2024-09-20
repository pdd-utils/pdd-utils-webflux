package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkRpPromUrlGenerateResponse extends PopBaseHttpResponse {

    /**
     * 推广链接返回对象
     */
    @JsonProperty("rp_promotion_url_generate_response")
    private RpPromotionUrlGenerateResponse rpPromotionUrlGenerateResponse;

    public RpPromotionUrlGenerateResponse getRpPromotionUrlGenerateResponse() {
        return rpPromotionUrlGenerateResponse;
    }

    public static class RpPromotionUrlGenerateResponse {

        /**
         * resource_list
         */
        @JsonProperty("resource_list")
        private List<RpPromotionUrlGenerateResponseResourceListItem> resourceList;

        /**
         * url_list
         */
        @JsonProperty("url_list")
        private List<RpPromotionUrlGenerateResponseUrlListItem> urlList;

        public List<RpPromotionUrlGenerateResponseResourceListItem> getResourceList() {
            return resourceList;
        }

        public List<RpPromotionUrlGenerateResponseUrlListItem> getUrlList() {
            return urlList;
        }
    }

    public static class RpPromotionUrlGenerateResponseResourceListItem {

        /**
         * 活动描述
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 活动地址
         */
        @JsonProperty("url")
        private String url;

        public String getDesc() {
            return desc;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class RpPromotionUrlGenerateResponseUrlListItem {

        /**
         * 推广移动短链接，对应出参mobile_url的短链接，与mobile_url功能一致。
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 推广移动链接，用户安装拼多多APP的情况下会唤起APP，否则唤起H5页面
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 推广多人团移动短链接
         */
        @JsonProperty("multi_group_mobile_short_url")
        private String multiGroupMobileShortUrl;

        /**
         * 推广多人团移动链接，用户安装拼多多APP的情况下会唤起APP，否则唤起H5页面
         */
        @JsonProperty("multi_group_mobile_url")
        private String multiGroupMobileUrl;

        /**
         * 推广多人团短链接
         */
        @JsonProperty("multi_group_short_url")
        private String multiGroupShortUrl;

        /**
         * 推广多人团链接，唤起H5页面
         */
        @JsonProperty("multi_group_url")
        private String multiGroupUrl;

        /**
         * qq小程序信息
         */
        @JsonProperty("qq_app_info")
        private RpPromotionUrlGenerateResponseUrlListItemQqAppInfo qqAppInfo;

        /**
         * schema链接，用户安装拼多多APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("schema_url")
        private String schemaUrl;

        /**
         * 推广短链接，对应出参url的短链接，与url功能一致
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 使用此推广链接，用户安装多多团长APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("tz_schema_url")
        private String tzSchemaUrl;

        /**
         * 普通推广长链接，唤起H5页面
         */
        @JsonProperty("url")
        private String url;

        /**
         * 拼多多福利券微信小程序信息
         */
        @JsonProperty("we_app_info")
        private RpPromotionUrlGenerateResponseUrlListItemWeAppInfo weAppInfo;

        /**
         * 微信shortLink，该字段支持超红c端活动页、超红二合一、b端推品页，单个渠道每天生成的shortLink数量有限，请合理生成shortLink链接
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

        public RpPromotionUrlGenerateResponseUrlListItemQqAppInfo getQqAppInfo() {
            return qqAppInfo;
        }

        public String getSchemaUrl() {
            return schemaUrl;
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

        public RpPromotionUrlGenerateResponseUrlListItemWeAppInfo getWeAppInfo() {
            return weAppInfo;
        }

        public String getWeixinShortLink() {
            return weixinShortLink;
        }
    }

    public static class RpPromotionUrlGenerateResponseUrlListItemQqAppInfo {

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

    public static class RpPromotionUrlGenerateResponseUrlListItemWeAppInfo {

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
         * 小程序icon
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