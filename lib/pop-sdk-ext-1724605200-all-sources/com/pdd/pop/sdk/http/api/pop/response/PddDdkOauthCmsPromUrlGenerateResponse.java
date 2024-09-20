package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthCmsPromUrlGenerateResponse extends PopBaseHttpResponse {

    /**
     * 商城推广链接返回对象
     */
    @JsonProperty("cms_promotion_url_generate_response")
    private CmsPromotionUrlGenerateResponse cmsPromotionUrlGenerateResponse;

    public CmsPromotionUrlGenerateResponse getCmsPromotionUrlGenerateResponse() {
        return cmsPromotionUrlGenerateResponse;
    }

    public static class CmsPromotionUrlGenerateResponse {

        /**
         * total
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 链接列表
         */
        @JsonProperty("url_list")
        private List<CmsPromotionUrlGenerateResponseUrlListItem> urlList;

        public Integer getTotal() {
            return total;
        }

        public List<CmsPromotionUrlGenerateResponseUrlListItem> getUrlList() {
            return urlList;
        }
    }

    public static class CmsPromotionUrlGenerateResponseUrlListItem {

        /**
         * 唤醒拼多多app短链
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 唤醒拼多多app链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 多人团唤醒拼多多app链接
         */
        @JsonProperty("multi_group_mobile_short_url")
        private String multiGroupMobileShortUrl;

        /**
         * 多人团唤醒拼多多app长链接
         */
        @JsonProperty("multi_group_mobile_url")
        private String multiGroupMobileUrl;

        /**
         * 多人团短链，唤起H5页面
         */
        @JsonProperty("multi_group_short_url")
        private String multiGroupShortUrl;

        /**
         * 多人团长链，唤起H5页面
         */
        @JsonProperty("multi_group_url")
        private String multiGroupUrl;

        /**
         * 双人团链接列表
         */
        @JsonProperty("multi_url_list")
        private CmsPromotionUrlGenerateResponseUrlListItemMultiUrlList multiUrlList;

        /**
         * h5短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * CPSsign
         */
        @JsonProperty("sign")
        private String sign;

        /**
         * 单人团链接列表
         */
        @JsonProperty("single_url_list")
        private CmsPromotionUrlGenerateResponseUrlListItemSingleUrlList singleUrlList;

        /**
         * 普通推广长链接，唤起H5页面
         */
        @JsonProperty("url")
        private String url;

        /**
         * 拼多多福利券微信小程序信息
         */
        @JsonProperty("we_app_info")
        private CmsPromotionUrlGenerateResponseUrlListItemWeAppInfo weAppInfo;

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

        public CmsPromotionUrlGenerateResponseUrlListItemMultiUrlList getMultiUrlList() {
            return multiUrlList;
        }

        public String getShortUrl() {
            return shortUrl;
        }

        public String getSign() {
            return sign;
        }

        public CmsPromotionUrlGenerateResponseUrlListItemSingleUrlList getSingleUrlList() {
            return singleUrlList;
        }

        public String getUrl() {
            return url;
        }

        public CmsPromotionUrlGenerateResponseUrlListItemWeAppInfo getWeAppInfo() {
            return weAppInfo;
        }
    }

    public static class CmsPromotionUrlGenerateResponseUrlListItemMultiUrlList {

        /**
         * 双人团唤醒拼多多app短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 双人团唤醒拼多多app长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * schema链接，用户安装拼多多APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("schema_url")
        private String schemaUrl;

        /**
         * 双人团短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 使用此推广链接，用户安装多多团长APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("tz_schema_url")
        private String tzSchemaUrl;

        /**
         * 双人团长链接，唤起H5页面
         */
        @JsonProperty("url")
        private String url;

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
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
    }

    public static class CmsPromotionUrlGenerateResponseUrlListItemSingleUrlList {

        /**
         * 唤醒拼多多app短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 唤醒拼多多app长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * schema链接，用户安装拼多多APP的情况下会唤起APP（需客户端支持schema跳转协议）
         */
        @JsonProperty("schema_url")
        private String schemaUrl;

        /**
         * 对应出参url的短链接，与url功能一致。
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

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
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
    }

    public static class CmsPromotionUrlGenerateResponseUrlListItemWeAppInfo {

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