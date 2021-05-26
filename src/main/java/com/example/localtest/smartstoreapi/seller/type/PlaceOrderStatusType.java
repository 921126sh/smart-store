
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>placeOrderStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="placeOrderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_YET"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="CANCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placeOrderStatusType")
@XmlEnum
public enum PlaceOrderStatusType {

    NOT_YET,
    OK,
    CANCEL;

    public String value() {
        return name();
    }

    public static PlaceOrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
