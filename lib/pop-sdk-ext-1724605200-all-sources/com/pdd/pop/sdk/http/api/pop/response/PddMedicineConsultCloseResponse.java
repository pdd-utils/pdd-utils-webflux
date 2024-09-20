package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMedicineConsultCloseResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("medicine_consult_close_response")
    private MedicineConsultCloseResponse medicineConsultCloseResponse;

    public MedicineConsultCloseResponse getMedicineConsultCloseResponse() {
        return medicineConsultCloseResponse;
    }

    public static class MedicineConsultCloseResponse {

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}