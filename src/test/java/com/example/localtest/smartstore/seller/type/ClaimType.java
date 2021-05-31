
package com.example.localtest.smartstore.seller.type;

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

    CANCEL("CANCEL", "취소"),
    RETURN("RETURN", "교환"),
    EXCHANGE("EXCHANGE", "반품"),
    PURCHASE_DECISION_HOLDBACK("PURCHASE_DECISION_HOLDBACK", "구매 확정 보류"),
    ADMIN_CANCEL("ADMIN_CANCEL", "직권 취소");

    private String key;
    private String value;

    ClaimType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    //    public String value() {
//        return name();
//    }

    public String value() {
        return this.key + " (" + this.value + ")";
    }

    public static ClaimType fromValue(String v) {
        return valueOf(v);
    }

}
