package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddWaybillSearchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_waybill_search_response")
    private InnerPddWaybillSearchResponse pddWaybillSearchResponse;

    public InnerPddWaybillSearchResponse getPddWaybillSearchResponse() {
        return pddWaybillSearchResponse;
    }

    public static class InnerPddWaybillSearchResponse {

        /**
         * WP网点信息及对应的商家的发货信息
         */
        @JsonProperty("waybill_apply_subscription_cols")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItem> waybillApplySubscriptionCols;

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItem> getWaybillApplySubscriptionCols() {
            return waybillApplySubscriptionCols;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItem {

        /**
         * wp网点信息及对应的商家的发货信息
         */
        @JsonProperty("branch_account_cols")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItem> branchAccountCols;

        /**
         * 快递公司ID
         */
        @JsonProperty("wp_code")
        private String wpCode;

        /**
         * 物流服务商业务类型
         */
        @JsonProperty("wp_type")
        private Integer wpType;

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItem> getBranchAccountCols() {
            return branchAccountCols;
        }

        public String getWpCode() {
            return wpCode;
        }

        public Integer getWpType() {
            return wpType;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItem {

        /**
         * 已用面单数量
         */
        @JsonProperty("allocated_quantity")
        private Long allocatedQuantity;

        /**
         * 网点Code
         */
        @JsonProperty("branch_code")
        private String branchCode;

        /**
         * 网点名称
         */
        @JsonProperty("branch_name")
        private String branchName;

        /**
         * 取消的面单总数
         */
        @JsonProperty("cancel_quantity")
        private Long cancelQuantity;

        /**
         * 电子面单余额数量
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 已回收用面单数量
         */
        @JsonProperty("recycled_quantity")
        private Long recycledQuantity;

        /**
         * 服务类型列表
         */
        @JsonProperty("service_info_cols")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItem> serviceInfoCols;

        /**
         * 当前网点下的发货地址
         */
        @JsonProperty("shipp_address_cols")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemShippAddressColsItem> shippAddressCols;

        /**
         * 增值服务账号
         */
        @JsonProperty("vas_account_cols")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemVasAccountColsItem> vasAccountCols;

        public Long getAllocatedQuantity() {
            return allocatedQuantity;
        }

        public String getBranchCode() {
            return branchCode;
        }

        public String getBranchName() {
            return branchName;
        }

        public Long getCancelQuantity() {
            return cancelQuantity;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getRecycledQuantity() {
            return recycledQuantity;
        }

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItem> getServiceInfoCols() {
            return serviceInfoCols;
        }

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemShippAddressColsItem> getShippAddressCols() {
            return shippAddressCols;
        }

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemVasAccountColsItem> getVasAccountCols() {
            return vasAccountCols;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItem {

        /**
         * 是否必须
         */
        @JsonProperty("required")
        private Boolean required;

        /**
         * 服务属性类型列表
         */
        @JsonProperty("service_attributes")
        private List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItemServiceAttributesItem> serviceAttributes;

        /**
         * 服务code
         */
        @JsonProperty("service_code")
        private String serviceCode;

        /**
         * 服务描述
         */
        @JsonProperty("service_desc")
        private String serviceDesc;

        /**
         * 服务名称
         */
        @JsonProperty("service_name")
        private String serviceName;

        public Boolean getRequired() {
            return required;
        }

        public List<InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItemServiceAttributesItem> getServiceAttributes() {
            return serviceAttributes;
        }

        public String getServiceCode() {
            return serviceCode;
        }

        public String getServiceDesc() {
            return serviceDesc;
        }

        public String getServiceName() {
            return serviceName;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemServiceInfoColsItemServiceAttributesItem {

        /**
         * 属性code
         */
        @JsonProperty("attribute_code")
        private String attributeCode;

        /**
         * 属性名称
         */
        @JsonProperty("attribute_name")
        private String attributeName;

        /**
         * 属性类型
         */
        @JsonProperty("attribute_type")
        private String attributeType;

        /**
         * 属性描述
         */
        @JsonProperty("type_desc")
        private String typeDesc;

        public String getAttributeCode() {
            return attributeCode;
        }

        public String getAttributeName() {
            return attributeName;
        }

        public String getAttributeType() {
            return attributeType;
        }

        public String getTypeDesc() {
            return typeDesc;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemShippAddressColsItem {

        /**
         * 市名称（二级地址）
         */
        @JsonProperty("city")
        private String city;

        /**
         * 详细地址
         */
        @JsonProperty("detail")
        private String detail;

        /**
         * 区名称（三级地址）
         */
        @JsonProperty("district")
        private String district;

        /**
         * 省名称（一级地址）
         */
        @JsonProperty("province")
        private String province;

        /**
         * 国家/地区
         */
        @JsonProperty("country")
        private String country;

        public String getCity() {
            return city;
        }

        public String getDetail() {
            return detail;
        }

        public String getDistrict() {
            return district;
        }

        public String getProvince() {
            return province;
        }

        public String getCountry() {
            return country;
        }
    }

    public static class InnerPddWaybillSearchResponseWaybillApplySubscriptionColsItemBranchAccountColsItemVasAccountColsItem {

        /**
         * 账户类型描述
         */
        @JsonProperty("account_type_desc")
        private String accountTypeDesc;

        /**
         * 电子面单余额数量
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 已用面单数量
         */
        @JsonProperty("allocated_quantity")
        private Long allocatedQuantity;

        /**
         * 取消的面单总数
         */
        @JsonProperty("cancel_quantity")
        private Long cancelQuantity;

        /**
         * 已回收用面单数量
         */
        @JsonProperty("recycled_quantity")
        private Long recycledQuantity;

        public String getAccountTypeDesc() {
            return accountTypeDesc;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getAllocatedQuantity() {
            return allocatedQuantity;
        }

        public Long getCancelQuantity() {
            return cancelQuantity;
        }

        public Long getRecycledQuantity() {
            return recycledQuantity;
        }
    }
}