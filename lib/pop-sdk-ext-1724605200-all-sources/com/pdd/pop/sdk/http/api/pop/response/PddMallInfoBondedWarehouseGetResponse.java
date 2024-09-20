package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallInfoBondedWarehouseGetResponse extends PopBaseHttpResponse {

    /**
     * reponse
     */
    @JsonProperty("mall_info_bonded_warehouse_get_response")
    private MallInfoBondedWarehouseGetResponse mallInfoBondedWarehouseGetResponse;

    public MallInfoBondedWarehouseGetResponse getMallInfoBondedWarehouseGetResponse() {
        return mallInfoBondedWarehouseGetResponse;
    }

    public static class MallInfoBondedWarehouseGetResponse {

        /**
         * list
         */
        @JsonProperty("info_list")
        private List<MallInfoBondedWarehouseGetResponseInfoListItem> infoList;

        public List<MallInfoBondedWarehouseGetResponseInfoListItem> getInfoList() {
            return infoList;
        }
    }

    public static class MallInfoBondedWarehouseGetResponseInfoListItem {

        /**
         * 保税仓标识
         */
        @JsonProperty("bonded_warehouse_key")
        private String bondedWarehouseKey;

        /**
         * 保税仓名字
         */
        @JsonProperty("bonded_warehouse_name")
        private String bondedWarehouseName;

        /**
         * 清关服务商
         */
        @JsonProperty("customs_clearance_service_provider_list")
        private List<String> customsClearanceServiceProviderList;

        /**
         * 报关海关
         */
        @JsonProperty("customs_declaration_location")
        private String customsDeclarationLocation;

        public String getBondedWarehouseKey() {
            return bondedWarehouseKey;
        }

        public String getBondedWarehouseName() {
            return bondedWarehouseName;
        }

        public List<String> getCustomsClearanceServiceProviderList() {
            return customsClearanceServiceProviderList;
        }

        public String getCustomsDeclarationLocation() {
            return customsDeclarationLocation;
        }
    }
}