package com.example.localtest.smartstore.common;

import com.example.localtest.smartstore.product.type.AccessCredentialsType;
import com.example.localtest.smartstore.product.type.BaseProductRequestType;
import com.example.localtest.smartstore.seller.type.BaseCheckoutRequestType;
import com.nhncorp.psinfra.toolkit.SimpleCryptLib;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.stereotype.Component;

import java.security.Security;
import java.security.SignatureException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Slf4j
@Component
public class Utils {
    private final static String ACCESS_LICENSE = "0100010000bd64b60dc613e3f1148343a04179ea51dae2b19f0e318d3a4ea0d348cb08fb1f";
    private final static String SECRET_KEY = "AQABAACNhlc0Aw2o0rjMOsbLRWONGvwtF222firem3BkkgVXfQ==";
    private static String requestId = "twcadviceid_" + Timestamp.valueOf(LocalDateTime.now()).getTime();

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    protected static AccessCredentialsType createAccessCredentialsFromProduct(String serviceName, String operationName) throws SignatureException {
        //TODO 시스템 시간을 한국시간으로 맞춰줘야 함. DEV, PRD Application 서버의 시간이 한국시간으로 맞춰졌는지 확인할 것.
        //String timestamp = SimpleCryptLib.getTimestamp();
        String timestamp = SimpleCryptLib.getTimestamp();
        //String timestamp2 = String.valueOf(LocalDateTime.now()) + "Z" + timestamp.substring(24);
        String signature = SimpleCryptLib.generateSign(timestamp + serviceName + operationName, SECRET_KEY);

        log.info("timestamp : " + timestamp);
        //log.info("timestamp2 : " + timestamp2);
        log.info("signature : " + signature);
        log.info("ACCESS_LICENSE : " + ACCESS_LICENSE);
        log.info("SECRET_KEY : " + SECRET_KEY);
        AccessCredentialsType accessCredentials = new AccessCredentialsType();
        accessCredentials.setAccessLicense(ACCESS_LICENSE);
        accessCredentials.setTimestamp(timestamp);
        //accessCredentials.setTimestamp(timestamp2);
        accessCredentials.setSignature(signature);
        return accessCredentials;
    }

    public static com.example.localtest.smartstore.seller.type.AccessCredentialsType createAccessCredentialsFromSeller(String serviceName, String operationName) throws SignatureException {
        //TODO 시스템 시간을 한국시간으로 맞춰줘야 함. DEV, PRD Application 서버의 시간이 한국시간으로 맞춰졌는지 확인할 것.
        //String timestamp = SimpleCryptLib.getTimestamp();
        String timestamp = SimpleCryptLib.getTimestamp();
        //String timestamp2 = String.valueOf(LocalDateTime.now()) + "Z" + timestamp.substring(24);
        String signature = SimpleCryptLib.generateSign(timestamp + serviceName + operationName, SECRET_KEY);

        log.info("timestamp : " + timestamp);
        //log.info("timestamp2 : " + timestamp2);
        log.info("signature : " + signature);
        log.info("ACCESS_LICENSE : " + ACCESS_LICENSE);
        log.info("SECRET_KEY : " + SECRET_KEY);
        com.example.localtest.smartstore.seller.type.AccessCredentialsType accessCredentials = new com.example.localtest.smartstore.seller.type.AccessCredentialsType();
        accessCredentials.setAccessLicense(ACCESS_LICENSE);
        accessCredentials.setTimestamp(timestamp);
        //accessCredentials.setTimestamp(timestamp2);
        accessCredentials.setSignature(signature);
        return accessCredentials;
    }

    protected static com.example.localtest.smartstore.customer.type.AccessCredentialsType createAccessCredentialsFromCustomer(String serviceName, String operationName) throws SignatureException {
        //TODO 시스템 시간을 한국시간으로 맞춰줘야 함. DEV, PRD Application 서버의 시간이 한국시간으로 맞춰졌는지 확인할 것.
        //String timestamp = SimpleCryptLib.getTimestamp();
        String timestamp = SimpleCryptLib.getTimestamp();
        //String timestamp2 = String.valueOf(LocalDateTime.now()) + "Z" + timestamp.substring(24);
        String signature = SimpleCryptLib.generateSign(timestamp + serviceName + operationName, SECRET_KEY);

        log.info("timestamp : " + timestamp);
        //log.info("timestamp2 : " + timestamp2);
        log.info("signature : " + signature);
        log.info("ACCESS_LICENSE : " + ACCESS_LICENSE);
        log.info("SECRET_KEY : " + SECRET_KEY);
        com.example.localtest.smartstore.customer.type.AccessCredentialsType accessCredentials = new com.example.localtest.smartstore.customer.type.AccessCredentialsType();
        accessCredentials.setAccessLicense(ACCESS_LICENSE);
        accessCredentials.setTimestamp(timestamp);
        //accessCredentials.setTimestamp(timestamp2);
        accessCredentials.setSignature(signature);
        return accessCredentials;
    }

    // 상품
    public static <T extends BaseProductRequestType> void setBaseProductRequestType(T wsdlType) {
        wsdlType.setRequestID(requestId);
        wsdlType.setVersion("2.0");
    }

    // 주문
    public static <T extends BaseCheckoutRequestType> void setBaseSellerRequestType(T wsdlType) {
        wsdlType.setRequestID(requestId);
        wsdlType.setVersion("4.0");
        wsdlType.setDetailLevel("Full");
    }

    // 고객
    protected static <T extends com.example.localtest.smartstore.customer.type.BaseCheckoutRequestType> void setBaseCustomerRequestType(T wsdlType) {
        wsdlType.setRequestID(requestId);
        wsdlType.setVersion("1.0");
        wsdlType.setDetailLevel("Full");
    }
}
