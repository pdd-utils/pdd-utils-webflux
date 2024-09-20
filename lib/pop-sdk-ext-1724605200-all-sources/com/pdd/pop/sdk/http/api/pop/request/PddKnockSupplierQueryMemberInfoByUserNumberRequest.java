package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierQueryMemberInfoByUserNumberResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierQueryMemberInfoByUserNumberRequest extends PopBaseHttpRequest<PddKnockSupplierQueryMemberInfoByUserNumberResponse> {

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
        return "pdd.knock.supplier.query.member.info.by.user.number";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierQueryMemberInfoByUserNumberResponse> getResponseClass() {
        return PddKnockSupplierQueryMemberInfoByUserNumberResponse.class;
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
         * userNumbers
         */
        @JsonProperty("user_numbers")
        private List<String> userNumbers;

        public void setUserNumbers(List<String> userNumbers) {
            this.userNumbers = userNumbers;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}