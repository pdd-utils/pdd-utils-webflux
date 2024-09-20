package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddStockWareWarehouseQueryResponse extends PopBaseHttpResponse {

    /**
     * 查询结果
     */
    @JsonProperty("result")
    private Result result;

    public Result getResult() {
        return result;
    }

    public static class Result {

        /**
         * 总数
         */
        @JsonProperty("total")
        private Long total;

        /**
         * 查询结果
         */
        @JsonProperty("ware_sn_warehouse_info")
        private Map<String, List<ResultWareSnWarehouseInfoValueItem>> wareSnWarehouseInfo;

        public Long getTotal() {
            return total;
        }

        public Map<String, List<ResultWareSnWarehouseInfoValueItem>> getWareSnWarehouseInfo() {
            return wareSnWarehouseInfo;
        }
    }

    public static class ResultWareSnWarehouseInfoValueItem {

        /**
         * 库存数量
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 仓库名称
         */
        @JsonProperty("warehouse_name")
        private String warehouseName;

        /**
         * 仓库编码
         */
        @JsonProperty("warehouse_sn")
        private String warehouseSn;

        public Long getQuantity() {
            return quantity;
        }

        public String getWarehouseName() {
            return warehouseName;
        }

        public String getWarehouseSn() {
            return warehouseSn;
        }
    }
}