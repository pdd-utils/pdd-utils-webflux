package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsFulfillmentSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsFulfillmentSendRequest extends PopBaseHttpRequest<PddLogisticsFulfillmentSendResponse> {

    /**
     * 发货单号
     */
    @JsonProperty("fulfillment_sn")
    private String fulfillmentSn;

    /**
     * 快递公司编号
     */
    @JsonProperty("logistics_id")
    private Integer logisticsId;

    /**
     * 枚举：1=首次发货：用于托管发货单首次发货，仅待发货托管单可传入； 2=修改发货：用于修改发货，调用成功后将会覆盖原发货信息，仅已发货2小时内的托管发货单可传入。若不传入该字段，系统将默认为首次发货。
     */
    @JsonProperty("redelivery_type")
    private Integer redeliveryType;

    /**
     * 退货地址id（可通过pdd.refund.address.list.get获取）
     */
    @JsonProperty("return_address_id")
    private String returnAddressId;

    /**
     * 发货运单号
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
        return "pdd.logistics.fulfillment.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsFulfillmentSendResponse> getResponseClass() {
        return PddLogisticsFulfillmentSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "fulfillment_sn", fulfillmentSn);
        setUserParam(params, "logistics_id", logisticsId);
        setUserParam(params, "redelivery_type", redeliveryType);
        setUserParam(params, "return_address_id", returnAddressId);
        setUserParam(params, "tracking_number", trackingNumber);
    }

    public void setFulfillmentSn(String fulfillmentSn) {
        this.fulfillmentSn = fulfillmentSn;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setRedeliveryType(Integer redeliveryType) {
        this.redeliveryType = redeliveryType;
    }

    public void setReturnAddressId(String returnAddressId) {
        this.returnAddressId = returnAddressId;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}