package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDistributionExtraSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDistributionExtraSyncRequest extends PopBaseHttpRequest<PddDistributionExtraSyncResponse> {

    /**
     * 代发类型. 可选值含义说明:[1:站外平台代发;2:ISV自有供应链平台代发;3:拼多多站内代发;4:站外货源渠道;5:其他]
     */
    @JsonProperty("distributionType")
    private Integer distributionType;

    /**
     * 上游采购运费-单位分
     */
    @JsonProperty("expressFee")
    private Long expressFee;

    /**
     * 拼多多订单号
     */
    @JsonProperty("orderSn")
    private String orderSn;

    /**
     * 采购商品链接
     */
    @JsonProperty("outDetailUrl")
    private String outDetailUrl;

    /**
     * 采购订单金额(单位：分)
     */
    @JsonProperty("outGoodsPrice")
    private Long outGoodsPrice;

    /**
     * 上游采购商品单价（即采购sku价格）-单位分
     */
    @JsonProperty("outGoodsUnitPrice")
    private Long outGoodsUnitPrice;

    /**
     * 采购订单号
     */
    @JsonProperty("outOrderSn")
    private String outOrderSn;

    /**
     * 上游采购数量（如：一单采购10件商品，回传10）
     */
    @JsonProperty("quantity")
    private Long quantity;

    /**
     * 运单号
     */
    @JsonProperty("trackNumber")
    private String trackNumber;

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
        return "pdd.distribution.extra.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDistributionExtraSyncResponse> getResponseClass() {
        return PddDistributionExtraSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "distributionType", distributionType);
        setUserParam(params, "expressFee", expressFee);
        setUserParam(params, "orderSn", orderSn);
        setUserParam(params, "outDetailUrl", outDetailUrl);
        setUserParam(params, "outGoodsPrice", outGoodsPrice);
        setUserParam(params, "outGoodsUnitPrice", outGoodsUnitPrice);
        setUserParam(params, "outOrderSn", outOrderSn);
        setUserParam(params, "quantity", quantity);
        setUserParam(params, "trackNumber", trackNumber);
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    public void setExpressFee(Long expressFee) {
        this.expressFee = expressFee;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOutDetailUrl(String outDetailUrl) {
        this.outDetailUrl = outDetailUrl;
    }

    public void setOutGoodsPrice(Long outGoodsPrice) {
        this.outGoodsPrice = outGoodsPrice;
    }

    public void setOutGoodsUnitPrice(Long outGoodsUnitPrice) {
        this.outGoodsUnitPrice = outGoodsUnitPrice;
    }

    public void setOutOrderSn(String outOrderSn) {
        this.outOrderSn = outOrderSn;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }
}