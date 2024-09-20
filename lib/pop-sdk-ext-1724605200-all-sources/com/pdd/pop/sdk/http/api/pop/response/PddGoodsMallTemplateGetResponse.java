package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsMallTemplateGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_template_get_response")
    private MallTemplateGetResponse mallTemplateGetResponse;

    /**
     * 
     */
    @JsonProperty("success")
    private Boolean success;

    public MallTemplateGetResponse getMallTemplateGetResponse() {
        return mallTemplateGetResponse;
    }

    public Boolean getSuccess() {
        return success;
    }

    public static class MallTemplateGetResponse {

        /**
         * 
         */
        @JsonProperty("cat_id")
        private Integer catId;

        /**
         * 
         */
        @JsonProperty("cat_name")
        private String catName;

        /**
         * 
         */
        @JsonProperty("choose_all_qualify_spec")
        private Boolean chooseAllQualifySpec;

        /**
         * 
         */
        @JsonProperty("created_at")
        private Integer createdAt;

        /**
         * 
         */
        @JsonProperty("creator_name")
        private String creatorName;

        /**
         * 
         */
        @JsonProperty("dark_launch_rule")
        private String darkLaunchRule;

        /**
         * 
         */
        @JsonProperty("dark_launch_type")
        private Integer darkLaunchType;

        /**
         * 
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 
         */
        @JsonProperty("input_max_spec_num")
        private Integer inputMaxSpecNum;

        /**
         * 
         */
        @JsonProperty("is_single_item")
        private Boolean isSingleItem;

        /**
         * 
         */
        @JsonProperty("modules")
        private List<MallTemplateGetResponseModulesItem> modules;

        /**
         * 
         */
        @JsonProperty("name")
        private String name;

        /**
         * 
         */
        @JsonProperty("single_spec_value_num")
        private Integer singleSpecValueNum;

        /**
         * 
         */
        @JsonProperty("sort_order")
        private Integer sortOrder;

        /**
         * 
         */
        @JsonProperty("source_template_id")
        private Integer sourceTemplateId;

        /**
         * 
         */
        @JsonProperty("spec")
        private Boolean spec;

        /**
         * 
         */
        @JsonProperty("spec_tip")
        private String specTip;

        /**
         * 
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 
         */
        @JsonProperty("updated_at")
        private Integer updatedAt;

        public Integer getCatId() {
            return catId;
        }

        public String getCatName() {
            return catName;
        }

        public Boolean getChooseAllQualifySpec() {
            return chooseAllQualifySpec;
        }

        public Integer getCreatedAt() {
            return createdAt;
        }

        public String getCreatorName() {
            return creatorName;
        }

        public String getDarkLaunchRule() {
            return darkLaunchRule;
        }

        public Integer getDarkLaunchType() {
            return darkLaunchType;
        }

        public Integer getId() {
            return id;
        }

        public Integer getInputMaxSpecNum() {
            return inputMaxSpecNum;
        }

        public Boolean getIsSingleItem() {
            return isSingleItem;
        }

        public List<MallTemplateGetResponseModulesItem> getModules() {
            return modules;
        }

        public String getName() {
            return name;
        }

        public Integer getSingleSpecValueNum() {
            return singleSpecValueNum;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public Integer getSourceTemplateId() {
            return sourceTemplateId;
        }

        public Boolean getSpec() {
            return spec;
        }

        public String getSpecTip() {
            return specTip;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class MallTemplateGetResponseModulesItem {

        /**
         * 
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 
         */
        @JsonProperty("module_id")
        private Integer moduleId;

        /**
         * 
         */
        @JsonProperty("name")
        private String name;

        /**
         * 
         */
        @JsonProperty("propertys")
        private List<MallTemplateGetResponseModulesItemPropertysItem> propertys;

        /**
         * 
         */
        @JsonProperty("sort_order")
        private Integer sortOrder;

        /**
         * 
         */
        @JsonProperty("status")
        private Integer status;

        public Integer getId() {
            return id;
        }

        public Integer getModuleId() {
            return moduleId;
        }

        public String getName() {
            return name;
        }

        public List<MallTemplateGetResponseModulesItemPropertysItem> getPropertys() {
            return propertys;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public Integer getStatus() {
            return status;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItem {

        /**
         * 
         */
        @JsonProperty("bottom_tip")
        private String bottomTip;

        /**
         * 
         */
        @JsonProperty("choose_max_num")
        private Integer chooseMaxNum;

        /**
         * 
         */
        @JsonProperty("control_type")
        private Integer controlType;

        /**
         * 
         */
        @JsonProperty("goods_properties")
        private List<MallTemplateGetResponseModulesItemPropertysItemGoodsPropertiesItem> goodsProperties;

        /**
         * 
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 
         */
        @JsonProperty("input_type")
        private Integer inputType;

        /**
         * 
         */
        @JsonProperty("is_important")
        private Boolean isImportant;

        /**
         * 
         */
        @JsonProperty("is_key")
        private Boolean isKey;

        /**
         * 
         */
        @JsonProperty("max_value")
        private String maxValue;

        /**
         * 
         */
        @JsonProperty("min_value")
        private String minValue;

        /**
         * 
         */
        @JsonProperty("name")
        private String name;

        /**
         * 
         */
        @JsonProperty("name_alias")
        private String nameAlias;

        /**
         * 
         */
        @JsonProperty("parent_pid")
        private Integer parentPid;

        /**
         * 
         */
        @JsonProperty("parent_template_pid")
        private Integer parentTemplatePid;

        /**
         * 
         */
        @JsonProperty("pid")
        private Integer pid;

        /**
         * 
         */
        @JsonProperty("ref_pid")
        private Integer refPid;

        /**
         * 
         */
        @JsonProperty("required")
        private Boolean required;

        /**
         * 
         */
        @JsonProperty("show_type")
        private Integer showType;

        /**
         * 
         */
        @JsonProperty("show_values")
        private List<MallTemplateGetResponseModulesItemPropertysItemShowValuesItem> showValues;

        /**
         * 
         */
        @JsonProperty("sort_order")
        private Integer sortOrder;

        /**
         * 
         */
        @JsonProperty("spec_id")
        private Integer specId;

        /**
         * 
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 
         */
        @JsonProperty("top_tip")
        private String topTip;

        /**
         * 
         */
        @JsonProperty("values")
        private MallTemplateGetResponseModulesItemPropertysItemValues values;

        /**
         * 
         */
        @JsonProperty("value_can_sort")
        private Boolean valueCanSort;

        /**
         * 
         */
        @JsonProperty("value_format")
        private Integer valueFormat;

        /**
         * 
         */
        @JsonProperty("value_precision")
        private Integer valuePrecision;

        /**
         * 
         */
        @JsonProperty("value_source")
        private Integer valueSource;

        /**
         * 
         */
        @JsonProperty("value_type")
        private Integer valueType;

        /**
         * 
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        public String getBottomTip() {
            return bottomTip;
        }

        public Integer getChooseMaxNum() {
            return chooseMaxNum;
        }

        public Integer getControlType() {
            return controlType;
        }

        public List<MallTemplateGetResponseModulesItemPropertysItemGoodsPropertiesItem> getGoodsProperties() {
            return goodsProperties;
        }

        public Integer getId() {
            return id;
        }

        public Integer getInputType() {
            return inputType;
        }

        public Boolean getIsImportant() {
            return isImportant;
        }

        public Boolean getIsKey() {
            return isKey;
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

        public Integer getParentPid() {
            return parentPid;
        }

        public Integer getParentTemplatePid() {
            return parentTemplatePid;
        }

        public Integer getPid() {
            return pid;
        }

        public Integer getRefPid() {
            return refPid;
        }

        public Boolean getRequired() {
            return required;
        }

        public Integer getShowType() {
            return showType;
        }

        public List<MallTemplateGetResponseModulesItemPropertysItemShowValuesItem> getShowValues() {
            return showValues;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public Integer getSpecId() {
            return specId;
        }

        public Integer getStatus() {
            return status;
        }

        public String getTopTip() {
            return topTip;
        }

        public MallTemplateGetResponseModulesItemPropertysItemValues getValues() {
            return values;
        }

        public Boolean getValueCanSort() {
            return valueCanSort;
        }

        public Integer getValueFormat() {
            return valueFormat;
        }

        public Integer getValuePrecision() {
            return valuePrecision;
        }

        public Integer getValueSource() {
            return valueSource;
        }

        public Integer getValueType() {
            return valueType;
        }

        public String getValueUnit() {
            return valueUnit;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItemGoodsPropertiesItem {

        /**
         * 
         */
        @JsonProperty("goods_id")
        private Integer goodsId;

        /**
         * 
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 
         */
        @JsonProperty("note")
        private String note;

        /**
         * 
         */
        @JsonProperty("parent_spec_id")
        private Integer parentSpecId;

        /**
         * 
         */
        @JsonProperty("parent_spec_name")
        private String parentSpecName;

        /**
         * 
         */
        @JsonProperty("pid")
        private Integer pid;

        /**
         * 
         */
        @JsonProperty("p_name")
        private String pName;

        /**
         * 
         */
        @JsonProperty("p_unit")
        private String pUnit;

        /**
         * 
         */
        @JsonProperty("reference_id")
        private Integer referenceId;

        /**
         * 
         */
        @JsonProperty("reference_type")
        private Integer referenceType;

        /**
         * 
         */
        @JsonProperty("ref_pid")
        private Integer refPid;

        /**
         * 
         */
        @JsonProperty("sort_order")
        private Integer sortOrder;

        /**
         * 
         */
        @JsonProperty("spec_id")
        private Integer specId;

        /**
         * 
         */
        @JsonProperty("standard_unit")
        private Integer standardUnit;

        /**
         * 
         */
        @JsonProperty("standard_value")
        private Integer standardValue;

        /**
         * 
         */
        @JsonProperty("template_module_id")
        private Integer templateModuleId;

        /**
         * 
         */
        @JsonProperty("template_module_name")
        private String templateModuleName;

        /**
         * 
         */
        @JsonProperty("template_pid")
        private Integer templatePid;

        /**
         * 
         */
        @JsonProperty("type")
        private Boolean type;

        /**
         * 
         */
        @JsonProperty("updated_at")
        private Integer updatedAt;

        /**
         * 
         */
        @JsonProperty("vid")
        private Integer vid;

        /**
         * 
         */
        @JsonProperty("v_value")
        private String vValue;

        public Integer getGoodsId() {
            return goodsId;
        }

        public Integer getGroupId() {
            return groupId;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public String getNote() {
            return note;
        }

        public Integer getParentSpecId() {
            return parentSpecId;
        }

        public String getParentSpecName() {
            return parentSpecName;
        }

        public Integer getPid() {
            return pid;
        }

        public String getPName() {
            return pName;
        }

        public String getPUnit() {
            return pUnit;
        }

        public Integer getReferenceId() {
            return referenceId;
        }

        public Integer getReferenceType() {
            return referenceType;
        }

        public Integer getRefPid() {
            return refPid;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public Integer getSpecId() {
            return specId;
        }

        public Integer getStandardUnit() {
            return standardUnit;
        }

        public Integer getStandardValue() {
            return standardValue;
        }

        public Integer getTemplateModuleId() {
            return templateModuleId;
        }

        public String getTemplateModuleName() {
            return templateModuleName;
        }

        public Integer getTemplatePid() {
            return templatePid;
        }

        public Boolean getType() {
            return type;
        }

        public Integer getUpdatedAt() {
            return updatedAt;
        }

        public Integer getVid() {
            return vid;
        }

        public String getVValue() {
            return vValue;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItemShowValuesItem {

        /**
         * 
         */
        @JsonProperty("vid")
        private Integer vid;

        public Integer getVid() {
            return vid;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItemValues {

        /**
         * 
         */
        @JsonProperty("content")
        private List<MallTemplateGetResponseModulesItemPropertysItemValuesContentItem> content;

        /**
         * 
         */
        @JsonProperty("first_page")
        private Boolean firstPage;

        /**
         * 
         */
        @JsonProperty("last_page")
        private Boolean lastPage;

        /**
         * 
         */
        @JsonProperty("number")
        private Integer number;

        /**
         * 
         */
        @JsonProperty("pageable")
        private MallTemplateGetResponseModulesItemPropertysItemValuesPageable pageable;

        /**
         * 
         */
        @JsonProperty("size")
        private Integer size;

        /**
         * 
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 
         */
        @JsonProperty("total_pages")
        private Integer totalPages;

        public List<MallTemplateGetResponseModulesItemPropertysItemValuesContentItem> getContent() {
            return content;
        }

        public Boolean getFirstPage() {
            return firstPage;
        }

        public Boolean getLastPage() {
            return lastPage;
        }

        public Integer getNumber() {
            return number;
        }

        public MallTemplateGetResponseModulesItemPropertysItemValuesPageable getPageable() {
            return pageable;
        }

        public Integer getSize() {
            return size;
        }

        public Integer getTotal() {
            return total;
        }

        public Integer getTotalPages() {
            return totalPages;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItemValuesContentItem {

        /**
         * 
         */
        @JsonProperty("extend_info")
        private String extendInfo;

        /**
         * 
         */
        @JsonProperty("group")
        private MallTemplateGetResponseModulesItemPropertysItemValuesContentItemGroup group;

        /**
         * 
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 
         */
        @JsonProperty("p_unit")
        private String pUnit;

        /**
         * 
         */
        @JsonProperty("spec_id")
        private Integer specId;

        /**
         * 
         */
        @JsonProperty("value")
        private String value;

        /**
         * 
         */
        @JsonProperty("vid")
        private Integer vid;

        public String getExtendInfo() {
            return extendInfo;
        }

        public MallTemplateGetResponseModulesItemPropertysItemValuesContentItemGroup getGroup() {
            return group;
        }

        public Integer getId() {
            return id;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public String getPUnit() {
            return pUnit;
        }

        public Integer getSpecId() {
            return specId;
        }

        public String getValue() {
            return value;
        }

        public Integer getVid() {
            return vid;
        }
    }

    public static class MallTemplateGetResponseModulesItemPropertysItemValuesContentItemGroup {

        /**
         * 
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 
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

    public static class MallTemplateGetResponseModulesItemPropertysItemValuesPageable {

        /**
         * 
         */
        @JsonProperty("offset")
        private Integer offset;

        /**
         * 
         */
        @JsonProperty("page_number")
        private Integer pageNumber;

        /**
         * 
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        public Integer getOffset() {
            return offset;
        }

        public Integer getPageNumber() {
            return pageNumber;
        }

        public Integer getPageSize() {
            return pageSize;
        }
    }
}