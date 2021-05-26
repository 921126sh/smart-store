
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GalleryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GalleryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GalleryProductMappingList" type="{http://shopn.platform.nhncorp.com/}GalleryProductMappingListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryType", propOrder = {
    "id",
    "name",
    "sortType",
    "galleryProductMappingList"
})
public class GalleryType {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "GalleryProductMappingList", required = true)
    protected GalleryProductMappingListType galleryProductMappingList;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * galleryProductMappingList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GalleryProductMappingListType }
     *     
     */
    public GalleryProductMappingListType getGalleryProductMappingList() {
        return galleryProductMappingList;
    }

    /**
     * galleryProductMappingList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryProductMappingListType }
     *     
     */
    public void setGalleryProductMappingList(GalleryProductMappingListType value) {
        this.galleryProductMappingList = value;
    }

}
