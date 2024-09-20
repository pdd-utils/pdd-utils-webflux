package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsTemplatePropertyValueSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsTemplatePropertyValueSearchRequest extends PopBaseHttpRequest<PddGoodsTemplatePropertyValueSearchResponse> {

    /**
     * 类目id
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 页码 从1开始
     */
    @JsonProperty("page_num")
    private Integer pageNum;

    /**
     * 1页查询的最大数据 [1，500], 默认100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 父属性值id
     */
    @JsonProperty("parent_vid")
    private Long parentVid;

    /**
     * 模板属性id，废弃中，请入参属性id
     */
    @JsonProperty("template_pid")
    private Long templatePid;

    /**
     * 需要模糊搜索的属性值
     */
    @JsonProperty("value")
    private String value;

    /**
     * 属性id
     */
    @JsonProperty("ref_pid")
    private Long refPid;

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
        return "pdd.goods.template.property.value.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsTemplatePropertyValueSearchResponse> getResponseClass() {
        return PddGoodsTemplatePropertyValueSearchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "page_num", pageNum);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "parent_vid", parentVid);
        setUserParam(params, "template_pid", templatePid);
        setUserParam(params, "value", value);
        setUserParam(params, "ref_pid", refPid);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setParentVid(Long parentVid) {
        this.parentVid = parentVid;
    }

    public void setTemplatePid(Long templatePid) {
        this.templatePid = templatePid;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRefPid(Long refPid) {
        this.refPid = refPid;
    }
}