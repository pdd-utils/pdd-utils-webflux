package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddWaybillQueryByWaybillcodeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddWaybillQueryByWaybillcodeRequest extends PopBaseHttpRequest<PddWaybillQueryByWaybillcodeResponse> {

    /**
     * 系统自动生成
     */
    @JsonProperty("param_list")
    private List<ParamListItem> paramList;

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
        return "pdd.waybill.query.by.waybillcode";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddWaybillQueryByWaybillcodeResponse> getResponseClass() {
        return PddWaybillQueryByWaybillcodeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_list", paramList);
    }

    public void setParamList(List<ParamListItem> paramList) {
        this.paramList = paramList;
    }

    public static class ParamListItem {

        /**
         * 请求id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 电子面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        /**
         * 快递公司code
         */
        @JsonProperty("wp_code")
        private String wpCode;

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setWaybillCode(String waybillCode) {
            this.waybillCode = waybillCode;
        }

        public void setWpCode(String wpCode) {
            this.wpCode = wpCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}