package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierQueryMemberInfoByKnockIdResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierQueryMemberInfoByKnockIdRequest extends PopBaseHttpRequest<PddKnockSupplierQueryMemberInfoByKnockIdResponse> {

    /**
     * 查询人员信息请求
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
        return "pdd.knock.supplier.query.member.info.by.knock.id";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierQueryMemberInfoByKnockIdResponse> getResponseClass() {
        return PddKnockSupplierQueryMemberInfoByKnockIdResponse.class;
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
         * knockIds
         */
        @JsonProperty("knock_id_list")
        private List<String> knockIdList;

        public void setKnockIdList(List<String> knockIdList) {
            this.knockIdList = knockIdList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}