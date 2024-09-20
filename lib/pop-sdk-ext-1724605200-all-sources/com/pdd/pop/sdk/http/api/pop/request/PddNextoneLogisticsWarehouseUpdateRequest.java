package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddNextoneLogisticsWarehouseUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddNextoneLogisticsWarehouseUpdateRequest extends PopBaseHttpRequest<PddNextoneLogisticsWarehouseUpdateResponse> {

    /**
     * request
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
        return "pdd.nextone.logistics.warehouse.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddNextoneLogisticsWarehouseUpdateResponse> getResponseClass() {
        return PddNextoneLogisticsWarehouseUpdateResponse.class;
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
         * 售后id
         */
        @JsonProperty("after_sales_id")
        private Long afterSalesId;

        /**
         * 操作时间
         */
        @JsonProperty("operate_time")
        private Long operateTime;

        /**
         * order_sn
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 物流公司id
         */
        @JsonProperty("reverse_logistics_id")
        private Integer reverseLogisticsId;

        /**
         * 物流单号
         */
        @JsonProperty("reverse_tracking_number")
        private String reverseTrackingNumber;

        /**
         * 退货入库状态 1：成功；2：失败
         */
        @JsonProperty("warehouse_status")
        private Integer warehouseStatus;

        public void setAfterSalesId(Long afterSalesId) {
            this.afterSalesId = afterSalesId;
        }

        public void setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setReverseLogisticsId(Integer reverseLogisticsId) {
            this.reverseLogisticsId = reverseLogisticsId;
        }

        public void setReverseTrackingNumber(String reverseTrackingNumber) {
            this.reverseTrackingNumber = reverseTrackingNumber;
        }

        public void setWarehouseStatus(Integer warehouseStatus) {
            this.warehouseStatus = warehouseStatus;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}