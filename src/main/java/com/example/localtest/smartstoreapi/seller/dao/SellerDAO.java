package com.example.localtest.smartstoreapi.seller.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SellerDAO {

    private long seq;
    private String beforeClaimStatus;
    private String beforeClaimType;
    private String beforeProductOrderStatus;
    private String afterClaimStatus;
    private String afterClaimType;
    private String afterProductOrderStatus;
    private long productOrderId;


}
