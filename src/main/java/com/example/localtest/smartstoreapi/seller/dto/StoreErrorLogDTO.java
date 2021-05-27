package com.example.localtest.smartstoreapi.seller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreErrorLogDTO {

    private String productOrderId;
    private String productId;
    private String productName;
    private String beforeClaimStatus;
    private String beforeClaimType;
    private String beforeProductOrderStatus;
    private String endPoint;
    private String parameterJson;
    private String afterClaimStatus;
    private String afterClaimType;
    private String afterProductOrderStatus;
    private String errorCode;
    private String errorMessage;
    private Date regDate;
}
