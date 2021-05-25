
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;


/**
 * <p>requestReturnRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="requestReturnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnReasonCode" type="{http://seller.shopn.platform.nhncorp.com/}claimRequestReasonType"/>
 *         &lt;element name="CollectDeliveryMethodCode" type="{http://seller.shopn.platform.nhncorp.com/}deliveryMethodType"/>
 *         &lt;element name="CollectDeliveryCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestReturnRequest", propOrder = {
    "productOrderID",
    "returnReasonCode",
    "collectDeliveryMethodCode",
    "collectDeliveryCompanyCode",
    "collectTrackingNumber"
})
public class RequestReturnRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "ReturnReasonCode", required = true)
    @XmlSchemaType(name = "string")
    protected ClaimRequestReasonType returnReasonCode;
    @XmlElement(name = "CollectDeliveryMethodCode", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType collectDeliveryMethodCode;
    @XmlElement(name = "CollectDeliveryCompanyCode")
    protected String collectDeliveryCompanyCode;
    @XmlElement(name = "CollectTrackingNumber")
    protected String collectTrackingNumber;

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
     * returnReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public ClaimRequestReasonType getReturnReasonCode() {
        return returnReasonCode;
    }

    /**
     * returnReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimRequestReasonType }
     *     
     */
    public void setReturnReasonCode(ClaimRequestReasonType value) {
        this.returnReasonCode = value;
    }

    /**
     * collectDeliveryMethodCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getCollectDeliveryMethodCode() {
        return collectDeliveryMethodCode;
    }

    /**
     * collectDeliveryMethodCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setCollectDeliveryMethodCode(DeliveryMethodType value) {
        this.collectDeliveryMethodCode = value;
    }

    /**
     * collectDeliveryCompanyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectDeliveryCompanyCode() {
        return collectDeliveryCompanyCode;
    }

    /**
     * collectDeliveryCompanyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectDeliveryCompanyCode(String value) {
        this.collectDeliveryCompanyCode = value;
    }

    /**
     * collectTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectTrackingNumber() {
        return collectTrackingNumber;
    }

    /**
     * collectTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectTrackingNumber(String value) {
        this.collectTrackingNumber = value;
    }

}
