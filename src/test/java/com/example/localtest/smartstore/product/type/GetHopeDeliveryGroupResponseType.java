
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHopeDeliveryGroupResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetHopeDeliveryGroupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="HopeDeliveryGroup" type="{http://shopn.platform.nhncorp.com/}HopeDeliveryGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHopeDeliveryGroupResponseType", propOrder = {
    "hopeDeliveryGroup"
})
public class GetHopeDeliveryGroupResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "HopeDeliveryGroup", namespace = "")
    protected HopeDeliveryGroupType hopeDeliveryGroup;

    /**
     * hopeDeliveryGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HopeDeliveryGroupType }
     *     
     */
    public HopeDeliveryGroupType getHopeDeliveryGroup() {
        return hopeDeliveryGroup;
    }

    /**
     * hopeDeliveryGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HopeDeliveryGroupType }
     *     
     */
    public void setHopeDeliveryGroup(HopeDeliveryGroupType value) {
        this.hopeDeliveryGroup = value;
    }

}
