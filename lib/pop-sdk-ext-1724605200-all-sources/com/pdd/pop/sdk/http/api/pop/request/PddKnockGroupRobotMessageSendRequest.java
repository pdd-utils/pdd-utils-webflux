package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockGroupRobotMessageSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockGroupRobotMessageSendRequest extends PopBaseHttpRequest<PddKnockGroupRobotMessageSendResponse> {

    /**
     * 消息内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 白名单tokens
     */
    @JsonProperty("tokens")
    private List<String> tokens;

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
        return "pdd.knock.group.robot.message.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockGroupRobotMessageSendResponse> getResponseClass() {
        return PddKnockGroupRobotMessageSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "content", content);
        setUserParam(params, "tokens", tokens);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }
}