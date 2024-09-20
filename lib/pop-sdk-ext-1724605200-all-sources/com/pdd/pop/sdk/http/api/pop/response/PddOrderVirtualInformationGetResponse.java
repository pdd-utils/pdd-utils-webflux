package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderVirtualInformationGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("order_virtual_information_response")
    private OrderVirtualInformationResponse orderVirtualInformationResponse;

    public OrderVirtualInformationResponse getOrderVirtualInformationResponse() {
        return orderVirtualInformationResponse;
    }

    public static class OrderVirtualInformationResponse {

        /**
         * 联系人手机号
         */
        @JsonProperty("contact_phone")
        private String contactPhone;

        /**
         * 身份证名
         */
        @JsonProperty("id_card_name")
        private String idCardName;

        /**
         * 身份证号
         */
        @JsonProperty("id_card_num")
        private String idCardNum;

        /**
         * 选号卡号
         */
        @JsonProperty("phone_number_chosen_by_user")
        private String phoneNumberChosenByUser;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public String getContactPhone() {
            return contactPhone;
        }

        public String getIdCardName() {
            return idCardName;
        }

        public String getIdCardNum() {
            return idCardNum;
        }

        public String getPhoneNumberChosenByUser() {
            return phoneNumberChosenByUser;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}