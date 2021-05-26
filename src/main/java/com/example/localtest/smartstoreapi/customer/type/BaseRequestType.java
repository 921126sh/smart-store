
package com.example.localtest.smartstoreapi.customer.type;

import javax.xml.bind.annotation.*;


/**
 * <p>BaseRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessCredentials" type="{http://customerinquiry.shopn.platform.nhncorp.com/}AccessCredentialsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", propOrder = {
    "requestID",
    "accessCredentials"
})
@XmlSeeAlso({
    BaseCheckoutRequestType.class
})
public abstract class BaseRequestType {

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "AccessCredentials", required = true)
    protected AccessCredentialsType accessCredentials;

    /**
     * requestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * requestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * accessCredentials 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AccessCredentialsType }
     *     
     */
    public AccessCredentialsType getAccessCredentials() {
        return accessCredentials;
    }

    /**
     * accessCredentials 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessCredentialsType }
     *     
     */
    public void setAccessCredentials(AccessCredentialsType value) {
        this.accessCredentials = value;
    }

}
