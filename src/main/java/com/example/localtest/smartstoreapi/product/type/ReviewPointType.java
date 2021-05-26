
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReviewPointType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReviewPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseReviewPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PremiumReviewPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AfterUseTextReviewPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AfterUsePhotoVideoReviewPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegularCustomerPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewPointType", propOrder = {
    "purchaseReviewPoint",
    "premiumReviewPoint",
    "afterUseTextReviewPoint",
    "afterUsePhotoVideoReviewPoint",
    "regularCustomerPoint",
    "startDate",
    "endDate"
})
public class ReviewPointType {

    @XmlElement(name = "PurchaseReviewPoint")
    protected Integer purchaseReviewPoint;
    @XmlElement(name = "PremiumReviewPoint")
    protected Integer premiumReviewPoint;
    @XmlElement(name = "AfterUseTextReviewPoint")
    protected Integer afterUseTextReviewPoint;
    @XmlElement(name = "AfterUsePhotoVideoReviewPoint")
    protected Integer afterUsePhotoVideoReviewPoint;
    @XmlElement(name = "RegularCustomerPoint")
    protected Integer regularCustomerPoint;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;

    /**
     * purchaseReviewPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseReviewPoint() {
        return purchaseReviewPoint;
    }

    /**
     * purchaseReviewPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseReviewPoint(Integer value) {
        this.purchaseReviewPoint = value;
    }

    /**
     * premiumReviewPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremiumReviewPoint() {
        return premiumReviewPoint;
    }

    /**
     * premiumReviewPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremiumReviewPoint(Integer value) {
        this.premiumReviewPoint = value;
    }

    /**
     * afterUseTextReviewPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAfterUseTextReviewPoint() {
        return afterUseTextReviewPoint;
    }

    /**
     * afterUseTextReviewPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAfterUseTextReviewPoint(Integer value) {
        this.afterUseTextReviewPoint = value;
    }

    /**
     * afterUsePhotoVideoReviewPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAfterUsePhotoVideoReviewPoint() {
        return afterUsePhotoVideoReviewPoint;
    }

    /**
     * afterUsePhotoVideoReviewPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAfterUsePhotoVideoReviewPoint(Integer value) {
        this.afterUsePhotoVideoReviewPoint = value;
    }

    /**
     * regularCustomerPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegularCustomerPoint() {
        return regularCustomerPoint;
    }

    /**
     * regularCustomerPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegularCustomerPoint(Integer value) {
        this.regularCustomerPoint = value;
    }

    /**
     * startDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * startDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * endDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * endDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
