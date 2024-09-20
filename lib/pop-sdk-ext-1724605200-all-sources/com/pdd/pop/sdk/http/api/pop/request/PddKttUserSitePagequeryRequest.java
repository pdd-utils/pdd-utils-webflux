package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttUserSitePagequeryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttUserSitePagequeryRequest extends PopBaseHttpRequest<PddKttUserSitePagequeryResponse> {

    /**
     * 页码 从1开始
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 数量 <=100
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
        return "pdd.ktt.user.site.pagequery";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttUserSitePagequeryResponse> getResponseClass() {
        return PddKttUserSitePagequeryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}