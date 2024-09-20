package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallNotificationTypeShowCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallNotificationTypeShowCheckRequest extends PopBaseHttpRequest<PddMallNotificationTypeShowCheckResponse> {

    /**
     * 通知类型
     */
    @JsonProperty("notification_type")
    private String notificationType;

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
        return "pdd.mall.notification.type.show.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallNotificationTypeShowCheckResponse> getResponseClass() {
        return PddMallNotificationTypeShowCheckResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "notification_type", notificationType);
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
}