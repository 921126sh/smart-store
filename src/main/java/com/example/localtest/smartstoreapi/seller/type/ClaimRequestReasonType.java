
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>claimRequestReasonType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="claimRequestReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTENT_CHANGED"/>
 *     &lt;enumeration value="COLOR_AND_SIZE"/>
 *     &lt;enumeration value="WRONG_ORDER"/>
 *     &lt;enumeration value="PRODUCT_UNSATISFIED"/>
 *     &lt;enumeration value="DELAYED_DELIVERY"/>
 *     &lt;enumeration value="SOLD_OUT"/>
 *     &lt;enumeration value="DROPPED_DELIVERY"/>
 *     &lt;enumeration value="NOT_YET_DELIVERY"/>
 *     &lt;enumeration value="BROKEN"/>
 *     &lt;enumeration value="INCORRECT_INFO"/>
 *     &lt;enumeration value="WRONG_DELIVERY"/>
 *     &lt;enumeration value="WRONG_OPTION"/>
 *     &lt;enumeration value="ETC"/>
 *     &lt;enumeration value="NOT_YET_DISCUSSION"/>
 *     &lt;enumeration value="OUT_OF_STOCK"/>
 *     &lt;enumeration value="SALE_INTENT_CHANGED"/>
 *     &lt;enumeration value="NOT_YET_PAYMENT"/>
 *     &lt;enumeration value="NOT_YET_RECEIVE"/>
 *     &lt;enumeration value="RECEIVING_DUE_DATE_OVER"/>
 *     &lt;enumeration value="RECEIVER_MISMATCHED"/>
 *     &lt;enumeration value="GIFT_INTENT_CHANGED"/>
 *     &lt;enumeration value="GIFT_REFUSAL"/>
 *     &lt;enumeration value="MINOR_RESTRICTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claimRequestReasonType")
@XmlEnum
public enum ClaimRequestReasonType {

    INTENT_CHANGED,
    COLOR_AND_SIZE,
    WRONG_ORDER,
    PRODUCT_UNSATISFIED,
    DELAYED_DELIVERY,
    SOLD_OUT,
    DROPPED_DELIVERY,
    NOT_YET_DELIVERY,
    BROKEN,
    INCORRECT_INFO,
    WRONG_DELIVERY,
    WRONG_OPTION,
    ETC,
    NOT_YET_DISCUSSION,
    OUT_OF_STOCK,
    SALE_INTENT_CHANGED,
    NOT_YET_PAYMENT,
    NOT_YET_RECEIVE,
    RECEIVING_DUE_DATE_OVER,
    RECEIVER_MISMATCHED,
    GIFT_INTENT_CHANGED,
    GIFT_REFUSAL,
    MINOR_RESTRICTED;

    public String value() {
        return name();
    }

    public static ClaimRequestReasonType fromValue(String v) {
        return valueOf(v);
    }

}
