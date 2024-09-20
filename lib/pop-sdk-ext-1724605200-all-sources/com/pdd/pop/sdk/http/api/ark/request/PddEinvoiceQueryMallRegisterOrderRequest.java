package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddEinvoiceQueryMallRegisterOrderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddEinvoiceQueryMallRegisterOrderRequest extends PopBaseHttpRequest<PddEinvoiceQueryMallRegisterOrderResponse> {

    /**
     * 业务数据
     */
    @JsonProperty("data")
    private Data data;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.einvoice.query.mall.register.order";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddEinvoiceQueryMallRegisterOrderResponse> getResponseClass() {
        return PddEinvoiceQueryMallRegisterOrderResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data", data);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        /**
         * 页码
         */
        @JsonProperty("page")
        private Integer page;

        /**
         * 分页大小
         */
        @JsonProperty("pageSize")
        private Integer pageSize;

        /**
         * 查询条件
         */
        @JsonProperty("request")
        private DataRequest request;

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setRequest(DataRequest request) {
            this.request = request;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DataRequest {

        /**
         * 接口版本，写死 1.0.0
         */
        @JsonProperty("einvoiceApiVersion")
        private String einvoiceApiVersion;

        /**
         * 结束时间戳，秒
         */
        @JsonProperty("endTime")
        private Long endTime;

        /**
         * 查询目标状态列表
         */
        @JsonProperty("registerStatusList")
        private List<Integer> registerStatusList;

        /**
         * 开始时间戳，秒
         */
        @JsonProperty("startTime")
        private Long startTime;

        public void setEinvoiceApiVersion(String einvoiceApiVersion) {
            this.einvoiceApiVersion = einvoiceApiVersion;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public void setRegisterStatusList(List<Integer> registerStatusList) {
            this.registerStatusList = registerStatusList;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}