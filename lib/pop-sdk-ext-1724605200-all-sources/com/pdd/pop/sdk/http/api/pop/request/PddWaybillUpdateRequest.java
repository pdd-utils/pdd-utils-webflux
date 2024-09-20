package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddWaybillUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddWaybillUpdateRequest extends PopBaseHttpRequest<PddWaybillUpdateResponse> {

    /**
     * param_waybill_cloud_print_update_request
     */
    @JsonProperty("param_waybill_cloud_print_update_request")
    private ParamWaybillCloudPrintUpdateRequest paramWaybillCloudPrintUpdateRequest;

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
        return "pdd.waybill.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddWaybillUpdateResponse> getResponseClass() {
        return PddWaybillUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_waybill_cloud_print_update_request", paramWaybillCloudPrintUpdateRequest);
    }

    public void setParamWaybillCloudPrintUpdateRequest(ParamWaybillCloudPrintUpdateRequest paramWaybillCloudPrintUpdateRequest) {
        this.paramWaybillCloudPrintUpdateRequest = paramWaybillCloudPrintUpdateRequest;
    }

    public static class ParamWaybillCloudPrintUpdateRequest {

        /**
         * 请求表示id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 包裹信息
         */
        @JsonProperty("package_info")
        private ParamWaybillCloudPrintUpdateRequestPackageInfo packageInfo;

        /**
         * 收件信息
         */
        @JsonProperty("recipient")
        private ParamWaybillCloudPrintUpdateRequestRecipient recipient;

        /**
         * 发件信息
         */
        @JsonProperty("sender")
        private ParamWaybillCloudPrintUpdateRequestSender sender;

        /**
         * 模板URL
         */
        @JsonProperty("template_url")
        private String templateUrl;

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

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setPackageInfo(ParamWaybillCloudPrintUpdateRequestPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
        }

        public void setRecipient(ParamWaybillCloudPrintUpdateRequestRecipient recipient) {
            this.recipient = recipient;
        }

        public void setSender(ParamWaybillCloudPrintUpdateRequestSender sender) {
            this.sender = sender;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
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

    public static class ParamWaybillCloudPrintUpdateRequestPackageInfo {

        /**
         * 商品
         */
        @JsonProperty("items")
        private List<ParamWaybillCloudPrintUpdateRequestPackageInfoItemsItem> items;

        /**
         * 体积
         */
        @JsonProperty("volume")
        private Integer volume;

        /**
         * 重量
         */
        @JsonProperty("weight")
        private Integer weight;

        public void setItems(List<ParamWaybillCloudPrintUpdateRequestPackageInfoItemsItem> items) {
            this.items = items;
        }

        public void setVolume(Integer volume) {
            this.volume = volume;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintUpdateRequestPackageInfoItemsItem {

        /**
         * 数量
         */
        @JsonProperty("count")
        private Integer count;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        public void setCount(Integer count) {
            this.count = count;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintUpdateRequestRecipient {

        /**
         * 地址
         */
        @JsonProperty("address")
        private ParamWaybillCloudPrintUpdateRequestRecipientAddress address;

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

        public void setAddress(ParamWaybillCloudPrintUpdateRequestRecipientAddress address) {
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

    public static class ParamWaybillCloudPrintUpdateRequestRecipientAddress {

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 地区/国家
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

    public static class ParamWaybillCloudPrintUpdateRequestSender {

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