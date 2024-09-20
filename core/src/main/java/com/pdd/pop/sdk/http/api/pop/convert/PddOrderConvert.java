package com.pdd.pop.sdk.http.api.pop.convert;

import com.pdd.pop.sdk.http.api.pop.response.PddOrderInformationGetResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderListGetResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderNumberListIncrementGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PddOrderConvert {

    PddOrderConvert INSTANCE = Mappers.getMapper(PddOrderConvert.class);


    PddOrderListGetResponse.OrderListGetResponseOrderListItem convert(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfo info);

    PddOrderListGetResponse.OrderListGetResponseOrderListItem convert(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItem info);

    @Mapping(target = "orderList", source = "orderSnList")
    PddOrderListGetResponse.OrderListGetResponse convert(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponse value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemCardInfoListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoCardInfoListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemExtraDeliveryListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoExtraDeliveryListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemGiftDeliveryListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoGiftDeliveryListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemGiftListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoGiftListItem value);


    PddOrderListGetResponse.OrderListGetResponseOrderListItemItemListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoItemListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemOrderTagListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoOrderTagListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemPromotionDetailListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoPromotionDetailListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemResendDeliveryListItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoResendDeliveryListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemServiceFeeDetailItem map(
            PddOrderInformationGetResponse.OrderInfoGetResponseOrderInfoServiceFeeDetailItem value);


    PddOrderListGetResponse.OrderListGetResponseOrderListItemCardInfoListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemCardInfoListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemExtraDeliveryListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemExtraDeliveryListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemGiftDeliveryListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemGiftDeliveryListItem value);


    PddOrderListGetResponse.OrderListGetResponseOrderListItemGiftListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemGiftListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemItemListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemItemListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemOrderTagListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemOrderTagListItem value);


    PddOrderListGetResponse.OrderListGetResponseOrderListItemPromotionDetailListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemPromotionDetailListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemResendDeliveryListItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemResendDeliveryListItem value);

    PddOrderListGetResponse.OrderListGetResponseOrderListItemServiceFeeDetailItem map(
            PddOrderNumberListIncrementGetResponse.OrderSnIncrementGetResponseOrderSnListItemServiceFeeDetailItem value);


}
