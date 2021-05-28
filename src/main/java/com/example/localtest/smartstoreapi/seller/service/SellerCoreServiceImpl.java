package com.example.localtest.smartstoreapi.seller.service;

import com.example.localtest.smartstoreapi.common.Utils;
import com.example.localtest.smartstoreapi.seller.dao.SellerDAO;
import com.example.localtest.smartstoreapi.seller.mapper.SellerMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.localtest.smartstoreapi.seller.type.*;

import javax.xml.datatype.DatatypeFactory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


@Slf4j
@Service("SellerCoreService")
public class SellerCoreServiceImpl implements SellerCoreService {
    @Autowired
    SellerMapper sellerMapper;

    @Override
    public List<SellerDAO> getStoreLog() {
        return sellerMapper.getStoreLog();
    }

    @Override
    public List<SellerDAO> getStoreErrorLog() {
        return sellerMapper.getStoreErrorLog();
    }




    // 상품주문내역 상세조회
    public long 전_상품주문내역_상세조회(String ProductOrderID, JSONObject jsonObject, String endPoint) throws Exception {
        //PRODUCT ID(TEST): 2001238236, 2001238220, 2001238211, 2001238206, 2001238205, 2001238197, 2001238196, 2001238195, 2001238194, 2001238174, 2001192790, 2001192789, 2001192785, 2001192784, 2001192783, 2001192210, 2001192189, 2001183501, 2001183500, 2001183499, 2001183498, 2001183496
        GetProductOrderInfoListRequest getProductOrderInfoListRequest = new GetProductOrderInfoListRequest();

        ArrayList<String> productOrderIdList = new ArrayList<String>() {{
//            add("2021052528962071");
            add(ProductOrderID);
        }};

        productOrderIdList.forEach(str -> getProductOrderInfoListRequest.getProductOrderIDList().add(str));
        Utils.setBaseSellerRequestType(getProductOrderInfoListRequest);
        getProductOrderInfoListRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "GetProductOrderInfoList"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        GetProductOrderInfoListResponse response = port.getProductOrderInfoList(getProductOrderInfoListRequest);

        ProductOrder po = null;
        SellerDAO sellerDAO = new SellerDAO();
        if (!response.getProductOrderInfoList().isEmpty()) {
            po = response.getProductOrderInfoList().get(0).getProductOrder();

            if (!Objects.isNull(po.getClaimStatus()))
                sellerDAO.setBeforeClaimStatus(Optional.ofNullable(po.getClaimStatus().value()).orElse(null));

            if (!Objects.isNull(po.getClaimType()))
                sellerDAO.setBeforeClaimType(Optional.ofNullable(po.getClaimType().value()).orElse(null));

            if (!Objects.isNull(po.getProductOrderStatus()))
                sellerDAO.setBeforeProductOrderStatus(Optional.ofNullable(po.getProductOrderStatus().value()).orElse(null));

            if (!Objects.isNull(po.getProductOrderID()))
                sellerDAO.setProductOrderId(Optional.ofNullable(po.getProductOrderID()).orElse(null));

            if (!Objects.isNull(po.getMallID()))
                sellerDAO.setMallId(Optional.ofNullable(po.getMallID()).orElse(null));

            if (!Objects.isNull(po.getProductID()))
                sellerDAO.setProductId(Optional.ofNullable(po.getProductID()).orElse(null));

            if (!Objects.isNull(po.getProductName()))
                sellerDAO.setProductName(Optional.ofNullable(po.getProductName()).orElse(null));

            if (!Objects.isNull(po.getProductOption()))
                sellerDAO.setProductOption(Optional.ofNullable(po.getProductOption()).orElse(null));

        }

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품상태 : [" + response.getProductOrderInfoList().get(0).getProductOrder().getProductOrderStatus() + "]");
            log.info("TIMESTAMP : [" + response.getTimestamp() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));
        }
        ErrorType errorType = response.getError();

        sellerDAO.setParameterJson(Optional.ofNullable(jsonObject.toJSONString()).orElse(null));
        sellerDAO.setEndPoint(endPoint == null ? "" : endPoint);
        sellerDAO.setRegDate(new Date());

        sellerDAO.setErrorCode(errorType == null ? null : errorType.getCode());
        sellerDAO.setErrorMessage(errorType == null ? null : errorType.getMessage());
        sellerDAO.setErrorDetail(errorType == null ? null : errorType.getDetail());

        sellerMapper.afterInsertStoreLog(sellerDAO);

        return sellerDAO.getSeq();
    }

    // 상품주문내역 상세조회
    public GetProductOrderInfoListResponse 후_상품주문내역_상세조회(String ProductOrderID, long targetSeq) throws Exception {
        //PRODUCT ID(TEST): 2001238236, 2001238220, 2001238211, 2001238206, 2001238205, 2001238197, 2001238196, 2001238195, 2001238194, 2001238174, 2001192790, 2001192789, 2001192785, 2001192784, 2001192783, 2001192210, 2001192189, 2001183501, 2001183500, 2001183499, 2001183498, 2001183496
        GetProductOrderInfoListRequest getProductOrderInfoListRequest = new GetProductOrderInfoListRequest();

        ArrayList<String> productOrderIdList = new ArrayList<String>() {{
//            add("2021052528962071");
            add(ProductOrderID);
        }};

        productOrderIdList.forEach(str -> getProductOrderInfoListRequest.getProductOrderIDList().add(str));
        Utils.setBaseSellerRequestType(getProductOrderInfoListRequest);
        getProductOrderInfoListRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "GetProductOrderInfoList"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        GetProductOrderInfoListResponse response = port.getProductOrderInfoList(getProductOrderInfoListRequest);

        ProductOrder po = null;
        SellerDAO sellerDAO = new SellerDAO();
        if (!response.getProductOrderInfoList().isEmpty()) {
            po = response.getProductOrderInfoList().get(0).getProductOrder();

            if (!Objects.isNull(po.getClaimStatus()))
                sellerDAO.setAfterClaimStatus(po.getClaimStatus().value());
            if (!Objects.isNull(po.getClaimType()))
                sellerDAO.setAfterClaimType(po.getClaimType().value());
            if (!Objects.isNull(po.getProductOrderStatus()))
                sellerDAO.setAfterProductOrderStatus(po.getProductOrderStatus().value());

        }

        sellerDAO.setSeq(targetSeq);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
//            log.info("상품상태 : [" + response.getProductOrderInfoList().get(0).getProductOrder().getProductOrderStatus() + "]");
            log.info("TIMESTAMP : [" + response.getTimestamp() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            // EndErrorCode의 경우 Else문 처리
            sellerDAO.setEndErrorCode(response.getError().getCode());
            sellerMapper.endErrorCodeBySeq(sellerDAO);
        }

        sellerMapper.updateStoreLogBySeq(sellerDAO);

        return response;
    }


    // 변경상품 주문조회
    public void 변경상품_주문조회() throws Exception {
        GetChangedProductOrderListRequest getChangedProductOrderListRequest = new GetChangedProductOrderListRequest();

        // INFO: 상태별 상품주문 번호 참고: https://www.notion.so/cc36a4ac01c140a4b450e77bd12fcd80
//        getChangedProductOrderListRequest.setLastChangedStatusCode(ProductOrderChangeType.PURCHASE_DECIDED);

        GregorianCalendar fromDate = new GregorianCalendar();
        fromDate.set(2010, Calendar.MAY, 05, 20, 01, 01);

//        GregorianCalendar toDate = new GregorianCalendar();
//        toDate.set(2012, Calendar.JANUARY, 02, 01, 01, 01);

        System.out.printf("START DATE -----> [%s]%n", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fromDate.getTime()));
//        System.out.printf("END DATE -----> [%s]%n", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(toDate.getTime()));

        getChangedProductOrderListRequest.setInquiryTimeFrom(DatatypeFactory.newInstance().newXMLGregorianCalendar(fromDate));
//        getChangedProductOrderListRequest.setInquiryTimeTo(DatatypeFactory.newInstance().newXMLGregorianCalendar(toDate));


        Utils.setBaseSellerRequestType(getChangedProductOrderListRequest);
        getChangedProductOrderListRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "GetChangedProductOrderList"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        GetChangedProductOrderListResponse response = port.getChangedProductOrderList(getChangedProductOrderListRequest);

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
            log.info(String.valueOf(response.getChangedProductOrderInfoList().stream().count()));
//            response.getChangedProductOrderInfoList().stream().filter(distinctByKey(ChangedProductOrderInfo::getProductOrderID)).forEach(p -> System.out.println(p.getProductOrderID()));
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.getProductList()).isNotNull();
//        assertThat(response.getError()).isNull();
    }


    public void 발주_확인처리(String ProductOrderID, Boolean CheckReceiverAddressChanged, long targetSeq) throws Exception {
        PlaceProductOrderRequest placeProductOrderRequest = new PlaceProductOrderRequest();
        placeProductOrderRequest.setProductOrderID(ProductOrderID);
//        placeProductOrderRequest.setCheckReceiverAddressChanged(true);
        placeProductOrderRequest.setCheckReceiverAddressChanged(CheckReceiverAddressChanged);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            // Error Action 내용의 경우 Else 문에 처리
            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }
    }

    // 취소 승인
    public void 취소_승인(String ProductOrderID, long targetSeq) throws Exception {
        ApproveCancelApplicationRequest approveCancelApplicationRequest = new ApproveCancelApplicationRequest();
//        approveCancelApplicationRequest.setProductOrderID("PONO400000000002");
        approveCancelApplicationRequest.setProductOrderID(ProductOrderID);


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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 판매 취소
    public void 판매_취소(String ProductOrderID, String CancelReasonCode, long targetSeq) throws Exception {
        CancelSaleRequest cancelSaleRequest = new CancelSaleRequest();
//        cancelSaleRequest.setProductOrderID("PONO500000000001");
//        cancelSaleRequest.setCancelReasonCode(ClaimRequestReasonType.DROPPED_DELIVERY);
        cancelSaleRequest.setProductOrderID(ProductOrderID);
        cancelSaleRequest.setCancelReasonCode(ClaimRequestReasonType.fromValue(CancelReasonCode));

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);

        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 발송 지연 처리
    public void 발송지연_처리(String ProductOrderID, LocalDate DispatchDueDate, String DispatchDelayReasonCode, String DispatchDelayDetailReason, long targetSeq) throws Exception {
        DelayProductOrderRequest delayProductOrderRequest = new DelayProductOrderRequest();
        delayProductOrderRequest.setProductOrderID(ProductOrderID);

        DelayedDispatchReasonType dateSet = DelayedDispatchReasonType.fromValue(DispatchDelayReasonCode);
        delayProductOrderRequest.setDispatchDelayReasonCode(dateSet);
        delayProductOrderRequest.setDispatchDelayDetailReason(DispatchDelayDetailReason);

        GregorianCalendar fromDate = new GregorianCalendar();
        fromDate.set(DispatchDueDate.getYear(), DispatchDueDate.getMonthValue() - 1, DispatchDueDate.getDayOfMonth());

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }
    }

    // 발송 처리
    public void  발송_처리(String ProductOrderID, String DeliveryMethodCode, LocalDate DispatchDate,
                       String DeliveryCompanyCode, String TrackingNumber, String BarcodeNoList, String ECouponNo,
                       long targetSeq) throws Exception {
        ShipProductOrderRequest shipProductOrderRequest = new ShipProductOrderRequest();
//        shipProductOrderRequest.setProductOrderID("2021052480881841");
//        shipProductOrderRequest.setDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);
        shipProductOrderRequest.setProductOrderID(ProductOrderID);
        shipProductOrderRequest.setDeliveryMethodCode(DeliveryMethodType.fromValue(DeliveryMethodCode));

        // Optional Area
        shipProductOrderRequest.setDeliveryCompanyCode(DeliveryCompanyCode);
        shipProductOrderRequest.setTrackingNumber(TrackingNumber);
        if (!BarcodeNoList.isEmpty()) {
            String[] Barcode = BarcodeNoList.split(",");
            for (String item : Barcode) {
                shipProductOrderRequest.getBarcodeNoList().add(item);
            }
        }
        shipProductOrderRequest.setECouponNo(ECouponNo);

        GregorianCalendar fromDate = new GregorianCalendar();
//        fromDate.set(2021, Calendar.JULY, 01);
        fromDate.set(DispatchDate.getYear(), DispatchDate.getMonthValue() - 1, DispatchDate.getDayOfMonth());

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 반품 접수
    public void 반품_접수(String ProductOrderID, String ReturnReasonCode, String CollectDeliveryMethodCode,
                      String CollectDeliveryCompanyCode, String CollectTrackingNumber, long targetSeq) throws Exception {
        RequestReturnRequest requestReturnRequest = new RequestReturnRequest();
//        requestReturnRequest.setProductOrderID("PONO100000000004");
//        requestReturnRequest.setReturnReasonCode(ClaimRequestReasonType.DROPPED_DELIVERY);
//        requestReturnRequest.setCollectDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);
        requestReturnRequest.setProductOrderID(ProductOrderID);
        requestReturnRequest.setReturnReasonCode(ClaimRequestReasonType.fromValue(ReturnReasonCode));
        requestReturnRequest.setCollectDeliveryMethodCode(DeliveryMethodType.fromValue(CollectDeliveryMethodCode));

        requestReturnRequest.setCollectDeliveryCompanyCode(CollectDeliveryCompanyCode);
        requestReturnRequest.setCollectTrackingNumber(CollectTrackingNumber);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 반품 승인
    public void 반품_승인(String ProductOrderID, long targetSeq) throws Exception {
        ApproveReturnApplicationRequest approveReturnApplicationRequest = new ApproveReturnApplicationRequest();
        approveReturnApplicationRequest.setProductOrderID(ProductOrderID);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 반품 거부
    public void 반품_거부(String ProductOrderID, String RejectDetailContent, long targetSeq) throws Exception {
        RejectReturnRequest rejectReturnRequest = new RejectReturnRequest();
        rejectReturnRequest.setProductOrderID(ProductOrderID);
        rejectReturnRequest.setRejectDetailContent(RejectDetailContent); // 거부 사유

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 반품 보류
    public void 반품_보류(String ProductOrderID, String ReturnHoldCode, String ReturnHoldDetailContent, int EtcFeeDemandAmount, long targetSeq) throws Exception {
        WithholdReturnRequest withholdReturnRequest = new WithholdReturnRequest();
//        withholdReturnRequest.setProductOrderID("PONO100000000004");
//        withholdReturnRequest.setReturnHoldCode(HoldbackClassType.ETC);
//        withholdReturnRequest.setReturnHoldDetailContent("테스트사유");
        withholdReturnRequest.setProductOrderID(ProductOrderID);
        withholdReturnRequest.setReturnHoldCode(HoldbackClassType.fromValue(ReturnHoldCode));
        withholdReturnRequest.setReturnHoldDetailContent(ReturnHoldDetailContent);

        // Optional Area
        withholdReturnRequest.setEtcFeeDemandAmount(EtcFeeDemandAmount);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);

        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 반품 보류 해제
    public void 반품보류_해제(String ProductOrderID, long targetSeq) throws Exception {
        ReleaseReturnHoldRequest releaseReturnHoldRequest = new ReleaseReturnHoldRequest();
        releaseReturnHoldRequest.setProductOrderID(ProductOrderID);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 교환 수거완료
    public void 교환_수거완료(String ProductOrderID, long targetSeq) throws Exception {
        ApproveCollectedExchangeRequest approveCollectedExchangeRequest = new ApproveCollectedExchangeRequest();
        approveCollectedExchangeRequest.setProductOrderID(ProductOrderID);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 교환 재배송 처리
    public void 교환재배송_처리(String ProductOrderID, String ReDeliveryMethodCode, String ReDeliveryCompanyCode, String ReDeliveryTrackingNumber, long targetSeq) throws Exception {
        ReDeliveryExchangeRequest reDeliveryExchangeRequest = new ReDeliveryExchangeRequest();
//        reDeliveryExchangeRequest.setProductOrderID("PONO100000000004");
//        reDeliveryExchangeRequest.setReDeliveryMethodCode(DeliveryMethodType.RETURN_DELIVERY);
//        reDeliveryExchangeRequest.setReDeliveryCompanyCode("CJGLS");
        reDeliveryExchangeRequest.setProductOrderID(ProductOrderID);
        reDeliveryExchangeRequest.setReDeliveryMethodCode(DeliveryMethodType.fromValue(ReDeliveryMethodCode));
        reDeliveryExchangeRequest.setReDeliveryCompanyCode(ReDeliveryCompanyCode);

        // Optional Area
        reDeliveryExchangeRequest.setReDeliveryTrackingNumber(ReDeliveryTrackingNumber);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 교환 거부
    public void 교환_거부(String ProductOrderID, String RejectDetailContent, long targetSeq) throws Exception {
        RejectExchangeRequest rejectExchangeRequest = new RejectExchangeRequest();
        rejectExchangeRequest.setProductOrderID(ProductOrderID);
        rejectExchangeRequest.setRejectDetailContent(RejectDetailContent);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);

        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 교환 보류
    public void 교환_보류(String ProductOrderID, String ExchangeHoldCode, String ExchangeHoldDetailContent, int EtcFeeDemandAmount, long targetSeq) throws Exception {
        WithholdExchangeRequest withholdExchangeRequest = new WithholdExchangeRequest();
        withholdExchangeRequest.setProductOrderID(ProductOrderID);
        withholdExchangeRequest.setExchangeHoldCode(HoldbackClassType.fromValue(ExchangeHoldCode));
        withholdExchangeRequest.setExchangeHoldDetailContent(ExchangeHoldDetailContent);
        withholdExchangeRequest.setEtcFeeDemandAmount(EtcFeeDemandAmount);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }

    // 교환 보류 해제
    public void 교환보류_해제(String ProductOrderID, long targetSeq) throws Exception {
        ReleaseExchangeHoldRequest releaseExchangeHoldRequest = new ReleaseExchangeHoldRequest();
        releaseExchangeHoldRequest.setProductOrderID(ProductOrderID);

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
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));

            SellerDAO sellerDAO = new SellerDAO();
            sellerDAO.setActionErrorCode(response.getError().getCode());
            sellerDAO.setSeq(targetSeq);

            sellerMapper.actionErrorCodeBySeq(sellerDAO);
        }

//        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.isIsReceiverAddressChanged()).isNotNull();
//        assertThat(response.getError()).isNull();
    }
}
