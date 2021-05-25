
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>StandardOptionItemListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardOptionItem" type="{http://shopn.platform.nhncorp.com/}StandardOptionItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionItemListType", propOrder = {
    "standardOptionItem"
})
public class StandardOptionItemListType {

    @XmlElement(name = "StandardOptionItem")
    protected List<StandardOptionItemType> standardOptionItem;

    /**
     * Gets the value of the standardOptionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardOptionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardOptionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardOptionItemType }
     * 
     * 
     */
    public List<StandardOptionItemType> getStandardOptionItem() {
        if (standardOptionItem == null) {
            standardOptionItem = new ArrayList<StandardOptionItemType>();
        }
        return this.standardOptionItem;
    }

}
