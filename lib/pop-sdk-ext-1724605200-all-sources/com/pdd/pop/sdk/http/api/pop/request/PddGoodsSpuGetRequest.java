package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSpuGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsSpuGetRequest extends PopBaseHttpRequest<PddGoodsSpuGetResponse> {

    /**
     * 标品所在的类目ID
     */
    @JsonProperty("cat_id")
    private String catId;

    /**
     * 关键属性
     */
    @JsonProperty("key_prop")
    private List<KeyPropItem> keyProp;

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
        return "pdd.goods.spu.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSpuGetResponse> getResponseClass() {
        return PddGoodsSpuGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "key_prop", keyProp);
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public void setKeyProp(List<KeyPropItem> keyProp) {
        this.keyProp = keyProp;
    }

    public static class KeyPropItem {

        /**
         * 引用属性ID
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 关键属性值，和vid必须入参其一。
         */
        @JsonProperty("value")
        private String value;

        /**
         * 关键属性值ID，和value必须入参其一。
         */
        @JsonProperty("vid")
        private Long vid;

        public void setRefPid(Long refPid) {
            this.refPid = refPid;
        }

        public void setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setVid(Long vid) {
            this.vid = vid;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}