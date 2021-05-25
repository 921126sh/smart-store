
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;


/**
 * <p>reDeliveryExchangeRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="reDeliveryExchangeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReDeliveryMethodCode" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType"/>
 *         &lt;element name="ReDeliveryCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReDeliveryTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reDeliveryExchangeRequest", propOrder = {
    "productOrderID",
    "reDeliveryMethodCode",
    "reDeliveryCompanyCode",
    "reDeliveryTrackingNumber"
})
public class ReDeliveryExchangeRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "ReDeliveryMethodCode", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType reDeliveryMethodCode;
    @XmlElement(name = "ReDeliveryCompanyCode")
    protected String reDeliveryCompanyCode;
    @XmlElement(name = "ReDeliveryTrackingNumber")
    protected String reDeliveryTrackingNumber;

    /**
     * productOrderID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOrderID() {
        return productOrderID;
    }

    /**
     * productOrderID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOrderID(String value) {
        this.productOrderID = value;
    }

    /**
     * reDeliveryMethodCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getReDeliveryMethodCode() {
        return reDeliveryMethodCode;
    }

    /**
     * reDeliveryMethodCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setReDeliveryMethodCode(DeliveryMethodType value) {
        this.reDeliveryMethodCode = value;
    }

    /**
     * reDeliveryCompanyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReDeliveryCompanyCode() {
        return reDeliveryCompanyCode;
    }

    /**
     * reDeliveryCompanyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReDeliveryCompanyCode(String value) {
        this.reDeliveryCompanyCode = value;
    }

    /**
     * reDeliveryTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReDeliveryTrackingNumber() {
        return reDeliveryTrackingNumber;
    }

    /**
     * reDeliveryTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReDeliveryTrackingNumber(String value) {
        this.reDeliveryTrackingNumber = value;
    }

}
