package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierQueryMemberInfoByMobileMd5Response;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierQueryMemberInfoByMobileMd5Request extends PopBaseHttpRequest<PddKnockSupplierQueryMemberInfoByMobileMd5Response> {

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
        return "pdd.knock.supplier.query.member.info.by.mobile.md5";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierQueryMemberInfoByMobileMd5Response> getResponseClass() {
        return PddKnockSupplierQueryMemberInfoByMobileMd5Response.class;
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
         * md5Mobiles
         */
        @JsonProperty("md5_mobiles")
        private List<String> md5Mobiles;

        public void setMd5Mobiles(List<String> md5Mobiles) {
            this.md5Mobiles = md5Mobiles;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}