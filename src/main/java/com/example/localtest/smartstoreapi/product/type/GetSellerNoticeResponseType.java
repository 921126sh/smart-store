
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSellerNoticeResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetSellerNoticeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellerNotice" type="{http://shopn.platform.nhncorp.com/}SellerNoticeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerNoticeResponseType", propOrder = {
    "sellerNotice"
})
public class GetSellerNoticeResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "SellerNotice", namespace = "")
    protected SellerNoticeType sellerNotice;

    /**
     * sellerNotice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SellerNoticeType }
     *     
     */
    public SellerNoticeType getSellerNotice() {
        return sellerNotice;
    }

    /**
     * sellerNotice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerNoticeType }
     *     
     */
    public void setSellerNotice(SellerNoticeType value) {
        this.sellerNotice = value;
    }

}
