
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplementProductType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplementProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemList" type="{http://shopn.platform.nhncorp.com/}SupplementProductItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementProductType", propOrder = {
    "productId",
    "sortType",
    "itemList"
})
public class SupplementProductType {

    @XmlElement(name = "ProductId")
    protected long productId;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "ItemList")
    protected SupplementProductItemListType itemList;

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
     * itemList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProductItemListType }
     *     
     */
    public SupplementProductItemListType getItemList() {
        return itemList;
    }

    /**
     * itemList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProductItemListType }
     *     
     */
    public void setItemList(SupplementProductItemListType value) {
        this.itemList = value;
    }

}
