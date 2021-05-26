
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SellerNoticeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SellerNoticeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}SellerNoticeListItemType">
 *       &lt;sequence>
 *         &lt;element name="Popup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PopupDisplayStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PopupDisplayEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerNoticeType", propOrder = {
    "popup",
    "popupDisplayStartDate",
    "popupDisplayEndDate",
    "content"
})
public class SellerNoticeType
    extends SellerNoticeListItemType
{

    @XmlElement(name = "Popup")
    protected String popup;
    @XmlElement(name = "PopupDisplayStartDate")
    protected String popupDisplayStartDate;
    @XmlElement(name = "PopupDisplayEndDate")
    protected String popupDisplayEndDate;
    @XmlElement(name = "Content", required = true)
    protected String content;

    /**
     * popup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopup() {
        return popup;
    }

    /**
     * popup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopup(String value) {
        this.popup = value;
    }

    /**
     * popupDisplayStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopupDisplayStartDate() {
        return popupDisplayStartDate;
    }

    /**
     * popupDisplayStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopupDisplayStartDate(String value) {
        this.popupDisplayStartDate = value;
    }

    /**
     * popupDisplayEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopupDisplayEndDate() {
        return popupDisplayEndDate;
    }

    /**
     * popupDisplayEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopupDisplayEndDate(String value) {
        this.popupDisplayEndDate = value;
    }

    /**
     * content 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * content 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

}
