package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudIsvPageCodeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudIsvPageCodeRequest extends PopBaseHttpRequest<PddCloudIsvPageCodeResponse> {

    /**
     * 用户前端请求的HTTP referer, 需要满足标准URL格式. 如果为C/S架构客户端,填client, 如果为移动端,填mobile
     */
    @JsonProperty("httpReferer")
    private String httpReferer;

    /**
     * 用户关联的拼多多商家ID列表
     */
    @JsonProperty("mallIdList")
    private List<String> mallIdList;

    /**
     * ISV权限体系里的商家用户ID
     */
    @JsonProperty("userId")
    private String userId;

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
        return "pdd.cloud.isv.page.code";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudIsvPageCodeResponse> getResponseClass() {
        return PddCloudIsvPageCodeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "httpReferer", httpReferer);
        setUserParam(params, "mallIdList", mallIdList);
        setUserParam(params, "userId", userId);
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public void setMallIdList(List<String> mallIdList) {
        this.mallIdList = mallIdList;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}