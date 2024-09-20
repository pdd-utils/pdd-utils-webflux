package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsPidQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkGoodsPidQueryRequest extends PopBaseHttpRequest<PddDdkGoodsPidQueryResponse> {

    /**
     * 返回的页数
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回的每页推广位数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 推广位列表，例如：["60005_612"]
     */
    @JsonProperty("pid_list")
    private List<String> pidList;

    /**
     * 推广位状态：0-正常，1-封禁
     */
    @JsonProperty("status")
    private Integer status;

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
        return "pdd.ddk.goods.pid.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPidQueryResponse> getResponseClass() {
        return PddDdkGoodsPidQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "pid_list", pidList);
        setUserParam(params, "status", status);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPidList(List<String> pidList) {
        this.pidList = pidList;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}