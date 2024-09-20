package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkResourceUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkResourceUrlGenRequest extends PopBaseHttpRequest<PddDdkResourceUrlGenResponse> {

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否返回 schema URL
     */
    @JsonProperty("generate_schema_url")
    private Boolean generateSchemaUrl;

    /**
     * 是否生成拼多多福利券微信小程序推广信息
     */
    @JsonProperty("generate_we_app")
    private Boolean generateWeApp;

    /**
     * 推广位
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 频道来源：4-限时秒杀,39997-充值中心, 39998-活动转链，39996-百亿补贴，39999-电器城，40000-领券中心，50005-火车票
     */
    @JsonProperty("resource_type")
    private Integer resourceType;

    /**
     * 原链接
     */
    @JsonProperty("url")
    private String url;

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
        return "pdd.ddk.resource.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkResourceUrlGenResponse> getResponseClass() {
        return PddDdkResourceUrlGenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "generate_we_app", generateWeApp);
        setUserParam(params, "pid", pid);
        setUserParam(params, "resource_type", resourceType);
        setUserParam(params, "url", url);
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGenerateSchemaUrl(Boolean generateSchemaUrl) {
        this.generateSchemaUrl = generateSchemaUrl;
    }

    public void setGenerateWeApp(Boolean generateWeApp) {
        this.generateWeApp = generateWeApp;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}