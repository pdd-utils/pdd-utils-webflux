package com.pdd.pop.sdk.http.api.file.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.file.response.PddDdkReportVideoUploadPartInitResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkReportVideoUploadPartInitRequest extends PopBaseHttpRequest<PddDdkReportVideoUploadPartInitResponse> {

    /**
     * 文件对应的contentType，且必须为视频类型
     */
    @JsonProperty("content_type")
    private String contentType;

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
        return 2;
    }

    @Override
    public String getType() {
        return "pdd.ddk.report.video.upload.part.init";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkReportVideoUploadPartInitResponse> getResponseClass() {
        return PddDdkReportVideoUploadPartInitResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "content_type", contentType);
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}