package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTraceSourceUploadPlanInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTraceSourceUploadPlanInfoRequest extends PopBaseHttpRequest<PddTraceSourceUploadPlanInfoResponse> {

    /**
     * 到港日期
     */
    @JsonProperty("arrive_time")
    private String arriveTime;

    /**
     * 提单号
     */
    @JsonProperty("bill_no")
    private String billNo;

    /**
     * 报检日期
     */
    @JsonProperty("ciq_date")
    private String ciqDate;

    /**
     * 报检单号
     */
    @JsonProperty("ciq_no")
    private String ciqNo;

    /**
     * 境内收发货人
     */
    @JsonProperty("dealer_org")
    private String dealerOrg;

    /**
     * 申报单位
     */
    @JsonProperty("declare_org")
    private String declareOrg;

    /**
     * 启运地
     */
    @JsonProperty("desp_port_name")
    private String despPortName;

    /**
     * 报关日期
     */
    @JsonProperty("entry_date")
    private String entryDate;

    /**
     * 报关单号
     */
    @JsonProperty("entry_no")
    private String entryNo;

    /**
     * 溯源码粘贴计划(商品维度)
     */
    @JsonProperty("goods")
    private List<GoodsItem> goods;

    /**
     * 清单申报日期
     */
    @JsonProperty("list_date")
    private String listDate;

    /**
     * 核注清单编号
     */
    @JsonProperty("list_no")
    private String listNo;

    /**
     * 装货港
     */
    @JsonProperty("load_port")
    private String loadPort;

    /**
     * 粘贴计划所属店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 粘贴计划所属店铺名
     */
    @JsonProperty("mall_name")
    private String mallName;

    /**
     * 粘贴计划单激活时间
     */
    @JsonProperty("plan_active_time")
    private String planActiveTime;

    /**
     * 粘贴计划单创建时间
     */
    @JsonProperty("plan_created_time")
    private String planCreatedTime;

    /**
     * 粘贴计划单编号
     */
    @JsonProperty("plan_no")
    private String planNo;

    /**
     * 进口口岸
     */
    @JsonProperty("port")
    private String port;

    /**
     * 运输方式
     */
    @JsonProperty("transport_mode")
    private String transportMode;

    /**
     * 粘贴计划单所属保税仓名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.trace.source.upload.plan.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTraceSourceUploadPlanInfoResponse> getResponseClass() {
        return PddTraceSourceUploadPlanInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "arrive_time", arriveTime);
        setUserParam(params, "bill_no", billNo);
        setUserParam(params, "ciq_date", ciqDate);
        setUserParam(params, "ciq_no", ciqNo);
        setUserParam(params, "dealer_org", dealerOrg);
        setUserParam(params, "declare_org", declareOrg);
        setUserParam(params, "desp_port_name", despPortName);
        setUserParam(params, "entry_date", entryDate);
        setUserParam(params, "entry_no", entryNo);
        setUserParam(params, "goods", goods);
        setUserParam(params, "list_date", listDate);
        setUserParam(params, "list_no", listNo);
        setUserParam(params, "load_port", loadPort);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "mall_name", mallName);
        setUserParam(params, "plan_active_time", planActiveTime);
        setUserParam(params, "plan_created_time", planCreatedTime);
        setUserParam(params, "plan_no", planNo);
        setUserParam(params, "port", port);
        setUserParam(params, "transport_mode", transportMode);
        setUserParam(params, "warehouse_name", warehouseName);
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public void setCiqDate(String ciqDate) {
        this.ciqDate = ciqDate;
    }

    public void setCiqNo(String ciqNo) {
        this.ciqNo = ciqNo;
    }

    public void setDealerOrg(String dealerOrg) {
        this.dealerOrg = dealerOrg;
    }

    public void setDeclareOrg(String declareOrg) {
        this.declareOrg = declareOrg;
    }

    public void setDespPortName(String despPortName) {
        this.despPortName = despPortName;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }

    public void setGoods(List<GoodsItem> goods) {
        this.goods = goods;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    public void setListNo(String listNo) {
        this.listNo = listNo;
    }

    public void setLoadPort(String loadPort) {
        this.loadPort = loadPort;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setPlanActiveTime(String planActiveTime) {
        this.planActiveTime = planActiveTime;
    }

    public void setPlanCreatedTime(String planCreatedTime) {
        this.planCreatedTime = planCreatedTime;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public static class GoodsItem {

        /**
         * 防伪溯源码粘贴数量
         */
        @JsonProperty("code_amount")
        private Long codeAmount;

        /**
         * 防伪溯源码结束顺序号
         */
        @JsonProperty("end_serial_no")
        private String endSerialNo;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品备案图片
         */
        @JsonProperty("goods_image_url")
        private String goodsImageUrl;

        /**
         * 商品备案名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 原产国(地)
         */
        @JsonProperty("goods_origin")
        private String goodsOrigin;

        /**
         * 商品备案规格型号
         */
        @JsonProperty("goods_property")
        private String goodsProperty;

        /**
         * 商品规格
         */
        @JsonProperty("goods_sku_no")
        private String goodsSkuNo;

        /**
         * Hs编码
         */
        @JsonProperty("hs_code")
        private String hsCode;

        /**
         * Hs名称
         */
        @JsonProperty("hs_name")
        private String hsName;

        /**
         * 防伪溯源码起始顺序号
         */
        @JsonProperty("start_serial_no")
        private String startSerialNo;

        public void setCodeAmount(Long codeAmount) {
            this.codeAmount = codeAmount;
        }

        public void setEndSerialNo(String endSerialNo) {
            this.endSerialNo = endSerialNo;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setGoodsImageUrl(String goodsImageUrl) {
            this.goodsImageUrl = goodsImageUrl;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public void setGoodsOrigin(String goodsOrigin) {
            this.goodsOrigin = goodsOrigin;
        }

        public void setGoodsProperty(String goodsProperty) {
            this.goodsProperty = goodsProperty;
        }

        public void setGoodsSkuNo(String goodsSkuNo) {
            this.goodsSkuNo = goodsSkuNo;
        }

        public void setHsCode(String hsCode) {
            this.hsCode = hsCode;
        }

        public void setHsName(String hsName) {
            this.hsName = hsName;
        }

        public void setStartSerialNo(String startSerialNo) {
            this.startSerialNo = startSerialNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}