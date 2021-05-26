
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAttributeValueListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetAttributeValueListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="AttributeValueList" type="{http://shopn.platform.nhncorp.com/}AttributeValueListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributeValueListResponseType", propOrder = {
    "attributeValueList"
})
public class GetAttributeValueListResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "AttributeValueList", namespace = "")
    protected AttributeValueListType attributeValueList;

    /**
     * attributeValueList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueListType }
     *     
     */
    public AttributeValueListType getAttributeValueList() {
        return attributeValueList;
    }

    /**
     * attributeValueList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueListType }
     *     
     */
    public void setAttributeValueList(AttributeValueListType value) {
        this.attributeValueList = value;
    }

}
