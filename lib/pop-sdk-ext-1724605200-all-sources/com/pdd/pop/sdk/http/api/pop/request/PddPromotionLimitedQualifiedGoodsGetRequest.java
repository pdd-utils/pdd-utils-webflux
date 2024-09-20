package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionLimitedQualifiedGoodsGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPromotionLimitedQualifiedGoodsGetRequest extends PopBaseHttpRequest<PddPromotionLimitedQualifiedGoodsGetResponse> {

    /**
     * 商品id列表
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * TRUE-仅查询可选商品（满足活动资格商品）数据；FALSE-查询不可选商品数据
     */
    @JsonProperty("is_valid")
    private Boolean isValid;

    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 每页查询数
     */
    @JsonProperty("page_size")
    private Integer pageSize;

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
        return "pdd.promotion.limited.qualified.goods.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionLimitedQualifiedGoodsGetResponse> getResponseClass() {
        return PddPromotionLimitedQualifiedGoodsGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id_list", goodsIdList);
        setUserParam(params, "is_valid", isValid);
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}