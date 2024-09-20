package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierChangeUserNumberResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierChangeUserNumberRequest extends PopBaseHttpRequest<PddKnockSupplierChangeUserNumberResponse> {

    /**
     * 修改外部人员uid
     */
    @JsonProperty("supplier_change_user_number_request")
    private SupplierChangeUserNumberRequest supplierChangeUserNumberRequest;

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
        return "pdd.knock.supplier.change.user.number";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierChangeUserNumberResponse> getResponseClass() {
        return PddKnockSupplierChangeUserNumberResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "supplier_change_user_number_request", supplierChangeUserNumberRequest);
    }

    public void setSupplierChangeUserNumberRequest(SupplierChangeUserNumberRequest supplierChangeUserNumberRequest) {
        this.supplierChangeUserNumberRequest = supplierChangeUserNumberRequest;
    }

    public static class SupplierChangeUserNumberRequest {

        /**
         * 新的人员uid
         */
        @JsonProperty("new_user_number")
        private String newUserNumber;

        /**
         * 老的人员uid
         */
        @JsonProperty("old_user_number")
        private String oldUserNumber;

        public void setNewUserNumber(String newUserNumber) {
            this.newUserNumber = newUserNumber;
        }

        public void setOldUserNumber(String oldUserNumber) {
            this.oldUserNumber = oldUserNumber;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}