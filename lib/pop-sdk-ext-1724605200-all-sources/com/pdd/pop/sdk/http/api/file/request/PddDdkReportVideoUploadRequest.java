package com.pdd.pop.sdk.http.api.file.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.file.response.PddDdkReportVideoUploadResponse;
import com.pdd.pop.sdk.http.FileItem;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkReportVideoUploadRequest extends PopBaseHttpRequest<PddDdkReportVideoUploadResponse> {

    /**
     * 多多客信息流投放备案视频文件流
     */
    @JsonProperty("file")
    private FileItem file;

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
        return "pdd.ddk.report.video.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkReportVideoUploadResponse> getResponseClass() {
        return PddDdkReportVideoUploadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }

    public void setFile(String path) {
        this.file = new FileItem("file", path);
    }

    @Override
    public FileItem getFileItem() {
        return file;
    }
}