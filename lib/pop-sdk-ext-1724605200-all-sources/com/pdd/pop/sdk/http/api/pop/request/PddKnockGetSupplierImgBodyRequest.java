package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockGetSupplierImgBodyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockGetSupplierImgBodyRequest extends PopBaseHttpRequest<PddKnockGetSupplierImgBodyResponse> {

    /**
     * 文件请求体
     */
    @JsonProperty("supplier_file_req")
    private SupplierFileReq supplierFileReq;

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
        return "pdd.knock.get.supplier.img.body";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockGetSupplierImgBodyResponse> getResponseClass() {
        return PddKnockGetSupplierImgBodyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "supplier_file_req", supplierFileReq);
    }

    public void setSupplierFileReq(SupplierFileReq supplierFileReq) {
        this.supplierFileReq = supplierFileReq;
    }

    public static class SupplierFileReq {

        /**
         * 机器人名称
         */
        @JsonProperty("robot_name")
        private String robotName;

        /**
         * 从pdd.knock.supplier.img.upload 获取的图片url
         */
        @JsonProperty("url")
        private String url;

        public void setRobotName(String robotName) {
            this.robotName = robotName;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}