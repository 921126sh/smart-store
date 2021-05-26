
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>delayProductOrderRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="delayProductOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseCheckoutRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DispatchDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DispatchDelayReasonCode" type="{http://seller.shopn.platform.nhncorp.com/}delayedDispatchReasonType"/>
 *         &lt;element name="DispatchDelayDetailReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayProductOrderRequest", propOrder = {
    "productOrderID",
    "dispatchDueDate",
    "dispatchDelayReasonCode",
    "dispatchDelayDetailReason"
})
public class DelayProductOrderRequest
    extends BaseCheckoutRequestType
{

    @XmlElement(name = "ProductOrderID", required = true)
    protected String productOrderID;
    @XmlElement(name = "DispatchDueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispatchDueDate;
    @XmlElement(name = "DispatchDelayReasonCode", required = true)
    @XmlSchemaType(name = "string")
    protected DelayedDispatchReasonType dispatchDelayReasonCode;
    @XmlElement(name = "DispatchDelayDetailReason")
    protected String dispatchDelayDetailReason;

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
     * dispatchDueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDueDate() {
        return dispatchDueDate;
    }

    /**
     * dispatchDueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDueDate(XMLGregorianCalendar value) {
        this.dispatchDueDate = value;
    }

    /**
     * dispatchDelayReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DelayedDispatchReasonType }
     *     
     */
    public DelayedDispatchReasonType getDispatchDelayReasonCode() {
        return dispatchDelayReasonCode;
    }

    /**
     * dispatchDelayReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayedDispatchReasonType }
     *     
     */
    public void setDispatchDelayReasonCode(DelayedDispatchReasonType value) {
        this.dispatchDelayReasonCode = value;
    }

    /**
     * dispatchDelayDetailReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchDelayDetailReason() {
        return dispatchDelayDetailReason;
    }

    /**
     * dispatchDelayDetailReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchDelayDetailReason(String value) {
        this.dispatchDelayDetailReason = value;
    }

}
