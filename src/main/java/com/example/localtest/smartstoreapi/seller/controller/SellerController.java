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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/StoreLogsLists")
    public ResponseEntity<ApiResponseEntity> getStoreLogsLists() throws Exception {
        List<SellerDAO> sellerDAOList = sellerCoreService.getStoreLog();

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(sellerDAOList), HttpStatus.OK);
    }

    /**
     * 발주 처리 확인
     * @param ProductOrderID
     * @return
     * @throws Exception
     */
    @GetMapping("/PlaceProductOrder")
    public ResponseEntity<ApiResponseEntity> placeProductOrder(@RequestParam("ProductOrderID") String ProductOrderID) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject);
//        sellerCoreService.발주_확인처리(ProductOrderID);
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
                                                               @RequestParam(value = "DispatchDelayReasonCode", defaultValue = "CUSTOMER_REQUEST") String DispatchDelayReasonCode) throws Exception {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ProductOrderID", ProductOrderID);
        jsonObject.put("DispatchDueDate", DispatchDueDate);
        jsonObject.put("DispatchDelayReasonCode", DispatchDelayReasonCode);

        long targetSeq = sellerCoreService.전_상품주문내역_상세조회(ProductOrderID, jsonObject);
//        sellerCoreService.발송지연_처리(ProductOrderID, DispatchDueDate, DispatchDelayReasonCode);
        GetProductOrderInfoListResponse response = sellerCoreService.후_상품주문내역_상세조회(ProductOrderID, targetSeq);

        return new ResponseEntity<ApiResponseEntity>(utils.successResponse(response), HttpStatus.OK);
    }

}
