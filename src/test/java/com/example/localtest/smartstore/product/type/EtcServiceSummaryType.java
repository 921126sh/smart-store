
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EtcServiceSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EtcServiceSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="ServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CertificateDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UsableCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CancelationStandard" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "EtcServiceSummaryType", propOrder = {
    "serviceProvider",
    "certificateDetails",
    "usableCondition",
    "cancelationStandard",
    "cancelationPolicy",
    "customerServicePhoneNumber"
})
public class EtcServiceSummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "ServiceProvider", required = true)
    protected String serviceProvider;
    @XmlElement(name = "CertificateDetails", required = true)
    protected String certificateDetails;
    @XmlElement(name = "UsableCondition", required = true)
    protected String usableCondition;
    @XmlElement(name = "CancelationStandard", required = true)
    protected String cancelationStandard;
    @XmlElement(name = "CancelationPolicy", required = true)
    protected String cancelationPolicy;
    @XmlElement(name = "CustomerServicePhoneNumber", required = true)
    protected String customerServicePhoneNumber;

    /**
     * serviceProvider 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * serviceProvider 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * certificateDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDetails() {
        return certificateDetails;
    }

    /**
     * certificateDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDetails(String value) {
        this.certificateDetails = value;
    }

    /**
     * usableCondition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsableCondition() {
        return usableCondition;
    }

    /**
     * usableCondition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsableCondition(String value) {
        this.usableCondition = value;
    }

    /**
     * cancelationStandard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelationStandard() {
        return cancelationStandard;
    }

    /**
     * cancelationStandard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelationStandard(String value) {
        this.cancelationStandard = value;
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
