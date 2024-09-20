package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallInfoStoreGetResponse extends PopBaseHttpResponse {

    /**
     * 返回结构体
     */
    @JsonProperty("res")
    private Res res;

    public Res getRes() {
        return res;
    }

    public static class Res {

        /**
         * 返回结构体
         */
        @JsonProperty("mallStoreVOList")
        private List<ResMallStoreVOListItem> mallStoreVOList;

        public List<ResMallStoreVOListItem> getMallStoreVOList() {
            return mallStoreVOList;
        }
    }

    public static class ResMallStoreVOListItem {

        /**
         * 审核状态
         */
        @JsonProperty("audit_status")
        private Integer auditStatus;

        /**
         * 市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 区
         */
        @JsonProperty("district")
        private String district;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 门店纬度
         */
        @JsonProperty("poi_latitude")
        private Double poiLatitude;

        /**
         * 门店经度
         */
        @JsonProperty("poi_longitude")
        private Double poiLongitude;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 门店详细地址
         */
        @JsonProperty("store_address")
        private String storeAddress;

        /**
         * 门店id
         */
        @JsonProperty("store_id")
        private Long storeId;

        /**
         * 门店名称
         */
        @JsonProperty("store_name")
        private String storeName;

        /**
         * 门店自有编号
         */
        @JsonProperty("store_number")
        private String storeNumber;

        public Integer getAuditStatus() {
            return auditStatus;
        }

        public String getCity() {
            return city;
        }

        public String getDistrict() {
            return district;
        }

        public Long getMallId() {
            return mallId;
        }

        public Double getPoiLatitude() {
            return poiLatitude;
        }

        public Double getPoiLongitude() {
            return poiLongitude;
        }

        public String getProvince() {
            return province;
        }

        public String getStoreAddress() {
            return storeAddress;
        }

        public Long getStoreId() {
            return storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public String getStoreNumber() {
            return storeNumber;
        }
    }
}