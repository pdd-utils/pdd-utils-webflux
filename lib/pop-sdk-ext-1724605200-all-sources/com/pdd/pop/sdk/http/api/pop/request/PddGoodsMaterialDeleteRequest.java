package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsMaterialDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsMaterialDeleteRequest extends PopBaseHttpRequest<PddGoodsMaterialDeleteResponse> {

    /**
     * 素材id
     */
    @JsonProperty("material_id")
    private Long materialId;

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
        return "pdd.goods.material.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsMaterialDeleteResponse> getResponseClass() {
        return PddGoodsMaterialDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "material_id", materialId);
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }
}