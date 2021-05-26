
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ApplyGalleryRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ApplyGalleryRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GalleryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProductIdList" type="{http://shopn.platform.nhncorp.com/}ProductIdListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyGalleryRequestType", propOrder = {
    "sellerId",
    "galleryId",
    "productIdList"
})
public class ApplyGalleryRequestType
    extends BaseProductRequestType
{

    @XmlElement(name = "SellerId", namespace = "", required = true)
    protected String sellerId;
    @XmlElement(name = "GalleryId", namespace = "")
    protected Long galleryId;
    @XmlElement(name = "ProductIdList", namespace = "", required = true)
    protected ProductIdListType productIdList;

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
     * galleryId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGalleryId() {
        return galleryId;
    }

    /**
     * galleryId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGalleryId(Long value) {
        this.galleryId = value;
    }

    /**
     * productIdList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdListType }
     *     
     */
    public ProductIdListType getProductIdList() {
        return productIdList;
    }

    /**
     * productIdList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdListType }
     *     
     */
    public void setProductIdList(ProductIdListType value) {
        this.productIdList = value;
    }

}
