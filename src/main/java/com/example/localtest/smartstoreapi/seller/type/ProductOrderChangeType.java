
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>productOrderChangeType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="productOrderChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAY_WAITING"/>
 *     &lt;enumeration value="PAYED"/>
 *     &lt;enumeration value="DISPATCHED"/>
 *     &lt;enumeration value="CANCEL_REQUESTED"/>
 *     &lt;enumeration value="RETURN_REQUESTED"/>
 *     &lt;enumeration value="EXCHANGE_REQUESTED"/>
 *     &lt;enumeration value="HOLDBACK_REQUESTED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="EXCHANGED"/>
 *     &lt;enumeration value="PURCHASE_DECIDED"/>
 *     &lt;enumeration value="EXCHANGE_REDELIVERY_READY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productOrderChangeType")
@XmlEnum
public enum ProductOrderChangeType {

    PAY_WAITING,
    PAYED,
    DISPATCHED,
    CANCEL_REQUESTED,
    RETURN_REQUESTED,
    EXCHANGE_REQUESTED,
    HOLDBACK_REQUESTED,
    CANCELED,
    RETURNED,
    EXCHANGED,
    PURCHASE_DECIDED,
    EXCHANGE_REDELIVERY_READY;

    public String value() {
        return name();
    }

    public static ProductOrderChangeType fromValue(String v) {
        return valueOf(v);
    }

}
