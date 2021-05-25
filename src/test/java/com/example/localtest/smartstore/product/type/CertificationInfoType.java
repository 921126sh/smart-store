
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CertificationInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CertificationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KindTypeList" type="{http://shopn.platform.nhncorp.com/}KindTypeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationInfoType", propOrder = {
    "code",
    "name",
    "kindTypeList"
})
public class CertificationInfoType {

    @XmlElement(name = "Code")
    protected Long code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "KindTypeList")
    protected KindTypeListType kindTypeList;

    /**
     * code 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * code 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
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
     * kindTypeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link KindTypeListType }
     *     
     */
    public KindTypeListType getKindTypeList() {
        return kindTypeList;
    }

    /**
     * kindTypeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link KindTypeListType }
     *     
     */
    public void setKindTypeList(KindTypeListType value) {
        this.kindTypeList = value;
    }

}
