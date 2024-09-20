package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsPropOutConvertResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsPropOutConvertRequest extends PopBaseHttpRequest<PddGoodsPropOutConvertResponse> {

    /**
     * 拼多多叶子类目id
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 外站属性信息
     */
    @JsonProperty("out_property_dtos")
    private List<OutPropertyDtosItem> outPropertyDtos;

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
        return "pdd.goods.prop.out.convert";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsPropOutConvertResponse> getResponseClass() {
        return PddGoodsPropOutConvertResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "out_property_dtos", outPropertyDtos);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setOutPropertyDtos(List<OutPropertyDtosItem> outPropertyDtos) {
        this.outPropertyDtos = outPropertyDtos;
    }

    public static class OutPropertyDtosItem {

        /**
         * 外站属性名
         */
        @JsonProperty("out_property")
        private String outProperty;

        /**
         * 外站属性名
         */
        @JsonProperty("out_value")
        private String outValue;

        public void setOutProperty(String outProperty) {
            this.outProperty = outProperty;
        }

        public void setOutValue(String outValue) {
            this.outValue = outValue;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}