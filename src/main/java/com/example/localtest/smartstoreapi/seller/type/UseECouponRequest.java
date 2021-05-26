
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>useECouponRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="useECouponRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ECouponNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "useECouponRequest", propOrder = {
    "orderNo",
    "eCouponNo",
    "useDate"
})
public class UseECouponRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "OrderNo", required = true)
    protected String orderNo;
    @XmlElement(name = "ECouponNo", required = true)
    protected String eCouponNo;
    @XmlElement(name = "UseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useDate;

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
     * useDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseDate() {
        return useDate;
    }

    /**
     * useDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseDate(XMLGregorianCalendar value) {
        this.useDate = value;
    }

}
