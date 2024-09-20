package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockWareWarehouseQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddStockWareWarehouseQueryRequest extends PopBaseHttpRequest<PddStockWareWarehouseQueryResponse> {

    /**
     * 请求对象
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
        return "pdd.stock.ware.warehouse.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareWarehouseQueryResponse> getResponseClass() {
        return PddStockWareWarehouseQueryResponse.class;
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
         * 当前页数
         */
        @JsonProperty("page")
        private Integer page;

        /**
         * 页显示数据条数
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        /**
         * 货品编码列表
         */
        @JsonProperty("ware_sn_list")
        private List<String> wareSnList;

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setWareSnList(List<String> wareSnList) {
            this.wareSnList = wareSnList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}