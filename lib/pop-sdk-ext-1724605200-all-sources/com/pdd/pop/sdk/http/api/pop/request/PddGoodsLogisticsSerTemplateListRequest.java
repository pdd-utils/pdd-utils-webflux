package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsSerTemplateListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsLogisticsSerTemplateListRequest extends PopBaseHttpRequest<PddGoodsLogisticsSerTemplateListResponse> {

    /**
     * 查询大小
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 查询类型
     */
    @JsonProperty("query_type")
    private Integer queryType;

    /**
     * 查询偏移量
     */
    @JsonProperty("start")
    private Integer start;

    /**
     * 模板类型
     */
    @JsonProperty("template_type")
    private Integer templateType;

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
        return "pdd.goods.logistics.ser.template.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsSerTemplateListResponse> getResponseClass() {
        return PddGoodsLogisticsSerTemplateListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "length", length);
        setUserParam(params, "query_type", queryType);
        setUserParam(params, "start", start);
        setUserParam(params, "template_type", templateType);
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }
}