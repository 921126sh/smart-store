
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>holdbackStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="holdbackStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_YET"/>
 *     &lt;enumeration value="HOLDBACK"/>
 *     &lt;enumeration value="RELEASED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "holdbackStatusType")
@XmlEnum
public enum HoldbackStatusType {

    NOT_YET,
    HOLDBACK,
    RELEASED;

    public String value() {
        return name();
    }

    public static HoldbackStatusType fromValue(String v) {
        return valueOf(v);
    }

}
