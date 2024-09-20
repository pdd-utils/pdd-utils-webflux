package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFdsWaybillGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFdsWaybillGetRequest extends PopBaseHttpRequest<PddFdsWaybillGetResponse> {

    /**
     * 入参信息
     */
    @JsonProperty("param_fds_waybill_get_request")
    private ParamFdsWaybillGetRequest paramFdsWaybillGetRequest;

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
        return "pdd.fds.waybill.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFdsWaybillGetResponse> getResponseClass() {
        return PddFdsWaybillGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_fds_waybill_get_request", paramFdsWaybillGetRequest);
    }

    public void setParamFdsWaybillGetRequest(ParamFdsWaybillGetRequest paramFdsWaybillGetRequest) {
        this.paramFdsWaybillGetRequest = paramFdsWaybillGetRequest;
    }

    public static class ParamFdsWaybillGetRequest {

        /**
         * 发货人信息
         */
        @JsonProperty("sender")
        private ParamFdsWaybillGetRequestSender sender;

        /**
         * 取号列表
         */
        @JsonProperty("trade_order_info_dtos")
        private List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos;

        /**
         * 物流公司 Code ，枚举： YTO- 圆通，ZTO-中通，YUNDA-韵达，STO-申通
         */
        @JsonProperty("wp_code")
        private String wpCode;

        public void setSender(ParamFdsWaybillGetRequestSender sender) {
            this.sender = sender;
        }

        public void setTradeOrderInfoDtos(List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos) {
            this.tradeOrderInfoDtos = tradeOrderInfoDtos;
        }

        public void setWpCode(String wpCode) {
            this.wpCode = wpCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamFdsWaybillGetRequestSender {

        /**
         * 发货地址，需要入参与 search 接口中的发货人地址信息一致
         */
        @JsonProperty("address")
        private ParamFdsWaybillGetRequestSenderAddress address;

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

        public void setAddress(ParamFdsWaybillGetRequestSenderAddress address) {
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

    public static class ParamFdsWaybillGetRequestSenderAddress {

        /**
         * 市
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
         * 区
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

    public static class ParamFdsWaybillGetRequestTradeOrderInfoDtosItem {

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
        private ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfo orderInfo;

        /**
         * 包裹信息
         */
        @JsonProperty("package_info")
        private ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfo packageInfo;

        /**
         * 标准模板模板URL
         */
        @JsonProperty("template_url")
        private String templateUrl;

        /**
         * 使用者ID
         */
        @JsonProperty("user_id")
        private Long userId;

        public void setLogisticsServices(String logisticsServices) {
            this.logisticsServices = logisticsServices;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setOrderInfo(ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfo orderInfo) {
            this.orderInfo = orderInfo;
        }

        public void setPackageInfo(ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfo {

        /**
         * 订单渠道平台编码
         */
        @JsonProperty("order_channels_type")
        private String orderChannelsType;

        /**
         * 订单列表，限制100个
         */
        @JsonProperty("trade_order_list")
        private List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfoTradeOrderListItem> tradeOrderList;

        public void setOrderChannelsType(String orderChannelsType) {
            this.orderChannelsType = orderChannelsType;
        }

        public void setTradeOrderList(List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfoTradeOrderListItem> tradeOrderList) {
            this.tradeOrderList = tradeOrderList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamFdsWaybillGetRequestTradeOrderInfoDtosItemOrderInfoTradeOrderListItem {

        /**
         * 代打店铺id
         */
        @JsonProperty("mall_mask_id")
        private String mallMaskId;

        /**
         * 代打订单号
         */
        @JsonProperty("order_mask_sn")
        private String orderMaskSn;

        public void setMallMaskId(String mallMaskId) {
            this.mallMaskId = mallMaskId;
        }

        public void setOrderMaskSn(String orderMaskSn) {
            this.orderMaskSn = orderMaskSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfo {

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
        private List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items;

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
        private Integer volume;

        /**
         * 重量,单位 g
         */
        @JsonProperty("weight")
        private Integer weight;

        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setItems(List<ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items) {
            this.items = items;
        }

        public void setPackagingDescription(String packagingDescription) {
            this.packagingDescription = packagingDescription;
        }

        public void setTotalPackagesCount(String totalPackagesCount) {
            this.totalPackagesCount = totalPackagesCount;
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

    public static class ParamFdsWaybillGetRequestTradeOrderInfoDtosItemPackageInfoItemsItem {

        /**
         * 数量
         */
        @JsonProperty("count")
        private Integer count;

        /**
         * 商品名称
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
}