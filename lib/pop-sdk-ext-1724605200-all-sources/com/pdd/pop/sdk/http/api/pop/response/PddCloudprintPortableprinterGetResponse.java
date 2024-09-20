package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudprintPortableprinterGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("pdd_cloudprint_portableprinter_get_response")
    private InnerPddCloudprintPortableprinterGetResponse pddCloudprintPortableprinterGetResponse;

    public InnerPddCloudprintPortableprinterGetResponse getPddCloudprintPortableprinterGetResponse() {
        return pddCloudprintPortableprinterGetResponse;
    }

    public static class InnerPddCloudprintPortableprinterGetResponse {

        /**
         * 
         */
        @JsonProperty("portableprinter_list")
        private List<InnerPddCloudprintPortableprinterGetResponsePortableprinterListItem> portableprinterList;

        public List<InnerPddCloudprintPortableprinterGetResponsePortableprinterListItem> getPortableprinterList() {
            return portableprinterList;
        }
    }

    public static class InnerPddCloudprintPortableprinterGetResponsePortableprinterListItem {

        /**
         * 蓝牙打印机品牌
         */
        @JsonProperty("brand")
        private String brand;

        /**
         * 蓝牙打印机型号
         */
        @JsonProperty("portableprinter_name")
        private String portableprinterName;

        /**
         * 蓝牙打印机协议，如CPCL, TSPL
         */
        @JsonProperty("protocol_name")
        private String protocolName;

        /**
         * 描述备注
         */
        @JsonProperty("remark")
        private String remark;

        public String getBrand() {
            return brand;
        }

        public String getPortableprinterName() {
            return portableprinterName;
        }

        public String getProtocolName() {
            return protocolName;
        }

        public String getRemark() {
            return remark;
        }
    }
}