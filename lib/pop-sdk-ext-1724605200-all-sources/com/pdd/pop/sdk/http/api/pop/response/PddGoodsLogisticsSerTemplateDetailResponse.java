package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsLogisticsSerTemplateDetailResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_ser_template_detail_response")
    private GoodsLogisticsSerTemplateDetailResponse goodsLogisticsSerTemplateDetailResponse;

    public GoodsLogisticsSerTemplateDetailResponse getGoodsLogisticsSerTemplateDetailResponse() {
        return goodsLogisticsSerTemplateDetailResponse;
    }

    public static class GoodsLogisticsSerTemplateDetailResponse {

        /**
         * 分类目基础价格配置
         */
        @JsonProperty("cat_list")
        private List<GoodsLogisticsSerTemplateDetailResponseCatListItem> catList;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 分地区配置溢价时使用的计价单位：0：价格分，按价格分计算费用；1：百分比，按照基础价格乘以百分比计算费用，除了"买家自提"服务，其他服务类型必传
         */
        @JsonProperty("price_unit")
        private Integer priceUnit;

        /**
         * 服务地区范围配置
         */
        @JsonProperty("service_area_list")
        private List<GoodsLogisticsSerTemplateDetailResponseServiceAreaListItem> serviceAreaList;

        /**
         * 模版id
         */
        @JsonProperty("template_id")
        private String templateId;

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

        public List<GoodsLogisticsSerTemplateDetailResponseCatListItem> getCatList() {
            return catList;
        }

        public Long getMallId() {
            return mallId;
        }

        public Integer getPriceUnit() {
            return priceUnit;
        }

        public List<GoodsLogisticsSerTemplateDetailResponseServiceAreaListItem> getServiceAreaList() {
            return serviceAreaList;
        }

        public String getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public Integer getTemplateType() {
            return templateType;
        }
    }

    public static class GoodsLogisticsSerTemplateDetailResponseCatListItem {

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
         * 三级类目名称
         */
        @JsonProperty("cat_name3")
        private String catName3;

        /**
         * 四级类目名称
         */
        @JsonProperty("cat_name4")
        private String catName4;

        /**
         * 类目规则配置
         */
        @JsonProperty("list")
        private List<GoodsLogisticsSerTemplateDetailResponseCatListItemListItem> list;

        public Long getCatId3() {
            return catId3;
        }

        public Long getCatId4() {
            return catId4;
        }

        public String getCatName3() {
            return catName3;
        }

        public String getCatName4() {
            return catName4;
        }

        public List<GoodsLogisticsSerTemplateDetailResponseCatListItemListItem> getList() {
            return list;
        }
    }

    public static class GoodsLogisticsSerTemplateDetailResponseCatListItemListItem {

        /**
         * 按属性收取费用时配置的内容：按属性限价时设置；按件限价时不用传，value和content必须设置一个
         */
        @JsonProperty("content")
        private List<GoodsLogisticsSerTemplateDetailResponseCatListItemListItemContentItem> content;

        /**
         * 分类目收取服务费用方式：1-按件收取费用，2-按属性收取费用
         */
        @JsonProperty("limit_type")
        private Long limitType;

        /**
         * mms商品编辑页的展示字段
         */
        @JsonProperty("mms_view")
        private String mmsView;

        /**
         * 按件收取费用时配置的内容：按件限价时输入数字，表示每件商品附加费用$value分；按属性限价时不用传value和content必须设置一个
         */
        @JsonProperty("value")
        private Long value;

        public List<GoodsLogisticsSerTemplateDetailResponseCatListItemListItemContentItem> getContent() {
            return content;
        }

        public Long getLimitType() {
            return limitType;
        }

        public String getMmsView() {
            return mmsView;
        }

        public Long getValue() {
            return value;
        }
    }

    public static class GoodsLogisticsSerTemplateDetailResponseCatListItemListItemContentItem {

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

        public Long getMaxPro() {
            return maxPro;
        }

        public Long getMinPro() {
            return minPro;
        }

        public Long getPrice() {
            return price;
        }
    }

    public static class GoodsLogisticsSerTemplateDetailResponseServiceAreaListItem {

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

        public Integer getCityId() {
            return cityId;
        }

        public Integer getDistrictId() {
            return districtId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public Integer getValue() {
            return value;
        }
    }
}