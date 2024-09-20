package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttUserSitePagequeryResponse extends PopBaseHttpResponse {

    /**
     * 结果
     */
    @JsonProperty("ktt_user_site_list_response")
    private KttUserSiteListResponse kttUserSiteListResponse;

    public KttUserSiteListResponse getKttUserSiteListResponse() {
        return kttUserSiteListResponse;
    }

    public static class KttUserSiteListResponse {

        /**
         * 自提点列表
         */
        @JsonProperty("self_site_info_list")
        private List<KttUserSiteListResponseSelfSiteInfoListItem> selfSiteInfoList;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Long total;

        public List<KttUserSiteListResponseSelfSiteInfoListItem> getSelfSiteInfoList() {
            return selfSiteInfoList;
        }

        public Long getTotal() {
            return total;
        }
    }

    public static class KttUserSiteListResponseSelfSiteInfoListItem {

        /**
         * 分类名称
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 市
         */
        @JsonProperty("city_name")
        private String cityName;

        /**
         * 区
         */
        @JsonProperty("district_name")
        private String districtName;

        /**
         * 是否删除
         */
        @JsonProperty("is_delete")
        private Boolean isDelete;

        /**
         * 电话
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 省
         */
        @JsonProperty("province_name")
        private String provinceName;

        /**
         * 联系人
         */
        @JsonProperty("receive_name")
        private String receiveName;

        /**
         * 路线名称
         */
        @JsonProperty("route_name")
        private String routeName;

        /**
         * 详细地址
         */
        @JsonProperty("shipping_address")
        private String shippingAddress;

        /**
         * 管理员昵称
         */
        @JsonProperty("site_manager_nickname")
        private String siteManagerNickname;

        /**
         * 自提点名称
         */
        @JsonProperty("site_name")
        private String siteName;

        /**
         * 编号
         */
        @JsonProperty("site_no")
        private String siteNo;

        public String getCategoryName() {
            return categoryName;
        }

        public String getCityName() {
            return cityName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public Boolean getIsDelete() {
            return isDelete;
        }

        public String getMobile() {
            return mobile;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public String getReceiveName() {
            return receiveName;
        }

        public String getRouteName() {
            return routeName;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }

        public String getSiteManagerNickname() {
            return siteManagerNickname;
        }

        public String getSiteName() {
            return siteName;
        }

        public String getSiteNo() {
            return siteNo;
        }
    }
}