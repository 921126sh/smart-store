
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CombinationOptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CombinationOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Names" type="{http://shopn.platform.nhncorp.com/}CombinationOptionNamesType" minOccurs="0"/>
 *         &lt;element name="ItemList" type="{http://shopn.platform.nhncorp.com/}CombinationOptionItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinationOptionType", propOrder = {
    "names",
    "itemList"
})
public class CombinationOptionType {

    @XmlElement(name = "Names")
    protected CombinationOptionNamesType names;
    @XmlElement(name = "ItemList")
    protected CombinationOptionItemListType itemList;

    /**
     * names 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CombinationOptionNamesType }
     *     
     */
    public CombinationOptionNamesType getNames() {
        return names;
    }

    /**
     * names 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationOptionNamesType }
     *     
     */
    public void setNames(CombinationOptionNamesType value) {
        this.names = value;
    }

    /**
     * itemList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CombinationOptionItemListType }
     *     
     */
    public CombinationOptionItemListType getItemList() {
        return itemList;
    }

    /**
     * itemList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationOptionItemListType }
     *     
     */
    public void setItemList(CombinationOptionItemListType value) {
        this.itemList = value;
    }

}
