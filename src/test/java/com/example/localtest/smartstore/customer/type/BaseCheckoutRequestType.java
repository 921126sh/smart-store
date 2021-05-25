
package com.example.localtest.smartstore.customer.type;

import javax.xml.bind.annotation.*;


/**
 * <p>BaseCheckoutRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseCheckoutRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customerinquiry.shopn.platform.nhncorp.com/}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="DetailLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCheckoutRequestType", propOrder = {
    "detailLevel",
    "version"
})
@XmlSeeAlso({
    GetCustomerInquiryListRequestType.class,
    AnswerCustomerInquiryRequestType.class,
    ListRequestType.class
})
public abstract class BaseCheckoutRequestType
    extends BaseRequestType
{

    @XmlElement(name = "DetailLevel")
    protected String detailLevel;
    @XmlElement(name = "Version", required = true)
    protected String version;

    /**
     * detailLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailLevel() {
        return detailLevel;
    }

    /**
     * detailLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailLevel(String value) {
        this.detailLevel = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
