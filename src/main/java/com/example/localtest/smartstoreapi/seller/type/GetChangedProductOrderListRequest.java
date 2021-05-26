
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;


/**
 * <p>getChangedProductOrderListRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="getChangedProductOrderListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}ListRequestType">
 *       &lt;sequence>
 *         &lt;element name="LastChangedStatusCode" type="{http://seller.shopn.platform.nhncorp.com/}productOrderChangeType" minOccurs="0"/>
 *         &lt;element name="MallID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChangedProductOrderListRequest", propOrder = {
    "lastChangedStatusCode",
    "mallID"
})
public class GetChangedProductOrderListRequest
    extends ListRequestType
{

    @XmlElement(name = "LastChangedStatusCode")
    @XmlSchemaType(name = "string")
    protected ProductOrderChangeType lastChangedStatusCode;
    @XmlElement(name = "MallID")
    protected String mallID;

    /**
     * lastChangedStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderChangeType }
     *     
     */
    public ProductOrderChangeType getLastChangedStatusCode() {
        return lastChangedStatusCode;
    }

    /**
     * lastChangedStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderChangeType }
     *     
     */
    public void setLastChangedStatusCode(ProductOrderChangeType value) {
        this.lastChangedStatusCode = value;
    }

    /**
     * mallID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMallID() {
        return mallID;
    }

    /**
     * mallID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMallID(String value) {
        this.mallID = value;
    }

}
