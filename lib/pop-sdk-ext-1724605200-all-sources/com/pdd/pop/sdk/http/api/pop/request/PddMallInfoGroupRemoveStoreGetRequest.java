package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoGroupRemoveStoreGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddMallInfoGroupRemoveStoreGetRequest extends PopBaseHttpRequest<PddMallInfoGroupRemoveStoreGetResponse> {

    /**
     * 店铺ID
     */
    @JsonProperty("group_id")
    private Long groupId;

    /**
     * 门店ID列表
     */
    @JsonProperty("store_id_list")
    private List<Long> storeIdList;

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
        return "pdd.mall.info.group.remove.store.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoGroupRemoveStoreGetResponse> getResponseClass() {
        return PddMallInfoGroupRemoveStoreGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_id", groupId);
        setUserParam(params, "store_id_list", storeIdList);
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setStoreIdList(List<Long> storeIdList) {
        this.storeIdList = storeIdList;
    }
}