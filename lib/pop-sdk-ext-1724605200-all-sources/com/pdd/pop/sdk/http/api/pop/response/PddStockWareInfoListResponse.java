package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddStockWareInfoListResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("stock_ware_info_list_response")
    private StockWareInfoListResponse stockWareInfoListResponse;

    public StockWareInfoListResponse getStockWareInfoListResponse() {
        return stockWareInfoListResponse;
    }

    public static class StockWareInfoListResponse {

        /**
         * 货品信息列表
         */
        @JsonProperty("ware_list")
        private List<StockWareInfoListResponseWareListItem> wareList;

        public List<StockWareInfoListResponseWareListItem> getWareList() {
            return wareList;
        }
    }

    public static class StockWareInfoListResponseWareListItem {

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 货品ID
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 是否删除
         */
        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        public String getWareSn() {
            return wareSn;
        }

        public Long getWareId() {
            return wareId;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }
    }
}