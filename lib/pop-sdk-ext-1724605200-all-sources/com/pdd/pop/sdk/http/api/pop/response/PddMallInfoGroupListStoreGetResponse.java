package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallInfoGroupListStoreGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_group_list_store_get_response")
    private MallInfoGroupListStoreGetResponse mallInfoGroupListStoreGetResponse;

    public MallInfoGroupListStoreGetResponse getMallInfoGroupListStoreGetResponse() {
        return mallInfoGroupListStoreGetResponse;
    }

    public static class MallInfoGroupListStoreGetResponse {

        /**
         * 门店列表
         */
        @JsonProperty("mall_store_final_vo_list")
        private List<MallInfoGroupListStoreGetResponseMallStoreFinalVoListItem> mallStoreFinalVoList;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<MallInfoGroupListStoreGetResponseMallStoreFinalVoListItem> getMallStoreFinalVoList() {
            return mallStoreFinalVoList;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class MallInfoGroupListStoreGetResponseMallStoreFinalVoListItem {

        /**
         * 门店经营状态
         */
        @JsonProperty("businessStatus")
        private Integer businessStatus;

        /**
         * 省市区三级地址-市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 省市区三级地址-区
         */
        @JsonProperty("district")
        private String district;

        /**
         * 
         */
        @JsonProperty("exists")
        private Boolean exists;

        /**
         * 省市区三级地址-省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 门店地址
         */
        @JsonProperty("storeAddress")
        private String storeAddress;

        /**
         * 门店ID
         */
        @JsonProperty("storeId")
        private Long storeId;

        /**
         * 店铺名称
         */
        @JsonProperty("storeName")
        private String storeName;

        /**
         * 门店自有编号
         */
        @JsonProperty("storeNumber")
        private String storeNumber;

        public Integer getBusinessStatus() {
            return businessStatus;
        }

        public String getCity() {
            return city;
        }

        public String getDistrict() {
            return district;
        }

        public Boolean getExists() {
            return exists;
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