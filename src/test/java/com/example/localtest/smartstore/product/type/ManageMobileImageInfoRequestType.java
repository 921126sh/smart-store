
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManageMobileImageInfoRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManageMobileImageInfoRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MobileImageInfo" type="{http://shopn.platform.nhncorp.com/}MobileImageInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageMobileImageInfoRequestType", propOrder = {
    "sellerId",
    "mobileImageInfo"
})
public class ManageMobileImageInfoRequestType
    extends BaseProductRequestType
{

    @XmlElement(name = "SellerId", namespace = "", required = true)
    protected String sellerId;
    @XmlElement(name = "MobileImageInfo", namespace = "", required = true)
    protected MobileImageInfoType mobileImageInfo;

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
     * mobileImageInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MobileImageInfoType }
     *     
     */
    public MobileImageInfoType getMobileImageInfo() {
        return mobileImageInfo;
    }

    /**
     * mobileImageInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileImageInfoType }
     *     
     */
    public void setMobileImageInfo(MobileImageInfoType value) {
        this.mobileImageInfo = value;
    }

}
