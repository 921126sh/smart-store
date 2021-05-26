
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SimpleList" type="{http://shopn.platform.nhncorp.com/}SimpleOptionItemListType" minOccurs="0"/>
 *         &lt;element name="CustomList" type="{http://shopn.platform.nhncorp.com/}CustomOptionItemListType" minOccurs="0"/>
 *         &lt;element name="Combination" type="{http://shopn.platform.nhncorp.com/}CombinationOptionType" minOccurs="0"/>
 *         &lt;element name="DeliveryAttribute" type="{http://shopn.platform.nhncorp.com/}OptionDeliveryAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionType", propOrder = {
    "productId",
    "sortType",
    "simpleList",
    "customList",
    "combination",
    "deliveryAttribute"
})
public class OptionType {

    @XmlElement(name = "ProductId")
    protected long productId;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "SimpleList")
    protected SimpleOptionItemListType simpleList;
    @XmlElement(name = "CustomList")
    protected CustomOptionItemListType customList;
    @XmlElement(name = "Combination")
    protected CombinationOptionType combination;
    @XmlElement(name = "DeliveryAttribute")
    protected OptionDeliveryAttributeType deliveryAttribute;

    /**
     * productId 속성의 값을 가져옵니다.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * productId 속성의 값을 설정합니다.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * sortType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * sortType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
    }

    /**
     * simpleList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SimpleOptionItemListType }
     *     
     */
    public SimpleOptionItemListType getSimpleList() {
        return simpleList;
    }

    /**
     * simpleList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleOptionItemListType }
     *     
     */
    public void setSimpleList(SimpleOptionItemListType value) {
        this.simpleList = value;
    }

    /**
     * customList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomOptionItemListType }
     *     
     */
    public CustomOptionItemListType getCustomList() {
        return customList;
    }

    /**
     * customList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomOptionItemListType }
     *     
     */
    public void setCustomList(CustomOptionItemListType value) {
        this.customList = value;
    }

    /**
     * combination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CombinationOptionType }
     *     
     */
    public CombinationOptionType getCombination() {
        return combination;
    }

    /**
     * combination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationOptionType }
     *     
     */
    public void setCombination(CombinationOptionType value) {
        this.combination = value;
    }

    /**
     * deliveryAttribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OptionDeliveryAttributeType }
     *     
     */
    public OptionDeliveryAttributeType getDeliveryAttribute() {
        return deliveryAttribute;
    }

    /**
     * deliveryAttribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDeliveryAttributeType }
     *     
     */
    public void setDeliveryAttribute(OptionDeliveryAttributeType value) {
        this.deliveryAttribute = value;
    }

}
