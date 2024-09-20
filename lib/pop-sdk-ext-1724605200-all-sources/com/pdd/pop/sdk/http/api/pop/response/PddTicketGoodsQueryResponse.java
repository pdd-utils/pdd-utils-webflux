package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddTicketGoodsQueryResponse extends PopBaseHttpResponse {

    /**
     * 草稿查询返回结果
     */
    @JsonProperty("goods_detail_get_response")
    private GoodsDetailGetResponse goodsDetailGetResponse;

    public GoodsDetailGetResponse getGoodsDetailGetResponse() {
        return goodsDetailGetResponse;
    }

    public static class GoodsDetailGetResponse {

        /**
         * 商品轮播图
         */
        @JsonProperty("carousel_gallery")
        private List<String> carouselGallery;

        /**
         * 轮播视频
         */
        @JsonProperty("carousel_video")
        private List<GoodsDetailGetResponseCarouselVideoItem> carouselVideo;

        /**
         * 类目id，国内门票（含港澳台）9088，国外门票20042。
         */
        @JsonProperty("cat_id")
        private Integer catId;

        /**
         * 电子票发码方式，0=手动电子票；1=实时电子票，自动发货。
         */
        @JsonProperty("code_mode")
        private Integer codeMode;

        /**
         * 商品草稿状态，查询草稿id时返回。0=编辑中，1=待审核，2=审核通过，3=审核驳回
         */
        @JsonProperty("commit_status")
        private Integer commitStatus;

        /**
         * 商品详情图
         */
        @JsonProperty("detail_gallery")
        private List<String> detailGallery;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品属性
         */
        @JsonProperty("goods_properties")
        private List<GoodsDetailGetResponseGoodsPropertiesItem> goodsProperties;

        /**
         * 商品状态，查询商品id时返回。1=上架，2=下架，3=售罄，4=已删除
         */
        @JsonProperty("goods_status")
        private Integer goodsStatus;

        /**
         * 商品参考价，单位为分。
         */
        @JsonProperty("market_price")
        private Long marketPrice;

        /**
         * 商品goods外部编码，同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商品维度的商家编码。
         */
        @JsonProperty("out_goods_sn")
        private String outGoodsSn;

        /**
         * 预定时间限制，格式：1_20_00，含义：需要提前1天，且在20:00分之前才可预定那天的门票。若为空则表示不限制预定时间。0_24_00表示在当前的24点前预定都可以，等效于不限制预定时间。
         */
        @JsonProperty("reserve_limit_rule")
        private String reserveLimitRule;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<GoodsDetailGetResponseSkuListItem> skuList;

        /**
         * 销售方式，0=普通库存，1=日历库存。
         */
        @JsonProperty("sku_type")
        private Integer skuType;

        public List<String> getCarouselGallery() {
            return carouselGallery;
        }

        public List<GoodsDetailGetResponseCarouselVideoItem> getCarouselVideo() {
            return carouselVideo;
        }

        public Integer getCatId() {
            return catId;
        }

        public Integer getCodeMode() {
            return codeMode;
        }

        public Integer getCommitStatus() {
            return commitStatus;
        }

        public List<String> getDetailGallery() {
            return detailGallery;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public List<GoodsDetailGetResponseGoodsPropertiesItem> getGoodsProperties() {
            return goodsProperties;
        }

        public Integer getGoodsStatus() {
            return goodsStatus;
        }

        public Long getMarketPrice() {
            return marketPrice;
        }

        public String getOutGoodsSn() {
            return outGoodsSn;
        }

        public String getReserveLimitRule() {
            return reserveLimitRule;
        }

        public List<GoodsDetailGetResponseSkuListItem> getSkuList() {
            return skuList;
        }

        public Integer getSkuType() {
            return skuType;
        }
    }

    public static class GoodsDetailGetResponseCarouselVideoItem {

        /**
         * 轮播视频id
         */
        @JsonProperty("file_id")
        private Long fileId;

        /**
         * 轮播视频url
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

    public static class GoodsDetailGetResponseGoodsPropertiesItem {

        /**
         * 父规格id，仅销售属性有
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 规格id，仅销售属性有和sku中的spec对应
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public Long getRefPid() {
            return refPid;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getValue() {
            return value;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public Long getVid() {
            return vid;
        }
    }

    public static class GoodsDetailGetResponseSkuListItem {

        /**
         * 子sku列表，仅当sku_type为日历库存且父sku数小于等于10个时返回。若父sku多于10个，需要在pdd.goods.child.sku.detail.get接口中查询子sku信息。
         */
        @JsonProperty("child_skus")
        private List<GoodsDetailGetResponseSkuListItemChildSkusItem> childSkus;

        /**
         * 拼团价，单位为分。当sku_type为日历库存时是可预定日期的拼团价最低价。
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 上架状态。0=已下架，1=已上架。
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 商品sku外部编码，同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）。
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 线上库存量
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 库存增减，当查草稿时返回。
         */
        @JsonProperty("quantity_delta")
        private Long quantityDelta;

        /**
         * 线上预扣库存量
         */
        @JsonProperty("reserve_quantity")
        private Long reserveQuantity;

        /**
         * 调pdd.scenic.sku.rule.get得到的规则id
         */
        @JsonProperty("rule_id")
        private String ruleId;

        /**
         * 单买价，单位为分。当sku_type为日历库存时是可预定日期的单买价最低价。
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private String skuId;

        /**
         * sku规格列表
         */
        @JsonProperty("spec")
        private List<GoodsDetailGetResponseSkuListItemSpecItem> spec;

        /**
         * SKU预览图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        public List<GoodsDetailGetResponseSkuListItemChildSkusItem> getChildSkus() {
            return childSkus;
        }

        public Long getGroupPrice() {
            return groupPrice;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getQuantityDelta() {
            return quantityDelta;
        }

        public Long getReserveQuantity() {
            return reserveQuantity;
        }

        public String getRuleId() {
            return ruleId;
        }

        public Long getSinglePrice() {
            return singlePrice;
        }

        public String getSkuId() {
            return skuId;
        }

        public List<GoodsDetailGetResponseSkuListItemSpecItem> getSpec() {
            return spec;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }
    }

    public static class GoodsDetailGetResponseSkuListItemChildSkusItem {

        /**
         * 日期。格式：2020-06-01
         */
        @JsonProperty("date")
        private String date;

        /**
         * 拼团价，单位为分。
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 线上库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 库存增减，当查草稿时返回。
         */
        @JsonProperty("quantity_delta")
        private Long quantityDelta;

        /**
         * 线上预扣库存
         */
        @JsonProperty("reserve_quantity")
        private Long reserveQuantity;

        /**
         * 单买价，单位为分
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public String getDate() {
            return date;
        }

        public Long getGroupPrice() {
            return groupPrice;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getQuantityDelta() {
            return quantityDelta;
        }

        public Long getReserveQuantity() {
            return reserveQuantity;
        }

        public Long getSinglePrice() {
            return singlePrice;
        }

        public Long getSkuId() {
            return skuId;
        }
    }

    public static class GoodsDetailGetResponseSkuListItemSpecItem {

        /**
         * 父规格id
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 父规格名称
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格名称
         */
        @JsonProperty("spec_name")
        private String specName;

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
    }
}