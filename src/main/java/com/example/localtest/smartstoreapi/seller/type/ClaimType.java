
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>claimType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="claimType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="EXCHANGE"/>
 *     &lt;enumeration value="PURCHASE_DECISION_HOLDBACK"/>
 *     &lt;enumeration value="ADMIN_CANCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claimType")
@XmlEnum
public enum ClaimType {

    CANCEL,
    RETURN,
    EXCHANGE,
    PURCHASE_DECISION_HOLDBACK,
    ADMIN_CANCEL;

    public String value() {
        return name();
    }

    public static ClaimType fromValue(String v) {
        return valueOf(v);
    }

}
