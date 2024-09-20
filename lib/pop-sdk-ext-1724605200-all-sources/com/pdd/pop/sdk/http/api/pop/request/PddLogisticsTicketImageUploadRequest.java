package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsTicketImageUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsTicketImageUploadRequest extends PopBaseHttpRequest<PddLogisticsTicketImageUploadResponse> {

    /**
     * 支持格式有：jpg/jpeg、png等图片格式，入参为图片的base64编码，最大支持1M
     */
    @JsonProperty("image")
    private String image;

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
        return "pdd.logistics.ticket.image.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsTicketImageUploadResponse> getResponseClass() {
        return PddLogisticsTicketImageUploadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "image", image);
    }

    public void setImage(String image) {
        this.image = image;
    }
}