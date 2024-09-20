package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsOutPropertyMappingGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("out_property_mapping_get_response")
    private OutPropertyMappingGetResponse outPropertyMappingGetResponse;

    public OutPropertyMappingGetResponse getOutPropertyMappingGetResponse() {
        return outPropertyMappingGetResponse;
    }

    public static class OutPropertyMappingGetResponse {

        /**
         * 
         */
        @JsonProperty("property")
        private List<OutPropertyMappingGetResponsePropertyItem> property;

        public List<OutPropertyMappingGetResponsePropertyItem> getProperty() {
            return property;
        }
    }

    public static class OutPropertyMappingGetResponsePropertyItem {

        /**
         * 
         */
        @JsonProperty("out_property_name")
        private String outPropertyName;

        /**
         * 
         */
        @JsonProperty("out_property_value_name")
        private String outPropertyValueName;

        /**
         * 
         */
        @JsonProperty("property_value_id")
        private Long propertyValueId;

        /**
         * 
         */
        @JsonProperty("property_value_name")
        private String propertyValueName;

        /**
         * 
         */
        @JsonProperty("ref_property_id")
        private Long refPropertyId;

        /**
         * 
         */
        @JsonProperty("ref_property_name")
        private String refPropertyName;

        public String getOutPropertyName() {
            return outPropertyName;
        }

        public String getOutPropertyValueName() {
            return outPropertyValueName;
        }

        public Long getPropertyValueId() {
            return propertyValueId;
        }

        public String getPropertyValueName() {
            return propertyValueName;
        }

        public Long getRefPropertyId() {
            return refPropertyId;
        }

        public String getRefPropertyName() {
            return refPropertyName;
        }
    }
}