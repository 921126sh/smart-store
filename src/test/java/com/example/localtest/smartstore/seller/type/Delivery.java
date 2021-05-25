
package com.example.localtest.smartstore.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>delivery complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsWrongTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongTrackingNumberRegisteredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WrongTrackingNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "delivery", propOrder = {
    "deliveredDate",
    "deliveryCompany",
    "deliveryMethod",
    "deliveryStatus",
    "isWrongTrackingNumber",
    "pickupDate",
    "sendDate",
    "trackingNumber",
    "wrongTrackingNumberRegisteredDate",
    "wrongTrackingNumberType",
    "any"
})
public class Delivery {

    @XmlElement(name = "DeliveredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveredDate;
    @XmlElement(name = "DeliveryCompany")
    protected String deliveryCompany;
    @XmlElement(name = "DeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType deliveryMethod;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "IsWrongTrackingNumber")
    protected Boolean isWrongTrackingNumber;
    @XmlElement(name = "PickupDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    @XmlElement(name = "SendDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "WrongTrackingNumberRegisteredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wrongTrackingNumberRegisteredDate;
    @XmlElement(name = "WrongTrackingNumberType")
    protected String wrongTrackingNumberType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * deliveredDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveredDate() {
        return deliveredDate;
    }

    /**
     * deliveredDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveredDate(XMLGregorianCalendar value) {
        this.deliveredDate = value;
    }

    /**
     * deliveryCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * deliveryCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCompany(String value) {
        this.deliveryCompany = value;
    }

    /**
     * deliveryMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * deliveryMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodType value) {
        this.deliveryMethod = value;
    }

    /**
     * deliveryStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * deliveryStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * isWrongTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWrongTrackingNumber() {
        return isWrongTrackingNumber;
    }

    /**
     * isWrongTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWrongTrackingNumber(Boolean value) {
        this.isWrongTrackingNumber = value;
    }

    /**
     * pickupDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * pickupDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
        this.pickupDate = value;
    }

    /**
     * sendDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * sendDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * trackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * trackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * wrongTrackingNumberRegisteredDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWrongTrackingNumberRegisteredDate() {
        return wrongTrackingNumberRegisteredDate;
    }

    /**
     * wrongTrackingNumberRegisteredDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWrongTrackingNumberRegisteredDate(XMLGregorianCalendar value) {
        this.wrongTrackingNumberRegisteredDate = value;
    }

    /**
     * wrongTrackingNumberType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongTrackingNumberType() {
        return wrongTrackingNumberType;
    }

    /**
     * wrongTrackingNumberType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongTrackingNumberType(String value) {
        this.wrongTrackingNumberType = value;
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
