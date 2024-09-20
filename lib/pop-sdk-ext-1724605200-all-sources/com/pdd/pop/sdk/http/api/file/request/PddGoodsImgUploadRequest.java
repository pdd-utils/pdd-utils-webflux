package com.pdd.pop.sdk.http.api.file.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.file.response.PddGoodsImgUploadResponse;
import com.pdd.pop.sdk.http.FileItem;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsImgUploadRequest extends PopBaseHttpRequest<PddGoodsImgUploadResponse> {

    /**
     * 商品图片文件流
     */
    @JsonProperty("file")
    private FileItem file;

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
        return 2;
    }

    @Override
    public String getType() {
        return "pdd.goods.img.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsImgUploadResponse> getResponseClass() {
        return PddGoodsImgUploadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }

    public void setFile(String path) {
        this.file = new FileItem("file", path);
    }

    @Override
    public FileItem getFileItem() {
        return file;
    }
}