
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;


/**
 * <p>withholdReturnRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="withholdReturnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnHoldCode" type="{http://seller.shopn.platform.nhncorp.com/}holdbackClassType"/>
 *         &lt;element name="ReturnHoldDetailContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "withholdReturnRequest", propOrder = {
    "productOrderID",
    "returnHoldCode",
    "returnHoldDetailContent",
    "etcFeeDemandAmount"
})
public class WithholdReturnRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "ReturnHoldCode", required = true)
    @XmlSchemaType(name = "string")
    protected HoldbackClassType returnHoldCode;
    @XmlElement(name = "ReturnHoldDetailContent", required = true)
    protected String returnHoldDetailContent;
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
     * returnHoldCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HoldbackClassType }
     *     
     */
    public HoldbackClassType getReturnHoldCode() {
        return returnHoldCode;
    }

    /**
     * returnHoldCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldbackClassType }
     *     
     */
    public void setReturnHoldCode(HoldbackClassType value) {
        this.returnHoldCode = value;
    }

    /**
     * returnHoldDetailContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnHoldDetailContent() {
        return returnHoldDetailContent;
    }

    /**
     * returnHoldDetailContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnHoldDetailContent(String value) {
        this.returnHoldDetailContent = value;
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
