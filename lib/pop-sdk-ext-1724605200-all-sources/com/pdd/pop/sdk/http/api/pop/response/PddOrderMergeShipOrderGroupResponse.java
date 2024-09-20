package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderMergeShipOrderGroupResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("merge_ship_order_group_response")
    private MergeShipOrderGroupResponse mergeShipOrderGroupResponse;

    public MergeShipOrderGroupResponse getMergeShipOrderGroupResponse() {
        return mergeShipOrderGroupResponse;
    }

    public static class MergeShipOrderGroupResponse {

        /**
         * 订单分组结果
         */
        @JsonProperty("order_group_list")
        private List<MergeShipOrderGroupResponseOrderGroupListItem> orderGroupList;

        public List<MergeShipOrderGroupResponseOrderGroupListItem> getOrderGroupList() {
            return orderGroupList;
        }
    }

    public static class MergeShipOrderGroupResponseOrderGroupListItem {

        /**
         * 可以合并发货的订单号列表。不同列表之间不能合并发货
         */
        @JsonProperty("order_sn_list")
        private List<String> orderSnList;

        public List<String> getOrderSnList() {
            return orderSnList;
        }
    }
}