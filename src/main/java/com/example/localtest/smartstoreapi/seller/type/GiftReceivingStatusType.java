
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>giftReceivingStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="giftReceivingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAIT_FOR_RECEIVING"/>
 *     &lt;enumeration value="RECEIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "giftReceivingStatusType")
@XmlEnum
public enum GiftReceivingStatusType {

    WAIT_FOR_RECEIVING,
    RECEIVED;

    public String value() {
        return name();
    }

    public static GiftReceivingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
