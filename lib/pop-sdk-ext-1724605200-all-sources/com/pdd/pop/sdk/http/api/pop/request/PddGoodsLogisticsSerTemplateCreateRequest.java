package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsSerTemplateCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsLogisticsSerTemplateCreateRequest extends PopBaseHttpRequest<PddGoodsLogisticsSerTemplateCreateResponse> {

    /**
     * 分类目基础价格配置,入参为string，[{
     * 	"cat_id4": 1,
     * 	"cat_id3": 2,
     * 	"list": [{
     * 		"limit_type": 1,
     * 		"value": 1,
     * 		"content": [{
     * 			"price": 1,
     * 			"max_pro": 1,
     * 			"min_pro": 1
     * 		}]
     * 	}]
     * }]
     */
    @JsonProperty("cat_list")
    private List<CatListItem> catList;

    /**
     * 分地区配置溢价时使用的计价单位：0：价格分，按价格分计算费用；1：百分比，按照基础价格乘以百分比计算费用，除了"买家自提"服务，其他服务类型必传
     */
    @JsonProperty("price_unit")
    private Integer priceUnit;

    /**
     * 服务地区范围配置，此入参为string,[{
     * 	"value": 1,
     * 	"district_id": 2,
     * 	"city_id": 2,
     * 	"province_id": 2
     * }]
     */
    @JsonProperty("service_area_list")
    private List<ServiceAreaListItem> serviceAreaList;

    /**
     * 服务模板名称（不超过50字）
     */
    @JsonProperty("template_name")
    private String templateName;

    /**
     * 服务模板类型：2：送货上门 3：送货上门并安装 4：上门安装 5： 买家自提
     */
    @JsonProperty("template_type")
    private Integer templateType;

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
        return "pdd.goods.logistics.ser.template.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsSerTemplateCreateResponse> getResponseClass() {
        return PddGoodsLogisticsSerTemplateCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_list", catList);
        setUserParam(params, "price_unit", priceUnit);
        setUserParam(params, "service_area_list", serviceAreaList);
        setUserParam(params, "template_name", templateName);
        setUserParam(params, "template_type", templateType);
    }

    public void setCatList(List<CatListItem> catList) {
        this.catList = catList;
    }

    public void setPriceUnit(Integer priceUnit) {
        this.priceUnit = priceUnit;
    }

    public void setServiceAreaList(List<ServiceAreaListItem> serviceAreaList) {
        this.serviceAreaList = serviceAreaList;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public static class CatListItem {

        /**
         * 三级类目id
         */
        @JsonProperty("cat_id3")
        private Long catId3;

        /**
         * 四级类目id
         */
        @JsonProperty("cat_id4")
        private Long catId4;

        /**
         * 类目规则配置
         */
        @JsonProperty("list")
        private List<CatListItemListItem> list;

        public void setCatId3(Long catId3) {
            this.catId3 = catId3;
        }

        public void setCatId4(Long catId4) {
            this.catId4 = catId4;
        }

        public void setList(List<CatListItemListItem> list) {
            this.list = list;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CatListItemListItem {

        /**
         * 按属性收取费用时配置的内容：按属性限价时设置；按件限价时不用传，value和content必须设置一个
         */
        @JsonProperty("content")
        private List<CatListItemListItemContentItem> content;

        /**
         * 分类目收取服务费用方式：1-按件收取费用，2-按属性收取费用
         */
        @JsonProperty("limit_type")
        private Integer limitType;

        /**
         * 按“件”收取费用时配置的内容：按件限价时输入数字，表示每件商品附加费用$value分；按属性限价时不用传value和content必须设置一个
         */
        @JsonProperty("value")
        private Long value;

        public void setContent(List<CatListItemListItemContentItem> content) {
            this.content = content;
        }

        public void setLimitType(Integer limitType) {
            this.limitType = limitType;
        }

        public void setValue(Long value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CatListItemListItemContentItem {

        /**
         * 属性区间大值，-1表示"其他"示例：要配置区间"100-200"的费用，则maxPro输入"200"要配置区间"其他"的费用，则maxPro输入"-1"备注：表示长度时单位为：mm
         */
        @JsonProperty("max_pro")
        private Long maxPro;

        /**
         * 属性区间小值，-1表示"其他"示例：要配置区间"100-200"的费用，则minPro输入"100"要配置区间"其他"的费用，则minPro输入"-1"备注：表示长度时单位为：mm
         */
        @JsonProperty("min_pro")
        private Long minPro;

        /**
         * 价格。单位：分
         */
        @JsonProperty("price")
        private Long price;

        public void setMaxPro(Long maxPro) {
            this.maxPro = maxPro;
        }

        public void setMinPro(Long minPro) {
            this.minPro = minPro;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ServiceAreaListItem {

        /**
         * 市id，如果是全省选中，则市id为0
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 区id，如果是全省或全市选中，则区id为0
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 省id
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 溢价值：按分溢价时，输入价格分的数字，表示value分；按百分比溢价时，输入0-500之间的数字，表示0%——500%备注：买家自提服务类型时，不用传该字段
         */
        @JsonProperty("value")
        private Integer value;

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public void setDistrictId(Integer districtId) {
            this.districtId = districtId;
        }

        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}