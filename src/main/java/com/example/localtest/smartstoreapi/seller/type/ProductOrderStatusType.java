
package com.example.localtest.smartstoreapi.seller.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>productOrderStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="productOrderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYMENT_WAITING"/>
 *     &lt;enumeration value="CANCELED_BY_NOPAYMENT"/>
 *     &lt;enumeration value="PAYED"/>
 *     &lt;enumeration value="DELIVERING"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="PURCHASE_DECIDED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="EXCHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productOrderStatusType")
@XmlEnum
public enum ProductOrderStatusType {

    PAYMENT_WAITING("PAYMENT_WAITING", "결제 대기"),
    CANCELED_BY_NOPAYMENT("CANCELED_BY_NOPAYMENT", "미결제 취소"),
    PAYED("PAYED", "결제 완료"),
    DELIVERING("DELIVERING", "배송 중"),
    DELIVERED("DELIVERED", "배송 완료"),
    PURCHASE_DECIDED("PURCHASE_DECIDED", "구매 확정"),
    CANCELED("CANCELED", "취소"),
    RETURNED("RETURNED", "반품"),
    EXCHANGED("EXCHANGED", "교환");

    private String key;
    private String value;

    ProductOrderStatusType(String key, String value) {
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


    public static ProductOrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
