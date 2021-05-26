
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AttributeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSeq" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeClassificationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeClassificationCodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeTypeCodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitUsable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepresentativeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RealValueUsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeValueMaxMatchingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "attributeSeq",
    "attributeName",
    "attributeClassificationType",
    "attributeClassificationCodeName",
    "attributeType",
    "attributeTypeCodeName",
    "unitUsable",
    "representativeUnitCode",
    "realValueUsable",
    "attributeValueMaxMatchingCount"
})
public class AttributeType {

    @XmlElement(name = "AttributeSeq")
    protected long attributeSeq;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "AttributeClassificationType", required = true)
    protected String attributeClassificationType;
    @XmlElement(name = "AttributeClassificationCodeName", required = true)
    protected String attributeClassificationCodeName;
    @XmlElement(name = "AttributeType", required = true)
    protected String attributeType;
    @XmlElement(name = "AttributeTypeCodeName", required = true)
    protected String attributeTypeCodeName;
    @XmlElement(name = "UnitUsable", required = true)
    protected String unitUsable;
    @XmlElement(name = "RepresentativeUnitCode")
    protected String representativeUnitCode;
    @XmlElement(name = "RealValueUsable")
    protected String realValueUsable;
    @XmlElement(name = "AttributeValueMaxMatchingCount")
    protected Integer attributeValueMaxMatchingCount;

    /**
     * attributeSeq 속성의 값을 가져옵니다.
     * 
     */
    public long getAttributeSeq() {
        return attributeSeq;
    }

    /**
     * attributeSeq 속성의 값을 설정합니다.
     * 
     */
    public void setAttributeSeq(long value) {
        this.attributeSeq = value;
    }

    /**
     * attributeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * attributeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * attributeClassificationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeClassificationType() {
        return attributeClassificationType;
    }

    /**
     * attributeClassificationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeClassificationType(String value) {
        this.attributeClassificationType = value;
    }

    /**
     * attributeClassificationCodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeClassificationCodeName() {
        return attributeClassificationCodeName;
    }

    /**
     * attributeClassificationCodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeClassificationCodeName(String value) {
        this.attributeClassificationCodeName = value;
    }

    /**
     * attributeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * attributeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * attributeTypeCodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeTypeCodeName() {
        return attributeTypeCodeName;
    }

    /**
     * attributeTypeCodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeTypeCodeName(String value) {
        this.attributeTypeCodeName = value;
    }

    /**
     * unitUsable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitUsable() {
        return unitUsable;
    }

    /**
     * unitUsable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitUsable(String value) {
        this.unitUsable = value;
    }

    /**
     * representativeUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeUnitCode() {
        return representativeUnitCode;
    }

    /**
     * representativeUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeUnitCode(String value) {
        this.representativeUnitCode = value;
    }

    /**
     * realValueUsable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealValueUsable() {
        return realValueUsable;
    }

    /**
     * realValueUsable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealValueUsable(String value) {
        this.realValueUsable = value;
    }

    /**
     * attributeValueMaxMatchingCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeValueMaxMatchingCount() {
        return attributeValueMaxMatchingCount;
    }

    /**
     * attributeValueMaxMatchingCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeValueMaxMatchingCount(Integer value) {
        this.attributeValueMaxMatchingCount = value;
    }

}
