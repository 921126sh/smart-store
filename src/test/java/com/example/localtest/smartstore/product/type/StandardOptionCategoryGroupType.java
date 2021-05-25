
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardOptionCategoryGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionCategoryGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageRegistrationUsable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RealValueUsable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OptionSetRequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StandardOptionCategoryAttributeList" type="{http://shopn.platform.nhncorp.com/}StandardOptionCategoryAttributeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionCategoryGroupType", propOrder = {
    "attributeId",
    "attributeName",
    "groupName",
    "imageRegistrationUsable",
    "realValueUsable",
    "optionSetRequired",
    "standardOptionCategoryAttributeList"
})
public class StandardOptionCategoryGroupType {

    @XmlElement(name = "AttributeId")
    protected long attributeId;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "ImageRegistrationUsable", required = true)
    protected String imageRegistrationUsable;
    @XmlElement(name = "RealValueUsable", required = true)
    protected String realValueUsable;
    @XmlElement(name = "OptionSetRequired", required = true)
    protected String optionSetRequired;
    @XmlElement(name = "StandardOptionCategoryAttributeList")
    protected StandardOptionCategoryAttributeListType standardOptionCategoryAttributeList;

    /**
     * attributeId 속성의 값을 가져옵니다.
     * 
     */
    public long getAttributeId() {
        return attributeId;
    }

    /**
     * attributeId 속성의 값을 설정합니다.
     * 
     */
    public void setAttributeId(long value) {
        this.attributeId = value;
    }

    /**
     * attributeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * attributeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * imageRegistrationUsable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRegistrationUsable() {
        return imageRegistrationUsable;
    }

    /**
     * imageRegistrationUsable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRegistrationUsable(String value) {
        this.imageRegistrationUsable = value;
    }

    /**
     * realValueUsable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealValueUsable() {
        return realValueUsable;
    }

    /**
     * realValueUsable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealValueUsable(String value) {
        this.realValueUsable = value;
    }

    /**
     * optionSetRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionSetRequired() {
        return optionSetRequired;
    }

    /**
     * optionSetRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionSetRequired(String value) {
        this.optionSetRequired = value;
    }

    /**
     * standardOptionCategoryAttributeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionCategoryAttributeListType }
     *     
     */
    public StandardOptionCategoryAttributeListType getStandardOptionCategoryAttributeList() {
        return standardOptionCategoryAttributeList;
    }

    /**
     * standardOptionCategoryAttributeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionCategoryAttributeListType }
     *     
     */
    public void setStandardOptionCategoryAttributeList(StandardOptionCategoryAttributeListType value) {
        this.standardOptionCategoryAttributeList = value;
    }

}
