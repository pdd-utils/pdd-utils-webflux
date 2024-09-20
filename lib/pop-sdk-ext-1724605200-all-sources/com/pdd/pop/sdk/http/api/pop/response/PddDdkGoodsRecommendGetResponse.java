package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsRecommendGetResponse extends PopBaseHttpResponse {

    /**
     * goods_basic_detail_response
     */
    @JsonProperty("goods_basic_detail_response")
    private GoodsBasicDetailResponse goodsBasicDetailResponse;

    public GoodsBasicDetailResponse getGoodsBasicDetailResponse() {
        return goodsBasicDetailResponse;
    }

    public static class GoodsBasicDetailResponse {

        /**
         * 列表
         */
        @JsonProperty("list")
        private List<GoodsBasicDetailResponseListItem> list;

        /**
         * 翻页时必填前页返回的list_id值
         */
        @JsonProperty("list_id")
        private String listId;

        /**
         * 搜索id，建议生成推广链接时候填写，提高收益。
         */
        @JsonProperty("search_id")
        private String searchId;

        /**
         * total
         */
        @JsonProperty("total")
        private Integer total;

        public List<GoodsBasicDetailResponseListItem> getList() {
            return list;
        }

        public String getListId() {
            return listId;
        }

        public String getSearchId() {
            return searchId;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class GoodsBasicDetailResponseListItem {

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
         * 商品类目id
         */
        @JsonProperty("cat_id")
        private String catId;

        /**
         * 商品一~四级类目ID列表
         */
        @JsonProperty("cat_ids")
        private List<Long> catIds;

        /**
         * 优惠券面额,单位为分
         */
        @JsonProperty("coupon_discount")
        private Long couponDiscount;

        /**
         * 优惠券失效时间,UNIX时间戳
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 优惠券门槛价格,单位为分
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券金额
         */
        @JsonProperty("coupon_price")
        private Long couponPrice;

        /**
         * 优惠券剩余数量
         */
        @JsonProperty("coupon_remain_quantity")
        private Long couponRemainQuantity;

        /**
         * 优惠券生效时间,UNIX时间戳
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券总数量
         */
        @JsonProperty("coupon_total_quantity")
        private Long couponTotalQuantity;

        /**
         * 创建时间
         */
        @JsonProperty("create_at")
        private Long createAt;

        /**
         * 描述分
         */
        @JsonProperty("desc_txt")
        private String descTxt;

        /**
         * 额外优惠券，单位为分
         */
        @JsonProperty("extra_coupon_amount")
        private Long extraCouponAmount;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品主图
         */
        @JsonProperty("goods_image_url")
        private String goodsImageUrl;

        /**
         * 商品特殊标签列表。例: [1]，1-APP专享
         */
        @JsonProperty("goods_labels")
        private List<Integer> goodsLabels;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品等级
         */
        @JsonProperty("goods_rate")
        private Long goodsRate;

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
         * 商品类型
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 商品是否带券,true-带券,false-不带券
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 商品是否有素材(图文、视频)
         */
        @JsonProperty("has_material")
        private Boolean hasMaterial;

        /**
         * 物流分
         */
        @JsonProperty("lgst_txt")
        private String lgstTxt;

        /**
         * 商家id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 市场服务费
         */
        @JsonProperty("market_fee")
        private Long marketFee;

        /**
         * 商家类型
         */
        @JsonProperty("merchant_type")
        private String merchantType;

        /**
         * 最小成团价格，单位分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最小单买价格，单位分
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 商品标签类目ID,使用pdd.goods.opt.get获取
         */
        @JsonProperty("opt_id")
        private String optId;

        /**
         * 商品一~四级标签类目ID列表
         */
        @JsonProperty("opt_ids")
        private List<Long> optIds;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 比价行为预判定佣金，需要用户备案
         */
        @JsonProperty("predict_promotion_rate")
        private Long predictPromotionRate;

        /**
         * 佣金比例,千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 二维码主图
         */
        @JsonProperty("qr_code_image_url")
        private String qrCodeImageUrl;

        /**
         * 商品近1小时在多多进宝的实时销量（仅实时热销榜提供）
         */
        @JsonProperty("realtime_sales_tip")
        private String realtimeSalesTip;

        /**
         * 销售量
         */
        @JsonProperty("sales_tip")
        private String salesTip;

        /**
         * 搜索id，建议生成推广链接时候填写，提高收益。
         */
        @JsonProperty("search_id")
        private String searchId;

        /**
         * 服务分
         */
        @JsonProperty("serv_txt")
        private String servTxt;

        /**
         * 分享描述
         */
        @JsonProperty("share_desc")
        private String shareDesc;

        /**
         * 招商分成服务费比例，千分比
         */
        @JsonProperty("share_rate")
        private Integer shareRate;

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

        public String getCatId() {
            return catId;
        }

        public List<Long> getCatIds() {
            return catIds;
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

        public Long getCouponPrice() {
            return couponPrice;
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

        public String getGoodsImageUrl() {
            return goodsImageUrl;
        }

        public List<Integer> getGoodsLabels() {
            return goodsLabels;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsRate() {
            return goodsRate;
        }

        public String getGoodsSign() {
            return goodsSign;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public Integer getGoodsType() {
            return goodsType;
        }

        public Boolean getHasCoupon() {
            return hasCoupon;
        }

        public Boolean getHasMaterial() {
            return hasMaterial;
        }

        public String getLgstTxt() {
            return lgstTxt;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getMallName() {
            return mallName;
        }

        public Long getMarketFee() {
            return marketFee;
        }

        public String getMerchantType() {
            return merchantType;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public String getOptId() {
            return optId;
        }

        public List<Long> getOptIds() {
            return optIds;
        }

        public String getOptName() {
            return optName;
        }

        public Long getPredictPromotionRate() {
            return predictPromotionRate;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public String getQrCodeImageUrl() {
            return qrCodeImageUrl;
        }

        public String getRealtimeSalesTip() {
            return realtimeSalesTip;
        }

        public String getSalesTip() {
            return salesTip;
        }

        public String getSearchId() {
            return searchId;
        }

        public String getServTxt() {
            return servTxt;
        }

        public String getShareDesc() {
            return shareDesc;
        }

        public Integer getShareRate() {
            return shareRate;
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
    }
}