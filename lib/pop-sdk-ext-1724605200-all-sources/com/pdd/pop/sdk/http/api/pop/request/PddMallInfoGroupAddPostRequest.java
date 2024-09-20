package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoGroupAddPostResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallInfoGroupAddPostRequest extends PopBaseHttpRequest<PddMallInfoGroupAddPostResponse> {

    /**
     * 门店组名称
     */
    @JsonProperty("group_name")
    private String groupName;

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
        return "pdd.mall.info.group.add.post";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoGroupAddPostResponse> getResponseClass() {
        return PddMallInfoGroupAddPostResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_name", groupName);
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}