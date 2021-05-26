
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>deliveryMethodType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="deliveryMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELIVERY"/>
 *     &lt;enumeration value="GDFW_ISSUE_SVC"/>
 *     &lt;enumeration value="VISIT_RECEIPT"/>
 *     &lt;enumeration value="DIRECT_DELIVERY"/>
 *     &lt;enumeration value="QUICK_SVC"/>
 *     &lt;enumeration value="NOTHING"/>
 *     &lt;enumeration value="RETURN_DESIGNATED"/>
 *     &lt;enumeration value="RETURN_DELIVERY"/>
 *     &lt;enumeration value="RETURN_INDIVIDUAL"/>
 *     &lt;enumeration value="RETURN_VALUE_NULL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deliveryMethodType")
@XmlEnum
public enum DeliveryMethodType {

    DELIVERY,
    GDFW_ISSUE_SVC,
    VISIT_RECEIPT,
    DIRECT_DELIVERY,
    QUICK_SVC,
    NOTHING,
    RETURN_DESIGNATED,
    RETURN_DELIVERY,
    RETURN_INDIVIDUAL,
    RETURN_VALUE_NULL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static DeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}
