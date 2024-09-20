package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMedicineConsultReceiveResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("medicine_consult_receive_response")
    private MedicineConsultReceiveResponse medicineConsultReceiveResponse;

    public MedicineConsultReceiveResponse getMedicineConsultReceiveResponse() {
        return medicineConsultReceiveResponse;
    }

    public static class MedicineConsultReceiveResponse {

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