package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudRefundAddressListGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("refund_address_list_get_response")
    private RefundAddressListGetResponse refundAddressListGetResponse;

    public RefundAddressListGetResponse getRefundAddressListGetResponse() {
        return refundAddressListGetResponse;
    }

    public static class RefundAddressListGetResponse {

        /**
         * 退货地址列表
         */
        @JsonProperty("refund_address_list")
        private List<RefundAddressListGetResponseRefundAddressListItem> refundAddressList;

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 子错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        public List<RefundAddressListGetResponseRefundAddressListItem> getRefundAddressList() {
            return refundAddressList;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }
    }

    public static class RefundAddressListGetResponseRefundAddressListItem {

        /**
         * 退货地址所在城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 退货地址所在城市名字
         */
        @JsonProperty("city_name")
        private String cityName;

        /**
         * 退货地址所在区ID
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 退货地址所在区名字
         */
        @JsonProperty("district_name")
        private String districtName;

        /**
         * 退货地址ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 是否为默认退货地址
         */
        @JsonProperty("is_default")
        private String isDefault;

        /**
         * 退货地址是否合法
         */
        @JsonProperty("is_legal")
        private Boolean isLegal;

        /**
         * 退货地址是否有效
         */
        @JsonProperty("is_validated")
        private Boolean isValidated;

        /**
         * 店铺ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 退货地址所在省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 退货地址所在省份名字
         */
        @JsonProperty("province_name")
        private String provinceName;

        /**
         * 退货地址
         */
        @JsonProperty("refund_address")
        private String refundAddress;

        /**
         * refund_id
         */
        @JsonProperty("refund_address_id")
        private String refundAddressId;

        /**
         * 退货收件人名字
         */
        @JsonProperty("refund_name")
        private String refundName;

        /**
         * 退货收件人手机号
         */
        @JsonProperty("refund_phone")
        private String refundPhone;

        /**
         * 退货收件人固定电话
         */
        @JsonProperty("refund_tel")
        private String refundTel;

        public Integer getCityId() {
            return cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public Integer getDistrictId() {
            return districtId;
        }

        public String getDistrictName() {
            return districtName;
        }

        public Long getId() {
            return id;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public Boolean getIsLegal() {
            return isLegal;
        }

        public Boolean getIsValidated() {
            return isValidated;
        }

        public Long getMallId() {
            return mallId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public String getRefundAddress() {
            return refundAddress;
        }

        public String getRefundAddressId() {
            return refundAddressId;
        }

        public String getRefundName() {
            return refundName;
        }

        public String getRefundPhone() {
            return refundPhone;
        }

        public String getRefundTel() {
            return refundTel;
        }
    }
}