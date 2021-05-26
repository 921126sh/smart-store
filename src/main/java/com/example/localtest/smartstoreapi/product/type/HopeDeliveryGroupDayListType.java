
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HopeDeliveryGroupDayListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HopeDeliveryGroupDayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HopeDeliveryGroupDay" type="{http://shopn.platform.nhncorp.com/}HopeDeliveryGroupDayType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HopeDeliveryGroupDayListType", propOrder = {
    "hopeDeliveryGroupDay"
})
public class HopeDeliveryGroupDayListType {

    @XmlElement(name = "HopeDeliveryGroupDay", required = true)
    protected List<HopeDeliveryGroupDayType> hopeDeliveryGroupDay;

    /**
     * Gets the value of the hopeDeliveryGroupDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hopeDeliveryGroupDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHopeDeliveryGroupDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HopeDeliveryGroupDayType }
     * 
     * 
     */
    public List<HopeDeliveryGroupDayType> getHopeDeliveryGroupDay() {
        if (hopeDeliveryGroupDay == null) {
            hopeDeliveryGroupDay = new ArrayList<HopeDeliveryGroupDayType>();
        }
        return this.hopeDeliveryGroupDay;
    }

}
