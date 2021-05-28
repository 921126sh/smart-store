
package com.example.localtest.smartstoreapi.seller.type;

import org.springframework.lang.Nullable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>claimStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="claimStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCEL_REQUEST"/>
 *     &lt;enumeration value="CANCELING"/>
 *     &lt;enumeration value="CANCEL_DONE"/>
 *     &lt;enumeration value="CANCEL_REJECT"/>
 *     &lt;enumeration value="RETURN_REQUEST"/>
 *     &lt;enumeration value="EXCHANGE_REQUEST"/>
 *     &lt;enumeration value="COLLECTING"/>
 *     &lt;enumeration value="COLLECT_DONE"/>
 *     &lt;enumeration value="EXCHANGE_REDELIVERING"/>
 *     &lt;enumeration value="RETURN_DONE"/>
 *     &lt;enumeration value="EXCHANGE_DONE"/>
 *     &lt;enumeration value="RETURN_REJECT"/>
 *     &lt;enumeration value="EXCHANGE_REJECT"/>
 *     &lt;enumeration value="PURCHASE_DECISION_HOLDBACK"/>
 *     &lt;enumeration value="PURCHASE_DECISION_HOLDBACK_REDELIVERING"/>
 *     &lt;enumeration value="PURCHASE_DECISION_REQUEST"/>
 *     &lt;enumeration value="PURCHASE_DECISION_HOLDBACK_RELEASE"/>
 *     &lt;enumeration value="ADMIN_CANCELING"/>
 *     &lt;enumeration value="ADMIN_CANCEL_DONE"/>
 *     &lt;enumeration value="ADMIN_CANCEL_REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claimStatusType")
@XmlEnum
public enum ClaimStatusType {

    CANCEL_REQUEST,
    CANCELING,
    CANCEL_DONE,
    CANCEL_REJECT,
    RETURN_REQUEST,
    EXCHANGE_REQUEST,
    COLLECTING,
    COLLECT_DONE,
    EXCHANGE_REDELIVERING,
    RETURN_DONE,
    EXCHANGE_DONE,
    RETURN_REJECT,
    EXCHANGE_REJECT,
    PURCHASE_DECISION_HOLDBACK,
    PURCHASE_DECISION_HOLDBACK_REDELIVERING,
    PURCHASE_DECISION_REQUEST,
    PURCHASE_DECISION_HOLDBACK_RELEASE,
    ADMIN_CANCELING,
    ADMIN_CANCEL_DONE,
    ADMIN_CANCEL_REJECT;

    public String value() {
        return name();
    }

    public static ClaimStatusType fromValue(String v) {
        return valueOf(v);
    }

}
