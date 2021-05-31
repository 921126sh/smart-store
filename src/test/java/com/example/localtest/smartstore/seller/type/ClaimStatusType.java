
package com.example.localtest.smartstore.seller.type;

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

    CANCEL_REQUEST("CANCEL_REQUEST", "취소 요청"),
    CANCELING("CANCELING", "취소 처리 중"),
    CANCEL_DONE("CANCEL_DONE", "취소 처리 완료"),
    CANCEL_REJECT("CANCEL_REJECT", "취소 철회"),
    RETURN_REQUEST("RETURN_REQUEST", "반품 요청"),
    EXCHANGE_REQUEST("EXCHANGE_REQUEST", "교환 요청"),
    COLLECTING("COLLECTING", "수거 처리 중"),
    COLLECT_DONE("COLLECT_DONE", "수거 완료"),
    EXCHANGE_REDELIVERING("EXCHANGE_REDELIVERING", "교환 재배송 중"),
    RETURN_DONE("RETURN_DONE", "반품 완료"),
    EXCHANGE_DONE("EXCHANGE_DONE", "교환 완료"),
    RETURN_REJECT("RETURN_REJECT", "반품 철회"),
    EXCHANGE_REJECT("EXCHANGE_REJECT", "교환 거부"),
    PURCHASE_DECISION_HOLDBACK("PURCHASE_DECISION_HOLDBACK", "구매 확정 보류"),
    PURCHASE_DECISION_HOLDBACK_REDELIVERING("PURCHASE_DECISION_HOLDBACK_REDELIVERING", "구매 확정 보류 재배송 중"),
    PURCHASE_DECISION_REQUEST("PURCHASE_DECISION_REQUEST", "구매 확정 요청"),
    PURCHASE_DECISION_HOLDBACK_RELEASE("PURCHASE_DECISION_HOLDBACK_RELEASE", "구매 확정 보류 해제"),
    ADMIN_CANCELING("ADMIN_CANCELING", "직권 취소 중"),
    ADMIN_CANCEL_DONE("ADMIN_CANCEL_DONE", "직권 취소 완료"),
    ADMIN_CANCEL_REJECT("ADMIN_CANCEL_REJECT", "직권 취소 거절");

    private String key;
    private String value;

    ClaimStatusType(String key, String value) {
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

    public static ClaimStatusType fromValue(String v) {
        return valueOf(v);
    }

}
