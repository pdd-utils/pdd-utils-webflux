package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseGoodsSupplierBrandInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseGoodsSupplierBrandInfoRequest extends PopBaseHttpRequest<PddKttPurchaseGoodsSupplierBrandInfoResponse> {

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
        return "pdd.ktt.purchase.goods.supplier.brand.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseGoodsSupplierBrandInfoResponse> getResponseClass() {
        return PddKttPurchaseGoodsSupplierBrandInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}