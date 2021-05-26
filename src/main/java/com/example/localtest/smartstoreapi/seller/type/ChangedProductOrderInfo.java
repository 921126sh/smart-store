
package com.example.localtest.smartstoreapi.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>changedProductOrderInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="changedProductOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimStatus" type="{http://seller.shopn.platform.nhncorp.com/}claimStatusType" minOccurs="0"/>
 *         &lt;element name="ClaimType" type="{http://seller.shopn.platform.nhncorp.com/}claimType" minOccurs="0"/>
 *         &lt;element name="LastChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastChangedStatus" type="{http://seller.shopn.platform.nhncorp.com/}productOrderChangeType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductOrderStatus" type="{http://seller.shopn.platform.nhncorp.com/}productOrderStatusType" minOccurs="0"/>
 *         &lt;element name="IsReceiverAddressChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftReceivingStatus" type="{http://seller.shopn.platform.nhncorp.com/}giftReceivingStatusType" minOccurs="0"/>
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
@XmlType(name = "changedProductOrderInfo", propOrder = {
    "claimStatus",
    "claimType",
    "lastChangedDate",
    "lastChangedStatus",
    "orderID",
    "paymentDate",
    "productOrderID",
    "productOrderStatus",
    "isReceiverAddressChanged",
    "giftReceivingStatus",
    "any"
})
public class ChangedProductOrderInfo {

    @XmlElement(name = "ClaimStatus")
    @XmlSchemaType(name = "string")
    protected ClaimStatusType claimStatus;
    @XmlElement(name = "ClaimType")
    @XmlSchemaType(name = "string")
    protected ClaimType claimType;
    @XmlElement(name = "LastChangedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangedDate;
    @XmlElement(name = "LastChangedStatus")
    @XmlSchemaType(name = "string")
    protected ProductOrderChangeType lastChangedStatus;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "ProductOrderID")
    protected String productOrderID;
    @XmlElement(name = "ProductOrderStatus")
    @XmlSchemaType(name = "string")
    protected ProductOrderStatusType productOrderStatus;
    @XmlElement(name = "IsReceiverAddressChanged")
    protected Boolean isReceiverAddressChanged;
    @XmlElement(name = "GiftReceivingStatus")
    @XmlSchemaType(name = "string")
    protected GiftReceivingStatusType giftReceivingStatus;
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
     * lastChangedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * lastChangedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangedDate(XMLGregorianCalendar value) {
        this.lastChangedDate = value;
    }

    /**
     * lastChangedStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderChangeType }
     *     
     */
    public ProductOrderChangeType getLastChangedStatus() {
        return lastChangedStatus;
    }

    /**
     * lastChangedStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderChangeType }
     *     
     */
    public void setLastChangedStatus(ProductOrderChangeType value) {
        this.lastChangedStatus = value;
    }

    /**
     * orderID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * orderID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
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
     * isReceiverAddressChanged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReceiverAddressChanged() {
        return isReceiverAddressChanged;
    }

    /**
     * isReceiverAddressChanged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReceiverAddressChanged(Boolean value) {
        this.isReceiverAddressChanged = value;
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
