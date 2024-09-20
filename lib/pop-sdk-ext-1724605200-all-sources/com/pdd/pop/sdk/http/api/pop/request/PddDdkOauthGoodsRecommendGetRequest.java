package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthGoodsRecommendGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthGoodsRecommendGetRequest extends PopBaseHttpRequest<PddDdkOauthGoodsRecommendGetResponse> {

    /**
     * 活动商品标记数组，例：[4,7]，4-秒杀，7-百亿补贴，10851-千万补贴，11879-千万神券，10913-招商礼金商品，31-品牌黑标，10564-精选爆品-官方直推爆款，10584-精选爆品-团长推荐，24-品牌高佣，其他的值请忽略
     */
    @JsonProperty("activity_tags")
    private List<Integer> activityTags;

    /**
     * 猜你喜欢场景的商品类目，20100-百货，20200-母婴，20300-食品，20400-女装，20500-电器，20600-鞋包，20700-内衣，20800-美妆，20900-男装，21000-水果，21100-家纺，21200-文具,21300-运动,21400-虚拟,21500-汽车,21600-家装,21700-家具,21800-医药;
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 进宝频道推广商品: 1-今日销量榜,3-相似商品推荐,4-猜你喜欢(和进宝网站精选一致),5-实时热销榜,6-实时收益榜。默认值5
     */
    @JsonProperty("channel_type")
    private Integer channelType;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 为用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 为上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。
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
     * 商品goodsSign列表，相似商品推荐场景时必传，仅取数组的第一位，例如：["c9r2omogKFFAc7WBwvbZU1ikIb16_J3CTa8HNN"]。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign_list")
    private List<String> goodsSignList;

    /**
     * 一页请求数量；默认值 ： 20
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * 翻页时建议填写前页返回的list_id值
     */
    @JsonProperty("list_id")
    private String listId;

    /**
     * 从多少位置开始请求；默认值 ： 0
     */
    @JsonProperty("offset")
    private Integer offset;

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

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
        return "pdd.ddk.oauth.goods.recommend.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthGoodsRecommendGetResponse> getResponseClass() {
        return PddDdkOauthGoodsRecommendGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_tags", activityTags);
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "channel_type", channelType);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "force_auth_duo_id", forceAuthDuoId);
        setUserParam(params, "goods_img_type", goodsImgType);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "limit", limit);
        setUserParam(params, "list_id", listId);
        setUserParam(params, "offset", offset);
        setUserParam(params, "pid", pid);
        setUserParam(params, "risk_params", riskParams);
    }

    public void setActivityTags(List<Integer> activityTags) {
        this.activityTags = activityTags;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setRiskParams(Map<String, String> riskParams) {
        this.riskParams = riskParams;
    }
}