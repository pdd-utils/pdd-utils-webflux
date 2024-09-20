package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoGroupListStoreGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallInfoGroupListStoreGetRequest extends PopBaseHttpRequest<PddMallInfoGroupListStoreGetResponse> {

    /**
     * 门店组ID
     */
    @JsonProperty("group_id")
    private Long groupId;

    /**
     * 分页页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;

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
        return "pdd.mall.info.group.list.store.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoGroupListStoreGetResponse> getResponseClass() {
        return PddMallInfoGroupListStoreGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_id", groupId);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}