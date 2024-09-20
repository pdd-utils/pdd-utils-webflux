package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsTemplateUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsLogisticsTemplateUpdateRequest extends PopBaseHttpRequest<PddGoodsLogisticsTemplateUpdateResponse> {

    /**
     * 非包邮模版列表
     */
    @JsonProperty("cost_template_list")
    private List<CostTemplateListItem> costTemplateList;

    /**
     * 包邮地区列表
     */
    @JsonProperty("free_province_list")
    private List<FreeProvinceListItem> freeProvinceList;

    /**
     * 运费模板ID
     */
    @JsonProperty("cost_template_id")
    private Integer costTemplateId;

    /**
     * 运费模板名称
     */
    @JsonProperty("template_name")
    private String templateName;

    /**
     * 发货地省份id
     */
    @JsonProperty("province_id")
    private Integer provinceId;

    /**
     * 发货地城市id
     */
    @JsonProperty("city_id")
    private Integer cityId;

    /**
     * 发货地区id
     */
    @JsonProperty("district_id")
    private Integer districtId;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.goods.logistics.template.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsTemplateUpdateResponse> getResponseClass() {
        return PddGoodsLogisticsTemplateUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cost_template_list", costTemplateList);
        setUserParam(params, "free_province_list", freeProvinceList);
        setUserParam(params, "cost_template_id", costTemplateId);
        setUserParam(params, "template_name", templateName);
        setUserParam(params, "province_id", provinceId);
        setUserParam(params, "city_id", cityId);
        setUserParam(params, "district_id", districtId);
    }

    public void setCostTemplateList(List<CostTemplateListItem> costTemplateList) {
        this.costTemplateList = costTemplateList;
    }

    public void setFreeProvinceList(List<FreeProvinceListItem> freeProvinceList) {
        this.freeProvinceList = freeProvinceList;
    }

    public void setCostTemplateId(Integer costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public static class CostTemplateListItem {

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
        private Boolean haveFreeMinCount;

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

        /**
         * 省份列表
         */
        @JsonProperty("cost_province_list")
        private List<CostTemplateListItemCostProvinceListItem> costProvinceList;

        public void setFirstStandard(Long firstStandard) {
            this.firstStandard = firstStandard;
        }

        public void setFirstCost(Long firstCost) {
            this.firstCost = firstCost;
        }

        public void setAddStandard(Long addStandard) {
            this.addStandard = addStandard;
        }

        public void setAddCost(Long addCost) {
            this.addCost = addCost;
        }

        public void setIsHaveFreeMinCount(Boolean isHaveFreeMinCount) {
            this.isHaveFreeMinCount = isHaveFreeMinCount;
        }

        public void setHaveFreeMinCount(Boolean haveFreeMinCount) {
            this.haveFreeMinCount = haveFreeMinCount;
        }

        public void setIsHaveFreeMinAmount(Boolean isHaveFreeMinAmount) {
            this.isHaveFreeMinAmount = isHaveFreeMinAmount;
        }

        public void setHaveFreeMinAmount(Long haveFreeMinAmount) {
            this.haveFreeMinAmount = haveFreeMinAmount;
        }

        public void setCostProvinceList(List<CostTemplateListItemCostProvinceListItem> costProvinceList) {
            this.costProvinceList = costProvinceList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CostTemplateListItemCostProvinceListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class FreeProvinceListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}