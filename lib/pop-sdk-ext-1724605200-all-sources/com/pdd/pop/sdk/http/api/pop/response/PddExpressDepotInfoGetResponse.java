package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddExpressDepotInfoGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    public static class OpenApiResponse {

        /**
         * 详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 仓库别名
         */
        @JsonProperty("alias")
        private String alias;

        /**
         * 仓库地址（市编号）
         */
        @JsonProperty("city")
        private Integer city;

        /**
         * 仓库编码
         */
        @JsonProperty("code")
        private String code;

        /**
         * 联系人姓名
         */
        @JsonProperty("contact_name")
        private String contactName;

        /**
         * 联系人电话
         */
        @JsonProperty("contact_tel")
        private String contactTel;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        /**
         * 仓库地址（区编号）
         */
        @JsonProperty("district")
        private Integer district;

        /**
         * 仓库id（string）
         */
        @JsonProperty("id_str")
        private String idStr;

        /**
         * 仓库名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 其他仓库覆盖区域列表（外层key为省id；cover为该省份覆盖情况：1 半覆盖，2全覆盖；district为省中覆盖的地址：市id->区id列表）
         */
        @JsonProperty("other_region")
        private Map<String, OpenApiResponseOtherRegionValue> otherRegion;

        /**
         * 仓库地址（省编号）
         */
        @JsonProperty("province")
        private Integer province;

        /**
         * 该仓库覆盖区域列表（其他仓库覆盖区域列表(外层key为省id；cover为该省份覆盖情况：1 半覆盖，2全覆盖；district为省中覆盖的地址：市id->区id列表)）
         */
        @JsonProperty("region")
        private Map<String, OpenApiResponseRegionValue> region;

        /**
         * 仓库类型，暂时只有1
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 邮编
         */
        @JsonProperty("zip")
        private String zip;

        public String getAddress() {
            return address;
        }

        public String getAlias() {
            return alias;
        }

        public Integer getCity() {
            return city;
        }

        public String getCode() {
            return code;
        }

        public String getContactName() {
            return contactName;
        }

        public String getContactTel() {
            return contactTel;
        }

        public Long getDepotId() {
            return depotId;
        }

        public Integer getDistrict() {
            return district;
        }

        public String getIdStr() {
            return idStr;
        }

        public String getName() {
            return name;
        }

        public Map<String, OpenApiResponseOtherRegionValue> getOtherRegion() {
            return otherRegion;
        }

        public Integer getProvince() {
            return province;
        }

        public Map<String, OpenApiResponseRegionValue> getRegion() {
            return region;
        }

        public Integer getType() {
            return type;
        }

        public String getZip() {
            return zip;
        }
    }

    public static class OpenApiResponseOtherRegionValue {

        /**
         * 1 半覆盖，2 全覆盖
         */
        @JsonProperty("cover")
        private Integer cover;

        /**
         * 城市id -> 区id列表
         */
        @JsonProperty("district")
        private Map<String, List<Integer>> district;

        public Integer getCover() {
            return cover;
        }

        public Map<String, List<Integer>> getDistrict() {
            return district;
        }
    }

    public static class OpenApiResponseRegionValue {

        /**
         * 1 半覆盖，2 全覆盖
         */
        @JsonProperty("cover")
        private Integer cover;

        /**
         * 城市id -> 区id列表
         */
        @JsonProperty("district")
        private Map<String, List<String>> district;

        public Integer getCover() {
            return cover;
        }

        public Map<String, List<String>> getDistrict() {
            return district;
        }
    }
}