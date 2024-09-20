package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsCsMessageSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsCsMessageSendRequest extends PopBaseHttpRequest<PddLogisticsCsMessageSendResponse> {

    /**
     * pdd会话id
     */
    @JsonProperty("session_id")
    private String sessionId;

    /**
     * 物流公司会话id
     */
    @JsonProperty("wp_session_id")
    private String wpSessionId;

    /**
     * 样式YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("action_time")
    private String actionTime;

    /**
     * 0：文本1：图片
     */
    @JsonProperty("message_type")
    private Integer messageType;

    /**
     * message_type为0时不为空
     */
    @JsonProperty("text")
    private String text;

    /**
     * message_type为1时不为空
     */
    @JsonProperty("attach")
    private String attach;

    /**
     * message_type为1时不为空
     */
    @JsonProperty("preview")
    private String preview;

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
        return "pdd.logistics.cs.message.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsMessageSendResponse> getResponseClass() {
        return PddLogisticsCsMessageSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "session_id", sessionId);
        setUserParam(params, "wp_session_id", wpSessionId);
        setUserParam(params, "action_time", actionTime);
        setUserParam(params, "message_type", messageType);
        setUserParam(params, "text", text);
        setUserParam(params, "attach", attach);
        setUserParam(params, "preview", preview);
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setWpSessionId(String wpSessionId) {
        this.wpSessionId = wpSessionId;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}