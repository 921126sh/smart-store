package com.example.localtest.smartstoreapi.seller.controller;

import com.example.localtest.smartstoreapi.common.ApiResponseEntity;
import com.example.localtest.smartstoreapi.common.Utils;
import com.example.localtest.smartstoreapi.seller.dao.SellerDAO;
import com.example.localtest.smartstoreapi.seller.service.SellerCoreServiceImpl;
import com.example.localtest.smartstoreapi.seller.type.*;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeFactory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;


@Slf4j
@RestController
public class SellerController {
    @Autowired
    private SellerCoreServiceImpl sellerCoreService;

    @Autowired
    private Utils utils;

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }


    /**
     * 성공 로그 리스트 API
     * @return
     * @throws Exception
     */
    @GetMapping("/StoreLogsLists")
    public ResponseEntity<ApiResponseEntity> getStoreLogsLists() throws Exception {
        List<SellerDAO> sellerDAOList = sellerCoreService.getStoreLog();

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(sellerDAOList), HttpStatus.OK);
    }


    /**
     * 중복 제거 에러 로그 리스팅 API
     * @return
     * @throws Exception
     */
    @GetMapping("/StoreLogsErrorLists")
    public ResponseEntity<ApiResponseEntity> getStoreLogsErrorLists() throws Exception {
        List<SellerDAO> sellerDAOList = sellerCoreService.getStoreErrorLog();

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(sellerDAOList), HttpStatus.OK);
    }


    /**
     * 발주 처리 확인
     * @param ProductOrderID
     * @return
     * @throws Exception
     */
    @GetMapping("/PlaceProductOrder")
    public ResponseEntity<ApiResponseEntity> placeProductOrder(@RequestParam("ProductOrderID") String ProductOrderID,
                                                               @RequestParam(value = "CheckReceiverAddressChanged", defaultValue = "true", required = false) Boolean CheckReceiverAddressChanged,
                                                               HttpServletRequest httpServletRequest) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("CheckReceiverAddressChanged", CheckReceiverAddressChanged);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.발주_확인처리(ProductOrderID, CheckReceiverAddressChanged, targetSeq); // Default Value Add
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }

    /**
     * 발송 지연 처리
     * @param ProductOrderID
     * @param DispatchDueDate
     * @param DispatchDelayReasonCode
     * @return
     * @throws Exception
     */
    @GetMapping("/DelayProductOrder")
    public ResponseEntity<ApiResponseEntity> delayProductOrder(@RequestParam("ProductOrderID") String ProductOrderID,
                                                               @RequestParam("DispatchDueDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate DispatchDueDate,
                                                               @RequestParam(value = "DispatchDelayReasonCode", defaultValue = "CUSTOMER_REQUEST") String DispatchDelayReasonCode,
                                                               @RequestParam(value = "DispatchDelayDetailReason", required = false) String DispatchDelayDetailReason,
                                                               HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("DispatchDueDate", DispatchDueDate.toString());
        jsonObject.put("DispatchDelayReasonCode", DispatchDelayReasonCode);
        jsonObject.put("DispatchDelayDetailReason", DispatchDelayDetailReason);

        // ErrorCode Start
        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());

        // ErrorCode Middle
        sellerCoreService.발송지연_처리(ProductOrderID, DispatchDueDate, DispatchDelayReasonCode, DispatchDelayDetailReason, targetSeq);

        // ErrorCode End
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }

    /**
     * 발송 처리
     * @param ProductOrderID
     * @param DeliveryMethodCode
     * @param DispatchDate
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ShipProductOrder")
    public ResponseEntity<ApiResponseEntity> shipProductOrder(@RequestParam("ProductOrderID") String ProductOrderID,
                                                              @RequestParam(value = "DeliveryMethodCode", defaultValue = "RETURN_DELIVERY") String DeliveryMethodCode,
                                                              @RequestParam("DispatchDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate DispatchDate,
                                                              @RequestParam(value = "DeliveryCompanyCode", required = false) String DeliveryCompanyCode,
                                                              @RequestParam(value = "TrackingNumber", required = false) String TrackingNumber,
                                                              @RequestParam(value = "BarcodeNoList", required = false) String BarcodeNoList,
                                                              @RequestParam(value = "ECouponNo", required = false) String ECouponNo,
                                                              HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("DeliveryMethodCode", DeliveryMethodCode);
        jsonObject.put("DispatchDate", DispatchDate.toString());

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.발송_처리(ProductOrderID, DeliveryMethodCode, DispatchDate, DeliveryCompanyCode, TrackingNumber, BarcodeNoList, ECouponNo, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }

    /**
     * 판매 취소 처리
     * @param ProductOrderID
     * @param CancelReasonCode
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/CancelSale")
    public ResponseEntity<ApiResponseEntity> cancelSale(@RequestParam("ProductOrderID") String ProductOrderID,
                                                        @RequestParam(value = "CancelReasonCode", defaultValue = "DROPPED_DELIVERY") String CancelReasonCode,
                                                        HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("CancelReasonCode", CancelReasonCode);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.판매_취소(ProductOrderID, CancelReasonCode, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 취소 요청 승인 처리
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ApproveCancelApplication")
    public ResponseEntity<ApiResponseEntity> approveCancelApplication(@RequestParam("ProductOrderID") String ProductOrderID,
                                                        HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.취소_승인(ProductOrderID, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 반품 접수 처리
     * @param ProductOrderID
     * @param ReturnReasonCode
     * @param CollectDeliveryMethodCode
     * @param CollectTrackingNumber
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/RequestReturn")
    public ResponseEntity<ApiResponseEntity> requestReturn(@RequestParam("ProductOrderID") String ProductOrderID,
                                                           @RequestParam(value = "ReturnReasonCode", defaultValue = "DROPPED_DELIVERY") String ReturnReasonCode,
                                                           @RequestParam(value = "CollectDeliveryMethodCode", defaultValue = "RETURN_DELIVERY") String CollectDeliveryMethodCode,
                                                           @RequestParam(value = "CollectDeliveryCompanyCode", required = false) String CollectDeliveryCompanyCode,
                                                           @RequestParam(value = "CollectTrackingNumber", required = false) String CollectTrackingNumber,
                                                           HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("ReturnReasonCode", ReturnReasonCode);
        jsonObject.put("CollectDeliveryMethodCode", CollectDeliveryMethodCode);
        jsonObject.put("CollectDeliveryCompanyCode", CollectDeliveryCompanyCode);
        jsonObject.put("CollectTrackingNumber", CollectTrackingNumber);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.반품_접수(ProductOrderID, ReturnReasonCode, CollectDeliveryMethodCode, CollectDeliveryCompanyCode, CollectTrackingNumber, targetSeq); // Default Value Add
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }

    /**
     * 반품 요청 승인 처리
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ApproveReturnApplication")
    public ResponseEntity<ApiResponseEntity> approveReturnApplication(@RequestParam("ProductOrderID") String ProductOrderID,
                                                                      HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.반품_승인(ProductOrderID, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 반품 거부 처리
     * @param ProductOrderID
     * @param RejectDetailContent
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/RejectReturn")
    public ResponseEntity<ApiResponseEntity> rejectReturn(@RequestParam("ProductOrderID") String ProductOrderID,
                                                          @RequestParam("RejectDetailContent") String RejectDetailContent,
                                                          HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("RejectDetailContent", RejectDetailContent);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.반품_거부(ProductOrderID, RejectDetailContent, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 반품 보류 처리
     * @param ProductOrderID
     * @param ReturnHoldCode
     * @param ReturnHoldDetailContent
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/WithholdReturn")
    public ResponseEntity<ApiResponseEntity> withholdReturn(@RequestParam("ProductOrderID") String ProductOrderID,
                                                            @RequestParam(value = "ReturnHoldCode", defaultValue = "ETC") String ReturnHoldCode,
                                                            @RequestParam("ReturnHoldDetailContent") String ReturnHoldDetailContent,
                                                            @RequestParam(value = "EtcFeeDemandAmount", required = false) int EtcFeeDemandAmount,
                                                            HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);
        jsonObject.put("ReturnHoldCode",ReturnHoldCode);
        jsonObject.put("ReturnHoldDetailContent", ReturnHoldDetailContent);
        jsonObject.put("EtcFeeDemandAmount", EtcFeeDemandAmount);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.반품_보류(ProductOrderID, ReturnHoldCode, ReturnHoldDetailContent, EtcFeeDemandAmount, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 반품 보류 해제 처리
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ReleaseReturnHold")
    public ResponseEntity<ApiResponseEntity> releaseReturnHold(@RequestParam("ProductOrderID") String ProductOrderID,
                                                            HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.반품보류_해제(ProductOrderID, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 교환 수거 완료 처리
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ApproveCollectedExchange")
    public ResponseEntity<ApiResponseEntity> approveCollectedExchange(@RequestParam("ProductOrderID") String ProductOrderID,
                                                                      HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.교환_수거완료(ProductOrderID, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 교환 상품 재발송
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ReDeliveryExchange")
    public ResponseEntity<ApiResponseEntity> reDeliveryExchange(@RequestParam("ProductOrderID") String ProductOrderID,
                                                                @RequestParam("ReDeliveryCompanyCode") String ReDeliveryCompanyCode,
                                                                @RequestParam(value = "ReDeliveryMethodCode", defaultValue = "RETURN_DELIVERY") String ReDeliveryMethodCode,
                                                                @RequestParam(value = "ReDeliveryTrackingNumber", required = false) String ReDeliveryTrackingNumber,
                                                                HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);
        jsonObject.put("ReDeliveryCompanyCode", ReDeliveryCompanyCode);
        jsonObject.put("ReDeliveryMethodCode", ReDeliveryMethodCode);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.교환재배송_처리(ProductOrderID, ReDeliveryMethodCode, ReDeliveryCompanyCode, ReDeliveryTrackingNumber, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 교환 거부 처리
     * @param ProductOrderID
     * @param RejectDetailContent
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/RejectExchange")
    public ResponseEntity<ApiResponseEntity> rejectExchange(@RequestParam("ProductOrderID") String ProductOrderID,
                                                            @RequestParam("RejectDetailContent") String RejectDetailContent,
                                                            HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);
        jsonObject.put("RejectDetailContent", RejectDetailContent);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.교환_거부(ProductOrderID, RejectDetailContent, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 교환 보류 처리
     * @param ProductOrderID
     * @param ExchangeHoldCode
     * @param ExchangeHoldDetailContent
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/WithholdExchange")
    public ResponseEntity<ApiResponseEntity> withholdExchange(@RequestParam("ProductOrderID") String ProductOrderID,
                                                            @RequestParam(value = "ExchangeHoldCode", defaultValue = "ETC") String ExchangeHoldCode,
                                                            @RequestParam("ExchangeHoldDetailContent") String ExchangeHoldDetailContent,
                                                              @RequestParam(value = "EtcFeeDemandAmount", required = false) int EtcFeeDemandAmount,
                                                            HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);
        jsonObject.put("ExchangeHoldCode", ExchangeHoldCode);
        jsonObject.put("ExchangeHoldDetailContent", ExchangeHoldDetailContent);
        jsonObject.put("EtcFeeDemandAmount", EtcFeeDemandAmount);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.교환_보류(ProductOrderID, ExchangeHoldCode, ExchangeHoldDetailContent, EtcFeeDemandAmount, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }


    /**
     * 보류 해제 처리
     * @param ProductOrderID
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @GetMapping("/ReleaseExchangeHold")
    public ResponseEntity<ApiResponseEntity> releaseExchangeHold(@RequestParam("ProductOrderID") String ProductOrderID,
                                                              HttpServletRequest httpServletRequest) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderId", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject, httpServletRequest.getRequestURI());
        sellerCoreService.교환보류_해제(ProductOrderID, targetSeq);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }
}
