package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCatTemplateGetResponse extends PopBaseHttpResponse {

    /**
     * 属性信息
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    public static class OpenApiResponse {

        /**
         * 限定规格不支持部分选取，为true时限定规格要么全选要么全不选
         */
        @JsonProperty("choose_all_qualify_spec")
        private Boolean chooseAllQualifySpec;

        /**
         * 模板id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 模板允许的最大的自定义规格数量
         */
        @JsonProperty("input_max_spec_num")
        private Long inputMaxSpecNum;

        /**
         * is_single_item
         */
        @JsonProperty("is_single_item")
        private Boolean isSingleItem;

        /**
         * 最大sku数目上限
         */
        @JsonProperty("max_sku_num")
        private Long maxSkuNum;

        /**
         * 属性信息
         */
        @JsonProperty("properties")
        private List<OpenApiResponsePropertiesItem> properties;

        /**
         * 单个自定义规格值上限
         */
        @JsonProperty("single_spec_value_num")
        private Long singleSpecValueNum;

        public Boolean getChooseAllQualifySpec() {
            return chooseAllQualifySpec;
        }

        public Long getId() {
            return id;
        }

        public Long getInputMaxSpecNum() {
            return inputMaxSpecNum;
        }

        public Boolean getIsSingleItem() {
            return isSingleItem;
        }

        public Long getMaxSkuNum() {
            return maxSkuNum;
        }

        public List<OpenApiResponsePropertiesItem> getProperties() {
            return properties;
        }

        public Long getSingleSpecValueNum() {
            return singleSpecValueNum;
        }
    }

    public static class OpenApiResponsePropertiesItem {

        /**
         * 是否允许填写备注
         */
        @JsonProperty("can_note")
        private Boolean canNote;

        /**
         * 最大可勾选数目,为0时代表不限
         */
        @JsonProperty("choose_max_num")
        private Integer chooseMaxNum;

        /**
         * 控件类型（0-可输入、1-可勾选、3-可输入又可勾选、5-单项时间选择器-年月日、6-双项时间选择器-年月日、7-单项时间选择器-年月、8-双项时间选择器-年月）9-调色盘、10-尺码选择器、11-输入数值范围、12-输入数值乘积-2维、13-输入数值乘积-3维
         */
        @JsonProperty("control_type")
        private Integer controlType;

        /**
         * 属性特性:0普通，1颜色，2尺码
         */
        @JsonProperty("feature")
        private Integer feature;

        /**
         * 模板属性id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 最大可输入数目,为0时代表不可输入，非销售属性为null
         */
        @JsonProperty("input_max_num")
        private Integer inputMaxNum;

        /**
         * 是否按条件展示
         */
        @JsonProperty("is_condition_show")
        private Boolean isConditionShow;

        /**
         * is_key
         */
        @JsonProperty("is_key")
        private Boolean isKey;

        /**
         * 是否父属性
         */
        @JsonProperty("is_parent")
        private Boolean isParent;

        /**
         * 是否销售属性
         */
        @JsonProperty("is_sale")
        private Boolean isSale;

        /**
         * 输入最大值：文本类型代表文本最长长度、 数值类型代表数字最大值、时间类型代表时间最大值
         */
        @JsonProperty("max_value")
        private String maxValue;

        /**
         * 输入最小值：文本类型代表文本最小长度、数值类型代表数字最小值、时间类型代表时间最小值
         */
        @JsonProperty("min_value")
        private String minValue;

        /**
         * 属性名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性别名
         */
        @JsonProperty("name_alias")
        private String nameAlias;

        /**
         * 父属性id
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 引用属性id
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
         * show_only_standard
         */
        @JsonProperty("show_only_standard")
        private Boolean showOnlyStandard;

        /**
         * 若属性按条件展示,则只有show_vids中的值被选择时属性才可使用
         */
        @JsonProperty("show_vids")
        private List<Long> showVids;

        /**
         * 销售属性规格id，非销售属性为null
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 属性值列表
         */
        @JsonProperty("values")
        private List<OpenApiResponsePropertiesItemValuesItem> values;

        /**
         * 小数点允许最大精度,为0时代表不允许输入小数
         */
        @JsonProperty("value_precision")
        private Integer valuePrecision;

        /**
         * 属性值类型（0-文本、1-数值、4-绝对时间、5-相对时间）
         */
        @JsonProperty("value_type")
        private Integer valueType;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        public Boolean getCanNote() {
            return canNote;
        }

        public Integer getChooseMaxNum() {
            return chooseMaxNum;
        }

        public Integer getControlType() {
            return controlType;
        }

        public Integer getFeature() {
            return feature;
        }

        public Long getId() {
            return id;
        }

        public Integer getInputMaxNum() {
            return inputMaxNum;
        }

        public Boolean getIsConditionShow() {
            return isConditionShow;
        }

        public Boolean getIsKey() {
            return isKey;
        }

        public Boolean getIsParent() {
            return isParent;
        }

        public Boolean getIsSale() {
            return isSale;
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

        public String getNameAlias() {
            return nameAlias;
        }

        public Long getParentId() {
            return parentId;
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

        public Boolean getShowOnlyStandard() {
            return showOnlyStandard;
        }

        public List<Long> getShowVids() {
            return showVids;
        }

        public Long getSpecId() {
            return specId;
        }

        public List<OpenApiResponsePropertiesItemValuesItem> getValues() {
            return values;
        }

        public Integer getValuePrecision() {
            return valuePrecision;
        }

        public Integer getValueType() {
            return valueType;
        }

        public String getValueUnit() {
            return valueUnit;
        }
    }

    public static class OpenApiResponsePropertiesItemValuesItem {

        /**
         * 扩展信息，颜色的话色号在这里,ARGB，非销售属性为null
         */
        @JsonProperty("extend_info")
        private String extendInfo;

        /**
         * 分组信息，非销售属性为null
         */
        @JsonProperty("group")
        private OpenApiResponsePropertiesItemValuesItemGroup group;

        /**
         * 是否父属性值
         */
        @JsonProperty("is_parent")
        private Boolean isParent;

        /**
         * 对应的父属性值id
         */
        @JsonProperty("parent_vids")
        private List<Long> parentVids;

        /**
         * 规格id,非销售属性为null
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

        public OpenApiResponsePropertiesItemValuesItemGroup getGroup() {
            return group;
        }

        public Boolean getIsParent() {
            return isParent;
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

    public static class OpenApiResponsePropertiesItemValuesItemGroup {

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
}