package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherVirtualCardBatchAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddVoucherVirtualCardBatchAddRequest extends PopBaseHttpRequest<PddVoucherVirtualCardBatchAddResponse> {

    /**
     * 业务数据
     */
    @JsonProperty("data")
    private Data data;

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
        return "pdd.voucher.virtual.card.batch.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherVirtualCardBatchAddResponse> getResponseClass() {
        return PddVoucherVirtualCardBatchAddResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data", data);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        /**
         * 充值地址
         */
        @JsonProperty("chargeAddress")
        private String chargeAddress;

        /**
         * 卡密信息列表，一次请求最多5000条卡密
         */
        @JsonProperty("dataList")
        private List<DataDataListItem> dataList;

        /**
         * 商品Id
         */
        @JsonProperty("goodsId")
        private Long goodsId;

        /**
         * skuId
         */
        @JsonProperty("skuId")
        private Long skuId;

        public void setChargeAddress(String chargeAddress) {
            this.chargeAddress = chargeAddress;
        }

        public void setDataList(List<DataDataListItem> dataList) {
            this.dataList = dataList;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DataDataListItem {

        /**
         * 卡密卡号，商家卡密必填
         */
        @JsonProperty("cardNo")
        private String cardNo;

        /**
         * 用户核销卡密加密串，加密所使用public key向对接小二获取（加密算法"RSA"，填充方式"RSA/ECB/PKCS1Padding"）
         */
        @JsonProperty("encryptPassword")
        private String encryptPassword;

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public void setEncryptPassword(String encryptPassword) {
            this.encryptPassword = encryptPassword;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}