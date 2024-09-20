package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketScenicGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketScenicGetRequest extends PopBaseHttpRequest<PddTicketScenicGetResponse> {

    /**
     * 城市编码
     */
    @JsonProperty("city_code")
    private Long cityCode;

    /**
     * 定位类型 1.百度 2.google
     */
    @JsonProperty("location_type")
    private Integer locationType;

    /**
     * 拼多多景区 ID
     */
    @JsonProperty("scenic_id")
    private Long scenicId;

    /**
     * 景区简称（至少两个字）
     */
    @JsonProperty("scenic_name")
    private String scenicName;

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
        return "pdd.ticket.scenic.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketScenicGetResponse> getResponseClass() {
        return PddTicketScenicGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "city_code", cityCode);
        setUserParam(params, "location_type", locationType);
        setUserParam(params, "scenic_id", scenicId);
        setUserParam(params, "scenic_name", scenicName);
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public void setScenicId(Long scenicId) {
        this.scenicId = scenicId;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }
}