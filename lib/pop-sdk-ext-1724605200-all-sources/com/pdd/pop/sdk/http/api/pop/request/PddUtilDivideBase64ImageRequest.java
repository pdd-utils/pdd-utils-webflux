package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddUtilDivideBase64ImageResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddUtilDivideBase64ImageRequest extends PopBaseHttpRequest<PddUtilDivideBase64ImageResponse> {

    /**
     * 支持格式有：jpg/jpeg、png等图片格式，入参为图片的base64编码，最大支持2M
     */
    @JsonProperty("img_data")
    private String imgData;

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
        return "pdd.util.divide.base64.image";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddUtilDivideBase64ImageResponse> getResponseClass() {
        return PddUtilDivideBase64ImageResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "img_data", imgData);
    }

    public void setImgData(String imgData) {
        this.imgData = imgData;
    }
}