
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardOptionGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandardOptionGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StandardOptionAttributeList" type="{http://shopn.platform.nhncorp.com/}StandardOptionAttributeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardOptionGroupType", propOrder = {
    "groupName",
    "standardOptionAttributeList"
})
public class StandardOptionGroupType {

    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "StandardOptionAttributeList")
    protected StandardOptionAttributeListType standardOptionAttributeList;

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
     * standardOptionAttributeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StandardOptionAttributeListType }
     *     
     */
    public StandardOptionAttributeListType getStandardOptionAttributeList() {
        return standardOptionAttributeList;
    }

    /**
     * standardOptionAttributeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOptionAttributeListType }
     *     
     */
    public void setStandardOptionAttributeList(StandardOptionAttributeListType value) {
        this.standardOptionAttributeList = value;
    }

}
