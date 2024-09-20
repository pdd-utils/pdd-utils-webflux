package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPopMallBindRelationReportResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPopMallBindRelationReportRequest extends PopBaseHttpRequest<PddPopMallBindRelationReportResponse> {

    /**
     * 关联时间
     */
    @JsonProperty("bind_at")
    private Long bindAt;

    /**
     * 关联类型：0-关联码关联，1-授权关联
     */
    @JsonProperty("bind_type")
    private Integer bindType;

    /**
     * 三方应用的用户id
     */
    @JsonProperty("external_uid")
    private String externalUid;

    /**
     * 被关联方的店铺id
     */
    @JsonProperty("invitee_mall_id")
    private Long inviteeMallId;

    /**
     * 发起关联方的店铺id
     */
    @JsonProperty("inviter_mall_id")
    private Long inviterMallId;

    /**
     * 当前店群包含的拼多多店铺id
     */
    @JsonProperty("mall_list")
    private List<Long> mallList;

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
        return "pdd.pop.mall.bind.relation.report";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPopMallBindRelationReportResponse> getResponseClass() {
        return PddPopMallBindRelationReportResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "bind_at", bindAt);
        setUserParam(params, "bind_type", bindType);
        setUserParam(params, "external_uid", externalUid);
        setUserParam(params, "invitee_mall_id", inviteeMallId);
        setUserParam(params, "inviter_mall_id", inviterMallId);
        setUserParam(params, "mall_list", mallList);
    }

    public void setBindAt(Long bindAt) {
        this.bindAt = bindAt;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public void setExternalUid(String externalUid) {
        this.externalUid = externalUid;
    }

    public void setInviteeMallId(Long inviteeMallId) {
        this.inviteeMallId = inviteeMallId;
    }

    public void setInviterMallId(Long inviterMallId) {
        this.inviterMallId = inviterMallId;
    }

    public void setMallList(List<Long> mallList) {
        this.mallList = mallList;
    }
}