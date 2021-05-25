
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CategoryReturnType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CategoryReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExceptionalCategoryList" type="{http://shopn.platform.nhncorp.com/}ExceptionalCategoryListType" minOccurs="0"/>
 *         &lt;element name="CertificationCategoryList" type="{http://shopn.platform.nhncorp.com/}CertificationCategoryListType" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CertificationInfoList" type="{http://shopn.platform.nhncorp.com/}CertificationInfoListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryReturnType", propOrder = {
    "categoryName",
    "id",
    "name",
    "exceptionalCategoryList",
    "certificationCategoryList",
    "last",
    "certificationInfoList"
})
public class CategoryReturnType {

    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ExceptionalCategoryList")
    protected ExceptionalCategoryListType exceptionalCategoryList;
    @XmlElement(name = "CertificationCategoryList")
    protected CertificationCategoryListType certificationCategoryList;
    @XmlElement(name = "Last", required = true)
    protected String last;
    @XmlElement(name = "CertificationInfoList")
    protected CertificationInfoListType certificationInfoList;

    /**
     * categoryName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * categoryName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * exceptionalCategoryList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionalCategoryListType }
     *     
     */
    public ExceptionalCategoryListType getExceptionalCategoryList() {
        return exceptionalCategoryList;
    }

    /**
     * exceptionalCategoryList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionalCategoryListType }
     *     
     */
    public void setExceptionalCategoryList(ExceptionalCategoryListType value) {
        this.exceptionalCategoryList = value;
    }

    /**
     * certificationCategoryList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CertificationCategoryListType }
     *     
     */
    public CertificationCategoryListType getCertificationCategoryList() {
        return certificationCategoryList;
    }

    /**
     * certificationCategoryList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationCategoryListType }
     *     
     */
    public void setCertificationCategoryList(CertificationCategoryListType value) {
        this.certificationCategoryList = value;
    }

    /**
     * last 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast() {
        return last;
    }

    /**
     * last 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast(String value) {
        this.last = value;
    }

    /**
     * certificationInfoList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CertificationInfoListType }
     *     
     */
    public CertificationInfoListType getCertificationInfoList() {
        return certificationInfoList;
    }

    /**
     * certificationInfoList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationInfoListType }
     *     
     */
    public void setCertificationInfoList(CertificationInfoListType value) {
        this.certificationInfoList = value;
    }

}
