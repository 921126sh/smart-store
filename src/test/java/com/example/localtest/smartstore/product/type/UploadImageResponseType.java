
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UploadImageResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="UploadImageResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="ImageList" type="{http://shopn.platform.nhncorp.com/}ImageReturnListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadImageResponseType", propOrder = {
    "imageList"
})
public class UploadImageResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "ImageList", namespace = "")
    protected ImageReturnListType imageList;

    /**
     * imageList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ImageReturnListType }
     *     
     */
    public ImageReturnListType getImageList() {
        return imageList;
    }

    /**
     * imageList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageReturnListType }
     *     
     */
    public void setImageList(ImageReturnListType value) {
        this.imageList = value;
    }

}
