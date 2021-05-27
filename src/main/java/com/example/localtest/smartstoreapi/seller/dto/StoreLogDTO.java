package com.example.localtest.smartstoreapi.seller.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreLogDTO {

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
    private Date regDate;
}
