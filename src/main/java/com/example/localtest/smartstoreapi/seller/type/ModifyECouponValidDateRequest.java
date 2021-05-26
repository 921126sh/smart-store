
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>modifyECouponValidDateRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="modifyECouponValidDateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECouponNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ValidEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyECouponValidDateRequest", propOrder = {
    "productOrderID",
    "orderNo",
    "eCouponNo",
    "validStartDate",
    "validEndDate"
})
public class ModifyECouponValidDateRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID")
    protected String productOrderID;
    @XmlElement(name = "OrderNo")
    protected String orderNo;
    @XmlElement(name = "ECouponNo", required = true)
    protected String eCouponNo;
    @XmlElement(name = "ValidStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validStartDate;
    @XmlElement(name = "ValidEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validEndDate;

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
     * orderNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * orderNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * eCouponNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECouponNo() {
        return eCouponNo;
    }

    /**
     * eCouponNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECouponNo(String value) {
        this.eCouponNo = value;
    }

    /**
     * validStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidStartDate() {
        return validStartDate;
    }

    /**
     * validStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidStartDate(XMLGregorianCalendar value) {
        this.validStartDate = value;
    }

    /**
     * validEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidEndDate() {
        return validEndDate;
    }

    /**
     * validEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidEndDate(XMLGregorianCalendar value) {
        this.validEndDate = value;
    }

}
