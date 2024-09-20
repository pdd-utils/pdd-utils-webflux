package com.pdd.pop.sdk.http.api.file.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.file.response.PddLiveVideoMallUploadPartResponse;
import com.pdd.pop.sdk.http.FileItem;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLiveVideoMallUploadPartRequest extends PopBaseHttpRequest<PddLiveVideoMallUploadPartResponse> {

    /**
     * 当前分片的文件流，不能大于20M
     */
    @JsonProperty("part_file")
    private FileItem partFile;

    /**
     * 当前分片编号名，从1开始
     */
    @JsonProperty("part_num")
    private String partNum;

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
        return "pdd.live.video.mall.upload.part";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLiveVideoMallUploadPartResponse> getResponseClass() {
        return PddLiveVideoMallUploadPartResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "part_num", partNum);
        setUserParam(params, "upload_sign", uploadSign);
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setUploadSign(String uploadSign) {
        this.uploadSign = uploadSign;
    }

    public void setPartFile(String path) {
        this.partFile = new FileItem("part_file", path);
    }

    @Override
    public FileItem getFileItem() {
        return partFile;
    }
}