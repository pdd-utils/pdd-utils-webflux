package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsOutPropertyMappingGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsOutPropertyMappingGetRequest extends PopBaseHttpRequest<PddGoodsOutPropertyMappingGetResponse> {

    /**
     * 拼多多叶子类目id
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 外部平台属性名称
     */
    @JsonProperty("out_property_name")
    private String outPropertyName;

    /**
     * 外部平台属性值名称
     */
    @JsonProperty("out_property_value_name")
    private String outPropertyValueName;

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
        return "pdd.goods.out.property.mapping.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsOutPropertyMappingGetResponse> getResponseClass() {
        return PddGoodsOutPropertyMappingGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "out_property_name", outPropertyName);
        setUserParam(params, "out_property_value_name", outPropertyValueName);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setOutPropertyName(String outPropertyName) {
        this.outPropertyName = outPropertyName;
    }

    public void setOutPropertyValueName(String outPropertyValueName) {
        this.outPropertyValueName = outPropertyValueName;
    }
}