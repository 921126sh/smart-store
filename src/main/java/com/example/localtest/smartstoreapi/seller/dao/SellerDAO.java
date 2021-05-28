package com.example.localtest.smartstoreapi.seller.dao;

import lombok.*;
import org.json.simple.JSONObject;
import org.springframework.lang.Nullable;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SellerDAO {


    private long seq;

    @Nullable
    private String beforeClaimStatus;
    @Nullable
    private String beforeClaimType;
    @Nullable
    private String beforeProductOrderStatus;
    @Nullable
    private String afterClaimStatus;
    @Nullable
    private String afterClaimType;
    @Nullable
    private String afterProductOrderStatus;
    @Nullable
    private String productOrderId;
    @Nullable
    private String mallId;
    @Nullable
    private String productId;
    @Nullable
    private String productName;
    @Nullable
    private String productOption;
    @Nullable
    private String parameterJson;
    @Nullable
    private String errorCode;
    @Nullable
    private String errorMessage;
    @Nullable
    private String errorDetail;
    @Nullable
    private String endPoint;
    @Nullable
    private Date regDate;
    @Nullable
    private String actionErrorCode;
    @Nullable
    private String endErrorCode;

}
