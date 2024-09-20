package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderRefundGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttOrderRefundGetRequest extends PopBaseHttpRequest<PddKttOrderRefundGetResponse> {

    /**
     * 父单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 页码，第x页，从1开始
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页大小，1～10之间，建议为5即可
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
        return "pdd.ktt.order.refund.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderRefundGetResponse> getResponseClass() {
        return PddKttOrderRefundGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}