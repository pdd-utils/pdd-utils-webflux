package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddGoodsCatRuleGetResponse extends PopBaseHttpResponse {

    /**
     * 类目规则
     */
    @JsonProperty("cat_rule_get_response")
    private CatRuleGetResponse catRuleGetResponse;

    public CatRuleGetResponse getCatRuleGetResponse() {
        return catRuleGetResponse;
    }

    public static class CatRuleGetResponse {

        /**
         * 商品属性规则
         */
        @JsonProperty("goods_properties_rule")
        private CatRuleGetResponseGoodsPropertiesRule goodsPropertiesRule;

        /**
         * 商品服务规则
         */
        @JsonProperty("goods_service_rule")
        private CatRuleGetResponseGoodsServiceRule goodsServiceRule;

        /**
         * sku规则
         */
        @JsonProperty("goods_sku_rule")
        private CatRuleGetResponseGoodsSkuRule goodsSkuRule;

        /**
         * 标品规则
         */
        @JsonProperty("spu_rule")
        private CatRuleGetResponseSpuRule spuRule;

        /**
         * 满2件折扣相关规则
         */
        @JsonProperty("two_pieces_discount_rule")
        private CatRuleGetResponseTwoPiecesDiscountRule twoPiecesDiscountRule;

        public CatRuleGetResponseGoodsPropertiesRule getGoodsPropertiesRule() {
            return goodsPropertiesRule;
        }

        public CatRuleGetResponseGoodsServiceRule getGoodsServiceRule() {
            return goodsServiceRule;
        }

        public CatRuleGetResponseGoodsSkuRule getGoodsSkuRule() {
            return goodsSkuRule;
        }

        public CatRuleGetResponseSpuRule getSpuRule() {
            return spuRule;
        }

        public CatRuleGetResponseTwoPiecesDiscountRule getTwoPiecesDiscountRule() {
            return twoPiecesDiscountRule;
        }
    }

    public static class CatRuleGetResponseGoodsPropertiesRule {

        /**
         * 多个销售属性是否需要同时传
         */
        @JsonProperty("choose_all_qualify_spec")
        private Boolean chooseAllQualifySpec;

        /**
         * 允许自定义的销售属性数量
         */
        @JsonProperty("input_max_spec_num")
        private Long inputMaxSpecNum;

        /**
         * 属性信息
         */
        @JsonProperty("properties")
        private List<CatRuleGetResponseGoodsPropertiesRulePropertiesItem> properties;

        public Boolean getChooseAllQualifySpec() {
            return chooseAllQualifySpec;
        }

        public Long getInputMaxSpecNum() {
            return inputMaxSpecNum;
        }

        public List<CatRuleGetResponseGoodsPropertiesRulePropertiesItem> getProperties() {
            return properties;
        }
    }

    public static class CatRuleGetResponseGoodsPropertiesRulePropertiesItem {

        /**
         * 是否允许填写备注，仅当是销售属性时有意义
         */
        @JsonProperty("can_note")
        private Boolean canNote;

        /**
         * 可选择属性值数目，为0时代表不限。包括自定义的属性值和模版中给出的属性值。
         */
        @JsonProperty("choose_max_num")
        private Integer chooseMaxNum;

        /**
         * 可自定义属性值数目，为0时代表不可自定义。
         */
        @JsonProperty("input_max_num")
        private Integer inputMaxNum;

        /**
         * 是否重要属性。填写重要属性有更多机会获取搜索、活动等场景流量。
         */
        @JsonProperty("is_important")
        private Boolean isImportant;

        /**
         * 是否销售属性。销售属性需要在发商品时，商品属性上的属性值与规格中中的spec对应。
         */
        @JsonProperty("is_sale")
        private Boolean isSale;

        /**
         * 是否sku属性，sku维度的属性在商品发布时入参在sku对象下
         */
        @JsonProperty("is_sku")
        private Boolean isSku;

        /**
         * 最大值。在不同的属性值类型下有不同的含义。  文本类型时，代表文本最大长度；  数值类型时，代表数字最大值；  时间类型且最大值为时间时，代表时间最大值；  时间类型且最大值为数字时，代表距离今天或者本月往后的天数或月数。
         */
        @JsonProperty("max_value")
        private String maxValue;

        /**
         * 最小值。在不同的属性值类型下有不同的含义。  文本类型时，代表文本最小长度；  数值类型时，代表数字最小值；  时间类型且最小值为时间时，代表时间最小值；  时间类型且最小值为数字时，代表距离今天或者本月往前的天数或月数。
         */
        @JsonProperty("min_value")
        private String minValue;

        /**
         * 属性名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 销售属性对应的父规格id。
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 属性值类型。在发商品时传自定义的属性值时，有不同的格式。 0=文本; 1=数值，如“100”; 2=数值范围，如“10,20”，表示10到20之间; 3=数值乘积-二维，如“10,10”，表示1010; 4=数值乘积-三维，如“10,10,10”，表示101010; 5=单项时间选择-年月日，如“2020-05-20”; 6=双项时间选择-年月日，如“2020-05-20,2020-06-20”; 7=单项时间选择-年月，如“2020-05”; 8=双项时间选择-年月，如“2020-05,2020-06”。
         */
        @JsonProperty("property_value_type")
        private Integer propertyValueType;

        /**
         * 属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 是否必填
         */
        @JsonProperty("required")
        private Boolean required;

        /**
         * 必填规则具体内容，当required=true且required_rule_type=1时该字段有效，表示当出现哪些属性/属性值时，该属性需要必填，json格式，两层List结构，外层list代表"或"关系，内层list代表"且"关系，例如：[[{\"ref_pid\":123,\"vid\":123}]]
         */
        @JsonProperty("required_rule")
        private String requiredRule;

        /**
         * required=true时，该字段有效，为“0”时表示当前属性必填，不受其他属性影响，为“1”时表示当前属性是否必填由已填写的其他属性值决定
         */
        @JsonProperty("required_rule_type")
        private Integer requiredRuleType;

        /**
         * 该属性的父属性。只有parent_pid下的show_vids中的值被选择时才可入参该属性。有多组父属性时，为且的关系。
         */
        @JsonProperty("show_condition")
        private List<CatRuleGetResponseGoodsPropertiesRulePropertiesItemShowConditionItem> showCondition;

        /**
         * 小数点允许最大精度，为0时代表不允许输入小数。对数值类属性值限制。
         */
        @JsonProperty("value_precision")
        private Integer valuePrecision;

        /**
         * 可选属性值单位，发商品填写自定义数值属性值时，选择其中之一作为单位。
         */
        @JsonProperty("value_unit")
        private List<String> valueUnit;

        /**
         * 属性值列表
         */
        @JsonProperty("values")
        private List<CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItem> values;

        public Boolean getCanNote() {
            return canNote;
        }

        public Integer getChooseMaxNum() {
            return chooseMaxNum;
        }

        public Integer getInputMaxNum() {
            return inputMaxNum;
        }

        public Boolean getIsImportant() {
            return isImportant;
        }

        public Boolean getIsSale() {
            return isSale;
        }

        public Boolean getIsSku() {
            return isSku;
        }

        public String getMaxValue() {
            return maxValue;
        }

        public String getMinValue() {
            return minValue;
        }

        public String getName() {
            return name;
        }

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public Integer getPropertyValueType() {
            return propertyValueType;
        }

        public Long getRefPid() {
            return refPid;
        }

        public Boolean getRequired() {
            return required;
        }

        public String getRequiredRule() {
            return requiredRule;
        }

        public Integer getRequiredRuleType() {
            return requiredRuleType;
        }

        public List<CatRuleGetResponseGoodsPropertiesRulePropertiesItemShowConditionItem> getShowCondition() {
            return showCondition;
        }

        public Integer getValuePrecision() {
            return valuePrecision;
        }

        public List<String> getValueUnit() {
            return valueUnit;
        }

        public List<CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItem> getValues() {
            return values;
        }
    }

    public static class CatRuleGetResponseGoodsPropertiesRulePropertiesItemShowConditionItem {

        /**
         * 父属性id。
         */
        @JsonProperty("parent_ref_pid")
        private Long parentRefPid;

        /**
         * 父属性值id。多个值任选其一即可。若为空表示任意值都可以。
         */
        @JsonProperty("parent_vids")
        private List<Long> parentVids;

        public Long getParentRefPid() {
            return parentRefPid;
        }

        public List<Long> getParentVids() {
            return parentVids;
        }
    }

    public static class CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItem {

        /**
         * 扩展信息，表示颜色的色号。格式为ARGB
         */
        @JsonProperty("extend_info")
        private String extendInfo;

        /**
         * 分组信息
         */
        @JsonProperty("group")
        private CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItemGroup group;

        /**
         * 表示对应父属性值id。当其中父属性值被选中时该子属性值才可选。为空则表示无此限制。
         */
        @JsonProperty("parent_vids")
        private List<Long> parentVids;

        /**
         * 规格id，发商品时需要和sku上的spec对应。
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 基础属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public String getExtendInfo() {
            return extendInfo;
        }

        public CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItemGroup getGroup() {
            return group;
        }

        public List<Long> getParentVids() {
            return parentVids;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }

    public static class CatRuleGetResponseGoodsPropertiesRulePropertiesItemValuesItemGroup {

        /**
         * 组id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 组名称
         */
        @JsonProperty("name")
        private String name;

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class CatRuleGetResponseGoodsServiceRule {

        /**
         * 
         */
        @JsonProperty("goods_service_rule_map")
        private Map<String, CatRuleGetResponseGoodsServiceRuleGoodsServiceRuleMapValue> goodsServiceRuleMap;

        /**
         * 可选的商品类型列表
         */
        @JsonProperty("goods_type_list")
        private List<Integer> goodsTypeList;

        public Map<String, CatRuleGetResponseGoodsServiceRuleGoodsServiceRuleMapValue> getGoodsServiceRuleMap() {
            return goodsServiceRuleMap;
        }

        public List<Integer> getGoodsTypeList() {
            return goodsTypeList;
        }
    }

    public static class CatRuleGetResponseGoodsServiceRuleGoodsServiceRuleMapValue {

        /**
         * 坏了包赔规则：0不可选、1可选、2必选
         */
        @JsonProperty("bad_claim_rule")
        private Integer badClaimRule;

        /**
         * 是否可以选择物流方式
         */
        @JsonProperty("can_select_delivery_type")
        private Boolean canSelectDeliveryType;

        /**
         * 当日发货规则：0不可选、1可选
         */
        @JsonProperty("delivery_one_day_rule")
        private Integer deliveryOneDayRule;

        /**
         * 假一赔十规则：0不可选、1可选、2必选
         */
        @JsonProperty("folt_rule")
        private Integer foltRule;

        /**
         * 缺重包退规则：0不可选、1可选、2必选
         */
        @JsonProperty("lack_of_weight_claim_rule")
        private Integer lackOfWeightClaimRule;

        /**
         * 全国联保规则：0不可选、1可选
         */
        @JsonProperty("quan_guo_lian_bao_rule")
        private Integer quanGuoLianBaoRule;

        /**
         * 7天无理由退换货规则：0不可选、1可选、2必选
         */
        @JsonProperty("refundable_rule")
        private Integer refundableRule;

        /**
         * 可选承诺发货时间列表，单位：秒
         */
        @JsonProperty("shipment_limit_second_list")
        private List<Integer> shipmentLimitSecondList;

        /**
         * 只换不修规则：0不可选、1可选
         */
        @JsonProperty("zhi_huan_bu_xiu_rule")
        private Integer zhiHuanBuXiuRule;

        /**
         * 保密发货：0不可选、1可选
         */
        @JsonProperty("privacy_delivery_rule")
        private Integer privacyDeliveryRule;

        public Integer getBadClaimRule() {
            return badClaimRule;
        }

        public Boolean getCanSelectDeliveryType() {
            return canSelectDeliveryType;
        }

        public Integer getDeliveryOneDayRule() {
            return deliveryOneDayRule;
        }

        public Integer getFoltRule() {
            return foltRule;
        }

        public Integer getLackOfWeightClaimRule() {
            return lackOfWeightClaimRule;
        }

        public Integer getQuanGuoLianBaoRule() {
            return quanGuoLianBaoRule;
        }

        public Integer getRefundableRule() {
            return refundableRule;
        }

        public List<Integer> getShipmentLimitSecondList() {
            return shipmentLimitSecondList;
        }

        public Integer getZhiHuanBuXiuRule() {
            return zhiHuanBuXiuRule;
        }

        public Integer getPrivacyDeliveryRule() {
            return privacyDeliveryRule;
        }
    }

    public static class CatRuleGetResponseGoodsSkuRule {

        /**
         * 团购价最高差倍率
         */
        @JsonProperty("price_range_ratio")
        private Double priceRangeRatio;

        /**
         * 同个商品下规格值的加和数量上限
         */
        @JsonProperty("spec_num_limit")
        private Integer specNumLimit;

        public Double getPriceRangeRatio() {
            return priceRangeRatio;
        }

        public Integer getSpecNumLimit() {
            return specNumLimit;
        }
    }

    public static class CatRuleGetResponseSpuRule {

        /**
         * 标品管控类型。0=不管控；1=管控，表示商品发布时必须命中标品，且发布成功后不可更改关键属性；2=不可换品，表示发布成功后不可更改关键属性。
         */
        @JsonProperty("control_type")
        private Integer controlType;

        /**
         * 关键属性
         */
        @JsonProperty("key_prop")
        private List<CatRuleGetResponseSpuRuleKeyPropItem> keyProp;

        public Integer getControlType() {
            return controlType;
        }

        public List<CatRuleGetResponseSpuRuleKeyPropItem> getKeyProp() {
            return keyProp;
        }
    }

    public static class CatRuleGetResponseSpuRuleKeyPropItem {

        /**
         * 关键属性名
         */
        @JsonProperty("pname")
        private String pname;

        /**
         * 关键属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        public String getPname() {
            return pname;
        }

        public Long getRefPid() {
            return refPid;
        }
    }

    public static class CatRuleGetResponseTwoPiecesDiscountRule {

        /**
         * 是否必须设置
         */
        @JsonProperty("if_must_two_pieces_discount")
        private Boolean ifMustTwoPiecesDiscount;

        /**
         * 允许的最大折扣
         */
        @JsonProperty("max_two_pieces_discount")
        private Integer maxTwoPiecesDiscount;

        /**
         * 允许的最小折扣
         */
        @JsonProperty("min_two_pieces_discount")
        private Integer minTwoPiecesDiscount;

        /**
         * 推荐的折扣
         */
        @JsonProperty("recommend_two_pieces_discount")
        private Integer recommendTwoPiecesDiscount;

        public Boolean getIfMustTwoPiecesDiscount() {
            return ifMustTwoPiecesDiscount;
        }

        public Integer getMaxTwoPiecesDiscount() {
            return maxTwoPiecesDiscount;
        }

        public Integer getMinTwoPiecesDiscount() {
            return minTwoPiecesDiscount;
        }

        public Integer getRecommendTwoPiecesDiscount() {
            return recommendTwoPiecesDiscount;
        }
    }
}