
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardOptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UseStockManagement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StandardOptionGroupList" type="{http://shopn.platform.nhncorp.com/}StandardOptionGroupListType" minOccurs="0"/>
 *         &lt;element name="StandardOptionItemList" type="{http://shopn.platform.nhncorp.com/}StandardOptionItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionType", propOrder = {
    "productId",
    "categoryId",
    "useStockManagement",
    "standardOptionGroupList",
    "standardOptionItemList"
})
public class StandardOptionType {

    @XmlElement(name = "ProductId")
    protected long productId;
    @XmlElement(name = "CategoryId")
    protected Long categoryId;
    @XmlElement(name = "UseStockManagement", required = true)
    protected String useStockManagement;
    @XmlElement(name = "StandardOptionGroupList")
    protected StandardOptionGroupListType standardOptionGroupList;
    @XmlElement(name = "StandardOptionItemList")
    protected StandardOptionItemListType standardOptionItemList;

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
     * categoryId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * categoryId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryId(Long value) {
        this.categoryId = value;
    }

    /**
     * useStockManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStockManagement() {
        return useStockManagement;
    }

    /**
     * useStockManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStockManagement(String value) {
        this.useStockManagement = value;
    }

    /**
     * standardOptionGroupList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionGroupListType }
     *     
     */
    public StandardOptionGroupListType getStandardOptionGroupList() {
        return standardOptionGroupList;
    }

    /**
     * standardOptionGroupList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionGroupListType }
     *     
     */
    public void setStandardOptionGroupList(StandardOptionGroupListType value) {
        this.standardOptionGroupList = value;
    }

    /**
     * standardOptionItemList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionItemListType }
     *     
     */
    public StandardOptionItemListType getStandardOptionItemList() {
        return standardOptionItemList;
    }

    /**
     * standardOptionItemList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionItemListType }
     *     
     */
    public void setStandardOptionItemList(StandardOptionItemListType value) {
        this.standardOptionItemList = value;
    }

}
