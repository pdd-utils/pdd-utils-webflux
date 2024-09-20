package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkRpPromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkRpPromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkRpPromUrlGenerateResponse> {

    /**
     * 初始金额（单位分），有效金额枚举值：300、500、700、1100和1600，默认300
     */
    @JsonProperty("amount")
    private Long amount;

    /**
     * 营销工具类型，必填：-1-活动列表，0-红包(需申请推广权限)，2–新人红包，3-刮刮卡，5-员工内购，10-生成绑定备案链接，12-砸金蛋，14-千万补贴B端页面，15-充值中心B端页面，16-千万补贴C端页面，17-千万补贴投票页面，23-超级红包，24-礼金全场N折活动B端页面，27-带货赢千万，30-免单B端页面，31-免单C端页面，32-转盘得现金B端页面，33-转盘得现金C端页面，34-千万神券C端页面，35-千万神券B端页面，36-爆品日历B端页面，37-超级红包B端推品页，39-母婴馆C端页面，40-母婴馆B端页面，41-限时折扣B端页面，42-超级红包9.9C端活动页 45-大促会场集合B端页面 46-大促会场集合C端页面 47-类目排位赛B端页面 48-惊喜价B端页面 49-惊喜价C端页面
     */
    @JsonProperty("channel_type")
    private Integer channelType;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 一元购自定义参数，json格式，例如:{"goods_sign":"Y9b2_0uSWMFPGSaVwvfZAlm_y2ADLWZl_JQ7UYaS80K"}
     */
    @JsonProperty("diy_one_yuan_param")
    private DiyOneYuanParam diyOneYuanParam;

    /**
     * 大促会场集合页参数
     */
    @JsonProperty("diy_promotion_act_collection_param")
    private DiyPromotionActCollectionParam diyPromotionActCollectionParam;

    /**
     * 红包自定义参数，json格式
     */
    @JsonProperty("diy_red_packet_param")
    private DiyRedPacketParam diyRedPacketParam;

    /**
     * 超级红包自定义参数，json格式
     */
    @JsonProperty("diy_sp_red_packet_param")
    private DiySpRedPacketParam diySpRedPacketParam;

    /**
     * 扩展参数
     */
    @JsonProperty("ext_params")
    private Map<String, String> extParams;

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
     * 是否生成微信shortLink，该字段支持超红c端活动页、超红二合一、b端推品页，单个渠道每天生成的shortLink数量有限，请合理生成shortLink链接
     */
    @JsonProperty("generate_short_link")
    private Boolean generateShortLink;

    /**
     * 是否生成短链接。true-是，false-否，默认false
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * 是否生成拼多多福利券微信小程序推广信息
     */
    @JsonProperty("generate_we_app")
    private Boolean generateWeApp;

    /**
     * 推广位列表，长度最大为1，例如：["60005_612"]。活动页生链要求传入授权备案信息，不支持批量生链。
     */
    @JsonProperty("p_id_list")
    private List<String> pIdList;

    /**
     * 刮刮卡指定金额（单位分），可指定2-100元间数值，即有效区间为：[200,10000]
     */
    @JsonProperty("scratch_card_amount")
    private Long scratchCardAmount;

    /**
     * 千万神券C端生链扩展参数 支持置顶活动ID 和 置顶商品(品牌活动才支持)
     */
    @JsonProperty("tmcc_param")
    private TmccParam tmccParam;

    /**
     * 招商DuoID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

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
        return "pdd.ddk.rp.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkRpPromUrlGenerateResponse> getResponseClass() {
        return PddDdkRpPromUrlGenerateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "amount", amount);
        setUserParam(params, "channel_type", channelType);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "diy_one_yuan_param", diyOneYuanParam);
        setUserParam(params, "diy_promotion_act_collection_param", diyPromotionActCollectionParam);
        setUserParam(params, "diy_red_packet_param", diyRedPacketParam);
        setUserParam(params, "diy_sp_red_packet_param", diySpRedPacketParam);
        setUserParam(params, "ext_params", extParams);
        setUserParam(params, "generate_qq_app", generateQqApp);
        setUserParam(params, "generate_schema_url", generateSchemaUrl);
        setUserParam(params, "generate_short_link", generateShortLink);
        setUserParam(params, "generate_short_url", generateShortUrl);
        setUserParam(params, "generate_we_app", generateWeApp);
        setUserParam(params, "p_id_list", pIdList);
        setUserParam(params, "scratch_card_amount", scratchCardAmount);
        setUserParam(params, "tmcc_param", tmccParam);
        setUserParam(params, "zs_duo_id", zsDuoId);
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setDiyOneYuanParam(DiyOneYuanParam diyOneYuanParam) {
        this.diyOneYuanParam = diyOneYuanParam;
    }

    public void setDiyPromotionActCollectionParam(DiyPromotionActCollectionParam diyPromotionActCollectionParam) {
        this.diyPromotionActCollectionParam = diyPromotionActCollectionParam;
    }

    public void setDiyRedPacketParam(DiyRedPacketParam diyRedPacketParam) {
        this.diyRedPacketParam = diyRedPacketParam;
    }

    public void setDiySpRedPacketParam(DiySpRedPacketParam diySpRedPacketParam) {
        this.diySpRedPacketParam = diySpRedPacketParam;
    }

    public void setExtParams(Map<String, String> extParams) {
        this.extParams = extParams;
    }

    public void setGenerateQqApp(Boolean generateQqApp) {
        this.generateQqApp = generateQqApp;
    }

    public void setGenerateSchemaUrl(Boolean generateSchemaUrl) {
        this.generateSchemaUrl = generateSchemaUrl;
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

    public void setPIdList(List<String> pIdList) {
        this.pIdList = pIdList;
    }

    public void setScratchCardAmount(Long scratchCardAmount) {
        this.scratchCardAmount = scratchCardAmount;
    }

    public void setTmccParam(TmccParam tmccParam) {
        this.tmccParam = tmccParam;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public static class DiyOneYuanParam {

        /**
         * 商品goodsSign，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        public void setGoodsSign(String goodsSign) {
            this.goodsSign = goodsSign;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DiyPromotionActCollectionParam {

        /**
         * 集合id 不传默认使用最新的大促会场集合
         */
        @JsonProperty("collection_id")
        private Long collectionId;

        public void setCollectionId(Long collectionId) {
            this.collectionId = collectionId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DiyRedPacketParam {

        /**
         * 红包金额列表，200、300、500、1000、2000，单位分。红包金额和红包抵后价设置只能二选一，默认设置了红包金额会忽略红包抵后价设置
         */
        @JsonProperty("amount_probability")
        private List<Long> amountProbability;

        /**
         * 设置玩法，false-现金红包, true-现金券
         */
        @JsonProperty("dis_text")
        private Boolean disText;

        /**
         * 推广页设置，false-红包开启页, true-红包领取页
         */
        @JsonProperty("not_show_background")
        private Boolean notShowBackground;

        /**
         * 优先展示类目
         */
        @JsonProperty("opt_id")
        private Integer optId;

        /**
         * 自定义红包抵后价和商品佣金区间对象数组
         */
        @JsonProperty("range_items")
        private List<DiyRedPacketParamRangeItemsItem> rangeItems;

        public void setAmountProbability(List<Long> amountProbability) {
            this.amountProbability = amountProbability;
        }

        public void setDisText(Boolean disText) {
            this.disText = disText;
        }

        public void setNotShowBackground(Boolean notShowBackground) {
            this.notShowBackground = notShowBackground;
        }

        public void setOptId(Integer optId) {
            this.optId = optId;
        }

        public void setRangeItems(List<DiyRedPacketParamRangeItemsItem> rangeItems) {
            this.rangeItems = rangeItems;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DiyRedPacketParamRangeItemsItem {

        /**
         * 区间的开始值
         */
        @JsonProperty("range_from")
        private Long rangeFrom;

        /**
         * range_id为1表示红包抵后价（单位分）， range_id为2表示佣金比例（单位千分之几)
         */
        @JsonProperty("range_id")
        private Integer rangeId;

        /**
         * 区间的结束值
         */
        @JsonProperty("range_to")
        private Long rangeTo;

        public void setRangeFrom(Long rangeFrom) {
            this.rangeFrom = rangeFrom;
        }

        public void setRangeId(Integer rangeId) {
            this.rangeId = rangeId;
        }

        public void setRangeTo(Long rangeTo) {
            this.rangeTo = rangeTo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DiySpRedPacketParam {

        /**
         * 商品goodsSign，支持通过goodsSign置顶落地页商品。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        /**
         * 商品skuId密文，支持自动选中对应sku
         */
        @JsonProperty("sku_id_code")
        private String skuIdCode;

        public void setGoodsSign(String goodsSign) {
            this.goodsSign = goodsSign;
        }

        public void setSkuIdCode(String skuIdCode) {
            this.skuIdCode = skuIdCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class TmccParam {

        /**
         * 置顶商品的goodsSign列表
         */
        @JsonProperty("goods_signs")
        private List<String> goodsSigns;

        /**
         * 指定活动id
         */
        @JsonProperty("tmc_config_id")
        private Long tmcConfigId;

        public void setGoodsSigns(List<String> goodsSigns) {
            this.goodsSigns = goodsSigns;
        }

        public void setTmcConfigId(Long tmcConfigId) {
            this.tmcConfigId = tmcConfigId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}