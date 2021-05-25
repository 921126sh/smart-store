
package com.example.localtest.smartstore.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>order complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeAmountPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckoutAccumulationPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeneralPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NaverMileagePaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdererID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdererName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdererTel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdererTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMeans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeliveryMemoParticularInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayLocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdererNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayLaterPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "order", propOrder = {
    "chargeAmountPaymentAmount",
    "checkoutAccumulationPaymentAmount",
    "generalPaymentAmount",
    "naverMileagePaymentAmount",
    "orderDate",
    "orderDiscountAmount",
    "orderID",
    "ordererID",
    "ordererName",
    "ordererTel1",
    "ordererTel2",
    "paymentDate",
    "paymentDueDate",
    "paymentMeans",
    "isDeliveryMemoParticularInput",
    "payLocationType",
    "ordererNO",
    "payLaterPaymentAmount",
    "any"
})
public class Order {

    @XmlElement(name = "ChargeAmountPaymentAmount")
    protected Integer chargeAmountPaymentAmount;
    @XmlElement(name = "CheckoutAccumulationPaymentAmount")
    protected Integer checkoutAccumulationPaymentAmount;
    @XmlElement(name = "GeneralPaymentAmount")
    protected Integer generalPaymentAmount;
    @XmlElement(name = "NaverMileagePaymentAmount")
    protected Integer naverMileagePaymentAmount;
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderDiscountAmount")
    protected Integer orderDiscountAmount;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "OrdererID")
    protected String ordererID;
    @XmlElement(name = "OrdererName")
    protected String ordererName;
    @XmlElement(name = "OrdererTel1")
    protected String ordererTel1;
    @XmlElement(name = "OrdererTel2")
    protected String ordererTel2;
    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PaymentDueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDueDate;
    @XmlElement(name = "PaymentMeans")
    protected String paymentMeans;
    @XmlElement(name = "IsDeliveryMemoParticularInput")
    protected String isDeliveryMemoParticularInput;
    @XmlElement(name = "PayLocationType")
    protected String payLocationType;
    @XmlElement(name = "OrdererNO")
    protected String ordererNO;
    @XmlElement(name = "PayLaterPaymentAmount")
    protected Integer payLaterPaymentAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * chargeAmountPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeAmountPaymentAmount() {
        return chargeAmountPaymentAmount;
    }

    /**
     * chargeAmountPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeAmountPaymentAmount(Integer value) {
        this.chargeAmountPaymentAmount = value;
    }

    /**
     * checkoutAccumulationPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckoutAccumulationPaymentAmount() {
        return checkoutAccumulationPaymentAmount;
    }

    /**
     * checkoutAccumulationPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckoutAccumulationPaymentAmount(Integer value) {
        this.checkoutAccumulationPaymentAmount = value;
    }

    /**
     * generalPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeneralPaymentAmount() {
        return generalPaymentAmount;
    }

    /**
     * generalPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeneralPaymentAmount(Integer value) {
        this.generalPaymentAmount = value;
    }

    /**
     * naverMileagePaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNaverMileagePaymentAmount() {
        return naverMileagePaymentAmount;
    }

    /**
     * naverMileagePaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNaverMileagePaymentAmount(Integer value) {
        this.naverMileagePaymentAmount = value;
    }

    /**
     * orderDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * orderDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * orderDiscountAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    /**
     * orderDiscountAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderDiscountAmount(Integer value) {
        this.orderDiscountAmount = value;
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
     * ordererID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererID() {
        return ordererID;
    }

    /**
     * ordererID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererID(String value) {
        this.ordererID = value;
    }

    /**
     * ordererName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererName() {
        return ordererName;
    }

    /**
     * ordererName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererName(String value) {
        this.ordererName = value;
    }

    /**
     * ordererTel1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererTel1() {
        return ordererTel1;
    }

    /**
     * ordererTel1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererTel1(String value) {
        this.ordererTel1 = value;
    }

    /**
     * ordererTel2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererTel2() {
        return ordererTel2;
    }

    /**
     * ordererTel2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererTel2(String value) {
        this.ordererTel2 = value;
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
     * paymentDueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * paymentDueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDueDate(XMLGregorianCalendar value) {
        this.paymentDueDate = value;
    }

    /**
     * paymentMeans 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * paymentMeans 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeans(String value) {
        this.paymentMeans = value;
    }

    /**
     * isDeliveryMemoParticularInput 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDeliveryMemoParticularInput() {
        return isDeliveryMemoParticularInput;
    }

    /**
     * isDeliveryMemoParticularInput 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDeliveryMemoParticularInput(String value) {
        this.isDeliveryMemoParticularInput = value;
    }

    /**
     * payLocationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayLocationType() {
        return payLocationType;
    }

    /**
     * payLocationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayLocationType(String value) {
        this.payLocationType = value;
    }

    /**
     * ordererNO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererNO() {
        return ordererNO;
    }

    /**
     * ordererNO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererNO(String value) {
        this.ordererNO = value;
    }

    /**
     * payLaterPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayLaterPaymentAmount() {
        return payLaterPaymentAmount;
    }

    /**
     * payLaterPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayLaterPaymentAmount(Integer value) {
        this.payLaterPaymentAmount = value;
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
