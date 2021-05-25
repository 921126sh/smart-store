
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://seller.shopn.platform.nhncorp.com/}ErrorType" minOccurs="0"/>
 *         &lt;element name="WarningList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Warning" type="{http://seller.shopn.platform.nhncorp.com/}WarningType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QuotaStatus" type="{http://seller.shopn.platform.nhncorp.com/}QuotaStatusType" minOccurs="0"/>
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
    "warningList",
    "quotaStatus"
})
@XmlSeeAlso({
    BaseCheckoutResponseType.class
})
public class BaseResponseType {

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "ResponseType", required = true)
    protected String responseType;
    @XmlElement(name = "ResponseTime")
    protected Long responseTime;
    @XmlElement(name = "Error")
    protected ErrorType error;
    @XmlElement(name = "WarningList")
    protected WarningList warningList;
    @XmlElement(name = "QuotaStatus")
    protected QuotaStatusType quotaStatus;

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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseTime() {
        return responseTime;
    }

    /**
     * responseTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseTime(Long value) {
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
     *     {@link WarningList }
     *     
     */
    public WarningList getWarningList() {
        return warningList;
    }

    /**
     * warningList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningList }
     *     
     */
    public void setWarningList(WarningList value) {
        this.warningList = value;
    }

    /**
     * quotaStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QuotaStatusType }
     *     
     */
    public QuotaStatusType getQuotaStatus() {
        return quotaStatus;
    }

    /**
     * quotaStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaStatusType }
     *     
     */
    public void setQuotaStatus(QuotaStatusType value) {
        this.quotaStatus = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Warning" type="{http://seller.shopn.platform.nhncorp.com/}WarningType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "warning"
    })
    public static class WarningList {

        @XmlElement(name = "Warning")
        protected List<WarningType> warning;

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WarningType }
         * 
         * 
         */
        public List<WarningType> getWarning() {
            if (warning == null) {
                warning = new ArrayList<WarningType>();
            }
            return this.warning;
        }

    }

}
