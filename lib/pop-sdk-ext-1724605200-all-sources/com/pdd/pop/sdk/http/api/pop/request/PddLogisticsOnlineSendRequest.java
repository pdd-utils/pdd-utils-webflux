package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsOnlineSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsOnlineSendRequest extends PopBaseHttpRequest<PddLogisticsOnlineSendResponse> {

    /**
     * 发货个性内容，支持imei（手机串号），deviceSn（设备序列号），overseaTracing（海淘溯源码id）内容，appraisalCert（商品证书编号）。形如：“imei=识别码1,识别码2;”、“ deviceSn=序列号1,序列号2;”、“ organicCode=有机码1,有机码2;”、“overseaTracing=溯源码1,溯源码2;”、“appraisalCert=商品证书编号1;”。以英文逗号“,”分割串号，以英文分号“;”分割不同参数内容。上传时请严格区分imei，deviceSn，organicCode，overseaTracing和appraisalCert，其中overseaTracing（海淘溯源码id）要求海淘商品在支持溯源的情况下必传，appraisalCert（商品证书编号）要求珠宝类商品在支持专业鉴定的情况下必传；以上错传/漏传将会导致发货失败
     */
    @JsonProperty("feature")
    private String feature;

    /**
     * 快递公司编号
     */
    @JsonProperty("logistics_id")
    private Long logisticsId;

    /**
     * 订单号。形如：20150909-452750051
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 修改发货模式：不传则默认为首次发货 1=首次发货：用于订单首次发货，仅待发货订单可传入； 2=修改发货：用于订单修改发货，调用成功后将会覆盖原发货信息，仅已发货订单可传入
     */
    @JsonProperty("redelivery_type")
    private Integer redeliveryType;

    /**
     * 退货地址的id，不填则取商品默认退货地址（可在“拼多多-商家后台/售后工作台/售后设置”为商品绑定默认退货地址，若未设置则取店铺默认退货地址）
     */
    @JsonProperty("refund_address_id")
    private String refundAddressId;

    /**
     * 快递单号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

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
        return "pdd.logistics.online.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsOnlineSendResponse> getResponseClass() {
        return PddLogisticsOnlineSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "feature", feature);
        setUserParam(params, "logistics_id", logisticsId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "redelivery_type", redeliveryType);
        setUserParam(params, "refund_address_id", refundAddressId);
        setUserParam(params, "tracking_number", trackingNumber);
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setRedeliveryType(Integer redeliveryType) {
        this.redeliveryType = redeliveryType;
    }

    public void setRefundAddressId(String refundAddressId) {
        this.refundAddressId = refundAddressId;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}