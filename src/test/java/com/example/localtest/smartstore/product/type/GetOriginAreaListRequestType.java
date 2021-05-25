
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetOriginAreaListRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetOriginAreaListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="OriginAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOriginAreaListRequestType", propOrder = {
    "originAreaName",
    "originAreaCode"
})
public class GetOriginAreaListRequestType
    extends BaseProductRequestType
{

    @XmlElement(name = "OriginAreaName", namespace = "")
    protected String originAreaName;
    @XmlElement(name = "OriginAreaCode", namespace = "")
    protected String originAreaCode;

    /**
     * originAreaName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAreaName() {
        return originAreaName;
    }

    /**
     * originAreaName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAreaName(String value) {
        this.originAreaName = value;
    }

    /**
     * originAreaCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAreaCode() {
        return originAreaCode;
    }

    /**
     * originAreaCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAreaCode(String value) {
        this.originAreaCode = value;
    }

}
