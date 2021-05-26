
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetStandardOptionResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetStandardOptionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="StandardOption" type="{http://shopn.platform.nhncorp.com/}StandardOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStandardOptionResponseType", propOrder = {
    "standardOption"
})
public class GetStandardOptionResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "StandardOption", namespace = "")
    protected StandardOptionType standardOption;

    /**
     * standardOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionType }
     *     
     */
    public StandardOptionType getStandardOption() {
        return standardOption;
    }

    /**
     * standardOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionType }
     *     
     */
    public void setStandardOption(StandardOptionType value) {
        this.standardOption = value;
    }

}
