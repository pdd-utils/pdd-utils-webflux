package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSpuSearchResponse extends PopBaseHttpResponse {

    /**
     * 标品搜索查询结果
     */
    @JsonProperty("spu_search_response")
    private SpuSearchResponse spuSearchResponse;

    public SpuSearchResponse getSpuSearchResponse() {
        return spuSearchResponse;
    }

    public static class SpuSearchResponse {

        /**
         * 标品列表
         */
        @JsonProperty("spu_list")
        private List<SpuSearchResponseSpuListItem> spuList;

        public List<SpuSearchResponseSpuListItem> getSpuList() {
            return spuList;
        }
    }

    public static class SpuSearchResponseSpuListItem {

        /**
         * 标品所在的类目ID。若非叶子类目，表示该标品可用于该类目下的任何叶子类目。
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 关键属性
         */
        @JsonProperty("key_prop")
        private List<SpuSearchResponseSpuListItemKeyPropItem> keyProp;

        /**
         * 标品标题
         */
        @JsonProperty("spu_name")
        private String spuName;

        public Long getCatId() {
            return catId;
        }

        public List<SpuSearchResponseSpuListItemKeyPropItem> getKeyProp() {
            return keyProp;
        }

        public String getSpuName() {
            return spuName;
        }
    }

    public static class SpuSearchResponseSpuListItemKeyPropItem {

        /**
         * 引用属性ID
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值ID
         */
        @JsonProperty("vid")
        private Long vid;

        public Long getRefPid() {
            return refPid;
        }

        public String getValue() {
            return value;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public Long getVid() {
            return vid;
        }
    }
}