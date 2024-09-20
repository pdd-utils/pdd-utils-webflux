package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGoodsUploadImageResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttGoodsUploadImageRequest extends PopBaseHttpRequest<PddKttGoodsUploadImageResponse> {

    /**
     * 图片url，注意上传图片长宽必须在480~1200以内，且为正方形，大小不得超过1MB，同一url不可并发调用
     */
    @JsonProperty("url")
    private String url;

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
        return "pdd.ktt.goods.upload.image";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGoodsUploadImageResponse> getResponseClass() {
        return PddKttGoodsUploadImageResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "url", url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
}