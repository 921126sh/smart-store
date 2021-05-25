
package com.example.localtest.smartstore.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>productOrder complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="productOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimStatus" type="{http://seller.shopn.platform.nhncorp.com/}claimStatusType" minOccurs="0"/>
 *         &lt;element name="ClaimType" type="{http://seller.shopn.platform.nhncorp.com/}claimType" minOccurs="0"/>
 *         &lt;element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DelayedDispatchDetailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelayedDispatchReason" type="{http://seller.shopn.platform.nhncorp.com/}delayedDispatchReasonType" minOccurs="0"/>
 *         &lt;element name="DeliveryDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryFeeAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryPolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryMethod" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType" minOccurs="0"/>
 *         &lt;element name="FreeGift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PlaceOrderStatus" type="{http://seller.shopn.platform.nhncorp.com/}placeOrderStatusType" minOccurs="0"/>
 *         &lt;element name="ProductClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductOrderStatus" type="{http://seller.shopn.platform.nhncorp.com/}productOrderStatusType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SectionDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{http://seller.shopn.platform.nhncorp.com/}address" minOccurs="0"/>
 *         &lt;element name="ShippingDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippingFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TakingAddress" type="{http://seller.shopn.platform.nhncorp.com/}address" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalProductAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerBurdenDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommissionRatingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPrePayStatus" type="{http://seller.shopn.platform.nhncorp.com/}commissionPrePayStatusType" minOccurs="0"/>
 *         &lt;element name="PaymentCommission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SaleCommission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpectedSettlementAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InflowPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionManageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaserSocialSecurityNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerCustomCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerCustomCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelCommission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndividualCustomUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductImediateDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductProductDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductMultiplePurchaseDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerBurdenImediateDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerBurdenProductDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerBurdenMultiplePurchaseDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KnowledgeShoppingSellingInterlockCommission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftReceivingStatus" type="{http://seller.shopn.platform.nhncorp.com/}giftReceivingStatusType" minOccurs="0"/>
 *         &lt;element name="SellerBurdenStoreDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productOrder", propOrder = {
    "claimStatus",
    "claimType",
    "decisionDate",
    "delayedDispatchDetailedReason",
    "delayedDispatchReason",
    "deliveryDiscountAmount",
    "deliveryFeeAmount",
    "deliveryPolicyType",
    "expectedDeliveryMethod",
    "freeGift",
    "mallID",
    "optionCode",
    "optionPrice",
    "packageNumber",
    "placeOrderDate",
    "placeOrderStatus",
    "productClass",
    "productDiscountAmount",
    "productID",
    "productName",
    "productOption",
    "productOrderID",
    "productOrderStatus",
    "quantity",
    "sectionDeliveryFee",
    "sellerProductCode",
    "shippingAddress",
    "shippingDueDate",
    "shippingFeeType",
    "shippingMemo",
    "takingAddress",
    "totalPaymentAmount",
    "totalProductAmount",
    "unitPrice",
    "sellerBurdenDiscountAmount",
    "commissionRatingType",
    "commissionPrePayStatus",
    "paymentCommission",
    "saleCommission",
    "expectedSettlementAmount",
    "inflowPath",
    "itemNo",
    "optionManageCode",
    "purchaserSocialSecurityNo",
    "sellerCustomCode1",
    "sellerCustomCode2",
    "claimID",
    "channelCommission",
    "individualCustomUniqueCode",
    "productImediateDiscountAmount",
    "productProductDiscountAmount",
    "productMultiplePurchaseDiscountAmount",
    "sellerBurdenImediateDiscountAmount",
    "sellerBurdenProductDiscountAmount",
    "sellerBurdenMultiplePurchaseDiscountAmount",
    "knowledgeShoppingSellingInterlockCommission",
    "giftReceivingStatus",
    "sellerBurdenStoreDiscountAmount",
    "any"
})
public class ProductOrder {

    @XmlElement(name = "ClaimStatus")
    @XmlSchemaType(name = "string")
    protected ClaimStatusType claimStatus;
    @XmlElement(name = "ClaimType")
    @XmlSchemaType(name = "string")
    protected ClaimType claimType;
    @XmlElement(name = "DecisionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionDate;
    @XmlElement(name = "DelayedDispatchDetailedReason")
    protected String delayedDispatchDetailedReason;
    @XmlElement(name = "DelayedDispatchReason")
    @XmlSchemaType(name = "string")
    protected DelayedDispatchReasonType delayedDispatchReason;
    @XmlElement(name = "DeliveryDiscountAmount")
    protected Integer deliveryDiscountAmount;
    @XmlElement(name = "DeliveryFeeAmount")
    protected Integer deliveryFeeAmount;
    @XmlElement(name = "DeliveryPolicyType")
    protected String deliveryPolicyType;
    @XmlElement(name = "ExpectedDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType expectedDeliveryMethod;
    @XmlElement(name = "FreeGift")
    protected String freeGift;
    @XmlElement(name = "MallID")
    protected String mallID;
    @XmlElement(name = "OptionCode")
    protected String optionCode;
    @XmlElement(name = "OptionPrice")
    protected Integer optionPrice;
    @XmlElement(name = "PackageNumber")
    protected String packageNumber;
    @XmlElement(name = "PlaceOrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placeOrderDate;
    @XmlElement(name = "PlaceOrderStatus")
    @XmlSchemaType(name = "string")
    protected PlaceOrderStatusType placeOrderStatus;
    @XmlElement(name = "ProductClass")
    protected String productClass;
    @XmlElement(name = "ProductDiscountAmount")
    protected Integer productDiscountAmount;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductOption")
    protected String productOption;
    @XmlElement(name = "ProductOrderID")
    protected String productOrderID;
    @XmlElement(name = "ProductOrderStatus")
    @XmlSchemaType(name = "string")
    protected ProductOrderStatusType productOrderStatus;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "SectionDeliveryFee")
    protected Integer sectionDeliveryFee;
    @XmlElement(name = "SellerProductCode")
    protected String sellerProductCode;
    @XmlElement(name = "ShippingAddress")
    protected Address shippingAddress;
    @XmlElement(name = "ShippingDueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingDueDate;
    @XmlElement(name = "ShippingFeeType")
    protected String shippingFeeType;
    @XmlElement(name = "ShippingMemo")
    protected String shippingMemo;
    @XmlElement(name = "TakingAddress")
    protected Address takingAddress;
    @XmlElement(name = "TotalPaymentAmount")
    protected Integer totalPaymentAmount;
    @XmlElement(name = "TotalProductAmount")
    protected Integer totalProductAmount;
    @XmlElement(name = "UnitPrice")
    protected Integer unitPrice;
    @XmlElement(name = "SellerBurdenDiscountAmount")
    protected Integer sellerBurdenDiscountAmount;
    @XmlElement(name = "CommissionRatingType")
    protected String commissionRatingType;
    @XmlElement(name = "CommissionPrePayStatus")
    @XmlSchemaType(name = "string")
    protected CommissionPrePayStatusType commissionPrePayStatus;
    @XmlElement(name = "PaymentCommission")
    protected Integer paymentCommission;
    @XmlElement(name = "SaleCommission")
    protected Integer saleCommission;
    @XmlElement(name = "ExpectedSettlementAmount")
    protected Integer expectedSettlementAmount;
    @XmlElement(name = "InflowPath")
    protected String inflowPath;
    @XmlElement(name = "ItemNo")
    protected String itemNo;
    @XmlElement(name = "OptionManageCode")
    protected String optionManageCode;
    @XmlElement(name = "PurchaserSocialSecurityNo")
    protected String purchaserSocialSecurityNo;
    @XmlElement(name = "SellerCustomCode1")
    protected String sellerCustomCode1;
    @XmlElement(name = "SellerCustomCode2")
    protected String sellerCustomCode2;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "ChannelCommission")
    protected Integer channelCommission;
    @XmlElement(name = "IndividualCustomUniqueCode")
    protected String individualCustomUniqueCode;
    @XmlElement(name = "ProductImediateDiscountAmount")
    protected Integer productImediateDiscountAmount;
    @XmlElement(name = "ProductProductDiscountAmount")
    protected Integer productProductDiscountAmount;
    @XmlElement(name = "ProductMultiplePurchaseDiscountAmount")
    protected Integer productMultiplePurchaseDiscountAmount;
    @XmlElement(name = "SellerBurdenImediateDiscountAmount")
    protected Integer sellerBurdenImediateDiscountAmount;
    @XmlElement(name = "SellerBurdenProductDiscountAmount")
    protected Integer sellerBurdenProductDiscountAmount;
    @XmlElement(name = "SellerBurdenMultiplePurchaseDiscountAmount")
    protected Integer sellerBurdenMultiplePurchaseDiscountAmount;
    @XmlElement(name = "KnowledgeShoppingSellingInterlockCommission")
    protected Integer knowledgeShoppingSellingInterlockCommission;
    @XmlElement(name = "GiftReceivingStatus")
    @XmlSchemaType(name = "string")
    protected GiftReceivingStatusType giftReceivingStatus;
    @XmlElement(name = "SellerBurdenStoreDiscountAmount")
    protected Integer sellerBurdenStoreDiscountAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * claimStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatusType }
     *     
     */
    public ClaimStatusType getClaimStatus() {
        return claimStatus;
    }

    /**
     * claimStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatusType }
     *     
     */
    public void setClaimStatus(ClaimStatusType value) {
        this.claimStatus = value;
    }

    /**
     * claimType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType }
     *     
     */
    public ClaimType getClaimType() {
        return claimType;
    }

    /**
     * claimType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType }
     *     
     */
    public void setClaimType(ClaimType value) {
        this.claimType = value;
    }

    /**
     * decisionDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * decisionDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * delayedDispatchDetailedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayedDispatchDetailedReason() {
        return delayedDispatchDetailedReason;
    }

    /**
     * delayedDispatchDetailedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayedDispatchDetailedReason(String value) {
        this.delayedDispatchDetailedReason = value;
    }

    /**
     * delayedDispatchReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DelayedDispatchReasonType }
     *     
     */
    public DelayedDispatchReasonType getDelayedDispatchReason() {
        return delayedDispatchReason;
    }

    /**
     * delayedDispatchReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayedDispatchReasonType }
     *     
     */
    public void setDelayedDispatchReason(DelayedDispatchReasonType value) {
        this.delayedDispatchReason = value;
    }

    /**
     * deliveryDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryDiscountAmount() {
        return deliveryDiscountAmount;
    }

    /**
     * deliveryDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryDiscountAmount(Integer value) {
        this.deliveryDiscountAmount = value;
    }

    /**
     * deliveryFeeAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryFeeAmount() {
        return deliveryFeeAmount;
    }

    /**
     * deliveryFeeAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryFeeAmount(Integer value) {
        this.deliveryFeeAmount = value;
    }

    /**
     * deliveryPolicyType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPolicyType() {
        return deliveryPolicyType;
    }

    /**
     * deliveryPolicyType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPolicyType(String value) {
        this.deliveryPolicyType = value;
    }

    /**
     * expectedDeliveryMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getExpectedDeliveryMethod() {
        return expectedDeliveryMethod;
    }

    /**
     * expectedDeliveryMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setExpectedDeliveryMethod(DeliveryMethodType value) {
        this.expectedDeliveryMethod = value;
    }

    /**
     * freeGift 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeGift() {
        return freeGift;
    }

    /**
     * freeGift 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeGift(String value) {
        this.freeGift = value;
    }

    /**
     * mallID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMallID() {
        return mallID;
    }

    /**
     * mallID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMallID(String value) {
        this.mallID = value;
    }

    /**
     * optionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * optionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * optionPrice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOptionPrice() {
        return optionPrice;
    }

    /**
     * optionPrice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptionPrice(Integer value) {
        this.optionPrice = value;
    }

    /**
     * packageNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /**
     * packageNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNumber(String value) {
        this.packageNumber = value;
    }

    /**
     * placeOrderDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlaceOrderDate() {
        return placeOrderDate;
    }

    /**
     * placeOrderDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlaceOrderDate(XMLGregorianCalendar value) {
        this.placeOrderDate = value;
    }

    /**
     * placeOrderStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOrderStatusType }
     *     
     */
    public PlaceOrderStatusType getPlaceOrderStatus() {
        return placeOrderStatus;
    }

    /**
     * placeOrderStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOrderStatusType }
     *     
     */
    public void setPlaceOrderStatus(PlaceOrderStatusType value) {
        this.placeOrderStatus = value;
    }

    /**
     * productClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * productClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClass(String value) {
        this.productClass = value;
    }

    /**
     * productDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductDiscountAmount() {
        return productDiscountAmount;
    }

    /**
     * productDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductDiscountAmount(Integer value) {
        this.productDiscountAmount = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * productName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * productName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * productOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOption() {
        return productOption;
    }

    /**
     * productOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOption(String value) {
        this.productOption = value;
    }

    /**
     * productOrderID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOrderID() {
        return productOrderID;
    }

    /**
     * productOrderID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOrderID(String value) {
        this.productOrderID = value;
    }

    /**
     * productOrderStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderStatusType }
     *     
     */
    public ProductOrderStatusType getProductOrderStatus() {
        return productOrderStatus;
    }

    /**
     * productOrderStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderStatusType }
     *     
     */
    public void setProductOrderStatus(ProductOrderStatusType value) {
        this.productOrderStatus = value;
    }

    /**
     * quantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * quantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * sectionDeliveryFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionDeliveryFee() {
        return sectionDeliveryFee;
    }

    /**
     * sectionDeliveryFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionDeliveryFee(Integer value) {
        this.sectionDeliveryFee = value;
    }

    /**
     * sellerProductCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerProductCode() {
        return sellerProductCode;
    }

    /**
     * sellerProductCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerProductCode(String value) {
        this.sellerProductCode = value;
    }

    /**
     * shippingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * shippingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * shippingDueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingDueDate() {
        return shippingDueDate;
    }

    /**
     * shippingDueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingDueDate(XMLGregorianCalendar value) {
        this.shippingDueDate = value;
    }

    /**
     * shippingFeeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFeeType() {
        return shippingFeeType;
    }

    /**
     * shippingFeeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFeeType(String value) {
        this.shippingFeeType = value;
    }

    /**
     * shippingMemo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMemo() {
        return shippingMemo;
    }

    /**
     * shippingMemo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMemo(String value) {
        this.shippingMemo = value;
    }

    /**
     * takingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTakingAddress() {
        return takingAddress;
    }

    /**
     * takingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTakingAddress(Address value) {
        this.takingAddress = value;
    }

    /**
     * totalPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * totalPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPaymentAmount(Integer value) {
        this.totalPaymentAmount = value;
    }

    /**
     * totalProductAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalProductAmount() {
        return totalProductAmount;
    }

    /**
     * totalProductAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalProductAmount(Integer value) {
        this.totalProductAmount = value;
    }

    /**
     * unitPrice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitPrice(Integer value) {
        this.unitPrice = value;
    }

    /**
     * sellerBurdenDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerBurdenDiscountAmount() {
        return sellerBurdenDiscountAmount;
    }

    /**
     * sellerBurdenDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerBurdenDiscountAmount(Integer value) {
        this.sellerBurdenDiscountAmount = value;
    }

    /**
     * commissionRatingType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionRatingType() {
        return commissionRatingType;
    }

    /**
     * commissionRatingType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionRatingType(String value) {
        this.commissionRatingType = value;
    }

    /**
     * commissionPrePayStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommissionPrePayStatusType }
     *     
     */
    public CommissionPrePayStatusType getCommissionPrePayStatus() {
        return commissionPrePayStatus;
    }

    /**
     * commissionPrePayStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionPrePayStatusType }
     *     
     */
    public void setCommissionPrePayStatus(CommissionPrePayStatusType value) {
        this.commissionPrePayStatus = value;
    }

    /**
     * paymentCommission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentCommission() {
        return paymentCommission;
    }

    /**
     * paymentCommission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentCommission(Integer value) {
        this.paymentCommission = value;
    }

    /**
     * saleCommission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaleCommission() {
        return saleCommission;
    }

    /**
     * saleCommission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaleCommission(Integer value) {
        this.saleCommission = value;
    }

    /**
     * expectedSettlementAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpectedSettlementAmount() {
        return expectedSettlementAmount;
    }

    /**
     * expectedSettlementAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpectedSettlementAmount(Integer value) {
        this.expectedSettlementAmount = value;
    }

    /**
     * inflowPath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInflowPath() {
        return inflowPath;
    }

    /**
     * inflowPath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInflowPath(String value) {
        this.inflowPath = value;
    }

    /**
     * itemNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNo(String value) {
        this.itemNo = value;
    }

    /**
     * optionManageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionManageCode() {
        return optionManageCode;
    }

    /**
     * optionManageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionManageCode(String value) {
        this.optionManageCode = value;
    }

    /**
     * purchaserSocialSecurityNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserSocialSecurityNo() {
        return purchaserSocialSecurityNo;
    }

    /**
     * purchaserSocialSecurityNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserSocialSecurityNo(String value) {
        this.purchaserSocialSecurityNo = value;
    }

    /**
     * sellerCustomCode1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCustomCode1() {
        return sellerCustomCode1;
    }

    /**
     * sellerCustomCode1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCustomCode1(String value) {
        this.sellerCustomCode1 = value;
    }

    /**
     * sellerCustomCode2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCustomCode2() {
        return sellerCustomCode2;
    }

    /**
     * sellerCustomCode2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCustomCode2(String value) {
        this.sellerCustomCode2 = value;
    }

    /**
     * claimID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * claimID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * channelCommission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelCommission() {
        return channelCommission;
    }

    /**
     * channelCommission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelCommission(Integer value) {
        this.channelCommission = value;
    }

    /**
     * individualCustomUniqueCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualCustomUniqueCode() {
        return individualCustomUniqueCode;
    }

    /**
     * individualCustomUniqueCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualCustomUniqueCode(String value) {
        this.individualCustomUniqueCode = value;
    }

    /**
     * productImediateDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductImediateDiscountAmount() {
        return productImediateDiscountAmount;
    }

    /**
     * productImediateDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductImediateDiscountAmount(Integer value) {
        this.productImediateDiscountAmount = value;
    }

    /**
     * productProductDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductProductDiscountAmount() {
        return productProductDiscountAmount;
    }

    /**
     * productProductDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductProductDiscountAmount(Integer value) {
        this.productProductDiscountAmount = value;
    }

    /**
     * productMultiplePurchaseDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductMultiplePurchaseDiscountAmount() {
        return productMultiplePurchaseDiscountAmount;
    }

    /**
     * productMultiplePurchaseDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductMultiplePurchaseDiscountAmount(Integer value) {
        this.productMultiplePurchaseDiscountAmount = value;
    }

    /**
     * sellerBurdenImediateDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerBurdenImediateDiscountAmount() {
        return sellerBurdenImediateDiscountAmount;
    }

    /**
     * sellerBurdenImediateDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerBurdenImediateDiscountAmount(Integer value) {
        this.sellerBurdenImediateDiscountAmount = value;
    }

    /**
     * sellerBurdenProductDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerBurdenProductDiscountAmount() {
        return sellerBurdenProductDiscountAmount;
    }

    /**
     * sellerBurdenProductDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerBurdenProductDiscountAmount(Integer value) {
        this.sellerBurdenProductDiscountAmount = value;
    }

    /**
     * sellerBurdenMultiplePurchaseDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerBurdenMultiplePurchaseDiscountAmount() {
        return sellerBurdenMultiplePurchaseDiscountAmount;
    }

    /**
     * sellerBurdenMultiplePurchaseDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerBurdenMultiplePurchaseDiscountAmount(Integer value) {
        this.sellerBurdenMultiplePurchaseDiscountAmount = value;
    }

    /**
     * knowledgeShoppingSellingInterlockCommission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKnowledgeShoppingSellingInterlockCommission() {
        return knowledgeShoppingSellingInterlockCommission;
    }

    /**
     * knowledgeShoppingSellingInterlockCommission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKnowledgeShoppingSellingInterlockCommission(Integer value) {
        this.knowledgeShoppingSellingInterlockCommission = value;
    }

    /**
     * giftReceivingStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GiftReceivingStatusType }
     *     
     */
    public GiftReceivingStatusType getGiftReceivingStatus() {
        return giftReceivingStatus;
    }

    /**
     * giftReceivingStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftReceivingStatusType }
     *     
     */
    public void setGiftReceivingStatus(GiftReceivingStatusType value) {
        this.giftReceivingStatus = value;
    }

    /**
     * sellerBurdenStoreDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerBurdenStoreDiscountAmount() {
        return sellerBurdenStoreDiscountAmount;
    }

    /**
     * sellerBurdenStoreDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerBurdenStoreDiscountAmount(Integer value) {
        this.sellerBurdenStoreDiscountAmount = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
