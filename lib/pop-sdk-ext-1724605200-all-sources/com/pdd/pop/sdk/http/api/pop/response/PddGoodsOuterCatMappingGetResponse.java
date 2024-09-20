package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsOuterCatMappingGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("outer_cat_mapping_get_response")
    private OuterCatMappingGetResponse outerCatMappingGetResponse;

    public OuterCatMappingGetResponse getOuterCatMappingGetResponse() {
        return outerCatMappingGetResponse;
    }

    public static class OuterCatMappingGetResponse {

        /**
         * 一级类目
         */
        @JsonProperty("cat_id1")
        private Long catId1;

        /**
         * 二级类目
         */
        @JsonProperty("cat_id2")
        private Long catId2;

        /**
         * 三级类目
         */
        @JsonProperty("cat_id3")
        private Long catId3;

        /**
         * 四级类目
         */
        @JsonProperty("cat_id4")
        private Long catId4;

        public Long getCatId1() {
            return catId1;
        }

        public Long getCatId2() {
            return catId2;
        }

        public Long getCatId3() {
            return catId3;
        }

        public Long getCatId4() {
            return catId4;
        }
    }
}