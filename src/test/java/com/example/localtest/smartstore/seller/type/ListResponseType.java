
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutResponseType">
 *       &lt;sequence>
 *         &lt;element name="ReturnedDataCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasMoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MoreDataTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ListResponseType", propOrder = {
    "returnedDataCount",
    "hasMoreData",
    "moreDataTimeFrom",
    "inquiryExtraData"
})
@XmlSeeAlso({
    GetChangedProductOrderListResponse.class,
    GetProductOrderInfoListResponse.class
})
public class ListResponseType
    extends BaseCheckoutResponseType
{

    @XmlElement(name = "ReturnedDataCount")
    protected Integer returnedDataCount;
    @XmlElement(name = "HasMoreData")
    protected Boolean hasMoreData;
    @XmlElement(name = "MoreDataTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moreDataTimeFrom;
    @XmlElement(name = "InquiryExtraData")
    protected String inquiryExtraData;

    /**
     * returnedDataCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedDataCount() {
        return returnedDataCount;
    }

    /**
     * returnedDataCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedDataCount(Integer value) {
        this.returnedDataCount = value;
    }

    /**
     * hasMoreData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreData() {
        return hasMoreData;
    }

    /**
     * hasMoreData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreData(Boolean value) {
        this.hasMoreData = value;
    }

    /**
     * moreDataTimeFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoreDataTimeFrom() {
        return moreDataTimeFrom;
    }

    /**
     * moreDataTimeFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoreDataTimeFrom(XMLGregorianCalendar value) {
        this.moreDataTimeFrom = value;
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
