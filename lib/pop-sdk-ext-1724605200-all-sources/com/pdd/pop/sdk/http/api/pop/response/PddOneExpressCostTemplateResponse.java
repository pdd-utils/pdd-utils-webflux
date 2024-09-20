package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOneExpressCostTemplateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("one_express_cost_template_response")
    private OneExpressCostTemplateResponse oneExpressCostTemplateResponse;

    public OneExpressCostTemplateResponse getOneExpressCostTemplateResponse() {
        return oneExpressCostTemplateResponse;
    }

    public static class OneExpressCostTemplateResponse {

        /**
         * 发货地省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 发货地城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 发货地区ID
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 送货入户并安装服务，0-不支持、1-支持送货入户、2-支持送货入户并安装
         */
        @JsonProperty("additional_service_type")
        private Integer additionalServiceType;

        /**
         * 是否顺丰包邮
         */
        @JsonProperty("sf_free_type")
        private Integer sfFreeType;

        /**
         * 不包邮区域/需要买家付邮费区域
         */
        @JsonProperty("cost_template_list")
        private List<OneExpressCostTemplateResponseCostTemplateListItem> costTemplateList;

        /**
         * 运费模板id
         */
        @JsonProperty("template_id")
        private Long templateId;

        /**
         * 运费模板名称
         */
        @JsonProperty("template_name")
        private String templateName;

        /**
         * 计费方式，0-按件计费，1-按重量计费
         */
        @JsonProperty("cost_type")
        private Integer costType;

        /**
         * 是否送货上门，对于包邮地区：true-商品包邮且送货上门，false-商品包邮但不送货上门
         */
        @JsonProperty("free_deliver_house")
        private Boolean freeDeliverHouse;

        /**
         * 送货上门地区列表
         */
        @JsonProperty("free_deliver_house_area_list")
        private List<OneExpressCostTemplateResponseFreeDeliverHouseAreaListItem> freeDeliverHouseAreaList;

        /**
         * 包邮省份对象
         */
        @JsonProperty("free_province_list")
        private List<OneExpressCostTemplateResponseFreeProvinceListItem> freeProvinceList;

        public Integer getProvinceId() {
            return provinceId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getDistrictId() {
            return districtId;
        }

        public Integer getAdditionalServiceType() {
            return additionalServiceType;
        }

        public Integer getSfFreeType() {
            return sfFreeType;
        }

        public List<OneExpressCostTemplateResponseCostTemplateListItem> getCostTemplateList() {
            return costTemplateList;
        }

        public Long getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public Integer getCostType() {
            return costType;
        }

        public Boolean getFreeDeliverHouse() {
            return freeDeliverHouse;
        }

        public List<OneExpressCostTemplateResponseFreeDeliverHouseAreaListItem> getFreeDeliverHouseAreaList() {
            return freeDeliverHouseAreaList;
        }

        public List<OneExpressCostTemplateResponseFreeProvinceListItem> getFreeProvinceList() {
            return freeProvinceList;
        }
    }

    public static class OneExpressCostTemplateResponseCostTemplateListItem {

        /**
         * 不包邮的区域
         */
        @JsonProperty("cost_province_list")
        private List<OneExpressCostTemplateResponseCostTemplateListItemCostProvinceListItem> costProvinceList;

        /**
         * 首件
         */
        @JsonProperty("first_standard")
        private Long firstStandard;

        /**
         * 首件或首重价格，单位为分
         */
        @JsonProperty("first_cost")
        private Long firstCost;

        /**
         * 续重或续件
         */
        @JsonProperty("add_standard")
        private Long addStandard;

        /**
         * 续件或续重价格，单位为分
         */
        @JsonProperty("add_cost")
        private Long addCost;

        /**
         * 对不包邮地区，true-若要包邮须满足件数包邮，false-不开启满足件数包邮
         */
        @JsonProperty("is_have_free_min_count")
        private Boolean isHaveFreeMinCount;

        /**
         * 对不包邮地区，满足指定件数包邮，该值为商家设置的指定件数，若为-1则商家没有开启满足件数包邮
         */
        @JsonProperty("have_free_min_count")
        private Long haveFreeMinCount;

        /**
         * 对不包邮地区，true-若要包邮须满足指定价格则可以包邮，false-不开启满足指定价格包邮
         */
        @JsonProperty("is_have_free_min_amount")
        private Boolean isHaveFreeMinAmount;

        /**
         * 对不包邮地区，满足指定价格包邮，该值为商家设置的指定订单金额，若为-1则商家没有开启满足指定价格包邮，注意，单位为分
         */
        @JsonProperty("have_free_min_amount")
        private Long haveFreeMinAmount;

        public List<OneExpressCostTemplateResponseCostTemplateListItemCostProvinceListItem> getCostProvinceList() {
            return costProvinceList;
        }

        public Long getFirstStandard() {
            return firstStandard;
        }

        public Long getFirstCost() {
            return firstCost;
        }

        public Long getAddStandard() {
            return addStandard;
        }

        public Long getAddCost() {
            return addCost;
        }

        public Boolean getIsHaveFreeMinCount() {
            return isHaveFreeMinCount;
        }

        public Long getHaveFreeMinCount() {
            return haveFreeMinCount;
        }

        public Boolean getIsHaveFreeMinAmount() {
            return isHaveFreeMinAmount;
        }

        public Long getHaveFreeMinAmount() {
            return haveFreeMinAmount;
        }
    }

    public static class OneExpressCostTemplateResponseCostTemplateListItemCostProvinceListItem {

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 不包邮区域的ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        public String getProvince() {
            return province;
        }

        public Integer getProvinceId() {
            return provinceId;
        }
    }

    public static class OneExpressCostTemplateResponseFreeDeliverHouseAreaListItem {

        /**
         * 包邮送货上门的城区ID
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 包邮送货上门的城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 包邮送货上门的省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 包邮送货上门的省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 包邮送货上门的城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 包邮送货上门的城区
         */
        @JsonProperty("town")
        private String town;

        public Integer getTownId() {
            return townId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getProvince() {
            return province;
        }

        public String getCity() {
            return city;
        }

        public String getTown() {
            return town;
        }
    }

    public static class OneExpressCostTemplateResponseFreeProvinceListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Long provinceId;

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        public Long getProvinceId() {
            return provinceId;
        }

        public String getProvince() {
            return province;
        }
    }
}