package com.example.localtest.smartstoreapi.seller.mapper;

import com.example.localtest.smartstoreapi.seller.dao.SellerDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerMapper {
    public List<SellerDAO> getStoreLog();
    public void afterInsertStoreLog(SellerDAO sellerDAO);
    public SellerDAO getStoreLogBySeq(long targetSeq);
    public void updateStoreLogBySeq(SellerDAO sellerDAO);
    public List<SellerDAO> getStoreErrorLog();
}
