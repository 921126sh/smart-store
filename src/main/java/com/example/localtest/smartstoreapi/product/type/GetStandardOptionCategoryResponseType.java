
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetStandardOptionCategoryResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetStandardOptionCategoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="StandardOptionCategory" type="{http://shopn.platform.nhncorp.com/}StandardOptionCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStandardOptionCategoryResponseType", propOrder = {
    "standardOptionCategory"
})
public class GetStandardOptionCategoryResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "StandardOptionCategory", namespace = "")
    protected StandardOptionCategoryType standardOptionCategory;

    /**
     * standardOptionCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionCategoryType }
     *     
     */
    public StandardOptionCategoryType getStandardOptionCategory() {
        return standardOptionCategory;
    }

    /**
     * standardOptionCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionCategoryType }
     *     
     */
    public void setStandardOptionCategory(StandardOptionCategoryType value) {
        this.standardOptionCategory = value;
    }

}
