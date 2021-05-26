
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManageHopeDeliveryGroupResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManageHopeDeliveryGroupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="HopeDeliveryGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageHopeDeliveryGroupResponseType", propOrder = {
    "hopeDeliveryGroupId"
})
public class ManageHopeDeliveryGroupResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "HopeDeliveryGroupId", namespace = "")
    protected Long hopeDeliveryGroupId;

    /**
     * hopeDeliveryGroupId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHopeDeliveryGroupId() {
        return hopeDeliveryGroupId;
    }

    /**
     * hopeDeliveryGroupId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHopeDeliveryGroupId(Long value) {
        this.hopeDeliveryGroupId = value;
    }

}
