package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSpecIdGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSpecIdGetRequest extends PopBaseHttpRequest<PddGoodsSpecIdGetResponse> {

    /**
     * 拼多多标准规格ID，可以通过pdd.goods.spec.get接口获取
     */
    @JsonProperty("parent_spec_id")
    private Long parentSpecId;

    /**
     * 商家编辑的规格值，如颜色规格下设置白色属性
     */
    @JsonProperty("spec_name")
    private String specName;

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
        return "pdd.goods.spec.id.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSpecIdGetResponse> getResponseClass() {
        return PddGoodsSpecIdGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "parent_spec_id", parentSpecId);
        setUserParam(params, "spec_name", specName);
    }

    public void setParentSpecId(Long parentSpecId) {
        this.parentSpecId = parentSpecId;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
}