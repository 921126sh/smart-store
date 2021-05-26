
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHopeDeliveryGroupListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetHopeDeliveryGroupListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="HopeDeliveryGroupList" type="{http://shopn.platform.nhncorp.com/}HopeDeliveryGroupListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHopeDeliveryGroupListResponseType", propOrder = {
    "hopeDeliveryGroupList"
})
public class GetHopeDeliveryGroupListResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "HopeDeliveryGroupList", namespace = "")
    protected HopeDeliveryGroupListType hopeDeliveryGroupList;

    /**
     * hopeDeliveryGroupList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HopeDeliveryGroupListType }
     *     
     */
    public HopeDeliveryGroupListType getHopeDeliveryGroupList() {
        return hopeDeliveryGroupList;
    }

    /**
     * hopeDeliveryGroupList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HopeDeliveryGroupListType }
     *     
     */
    public void setHopeDeliveryGroupList(HopeDeliveryGroupListType value) {
        this.hopeDeliveryGroupList = value;
    }

}
