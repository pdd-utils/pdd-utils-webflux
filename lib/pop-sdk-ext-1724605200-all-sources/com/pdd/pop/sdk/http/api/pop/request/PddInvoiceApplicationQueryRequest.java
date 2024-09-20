package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddInvoiceApplicationQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddInvoiceApplicationQueryRequest extends PopBaseHttpRequest<PddInvoiceApplicationQueryResponse> {

    /**
     * 订单号；订单号和申请时间必填其一
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 页码，默认1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页返回数目，默认50
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 是否正品发票 0=非正品发票 1=是正品发票
     */
    @JsonProperty("quality_goods_invoice")
    private Integer qualityGoodsInvoice;

    /**
     * 申请状态：0-已拒绝，1-申请中，2-已同意
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 申请结束时间, 时间戳（单位毫秒，查询时间间隔不可超过15天）
     */
    @JsonProperty("update_end_time")
    private Long updateEndTime;

    /**
     * 申请开始时间, 时间戳（单位毫秒，查询时间间隔不可超过15天）
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
        return "pdd.invoice.application.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceApplicationQueryResponse> getResponseClass() {
        return PddInvoiceApplicationQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "quality_goods_invoice", qualityGoodsInvoice);
        setUserParam(params, "status", status);
        setUserParam(params, "update_end_time", updateEndTime);
        setUserParam(params, "update_start_time", updateStartTime);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setQualityGoodsInvoice(Integer qualityGoodsInvoice) {
        this.qualityGoodsInvoice = qualityGoodsInvoice;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public void setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
    }
}