package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFdsOrderListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFdsOrderListGetRequest extends PopBaseHttpRequest<PddFdsOrderListGetResponse> {

    /**
     * 入参信息
     */
    @JsonProperty("param_fds_order_list_get_request")
    private ParamFdsOrderListGetRequest paramFdsOrderListGetRequest;

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
        return "pdd.fds.order.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFdsOrderListGetResponse> getResponseClass() {
        return PddFdsOrderListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_fds_order_list_get_request", paramFdsOrderListGetRequest);
    }

    public void setParamFdsOrderListGetRequest(ParamFdsOrderListGetRequest paramFdsOrderListGetRequest) {
        this.paramFdsOrderListGetRequest = paramFdsOrderListGetRequest;
    }

    public static class ParamFdsOrderListGetRequest {

        /**
         * 必填，更新时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总毫秒数 PS：开始时间结束时间间距不超过半小时
         */
        @JsonProperty("end_updated_time")
        private Long endUpdatedTime;

        /**
         * 返回页码，页码从 1 开始 PS：当前采用分页返回，数量和页数会一起传
         */
        @JsonProperty("page")
        private Integer page;

        /**
         * 返回数量，最大 100
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        /**
         * 必填，更新时间开始时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总毫秒数 PS：开始时间结束时间间距不超过半小时
         */
        @JsonProperty("start_updated_time")
        private Long startUpdatedTime;

        public void setEndUpdatedTime(Long endUpdatedTime) {
            this.endUpdatedTime = endUpdatedTime;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setStartUpdatedTime(Long startUpdatedTime) {
            this.startUpdatedTime = startUpdatedTime;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}