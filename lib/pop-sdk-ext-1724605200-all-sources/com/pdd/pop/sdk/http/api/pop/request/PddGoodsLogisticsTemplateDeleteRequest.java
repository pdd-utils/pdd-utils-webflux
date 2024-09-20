package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsTemplateDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsLogisticsTemplateDeleteRequest extends PopBaseHttpRequest<PddGoodsLogisticsTemplateDeleteResponse> {

    /**
     * 物流模版id
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

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
        return "pdd.goods.logistics.template.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsTemplateDeleteResponse> getResponseClass() {
        return PddGoodsLogisticsTemplateDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cost_template_id", costTemplateId);
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }
}