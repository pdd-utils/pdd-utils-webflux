package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddFulfillmentListGetResponse extends PopBaseHttpResponse {

    /**
     * 请求response
     */
    @JsonProperty("list_response")
    private ListResponse listResponse;

    public ListResponse getListResponse() {
        return listResponse;
    }

    public static class ListResponse {

        /**
         * 列表信息
         */
        @JsonProperty("fulfillment_list")
        private List<ListResponseFulfillmentListItem> fulfillmentList;

        /**
         * 是否存在下一页
         */
        @JsonProperty("has_next")
        private Boolean hasNext;

        /**
         * 总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<ListResponseFulfillmentListItem> getFulfillmentList() {
            return fulfillmentList;
        }

        public Boolean getHasNext() {
            return hasNext;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class ListResponseFulfillmentListItem {

        /**
         * 收件地城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 城市编码
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 成交时间。格式yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 上门揽件信息
         */
        @JsonProperty("door_to_door_collect_info")
        private ListResponseFulfillmentListItemDoorToDoorCollectInfo doorToDoorCollectInfo;

        /**
         * 跨境全托管发货单号
         */
        @JsonProperty("fulfillment_sn")
        private String fulfillmentSn;

        /**
         * 跨境全托管发货单状态。1-待发货，2-已发货待签收，3-已签收
         */
        @JsonProperty("fulfillment_status")
        private Integer fulfillmentStatus;

        /**
         * 托管发货单标签列表，courier_door_to_door_collect=快递上门揽收
         */
        @JsonProperty("fulfillment_tag_list")
        private List<ListResponseFulfillmentListItemFulfillmentTagListItem> fulfillmentTagList;

        /**
         * 商品数量
         */
        @JsonProperty("goods_count")
        private Integer goodsCount;

        /**
         * 商品编号
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品图片
         */
        @JsonProperty("goods_img")
        private String goodsImg;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品销售价格。单位：元
         */
        @JsonProperty("goods_price")
        private String goodsPrice;

        /**
         * 快递公司编号
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 商家外部商品编码
         */
        @JsonProperty("out_goods_sn")
        private String outGoodsSn;

        /**
         * 商家外部sku编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 承诺送达时间。格式yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("promise_delivery_time")
        private String promiseDeliveryTime;

        /**
         * 收件地省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 省份编码
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 收件人地址，不拼接省市区
         */
        @JsonProperty("receiver_address")
        private String receiverAddress;

        /**
         * 收件人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 收件人电话
         */
        @JsonProperty("receiver_phone")
        private String receiverPhone;

        /**
         * 发货时间。格式yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("shipping_time")
        private String shippingTime;

        /**
         * 商品规格编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 商品规格，使用（规格值1,规格值2）组合作为sku的表示，中间以英文逗号隔开
         */
        @JsonProperty("spec")
        private String spec;

        /**
         * 收件地区县
         */
        @JsonProperty("town")
        private String town;

        /**
         * 区县编码
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 更新时间。格式yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        /**
         * 承诺发货时间。格式yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("promise_shipping_time")
        private String promiseShippingTime;

        public String getCity() {
            return city;
        }

        public Integer getCityId() {
            return cityId;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public ListResponseFulfillmentListItemDoorToDoorCollectInfo getDoorToDoorCollectInfo() {
            return doorToDoorCollectInfo;
        }

        public String getFulfillmentSn() {
            return fulfillmentSn;
        }

        public Integer getFulfillmentStatus() {
            return fulfillmentStatus;
        }

        public List<ListResponseFulfillmentListItemFulfillmentTagListItem> getFulfillmentTagList() {
            return fulfillmentTagList;
        }

        public Integer getGoodsCount() {
            return goodsCount;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsPrice() {
            return goodsPrice;
        }

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getOutGoodsSn() {
            return outGoodsSn;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public String getPromiseDeliveryTime() {
            return promiseDeliveryTime;
        }

        public String getProvince() {
            return province;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getReceiverAddress() {
            return receiverAddress;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public String getReceiverPhone() {
            return receiverPhone;
        }

        public String getShippingTime() {
            return shippingTime;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getSpec() {
            return spec;
        }

        public String getTown() {
            return town;
        }

        public Integer getTownId() {
            return townId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getPromiseShippingTime() {
            return promiseShippingTime;
        }
    }

    public static class ListResponseFulfillmentListItemDoorToDoorCollectInfo {

        /**
         * 取号面单的快递公司编号
         */
        @JsonProperty("waybill_logistics_id")
        private Long waybillLogisticsId;

        /**
         * 取号面单号
         */
        @JsonProperty("waybill_sn")
        private String waybillSn;

        public Long getWaybillLogisticsId() {
            return waybillLogisticsId;
        }

        public String getWaybillSn() {
            return waybillSn;
        }
    }

    public static class ListResponseFulfillmentListItemFulfillmentTagListItem {

        /**
         * 标签名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 是否有标签：0=无标签，1=有标签
         */
        @JsonProperty("value")
        private Integer value;

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }
}