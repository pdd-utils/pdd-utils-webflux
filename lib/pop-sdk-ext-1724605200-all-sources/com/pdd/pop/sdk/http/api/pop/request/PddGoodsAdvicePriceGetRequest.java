package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsAdvicePriceGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsAdvicePriceGetRequest extends PopBaseHttpRequest<PddGoodsAdvicePriceGetResponse> {

    /**
     * 获取商品建议价格请求参数
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
        return "pdd.goods.advice.price.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsAdvicePriceGetResponse> getResponseClass() {
        return PddGoodsAdvicePriceGetResponse.class;
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
         * 页码，默认1
         */
        @JsonProperty("page")
        private Integer page;

        /**
         * 每页数量，默认100，最大100
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}