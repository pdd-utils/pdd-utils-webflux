package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCatsGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_cats_get_response")
    private GoodsCatsGetResponse goodsCatsGetResponse;

    public GoodsCatsGetResponse getGoodsCatsGetResponse() {
        return goodsCatsGetResponse;
    }

    public static class GoodsCatsGetResponse {

        /**
         * 类目树对象
         */
        @JsonProperty("goods_cats_list")
        private List<GoodsCatsGetResponseGoodsCatsListItem> goodsCatsList;

        public List<GoodsCatsGetResponseGoodsCatsListItem> getGoodsCatsList() {
            return goodsCatsList;
        }
    }

    public static class GoodsCatsGetResponseGoodsCatsListItem {

        /**
         * 商品类目ID
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 商品类目名称
         */
        @JsonProperty("cat_name")
        private String catName;

        /**
         * 类目层级，1-一级类目，2-二级类目，3-三级类目，4-四级类目
         */
        @JsonProperty("level")
        private Integer level;

        /**
         * id所属父类目ID，其中，parent_id=0时为顶级节点
         */
        @JsonProperty("parent_cat_id")
        private Long parentCatId;

        public Long getCatId() {
            return catId;
        }

        public String getCatName() {
            return catName;
        }

        public Integer getLevel() {
            return level;
        }

        public Long getParentCatId() {
            return parentCatId;
        }
    }
}