
package com.example.localtest.smartstore.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>exchangeInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="exchangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimDeliveryFeeDemandAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClaimDeliveryFeePayMeans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimDeliveryFeePayMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClaimStatus" type="{http://seller.shopn.platform.nhncorp.com/}claimStatusType" minOccurs="0"/>
 *         &lt;element name="CollectAddress" type="{http://seller.shopn.platform.nhncorp.com/}address" minOccurs="0"/>
 *         &lt;element name="CollectCompletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CollectDeliveryCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectDeliveryMethod" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType" minOccurs="0"/>
 *         &lt;element name="CollectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EtcFeeDemandAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EtcFeePayMeans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EtcFeePayMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDetailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeReason" type="{http://seller.shopn.platform.nhncorp.com/}claimRequestReasonType" minOccurs="0"/>
 *         &lt;element name="HoldbackDetailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldbackReason" type="{http://seller.shopn.platform.nhncorp.com/}holdbackClassType" minOccurs="0"/>
 *         &lt;element name="HoldbackStatus" type="{http://seller.shopn.platform.nhncorp.com/}holdbackStatusType" minOccurs="0"/>
 *         &lt;element name="ReDeliveryMethod" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType" minOccurs="0"/>
 *         &lt;element name="ReDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnReceiveAddress" type="{http://seller.shopn.platform.nhncorp.com/}address" minOccurs="0"/>
 *         &lt;element name="HoldbackConfigDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HoldbackConfigurer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldbackReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HoldbackReleaser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimDeliveryFeeProductOrderIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryOperationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClaimDeliveryFeeDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "exchangeInfo", propOrder = {
    "claimDeliveryFeeDemandAmount",
    "claimDeliveryFeePayMeans",
    "claimDeliveryFeePayMethod",
    "claimRequestDate",
    "claimStatus",
    "collectAddress",
    "collectCompletedDate",
    "collectDeliveryCompany",
    "collectDeliveryMethod",
    "collectStatus",
    "collectTrackingNumber",
    "etcFeeDemandAmount",
    "etcFeePayMeans",
    "etcFeePayMethod",
    "exchangeDetailedReason",
    "exchangeReason",
    "holdbackDetailedReason",
    "holdbackReason",
    "holdbackStatus",
    "reDeliveryMethod",
    "reDeliveryStatus",
    "reDeliveryCompany",
    "reDeliveryTrackingNumber",
    "requestChannel",
    "returnReceiveAddress",
    "holdbackConfigDate",
    "holdbackConfigurer",
    "holdbackReleaseDate",
    "holdbackReleaser",
    "claimDeliveryFeeProductOrderIds",
    "reDeliveryOperationDate",
    "claimDeliveryFeeDiscountAmount",
    "any"
})
public class ExchangeInfo {

    @XmlElement(name = "ClaimDeliveryFeeDemandAmount")
    protected Integer claimDeliveryFeeDemandAmount;
    @XmlElement(name = "ClaimDeliveryFeePayMeans")
    protected String claimDeliveryFeePayMeans;
    @XmlElement(name = "ClaimDeliveryFeePayMethod")
    protected String claimDeliveryFeePayMethod;
    @XmlElement(name = "ClaimRequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar claimRequestDate;
    @XmlElement(name = "ClaimStatus")
    @XmlSchemaType(name = "string")
    protected ClaimStatusType claimStatus;
    @XmlElement(name = "CollectAddress")
    protected Address collectAddress;
    @XmlElement(name = "CollectCompletedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectCompletedDate;
    @XmlElement(name = "CollectDeliveryCompany")
    protected String collectDeliveryCompany;
    @XmlElement(name = "CollectDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType collectDeliveryMethod;
    @XmlElement(name = "CollectStatus")
    protected String collectStatus;
    @XmlElement(name = "CollectTrackingNumber")
    protected String collectTrackingNumber;
    @XmlElement(name = "EtcFeeDemandAmount")
    protected Integer etcFeeDemandAmount;
    @XmlElement(name = "EtcFeePayMeans")
    protected String etcFeePayMeans;
    @XmlElement(name = "EtcFeePayMethod")
    protected String etcFeePayMethod;
    @XmlElement(name = "ExchangeDetailedReason")
    protected String exchangeDetailedReason;
    @XmlElement(name = "ExchangeReason")
    @XmlSchemaType(name = "string")
    protected ClaimRequestReasonType exchangeReason;
    @XmlElement(name = "HoldbackDetailedReason")
    protected String holdbackDetailedReason;
    @XmlElement(name = "HoldbackReason")
    @XmlSchemaType(name = "string")
    protected HoldbackClassType holdbackReason;
    @XmlElement(name = "HoldbackStatus")
    @XmlSchemaType(name = "string")
    protected HoldbackStatusType holdbackStatus;
    @XmlElement(name = "ReDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType reDeliveryMethod;
    @XmlElement(name = "ReDeliveryStatus")
    protected String reDeliveryStatus;
    @XmlElement(name = "ReDeliveryCompany")
    protected String reDeliveryCompany;
    @XmlElement(name = "ReDeliveryTrackingNumber")
    protected String reDeliveryTrackingNumber;
    @XmlElement(name = "RequestChannel")
    protected String requestChannel;
    @XmlElement(name = "ReturnReceiveAddress")
    protected Address returnReceiveAddress;
    @XmlElement(name = "HoldbackConfigDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdbackConfigDate;
    @XmlElement(name = "HoldbackConfigurer")
    protected String holdbackConfigurer;
    @XmlElement(name = "HoldbackReleaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdbackReleaseDate;
    @XmlElement(name = "HoldbackReleaser")
    protected String holdbackReleaser;
    @XmlElement(name = "ClaimDeliveryFeeProductOrderIds")
    protected String claimDeliveryFeeProductOrderIds;
    @XmlElement(name = "ReDeliveryOperationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reDeliveryOperationDate;
    @XmlElement(name = "ClaimDeliveryFeeDiscountAmount")
    protected Integer claimDeliveryFeeDiscountAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * claimDeliveryFeeDemandAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaimDeliveryFeeDemandAmount() {
        return claimDeliveryFeeDemandAmount;
    }

    /**
     * claimDeliveryFeeDemandAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaimDeliveryFeeDemandAmount(Integer value) {
        this.claimDeliveryFeeDemandAmount = value;
    }

    /**
     * claimDeliveryFeePayMeans 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDeliveryFeePayMeans() {
        return claimDeliveryFeePayMeans;
    }

    /**
     * claimDeliveryFeePayMeans 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDeliveryFeePayMeans(String value) {
        this.claimDeliveryFeePayMeans = value;
    }

    /**
     * claimDeliveryFeePayMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDeliveryFeePayMethod() {
        return claimDeliveryFeePayMethod;
    }

    /**
     * claimDeliveryFeePayMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDeliveryFeePayMethod(String value) {
        this.claimDeliveryFeePayMethod = value;
    }

    /**
     * claimRequestDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClaimRequestDate() {
        return claimRequestDate;
    }

    /**
     * claimRequestDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClaimRequestDate(XMLGregorianCalendar value) {
        this.claimRequestDate = value;
    }

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
     * collectAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCollectAddress() {
        return collectAddress;
    }

    /**
     * collectAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCollectAddress(Address value) {
        this.collectAddress = value;
    }

    /**
     * collectCompletedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectCompletedDate() {
        return collectCompletedDate;
    }

    /**
     * collectCompletedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectCompletedDate(XMLGregorianCalendar value) {
        this.collectCompletedDate = value;
    }

    /**
     * collectDeliveryCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectDeliveryCompany() {
        return collectDeliveryCompany;
    }

    /**
     * collectDeliveryCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectDeliveryCompany(String value) {
        this.collectDeliveryCompany = value;
    }

    /**
     * collectDeliveryMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getCollectDeliveryMethod() {
        return collectDeliveryMethod;
    }

    /**
     * collectDeliveryMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setCollectDeliveryMethod(DeliveryMethodType value) {
        this.collectDeliveryMethod = value;
    }

    /**
     * collectStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectStatus() {
        return collectStatus;
    }

    /**
     * collectStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectStatus(String value) {
        this.collectStatus = value;
    }

    /**
     * collectTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectTrackingNumber() {
        return collectTrackingNumber;
    }

    /**
     * collectTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectTrackingNumber(String value) {
        this.collectTrackingNumber = value;
    }

    /**
     * etcFeeDemandAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEtcFeeDemandAmount() {
        return etcFeeDemandAmount;
    }

    /**
     * etcFeeDemandAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEtcFeeDemandAmount(Integer value) {
        this.etcFeeDemandAmount = value;
    }

    /**
     * etcFeePayMeans 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtcFeePayMeans() {
        return etcFeePayMeans;
    }

    /**
     * etcFeePayMeans 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtcFeePayMeans(String value) {
        this.etcFeePayMeans = value;
    }

    /**
     * etcFeePayMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtcFeePayMethod() {
        return etcFeePayMethod;
    }

    /**
     * etcFeePayMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtcFeePayMethod(String value) {
        this.etcFeePayMethod = value;
    }

    /**
     * exchangeDetailedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDetailedReason() {
        return exchangeDetailedReason;
    }

    /**
     * exchangeDetailedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDetailedReason(String value) {
        this.exchangeDetailedReason = value;
    }

    /**
     * exchangeReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public ClaimRequestReasonType getExchangeReason() {
        return exchangeReason;
    }

    /**
     * exchangeReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public void setExchangeReason(ClaimRequestReasonType value) {
        this.exchangeReason = value;
    }

    /**
     * holdbackDetailedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldbackDetailedReason() {
        return holdbackDetailedReason;
    }

    /**
     * holdbackDetailedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldbackDetailedReason(String value) {
        this.holdbackDetailedReason = value;
    }

    /**
     * holdbackReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HoldbackClassType }
     *     
     */
    public HoldbackClassType getHoldbackReason() {
        return holdbackReason;
    }

    /**
     * holdbackReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldbackClassType }
     *     
     */
    public void setHoldbackReason(HoldbackClassType value) {
        this.holdbackReason = value;
    }

    /**
     * holdbackStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HoldbackStatusType }
     *     
     */
    public HoldbackStatusType getHoldbackStatus() {
        return holdbackStatus;
    }

    /**
     * holdbackStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldbackStatusType }
     *     
     */
    public void setHoldbackStatus(HoldbackStatusType value) {
        this.holdbackStatus = value;
    }

    /**
     * reDeliveryMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getReDeliveryMethod() {
        return reDeliveryMethod;
    }

    /**
     * reDeliveryMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setReDeliveryMethod(DeliveryMethodType value) {
        this.reDeliveryMethod = value;
    }

    /**
     * reDeliveryStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReDeliveryStatus() {
        return reDeliveryStatus;
    }

    /**
     * reDeliveryStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReDeliveryStatus(String value) {
        this.reDeliveryStatus = value;
    }

    /**
     * reDeliveryCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReDeliveryCompany() {
        return reDeliveryCompany;
    }

    /**
     * reDeliveryCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReDeliveryCompany(String value) {
        this.reDeliveryCompany = value;
    }

    /**
     * reDeliveryTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReDeliveryTrackingNumber() {
        return reDeliveryTrackingNumber;
    }

    /**
     * reDeliveryTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReDeliveryTrackingNumber(String value) {
        this.reDeliveryTrackingNumber = value;
    }

    /**
     * requestChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestChannel() {
        return requestChannel;
    }

    /**
     * requestChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestChannel(String value) {
        this.requestChannel = value;
    }

    /**
     * returnReceiveAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnReceiveAddress() {
        return returnReceiveAddress;
    }

    /**
     * returnReceiveAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnReceiveAddress(Address value) {
        this.returnReceiveAddress = value;
    }

    /**
     * holdbackConfigDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldbackConfigDate() {
        return holdbackConfigDate;
    }

    /**
     * holdbackConfigDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldbackConfigDate(XMLGregorianCalendar value) {
        this.holdbackConfigDate = value;
    }

    /**
     * holdbackConfigurer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldbackConfigurer() {
        return holdbackConfigurer;
    }

    /**
     * holdbackConfigurer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldbackConfigurer(String value) {
        this.holdbackConfigurer = value;
    }

    /**
     * holdbackReleaseDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldbackReleaseDate() {
        return holdbackReleaseDate;
    }

    /**
     * holdbackReleaseDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldbackReleaseDate(XMLGregorianCalendar value) {
        this.holdbackReleaseDate = value;
    }

    /**
     * holdbackReleaser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldbackReleaser() {
        return holdbackReleaser;
    }

    /**
     * holdbackReleaser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldbackReleaser(String value) {
        this.holdbackReleaser = value;
    }

    /**
     * claimDeliveryFeeProductOrderIds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDeliveryFeeProductOrderIds() {
        return claimDeliveryFeeProductOrderIds;
    }

    /**
     * claimDeliveryFeeProductOrderIds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDeliveryFeeProductOrderIds(String value) {
        this.claimDeliveryFeeProductOrderIds = value;
    }

    /**
     * reDeliveryOperationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReDeliveryOperationDate() {
        return reDeliveryOperationDate;
    }

    /**
     * reDeliveryOperationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReDeliveryOperationDate(XMLGregorianCalendar value) {
        this.reDeliveryOperationDate = value;
    }

    /**
     * claimDeliveryFeeDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaimDeliveryFeeDiscountAmount() {
        return claimDeliveryFeeDiscountAmount;
    }

    /**
     * claimDeliveryFeeDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaimDeliveryFeeDiscountAmount(Integer value) {
        this.claimDeliveryFeeDiscountAmount = value;
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
