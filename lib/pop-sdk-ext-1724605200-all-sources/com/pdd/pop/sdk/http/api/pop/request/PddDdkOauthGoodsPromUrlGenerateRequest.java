package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthGoodsPromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthGoodsPromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkOauthGoodsPromUrlGenerateResponse> {

    /**
     * 多多礼金ID
     */
    @JsonProperty("cash_gift_id")
    private Long cashGiftId;

    /**
     * 自定义礼金标题，用于向用户展示渠道专属福利，不超过12个字
     */
    @JsonProperty("cash_gift_name")
    private String cashGiftName;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否使用多多客专属推广计划
     */
    @JsonProperty("force_duo_id")
    private Boolean forceDuoId;

    /**
     * 是否生成带授权的单品链接。如果未授权，则会走授权流程
     */
    @JsonProperty("generate_authority_url")
    private Boolean generateAuthorityUrl;

    /**
     * 是否生成店铺收藏券推广链接
     */
    @JsonProperty("generate_mall_collect_coupon")
    private Boolean generateMallCollectCoupon;

    /**
     * 是否生成qq小程序
     */
    @JsonProperty("generate_qq_app")
    private Boolean generateQqApp;

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
     * 商品goodsSign列表，例如：["c9r2omogKFFAc7WBwvbZU1ikIb16_J3CTa8HNN"]，支持批量生链。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign_list")
    private List<String> goodsSignList;

    /**
     * 素材ID，可以通过商品详情接口获取商品素材信息
     */
    @JsonProperty("material_id")
    private String materialId;

    /**
     * true--生成多人团推广链接 false--生成单人团推广链接（默认false）1、单人团推广链接：用户访问单人团推广链接，可直接购买商品无需拼团。2、多人团推广链接：用户访问双人团推广链接开团，若用户分享给他人参团，则开团者和参团者的佣金均结算给推手
     */
    @JsonProperty("multi_group")
    private Boolean multiGroup;

    /**
     * 推广位ID
     */
    @JsonProperty("p_id")
    private String pId;

    /**
     * 搜索id，建议填写，提高收益。来自pdd.ddk.goods.recommend.get、pdd.ddk.goods.search、pdd.ddk.top.goods.list.query等接口
     */
    @JsonProperty("search_id")
    private String searchId;

    /**
     * 特殊参数
     */
    @JsonProperty("special_params")
    private Map<String, String> specialParams;

    /**
     * 生成商品链接类型 0-默认 1-百补相似品列表
     */
    @JsonProperty("url_type")
    private Integer urlType;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

    /**
     * 是否生成小程序schema长链
     */
    @JsonProperty("generate_we_app_long_link")
    private Boolean generateWeAppLongLink;

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
        return "pdd.ddk.oauth.goods.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthGoodsPromUrlGenerateResponse> getResponseClass() {
        return PddDdkOauthGoodsPromUrlGenerateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_id", cashGiftId);
        setUserParam(params, "cash_gift_name", cashGiftName);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "force_duo_id", forceDuoId);
        setUserParam(params, "generate_authority_url", generateAuthorityUrl);
        setUserParam(params, "generate_mall_collect_coupon", generateMallCollectCoupon);
        setUserParam(params, "generate_qq_app", generateQqApp);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "generate_short_url", generateShortUrl);
        setUserParam(params, "generate_we_app", generateWeApp);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "material_id", materialId);
        setUserParam(params, "multi_group", multiGroup);
        setUserParam(params, "p_id", pId);
        setUserParam(params, "search_id", searchId);
        setUserParam(params, "special_params", specialParams);
        setUserParam(params, "url_type", urlType);
        setUserParam(params, "zs_duo_id", zsDuoId);
        setUserParam(params, "generate_we_app_long_link", generateWeAppLongLink);
    }

    public void setCashGiftId(Long cashGiftId) {
        this.cashGiftId = cashGiftId;
    }

    public void setCashGiftName(String cashGiftName) {
        this.cashGiftName = cashGiftName;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setForceDuoId(Boolean forceDuoId) {
        this.forceDuoId = forceDuoId;
    }

    public void setGenerateAuthorityUrl(Boolean generateAuthorityUrl) {
        this.generateAuthorityUrl = generateAuthorityUrl;
    }

    public void setGenerateMallCollectCoupon(Boolean generateMallCollectCoupon) {
        this.generateMallCollectCoupon = generateMallCollectCoupon;
    }

    public void setGenerateQqApp(Boolean generateQqApp) {
        this.generateQqApp = generateQqApp;
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

    public void setGoodsSignList(List<String> goodsSignList) {
        this.goodsSignList = goodsSignList;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public void setMultiGroup(Boolean multiGroup) {
        this.multiGroup = multiGroup;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public void setSpecialParams(Map<String, String> specialParams) {
        this.specialParams = specialParams;
    }

    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public void setGenerateWeAppLongLink(Boolean generateWeAppLongLink) {
        this.generateWeAppLongLink = generateWeAppLongLink;
    }
}