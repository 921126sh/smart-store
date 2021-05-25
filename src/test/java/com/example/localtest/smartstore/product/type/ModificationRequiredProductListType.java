
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ModificationRequiredProductListType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ModificationRequiredProductListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModificationRequiredProduct" type="{http://shopn.platform.nhncorp.com/}ModificationRequiredProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationRequiredProductListType", propOrder = {
    "modificationRequiredProduct"
})
public class ModificationRequiredProductListType {

    @XmlElement(name = "ModificationRequiredProduct")
    protected List<ModificationRequiredProductType> modificationRequiredProduct;

    /**
     * Gets the value of the modificationRequiredProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modificationRequiredProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModificationRequiredProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationRequiredProductType }
     * 
     * 
     */
    public List<ModificationRequiredProductType> getModificationRequiredProduct() {
        if (modificationRequiredProduct == null) {
            modificationRequiredProduct = new ArrayList<ModificationRequiredProductType>();
        }
        return this.modificationRequiredProduct;
    }

}
