
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DigitalContentsSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DigitalContentsSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TermsOfUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UsePeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Requirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CancelationPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalContentsSummaryType", propOrder = {
    "producer",
    "termsOfUse",
    "usePeriod",
    "medium",
    "requirement",
    "cancelationPolicy",
    "customerServicePhoneNumber"
})
public class DigitalContentsSummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "Producer", required = true)
    protected String producer;
    @XmlElement(name = "TermsOfUse", required = true)
    protected String termsOfUse;
    @XmlElement(name = "UsePeriod", required = true)
    protected String usePeriod;
    @XmlElement(name = "Medium", required = true)
    protected String medium;
    @XmlElement(name = "Requirement", required = true)
    protected String requirement;
    @XmlElement(name = "CancelationPolicy", required = true)
    protected String cancelationPolicy;
    @XmlElement(name = "CustomerServicePhoneNumber", required = true)
    protected String customerServicePhoneNumber;

    /**
     * producer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * producer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * termsOfUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * termsOfUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfUse(String value) {
        this.termsOfUse = value;
    }

    /**
     * usePeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePeriod() {
        return usePeriod;
    }

    /**
     * usePeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePeriod(String value) {
        this.usePeriod = value;
    }

    /**
     * medium 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedium() {
        return medium;
    }

    /**
     * medium 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * requirement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * requirement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirement(String value) {
        this.requirement = value;
    }

    /**
     * cancelationPolicy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelationPolicy() {
        return cancelationPolicy;
    }

    /**
     * cancelationPolicy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelationPolicy(String value) {
        this.cancelationPolicy = value;
    }

    /**
     * customerServicePhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * customerServicePhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

}
