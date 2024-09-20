package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsSerTemplateDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsLogisticsSerTemplateDeleteRequest extends PopBaseHttpRequest<PddGoodsLogisticsSerTemplateDeleteResponse> {

    /**
     * 模版id
     */
    @JsonProperty("template_id")
    private String templateId;

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
        return "pdd.goods.logistics.ser.template.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsSerTemplateDeleteResponse> getResponseClass() {
        return PddGoodsLogisticsSerTemplateDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "template_id", templateId);
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}