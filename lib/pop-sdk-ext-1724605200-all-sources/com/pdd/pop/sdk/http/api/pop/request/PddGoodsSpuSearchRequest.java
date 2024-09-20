package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSpuSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsSpuSearchRequest extends PopBaseHttpRequest<PddGoodsSpuSearchResponse> {

    /**
     * 类目ID，可以是一二三四级类目，在该类目下进行搜索。
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 标品关键属性精确匹配。和标品标题必须入参其一。
     */
    @JsonProperty("key_prop")
    private List<KeyPropItem> keyProp;

    /**
     * 标品标题模糊搜索。和关键属性必须入参其一。
     */
    @JsonProperty("spu_name")
    private String spuName;

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
        return "pdd.goods.spu.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSpuSearchResponse> getResponseClass() {
        return PddGoodsSpuSearchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "key_prop", keyProp);
        setUserParam(params, "spu_name", spuName);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setKeyProp(List<KeyPropItem> keyProp) {
        this.keyProp = keyProp;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public static class KeyPropItem {

        /**
         * 关键属性的引用属性ID，需要从pdd.cat.rule.get中获取。
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 关键属性值，需要从pdd.goods.cat.rule.get中获取。当要根据关键属性匹配时，和vid必须入参其一。
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 关键属性值ID，需要从pdd.goods.cat.rule.get中获取规则。当要根据关键属性匹配时，和value必须入参其一。
         */
        @JsonProperty("vid")
        private Long vid;

        public void setRefPid(Long refPid) {
            this.refPid = refPid;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
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