
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AttributeValueType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AttributeValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSeq" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeValueSeq" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MinAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAttributeValueUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAttributeValueUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExposureOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeValueType", propOrder = {
    "attributeSeq",
    "attributeValueSeq",
    "minAttributeValue",
    "minAttributeValueUnitCode",
    "maxAttributeValue",
    "maxAttributeValueUnitCode",
    "exposureOrder"
})
public class AttributeValueType {

    @XmlElement(name = "AttributeSeq")
    protected long attributeSeq;
    @XmlElement(name = "AttributeValueSeq")
    protected long attributeValueSeq;
    @XmlElement(name = "MinAttributeValue")
    protected String minAttributeValue;
    @XmlElement(name = "MinAttributeValueUnitCode")
    protected String minAttributeValueUnitCode;
    @XmlElement(name = "MaxAttributeValue")
    protected String maxAttributeValue;
    @XmlElement(name = "MaxAttributeValueUnitCode")
    protected String maxAttributeValueUnitCode;
    @XmlElement(name = "ExposureOrder")
    protected int exposureOrder;

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
     * attributeValueSeq 속성의 값을 가져옵니다.
     * 
     */
    public long getAttributeValueSeq() {
        return attributeValueSeq;
    }

    /**
     * attributeValueSeq 속성의 값을 설정합니다.
     * 
     */
    public void setAttributeValueSeq(long value) {
        this.attributeValueSeq = value;
    }

    /**
     * minAttributeValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAttributeValue() {
        return minAttributeValue;
    }

    /**
     * minAttributeValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAttributeValue(String value) {
        this.minAttributeValue = value;
    }

    /**
     * minAttributeValueUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAttributeValueUnitCode() {
        return minAttributeValueUnitCode;
    }

    /**
     * minAttributeValueUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAttributeValueUnitCode(String value) {
        this.minAttributeValueUnitCode = value;
    }

    /**
     * maxAttributeValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAttributeValue() {
        return maxAttributeValue;
    }

    /**
     * maxAttributeValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAttributeValue(String value) {
        this.maxAttributeValue = value;
    }

    /**
     * maxAttributeValueUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAttributeValueUnitCode() {
        return maxAttributeValueUnitCode;
    }

    /**
     * maxAttributeValueUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAttributeValueUnitCode(String value) {
        this.maxAttributeValueUnitCode = value;
    }

    /**
     * exposureOrder 속성의 값을 가져옵니다.
     * 
     */
    public int getExposureOrder() {
        return exposureOrder;
    }

    /**
     * exposureOrder 속성의 값을 설정합니다.
     * 
     */
    public void setExposureOrder(int value) {
        this.exposureOrder = value;
    }

}
