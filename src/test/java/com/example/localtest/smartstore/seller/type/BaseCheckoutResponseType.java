
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BaseCheckoutResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseCheckoutResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="DetailLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCheckoutResponseType", propOrder = {
    "detailLevel",
    "version",
    "release",
    "timestamp",
    "messageID"
})
@XmlSeeAlso({
    WithholdReturnResponse.class,
    ApproveCollectedExchangeResponse.class,
    CancelSaleResponse.class,
    ReleaseReturnHoldResponse.class,
    RejectExchangeResponse.class,
    DelayProductOrderResponse.class,
    RejectReturnResponse.class,
    GetProductOrderIdListResponse.class,
    PlaceProductOrderResponse.class,
    ReleaseExchangeHoldResponse.class,
    ShipProductOrderResponse.class,
    ApproveCancelApplicationResponse.class,
    ChangeECouponStatusResponse.class,
    ModifyECouponValidDateResponse.class,
    WithholdExchangeResponse.class,
    ApproveReturnApplicationResponse.class,
    ReDeliveryExchangeResponse.class,
    UseECouponResponse.class,
    RequestReturnResponse.class,
    ListResponseType.class
})
public class BaseCheckoutResponseType
    extends BaseResponseType
{

    @XmlElement(name = "DetailLevel")
    protected String detailLevel;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Release")
    protected String release;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "MessageID")
    protected String messageID;

    /**
     * detailLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailLevel() {
        return detailLevel;
    }

    /**
     * detailLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailLevel(String value) {
        this.detailLevel = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * release 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * release 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * timestamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * timestamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * messageID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * messageID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

}
