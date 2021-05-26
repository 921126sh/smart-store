
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.*;


/**
 * <p>BaseResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Error" type="{http://shopn.platform.nhncorp.com/}ErrorType" minOccurs="0"/>
 *         &lt;element name="WarningList" type="{http://shopn.platform.nhncorp.com/}WarningListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseType", propOrder = {
    "requestID",
    "responseType",
    "responseTime",
    "error",
    "warningList"
})
@XmlSeeAlso({
    BaseProductResponseType.class
})
public abstract class BaseResponseType {

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "ResponseType", required = true)
    protected String responseType;
    @XmlElement(name = "ResponseTime")
    protected long responseTime;
    @XmlElement(name = "Error")
    protected ErrorType error;
    @XmlElement(name = "WarningList")
    protected WarningListType warningList;

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
     * responseType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * responseType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * responseTime 속성의 값을 가져옵니다.
     * 
     */
    public long getResponseTime() {
        return responseTime;
    }

    /**
     * responseTime 속성의 값을 설정합니다.
     * 
     */
    public void setResponseTime(long value) {
        this.responseTime = value;
    }

    /**
     * error 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * error 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

    /**
     * warningList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WarningListType }
     *     
     */
    public WarningListType getWarningList() {
        return warningList;
    }

    /**
     * warningList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningListType }
     *     
     */
    public void setWarningList(WarningListType value) {
        this.warningList = value;
    }

}
