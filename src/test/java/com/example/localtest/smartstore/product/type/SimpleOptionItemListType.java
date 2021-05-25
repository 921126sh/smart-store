
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SimpleOptionItemListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SimpleOptionItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Simple" type="{http://shopn.platform.nhncorp.com/}SimpleOptionItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleOptionItemListType", propOrder = {
    "simple"
})
public class SimpleOptionItemListType {

    @XmlElement(name = "Simple")
    protected List<SimpleOptionItemType> simple;

    /**
     * Gets the value of the simple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleOptionItemType }
     * 
     * 
     */
    public List<SimpleOptionItemType> getSimple() {
        if (simple == null) {
            simple = new ArrayList<SimpleOptionItemType>();
        }
        return this.simple;
    }

}
