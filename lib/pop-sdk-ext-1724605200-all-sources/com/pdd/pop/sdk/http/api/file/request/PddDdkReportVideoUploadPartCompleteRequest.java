package com.pdd.pop.sdk.http.api.file.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.file.response.PddDdkReportVideoUploadPartCompleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkReportVideoUploadPartCompleteRequest extends PopBaseHttpRequest<PddDdkReportVideoUploadPartCompleteResponse> {

    /**
     * 标记本次大文件上传的id（init阶段的返回值）
     */
    @JsonProperty("upload_sign")
    private String uploadSign;

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
        return "pdd.ddk.report.video.upload.part.complete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkReportVideoUploadPartCompleteResponse> getResponseClass() {
        return PddDdkReportVideoUploadPartCompleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "upload_sign", uploadSign);
    }

    public void setUploadSign(String uploadSign) {
        this.uploadSign = uploadSign;
    }
}