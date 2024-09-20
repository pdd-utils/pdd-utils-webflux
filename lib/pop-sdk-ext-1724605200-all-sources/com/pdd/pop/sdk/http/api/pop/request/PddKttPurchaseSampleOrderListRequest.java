package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSampleOrderListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSampleOrderListRequest extends PopBaseHttpRequest<PddKttPurchaseSampleOrderListResponse> {

    /**
     * 请求信息
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.ktt.purchase.sample.order.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSampleOrderListResponse> getResponseClass() {
        return PddKttPurchaseSampleOrderListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * -1-未发起售后 1-待团长退货 10-待供货商处理 11-已退货，待供货商处理 20-退款中 30-退款成功 31-已撤销 32-已驳回
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 取消状态 0-未取消 1-已取消
         */
        @JsonProperty("cancel_status")
        private Integer cancelStatus;

        /**
         * 截止更新时间（含）
         */
        @JsonProperty("end_update_time")
        private String endUpdateTime;

        /**
         * 页码
         */
        @JsonProperty("page_no")
        private Integer pageNo;

        /**
         * 分页大小
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        /**
         * 0- 未发货 1-已发货 （不包含已取消订单）
         */
        @JsonProperty("shipping_status")
        private Integer shippingStatus;

        /**
         * 起始更新时间（含）
         */
        @JsonProperty("start_updated_time")
        private String startUpdatedTime;

        public void setAfterSalesStatus(Integer afterSalesStatus) {
            this.afterSalesStatus = afterSalesStatus;
        }

        public void setCancelStatus(Integer cancelStatus) {
            this.cancelStatus = cancelStatus;
        }

        public void setEndUpdateTime(String endUpdateTime) {
            this.endUpdateTime = endUpdateTime;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setShippingStatus(Integer shippingStatus) {
            this.shippingStatus = shippingStatus;
        }

        public void setStartUpdatedTime(String startUpdatedTime) {
            this.startUpdatedTime = startUpdatedTime;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}