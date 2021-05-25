
package com.example.localtest.smartstore.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>cancelInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="cancelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CancelCompletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CancelDetailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelReason" type="{http://seller.shopn.platform.nhncorp.com/}claimRequestReasonType" minOccurs="0"/>
 *         &lt;element name="ClaimRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClaimStatus" type="{http://seller.shopn.platform.nhncorp.com/}claimStatusType" minOccurs="0"/>
 *         &lt;element name="RefundExpectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundStandbyReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundStandbyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cancelInfo", propOrder = {
    "cancelApprovalDate",
    "cancelCompletedDate",
    "cancelDetailedReason",
    "cancelReason",
    "claimRequestDate",
    "claimStatus",
    "refundExpectedDate",
    "refundStandbyReason",
    "refundStandbyStatus",
    "requestChannel",
    "any"
})
public class CancelInfo {

    @XmlElement(name = "CancelApprovalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelApprovalDate;
    @XmlElement(name = "CancelCompletedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelCompletedDate;
    @XmlElement(name = "CancelDetailedReason")
    protected String cancelDetailedReason;
    @XmlElement(name = "CancelReason")
    @XmlSchemaType(name = "string")
    protected ClaimRequestReasonType cancelReason;
    @XmlElement(name = "ClaimRequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar claimRequestDate;
    @XmlElement(name = "ClaimStatus")
    @XmlSchemaType(name = "string")
    protected ClaimStatusType claimStatus;
    @XmlElement(name = "RefundExpectedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundExpectedDate;
    @XmlElement(name = "RefundStandbyReason")
    protected String refundStandbyReason;
    @XmlElement(name = "RefundStandbyStatus")
    protected String refundStandbyStatus;
    @XmlElement(name = "RequestChannel")
    protected String requestChannel;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * cancelApprovalDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelApprovalDate() {
        return cancelApprovalDate;
    }

    /**
     * cancelApprovalDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelApprovalDate(XMLGregorianCalendar value) {
        this.cancelApprovalDate = value;
    }

    /**
     * cancelCompletedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelCompletedDate() {
        return cancelCompletedDate;
    }

    /**
     * cancelCompletedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelCompletedDate(XMLGregorianCalendar value) {
        this.cancelCompletedDate = value;
    }

    /**
     * cancelDetailedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDetailedReason() {
        return cancelDetailedReason;
    }

    /**
     * cancelDetailedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDetailedReason(String value) {
        this.cancelDetailedReason = value;
    }

    /**
     * cancelReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public ClaimRequestReasonType getCancelReason() {
        return cancelReason;
    }

    /**
     * cancelReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public void setCancelReason(ClaimRequestReasonType value) {
        this.cancelReason = value;
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
     * refundExpectedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundExpectedDate() {
        return refundExpectedDate;
    }

    /**
     * refundExpectedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundExpectedDate(XMLGregorianCalendar value) {
        this.refundExpectedDate = value;
    }

    /**
     * refundStandbyReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStandbyReason() {
        return refundStandbyReason;
    }

    /**
     * refundStandbyReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStandbyReason(String value) {
        this.refundStandbyReason = value;
    }

    /**
     * refundStandbyStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStandbyStatus() {
        return refundStandbyStatus;
    }

    /**
     * refundStandbyStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStandbyStatus(String value) {
        this.refundStandbyStatus = value;
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
