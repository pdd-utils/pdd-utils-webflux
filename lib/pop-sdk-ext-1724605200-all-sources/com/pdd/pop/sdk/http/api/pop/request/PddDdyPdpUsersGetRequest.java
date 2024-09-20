package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdyPdpUsersGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdyPdpUsersGetRequest extends PopBaseHttpRequest<PddDdyPdpUsersGetResponse> {

    /**
     * 如果传了owner_id，表示单条查询
     */
    @JsonProperty("owner_id")
    private Long ownerId;

    /**
     * 查询最后更改时间在某个时间段内的用户
     */
    @JsonProperty("start_modified")
    private String startModified;

    /**
     * 查询最后更改时间在某个时间段内的用户
     */
    @JsonProperty("end_modified")
    private String endModified;

    /**
     * 当前页数
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 每页记录数，默认200，最大200
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
        return "pdd.ddy.pdp.users.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdyPdpUsersGetResponse> getResponseClass() {
        return PddDdyPdpUsersGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "owner_id", ownerId);
        setUserParam(params, "start_modified", startModified);
        setUserParam(params, "end_modified", endModified);
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setStartModified(String startModified) {
        this.startModified = startModified;
    }

    public void setEndModified(String endModified) {
        this.endModified = endModified;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}