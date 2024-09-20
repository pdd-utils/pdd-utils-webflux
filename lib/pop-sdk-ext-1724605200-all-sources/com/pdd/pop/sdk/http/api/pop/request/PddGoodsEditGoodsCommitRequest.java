package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsEditGoodsCommitResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsEditGoodsCommitRequest extends PopBaseHttpRequest<PddGoodsEditGoodsCommitResponse> {

    /**
     * 是否自动补充标品属性
     */
    @JsonProperty("auto_fill_spu_property")
    private Boolean autoFillSpuProperty;

    /**
     * 坏果包赔
     */
    @JsonProperty("bad_fruit_claim")
    private Integer badFruitClaim;

    /**
     * 限购次数
     */
    @JsonProperty("buy_limit")
    private Long buyLimit;

    /**
     * 商品轮播图，按次序上传，图片格式支持JPEG/JPG/PNG， 图片尺寸长宽比1：1且尺寸不低于480px，图片大小最高1MB
     */
    @JsonProperty("carousel_gallery")
    private List<String> carouselGallery;

    /**
     * 商品视频
     */
    @JsonProperty("carousel_video")
    private List<CarouselVideoItem> carouselVideo;

    /**
     * 轮播视频
     */
    @JsonProperty("carousel_video_url")
    private String carouselVideoUrl;

    /**
     * 叶子类目ID
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 物流运费模板ID，可使用pdd.logistics.template.get获取
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

    /**
     * 地区/国家ID，0-中国，暂时只传0（普通商品）
     */
    @JsonProperty("country_id")
    private Integer countryId;

    /**
     * 团购人数
     */
    @JsonProperty("customer_num")
    private Long customerNum;

    /**
     * 海关名称，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    @JsonProperty("customs")
    private String customs;

    /**
     * 是否当日发货,0 否，1 是
     */
    @JsonProperty("delivery_one_day")
    private Integer deliveryOneDay;

    /**
     * 发货方式。0：无物流发货；1：有物流发货。
     */
    @JsonProperty("delivery_type")
    private Integer deliveryType;

    /**
     * 商品详情图：
     * a. 尺寸要求宽度处于480~1200px之间，高度0-1500px之间
     * b. 大小1M以内
     * c. 数量限制在20张之间
     * d. 图片格式仅支持JPG,PNG格式
     * e. 点击上传时，支持批量上传详情图
     */
    @JsonProperty("detail_gallery")
    private List<String> detailGallery;

    /**
     * 卡券类商品属性
     */
    @JsonProperty("elec_goods_attributes")
    private ElecGoodsAttributes elecGoodsAttributes;

    /**
     * 商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
     */
    @JsonProperty("goods_desc")
    private String goodsDesc;

    /**
     * 商品标题，例如，新疆特产 红满疆枣夹核桃500g
     */
    @JsonProperty("goods_name")
    private String goodsName;

    /**
     * 商品属性列表
     */
    @JsonProperty("goods_properties")
    private List<GoodsPropertiesItem> goodsProperties;

    /**
     * 日历商品交易相关信息
     */
    @JsonProperty("goods_trade_attr")
    private GoodsTradeAttr goodsTradeAttr;

    /**
     * 商品出行信息
     */
    @JsonProperty("goods_travel_attr")
    private GoodsTravelAttr goodsTravelAttr;

    /**
     * 1-国内普通商品，2-一般贸易，3-保税仓BBC直供，4-海外BC直邮 ,5-流量 ,6-话费 ,7-优惠券 ,8-QQ充值 ,9-加油卡，15-商家卡券，18-海外CC行邮 19-平台卡券
     */
    @JsonProperty("goods_type")
    private Integer goodsType;

    /**
     * 商品主图，请参考拼多多首页大图，如果商品参加部分活动则必填，否则无法参加活动
     * a. 尺寸750 x 352px
     * b. 大小100k以内
     * c. 图片格式仅支持JPG,PNG格式
     * d. 图片背景应以纯白为主, 商品图案居中显示
     * e. 图片不可以添加任何品牌相关文字或logo
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * 是否支持正品发票；0-不支持、1-支持
     */
    @JsonProperty("invoice_status")
    private Integer invoiceStatus;

    /**
     * 是否需要上报海关，现阶段入参默认false，入参true会失败
     */
    @JsonProperty("is_customs")
    private Boolean isCustoms;

    /**
     * 是否支持假一赔十，false-不支持，true-支持
     */
    @JsonProperty("is_folt")
    private Boolean isFolt;

    /**
     * 是否成团预售。0：不是；1:是。
     */
    @JsonProperty("is_group_pre_sale")
    private Integer isGroupPreSale;

    /**
     * 是否预售,true-预售商品，false-非预售商品
     */
    @JsonProperty("is_pre_sale")
    private Boolean isPreSale;

    /**
     * 是否7天无理由退换货，true-支持，false-不支持
     */
    @JsonProperty("is_refundable")
    private Boolean isRefundable;

    /**
     * 是否sku预售，1：是，0：否
     */
    @JsonProperty("is_sku_pre_sale")
    private Integer isSkuPreSale;

    /**
     * 缺重包退
     */
    @JsonProperty("lack_of_weight_claim")
    private Integer lackOfWeightClaim;

    /**
     * 本地服务id
     */
    @JsonProperty("local_service_id_list")
    private List<Integer> localServiceIdList;

    /**
     * 买家自提模版id
     */
    @JsonProperty("mai_jia_zi_ti")
    private String maiJiaZiTi;

    /**
     * 参考价格，单位为分
     */
    @JsonProperty("market_price")
    private Long marketPrice;

    /**
     * 单次限量
     */
    @JsonProperty("order_limit")
    private Long orderLimit;

    /**
     * 原产地id，是指海淘商品的生产地址，仅在goods type=3/4的时候必填，可以通过pdd.goods.country.get获取
     */
    @JsonProperty("origin_country_id")
    private Integer originCountryId;

    /**
     * 商品goods外部编码
     */
    @JsonProperty("out_goods_id")
    private String outGoodsId;

    /**
     * 第三方商品Id
     */
    @JsonProperty("out_source_goods_id")
    private String outSourceGoodsId;

    /**
     * 第三方商品来源
     */
    @JsonProperty("out_source_type")
    private Integer outSourceType;

    /**
     * {
     * 	"consumption_tax_rate": 1,
     * 	"value_added_tax_rate": 9,
     * 	"hs_code": "2200",
     * 	"customs_broker": "sss",
     * 	"customs_declaration_method": 1,
     * 	"bonded_warehouse": "sss",
     * 	"bonded_warehouse_key": "pp"
     * }
     */
    @JsonProperty("oversea_goods")
    private OverseaGoods overseaGoods;

    /**
     * oversea_type
     */
    @JsonProperty("oversea_type")
    private Integer overseaType;

    /**
     * 预售时间，is_pre_sale为1时必传，UNIX时间戳
     */
    @JsonProperty("pre_sale_time")
    private Long preSaleTime;

    /**
     * 0：不支持全国联保；1：支持全国联保
     */
    @JsonProperty("quan_guo_lian_bao")
    private Integer quanGuoLianBao;

    /**
     * 是否二手商品，true -二手商品 ，false-全新商品
     */
    @JsonProperty("second_hand")
    private Boolean secondHand;

    /**
     * 上门安装模版id
     */
    @JsonProperty("shang_men_an_zhuang")
    private String shangMenAnZhuang;

    /**
     * 承诺发货时间（ 秒），48小时或24小时，is_pre_sale为1时不必传
     */
    @JsonProperty("shipment_limit_second")
    private Long shipmentLimitSecond;

    /**
     * 门店组id
     */
    @JsonProperty("shop_group_id")
    private Long shopGroupId;

    /**
     * 尺码表id
     */
    @JsonProperty("size_spec_id")
    private Long sizeSpecId;

    /**
     * sku对象列表,实例：[{
     * 	"is_onsale": 1,
     * 	"limit_quantity": 999,
     * 	"price": "2200",
     * 	"weight": 1000,
     * 	"multi_price": "1900",
     * 	"thumb_url": "http: t06img.yangkeduo.com/images/2018-04-15/ced035033b5d40b589140af882621c03.jpg",
     * 	"out_sku_sn": "L",
     * 	"quantity": 100,
     * 	"spec_id_list": "[25]",
     * 	"oversea_sku": {
     * 		"measurement_code": "计量单位编码",
     * 		"taxation": "税费",
     * 		"specifications": "规格"
     * 	}
     * }]
     */
    @JsonProperty("sku_list")
    private List<SkuListItem> skuList;

    /**
     * 库存方式（0：普通型，1：日历型）
     */
    @JsonProperty("sku_type")
    private Integer skuType;

    /**
     * 送货入户并安装模版id
     */
    @JsonProperty("song_huo_an_zhuang")
    private String songHuoAnZhuang;

    /**
     * 送货入户模版id
     */
    @JsonProperty("song_huo_ru_hu")
    private String songHuoRuHu;

    /**
     * 商品短标题（仅在部分活动中生效），字数限制为4-20字
     */
    @JsonProperty("tiny_name")
    private String tinyName;

    /**
     * 满2件折扣，可选范围0-100, 0表示取消，95表示95折，设置需先查询规则接口获取实际可填范围
     */
    @JsonProperty("two_pieces_discount")
    private Integer twoPiecesDiscount;

    /**
     * 保税仓，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * 水果类目温馨提示，只在水果类目商品才生效， 字数限制：商品描述goods_desc+温馨提示总计不超过500字。
     */
    @JsonProperty("warm_tips")
    private String warmTips;

    /**
     * 只换不修的天数，目前只支持0和365
     */
    @JsonProperty("zhi_huan_bu_xiu")
    private Integer zhiHuanBuXiu;

    /**
     * 保密发货，0:不支持，1:支持
     */
    @JsonProperty("privacy_delivery")
    private Integer privacyDelivery;

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
        return "pdd.goods.edit.goods.commit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsEditGoodsCommitResponse> getResponseClass() {
        return PddGoodsEditGoodsCommitResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "auto_fill_spu_property", autoFillSpuProperty);
        setUserParam(params, "bad_fruit_claim", badFruitClaim);
        setUserParam(params, "buy_limit", buyLimit);
        setUserParam(params, "carousel_gallery", carouselGallery);
        setUserParam(params, "carousel_video", carouselVideo);
        setUserParam(params, "carousel_video_url", carouselVideoUrl);
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "cost_template_id", costTemplateId);
        setUserParam(params, "country_id", countryId);
        setUserParam(params, "customer_num", customerNum);
        setUserParam(params, "customs", customs);
        setUserParam(params, "delivery_one_day", deliveryOneDay);
        setUserParam(params, "delivery_type", deliveryType);
        setUserParam(params, "detail_gallery", detailGallery);
        setUserParam(params, "elec_goods_attributes", elecGoodsAttributes);
        setUserParam(params, "goods_desc", goodsDesc);
        setUserParam(params, "goods_name", goodsName);
        setUserParam(params, "goods_properties", goodsProperties);
        setUserParam(params, "goods_trade_attr", goodsTradeAttr);
        setUserParam(params, "goods_travel_attr", goodsTravelAttr);
        setUserParam(params, "goods_type", goodsType);
        setUserParam(params, "image_url", imageUrl);
        setUserParam(params, "invoice_status", invoiceStatus);
        setUserParam(params, "is_customs", isCustoms);
        setUserParam(params, "is_folt", isFolt);
        setUserParam(params, "is_group_pre_sale", isGroupPreSale);
        setUserParam(params, "is_pre_sale", isPreSale);
        setUserParam(params, "is_refundable", isRefundable);
        setUserParam(params, "is_sku_pre_sale", isSkuPreSale);
        setUserParam(params, "lack_of_weight_claim", lackOfWeightClaim);
        setUserParam(params, "local_service_id_list", localServiceIdList);
        setUserParam(params, "mai_jia_zi_ti", maiJiaZiTi);
        setUserParam(params, "market_price", marketPrice);
        setUserParam(params, "order_limit", orderLimit);
        setUserParam(params, "origin_country_id", originCountryId);
        setUserParam(params, "out_goods_id", outGoodsId);
        setUserParam(params, "out_source_goods_id", outSourceGoodsId);
        setUserParam(params, "out_source_type", outSourceType);
        setUserParam(params, "oversea_goods", overseaGoods);
        setUserParam(params, "oversea_type", overseaType);
        setUserParam(params, "pre_sale_time", preSaleTime);
        setUserParam(params, "quan_guo_lian_bao", quanGuoLianBao);
        setUserParam(params, "second_hand", secondHand);
        setUserParam(params, "shang_men_an_zhuang", shangMenAnZhuang);
        setUserParam(params, "shipment_limit_second", shipmentLimitSecond);
        setUserParam(params, "shop_group_id", shopGroupId);
        setUserParam(params, "size_spec_id", sizeSpecId);
        setUserParam(params, "sku_list", skuList);
        setUserParam(params, "sku_type", skuType);
        setUserParam(params, "song_huo_an_zhuang", songHuoAnZhuang);
        setUserParam(params, "song_huo_ru_hu", songHuoRuHu);
        setUserParam(params, "tiny_name", tinyName);
        setUserParam(params, "two_pieces_discount", twoPiecesDiscount);
        setUserParam(params, "warehouse", warehouse);
        setUserParam(params, "warm_tips", warmTips);
        setUserParam(params, "zhi_huan_bu_xiu", zhiHuanBuXiu);
        setUserParam(params, "privacy_delivery", privacyDelivery);
    }

    public void setAutoFillSpuProperty(Boolean autoFillSpuProperty) {
        this.autoFillSpuProperty = autoFillSpuProperty;
    }

    public void setBadFruitClaim(Integer badFruitClaim) {
        this.badFruitClaim = badFruitClaim;
    }

    public void setBuyLimit(Long buyLimit) {
        this.buyLimit = buyLimit;
    }

    public void setCarouselGallery(List<String> carouselGallery) {
        this.carouselGallery = carouselGallery;
    }

    public void setCarouselVideo(List<CarouselVideoItem> carouselVideo) {
        this.carouselVideo = carouselVideo;
    }

    public void setCarouselVideoUrl(String carouselVideoUrl) {
        this.carouselVideoUrl = carouselVideoUrl;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public void setCustomerNum(Long customerNum) {
        this.customerNum = customerNum;
    }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    public void setDeliveryOneDay(Integer deliveryOneDay) {
        this.deliveryOneDay = deliveryOneDay;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void setDetailGallery(List<String> detailGallery) {
        this.detailGallery = detailGallery;
    }

    public void setElecGoodsAttributes(ElecGoodsAttributes elecGoodsAttributes) {
        this.elecGoodsAttributes = elecGoodsAttributes;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsProperties(List<GoodsPropertiesItem> goodsProperties) {
        this.goodsProperties = goodsProperties;
    }

    public void setGoodsTradeAttr(GoodsTradeAttr goodsTradeAttr) {
        this.goodsTradeAttr = goodsTradeAttr;
    }

    public void setGoodsTravelAttr(GoodsTravelAttr goodsTravelAttr) {
        this.goodsTravelAttr = goodsTravelAttr;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setIsCustoms(Boolean isCustoms) {
        this.isCustoms = isCustoms;
    }

    public void setIsFolt(Boolean isFolt) {
        this.isFolt = isFolt;
    }

    public void setIsGroupPreSale(Integer isGroupPreSale) {
        this.isGroupPreSale = isGroupPreSale;
    }

    public void setIsPreSale(Boolean isPreSale) {
        this.isPreSale = isPreSale;
    }

    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    public void setIsSkuPreSale(Integer isSkuPreSale) {
        this.isSkuPreSale = isSkuPreSale;
    }

    public void setLackOfWeightClaim(Integer lackOfWeightClaim) {
        this.lackOfWeightClaim = lackOfWeightClaim;
    }

    public void setLocalServiceIdList(List<Integer> localServiceIdList) {
        this.localServiceIdList = localServiceIdList;
    }

    public void setMaiJiaZiTi(String maiJiaZiTi) {
        this.maiJiaZiTi = maiJiaZiTi;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setOrderLimit(Long orderLimit) {
        this.orderLimit = orderLimit;
    }

    public void setOriginCountryId(Integer originCountryId) {
        this.originCountryId = originCountryId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    public void setOutSourceGoodsId(String outSourceGoodsId) {
        this.outSourceGoodsId = outSourceGoodsId;
    }

    public void setOutSourceType(Integer outSourceType) {
        this.outSourceType = outSourceType;
    }

    public void setOverseaGoods(OverseaGoods overseaGoods) {
        this.overseaGoods = overseaGoods;
    }

    public void setOverseaType(Integer overseaType) {
        this.overseaType = overseaType;
    }

    public void setPreSaleTime(Long preSaleTime) {
        this.preSaleTime = preSaleTime;
    }

    public void setQuanGuoLianBao(Integer quanGuoLianBao) {
        this.quanGuoLianBao = quanGuoLianBao;
    }

    public void setSecondHand(Boolean secondHand) {
        this.secondHand = secondHand;
    }

    public void setShangMenAnZhuang(String shangMenAnZhuang) {
        this.shangMenAnZhuang = shangMenAnZhuang;
    }

    public void setShipmentLimitSecond(Long shipmentLimitSecond) {
        this.shipmentLimitSecond = shipmentLimitSecond;
    }

    public void setShopGroupId(Long shopGroupId) {
        this.shopGroupId = shopGroupId;
    }

    public void setSizeSpecId(Long sizeSpecId) {
        this.sizeSpecId = sizeSpecId;
    }

    public void setSkuList(List<SkuListItem> skuList) {
        this.skuList = skuList;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public void setSongHuoAnZhuang(String songHuoAnZhuang) {
        this.songHuoAnZhuang = songHuoAnZhuang;
    }

    public void setSongHuoRuHu(String songHuoRuHu) {
        this.songHuoRuHu = songHuoRuHu;
    }

    public void setTinyName(String tinyName) {
        this.tinyName = tinyName;
    }

    public void setTwoPiecesDiscount(Integer twoPiecesDiscount) {
        this.twoPiecesDiscount = twoPiecesDiscount;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setWarmTips(String warmTips) {
        this.warmTips = warmTips;
    }

    public void setZhiHuanBuXiu(Integer zhiHuanBuXiu) {
        this.zhiHuanBuXiu = zhiHuanBuXiu;
    }

    public void setPrivacyDelivery(Integer privacyDelivery) {
        this.privacyDelivery = privacyDelivery;
    }

    public static class CarouselVideoItem {

        /**
         * 商品视频id
         */
        @JsonProperty("file_id")
        private Long fileId;

        /**
         * 商品视频url
         */
        @JsonProperty("video_url")
        private String videoUrl;

        public void setFileId(Long fileId) {
            this.fileId = fileId;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ElecGoodsAttributes {

        /**
         * 开始时间（timeType=1时必填表示核销的开始时间）（精确到毫秒）
         */
        @JsonProperty("begin_time")
        private Long beginTime;

        /**
         * 天数内有效（timeType=3必填，表示发货后几天内核销）
         */
        @JsonProperty("days_time")
        private Integer daysTime;

        /**
         * 截止时间（timeType=1,2时必填，表示发货后核销的截止时间）（精确到毫秒
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 卡券核销类型（1：起始时间内有效，2：发货后后至截止时间内有效，3：发货后多少天内有效）
         */
        @JsonProperty("time_type")
        private Integer timeType;

        public void setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
        }

        public void setDaysTime(Integer daysTime) {
            this.daysTime = daysTime;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public void setTimeType(Integer timeType) {
            this.timeType = timeType;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class GoodsPropertiesItem {

        /**
         * 组id，非销售属性不用传
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 图片url，非销售属性不用传
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 备注，非销售属性不用传
         */
        @JsonProperty("note")
        private String note;

        /**
         * 父属性id，非销售属性不用传
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 引用属性ID
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性id，非销售属性不用传
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 模板属性id
         */
        @JsonProperty("template_pid")
        private Long templatePid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public void setParentSpecId(Long parentSpecId) {
            this.parentSpecId = parentSpecId;
        }

        public void setRefPid(Long refPid) {
            this.refPid = refPid;
        }

        public void setSpecId(Long specId) {
            this.specId = specId;
        }

        public void setTemplatePid(Long templatePid) {
            this.templatePid = templatePid;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
        }

        public void setVid(Long vid) {
            this.vid = vid;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class GoodsTradeAttr {

        /**
         * 提前预定天数，默认为0表示当天可预定
         */
        @JsonProperty("advances_days")
        private Integer advancesDays;

        /**
         * 预订须知
         */
        @JsonProperty("booking_notes")
        private GoodsTradeAttrBookingNotes bookingNotes;

        /**
         * 卡券有效期，日历日期后多少天可用。默认值为0表示仅限日历日当天使用
         */
        @JsonProperty("life_span")
        private Integer lifeSpan;

        public void setAdvancesDays(Integer advancesDays) {
            this.advancesDays = advancesDays;
        }

        public void setBookingNotes(GoodsTradeAttrBookingNotes bookingNotes) {
            this.bookingNotes = bookingNotes;
        }

        public void setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class GoodsTradeAttrBookingNotes {

        /**
         * 预定须知图片地址
         */
        @JsonProperty("url")
        private String url;

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class GoodsTravelAttr {

        /**
         * 出行人是否必填（默认是）
         */
        @JsonProperty("need_tourist")
        private Boolean needTourist;

        /**
         * 日历商品类型1:旅行类,2:住宿类,3:票务类
         */
        @JsonProperty("type")
        private Integer type;

        public void setNeedTourist(Boolean needTourist) {
            this.needTourist = needTourist;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class OverseaGoods {

        /**
         * 保税仓唯一标识
         */
        @JsonProperty("bonded_warehouse_key")
        private String bondedWarehouseKey;

        /**
         * 消费税率
         */
        @JsonProperty("consumption_tax_rate")
        private Integer consumptionTaxRate;

        /**
         * 清关服务商
         */
        @JsonProperty("customs_broker")
        private String customsBroker;

        /**
         * 海关编号
         */
        @JsonProperty("hs_code")
        private String hsCode;

        /**
         * 增值税率
         */
        @JsonProperty("value_added_tax_rate")
        private Integer valueAddedTaxRate;

        public void setBondedWarehouseKey(String bondedWarehouseKey) {
            this.bondedWarehouseKey = bondedWarehouseKey;
        }

        public void setConsumptionTaxRate(Integer consumptionTaxRate) {
            this.consumptionTaxRate = consumptionTaxRate;
        }

        public void setCustomsBroker(String customsBroker) {
            this.customsBroker = customsBroker;
        }

        public void setHsCode(String hsCode) {
            this.hsCode = hsCode;
        }

        public void setValueAddedTaxRate(Integer valueAddedTaxRate) {
            this.valueAddedTaxRate = valueAddedTaxRate;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SkuListItem {

        /**
         * sku上架状态，0-已下架，1-上架中
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku送装参数：长度
         */
        @JsonProperty("length")
        private Long length;

        /**
         * sku购买限制，只入参999
         */
        @JsonProperty("limit_quantity")
        private Long limitQuantity;

        /**
         * 商品团购价格
         */
        @JsonProperty("multi_price")
        private Long multiPrice;

        /**
         * 商品sku外部编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 第三方sku Id
         */
        @JsonProperty("out_source_sku_id")
        private String outSourceSkuId;

        /**
         * oversea_sku
         */
        @JsonProperty("oversea_sku")
        private SkuListItemOverseaSku overseaSku;

        /**
         * 商品单买价格
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 商品sku库存初始数量，后续库存update只使用stocks.update接口进行调用
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * sku预售时间戳，单位秒；不更新传null，取消传0，更新传实际值
         */
        @JsonProperty("sku_pre_sale_time")
        private Integer skuPreSaleTime;

        /**
         * sku属性
         */
        @JsonProperty("sku_properties")
        private List<SkuListItemSkuPropertiesItem> skuProperties;

        /**
         * 商品规格列表，根据pdd.goods.spec.id.get生成的规格属性id，例如：颜色规格下商家新增白色和黑色，大小规格下商家新增L和XL，则由4种spec组合，入参一种组合即可，在skulist中需要有4个spec组合的sku
         */
        @JsonProperty("spec_id_list")
        private String specIdList;

        /**
         * sku预览图，预览图尺寸：等宽高，且高度不低于480px，现已支持1M大小，越清晰越好卖，SKU预览图格式：仅支持JPG,PNG格式
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 重量，单位为g
         */
        @JsonProperty("weight")
        private Long weight;

        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        public void setLength(Long length) {
            this.length = length;
        }

        public void setLimitQuantity(Long limitQuantity) {
            this.limitQuantity = limitQuantity;
        }

        public void setMultiPrice(Long multiPrice) {
            this.multiPrice = multiPrice;
        }

        public void setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
        }

        public void setOutSourceSkuId(String outSourceSkuId) {
            this.outSourceSkuId = outSourceSkuId;
        }

        public void setOverseaSku(SkuListItemOverseaSku overseaSku) {
            this.overseaSku = overseaSku;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public void setSkuPreSaleTime(Integer skuPreSaleTime) {
            this.skuPreSaleTime = skuPreSaleTime;
        }

        public void setSkuProperties(List<SkuListItemSkuPropertiesItem> skuProperties) {
            this.skuProperties = skuProperties;
        }

        public void setSpecIdList(String specIdList) {
            this.specIdList = specIdList;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public void setWeight(Long weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SkuListItemOverseaSku {

        /**
         * 计量单位编码，从接口pdd.gooods.sku.measurement.list获取code
         */
        @JsonProperty("measurement_code")
        private String measurementCode;

        /**
         * 规格
         */
        @JsonProperty("specifications")
        private String specifications;

        /**
         * 税费
         */
        @JsonProperty("taxation")
        private Integer taxation;

        public void setMeasurementCode(String measurementCode) {
            this.measurementCode = measurementCode;
        }

        public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public void setTaxation(Integer taxation) {
            this.taxation = taxation;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SkuListItemSkuPropertiesItem {

        /**
         * 属性单位
         */
        @JsonProperty("punit")
        private String punit;

        /**
         * 属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public void setPunit(String punit) {
            this.punit = punit;
        }

        public void setRefPid(Long refPid) {
            this.refPid = refPid;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setVid(Long vid) {
            this.vid = vid;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}