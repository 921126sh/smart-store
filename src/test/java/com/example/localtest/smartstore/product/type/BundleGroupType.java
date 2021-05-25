
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BundleGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BundleGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryFeeByArea" type="{http://shopn.platform.nhncorp.com/}DeliveryFeeByAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleGroupType", propOrder = {
    "id",
    "name",
    "available",
    "base",
    "calculationMethod",
    "deliveryFeeByArea"
})
public class BundleGroupType {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Available", required = true)
    protected String available;
    @XmlElement(name = "Base", required = true)
    protected String base;
    @XmlElement(name = "CalculationMethod", required = true)
    protected String calculationMethod;
    @XmlElement(name = "DeliveryFeeByArea")
    protected DeliveryFeeByAreaType deliveryFeeByArea;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * available 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailable() {
        return available;
    }

    /**
     * available 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailable(String value) {
        this.available = value;
    }

    /**
     * base 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * base 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * calculationMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * calculationMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationMethod(String value) {
        this.calculationMethod = value;
    }

    /**
     * deliveryFeeByArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFeeByAreaType }
     *     
     */
    public DeliveryFeeByAreaType getDeliveryFeeByArea() {
        return deliveryFeeByArea;
    }

    /**
     * deliveryFeeByArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFeeByAreaType }
     *     
     */
    public void setDeliveryFeeByArea(DeliveryFeeByAreaType value) {
        this.deliveryFeeByArea = value;
    }

}
