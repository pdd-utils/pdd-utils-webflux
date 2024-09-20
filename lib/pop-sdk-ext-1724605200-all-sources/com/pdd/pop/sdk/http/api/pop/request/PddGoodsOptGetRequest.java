package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsOptGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsOptGetRequest extends PopBaseHttpRequest<PddGoodsOptGetResponse> {

    /**
     * 值=0时为顶点opt_id,通过树顶级节点获取opt树
     */
    @JsonProperty("parent_opt_id")
    private Integer parentOptId;

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
        return "pdd.goods.opt.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsOptGetResponse> getResponseClass() {
        return PddGoodsOptGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "parent_opt_id", parentOptId);
    }

    public void setParentOptId(Integer parentOptId) {
        this.parentOptId = parentOptId;
    }
}