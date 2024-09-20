package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOrderListIncrementGetResponse extends PopBaseHttpResponse {

    /**
     * order_list_get_response
     */
    @JsonProperty("order_list_get_response")
    private OrderListGetResponse orderListGetResponse;

    public OrderListGetResponse getOrderListGetResponse() {
        return orderListGetResponse;
    }

    public static class OrderListGetResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("order_list")
        private List<OrderListGetResponseOrderListItem> orderList;

        /**
         * 请求到的结果数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        public List<OrderListGetResponseOrderListItem> getOrderList() {
            return orderList;
        }

        public Long getTotalCount() {
            return totalCount;
        }
    }

    public static class OrderListGetResponseOrderListItem {

        /**
         * 商品活动标记数组，例：[4,7]，4-秒杀 7-百亿补贴等
         */
        @JsonProperty("activity_tags")
        private List<Integer> activityTags;

        /**
         * 多多客工具id
         */
        @JsonProperty("auth_duo_id")
        private Long authDuoId;

        /**
         * 预判断是否为代购订单，-1（默认）表示未出结果，0表示预判不是代购订单，1表示代购订单，具体请以最后审核状态为准
         */
        @JsonProperty("bandan_risk_consult")
        private Integer bandanRiskConsult;

        /**
         * 结算批次号
         */
        @JsonProperty("batch_no")
        private String batchNo;

        /**
         * 订单关联礼金活动Id
         */
        @JsonProperty("cash_gift_id")
        private Long cashGiftId;

        /**
         * 商品一~四级类目ID列表
         */
        @JsonProperty("cat_ids")
        private List<Long> catIds;

        /**
         * 是否是 cpa 新用户，1表示是，0表示否
         */
        @JsonProperty("cpa_new")
        private Integer cpaNew;

        /**
         * 自定义参数
         */
        @JsonProperty("custom_parameters")
        private String customParameters;

        /**
         * 订单审核失败/惩罚原因
         */
        @JsonProperty("fail_reason")
        private String failReason;

        /**
         * 商品一级类目名称
         */
        @JsonProperty("goods_category_name")
        private String goodsCategoryName;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 订单中sku的单件价格，单位为分
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 购买商品的数量
         */
        @JsonProperty("goods_quantity")
        private Long goodsQuantity;

        /**
         * goodsSign是加密后的goodsId，goodsId已下线，请使用goodsSign来替代。需要注意的是：推广链接带有goodsSign信息时，订单会返回原goodsSign；反之，会生成新的goodsSign返回。
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 成团编号
         */
        @JsonProperty("group_id")
        private Long groupId;

        /**
         * 计入千万补贴额度(仅top渠道享受) 值为0时不计入 其他为null
         */
        @JsonProperty("in_ten_million_subsidy_quota")
        private Integer inTenMillionSubsidyQuota;

        /**
         * 是否直推 ，1表示是，0表示否
         */
        @JsonProperty("is_direct")
        private Integer isDirect;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 非补贴订单原因，例如："商品补贴达上限"，"达到单个用户下单上限"，"非指定落地页直推订单"，"订单超过2个月未审核成功"等
         */
        @JsonProperty("no_subsidy_reason")
        private String noSubsidyReason;

        /**
         * 不计入千万补贴额度原因
         */
        @JsonProperty("not_in_ten_million_subsidy_quota_reason")
        private String notInTenMillionSubsidyQuotaReason;

        /**
         * 实际支付金额，单位为分
         */
        @JsonProperty("order_amount")
        private Long orderAmount;

        /**
         * 订单生成时间，UNIX时间戳
         */
        @JsonProperty("order_create_time")
        private Long orderCreateTime;

        /**
         * 成团时间
         */
        @JsonProperty("order_group_success_time")
        private Long orderGroupSuccessTime;

        /**
         * 订单ID
         */
        @JsonProperty("order_id")
        private String orderId;

        /**
         * 最后更新时间
         */
        @JsonProperty("order_modify_at")
        private Long orderModifyAt;

        /**
         * 支付时间
         */
        @JsonProperty("order_pay_time")
        private Long orderPayTime;

        /**
         * 确认收货时间
         */
        @JsonProperty("order_receive_time")
        private Long orderReceiveTime;

        /**
         * 结算时间
         */
        @JsonProperty("order_settle_time")
        private Long orderSettleTime;

        /**
         * 推广订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 订单状态：0-已支付；1-已成团；2-确认收货；3-审核成功；4-审核失败（不可提现）；5-已经结算 ;10-已处罚
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 订单状态描述
         */
        @JsonProperty("order_status_desc")
        private String orderStatusDesc;

        /**
         * 审核时间
         */
        @JsonProperty("order_verify_time")
        private Long orderVerifyTime;

        /**
         * 推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        /**
         * 平台券金额，表示该订单使用的平台券金额，单位分
         */
        @JsonProperty("platform_discount")
        private Long platformDiscount;

        /**
         * 比价状态：0：正常，1：比价
         */
        @JsonProperty("price_compare_status")
        private Integer priceCompareStatus;

        /**
         * 佣金金额，单位为分
         */
        @JsonProperty("promotion_amount")
        private Long promotionAmount;

        /**
         * 佣金比例，千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 超级红包补贴类型：0-非红包补贴订单，1-季度新用户补贴
         */
        @JsonProperty("red_packet_type")
        private Integer redPacketType;

        /**
         * 直播间订单推广duoId
         */
        @JsonProperty("sep_duo_id")
        private Long sepDuoId;

        /**
         * 直播间推广佣金
         */
        @JsonProperty("sep_market_fee")
        private Integer sepMarketFee;

        /**
         * 直播间推广自定义参数
         */
        @JsonProperty("sep_parameters")
        private String sepParameters;

        /**
         * 直播间订单推广位
         */
        @JsonProperty("sep_pid")
        private String sepPid;

        /**
         * 直播间推广佣金比例
         */
        @JsonProperty("sep_rate")
        private Integer sepRate;

        /**
         * 招商分成服务费金额，单位为分
         */
        @JsonProperty("share_amount")
        private Integer shareAmount;

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
         * 等级补贴给渠道的收入补贴，不允许直接给下级代理展示，单位为分
         */
        @JsonProperty("subsidy_duo_amount_level")
        private Integer subsidyDuoAmountLevel;

        /**
         * 官方活动给渠道的收入补贴金额，不允许直接给下级代理展示，单位为分
         */
        @JsonProperty("subsidy_duo_amount_ten_million")
        private Integer subsidyDuoAmountTenMillion;

        /**
         * 补贴订单备注
         */
        @JsonProperty("subsidy_order_remark")
        private String subsidyOrderRemark;

        /**
         * 订单补贴类型：0-非补贴订单，1-千万补贴，2-社群补贴，3-多多星选，4-品牌优选，5-千万神券 6-QQ小世界 7-新商家补贴 8-拼团享多多 9-超级红包 10-超红大额券
         */
        @JsonProperty("subsidy_type")
        private Integer subsidyType;

        /**
         * 下单场景类型：0-单品推广，1-红包活动推广，4-多多进宝商城推广，7-今日爆款，8-品牌清仓，9-1.9包邮，77-刮刮卡活动推广，94-充值中心，101-品牌黑卡，103-百亿补贴频道，104-内购清单频道，105-超级红包
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 招商多多客id
         */
        @JsonProperty("zs_duo_id")
        private Long zsDuoId;

        public List<Integer> getActivityTags() {
            return activityTags;
        }

        public Long getAuthDuoId() {
            return authDuoId;
        }

        public Integer getBandanRiskConsult() {
            return bandanRiskConsult;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public Long getCashGiftId() {
            return cashGiftId;
        }

        public List<Long> getCatIds() {
            return catIds;
        }

        public Integer getCpaNew() {
            return cpaNew;
        }

        public String getCustomParameters() {
            return customParameters;
        }

        public String getFailReason() {
            return failReason;
        }

        public String getGoodsCategoryName() {
            return goodsCategoryName;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsPrice() {
            return goodsPrice;
        }

        public Long getGoodsQuantity() {
            return goodsQuantity;
        }

        public String getGoodsSign() {
            return goodsSign;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public Long getGroupId() {
            return groupId;
        }

        public Integer getInTenMillionSubsidyQuota() {
            return inTenMillionSubsidyQuota;
        }

        public Integer getIsDirect() {
            return isDirect;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getMallName() {
            return mallName;
        }

        public String getNoSubsidyReason() {
            return noSubsidyReason;
        }

        public String getNotInTenMillionSubsidyQuotaReason() {
            return notInTenMillionSubsidyQuotaReason;
        }

        public Long getOrderAmount() {
            return orderAmount;
        }

        public Long getOrderCreateTime() {
            return orderCreateTime;
        }

        public Long getOrderGroupSuccessTime() {
            return orderGroupSuccessTime;
        }

        public String getOrderId() {
            return orderId;
        }

        public Long getOrderModifyAt() {
            return orderModifyAt;
        }

        public Long getOrderPayTime() {
            return orderPayTime;
        }

        public Long getOrderReceiveTime() {
            return orderReceiveTime;
        }

        public Long getOrderSettleTime() {
            return orderSettleTime;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public String getOrderStatusDesc() {
            return orderStatusDesc;
        }

        public Long getOrderVerifyTime() {
            return orderVerifyTime;
        }

        public String getPId() {
            return pId;
        }

        public Long getPlatformDiscount() {
            return platformDiscount;
        }

        public Integer getPriceCompareStatus() {
            return priceCompareStatus;
        }

        public Long getPromotionAmount() {
            return promotionAmount;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public Integer getRedPacketType() {
            return redPacketType;
        }

        public Long getSepDuoId() {
            return sepDuoId;
        }

        public Integer getSepMarketFee() {
            return sepMarketFee;
        }

        public String getSepParameters() {
            return sepParameters;
        }

        public String getSepPid() {
            return sepPid;
        }

        public Integer getSepRate() {
            return sepRate;
        }

        public Integer getShareAmount() {
            return shareAmount;
        }

        public Integer getShareRate() {
            return shareRate;
        }

        public Integer getSubsidyAmount() {
            return subsidyAmount;
        }

        public Integer getSubsidyDuoAmountLevel() {
            return subsidyDuoAmountLevel;
        }

        public Integer getSubsidyDuoAmountTenMillion() {
            return subsidyDuoAmountTenMillion;
        }

        public String getSubsidyOrderRemark() {
            return subsidyOrderRemark;
        }

        public Integer getSubsidyType() {
            return subsidyType;
        }

        public Integer getType() {
            return type;
        }

        public Long getZsDuoId() {
            return zsDuoId;
        }
    }
}