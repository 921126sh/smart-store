
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardOptionCategoryAttributeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionCategoryAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeValueId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeValueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeColorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionCategoryAttributeType", propOrder = {
    "attributeId",
    "attributeValueId",
    "attributeValueName",
    "attributeColorCode",
    "order"
})
public class StandardOptionCategoryAttributeType {

    @XmlElement(name = "AttributeId")
    protected long attributeId;
    @XmlElement(name = "AttributeValueId")
    protected long attributeValueId;
    @XmlElement(name = "AttributeValueName", required = true)
    protected String attributeValueName;
    @XmlElement(name = "AttributeColorCode")
    protected String attributeColorCode;
    @XmlElement(name = "Order")
    protected Long order;

    /**
     * attributeId 속성의 값을 가져옵니다.
     * 
     */
    public long getAttributeId() {
        return attributeId;
    }

    /**
     * attributeId 속성의 값을 설정합니다.
     * 
     */
    public void setAttributeId(long value) {
        this.attributeId = value;
    }

    /**
     * attributeValueId 속성의 값을 가져옵니다.
     * 
     */
    public long getAttributeValueId() {
        return attributeValueId;
    }

    /**
     * attributeValueId 속성의 값을 설정합니다.
     * 
     */
    public void setAttributeValueId(long value) {
        this.attributeValueId = value;
    }

    /**
     * attributeValueName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValueName() {
        return attributeValueName;
    }

    /**
     * attributeValueName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValueName(String value) {
        this.attributeValueName = value;
    }

    /**
     * attributeColorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeColorCode() {
        return attributeColorCode;
    }

    /**
     * attributeColorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeColorCode(String value) {
        this.attributeColorCode = value;
    }

    /**
     * order 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrder() {
        return order;
    }

    /**
     * order 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrder(Long value) {
        this.order = value;
    }

}
