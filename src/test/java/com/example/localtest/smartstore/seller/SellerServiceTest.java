package com.example.localtest.smartstore.seller;

import com.example.localtest.smartstore.common.Utils;
import com.example.localtest.smartstore.seller.type.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SellerServiceTest {
        // 발주 처리
    @Test
    public void 단위_테스트_네이버스마트스토어_발주_처리() throws Exception {
        PlaceProductOrderRequest placeProductOrderRequest = new PlaceProductOrderRequest();
        placeProductOrderRequest.setProductOrderID("PONO200000000100");
        placeProductOrderRequest.setCheckReceiverAddressChanged(true);

        Utils.setBaseSellerRequestType(placeProductOrderRequest);
        placeProductOrderRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "PlaceProductOrder"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        PlaceProductOrderResponse response = port.placeProductOrder(placeProductOrderRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
            log.info("상품번호 : [" + response.isIsReceiverAddressChanged() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 취소 승인
    @Test
    public void 단위_테스트_네이버스마트스토어_취소_승인() throws Exception {
        ApproveCancelApplicationRequest approveCancelApplicationRequest = new ApproveCancelApplicationRequest();
        approveCancelApplicationRequest.setProductOrderID("PONO400000000002");


        Utils.setBaseSellerRequestType(approveCancelApplicationRequest);
        approveCancelApplicationRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ApproveCancelApplication"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ApproveCancelApplicationResponse response = port.approveCancelApplication(approveCancelApplicationRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 판매 취소
    @Test
    public void 단위_테스트_네이버스마트스토어_판매_취소() throws Exception {
        CancelSaleRequest cancelSaleRequest = new CancelSaleRequest();
        cancelSaleRequest.setProductOrderID("PONO500000000001");
        cancelSaleRequest.setCancelReasonCode(ClaimRequestReasonType.DROPPED_DELIVERY);

        Utils.setBaseSellerRequestType(cancelSaleRequest);
        cancelSaleRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "CancelSale"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        CancelSaleResponse response = port.cancelSale(cancelSaleRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 발송 지연 처리
    @Test
    public void 단위_테스트_네이버스마트스토어_발송지연_처리() throws Exception {
        DelayProductOrderRequest delayProductOrderRequest = new DelayProductOrderRequest();
        delayProductOrderRequest.setProductOrderID("PONO100000000004");
        delayProductOrderRequest.setDispatchDelayReasonCode(DelayedDispatchReasonType.CUSTOMER_REQUEST);

        GregorianCalendar fromDate = new GregorianCalendar();
        fromDate.set(2021, Calendar.JULY, 01);

        delayProductOrderRequest.setDispatchDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fromDate));

        Utils.setBaseSellerRequestType(delayProductOrderRequest);
        delayProductOrderRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "DelayProductOrder"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        DelayProductOrderResponse response = port.delayProductOrder(delayProductOrderRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 발송 처리
    @Test
    public void 단위_테스트_네이버스마트스토어_발송_처리() throws Exception {
        ShipProductOrderRequest shipProductOrderRequest = new ShipProductOrderRequest();
        shipProductOrderRequest.setProductOrderID("PONO100000000004");
        shipProductOrderRequest.setDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);

        GregorianCalendar fromDate = new GregorianCalendar();
        fromDate.set(2021, Calendar.JULY, 01);

        shipProductOrderRequest.setDispatchDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fromDate));

        Utils.setBaseSellerRequestType(shipProductOrderRequest);
        shipProductOrderRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ShipProductOrder"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ShipProductOrderResponse response = port.shipProductOrder(shipProductOrderRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 반품 접수
    @Test
    public void 단위_테스트_네이버스마트스토어_반품_접수() throws Exception {
        RequestReturnRequest requestReturnRequest = new RequestReturnRequest();
        requestReturnRequest.setProductOrderID("PONO100000000004");
        requestReturnRequest.setReturnReasonCode(ClaimRequestReasonType.DROPPED_DELIVERY);
        requestReturnRequest.setCollectDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);

        Utils.setBaseSellerRequestType(requestReturnRequest);
        requestReturnRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "RequestReturn"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        RequestReturnResponse response = port.requestReturn(requestReturnRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 반품 승인
    @Test
    public void 단위_테스트_네이버스마트스토어_반품_승인() throws Exception {
        ApproveReturnApplicationRequest approveReturnApplicationRequest = new ApproveReturnApplicationRequest();
        approveReturnApplicationRequest.setProductOrderID("PONO500000000001");

        Utils.setBaseSellerRequestType(approveReturnApplicationRequest);
        approveReturnApplicationRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ApproveReturnApplication"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ApproveReturnApplicationResponse response = port.approveReturnApplication(approveReturnApplicationRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 반품 거부
    @Test
    public void 단위_테스트_네이버스마트스토어_반품_거부() throws Exception {
        RejectReturnRequest rejectReturnRequest = new RejectReturnRequest();
        rejectReturnRequest.setProductOrderID("PONO500000000002");

        Utils.setBaseSellerRequestType(rejectReturnRequest);
        rejectReturnRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "RejectReturn"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        RejectReturnResponse response = port.rejectReturn(rejectReturnRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 반품 보류
    @Test
    public void 단위_테스트_네이버스마트스토어_반품_보류() throws Exception {
        WithholdReturnRequest withholdReturnRequest = new WithholdReturnRequest();
        withholdReturnRequest.setProductOrderID("PONO100000000004");
        withholdReturnRequest.setReturnHoldCode(HoldbackClassType.ETC);
        withholdReturnRequest.setReturnHoldDetailContent("테스트사유");

        Utils.setBaseSellerRequestType(withholdReturnRequest);
        withholdReturnRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "WithholdReturn"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        WithholdReturnResponse response = port.withholdReturn(withholdReturnRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 반품 보류 해제
    @Test
    public void 단위_테스트_네이버스마트스토어_반품보류_해제() throws Exception {
        ReleaseReturnHoldRequest releaseReturnHoldRequest = new ReleaseReturnHoldRequest();
        releaseReturnHoldRequest.setProductOrderID("PONO100000000004");

        Utils.setBaseSellerRequestType(releaseReturnHoldRequest);
        releaseReturnHoldRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ReleaseReturnHold"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ReleaseReturnHoldResponse response = port.releaseReturnHold(releaseReturnHoldRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 교환 수거완료
    @Test
    public void 단위_테스트_네이버스마트스토어_교환_수거완료() throws Exception {
        ApproveCollectedExchangeRequest approveCollectedExchangeRequest = new ApproveCollectedExchangeRequest();
        approveCollectedExchangeRequest.setProductOrderID("PONO100000000004");

        Utils.setBaseSellerRequestType(approveCollectedExchangeRequest);
        approveCollectedExchangeRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ApproveCollectedExchange"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ApproveCollectedExchangeResponse response = port.approveCollectedExchange(approveCollectedExchangeRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 교환 재배송 처리
    @Test
    public void 단위_테스트_네이버스마트스토어_교환재배송_처리() throws Exception {
        ReDeliveryExchangeRequest reDeliveryExchangeRequest = new ReDeliveryExchangeRequest();
        reDeliveryExchangeRequest.setProductOrderID("PONO100000000004");
        reDeliveryExchangeRequest.setReDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);
        reDeliveryExchangeRequest.setReDeliveryCompanyCode("CJGLS");

        Utils.setBaseSellerRequestType(reDeliveryExchangeRequest);
        reDeliveryExchangeRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ReDeliveryExchange"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ReDeliveryExchangeResponse response = port.reDeliveryExchange(reDeliveryExchangeRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 교환 거부
    @Test
    public void 단위_테스트_네이버스마트스토어_교환_거부() throws Exception {
        RejectExchangeRequest rejectExchangeRequest = new RejectExchangeRequest();
        rejectExchangeRequest.setProductOrderID("PONO100000000004");

        Utils.setBaseSellerRequestType(rejectExchangeRequest);
        rejectExchangeRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "RejectExchange"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        RejectExchangeResponse response = port.rejectExchange(rejectExchangeRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 교환 보류
    @Test
    public void 단위_테스트_네이버스마트스토어_교환_보류() throws Exception {
        WithholdExchangeRequest withholdExchangeRequest = new WithholdExchangeRequest();
        withholdExchangeRequest.setProductOrderID("PONO100000000004");
        withholdExchangeRequest.setExchangeHoldCode(HoldbackClassType.ETC);
        withholdExchangeRequest.setExchangeHoldDetailContent("테스트사유");

        Utils.setBaseSellerRequestType(withholdExchangeRequest);
        withholdExchangeRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "RejectExchange"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        WithholdExchangeResponse response = port.withholdExchange(withholdExchangeRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }

    // 교환 보류 해제
    @Test
    public void 단위_테스트_네이버스마트스토어_교환보류_해제() throws Exception {
        ReleaseExchangeHoldRequest releaseExchangeHoldRequest = new ReleaseExchangeHoldRequest();
        releaseExchangeHoldRequest.setProductOrderID("PONO100000000004");

        Utils.setBaseSellerRequestType(releaseExchangeHoldRequest);
        releaseExchangeHoldRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "ReleaseExchangeHold"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        ReleaseExchangeHoldResponse response = port.releaseExchangeHold(releaseExchangeHoldRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품번호 : [" + response.() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
        assertThat(response.getError()).isNull();
    }
}
