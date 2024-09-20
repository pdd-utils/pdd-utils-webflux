package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCommitDetailGetResponse extends PopBaseHttpResponse {

    /**
     * 返回response
     */
    @JsonProperty("goods_commit_detail_response")
    private GoodsCommitDetailResponse goodsCommitDetailResponse;

    public GoodsCommitDetailResponse getGoodsCommitDetailResponse() {
        return goodsCommitDetailResponse;
    }

    public static class GoodsCommitDetailResponse {

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
         * 商品轮播图列表
         */
        @JsonProperty("carousel_gallery_list")
        private List<String> carouselGalleryList;

        /**
         * 商品视频
         */
        @JsonProperty("carousel_video")
        private List<GoodsCommitDetailResponseCarouselVideoItem> carouselVideo;

        /**
         * 轮播视频
         */
        @JsonProperty("carousel_video_url")
        private Integer carouselVideoUrl;

        /**
         * 类目id
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 驳回原因，仅在status=2时返回，其余状态返回空值
         */
        @JsonProperty("commit_message")
        private String commitMessage;

        /**
         * 运费模版id
         */
        @JsonProperty("cost_template_id")
        private Long costTemplateId;

        /**
         * 地区/国家id
         */
        @JsonProperty("country_id")
        private Long countryId;

        /**
         * 团购人数
         */
        @JsonProperty("customer_num")
        private Long customerNum;

        /**
         * 海关名称
         */
        @JsonProperty("customs")
        private String customs;

        /**
         * 是否删除
         */
        @JsonProperty("deleted")
        private Integer deleted;

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
         * 商品详情图
         */
        @JsonProperty("detail_gallery_list")
        private List<String> detailGalleryList;

        /**
         * 卡券类商品属性
         */
        @JsonProperty("elec_goods_attributes")
        private GoodsCommitDetailResponseElecGoodsAttributes elecGoodsAttributes;

        /**
         * 提交申请的序列ID
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品属性列表
         */
        @JsonProperty("goods_property_list")
        private List<GoodsCommitDetailResponseGoodsPropertyListItem> goodsPropertyList;

        /**
         * 商品状态，枚举：0-编辑中，1-待审核，2-审核通过，3-审核驳回
         */
        @JsonProperty("goods_status")
        private Integer goodsStatus;

        /**
         * 日历商品交易相关信息
         */
        @JsonProperty("goods_trade_attr")
        private GoodsCommitDetailResponseGoodsTradeAttr goodsTradeAttr;

        /**
         * 商品出行信息
         */
        @JsonProperty("goods_travel_attr")
        private GoodsCommitDetailResponseGoodsTravelAttr goodsTravelAttr;

        /**
         * 商品类型：1-国内普通商品，2-一般贸易，3-保税仓BBC直供，4-海外BC直邮 ,5-流量 ,6-话费 ,7-优惠券 ,8-QQ充值 ,9-加油卡，15-商家卡券，18-海外CC行邮 19-平台卡券
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 商品主图
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 是否支持正品发票；0-不支持、1-支持
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 是否需要上报海关 0:否 1:是
         */
        @JsonProperty("is_customs")
        private Integer isCustoms;

        /**
         * 是否支持假一赔十，0-不支持，1-支持
         */
        @JsonProperty("is_folt")
        private Integer isFolt;

        /**
         * 是否成团预售。0：不是；1:是。
         */
        @JsonProperty("is_group_pre_sale")
        private Integer isGroupPreSale;

        /**
         * 是否预售,true-预售商品，false-非预售商品
         */
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;

        /**
         * 是否7天无理由退换货，1-支持，0-不支持
         */
        @JsonProperty("is_refundable")
        private Integer isRefundable;

        /**
         * 是否sku预售，0：否，1：是
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
         * 原产地id，是指海淘商品的生产地址
         */
        @JsonProperty("origin_country_id")
        private Integer originCountryId;

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
         * 商家编码（商品维度），同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商家编码（goods维度）
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * oversea_goods
         */
        @JsonProperty("oversea_goods")
        private GoodsCommitDetailResponseOverseaGoods overseaGoods;

        /**
         * oversea_type
         */
        @JsonProperty("oversea_type")
        private Integer overseaType;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private Long preSaleTime;

        /**
         * 0：不支持全国联保；1：支持全国联保
         */
        @JsonProperty("quan_guo_lian_bao")
        private Integer quanGuoLianBao;

        /**
         * 是否二手
         */
        @JsonProperty("second_hand")
        private Integer secondHand;

        /**
         * 上门安装模版id
         */
        @JsonProperty("shang_men_an_zhuang")
        private String shangMenAnZhuang;

        /**
         * 承诺发货时间（ 秒）
         */
        @JsonProperty("shipment_limit_second")
        private Long shipmentLimitSecond;

        /**
         * 门店组id
         */
        @JsonProperty("shop_group_id")
        private Long shopGroupId;

        /**
         * 门店组名称
         */
        @JsonProperty("shop_group_name")
        private String shopGroupName;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<GoodsCommitDetailResponseSkuListItem> skuList;

        /**
         * 日历商品库存方式（0：普通型，1：日历型）
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
         * 新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
         */
        @JsonProperty("tiny_name")
        private String tinyName;

        /**
         * 满2件折扣，可选范围0-100, 0表示取消，95表示95折，设置需先查询规则接口获取实际可填范围
         */
        @JsonProperty("two_pieces_discount")
        private Integer twoPiecesDiscount;

        /**
         * 保税仓
         */
        @JsonProperty("warehouse")
        private String warehouse;

        /**
         * 水果类目温馨提示
         */
        @JsonProperty("warm_tips")
        private String warmTips;

        /**
         * 只换不修的天数，目前只支持0和365
         */
        @JsonProperty("zhi_huan_bu_xiu")
        private Integer zhiHuanBuXiu;

        /**
         * 保密发货，0：不支持，1：支持
         */
        @JsonProperty("privacy_delivery")
        private Integer privacyDelivery;

        public Integer getBadFruitClaim() {
            return badFruitClaim;
        }

        public Long getBuyLimit() {
            return buyLimit;
        }

        public List<String> getCarouselGalleryList() {
            return carouselGalleryList;
        }

        public List<GoodsCommitDetailResponseCarouselVideoItem> getCarouselVideo() {
            return carouselVideo;
        }

        public Integer getCarouselVideoUrl() {
            return carouselVideoUrl;
        }

        public Long getCatId() {
            return catId;
        }

        public String getCommitMessage() {
            return commitMessage;
        }

        public Long getCostTemplateId() {
            return costTemplateId;
        }

        public Long getCountryId() {
            return countryId;
        }

        public Long getCustomerNum() {
            return customerNum;
        }

        public String getCustoms() {
            return customs;
        }

        public Integer getDeleted() {
            return deleted;
        }

        public Integer getDeliveryOneDay() {
            return deliveryOneDay;
        }

        public Integer getDeliveryType() {
            return deliveryType;
        }

        public List<String> getDetailGalleryList() {
            return detailGalleryList;
        }

        public GoodsCommitDetailResponseElecGoodsAttributes getElecGoodsAttributes() {
            return elecGoodsAttributes;
        }

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public List<GoodsCommitDetailResponseGoodsPropertyListItem> getGoodsPropertyList() {
            return goodsPropertyList;
        }

        public Integer getGoodsStatus() {
            return goodsStatus;
        }

        public GoodsCommitDetailResponseGoodsTradeAttr getGoodsTradeAttr() {
            return goodsTradeAttr;
        }

        public GoodsCommitDetailResponseGoodsTravelAttr getGoodsTravelAttr() {
            return goodsTravelAttr;
        }

        public Integer getGoodsType() {
            return goodsType;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Integer getInvoiceStatus() {
            return invoiceStatus;
        }

        public Integer getIsCustoms() {
            return isCustoms;
        }

        public Integer getIsFolt() {
            return isFolt;
        }

        public Integer getIsGroupPreSale() {
            return isGroupPreSale;
        }

        public Integer getIsPreSale() {
            return isPreSale;
        }

        public Integer getIsRefundable() {
            return isRefundable;
        }

        public Integer getIsSkuPreSale() {
            return isSkuPreSale;
        }

        public Integer getLackOfWeightClaim() {
            return lackOfWeightClaim;
        }

        public List<Integer> getLocalServiceIdList() {
            return localServiceIdList;
        }

        public String getMaiJiaZiTi() {
            return maiJiaZiTi;
        }

        public Long getMarketPrice() {
            return marketPrice;
        }

        public Long getOrderLimit() {
            return orderLimit;
        }

        public Integer getOriginCountryId() {
            return originCountryId;
        }

        public String getOutSourceGoodsId() {
            return outSourceGoodsId;
        }

        public Integer getOutSourceType() {
            return outSourceType;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public GoodsCommitDetailResponseOverseaGoods getOverseaGoods() {
            return overseaGoods;
        }

        public Integer getOverseaType() {
            return overseaType;
        }

        public Long getPreSaleTime() {
            return preSaleTime;
        }

        public Integer getQuanGuoLianBao() {
            return quanGuoLianBao;
        }

        public Integer getSecondHand() {
            return secondHand;
        }

        public String getShangMenAnZhuang() {
            return shangMenAnZhuang;
        }

        public Long getShipmentLimitSecond() {
            return shipmentLimitSecond;
        }

        public Long getShopGroupId() {
            return shopGroupId;
        }

        public String getShopGroupName() {
            return shopGroupName;
        }

        public List<GoodsCommitDetailResponseSkuListItem> getSkuList() {
            return skuList;
        }

        public Integer getSkuType() {
            return skuType;
        }

        public String getSongHuoAnZhuang() {
            return songHuoAnZhuang;
        }

        public String getSongHuoRuHu() {
            return songHuoRuHu;
        }

        public String getTinyName() {
            return tinyName;
        }

        public Integer getTwoPiecesDiscount() {
            return twoPiecesDiscount;
        }

        public String getWarehouse() {
            return warehouse;
        }

        public String getWarmTips() {
            return warmTips;
        }

        public Integer getZhiHuanBuXiu() {
            return zhiHuanBuXiu;
        }

        public Integer getPrivacyDelivery() {
            return privacyDelivery;
        }
    }

    public static class GoodsCommitDetailResponseCarouselVideoItem {

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

        public Long getFileId() {
            return fileId;
        }

        public String getVideoUrl() {
            return videoUrl;
        }
    }

    public static class GoodsCommitDetailResponseElecGoodsAttributes {

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
         * 截止时间（timeType=1,2时必填，表示发货后核销的截止时间）（精确到毫秒）
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 卡券核销类型（1：起始时间内有效，2：发货后后至截止时间内有效，3：发货后多少天内有效）
         */
        @JsonProperty("time_type")
        private Integer timeType;

        public Long getBeginTime() {
            return beginTime;
        }

        public Integer getDaysTime() {
            return daysTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public Integer getTimeType() {
            return timeType;
        }
    }

    public static class GoodsCommitDetailResponseGoodsPropertyListItem {

        /**
         * 属性值分组ID
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 图片url
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 备注
         */
        @JsonProperty("note")
        private String note;

        /**
         * 父规格ID
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 属性单位
         */
        @JsonProperty("punit")
        private String punit;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 模板属性Id
         */
        @JsonProperty("template_pid")
        private Long templatePid;

        /**
         * 基础属性值Id
         */
        @JsonProperty("vid")
        private Long vid;

        /**
         * 基础属性值
         */
        @JsonProperty("vvalue")
        private String vvalue;

        public Integer getGroupId() {
            return groupId;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public String getNote() {
            return note;
        }

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getPunit() {
            return punit;
        }

        public Long getRefPid() {
            return refPid;
        }

        public Long getSpecId() {
            return specId;
        }

        public Long getTemplatePid() {
            return templatePid;
        }

        public Long getVid() {
            return vid;
        }

        public String getVvalue() {
            return vvalue;
        }
    }

    public static class GoodsCommitDetailResponseGoodsTradeAttr {

        /**
         * 提前预定天数
         */
        @JsonProperty("advances_days")
        private Integer advancesDays;

        /**
         * 卡券有效期，日历日期后多少天可用。默认值为0表示仅限日历日当天使用.
         */
        @JsonProperty("life_span")
        private Integer lifeSpan;

        public Integer getAdvancesDays() {
            return advancesDays;
        }

        public Integer getLifeSpan() {
            return lifeSpan;
        }
    }

    public static class GoodsCommitDetailResponseGoodsTravelAttr {

        /**
         * 是否需要出行人信息
         */
        @JsonProperty("need_tourist")
        private Boolean needTourist;

        /**
         * 1:旅行类,2:住宿类,3:票务类
         */
        @JsonProperty("type")
        private Integer type;

        public Boolean getNeedTourist() {
            return needTourist;
        }

        public Integer getType() {
            return type;
        }
    }

    public static class GoodsCommitDetailResponseOverseaGoods {

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

        public String getBondedWarehouseKey() {
            return bondedWarehouseKey;
        }

        public Integer getConsumptionTaxRate() {
            return consumptionTaxRate;
        }

        public String getCustomsBroker() {
            return customsBroker;
        }

        public String getHsCode() {
            return hsCode;
        }

        public Integer getValueAddedTaxRate() {
            return valueAddedTaxRate;
        }
    }

    public static class GoodsCommitDetailResponseSkuListItem {

        /**
         * 上下架状态 1：上架 0 ：下架
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku送装参数：长度
         */
        @JsonProperty("lengtj")
        private Long lengtj;

        /**
         * sku购买限制
         */
        @JsonProperty("limit_quantity")
        private Long limitQuantity;

        /**
         * 商品团购价格 单位分
         */
        @JsonProperty("multi_price")
        private Long multiPrice;

        /**
         * 商家编码（sku维度），同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）
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
        private GoodsCommitDetailResponseSkuListItemOverseaSku overseaSku;

        /**
         * 商品单买价格 单位分
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * sku编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku预售时间，单位秒
         */
        @JsonProperty("sku_pre_sale_time")
        private Integer skuPreSaleTime;

        /**
         * sku属性
         */
        @JsonProperty("sku_property_list")
        private List<GoodsCommitDetailResponseSkuListItemSkuPropertyListItem> skuPropertyList;

        /**
         * 商品规格列表
         */
        @JsonProperty("spec")
        private List<GoodsCommitDetailResponseSkuListItemSpecItem> spec;

        /**
         * sku预览图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 重量，单位为g
         */
        @JsonProperty("weight")
        private Long weight;

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public Long getLengtj() {
            return lengtj;
        }

        public Long getLimitQuantity() {
            return limitQuantity;
        }

        public Long getMultiPrice() {
            return multiPrice;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public String getOutSourceSkuId() {
            return outSourceSkuId;
        }

        public GoodsCommitDetailResponseSkuListItemOverseaSku getOverseaSku() {
            return overseaSku;
        }

        public Long getPrice() {
            return price;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Integer getSkuPreSaleTime() {
            return skuPreSaleTime;
        }

        public List<GoodsCommitDetailResponseSkuListItemSkuPropertyListItem> getSkuPropertyList() {
            return skuPropertyList;
        }

        public List<GoodsCommitDetailResponseSkuListItemSpecItem> getSpec() {
            return spec;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public Long getWeight() {
            return weight;
        }
    }

    public static class GoodsCommitDetailResponseSkuListItemOverseaSku {

        /**
         * 计量单位编码，从接口pdd.gooods.sku.measurement.list获取desc
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

        public String getMeasurementCode() {
            return measurementCode;
        }

        public String getSpecifications() {
            return specifications;
        }

        public Integer getTaxation() {
            return taxation;
        }
    }

    public static class GoodsCommitDetailResponseSkuListItemSkuPropertyListItem {

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

        public String getPunit() {
            return punit;
        }

        public Long getRefPid() {
            return refPid;
        }

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }

    public static class GoodsCommitDetailResponseSkuListItemSpecItem {

        /**
         * 商品规格对应的ID
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 商品规格ID对应的规格名称
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 生成的自定义规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 商家编辑的规格值，如颜色规格下设置白色属性
         */
        @JsonProperty("spec_name")
        private String specName;

        /**
         * 规格备注
         */
        @JsonProperty("spec_note")
        private String specNote;

        public Long getParentId() {
            return parentId;
        }

        public String getParentName() {
            return parentName;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getSpecName() {
            return specName;
        }

        public String getSpecNote() {
            return specNote;
        }
    }
}