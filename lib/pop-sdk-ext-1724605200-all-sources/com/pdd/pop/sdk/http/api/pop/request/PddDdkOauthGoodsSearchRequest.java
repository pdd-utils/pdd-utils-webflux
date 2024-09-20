package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthGoodsSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthGoodsSearchRequest extends PopBaseHttpRequest<PddDdkOauthGoodsSearchResponse> {

    /**
     * 活动商品标记数组，例：[4,7]，4-秒杀，7-百亿补贴，10851-千万补贴，11879-千万神券，10913-招商礼金商品，31-品牌黑标，10564-精选爆品-官方直推爆款，10584-精选爆品-团长推荐，24-品牌高佣，其他的值请忽略
     */
    @JsonProperty("activity_tags")
    private List<Integer> activityTags;

    /**
     * 屏蔽商品类目包：1-拼多多小程序屏蔽的类目&关键词;2-虚拟类目;3-医疗器械;4-处方药;5-非处方药
     */
    @JsonProperty("block_cat_packages")
    private List<Integer> blockCatPackages;

    /**
     * 自定义屏蔽一级/二级/三级类目ID，自定义数量不超过20个;使用pdd.goods.cats.get接口获取cat_id
     */
    @JsonProperty("block_cats")
    private List<Integer> blockCats;

    /**
     * 商品类目ID，使用pdd.goods.cats.get接口获取
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否使用工具商专属推广计划，默认为false
     */
    @JsonProperty("force_auth_duo_id")
    private Boolean forceAuthDuoId;

    /**
     * 商品主图类型：1-场景图，2-白底图，默认为0
     */
    @JsonProperty("goods_img_type")
    private Integer goodsImgType;

    /**
     * 商品goodsSign列表，例如：["c9r2omogKFFAc7WBwvbZU1ikIb16_J3CTa8HNN"]，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign_list")
    private List<String> goodsSignList;

    /**
     * 是否为品牌商品
     */
    @JsonProperty("is_brand_goods")
    private Boolean isBrandGoods;

    /**
     * 商品关键词，与opt_id字段选填一个或全部填写。可支持goods_id、拼多多链接（即拼多多app商详的链接）、进宝长链/短链（即为pdd.ddk.goods.promotion.url.generate接口生成的长短链）
     */
    @JsonProperty("keyword")
    private String keyword;

    /**
     * 翻页时建议填写前页返回的list_id值
     */
    @JsonProperty("list_id")
    private String listId;

    /**
     * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店（未传为全部）
     */
    @JsonProperty("merchant_type")
    private Integer merchantType;

    /**
     * 店铺类型数组，例如：[1,2]
     */
    @JsonProperty("merchant_type_list")
    private List<Integer> merchantTypeList;

    /**
     * 商品标签类目ID，使用pdd.goods.opt.get获取
     */
    @JsonProperty("opt_id")
    private Long optId;

    /**
     * 默认值1，商品分页数
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 默认100，每页商品数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 筛选范围列表 样例：[{"range_id":0,"range_from":1,"range_to":1500},{"range_id":1,"range_from":1,"range_to":1500}]
     */
    @JsonProperty("range_list")
    private List<RangeListItem> rangeList;

    /**
     * 排序方式:0-综合排序;1-按佣金比率升序;2-按佣金比例降序;3-按价格升序;4-按价格降序;5-按销量升序;6-按销量降序;7-优惠券金额排序升序;8-优惠券金额排序降序;9-券后价升序排序;10-券后价降序排序;11-按照加入多多进宝时间升序;12-按照加入多多进宝时间降序;13-按佣金金额升序排序;14-按佣金金额降序排序;15-店铺描述评分升序;16-店铺描述评分降序;17-店铺物流评分升序;18-店铺物流评分降序;19-店铺服务评分升序;20-店铺服务评分降序;27-描述评分击败同类店铺百分比升序，28-描述评分击败同类店铺百分比降序，29-物流评分击败同类店铺百分比升序，30-物流评分击败同类店铺百分比降序，31-服务评分击败同类店铺百分比升序，32-服务评分击败同类店铺百分比降序
     */
    @JsonProperty("sort_type")
    private Integer sortType;

    /**
     * 是否使用个性化推荐，true表示使用，false表示不使用，默认true。
     */
    @JsonProperty("use_customized")
    private Boolean useCustomized;

    /**
     * 是否只返回优惠券的商品，false返回所有商品，true只返回有优惠券的商品
     */
    @JsonProperty("with_coupon")
    private Boolean withCoupon;

    /**
     * 风控参数
     */
    @JsonProperty("risk_params")
    private Map<String, String> riskParams;

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
        return "pdd.ddk.oauth.goods.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthGoodsSearchResponse> getResponseClass() {
        return PddDdkOauthGoodsSearchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_tags", activityTags);
        setUserParam(params, "block_cat_packages", blockCatPackages);
        setUserParam(params, "block_cats", blockCats);
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "force_auth_duo_id", forceAuthDuoId);
        setUserParam(params, "goods_img_type", goodsImgType);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "is_brand_goods", isBrandGoods);
        setUserParam(params, "keyword", keyword);
        setUserParam(params, "list_id", listId);
        setUserParam(params, "merchant_type", merchantType);
        setUserParam(params, "merchant_type_list", merchantTypeList);
        setUserParam(params, "opt_id", optId);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "pid", pid);
        setUserParam(params, "range_list", rangeList);
        setUserParam(params, "sort_type", sortType);
        setUserParam(params, "use_customized", useCustomized);
        setUserParam(params, "with_coupon", withCoupon);
        setUserParam(params, "risk_params", riskParams);
    }

    public void setActivityTags(List<Integer> activityTags) {
        this.activityTags = activityTags;
    }

    public void setBlockCatPackages(List<Integer> blockCatPackages) {
        this.blockCatPackages = blockCatPackages;
    }

    public void setBlockCats(List<Integer> blockCats) {
        this.blockCats = blockCats;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setForceAuthDuoId(Boolean forceAuthDuoId) {
        this.forceAuthDuoId = forceAuthDuoId;
    }

    public void setGoodsImgType(Integer goodsImgType) {
        this.goodsImgType = goodsImgType;
    }

    public void setGoodsSignList(List<String> goodsSignList) {
        this.goodsSignList = goodsSignList;
    }

    public void setIsBrandGoods(Boolean isBrandGoods) {
        this.isBrandGoods = isBrandGoods;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public void setMerchantTypeList(List<Integer> merchantTypeList) {
        this.merchantTypeList = merchantTypeList;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setRangeList(List<RangeListItem> rangeList) {
        this.rangeList = rangeList;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public void setUseCustomized(Boolean useCustomized) {
        this.useCustomized = useCustomized;
    }

    public void setWithCoupon(Boolean withCoupon) {
        this.withCoupon = withCoupon;
    }

    public void setRiskParams(Map<String, String> riskParams) {
        this.riskParams = riskParams;
    }

    public static class RangeListItem {

        /**
         * 区间的开始值
         */
        @JsonProperty("range_from")
        private Long rangeFrom;

        /**
         * 0，最小成团价 1，券后价 2，佣金比例 3，优惠券价格 4，广告创建时间 5，销量 6，佣金金额 7，店铺描述分 8，店铺物流分 9，店铺服务分 10， 店铺描述分击败同行业百分比 11， 店铺物流分击败同行业百分比 12，店铺服务分击败同行业百分比 13，商品分 17 ，优惠券/最小团购价 18，过去两小时pv 19，过去两小时销量
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
}