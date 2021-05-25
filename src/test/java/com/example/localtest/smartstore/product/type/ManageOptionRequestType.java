
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManageOptionRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManageOptionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Option" type="{http://shopn.platform.nhncorp.com/}OptionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageOptionRequestType", propOrder = {
    "sellerId",
    "option"
})
public class ManageOptionRequestType
    extends BaseProductRequestType
{

    @XmlElement(name = "SellerId", namespace = "", required = true)
    protected String sellerId;
    @XmlElement(name = "Option", namespace = "", required = true)
    protected OptionType option;

    /**
     * sellerId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * sellerId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * option 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OptionType }
     *     
     */
    public OptionType getOption() {
        return option;
    }

    /**
     * option 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType }
     *     
     */
    public void setOption(OptionType value) {
        this.option = value;
    }

}
