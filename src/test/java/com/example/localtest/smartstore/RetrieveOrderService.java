package com.example.localtest.smartstore;

import com.example.localtest.smartstore.common.Utils;
import com.example.localtest.smartstore.seller.type.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class RetrieveOrderService {
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    // 상품주문 내역 상세 조회
    @Test
    public void 상품주문내역_상세조회() throws Exception {
        //PRODUCT ID(TEST): 2001238236, 2001238220, 2001238211, 2001238206, 2001238205, 2001238197, 2001238196, 2001238195, 2001238194, 2001238174, 2001192790, 2001192789, 2001192785, 2001192784, 2001192783, 2001192210, 2001192189, 2001183501, 2001183500, 2001183499, 2001183498, 2001183496
        GetProductOrderInfoListRequest getProductOrderInfoListRequest = new GetProductOrderInfoListRequest();

        ArrayList<String> productOrderIdList = new ArrayList<String>() {{
            add("2021052412198141");
        }};

        productOrderIdList.forEach(str -> getProductOrderInfoListRequest.getProductOrderIDList().add(str));
        Utils.setBaseSellerRequestType(getProductOrderInfoListRequest);
        getProductOrderInfoListRequest.setAccessCredentials(Utils.createAccessCredentialsFromSeller("SellerService41", "GetProductOrderInfoList"));

        SellerService sellerService = new SellerService();
        SellerServicePortType port = sellerService.getSellerServiceSOAP12Port();
        GetProductOrderInfoListResponse response = port.getProductOrderInfoList(getProductOrderInfoListRequest);

        log.info("response.toString() : " + response.toString());
        log.info("response.getWarningList() : " + response.getWarningList());

        // Response에서 상품번호 확인
        if ("SUCCESS".equals(response.getResponseType())) {
            log.info("상품상태 : [" + response.getProductOrderInfoList().get(0).getProductOrder().getProductOrderStatus() + "]");
            log.info("TIMESTAMP : [" + response.getTimestamp() + "]");
        } else {
            log.info("에러 메시지 : [" + response.getError().getMessage() + "]");
            log.info("에러 코드 : [" + response.getError().getCode() + "]");
            log.info("에러 상세정보 : [" + response.getError().getDetail() + "]");
            System.out.format(String.format("1. %s(%s)", response.getError().getCode(), response.getError().getMessage()));
        }

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
        assertThat(response.getProductOrderInfoList()).isNotNull();
        assertThat(response.getError()).isNull();
    }


    //     변경 상품주문 조회
    @Test
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

        assertThat(response.getResponseType()).isEqualTo("SUCCESS");
//        assertThat(response.getProductList()).isNotNull();
        assertThat(response.getError()).isNull();
    }

}
