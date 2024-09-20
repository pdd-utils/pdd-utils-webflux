package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthGoodsZsUnitUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOauthGoodsZsUnitUrlGenRequest extends PopBaseHttpRequest<PddDdkOauthGoodsZsUnitUrlGenResponse> {

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否返回 schema URL
     */
    @JsonProperty("generate_schema_url")
    private Boolean generateSchemaUrl;

    /**
     * 渠道id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 需转链的链接，支持拼多多商品链接、进宝长链/短链（即为pdd.ddk.goods.promotion.url.generate接口生成的长短链）
     */
    @JsonProperty("source_url")
    private String sourceUrl;

    /**
     * 是否生成微信LongLink
     */
    @JsonProperty("generate_we_app_long_link")
    private Boolean generateWeAppLongLink;

    /**
     * 是否生成微信shortlink链接，仅支持单品，单个渠道每天生成的shortLink数量有限，请合理生成shortLink链接
     */
    @JsonProperty("generate_short_link")
    private Boolean generateShortLink;

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
        return "pdd.ddk.oauth.goods.zs.unit.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthGoodsZsUnitUrlGenResponse> getResponseClass() {
        return PddDdkOauthGoodsZsUnitUrlGenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "pid", pid);
        setUserParam(params, "source_url", sourceUrl);
        setUserParam(params, "generate_we_app_long_link", generateWeAppLongLink);
        setUserParam(params, "generate_short_link", generateShortLink);
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGenerateSchemaUrl(Boolean generateSchemaUrl) {
        this.generateSchemaUrl = generateSchemaUrl;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setGenerateWeAppLongLink(Boolean generateWeAppLongLink) {
        this.generateWeAppLongLink = generateWeAppLongLink;
    }

    public void setGenerateShortLink(Boolean generateShortLink) {
        this.generateShortLink = generateShortLink;
    }
}