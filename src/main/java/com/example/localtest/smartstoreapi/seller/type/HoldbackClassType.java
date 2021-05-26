
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>holdbackClassType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="holdbackClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETURN_DELIVERYFEE"/>
 *     &lt;enumeration value="EXTRAFEEE"/>
 *     &lt;enumeration value="RETURN_DELIVERYFEE_AND_EXTRAFEEE"/>
 *     &lt;enumeration value="RETURN_PRODUCT_NOT_DELIVERED"/>
 *     &lt;enumeration value="ETC"/>
 *     &lt;enumeration value="EXCHANGE_DELIVERYFEE"/>
 *     &lt;enumeration value="EXCHANGE_EXTRAFEE"/>
 *     &lt;enumeration value="EXCHANGE_PRODUCT_READY"/>
 *     &lt;enumeration value="EXCHANGE_PRODUCT_NOT_DELIVERED"/>
 *     &lt;enumeration value="SELLER_CONFIRM_NEED"/>
 *     &lt;enumeration value="PURCHASER_CONFIRM_NEED"/>
 *     &lt;enumeration value="SELLER_REMIT"/>
 *     &lt;enumeration value="ETC2"/>
 *     &lt;enumeration value="EXCHANGE_HOLDBACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "holdbackClassType")
@XmlEnum
public enum HoldbackClassType {

    RETURN_DELIVERYFEE("RETURN_DELIVERYFEE"),
    EXTRAFEEE("EXTRAFEEE"),
    RETURN_DELIVERYFEE_AND_EXTRAFEEE("RETURN_DELIVERYFEE_AND_EXTRAFEEE"),
    RETURN_PRODUCT_NOT_DELIVERED("RETURN_PRODUCT_NOT_DELIVERED"),
    ETC("ETC"),
    EXCHANGE_DELIVERYFEE("EXCHANGE_DELIVERYFEE"),
    EXCHANGE_EXTRAFEE("EXCHANGE_EXTRAFEE"),
    EXCHANGE_PRODUCT_READY("EXCHANGE_PRODUCT_READY"),
    EXCHANGE_PRODUCT_NOT_DELIVERED("EXCHANGE_PRODUCT_NOT_DELIVERED"),
    SELLER_CONFIRM_NEED("SELLER_CONFIRM_NEED"),
    PURCHASER_CONFIRM_NEED("PURCHASER_CONFIRM_NEED"),
    SELLER_REMIT("SELLER_REMIT"),
    @XmlEnumValue("ETC2")
    ETC_2("ETC2"),
    EXCHANGE_HOLDBACK("EXCHANGE_HOLDBACK");
    private final String value;

    HoldbackClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldbackClassType fromValue(String v) {
        for (HoldbackClassType c: HoldbackClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
