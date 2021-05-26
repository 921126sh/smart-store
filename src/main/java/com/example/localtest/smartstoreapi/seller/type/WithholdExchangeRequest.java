
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;


/**
 * <p>withholdExchangeRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="withholdExchangeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeHoldCode" type="{http://seller.shopn.platform.nhncorp.com/}holdbackClassType"/>
 *         &lt;element name="ExchangeHoldDetailContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EtcFeeDemandAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "withholdExchangeRequest", propOrder = {
    "productOrderID",
    "exchangeHoldCode",
    "exchangeHoldDetailContent",
    "etcFeeDemandAmount"
})
public class WithholdExchangeRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "ExchangeHoldCode", required = true)
    @XmlSchemaType(name = "string")
    protected HoldbackClassType exchangeHoldCode;
    @XmlElement(name = "ExchangeHoldDetailContent", required = true)
    protected String exchangeHoldDetailContent;
    @XmlElement(name = "EtcFeeDemandAmount")
    protected Integer etcFeeDemandAmount;

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
     * exchangeHoldCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HoldbackClassType }
     *     
     */
    public HoldbackClassType getExchangeHoldCode() {
        return exchangeHoldCode;
    }

    /**
     * exchangeHoldCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldbackClassType }
     *     
     */
    public void setExchangeHoldCode(HoldbackClassType value) {
        this.exchangeHoldCode = value;
    }

    /**
     * exchangeHoldDetailContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeHoldDetailContent() {
        return exchangeHoldDetailContent;
    }

    /**
     * exchangeHoldDetailContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeHoldDetailContent(String value) {
        this.exchangeHoldDetailContent = value;
    }

    /**
     * etcFeeDemandAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEtcFeeDemandAmount() {
        return etcFeeDemandAmount;
    }

    /**
     * etcFeeDemandAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEtcFeeDemandAmount(Integer value) {
        this.etcFeeDemandAmount = value;
    }

}
