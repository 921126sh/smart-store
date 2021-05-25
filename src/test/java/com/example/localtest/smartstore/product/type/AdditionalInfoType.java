
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdditionalInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Band" type="{http://shopn.platform.nhncorp.com/}BandType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInfoType", propOrder = {
    "band"
})
public class AdditionalInfoType {

    @XmlElement(name = "Band")
    protected BandType band;

    /**
     * band 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BandType }
     *     
     */
    public BandType getBand() {
        return band;
    }

    /**
     * band 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BandType }
     *     
     */
    public void setBand(BandType value) {
        this.band = value;
    }

}
