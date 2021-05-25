
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ListRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="InquiryTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InquiryTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InquiryExtraData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRequestType", propOrder = {
    "inquiryTimeFrom",
    "inquiryTimeTo",
    "inquiryExtraData"
})
@XmlSeeAlso({
    GetChangedProductOrderListRequest.class
})
public class ListRequestType
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "InquiryTimeFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inquiryTimeFrom;
    @XmlElement(name = "InquiryTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inquiryTimeTo;
    @XmlElement(name = "InquiryExtraData")
    protected String inquiryExtraData;

    /**
     * inquiryTimeFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInquiryTimeFrom() {
        return inquiryTimeFrom;
    }

    /**
     * inquiryTimeFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInquiryTimeFrom(XMLGregorianCalendar value) {
        this.inquiryTimeFrom = value;
    }

    /**
     * inquiryTimeTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInquiryTimeTo() {
        return inquiryTimeTo;
    }

    /**
     * inquiryTimeTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInquiryTimeTo(XMLGregorianCalendar value) {
        this.inquiryTimeTo = value;
    }

    /**
     * inquiryExtraData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryExtraData() {
        return inquiryExtraData;
    }

    /**
     * inquiryExtraData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryExtraData(String value) {
        this.inquiryExtraData = value;
    }

}
