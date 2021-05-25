
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>commissionPrePayStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="commissionPrePayStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERAL_PRD"/>
 *     &lt;enumeration value="PRE_PAY_PRD_NO_PAY"/>
 *     &lt;enumeration value="PRE_PAY_PRD_PAYED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commissionPrePayStatusType")
@XmlEnum
public enum CommissionPrePayStatusType {

    GENERAL_PRD,
    PRE_PAY_PRD_NO_PAY,
    PRE_PAY_PRD_PAYED;

    public String value() {
        return name();
    }

    public static CommissionPrePayStatusType fromValue(String v) {
        return valueOf(v);
    }

}
