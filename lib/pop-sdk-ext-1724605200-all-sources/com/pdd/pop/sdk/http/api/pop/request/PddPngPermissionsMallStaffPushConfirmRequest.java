package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPngPermissionsMallStaffPushConfirmResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPngPermissionsMallStaffPushConfirmRequest extends PopBaseHttpRequest<PddPngPermissionsMallStaffPushConfirmResponse> {

    /**
     * 确认来自店铺Id的申请权限
     */
    @JsonProperty("from_mall_id")
    private Long fromMallId;

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
        return "pdd.png.permissions.mall.staff.push.confirm";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPngPermissionsMallStaffPushConfirmResponse> getResponseClass() {
        return PddPngPermissionsMallStaffPushConfirmResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "from_mall_id", fromMallId);
    }

    public void setFromMallId(Long fromMallId) {
        this.fromMallId = fromMallId;
    }
}