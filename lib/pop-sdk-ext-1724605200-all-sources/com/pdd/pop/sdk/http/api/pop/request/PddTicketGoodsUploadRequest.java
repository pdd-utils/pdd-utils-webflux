package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketGoodsUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTicketGoodsUploadRequest extends PopBaseHttpRequest<PddTicketGoodsUploadResponse> {

    /**
     * 商品轮播图，按次序上传，图片格式支持JPEG/JPG/PNG， 图片尺寸长宽比1：1且尺寸不低于480px，图片大小最高1MB。先通过pdd.goods.image.upload上传图片
     */
    @JsonProperty("carousel_gallery")
    private List<String> carouselGallery;

    /**
     * 轮播视频。需要先上传到pdd.goods.filespace.image.upload
     */
    @JsonProperty("carousel_video")
    private List<CarouselVideoItem> carouselVideo;

    /**
     * 类目id，国内门票（含港澳台）传9088，国外门票传20042。发布成功后不能修改。新增商品时必填。
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 电子票发码方式，0=手动电子票；1=实时电子票，自动发货。新增商品时必填。
     */
    @JsonProperty("code_mode")
    private Integer codeMode;

    /**
     * 商品详情图： a. 尺寸要求宽度处于480~1200px之间，高度0-1500px之间 b. 大小1M以内 c. 数量限制在20张之间 d. 图片格式仅支持JPG,PNG格式 。先通过pdd.goods.image.upload上传图片，新增商品时必填。
     */
    @JsonProperty("detail_gallery")
    private List<String> detailGallery;

    /**
     * 草稿id，编辑草稿时必传。
     */
    @JsonProperty("goods_commit_id")
    private Long goodsCommitId;

    /**
     * 商品描述，字数限制：20~500。新增商品时必填。
     */
    @JsonProperty("goods_desc")
    private String goodsDesc;

    /**
     * 商品id，编辑商品时必传。
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 商品标题，新增商品时必填。
     */
    @JsonProperty("goods_name")
    private String goodsName;

    /**
     * 商品属性，先调pdd.goods.cat.template.get，根据cat_id获取，新增商品时必填。
     */
    @JsonProperty("goods_properties")
    private List<GoodsPropertiesItem> goodsProperties;

    /**
     * 是否获取商品发布警告信息，默认为忽略
     */
    @JsonProperty("ignore_edit_warn")
    private Boolean ignoreEditWarn;

    /**
     * 是否提交本次编辑，0=不提交，表示仅保存草稿，不进行提交，不会进行校验；1=提交，表示提交本次编辑内容，会进行校验；不传时默认为提交
     */
    @JsonProperty("is_submit")
    private Integer isSubmit;

    /**
     * 商品参考价，单位为分，必须高于最高的sku单买价。新增商品时必填。
     */
    @JsonProperty("market_price")
    private Long marketPrice;

    /**
     * 商品goods外部编码，同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商品维度的商家编码。
     */
    @JsonProperty("out_goods_sn")
    private String outGoodsSn;

    /**
     * 预定时间限制，格式：1_20_00，含义：需要提前1天，且在20:00分之前才可预定那天的门票。若不传则表示不限制预定时间。0_24_00表示在当前的24点前预定都可以，等效于不限制预定时间。
     */
    @JsonProperty("reserve_limit_rule")
    private String reserveLimitRule;

    /**
     * sku列表。新增商品时必填。整个sku_list会作为整体更新。
     */
    @JsonProperty("sku_list")
    private List<SkuListItem> skuList;

    /**
     * 销售方式，0=普通库存，1=日历库存。对于普通库存入参sku维度的价格库存，对于日历库存需要在pdd.goods.child.sku.edit入参child_sku维度的价格库存后再提交。编辑商品时不允许修改。
     */
    @JsonProperty("sku_type")
    private Integer skuType;

    /**
     * 提交后上下架状态，0=上架；1=保持原样。表示编辑商品并提交后商品的上下架状态，不传时默认为0，上架。
     */
    @JsonProperty("sync_goods_operate")
    private Integer syncGoodsOperate;

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
        return "pdd.ticket.goods.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketGoodsUploadResponse> getResponseClass() {
        return PddTicketGoodsUploadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "carousel_gallery", carouselGallery);
        setUserParam(params, "carousel_video", carouselVideo);
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "code_mode", codeMode);
        setUserParam(params, "detail_gallery", detailGallery);
        setUserParam(params, "goods_commit_id", goodsCommitId);
        setUserParam(params, "goods_desc", goodsDesc);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "goods_name", goodsName);
        setUserParam(params, "goods_properties", goodsProperties);
        setUserParam(params, "ignore_edit_warn", ignoreEditWarn);
        setUserParam(params, "is_submit", isSubmit);
        setUserParam(params, "market_price", marketPrice);
        setUserParam(params, "out_goods_sn", outGoodsSn);
        setUserParam(params, "reserve_limit_rule", reserveLimitRule);
        setUserParam(params, "sku_list", skuList);
        setUserParam(params, "sku_type", skuType);
        setUserParam(params, "sync_goods_operate", syncGoodsOperate);
    }

    public void setCarouselGallery(List<String> carouselGallery) {
        this.carouselGallery = carouselGallery;
    }

    public void setCarouselVideo(List<CarouselVideoItem> carouselVideo) {
        this.carouselVideo = carouselVideo;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCodeMode(Integer codeMode) {
        this.codeMode = codeMode;
    }

    public void setDetailGallery(List<String> detailGallery) {
        this.detailGallery = detailGallery;
    }

    public void setGoodsCommitId(Long goodsCommitId) {
        this.goodsCommitId = goodsCommitId;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsProperties(List<GoodsPropertiesItem> goodsProperties) {
        this.goodsProperties = goodsProperties;
    }

    public void setIgnoreEditWarn(Boolean ignoreEditWarn) {
        this.ignoreEditWarn = ignoreEditWarn;
    }

    public void setIsSubmit(Integer isSubmit) {
        this.isSubmit = isSubmit;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setOutGoodsSn(String outGoodsSn) {
        this.outGoodsSn = outGoodsSn;
    }

    public void setReserveLimitRule(String reserveLimitRule) {
        this.reserveLimitRule = reserveLimitRule;
    }

    public void setSkuList(List<SkuListItem> skuList) {
        this.skuList = skuList;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public void setSyncGoodsOperate(Integer syncGoodsOperate) {
        this.syncGoodsOperate = syncGoodsOperate;
    }

    public static class CarouselVideoItem {

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

    public static class GoodsPropertiesItem {

        /**
         * 父规格id，仅对于销售属性入参
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 规格id，仅对于销售属性入参，和sku中的spec对应
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

        public void setParentSpecId(Long parentSpecId) {
            this.parentSpecId = parentSpecId;
        }

        public void setRefPid(Long refPid) {
            this.refPid = refPid;
        }

        public void setSpecId(Long specId) {
            this.specId = specId;
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

    public static class SkuListItem {

        /**
         * 仅当sku_type为日历库存时入参。若父sku多于10个，需要通过pdd.goods.child.sku.edit接口分批维护。
         */
        @JsonProperty("child_skus")
        private List<SkuListItemChildSkusItem> childSkus;

        /**
         * 拼团价，单位为分。仅当sku_type为普通库存时入参
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 上架状态。0=已下架，1=已上架。新建sku时不传时表示上架。
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku外部编码，同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）。
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 库存增减。仅当sku_type为普通库存时入参。比如传-10表示将对应的sku库存减10。
         */
        @JsonProperty("quantity_delta")
        private Long quantityDelta;

        /**
         * 调pdd.scenic.sku.rule.get得到的规则id。在发布成功后不可修改。
         */
        @JsonProperty("rule_id")
        private String ruleId;

        /**
         * 单买价，单位为分。仅当sku_type为普通库存时入参。
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * 如果传值，则在原sku基础上进行编辑，如果传空，则新增sku
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 商品规格列表，从pdd.goods.cat.template.get中获取销售属性规格id后，再在pdd.goods.spec.id.get获取spec_id。spec_id需要和goods_properties中的对应。对于多种规格，需要传每个规格的spec_id的值，如[20,5]。在发布后不可修改。
         */
        @JsonProperty("spec_id_list")
        private List<Long> specIdList;

        /**
         * SKU预览图。图片格式支持JPEG/JPG/PNG， 图片尺寸长宽比1：1且尺寸不低于480px，图片大小最高1MB。先通过pdd.goods.image.upload上传图片
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        public void setChildSkus(List<SkuListItemChildSkusItem> childSkus) {
            this.childSkus = childSkus;
        }

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        public void setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
        }

        public void setQuantityDelta(Long quantityDelta) {
            this.quantityDelta = quantityDelta;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }

        public void setSinglePrice(Long singlePrice) {
            this.singlePrice = singlePrice;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public void setSpecIdList(List<Long> specIdList) {
            this.specIdList = specIdList;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SkuListItemChildSkusItem {

        /**
         * 日期。格式：2020-06-01。每个sku最多支持180天。
         */
        @JsonProperty("date")
        private String date;

        /**
         * 拼团价，单位为分。
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 库存增减。比如传-10表示将对应的sku库存减10。
         */
        @JsonProperty("quantity_delta")
        private Long quantityDelta;

        /**
         * 单买价，单位为分。
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        public void setDate(String date) {
            this.date = date;
        }

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setQuantityDelta(Long quantityDelta) {
            this.quantityDelta = quantityDelta;
        }

        public void setSinglePrice(Long singlePrice) {
            this.singlePrice = singlePrice;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}