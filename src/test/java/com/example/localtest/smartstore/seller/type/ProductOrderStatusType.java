
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>productOrderStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="productOrderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYMENT_WAITING"/>
 *     &lt;enumeration value="CANCELED_BY_NOPAYMENT"/>
 *     &lt;enumeration value="PAYED"/>
 *     &lt;enumeration value="DELIVERING"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="PURCHASE_DECIDED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="EXCHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productOrderStatusType")
@XmlEnum
public enum ProductOrderStatusType {

    PAYMENT_WAITING,
    CANCELED_BY_NOPAYMENT,
    PAYED,
    DELIVERING,
    DELIVERED,
    PURCHASE_DECIDED,
    CANCELED,
    RETURNED,
    EXCHANGED;

    public String value() {
        return name();
    }

    public static ProductOrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
