
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardOptionCategoryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseStandardOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StandardOptionCategoryGroups" type="{http://shopn.platform.nhncorp.com/}StandardOptionCategoryGroupsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionCategoryType", propOrder = {
    "useStandardOption",
    "standardOptionCategoryGroups"
})
public class StandardOptionCategoryType {

    @XmlElement(name = "UseStandardOption", required = true)
    protected String useStandardOption;
    @XmlElement(name = "StandardOptionCategoryGroups")
    protected StandardOptionCategoryGroupsType standardOptionCategoryGroups;

    /**
     * useStandardOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStandardOption() {
        return useStandardOption;
    }

    /**
     * useStandardOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStandardOption(String value) {
        this.useStandardOption = value;
    }

    /**
     * standardOptionCategoryGroups 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionCategoryGroupsType }
     *     
     */
    public StandardOptionCategoryGroupsType getStandardOptionCategoryGroups() {
        return standardOptionCategoryGroups;
    }

    /**
     * standardOptionCategoryGroups 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionCategoryGroupsType }
     *     
     */
    public void setStandardOptionCategoryGroups(StandardOptionCategoryGroupsType value) {
        this.standardOptionCategoryGroups = value;
    }

}
