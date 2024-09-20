package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudWaybillGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudWaybillGetRequest extends PopBaseHttpRequest<PddCloudWaybillGetResponse> {

    /**
     * 入参信息
     */
    @JsonProperty("param_waybill_cloud_print_apply_new_request")
    private ParamWaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest;

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
        return "pdd.cloud.waybill.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudWaybillGetResponse> getResponseClass() {
        return PddCloudWaybillGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_waybill_cloud_print_apply_new_request", paramWaybillCloudPrintApplyNewRequest);
    }

    public void setParamWaybillCloudPrintApplyNewRequest(ParamWaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest) {
        this.paramWaybillCloudPrintApplyNewRequest = paramWaybillCloudPrintApplyNewRequest;
    }

    public static class ParamWaybillCloudPrintApplyNewRequest {

        /**
         * 扩展字段
         */
        @JsonProperty("ext_id")
        private Long extId;

        /**
         * 扩展字段
         */
        @JsonProperty("extendProps")
        private String extendProps;

        /**
         * 设定取号返回的云打印报文是否加密
         */
        @JsonProperty("need_encrypt")
        private Boolean needEncrypt;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 发货人信息
         */
        @JsonProperty("sender")
        private ParamWaybillCloudPrintApplyNewRequestSender sender;

        /**
         * 第三方授权token
         */
        @JsonProperty("token")
        private String token;

        /**
         * 请求面单信息，数量限制为10
         */
        @JsonProperty("trade_order_info_dtos")
        private List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos;

        /**
         * 物流公司Code
         */
        @JsonProperty("wp_code")
        private String wpCode;

        /**
         * 店铺ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        public void setExtId(Long extId) {
            this.extId = extId;
        }

        public void setExtendProps(String extendProps) {
            this.extendProps = extendProps;
        }

        public void setNeedEncrypt(Boolean needEncrypt) {
            this.needEncrypt = needEncrypt;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setSender(ParamWaybillCloudPrintApplyNewRequestSender sender) {
            this.sender = sender;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public void setTradeOrderInfoDtos(List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos) {
            this.tradeOrderInfoDtos = tradeOrderInfoDtos;
        }

        public void setWpCode(String wpCode) {
            this.wpCode = wpCode;
        }

        public void setMallId(Long mallId) {
            this.mallId = mallId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintApplyNewRequestSender {

        /**
         * 地址
         */
        @JsonProperty("address")
        private ParamWaybillCloudPrintApplyNewRequestSenderAddress address;

        /**
         * 手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 电话
         */
        @JsonProperty("phone")
        private String phone;

        public void setAddress(ParamWaybillCloudPrintApplyNewRequestSenderAddress address) {
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

    public static class ParamWaybillCloudPrintApplyNewRequestSenderAddress {

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
         * 街道
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

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem {

        /**
         * 物流服务内容链接
         */
        @JsonProperty("logistics_services")
        private String logisticsServices;

        /**
         * 请求id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 订单信息
         */
        @JsonProperty("order_info")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo orderInfo;

        /**
         * 包裹信息
         */
        @JsonProperty("package_info")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo packageInfo;

        /**
         * 收件人信息
         */
        @JsonProperty("recipient")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient recipient;

        /**
         * 标准模板模板URL
         */
        @JsonProperty("template_url")
        private String templateUrl;

        /**
         * 使用者ID
         */
        @JsonProperty("user_id")
        private String userId;

        public void setLogisticsServices(String logisticsServices) {
            this.logisticsServices = logisticsServices;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setOrderInfo(ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo orderInfo) {
            this.orderInfo = orderInfo;
        }

        public void setPackageInfo(ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
        }

        public void setRecipient(ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient recipient) {
            this.recipient = recipient;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo {

        /**
         * 订单渠道平台编码
         */
        @JsonProperty("order_channels_type")
        private String orderChannelsType;

        /**
         * 订单号,数量限制100
         */
        @JsonProperty("trade_order_list")
        private List<String> tradeOrderList;

        public void setOrderChannelsType(String orderChannelsType) {
            this.orderChannelsType = orderChannelsType;
        }

        public void setTradeOrderList(List<String> tradeOrderList) {
            this.tradeOrderList = tradeOrderList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo {

        /**
         * 快运货品描述
         */
        @JsonProperty("goods_description")
        private String goodsDescription;

        /**
         * 包裹id,拆合单使用
         */
        @JsonProperty("id")
        private String id;

        /**
         * 商品信息,数量限制为100
         */
        @JsonProperty("items")
        private List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items;

        /**
         * 快运包装方式描述
         */
        @JsonProperty("packaging_description")
        private String packagingDescription;

        /**
         * 子母件总包裹数
         */
        @JsonProperty("total_packages_count")
        private String totalPackagesCount;

        /**
         * 体积, 单位 ml
         */
        @JsonProperty("volume")
        private String volume;

        /**
         * 重量,单位 g
         */
        @JsonProperty("weight")
        private String weight;

        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setItems(List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items) {
            this.items = items;
        }

        public void setPackagingDescription(String packagingDescription) {
            this.packagingDescription = packagingDescription;
        }

        public void setTotalPackagesCount(String totalPackagesCount) {
            this.totalPackagesCount = totalPackagesCount;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem {

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

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient {

        /**
         * 地址
         */
        @JsonProperty("address")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress address;

        /**
         * 手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 电话
         */
        @JsonProperty("phone")
        private String phone;

        public void setAddress(ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress address) {
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

    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress {

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
         * 街道
         */
        @JsonProperty("district")
        private String district;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 镇
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
}