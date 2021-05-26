
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductAttributeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSeq" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeValueSeq" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeRealValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeRealValueUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAttributeType", propOrder = {
    "attributeSeq",
    "attributeValueSeq",
    "attributeRealValue",
    "attributeRealValueUnitCode"
})
public class ProductAttributeType {

    @XmlElement(name = "AttributeSeq")
    protected long attributeSeq;
    @XmlElement(name = "AttributeValueSeq")
    protected long attributeValueSeq;
    @XmlElement(name = "AttributeRealValue")
    protected String attributeRealValue;
    @XmlElement(name = "AttributeRealValueUnitCode")
    protected String attributeRealValueUnitCode;

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
     * attributeRealValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeRealValue() {
        return attributeRealValue;
    }

    /**
     * attributeRealValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeRealValue(String value) {
        this.attributeRealValue = value;
    }

    /**
     * attributeRealValueUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeRealValueUnitCode() {
        return attributeRealValueUnitCode;
    }

    /**
     * attributeRealValueUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeRealValueUnitCode(String value) {
        this.attributeRealValueUnitCode = value;
    }

}
