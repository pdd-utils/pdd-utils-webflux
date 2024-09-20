package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudLogisticsOnlineSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudLogisticsOnlineSendRequest extends PopBaseHttpRequest<PddCloudLogisticsOnlineSendResponse> {

    /**
     * 第三方token
     */
    @JsonProperty("ext_token")
    private String extToken;

    /**
     * 发货个性内容，支持imei（手机串号），deviceSn（设备序列号）内容。形如：imei=11,22,3333; 以 “imei=” 开头，以英文分号“;”结尾，中间为手机IMEI串号信息，多个串号以英文逗号 “,”拼接释义：该订单包含三个手机IMEI串号，分别为11、22和3333；其他内容的格式同理。
     */
    @JsonProperty("feature")
    private String feature;

    /**
     * 快递公司编号
     */
    @JsonProperty("logistics_id")
    private Long logisticsId;

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

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
     * 退货地址的id，不填则取商家默认地址
     */
    @JsonProperty("refund_address_id")
    private String refundAddressId;

    /**
     * 快递单号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * 扩展字段
     */
    @JsonProperty("ext_param")
    private String extParam;

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
        return "pdd.cloud.logistics.online.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudLogisticsOnlineSendResponse> getResponseClass() {
        return PddCloudLogisticsOnlineSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ext_token", extToken);
        setUserParam(params, "feature", feature);
        setUserParam(params, "logistics_id", logisticsId);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "redelivery_type", redeliveryType);
        setUserParam(params, "refund_address_id", refundAddressId);
        setUserParam(params, "tracking_number", trackingNumber);
        setUserParam(params, "ext_param", extParam);
    }

    public void setExtToken(String extToken) {
        this.extToken = extToken;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
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

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }
}