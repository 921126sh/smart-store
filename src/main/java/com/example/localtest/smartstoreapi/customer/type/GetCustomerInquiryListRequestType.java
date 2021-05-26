
package com.example.localtest.smartstoreapi.customer.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GetCustomerInquiryListRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerInquiryListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customerinquiry.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InquiryTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InquiryTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsAnswered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerInquiryListRequestType", propOrder = {
    "serviceType",
    "mallID",
    "inquiryTimeFrom",
    "inquiryTimeTo",
    "isAnswered"
})
public class GetCustomerInquiryListRequestType
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ServiceType", namespace = "")
    protected String serviceType;
    @XmlElement(name = "MallID", namespace = "")
    protected String mallID;
    @XmlElement(name = "InquiryTimeFrom", namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inquiryTimeFrom;
    @XmlElement(name = "InquiryTimeTo", namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inquiryTimeTo;
    @XmlElement(name = "IsAnswered", namespace = "")
    protected Boolean isAnswered;

    /**
     * serviceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * serviceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * mallID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMallID() {
        return mallID;
    }

    /**
     * mallID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMallID(String value) {
        this.mallID = value;
    }

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
     * isAnswered 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAnswered() {
        return isAnswered;
    }

    /**
     * isAnswered 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAnswered(Boolean value) {
        this.isAnswered = value;
    }

}
