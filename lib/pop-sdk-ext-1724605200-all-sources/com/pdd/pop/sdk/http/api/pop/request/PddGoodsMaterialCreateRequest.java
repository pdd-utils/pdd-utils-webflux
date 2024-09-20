package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsMaterialCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsMaterialCreateRequest extends PopBaseHttpRequest<PddGoodsMaterialCreateResponse> {

    /**
     * 素材内容（一般为图片链接）
     */
    @JsonProperty("content")
    private String content;

    /**
     * 图片空间文件id
     */
    @JsonProperty("file_id")
    private Long fileId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 素材类型（1：白底图；3：长图）
     */
    @JsonProperty("material_type")
    private Integer materialType;

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
        return "pdd.goods.material.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsMaterialCreateResponse> getResponseClass() {
        return PddGoodsMaterialCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "content", content);
        setUserParam(params, "file_id", fileId);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "material_type", materialType);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }
}