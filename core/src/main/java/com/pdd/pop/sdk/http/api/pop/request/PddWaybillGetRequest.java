package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddWaybillGetResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddWaybillGetRequest extends PopBaseHttpRequest<PddWaybillGetResponse> {

    @JsonProperty("param_waybill_cloud_print_apply_new_request")
    private ParamWaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest;

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public Class<PddWaybillGetResponse> getResponseClass() {
        return PddWaybillGetResponse.class;
    }

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public String getType() {
        return "pdd.waybill.get";
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_waybill_cloud_print_apply_new_request", paramWaybillCloudPrintApplyNewRequest);
    }

    @Override
    public HttpMethod getHttpMethod() {
        return super.getHttpMethod();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequest {

        @JsonProperty("need_encrypt")
        private Boolean needEncrypt;

        @JsonProperty("sender")
        private ParamWaybillCloudPrintApplyNewRequestSender sender;

        @JsonProperty("trade_order_info_dtos")
        private List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos;

        @JsonProperty("wp_code")
        private String wpCode;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestSender {

        @JsonProperty("address")
        private ParamWaybillCloudPrintApplyNewRequestSenderAddress address;

        @JsonProperty("mobile")
        private String mobile;

        @JsonProperty("name")
        private String name;

        @JsonProperty("phone")
        private String phone;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestSenderAddress {

        @JsonProperty("city")
        private String city;

        @JsonProperty("country")
        private String country;

        @JsonProperty("detail")
        private String detail;

        @JsonProperty("district")
        private String district;

        @JsonProperty("province")
        private String province;

        @JsonProperty("town")
        private String town;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem {

        @JsonProperty("logistics_services")
        private String logisticsServices;

        @JsonProperty("object_id")
        private String objectId;

        @JsonProperty("order_info")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo orderInfo;

        @JsonProperty("package_info")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo packageInfo;

        @JsonProperty("recipient")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient recipient;

        @JsonProperty("template_url")
        private String templateUrl;

        @JsonProperty("user_id")
        private Long userId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo {

        @JsonProperty("order_channels_type")
        private String orderChannelsType;

        @JsonProperty("trade_order_list")
        private List<String> tradeOrderList;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo {

        @JsonProperty("goods_description")
        private String goodsDescription;

        @JsonProperty("id")
        private String id;

        @JsonProperty("items")
        private List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items;

        @JsonProperty("packaging_description")
        private String packagingDescription;

        @JsonProperty("total_packages_count")
        private Integer totalPackagesCount;

        @JsonProperty("volume")
        private Long volume;

        @JsonProperty("weight")
        private Long weight;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem {

        @JsonProperty("count")
        private Integer count;

        @JsonProperty("name")
        private String name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient {

        @JsonProperty("address")
        private ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress address;

        @JsonProperty("mobile")
        private String mobile;

        @JsonProperty("name")
        private String name;

        @JsonProperty("phone")
        private String phone;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress {

        @JsonProperty("city")
        private String city;

        @JsonProperty("country")
        private String country;

        @JsonProperty("detail")
        private String detail;

        @JsonProperty("district")
        private String district;

        @JsonProperty("province")
        private String province;

        @JsonProperty("town")
        private String town;
    }
}
