
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>delayedDispatchReasonType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="delayedDispatchReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCT_PREPARE"/>
 *     &lt;enumeration value="CUSTOMER_REQUEST"/>
 *     &lt;enumeration value="CUSTOM_BUILD"/>
 *     &lt;enumeration value="RESERVED_DISPATCH"/>
 *     &lt;enumeration value="ETC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "delayedDispatchReasonType")
@XmlEnum
public enum DelayedDispatchReasonType {

    PRODUCT_PREPARE,
    CUSTOMER_REQUEST,
    CUSTOM_BUILD,
    RESERVED_DISPATCH,
    ETC;

    public String value() {
        return name();
    }

    public static DelayedDispatchReasonType fromValue(String v) {
        return valueOf(v);
    }

}
