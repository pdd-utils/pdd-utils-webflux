package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsDetailResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_detail_response")
    private GoodsDetailResponse goodsDetailResponse;

    public GoodsDetailResponse getGoodsDetailResponse() {
        return goodsDetailResponse;
    }

    public static class GoodsDetailResponse {

        /**
         * 多多进宝商品对象列表
         */
        @JsonProperty("goods_details")
        private List<GoodsDetailResponseGoodsDetailsItem> goodsDetails;

        public List<GoodsDetailResponseGoodsDetailsItem> getGoodsDetails() {
            return goodsDetails;
        }
    }

    public static class GoodsDetailResponseGoodsDetailsItem {

        /**
         * 活动佣金比例，千分比（特定活动期间的佣金比例）
         */
        @JsonProperty("activity_promotion_rate")
        private Long activityPromotionRate;

        /**
         * 商品活动标记数组，例：[4,7]，4-秒杀 7-百亿补贴等
         */
        @JsonProperty("activity_tags")
        private List<Integer> activityTags;

        /**
         * 商品品牌词信息，如“苹果”、“阿迪达斯”、“李宁”等
         */
        @JsonProperty("brand_name")
        private String brandName;

        /**
         * 全局礼金金额，单位分
         */
        @JsonProperty("cash_gift_amount")
        private Long cashGiftAmount;

        /**
         * 商品类目ID，使用pdd.goods.cats.get接口获取
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 商品一~四级类目ID列表
         */
        @JsonProperty("cat_ids")
        private List<Integer> catIds;

        /**
         * 店铺收藏券id
         */
        @JsonProperty("clt_cpn_batch_sn")
        private String cltCpnBatchSn;

        /**
         * 店铺收藏券面额,单位为分
         */
        @JsonProperty("clt_cpn_discount")
        private Long cltCpnDiscount;

        /**
         * 店铺收藏券截止时间
         */
        @JsonProperty("clt_cpn_end_time")
        private Long cltCpnEndTime;

        /**
         * 店铺收藏券使用门槛价格,单位为分
         */
        @JsonProperty("clt_cpn_min_amt")
        private Long cltCpnMinAmt;

        /**
         * 店铺收藏券总量
         */
        @JsonProperty("clt_cpn_quantity")
        private Long cltCpnQuantity;

        /**
         * 店铺收藏券剩余量
         */
        @JsonProperty("clt_cpn_remain_quantity")
        private Long cltCpnRemainQuantity;

        /**
         * 店铺收藏券起始时间
         */
        @JsonProperty("clt_cpn_start_time")
        private Long cltCpnStartTime;

        /**
         * 优惠券面额，单位为分
         */
        @JsonProperty("coupon_discount")
        private Long couponDiscount;

        /**
         * 优惠券失效时间，UNIX时间戳
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 优惠券门槛金额，单位为分
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券剩余数量
         */
        @JsonProperty("coupon_remain_quantity")
        private Long couponRemainQuantity;

        /**
         * 优惠券生效时间，UNIX时间戳
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券总数量
         */
        @JsonProperty("coupon_total_quantity")
        private Long couponTotalQuantity;

        /**
         * 创建时间（unix时间戳）
         */
        @JsonProperty("create_at")
        private Long createAt;

        /**
         * 描述分
         */
        @JsonProperty("desc_txt")
        private String descTxt;

        /**
         * 额外优惠券
         */
        @JsonProperty("extra_coupon_amount")
        private Long extraCouponAmount;

        /**
         * 参与多多进宝的商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品轮播图
         */
        @JsonProperty("goods_gallery_urls")
        private List<String> goodsGalleryUrls;

        /**
         * 多多进宝商品主图
         */
        @JsonProperty("goods_image_url")
        private String goodsImageUrl;

        /**
         * 参与多多进宝的商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品goodsSign，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 商品是否有优惠券 true-有，false-没有
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 是否有店铺券
         */
        @JsonProperty("has_mall_coupon")
        private Boolean hasMallCoupon;

        /**
         * 是否多人团
         */
        @JsonProperty("is_multi_group")
        private Boolean isMultiGroup;

        /**
         * 物流分
         */
        @JsonProperty("lgst_txt")
        private String lgstTxt;

        /**
         * 店铺折扣
         */
        @JsonProperty("mall_coupon_discount_pct")
        private Integer mallCouponDiscountPct;

        /**
         * 店铺券使用结束时间
         */
        @JsonProperty("mall_coupon_end_time")
        private Long mallCouponEndTime;

        /**
         * 最大使用金额
         */
        @JsonProperty("mall_coupon_max_discount_amount")
        private Integer mallCouponMaxDiscountAmount;

        /**
         * 最小使用金额
         */
        @JsonProperty("mall_coupon_min_order_amount")
        private Integer mallCouponMinOrderAmount;

        /**
         * 店铺券余量
         */
        @JsonProperty("mall_coupon_remain_quantity")
        private Long mallCouponRemainQuantity;

        /**
         * 店铺券使用开始时间
         */
        @JsonProperty("mall_coupon_start_time")
        private Long mallCouponStartTime;

        /**
         * 店铺券总量
         */
        @JsonProperty("mall_coupon_total_quantity")
        private Long mallCouponTotalQuantity;

        /**
         * 该商品所在店铺是否参与全店推广，0：否，1：是
         */
        @JsonProperty("mall_cps")
        private Integer mallCps;

        /**
         * 商家id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 店铺logo图
         */
        @JsonProperty("mall_img_url")
        private String mallImgUrl;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 商品素材列表
         */
        @JsonProperty("material_list")
        private List<GoodsDetailResponseGoodsDetailsItemMaterialListItem> materialList;

        /**
         * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店（未传为全部）
         */
        @JsonProperty("merchant_type")
        private Integer merchantType;

        /**
         * 最低价sku的拼团价，单位为分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最低价sku的单买价，单位为分
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 快手专享
         */
        @JsonProperty("only_scene_auth")
        private Boolean onlySceneAuth;

        /**
         * 商品标签ID，使用pdd.goods.opt.get接口获取
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签ID
         */
        @JsonProperty("opt_ids")
        private List<Integer> optIds;

        /**
         * 商品标签名称
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 推广计划类型: 1-全店推广 2-单品推广 3-定向推广 4-招商推广 5-分销推广
         */
        @JsonProperty("plan_type")
        private Integer planType;

        /**
         * 比价行为预判定佣金，需要用户备案
         */
        @JsonProperty("predict_promotion_rate")
        private Long predictPromotionRate;

        /**
         * 佣金比例，千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 已售卖件数
         */
        @JsonProperty("sales_tip")
        private String salesTip;

        /**
         * 服务分
         */
        @JsonProperty("serv_txt")
        private String servTxt;

        /**
         * 服务标签: 1-全场包邮,2-七天退换,3-退货包运费,4-送货入户并安装,5-送货入户,6-电子发票,7-诚信发货,8-缺重包赔,9-坏果包赔,10-果重保证,11-闪电退款,12-24小时发货,13-48小时发货,14-免税费,15-假一罚十,16-贴心服务,17-顺丰包邮,18-只换不修,19-全国联保,20-分期付款,21-纸质发票,22-上门安装,23-爱心助农,24-极速退款,25-品质保障,26-缺重包退,27-当日发货,28-可定制化,29-预约配送,30-商品进口,31-电器城,1000001-正品发票,1000002-送货入户并安装,2000001-价格保护
         */
        @JsonProperty("service_tags")
        private List<Integer> serviceTags;

        /**
         * 招商分成服务费比例，千分比
         */
        @JsonProperty("share_rate")
        private Integer shareRate;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<GoodsDetailResponseGoodsDetailsItemSkuListItem> skuList;

        /**
         * 优势渠道专属商品补贴金额，单位为分。针对优质渠道的补贴活动，指定优势渠道可通过推广该商品获取相应补贴。补贴活动入口：[进宝网站-官方活动]
         */
        @JsonProperty("subsidy_amount")
        private Integer subsidyAmount;

        /**
         * 官方活动给渠道的收入补贴金额，不允许直接给下级代理展示，单位为分
         */
        @JsonProperty("subsidy_duo_amount_ten_million")
        private Integer subsidyDuoAmountTenMillion;

        /**
         * 补贴活动类型：0-无补贴，1-千万补贴，4-千万神券，6-佣金翻倍
         */
        @JsonProperty("subsidy_goods_type")
        private Integer subsidyGoodsType;

        /**
         * 优惠标签列表，包括："X元券","比全网低X元","服务费","精选素材","近30天低价","同款低价","同款好评","同款热销","旗舰店","一降到底","招商优选","商家优选","好价再降X元","全站销量XX","实时热销榜第X名","实时好评榜第X名","额外补X元"等
         */
        @JsonProperty("unified_tags")
        private List<String> unifiedTags;

        /**
         * 商品视频url
         */
        @JsonProperty("video_urls")
        private List<String> videoUrls;

        /**
         * 招商团长id
         */
        @JsonProperty("zs_duo_id")
        private Long zsDuoId;

        public Long getActivityPromotionRate() {
            return activityPromotionRate;
        }

        public List<Integer> getActivityTags() {
            return activityTags;
        }

        public String getBrandName() {
            return brandName;
        }

        public Long getCashGiftAmount() {
            return cashGiftAmount;
        }

        public Long getCatId() {
            return catId;
        }

        public List<Integer> getCatIds() {
            return catIds;
        }

        public String getCltCpnBatchSn() {
            return cltCpnBatchSn;
        }

        public Long getCltCpnDiscount() {
            return cltCpnDiscount;
        }

        public Long getCltCpnEndTime() {
            return cltCpnEndTime;
        }

        public Long getCltCpnMinAmt() {
            return cltCpnMinAmt;
        }

        public Long getCltCpnQuantity() {
            return cltCpnQuantity;
        }

        public Long getCltCpnRemainQuantity() {
            return cltCpnRemainQuantity;
        }

        public Long getCltCpnStartTime() {
            return cltCpnStartTime;
        }

        public Long getCouponDiscount() {
            return couponDiscount;
        }

        public Long getCouponEndTime() {
            return couponEndTime;
        }

        public Long getCouponMinOrderAmount() {
            return couponMinOrderAmount;
        }

        public Long getCouponRemainQuantity() {
            return couponRemainQuantity;
        }

        public Long getCouponStartTime() {
            return couponStartTime;
        }

        public Long getCouponTotalQuantity() {
            return couponTotalQuantity;
        }

        public Long getCreateAt() {
            return createAt;
        }

        public String getDescTxt() {
            return descTxt;
        }

        public Long getExtraCouponAmount() {
            return extraCouponAmount;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public List<String> getGoodsGalleryUrls() {
            return goodsGalleryUrls;
        }

        public String getGoodsImageUrl() {
            return goodsImageUrl;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsSign() {
            return goodsSign;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public Boolean getHasCoupon() {
            return hasCoupon;
        }

        public Boolean getHasMallCoupon() {
            return hasMallCoupon;
        }

        public Boolean getIsMultiGroup() {
            return isMultiGroup;
        }

        public String getLgstTxt() {
            return lgstTxt;
        }

        public Integer getMallCouponDiscountPct() {
            return mallCouponDiscountPct;
        }

        public Long getMallCouponEndTime() {
            return mallCouponEndTime;
        }

        public Integer getMallCouponMaxDiscountAmount() {
            return mallCouponMaxDiscountAmount;
        }

        public Integer getMallCouponMinOrderAmount() {
            return mallCouponMinOrderAmount;
        }

        public Long getMallCouponRemainQuantity() {
            return mallCouponRemainQuantity;
        }

        public Long getMallCouponStartTime() {
            return mallCouponStartTime;
        }

        public Long getMallCouponTotalQuantity() {
            return mallCouponTotalQuantity;
        }

        public Integer getMallCps() {
            return mallCps;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getMallImgUrl() {
            return mallImgUrl;
        }

        public String getMallName() {
            return mallName;
        }

        public List<GoodsDetailResponseGoodsDetailsItemMaterialListItem> getMaterialList() {
            return materialList;
        }

        public Integer getMerchantType() {
            return merchantType;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public Boolean getOnlySceneAuth() {
            return onlySceneAuth;
        }

        public Long getOptId() {
            return optId;
        }

        public List<Integer> getOptIds() {
            return optIds;
        }

        public String getOptName() {
            return optName;
        }

        public Integer getPlanType() {
            return planType;
        }

        public Long getPredictPromotionRate() {
            return predictPromotionRate;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public String getSalesTip() {
            return salesTip;
        }

        public String getServTxt() {
            return servTxt;
        }

        public List<Integer> getServiceTags() {
            return serviceTags;
        }

        public Integer getShareRate() {
            return shareRate;
        }

        public List<GoodsDetailResponseGoodsDetailsItemSkuListItem> getSkuList() {
            return skuList;
        }

        public Integer getSubsidyAmount() {
            return subsidyAmount;
        }

        public Integer getSubsidyDuoAmountTenMillion() {
            return subsidyDuoAmountTenMillion;
        }

        public Integer getSubsidyGoodsType() {
            return subsidyGoodsType;
        }

        public List<String> getUnifiedTags() {
            return unifiedTags;
        }

        public List<String> getVideoUrls() {
            return videoUrls;
        }

        public Long getZsDuoId() {
            return zsDuoId;
        }
    }

    public static class GoodsDetailResponseGoodsDetailsItemMaterialListItem {

        /**
         * 素材ID
         */
        @JsonProperty("id")
        private String id;

        /**
         * 图片列表
         */
        @JsonProperty("image_list")
        private List<String> imageList;

        /**
         * 文字列表
         */
        @JsonProperty("text_list")
        private List<String> textList;

        /**
         * 视频缩略图
         */
        @JsonProperty("thumbnail_url")
        private String thumbnailUrl;

        /**
         * 素材类型，1-图文，2-视频
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 视频url
         */
        @JsonProperty("video_url")
        private String videoUrl;

        public String getId() {
            return id;
        }

        public List<String> getImageList() {
            return imageList;
        }

        public List<String> getTextList() {
            return textList;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public Integer getType() {
            return type;
        }

        public String getVideoUrl() {
            return videoUrl;
        }
    }

    public static class GoodsDetailResponseGoodsDetailsItemSkuListItem {

        /**
         * 上下架状态: 1-上架, 0-下架
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 进宝算价结果，单位分
         */
        @JsonProperty("jinbao_goods_price")
        private Long jinbaoGoodsPrice;

        /**
         * 最小成团价，单位分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * skuId密文，可在pdd.ddk.goods.promotion.url.generate接口入参，返回的链接会拼上该skuIdCode。此类链接在被点击跳转商品详情页时，如果目标sku可用，则自动选中该sku
         */
        @JsonProperty("sku_id_code")
        private String skuIdCode;

        /**
         * sku预览图
         */
        @JsonProperty("sku_thumb_url")
        private String skuThumbUrl;

        /**
         * 商品规格列表
         */
        @JsonProperty("spec_list")
        private List<GoodsDetailResponseGoodsDetailsItemSkuListItemSpecListItem> specList;

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public Long getJinbaoGoodsPrice() {
            return jinbaoGoodsPrice;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public String getSkuIdCode() {
            return skuIdCode;
        }

        public String getSkuThumbUrl() {
            return skuThumbUrl;
        }

        public List<GoodsDetailResponseGoodsDetailsItemSkuListItemSpecListItem> getSpecList() {
            return specList;
        }
    }

    public static class GoodsDetailResponseGoodsDetailsItemSkuListItemSpecListItem {

        /**
         * 规格备注
         */
        @JsonProperty("note")
        private String note;

        /**
         * 父规格id
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 父规格名称。例如："型号"为父规格名称，"xx款"为该父规格下的子规格名称。
         */
        @JsonProperty("parent_spec_value")
        private String parentSpecValue;

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格名称。例如："xx款"为规格名称, "型号"为该规格的父规格名称。
         */
        @JsonProperty("spec_value")
        private String specValue;

        public String getNote() {
            return note;
        }

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getParentSpecValue() {
            return parentSpecValue;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getSpecValue() {
            return specValue;
        }
    }
}