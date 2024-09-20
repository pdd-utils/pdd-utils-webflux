package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderMergeShipOrderGroupResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOrderMergeShipOrderGroupRequest extends PopBaseHttpRequest<PddOrderMergeShipOrderGroupResponse> {

    /**
     * 订单列表，最多支持100个
     */
    @JsonProperty("order_list")
    private List<OrderListItem> orderList;

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
        return "pdd.order.merge.ship.order.group";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderMergeShipOrderGroupResponse> getResponseClass() {
        return PddOrderMergeShipOrderGroupResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_list", orderList);
    }

    public void setOrderList(List<OrderListItem> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListItem {

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}