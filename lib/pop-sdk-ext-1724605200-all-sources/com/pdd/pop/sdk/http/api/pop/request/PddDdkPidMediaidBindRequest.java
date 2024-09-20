package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkPidMediaidBindResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkPidMediaidBindRequest extends PopBaseHttpRequest<PddDdkPidMediaidBindResponse> {

    /**
     * 媒体id
     */
    @JsonProperty("media_id")
    private Long mediaId;

    /**
     * 推广位列表，例如：["60005_612"]，最多支持同时传入1000个
     */
    @JsonProperty("pid_list")
    private List<String> pidList;

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
        return "pdd.ddk.pid.mediaid.bind";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkPidMediaidBindResponse> getResponseClass() {
        return PddDdkPidMediaidBindResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "media_id", mediaId);
        setUserParam(params, "pid_list", pidList);
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public void setPidList(List<String> pidList) {
        this.pidList = pidList;
    }
}