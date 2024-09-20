package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderSearchOrderResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("search_order_response")
    private SearchOrderResponse searchOrderResponse;

    public SearchOrderResponse getSearchOrderResponse() {
        return searchOrderResponse;
    }

    public static class SearchOrderResponse {

        /**
         * 检索出的订单号列表。按照下单时间倒序，最多返回最近的100笔订单
         */
        @JsonProperty("order_sn_list")
        private List<String> orderSnList;

        public List<String> getOrderSnList() {
            return orderSnList;
        }
    }
}