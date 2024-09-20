package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionLimitedDiscountListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPromotionLimitedDiscountListGetRequest extends PopBaseHttpRequest<PddPromotionLimitedDiscountListGetResponse> {

    /**
     * 支持多个活动类型的查询。3-限量折扣；12-限时折扣。
     */
    @JsonProperty("activity_types")
    private List<Integer> activityTypes;

    /**
     * 商品id列表
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 默认false。true-仅返回活动数量；false-返回活动数量和活动设置数据
     */
    @JsonProperty("just_count")
    private Boolean justCount;

    /**
     * 0:创建时间升序  1:创建时间降序
     */
    @JsonProperty("order")
    private Integer order;

    /**
     * 页码，默认1
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 页大小，默认10
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 支持多个活动状态的查询。1-未开始，2-进行中，3-结束|系统结束，4-结束|商家结束，5-提前结束，6-商品处罚中（屏蔽中）。其中3,4,5都算是结束状态。
     */
    @JsonProperty("status_list")
    private List<Integer> statusList;

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
        return "pdd.promotion.limited.discount.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionLimitedDiscountListGetResponse> getResponseClass() {
        return PddPromotionLimitedDiscountListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_types", activityTypes);
        setUserParam(params, "goods_id_list", goodsIdList);
        setUserParam(params, "just_count", justCount);
        setUserParam(params, "order", order);
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "status_list", statusList);
    }

    public void setActivityTypes(List<Integer> activityTypes) {
        this.activityTypes = activityTypes;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setJustCount(Boolean justCount) {
        this.justCount = justCount;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }
}