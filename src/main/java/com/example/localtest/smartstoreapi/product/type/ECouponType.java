
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ECouponType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ECouponType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PublicInformationContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactInformationContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UsePlaceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UsePlaceContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RestrictCart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECouponType", propOrder = {
    "periodType",
    "validStartDate",
    "validEndDate",
    "periodDays",
    "publicInformationContents",
    "contactInformationContents",
    "usePlaceType",
    "usePlaceContents",
    "restrictCart"
})
public class ECouponType {

    @XmlElement(name = "PeriodType", required = true)
    protected String periodType;
    @XmlElement(name = "ValidStartDate")
    protected String validStartDate;
    @XmlElement(name = "ValidEndDate")
    protected String validEndDate;
    @XmlElement(name = "PeriodDays")
    protected Integer periodDays;
    @XmlElement(name = "PublicInformationContents", required = true)
    protected String publicInformationContents;
    @XmlElement(name = "ContactInformationContents", required = true)
    protected String contactInformationContents;
    @XmlElement(name = "UsePlaceType", required = true)
    protected String usePlaceType;
    @XmlElement(name = "UsePlaceContents", required = true)
    protected String usePlaceContents;
    @XmlElement(name = "RestrictCart", required = true)
    protected String restrictCart;

    /**
     * periodType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * periodType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodType(String value) {
        this.periodType = value;
    }

    /**
     * validStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidStartDate() {
        return validStartDate;
    }

    /**
     * validStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidStartDate(String value) {
        this.validStartDate = value;
    }

    /**
     * validEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidEndDate() {
        return validEndDate;
    }

    /**
     * validEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidEndDate(String value) {
        this.validEndDate = value;
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
     * publicInformationContents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicInformationContents() {
        return publicInformationContents;
    }

    /**
     * publicInformationContents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicInformationContents(String value) {
        this.publicInformationContents = value;
    }

    /**
     * contactInformationContents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInformationContents() {
        return contactInformationContents;
    }

    /**
     * contactInformationContents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInformationContents(String value) {
        this.contactInformationContents = value;
    }

    /**
     * usePlaceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlaceType() {
        return usePlaceType;
    }

    /**
     * usePlaceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlaceType(String value) {
        this.usePlaceType = value;
    }

    /**
     * usePlaceContents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlaceContents() {
        return usePlaceContents;
    }

    /**
     * usePlaceContents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlaceContents(String value) {
        this.usePlaceContents = value;
    }

    /**
     * restrictCart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictCart() {
        return restrictCart;
    }

    /**
     * restrictCart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictCart(String value) {
        this.restrictCart = value;
    }

}
