package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderInformationGetResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOrderInformationGetRequest extends PopBaseHttpRequest<PddOrderInformationGetResponse> {
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.order.information.get";
    }


    @Override
    public Class<PddOrderInformationGetResponse> getResponseClass() {
        return PddOrderInformationGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        this.setUserParam(params, "order_sn", this.orderSn);
    }
}
