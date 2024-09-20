package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddStockWareDetailQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    public static class OpenApiResponse {

        /**
         * 颜色
         */
        @JsonProperty("color")
        private String color;

        /**
         * 创建时间（毫秒）
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 毛重：kg，精确到两位小数
         */
        @JsonProperty("gross_weight")
        private Integer grossWeight;

        /**
         * 高：厘米，精确到一位小数
         */
        @JsonProperty("height")
        private Integer height;

        /**
         * 货品id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 长：厘米，精确到一位小数
         */
        @JsonProperty("length")
        private Integer length;

        /**
         * 净重：kg，精确到两位小数
         */
        @JsonProperty("net_weight")
        private Integer netWeight;

        /**
         * 备注
         */
        @JsonProperty("note")
        private String note;

        /**
         * 包材
         */
        @JsonProperty("packing")
        private String packing;

        /**
         * 单价：元，精确到一位小数
         */
        @JsonProperty("price")
        private Integer price;

        /**
         * 库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 高低值服务，0低，1高
         */
        @JsonProperty("service_quality")
        private Integer serviceQuality;

        /**
         * 皮重：kg，精确到两位小数
         */
        @JsonProperty("tare_weight")
        private Integer tareWeight;

        /**
         * 货品类型.0:单独货品  1:组合货品
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 更新时间毫秒）
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        /**
         * 体积：立方厘米，精确到一位小数
         */
        @JsonProperty("volume")
        private Integer volume;

        /**
         * 组合货品中子货品的关联关系
         */
        @JsonProperty("ware_infos")
        private List<OpenApiResponseWareInfosItem> wareInfos;

        /**
         * 货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 货品sku信息
         */
        @JsonProperty("ware_skus")
        private List<OpenApiResponseWareSkusItem> wareSkus;

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 重量：kg，精确到两位小数
         */
        @JsonProperty("weight")
        private Integer weight;

        /**
         * 宽：厘米，精确到一位小数
         */
        @JsonProperty("width")
        private Integer width;

        public String getColor() {
            return color;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public Integer getGrossWeight() {
            return grossWeight;
        }

        public Integer getHeight() {
            return height;
        }

        public Long getId() {
            return id;
        }

        public Integer getLength() {
            return length;
        }

        public Integer getNetWeight() {
            return netWeight;
        }

        public String getNote() {
            return note;
        }

        public String getPacking() {
            return packing;
        }

        public Integer getPrice() {
            return price;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Integer getServiceQuality() {
            return serviceQuality;
        }

        public Integer getTareWeight() {
            return tareWeight;
        }

        public Integer getType() {
            return type;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public Integer getVolume() {
            return volume;
        }

        public List<OpenApiResponseWareInfosItem> getWareInfos() {
            return wareInfos;
        }

        public String getWareName() {
            return wareName;
        }

        public List<OpenApiResponseWareSkusItem> getWareSkus() {
            return wareSkus;
        }

        public String getWareSn() {
            return wareSn;
        }

        public Integer getWeight() {
            return weight;
        }

        public Integer getWidth() {
            return width;
        }
    }

    public static class OpenApiResponseWareInfosItem {

        /**
         * 子货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 子货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 子货品数量
         */
        @JsonProperty("ware_quantity")
        private Long wareQuantity;

        /**
         * 子货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        public Long getWareId() {
            return wareId;
        }

        public String getWareName() {
            return wareName;
        }

        public Long getWareQuantity() {
            return wareQuantity;
        }

        public String getWareSn() {
            return wareSn;
        }
    }

    public static class OpenApiResponseWareSkusItem {

        /**
         * 是否已经绑定货品false/true
         */
        @JsonProperty("exist_ware")
        private Boolean existWare;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 上下架状态，true表示上架
         */
        @JsonProperty("is_onsale")
        private Boolean isOnsale;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 规格信息
         */
        @JsonProperty("specs")
        private List<OpenApiResponseWareSkusItemSpecsItem> specs;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        public Boolean getExistWare() {
            return existWare;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Boolean getIsOnsale() {
            return isOnsale;
        }

        public Long getSkuId() {
            return skuId;
        }

        public List<OpenApiResponseWareSkusItemSpecsItem> getSpecs() {
            return specs;
        }

        public Long getWareId() {
            return wareId;
        }
    }

    public static class OpenApiResponseWareSkusItemSpecsItem {

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格名称
         */
        @JsonProperty("spec_key")
        private String specKey;

        /**
         * 规格值
         */
        @JsonProperty("spec_value")
        private String specValue;

        public Long getSpecId() {
            return specId;
        }

        public String getSpecKey() {
            return specKey;
        }

        public String getSpecValue() {
            return specValue;
        }
    }
}