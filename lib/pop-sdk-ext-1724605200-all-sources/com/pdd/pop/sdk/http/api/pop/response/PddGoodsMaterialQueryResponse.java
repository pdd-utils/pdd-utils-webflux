package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsMaterialQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("material_list")
    private List<MaterialListItem> materialList;

    public List<MaterialListItem> getMaterialList() {
        return materialList;
    }

    public static class MaterialListItem {

        /**
         * 申诉审核信息
         */
        @JsonProperty("appeal_check_comment")
        private String appealCheckComment;

        /**
         * 审核信息
         */
        @JsonProperty("check_comment")
        private String checkComment;

        /**
         * 审核状态（1：待审核；2：通过；3：驳回；101：申诉待审核；102：申诉通过；103：申诉驳回）
         */
        @JsonProperty("check_status")
        private Integer checkStatus;

        /**
         * 素材内容
         */
        @JsonProperty("content")
        private String content;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 素材id
         */
        @JsonProperty("material_id")
        private Long materialId;

        /**
         * 线上素材
         */
        @JsonProperty("online_material")
        private String onlineMaterial;

        /**
         * 素材类型（1：白底图；3：长图）
         */
        @JsonProperty("type")
        private Integer type;

        public String getAppealCheckComment() {
            return appealCheckComment;
        }

        public String getCheckComment() {
            return checkComment;
        }

        public Integer getCheckStatus() {
            return checkStatus;
        }

        public String getContent() {
            return content;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Long getMaterialId() {
            return materialId;
        }

        public String getOnlineMaterial() {
            return onlineMaterial;
        }

        public Integer getType() {
            return type;
        }
    }
}