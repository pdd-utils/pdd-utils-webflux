package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkResourceUrlGenResponse extends PopBaseHttpResponse {

    /**
     * resource_url_response
     */
    @JsonProperty("resource_url_response")
    private ResourceUrlResponse resourceUrlResponse;

    public ResourceUrlResponse getResourceUrlResponse() {
        return resourceUrlResponse;
    }

    public static class ResourceUrlResponse {

        /**
         * 多人团链接
         */
        @JsonProperty("multi_url_list")
        private ResourceUrlResponseMultiUrlList multiUrlList;

        /**
         * sign
         */
        @JsonProperty("sign")
        private String sign;

        /**
         * 单人团链接
         */
        @JsonProperty("single_url_list")
        private ResourceUrlResponseSingleUrlList singleUrlList;

        /**
         * 拼多多福利券微信小程序信息
         */
        @JsonProperty("we_app_info")
        private ResourceUrlResponseWeAppInfo weAppInfo;

        public ResourceUrlResponseMultiUrlList getMultiUrlList() {
            return multiUrlList;
        }

        public String getSign() {
            return sign;
        }

        public ResourceUrlResponseSingleUrlList getSingleUrlList() {
            return singleUrlList;
        }

        public ResourceUrlResponseWeAppInfo getWeAppInfo() {
            return weAppInfo;
        }
    }

    public static class ResourceUrlResponseMultiUrlList {

        /**
         * 对应出参url的短链接，与url功能一致。
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 频道推广长链接，唤起H5页面
         */
        @JsonProperty("url")
        private String url;

        public String getShortUrl() {
            return shortUrl;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class ResourceUrlResponseSingleUrlList {

        /**
         * 对应出参url的短链接，与url功能一致。
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 频道推广长链接，唤起H5页面
         */
        @JsonProperty("url")
        private String url;

        public String getShortUrl() {
            return shortUrl;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class ResourceUrlResponseWeAppInfo {

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