
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManageSupplementProductRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManageSupplementProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SupplementProduct" type="{http://shopn.platform.nhncorp.com/}SupplementProductType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageSupplementProductRequestType", propOrder = {
    "sellerId",
    "supplementProduct"
})
public class ManageSupplementProductRequestType
    extends BaseProductRequestType
{

    @XmlElement(name = "SellerId", namespace = "", required = true)
    protected String sellerId;
    @XmlElement(name = "SupplementProduct", namespace = "", required = true)
    protected SupplementProductType supplementProduct;

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
     * supplementProduct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProductType }
     *     
     */
    public SupplementProductType getSupplementProduct() {
        return supplementProduct;
    }

    /**
     * supplementProduct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProductType }
     *     
     */
    public void setSupplementProduct(SupplementProductType value) {
        this.supplementProduct = value;
    }

}
