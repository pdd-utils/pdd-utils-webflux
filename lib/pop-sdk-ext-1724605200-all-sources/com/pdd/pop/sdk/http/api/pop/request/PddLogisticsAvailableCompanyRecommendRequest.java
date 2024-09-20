package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsAvailableCompanyRecommendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddLogisticsAvailableCompanyRecommendRequest extends PopBaseHttpRequest<PddLogisticsAvailableCompanyRecommendResponse> {

    /**
     * 收件人市id（最多支持50个）
     */
    @JsonProperty("city_id")
    private List<Long> cityId;

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
        return "pdd.logistics.available.company.recommend";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsAvailableCompanyRecommendResponse> getResponseClass() {
        return PddLogisticsAvailableCompanyRecommendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "city_id", cityId);
    }

    public void setCityId(List<Long> cityId) {
        this.cityId = cityId;
    }
}