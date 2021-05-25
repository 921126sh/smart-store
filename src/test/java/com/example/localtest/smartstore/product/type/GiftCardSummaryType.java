
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GiftCardSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GiftCardSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TermsOfUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UseStorePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseStoreAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UseStoreUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GiftCardSummaryType", propOrder = {
    "issuer",
    "periodStartDate",
    "periodEndDate",
    "periodDays",
    "termsOfUse",
    "useStorePlace",
    "useStoreAddressId",
    "useStoreUrl",
    "refundPolicy",
    "customerServicePhoneNumber"
})
public class GiftCardSummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "Issuer", required = true)
    protected String issuer;
    @XmlElement(name = "PeriodStartDate")
    protected String periodStartDate;
    @XmlElement(name = "PeriodEndDate")
    protected String periodEndDate;
    @XmlElement(name = "PeriodDays")
    protected Integer periodDays;
    @XmlElement(name = "TermsOfUse", required = true)
    protected String termsOfUse;
    @XmlElement(name = "UseStorePlace")
    protected String useStorePlace;
    @XmlElement(name = "UseStoreAddressId")
    protected Long useStoreAddressId;
    @XmlElement(name = "UseStoreUrl")
    protected String useStoreUrl;
    @XmlElement(name = "RefundPolicy", required = true)
    protected String refundPolicy;
    @XmlElement(name = "CustomerServicePhoneNumber", required = true)
    protected String customerServicePhoneNumber;

    /**
     * issuer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * issuer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * periodStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodStartDate() {
        return periodStartDate;
    }

    /**
     * periodStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodStartDate(String value) {
        this.periodStartDate = value;
    }

    /**
     * periodEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodEndDate() {
        return periodEndDate;
    }

    /**
     * periodEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodEndDate(String value) {
        this.periodEndDate = value;
    }

    /**
     * periodDays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodDays() {
        return periodDays;
    }

    /**
     * periodDays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodDays(Integer value) {
        this.periodDays = value;
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
     * useStorePlace 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStorePlace() {
        return useStorePlace;
    }

    /**
     * useStorePlace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStorePlace(String value) {
        this.useStorePlace = value;
    }

    /**
     * useStoreAddressId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseStoreAddressId() {
        return useStoreAddressId;
    }

    /**
     * useStoreAddressId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseStoreAddressId(Long value) {
        this.useStoreAddressId = value;
    }

    /**
     * useStoreUrl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStoreUrl() {
        return useStoreUrl;
    }

    /**
     * useStoreUrl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStoreUrl(String value) {
        this.useStoreUrl = value;
    }

    /**
     * refundPolicy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundPolicy() {
        return refundPolicy;
    }

    /**
     * refundPolicy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundPolicy(String value) {
        this.refundPolicy = value;
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
