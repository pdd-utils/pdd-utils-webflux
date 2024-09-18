package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsAddressGetResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class PddLogisticsAddressGetRequest extends PopBaseHttpRequest<PddLogisticsAddressGetResponse> {

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public Class<PddLogisticsAddressGetResponse> getResponseClass() {
        return PddLogisticsAddressGetResponse.class;
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
        return "pdd.logistics.address.get";
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}
