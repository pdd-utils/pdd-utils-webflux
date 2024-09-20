package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsCsSessionStartResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsCsSessionStartRequest extends PopBaseHttpRequest<PddLogisticsCsSessionStartResponse> {

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
     * 可选值：1：已分配 2：排队中 3：分配异常
     */
    @JsonProperty("biz_type")
    private Integer bizType;

    /**
     * 客服id，biz_type为1时必填
     */
    @JsonProperty("dealer_id")
    private String dealerId;

    /**
     * 队列id，biz_type为1时必填
     */
    @JsonProperty("queue_id")
    private String queueId;

    /**
     * 网点名，biz_type为1时必填
     */
    @JsonProperty("queue_name")
    private String queueName;

    /**
     * 排队位置，biz_type为2时必填
     */
    @JsonProperty("queue_index")
    private Integer queueIndex;

    /**
     * 分配遇到的异常，示例：33222，biz_type为3时不为空
     */
    @JsonProperty("exception_code")
    private Integer exceptionCode;

    /**
     * 物流客服系统遇到的异常，biz_type为3时不为空
     */
    @JsonProperty("exception_msg")
    private String exceptionMsg;

    /**
     * 接待的网点地址，biz_type为1时必填，示例: ”河南省”
     */
    @JsonProperty("queue_address")
    private String queueAddress;

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
        return "pdd.logistics.cs.session.start";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsSessionStartResponse> getResponseClass() {
        return PddLogisticsCsSessionStartResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "session_id", sessionId);
        setUserParam(params, "wp_session_id", wpSessionId);
        setUserParam(params, "action_time", actionTime);
        setUserParam(params, "biz_type", bizType);
        setUserParam(params, "dealer_id", dealerId);
        setUserParam(params, "queue_id", queueId);
        setUserParam(params, "queue_name", queueName);
        setUserParam(params, "queue_index", queueIndex);
        setUserParam(params, "exception_code", exceptionCode);
        setUserParam(params, "exception_msg", exceptionMsg);
        setUserParam(params, "queue_address", queueAddress);
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

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public void setQueueIndex(Integer queueIndex) {
        this.queueIndex = queueIndex;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public void setQueueAddress(String queueAddress) {
        this.queueAddress = queueAddress;
    }
}