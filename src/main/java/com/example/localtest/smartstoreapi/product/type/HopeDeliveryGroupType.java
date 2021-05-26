
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HopeDeliveryGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HopeDeliveryGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseHopeGroupYn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HopeGroupStartTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HopeGroupEndTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegularHolidayList" type="{http://shopn.platform.nhncorp.com/}RegularHolidayCodeListType" minOccurs="0"/>
 *         &lt;element name="LadderTruckUseComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductRemovalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HopeDeliveryGroupDayList" type="{http://shopn.platform.nhncorp.com/}HopeDeliveryGroupDayListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HopeDeliveryGroupType", propOrder = {
    "id",
    "name",
    "usable",
    "baseHopeGroupYn",
    "hopeGroupStartTime",
    "hopeGroupEndTime",
    "regularHolidayList",
    "ladderTruckUseComment",
    "productRemovalType",
    "hopeDeliveryGroupDayList"
})
public class HopeDeliveryGroupType {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Usable", required = true)
    protected String usable;
    @XmlElement(name = "BaseHopeGroupYn", required = true)
    protected String baseHopeGroupYn;
    @XmlElement(name = "HopeGroupStartTime")
    protected Integer hopeGroupStartTime;
    @XmlElement(name = "HopeGroupEndTime")
    protected Integer hopeGroupEndTime;
    @XmlElement(name = "RegularHolidayList")
    protected RegularHolidayCodeListType regularHolidayList;
    @XmlElement(name = "LadderTruckUseComment")
    protected String ladderTruckUseComment;
    @XmlElement(name = "ProductRemovalType")
    protected String productRemovalType;
    @XmlElement(name = "HopeDeliveryGroupDayList", required = true)
    protected HopeDeliveryGroupDayListType hopeDeliveryGroupDayList;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
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
     * usable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsable() {
        return usable;
    }

    /**
     * usable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsable(String value) {
        this.usable = value;
    }

    /**
     * baseHopeGroupYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseHopeGroupYn() {
        return baseHopeGroupYn;
    }

    /**
     * baseHopeGroupYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseHopeGroupYn(String value) {
        this.baseHopeGroupYn = value;
    }

    /**
     * hopeGroupStartTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHopeGroupStartTime() {
        return hopeGroupStartTime;
    }

    /**
     * hopeGroupStartTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHopeGroupStartTime(Integer value) {
        this.hopeGroupStartTime = value;
    }

    /**
     * hopeGroupEndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHopeGroupEndTime() {
        return hopeGroupEndTime;
    }

    /**
     * hopeGroupEndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHopeGroupEndTime(Integer value) {
        this.hopeGroupEndTime = value;
    }

    /**
     * regularHolidayList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RegularHolidayCodeListType }
     *     
     */
    public RegularHolidayCodeListType getRegularHolidayList() {
        return regularHolidayList;
    }

    /**
     * regularHolidayList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularHolidayCodeListType }
     *     
     */
    public void setRegularHolidayList(RegularHolidayCodeListType value) {
        this.regularHolidayList = value;
    }

    /**
     * ladderTruckUseComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLadderTruckUseComment() {
        return ladderTruckUseComment;
    }

    /**
     * ladderTruckUseComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLadderTruckUseComment(String value) {
        this.ladderTruckUseComment = value;
    }

    /**
     * productRemovalType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRemovalType() {
        return productRemovalType;
    }

    /**
     * productRemovalType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRemovalType(String value) {
        this.productRemovalType = value;
    }

    /**
     * hopeDeliveryGroupDayList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HopeDeliveryGroupDayListType }
     *     
     */
    public HopeDeliveryGroupDayListType getHopeDeliveryGroupDayList() {
        return hopeDeliveryGroupDayList;
    }

    /**
     * hopeDeliveryGroupDayList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HopeDeliveryGroupDayListType }
     *     
     */
    public void setHopeDeliveryGroupDayList(HopeDeliveryGroupDayListType value) {
        this.hopeDeliveryGroupDayList = value;
    }

}
