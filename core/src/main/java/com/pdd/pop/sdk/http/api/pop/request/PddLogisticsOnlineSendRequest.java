package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsOnlineSendResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddLogisticsOnlineSendRequest extends PopBaseHttpRequest<PddLogisticsOnlineSendResponse> {
    @JsonProperty("feature")
    private String feature;
    @JsonProperty("logistics_id")
    private Long logisticsId;
    @JsonProperty("order_sn")
    private String orderSn;
    @JsonProperty("redelivery_type")
    private Integer redeliveryType;
    @JsonProperty("refund_address_id")
    private String refundAddressId;
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
    public Class<PddLogisticsOnlineSendResponse> getResponseClass() {
        return PddLogisticsOnlineSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        this.setUserParam(params, "feature", this.feature);
        this.setUserParam(params, "logistics_id", this.logisticsId);
        this.setUserParam(params, "order_sn", this.orderSn);
        this.setUserParam(params, "redelivery_type", this.redeliveryType);
        this.setUserParam(params, "refund_address_id", this.refundAddressId);
        this.setUserParam(params, "tracking_number", this.trackingNumber);
    }
}
