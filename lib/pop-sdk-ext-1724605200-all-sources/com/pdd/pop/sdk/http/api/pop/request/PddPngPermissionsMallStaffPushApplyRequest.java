package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPngPermissionsMallStaffPushApplyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPngPermissionsMallStaffPushApplyRequest extends PopBaseHttpRequest<PddPngPermissionsMallStaffPushApplyResponse> {

    /**
     * 申请推入的店铺id
     */
    @JsonProperty("to_mall_id")
    private Long toMallId;

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
        return "pdd.png.permissions.mall.staff.push.apply";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPngPermissionsMallStaffPushApplyResponse> getResponseClass() {
        return PddPngPermissionsMallStaffPushApplyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "to_mall_id", toMallId);
    }

    public void setToMallId(Long toMallId) {
        this.toMallId = toMallId;
    }
}