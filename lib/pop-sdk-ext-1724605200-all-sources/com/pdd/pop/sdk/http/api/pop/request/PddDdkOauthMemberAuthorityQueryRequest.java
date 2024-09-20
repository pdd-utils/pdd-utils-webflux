package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthMemberAuthorityQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOauthMemberAuthorityQueryRequest extends PopBaseHttpRequest<PddDdkOauthMemberAuthorityQueryResponse> {

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

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
        return "pdd.ddk.oauth.member.authority.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthMemberAuthorityQueryResponse> getResponseClass() {
        return PddDdkOauthMemberAuthorityQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "pid", pid);
        setUserParam(params, "custom_parameters", customParameters);
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }
}