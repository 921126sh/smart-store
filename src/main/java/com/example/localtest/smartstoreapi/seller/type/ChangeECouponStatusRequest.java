
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>changeECouponStatusRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="changeECouponStatusRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ECouponNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ECouponStatus" type="{http://seller.shopn.platform.nhncorp.com/}eCouponStatusType"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeECouponStatusRequest", propOrder = {
    "productOrderID",
    "eCouponNo",
    "eCouponStatus",
    "changeDate"
})
public class ChangeECouponStatusRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "ECouponNo", required = true)
    protected String eCouponNo;
    @XmlElement(name = "ECouponStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ECouponStatusType eCouponStatus;
    @XmlElement(name = "ChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;

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
     * eCouponStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ECouponStatusType }
     *     
     */
    public ECouponStatusType getECouponStatus() {
        return eCouponStatus;
    }

    /**
     * eCouponStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ECouponStatusType }
     *     
     */
    public void setECouponStatus(ECouponStatusType value) {
        this.eCouponStatus = value;
    }

    /**
     * changeDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * changeDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

}
