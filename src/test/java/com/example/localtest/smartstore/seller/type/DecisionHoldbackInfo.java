
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>decisionHoldbackInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="decisionHoldbackInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClaimStatus" type="{http://seller.shopn.platform.nhncorp.com/}claimStatusType" minOccurs="0"/>
 *         &lt;element name="DecisionHoldbackDetailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionHoldbackReason" type="{http://seller.shopn.platform.nhncorp.com/}claimRequestReasonType" minOccurs="0"/>
 *         &lt;element name="DecisionHoldbackTreatMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryExpectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReDeliveryMethod" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType" minOccurs="0"/>
 *         &lt;element name="ReDeliveryTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerOperationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decisionHoldbackInfo", propOrder = {
    "claimRequestDate",
    "claimStatus",
    "decisionHoldbackDetailedReason",
    "decisionHoldbackReason",
    "decisionHoldbackTreatMemo",
    "reDeliveryCompany",
    "reDeliveryExpectedDate",
    "reDeliveryMethod",
    "reDeliveryTrackingNumber",
    "sellerOperationDate"
})
public class DecisionHoldbackInfo {

    @XmlElement(name = "ClaimRequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar claimRequestDate;
    @XmlElement(name = "ClaimStatus")
    @XmlSchemaType(name = "string")
    protected ClaimStatusType claimStatus;
    @XmlElement(name = "DecisionHoldbackDetailedReason")
    protected String decisionHoldbackDetailedReason;
    @XmlElement(name = "DecisionHoldbackReason")
    @XmlSchemaType(name = "string")
    protected ClaimRequestReasonType decisionHoldbackReason;
    @XmlElement(name = "DecisionHoldbackTreatMemo")
    protected String decisionHoldbackTreatMemo;
    @XmlElement(name = "ReDeliveryCompany")
    protected String reDeliveryCompany;
    @XmlElement(name = "ReDeliveryExpectedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reDeliveryExpectedDate;
    @XmlElement(name = "ReDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType reDeliveryMethod;
    @XmlElement(name = "ReDeliveryTrackingNumber")
    protected String reDeliveryTrackingNumber;
    @XmlElement(name = "SellerOperationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sellerOperationDate;

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
     * decisionHoldbackDetailedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionHoldbackDetailedReason() {
        return decisionHoldbackDetailedReason;
    }

    /**
     * decisionHoldbackDetailedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionHoldbackDetailedReason(String value) {
        this.decisionHoldbackDetailedReason = value;
    }

    /**
     * decisionHoldbackReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public ClaimRequestReasonType getDecisionHoldbackReason() {
        return decisionHoldbackReason;
    }

    /**
     * decisionHoldbackReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public void setDecisionHoldbackReason(ClaimRequestReasonType value) {
        this.decisionHoldbackReason = value;
    }

    /**
     * decisionHoldbackTreatMemo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionHoldbackTreatMemo() {
        return decisionHoldbackTreatMemo;
    }

    /**
     * decisionHoldbackTreatMemo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionHoldbackTreatMemo(String value) {
        this.decisionHoldbackTreatMemo = value;
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
     * reDeliveryExpectedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReDeliveryExpectedDate() {
        return reDeliveryExpectedDate;
    }

    /**
     * reDeliveryExpectedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReDeliveryExpectedDate(XMLGregorianCalendar value) {
        this.reDeliveryExpectedDate = value;
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
     * sellerOperationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellerOperationDate() {
        return sellerOperationDate;
    }

    /**
     * sellerOperationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellerOperationDate(XMLGregorianCalendar value) {
        this.sellerOperationDate = value;
    }

}
