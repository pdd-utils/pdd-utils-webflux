package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsOptGetResponse extends PopBaseHttpResponse {

    /**
     * 返回response
     */
    @JsonProperty("goods_opt_get_response")
    private GoodsOptGetResponse goodsOptGetResponse;

    public GoodsOptGetResponse getGoodsOptGetResponse() {
        return goodsOptGetResponse;
    }

    public static class GoodsOptGetResponse {

        /**
         * opt列表
         */
        @JsonProperty("goods_opt_list")
        private List<GoodsOptGetResponseGoodsOptListItem> goodsOptList;

        public List<GoodsOptGetResponseGoodsOptListItem> getGoodsOptList() {
            return goodsOptList;
        }
    }

    public static class GoodsOptGetResponseGoodsOptListItem {

        /**
         * 层级，1-一级，2-二级，3-三级，4-四级
         */
        @JsonProperty("level")
        private Integer level;

        /**
         * 商品标签ID
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * id所属父ID，其中，parent_id=0时为顶级节点
         */
        @JsonProperty("parent_opt_id")
        private Long parentOptId;

        public Integer getLevel() {
            return level;
        }

        public Long getOptId() {
            return optId;
        }

        public String getOptName() {
            return optName;
        }

        public Long getParentOptId() {
            return parentOptId;
        }
    }
}