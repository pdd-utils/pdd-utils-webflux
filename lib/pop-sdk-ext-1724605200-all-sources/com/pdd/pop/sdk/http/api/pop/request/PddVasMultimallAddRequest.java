package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVasMultimallAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddVasMultimallAddRequest extends PopBaseHttpRequest<PddVasMultimallAddResponse> {

    /**
     * 绑定主店铺id
     */
    @JsonProperty("major_mall_id")
    private Long majorMallId;

    /**
     * 待绑定子店铺id列表
     */
    @JsonProperty("sub_mall_ids")
    private List<Long> subMallIds;

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
        return "pdd.vas.multimall.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVasMultimallAddResponse> getResponseClass() {
        return PddVasMultimallAddResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "major_mall_id", majorMallId);
        setUserParam(params, "sub_mall_ids", subMallIds);
    }

    public void setMajorMallId(Long majorMallId) {
        this.majorMallId = majorMallId;
    }

    public void setSubMallIds(List<Long> subMallIds) {
        this.subMallIds = subMallIds;
    }
}