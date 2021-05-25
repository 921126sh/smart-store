
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GalleryProductMappingType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GalleryProductMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PriorityExposure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryProductMappingType", propOrder = {
    "productId",
    "priorityExposure"
})
public class GalleryProductMappingType {

    @XmlElement(name = "ProductId")
    protected long productId;
    @XmlElement(name = "PriorityExposure")
    protected String priorityExposure;

    /**
     * productId 속성의 값을 가져옵니다.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * productId 속성의 값을 설정합니다.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * priorityExposure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityExposure() {
        return priorityExposure;
    }

    /**
     * priorityExposure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityExposure(String value) {
        this.priorityExposure = value;
    }

}
