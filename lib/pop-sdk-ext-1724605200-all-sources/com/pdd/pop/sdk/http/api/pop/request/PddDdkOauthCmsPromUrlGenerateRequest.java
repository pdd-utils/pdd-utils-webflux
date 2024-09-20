package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthCmsPromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthCmsPromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkOauthCmsPromUrlGenerateResponse> {

    /**
     * 0, "1.9包邮"；1, "今日爆款"； 2, "品牌清仓"； 4,"PC端专属商城(已下线,会生成默认商城)"
     */
    @JsonProperty("channel_type")
    private Integer channelType;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否生成手机跳转链接。true-是，false-否，默认false
     */
    @JsonProperty("generate_mobile")
    private Boolean generateMobile;

    /**
     * 是否返回 schema URL
     */
    @JsonProperty("generate_schema_url")
    private Boolean generateSchemaUrl;

    /**
     * 是否生成短链接，true-是，false-否
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * 是否生成拼多多福利券微信小程序推广信息
     */
    @JsonProperty("generate_we_app")
    private Boolean generateWeApp;

    /**
     * 搜索关键词
     */
    @JsonProperty("keyword")
    private String keyword;

    /**
     * 单人团多人团标志。true-多人团，false-单人团 默认false
     */
    @JsonProperty("multi_group")
    private Boolean multiGroup;

    /**
     * 推广位列表，例如：["60005_612"]
     */
    @JsonProperty("p_id_list")
    private List<String> pIdList;

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
        return "pdd.ddk.oauth.cms.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthCmsPromUrlGenerateResponse> getResponseClass() {
        return PddDdkOauthCmsPromUrlGenerateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "channel_type", channelType);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "generate_mobile", generateMobile);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "generate_short_url", generateShortUrl);
        setUserParam(params, "generate_we_app", generateWeApp);
        setUserParam(params, "keyword", keyword);
        setUserParam(params, "multi_group", multiGroup);
        setUserParam(params, "p_id_list", pIdList);
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGenerateMobile(Boolean generateMobile) {
        this.generateMobile = generateMobile;
    }

    public void setGenerateSchemaUrl(Boolean generateSchemaUrl) {
        this.generateSchemaUrl = generateSchemaUrl;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setGenerateWeApp(Boolean generateWeApp) {
        this.generateWeApp = generateWeApp;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMultiGroup(Boolean multiGroup) {
        this.multiGroup = multiGroup;
    }

    public void setPIdList(List<String> pIdList) {
        this.pIdList = pIdList;
    }
}