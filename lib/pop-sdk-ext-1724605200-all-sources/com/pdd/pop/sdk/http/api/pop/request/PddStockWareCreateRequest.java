package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockWareCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddStockWareCreateRequest extends PopBaseHttpRequest<PddStockWareCreateResponse> {

    /**
     * 类型 0:单独货品。1:组合货品
     */
    @JsonProperty("ware_type")
    private Integer wareType;

    /**
     * 组合货品中子货品的关联关系, ware_type为1时必填；
     */
    @JsonProperty("ware_infos")
    private List<WareInfosItem> wareInfos;

    /**
     * 货品编码
     */
    @JsonProperty("ware_sn")
    private String wareSn;

    /**
     * 货品名称
     */
    @JsonProperty("ware_name")
    private String wareName;

    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 高低值服务
     */
    @JsonProperty("service_quality")
    private Integer serviceQuality;

    /**
     * 体积：立方毫米，只精确到100（即：最末两位为0）
     */
    @JsonProperty("volume")
    private Integer volume;

    /**
     * 长：毫米，精确到1
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽：毫米，精确到1
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高：毫米，精确到1
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 重量：g，精确到10（即：末位为0）
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 毛重：g，精确到10（即：末位为0）
     */
    @JsonProperty("gross_weight")
    private Integer grossWeight;

    /**
     * 净重：g，精确到10（即：末位为0）
     */
    @JsonProperty("net_weight")
    private Integer netWeight;

    /**
     * 皮重：g，精确到10（即：末位为0）
     */
    @JsonProperty("tare_weight")
    private Integer tareWeight;

    /**
     * 单价：分，精确到10（即：末位为0）
     */
    @JsonProperty("price")
    private Integer price;

    /**
     * 颜色
     */
    @JsonProperty("color")
    private String color;

    /**
     * 包材
     */
    @JsonProperty("packing")
    private String packing;

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
        return "pdd.stock.ware.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareCreateResponse> getResponseClass() {
        return PddStockWareCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ware_type", wareType);
        setUserParam(params, "ware_infos", wareInfos);
        setUserParam(params, "ware_sn", wareSn);
        setUserParam(params, "ware_name", wareName);
        setUserParam(params, "note", note);
        setUserParam(params, "service_quality", serviceQuality);
        setUserParam(params, "volume", volume);
        setUserParam(params, "length", length);
        setUserParam(params, "width", width);
        setUserParam(params, "height", height);
        setUserParam(params, "weight", weight);
        setUserParam(params, "gross_weight", grossWeight);
        setUserParam(params, "net_weight", netWeight);
        setUserParam(params, "tare_weight", tareWeight);
        setUserParam(params, "price", price);
        setUserParam(params, "color", color);
        setUserParam(params, "packing", packing);
    }

    public void setWareType(Integer wareType) {
        this.wareType = wareType;
    }

    public void setWareInfos(List<WareInfosItem> wareInfos) {
        this.wareInfos = wareInfos;
    }

    public void setWareSn(String wareSn) {
        this.wareSn = wareSn;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setServiceQuality(Integer serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public void setTareWeight(Integer tareWeight) {
        this.tareWeight = tareWeight;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public static class WareInfosItem {

        /**
         * 
         */
        @JsonProperty("ware_quantity")
        private Integer wareQuantity;

        /**
         * 
         */
        @JsonProperty("ware_id")
        private Long wareId;

        public void setWareQuantity(Integer wareQuantity) {
            this.wareQuantity = wareQuantity;
        }

        public void setWareId(Long wareId) {
            this.wareId = wareId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}