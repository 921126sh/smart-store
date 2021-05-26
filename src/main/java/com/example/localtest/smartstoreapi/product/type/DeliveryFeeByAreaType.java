
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryFeeByAreaType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DeliveryFeeByAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Area2ExtraFee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Area3ExtraFee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryFeeByAreaType", propOrder = {
    "areaType",
    "area2ExtraFee",
    "area3ExtraFee"
})
public class DeliveryFeeByAreaType {

    @XmlElement(name = "AreaType", required = true)
    protected String areaType;
    @XmlElement(name = "Area2ExtraFee")
    protected int area2ExtraFee;
    @XmlElement(name = "Area3ExtraFee")
    protected Integer area3ExtraFee;

    /**
     * areaType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * areaType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaType(String value) {
        this.areaType = value;
    }

    /**
     * area2ExtraFee 속성의 값을 가져옵니다.
     * 
     */
    public int getArea2ExtraFee() {
        return area2ExtraFee;
    }

    /**
     * area2ExtraFee 속성의 값을 설정합니다.
     * 
     */
    public void setArea2ExtraFee(int value) {
        this.area2ExtraFee = value;
    }

    /**
     * area3ExtraFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea3ExtraFee() {
        return area3ExtraFee;
    }

    /**
     * area3ExtraFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea3ExtraFee(Integer value) {
        this.area3ExtraFee = value;
    }

}
