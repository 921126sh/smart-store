package com.example.localtest.smartstoreapi.seller.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.simple.JSONObject;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDAO {

    private long seq;
    private String beforeClaimStatus;
    private String beforeClaimType;
    private String beforeProductOrderStatus;
    private String afterClaimStatus;
    private String afterClaimType;
    private String afterProductOrderStatus;
    private String productOrderId;
    private String mallId;
    private String productId;
    private String productName;
    private String productOption;
    private String parameterJson;
    private String errorCode;
    private String errorMessage;
    private String errorDetail;
    private String endPoint;
    private Date regDate;
    private String actionErrorCode;
    private String endErrorCode;

}
