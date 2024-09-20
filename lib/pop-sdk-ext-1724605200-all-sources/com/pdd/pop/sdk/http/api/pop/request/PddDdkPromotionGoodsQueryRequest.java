package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkPromotionGoodsQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkPromotionGoodsQueryRequest extends PopBaseHttpRequest<PddDdkPromotionGoodsQueryResponse> {

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 分页查询页数
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页查询页大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 查询状态列表
     */
    @JsonProperty("status_list")
    private List<Integer> statusList;

    /**
     * 最后更新开始时间
     */
    @JsonProperty("update_end_time")
    private Long updateEndTime;

    /**
     * 最后更新结束时间（最长支持30天）
     */
    @JsonProperty("update_start_time")
    private Long updateStartTime;

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
        return "pdd.ddk.promotion.goods.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkPromotionGoodsQueryResponse> getResponseClass() {
        return PddDdkPromotionGoodsQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "status_list", statusList);
        setUserParam(params, "update_end_time", updateEndTime);
        setUserParam(params, "update_start_time", updateStartTime);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public void setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
    }
}