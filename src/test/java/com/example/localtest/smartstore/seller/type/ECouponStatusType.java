
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>eCouponStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="eCouponStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_USED"/>
 *     &lt;enumeration value="USED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eCouponStatusType")
@XmlEnum
public enum ECouponStatusType {

    NOT_USED,
    USED;

    public String value() {
        return name();
    }

    public static ECouponStatusType fromValue(String v) {
        return valueOf(v);
    }

}
