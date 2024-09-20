package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCustomsSendGoodsRecordResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCustomsSendGoodsRecordRequest extends PopBaseHttpRequest<PddCustomsSendGoodsRecordResponse> {

    /**
     * 上传备案商品请求
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.customs.send.goods.record";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCustomsSendGoodsRecordResponse> getResponseClass() {
        return PddCustomsSendGoodsRecordResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 备案商品列表
         */
        @JsonProperty("goods_list")
        private List<RequestGoodsListItem> goodsList;

        public void setGoodsList(List<RequestGoodsListItem> goodsList) {
            this.goodsList = goodsList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestGoodsListItem {

        /**
         * 条形码
         */
        @JsonProperty("bar_code")
        private String barCode;

        /**
         * 保税仓名称
         */
        @JsonProperty("bonded_warehouse_name")
        private String bondedWarehouseName;

        /**
         * 品牌中文名称
         */
        @JsonProperty("brand_chinese_name")
        private String brandChineseName;

        /**
         * 品牌英文名称
         */
        @JsonProperty("brand_english_name")
        private String brandEnglishName;

        /**
         * 品类
         */
        @JsonProperty("category")
        private String category;

        /**
         * 消费税率，单位%
         */
        @JsonProperty("consumption_tax_rate")
        private Double consumptionTaxRate;

        /**
         * 成本价（RMB）
         */
        @JsonProperty("cost_price")
        private Double costPrice;

        /**
         * 海关关区代码
         */
        @JsonProperty("customs_code")
        private String customsCode;

        /**
         * 备案电商企业的海关注册登记名称(备案的电商企业名称)
         */
        @JsonProperty("ebc_name")
        private String ebcName;

        /**
         * 账册编号
         */
        @JsonProperty("ems_no")
        private String emsNo;

        /**
         * 保质期
         */
        @JsonProperty("expiration_date")
        private String expirationDate;

        /**
         * 毛重（KG）
         */
        @JsonProperty("gross_weight")
        private Double grossWeight;

        /**
         * 海关HS code
         */
        @JsonProperty("hs_code")
        private String hsCode;

        /**
         * 备案商品图片链接
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 电商企业的商品编号(skuId非pdd skuId)
         */
        @JsonProperty("item_no")
        private String itemNo;

        /**
         * 物料号
         */
        @JsonProperty("item_record_no")
        private String itemRecordNo;

        /**
         * 生产企业名称
         */
        @JsonProperty("manufacturing_company_name")
        private String manufacturingCompanyName;

        /**
         * 生产企业注册号
         */
        @JsonProperty("manufacturing_company_registration_no")
        private String manufacturingCompanyRegistrationNo;

        /**
         * 生产厂家地址（奶制品必填）
         */
        @JsonProperty("manufacturing_factory_address")
        private String manufacturingFactoryAddress;

        /**
         * 净重（KG）
         */
        @JsonProperty("net_weight")
        private Double netWeight;

        /**
         * 海关口岸代码
         */
        @JsonProperty("port_code")
        private String portCode;

        /**
         * 生产国代码
         */
        @JsonProperty("producing_country")
        private String producingCountry;

        /**
         * 产品国检备案编号
         */
        @JsonProperty("product_record_no")
        private String productRecordNo;

        /**
         * 法定第一数量
         */
        @JsonProperty("qty1")
        private Double qty1;

        /**
         * 法定第二数量
         */
        @JsonProperty("qty2")
        private Double qty2;

        /**
         * 备案商品中文名称
         */
        @JsonProperty("record_chinese_name")
        private String recordChineseName;

        /**
         * 备案商品英文名称
         */
        @JsonProperty("record_english_name")
        private String recordEnglishName;

        /**
         * 商品规格型号(报文gmodel)
         */
        @JsonProperty("record_model")
        private String recordModel;

        /**
         * 型号
         */
        @JsonProperty("specification")
        private String specification;

        /**
         * 库存数量
         */
        @JsonProperty("stock")
        private Long stock;

        /**
         * 库存时间
         */
        @JsonProperty("stock_time")
        private String stockTime;

        /**
         * 关税税率,单位%
         */
        @JsonProperty("tariff_rate")
        private Double tariffRate;

        /**
         * 申报单位代码
         */
        @JsonProperty("unit")
        private String unit;

        /**
         * 法定第一单位代码
         */
        @JsonProperty("unit1")
        private String unit1;

        /**
         * 法定第二单位代码
         */
        @JsonProperty("unit2")
        private String unit2;

        /**
         * 单价（RMB）
         */
        @JsonProperty("unit_price")
        private Double unitPrice;

        /**
         * 增值税率，单位%
         */
        @JsonProperty("value_added_tax_rate")
        private Double valueAddedTaxRate;

        /**
         * 供应商名称
         */
        @JsonProperty("vendor_name")
        private String vendorName;

        /**
         * 备案仓储企业代码
         */
        @JsonProperty("wc_code")
        private String wcCode;

        /**
         * 备案仓储企业的海关注册登记名称
         */
        @JsonProperty("wc_name")
        private String wcName;

        /**
         * 网络链接
         */
        @JsonProperty("website")
        private String website;

        /**
         * 包装方式
         */
        @JsonProperty("wrap_type")
        private String wrapType;

        public void setBarCode(String barCode) {
            this.barCode = barCode;
        }

        public void setBondedWarehouseName(String bondedWarehouseName) {
            this.bondedWarehouseName = bondedWarehouseName;
        }

        public void setBrandChineseName(String brandChineseName) {
            this.brandChineseName = brandChineseName;
        }

        public void setBrandEnglishName(String brandEnglishName) {
            this.brandEnglishName = brandEnglishName;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setConsumptionTaxRate(Double consumptionTaxRate) {
            this.consumptionTaxRate = consumptionTaxRate;
        }

        public void setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
        }

        public void setCustomsCode(String customsCode) {
            this.customsCode = customsCode;
        }

        public void setEbcName(String ebcName) {
            this.ebcName = ebcName;
        }

        public void setEmsNo(String emsNo) {
            this.emsNo = emsNo;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public void setGrossWeight(Double grossWeight) {
            this.grossWeight = grossWeight;
        }

        public void setHsCode(String hsCode) {
            this.hsCode = hsCode;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setItemNo(String itemNo) {
            this.itemNo = itemNo;
        }

        public void setItemRecordNo(String itemRecordNo) {
            this.itemRecordNo = itemRecordNo;
        }

        public void setManufacturingCompanyName(String manufacturingCompanyName) {
            this.manufacturingCompanyName = manufacturingCompanyName;
        }

        public void setManufacturingCompanyRegistrationNo(String manufacturingCompanyRegistrationNo) {
            this.manufacturingCompanyRegistrationNo = manufacturingCompanyRegistrationNo;
        }

        public void setManufacturingFactoryAddress(String manufacturingFactoryAddress) {
            this.manufacturingFactoryAddress = manufacturingFactoryAddress;
        }

        public void setNetWeight(Double netWeight) {
            this.netWeight = netWeight;
        }

        public void setPortCode(String portCode) {
            this.portCode = portCode;
        }

        public void setProducingCountry(String producingCountry) {
            this.producingCountry = producingCountry;
        }

        public void setProductRecordNo(String productRecordNo) {
            this.productRecordNo = productRecordNo;
        }

        public void setQty1(Double qty1) {
            this.qty1 = qty1;
        }

        public void setQty2(Double qty2) {
            this.qty2 = qty2;
        }

        public void setRecordChineseName(String recordChineseName) {
            this.recordChineseName = recordChineseName;
        }

        public void setRecordEnglishName(String recordEnglishName) {
            this.recordEnglishName = recordEnglishName;
        }

        public void setRecordModel(String recordModel) {
            this.recordModel = recordModel;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public void setStock(Long stock) {
            this.stock = stock;
        }

        public void setStockTime(String stockTime) {
            this.stockTime = stockTime;
        }

        public void setTariffRate(Double tariffRate) {
            this.tariffRate = tariffRate;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public void setUnit1(String unit1) {
            this.unit1 = unit1;
        }

        public void setUnit2(String unit2) {
            this.unit2 = unit2;
        }

        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public void setValueAddedTaxRate(Double valueAddedTaxRate) {
            this.valueAddedTaxRate = valueAddedTaxRate;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public void setWcCode(String wcCode) {
            this.wcCode = wcCode;
        }

        public void setWcName(String wcName) {
            this.wcName = wcName;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public void setWrapType(String wrapType) {
            this.wrapType = wrapType;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}