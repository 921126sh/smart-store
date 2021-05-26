
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImageType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Representative" type="{http://shopn.platform.nhncorp.com/}URLType"/>
 *         &lt;element name="List" type="{http://shopn.platform.nhncorp.com/}URLType" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://shopn.platform.nhncorp.com/}URLType" minOccurs="0"/>
 *         &lt;element name="Vertical" type="{http://shopn.platform.nhncorp.com/}URLType" minOccurs="0"/>
 *         &lt;element name="Gallery" type="{http://shopn.platform.nhncorp.com/}URLType" minOccurs="0"/>
 *         &lt;element name="OptionalList" type="{http://shopn.platform.nhncorp.com/}OptionalListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
    "representative",
    "list",
    "image",
    "vertical",
    "gallery",
    "optionalList"
})
public class ImageType {

    @XmlElement(name = "Representative", required = true)
    protected URLType representative;
    @XmlElement(name = "List")
    protected URLType list;
    @XmlElement(name = "Image")
    protected URLType image;
    @XmlElement(name = "Vertical")
    protected URLType vertical;
    @XmlElement(name = "Gallery")
    protected URLType gallery;
    @XmlElement(name = "OptionalList")
    protected OptionalListType optionalList;

    /**
     * representative 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getRepresentative() {
        return representative;
    }

    /**
     * representative 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setRepresentative(URLType value) {
        this.representative = value;
    }

    /**
     * list 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getList() {
        return list;
    }

    /**
     * list 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setList(URLType value) {
        this.list = value;
    }

    /**
     * image 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getImage() {
        return image;
    }

    /**
     * image 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setImage(URLType value) {
        this.image = value;
    }

    /**
     * vertical 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getVertical() {
        return vertical;
    }

    /**
     * vertical 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setVertical(URLType value) {
        this.vertical = value;
    }

    /**
     * gallery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getGallery() {
        return gallery;
    }

    /**
     * gallery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setGallery(URLType value) {
        this.gallery = value;
    }

    /**
     * optionalList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OptionalListType }
     *     
     */
    public OptionalListType getOptionalList() {
        return optionalList;
    }

    /**
     * optionalList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalListType }
     *     
     */
    public void setOptionalList(OptionalListType value) {
        this.optionalList = value;
    }

}
