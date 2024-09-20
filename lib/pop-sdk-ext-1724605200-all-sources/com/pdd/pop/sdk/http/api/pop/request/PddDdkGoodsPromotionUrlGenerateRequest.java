package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsPromotionUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkGoodsPromotionUrlGenerateRequest extends PopBaseHttpRequest<PddDdkGoodsPromotionUrlGenerateResponse> {

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
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。若进行cid投放，生链的时候不填充custom_parameters，后续在推广前原始链接上拼接custom_parameters。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

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
     * 是否生成商品推广分享图，仅支持单个商品
     */
    @JsonProperty("generate_share_image")
    private Boolean generateShareImage;

    /**
     * 获取微信ShortLink链接，仅支持单个商品，单个渠道每天生成的shortLink数量有限，请合理生成shortLink链接
     */
    @JsonProperty("generate_short_link")
    private Boolean generateShortLink;

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
     * 获取微信小程序码，仅支持单个商品
     */
    @JsonProperty("generate_weixin_code")
    private Boolean generateWeixinCode;

    /**
     * 支持拼接特殊参数的商品生链参数列表。生链优先级：goods_gen_url_param_list > goods_sign_list，两者按优先级选其一。
     */
    @JsonProperty("goods_gen_url_param_list")
    private List<GoodsGenUrlParamListItem> goodsGenUrlParamList;

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
        return "pdd.ddk.goods.promotion.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPromotionUrlGenerateResponse> getResponseClass() {
        return PddDdkGoodsPromotionUrlGenerateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_id", cashGiftId);
        setUserParam(params, "cash_gift_name", cashGiftName);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "generate_authority_url", generateAuthorityUrl);
        setUserParam(params, "generate_mall_collect_coupon", generateMallCollectCoupon);
        setUserParam(params, "generate_qq_app", generateQqApp);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "generate_share_image", generateShareImage);
        setUserParam(params, "generate_short_link", generateShortLink);
        setUserParam(params, "generate_short_url", generateShortUrl);
        setUserParam(params, "generate_we_app", generateWeApp);
        setUserParam(params, "generate_weixin_code", generateWeixinCode);
        setUserParam(params, "goods_gen_url_param_list", goodsGenUrlParamList);
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

    public void setGenerateShareImage(Boolean generateShareImage) {
        this.generateShareImage = generateShareImage;
    }

    public void setGenerateShortLink(Boolean generateShortLink) {
        this.generateShortLink = generateShortLink;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setGenerateWeApp(Boolean generateWeApp) {
        this.generateWeApp = generateWeApp;
    }

    public void setGenerateWeixinCode(Boolean generateWeixinCode) {
        this.generateWeixinCode = generateWeixinCode;
    }

    public void setGoodsGenUrlParamList(List<GoodsGenUrlParamListItem> goodsGenUrlParamList) {
        this.goodsGenUrlParamList = goodsGenUrlParamList;
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

    public static class GoodsGenUrlParamListItem {

        /**
         * 商品goodsSign，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        /**
         * 需要在链接上拼接的skuIdCode列表，skuIdCode为skuId密文，由订单详情接口pdd.ddk.order.detail.get返回。要求拥有sku权限否则不生效，作用同sku_id_list，且与sku_id_list独立。此列表传入n个skuIdCode，则针对该goodsSign生成n个拼接sku_id=xxx(skuIdCode)的链接。若列表为空或者skuIdCode无效则返回普通链接
         */
        @JsonProperty("sku_id_code_list")
        private List<String> skuIdCodeList;

        /**
         * 需要在链接上拼接的skuId列表，要求拥有sku权限否则不生效。拼接sku_id的链接在点击跳转商详时，自动选中对应的sku。此列表传入n个skuId，则针对该goodsSign生成n个拼接sku_id链接。若列表为空或着skuId无效（null，非正）则返回普通链接。
         */
        @JsonProperty("sku_id_list")
        private List<Long> skuIdList;

        public void setGoodsSign(String goodsSign) {
            this.goodsSign = goodsSign;
        }

        public void setSkuIdCodeList(List<String> skuIdCodeList) {
            this.skuIdCodeList = skuIdCodeList;
        }

        public void setSkuIdList(List<Long> skuIdList) {
            this.skuIdList = skuIdList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}