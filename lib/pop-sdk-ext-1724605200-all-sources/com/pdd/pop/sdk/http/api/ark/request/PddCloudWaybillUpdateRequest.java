package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudWaybillUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudWaybillUpdateRequest extends PopBaseHttpRequest<PddCloudWaybillUpdateResponse> {

    /**
     * 订单面单更新接口
     */
    @JsonProperty("waybill_cloud_print_update_request")
    private WaybillCloudPrintUpdateRequest waybillCloudPrintUpdateRequest;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.waybill.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudWaybillUpdateResponse> getResponseClass() {
        return PddCloudWaybillUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "waybill_cloud_print_update_request", waybillCloudPrintUpdateRequest);
    }

    public void setWaybillCloudPrintUpdateRequest(WaybillCloudPrintUpdateRequest waybillCloudPrintUpdateRequest) {
        this.waybillCloudPrintUpdateRequest = waybillCloudPrintUpdateRequest;
    }

    public static class WaybillCloudPrintUpdateRequest {

        /**
         * 扩展字段
         */
        @JsonProperty("ext_fields")
        private String extFields;

        /**
         * 扩展字段
         */
        @JsonProperty("ext_id")
        private Long extId;

        /**
         * 店铺ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 请求表示id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 包裹信息
         */
        @JsonProperty("package_info")
        private WaybillCloudPrintUpdateRequestPackageInfo packageInfo;

        /**
         * 收件信息
         */
        @JsonProperty("recipient")
        private WaybillCloudPrintUpdateRequestRecipient recipient;

        /**
         * 发件信息
         */
        @JsonProperty("sender")
        private WaybillCloudPrintUpdateRequestSender sender;

        /**
         * 模板URL
         */
        @JsonProperty("template_url")
        private String templateUrl;

        /**
         * 第三方token
         */
        @JsonProperty("token")
        private String token;

        /**
         * 面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        /**
         * 物流公司CODE
         */
        @JsonProperty("wp_code")
        private String wpCode;

        public void setExtFields(String extFields) {
            this.extFields = extFields;
        }

        public void setExtId(Long extId) {
            this.extId = extId;
        }

        public void setMallId(Long mallId) {
            this.mallId = mallId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setPackageInfo(WaybillCloudPrintUpdateRequestPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
        }

        public void setRecipient(WaybillCloudPrintUpdateRequestRecipient recipient) {
            this.recipient = recipient;
        }

        public void setSender(WaybillCloudPrintUpdateRequestSender sender) {
            this.sender = sender;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public void setWaybillCode(String waybillCode) {
            this.waybillCode = waybillCode;
        }

        public void setWpCode(String wpCode) {
            this.wpCode = wpCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WaybillCloudPrintUpdateRequestPackageInfo {

        /**
         * 商品
         */
        @JsonProperty("items")
        private List<WaybillCloudPrintUpdateRequestPackageInfoItemsItem> items;

        /**
         * 体积
         */
        @JsonProperty("volume")
        private Long volume;

        /**
         * 重量
         */
        @JsonProperty("weight")
        private Long weight;

        public void setItems(List<WaybillCloudPrintUpdateRequestPackageInfoItemsItem> items) {
            this.items = items;
        }

        public void setVolume(Long volume) {
            this.volume = volume;
        }

        public void setWeight(Long weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WaybillCloudPrintUpdateRequestPackageInfoItemsItem {

        /**
         * 数量
         */
        @JsonProperty("count")
        private Integer count;

        /**
         * 扩展
         */
        @JsonProperty("ext_json")
        private String extJson;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        public void setCount(Integer count) {
            this.count = count;
        }

        public void setExtJson(String extJson) {
            this.extJson = extJson;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WaybillCloudPrintUpdateRequestRecipient {

        /**
         * 地址
         */
        @JsonProperty("address")
        private WaybillCloudPrintUpdateRequestRecipientAddress address;

        /**
         * 手机号码
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 固定电话
         */
        @JsonProperty("phone")
        private String phone;

        public void setAddress(WaybillCloudPrintUpdateRequestRecipientAddress address) {
            this.address = address;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WaybillCloudPrintUpdateRequestRecipientAddress {

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 国家/地区
         */
        @JsonProperty("country")
        private String country;

        /**
         * 详细地址
         */
        @JsonProperty("detail")
        private String detail;

        /**
         * 区地址
         */
        @JsonProperty("district")
        private String district;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 街道
         */
        @JsonProperty("town")
        private String town;

        public void setCity(String city) {
            this.city = city;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setTown(String town) {
            this.town = town;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WaybillCloudPrintUpdateRequestSender {

        /**
         * 手机号码
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 固定电话
         */
        @JsonProperty("phone")
        private String phone;

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}