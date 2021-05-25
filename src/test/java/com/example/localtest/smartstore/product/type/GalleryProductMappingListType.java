
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GalleryProductMappingListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GalleryProductMappingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GalleryProductMapping" type="{http://shopn.platform.nhncorp.com/}GalleryProductMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryProductMappingListType", propOrder = {
    "galleryProductMapping"
})
public class GalleryProductMappingListType {

    @XmlElement(name = "GalleryProductMapping")
    protected List<GalleryProductMappingType> galleryProductMapping;

    /**
     * Gets the value of the galleryProductMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the galleryProductMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGalleryProductMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GalleryProductMappingType }
     * 
     * 
     */
    public List<GalleryProductMappingType> getGalleryProductMapping() {
        if (galleryProductMapping == null) {
            galleryProductMapping = new ArrayList<GalleryProductMappingType>();
        }
        return this.galleryProductMapping;
    }

}
