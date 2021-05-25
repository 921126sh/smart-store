
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ModelReturnType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ModelReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="WholeCategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ManufacturerCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelReturnType", propOrder = {
    "modelName",
    "modelId",
    "wholeCategoryName",
    "categoryId",
    "manufacturerName",
    "manufacturerCode",
    "brandName",
    "brandCode"
})
public class ModelReturnType {

    @XmlElement(name = "ModelName", required = true)
    protected String modelName;
    @XmlElement(name = "ModelId")
    protected long modelId;
    @XmlElement(name = "WholeCategoryName", required = true)
    protected String wholeCategoryName;
    @XmlElement(name = "CategoryId", required = true)
    protected String categoryId;
    @XmlElement(name = "ManufacturerName", required = true)
    protected String manufacturerName;
    @XmlElement(name = "ManufacturerCode")
    protected long manufacturerCode;
    @XmlElement(name = "BrandName", required = true)
    protected String brandName;
    @XmlElement(name = "BrandCode")
    protected long brandCode;

    /**
     * modelName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * modelName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * modelId 속성의 값을 가져옵니다.
     * 
     */
    public long getModelId() {
        return modelId;
    }

    /**
     * modelId 속성의 값을 설정합니다.
     * 
     */
    public void setModelId(long value) {
        this.modelId = value;
    }

    /**
     * wholeCategoryName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholeCategoryName() {
        return wholeCategoryName;
    }

    /**
     * wholeCategoryName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholeCategoryName(String value) {
        this.wholeCategoryName = value;
    }

    /**
     * categoryId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * categoryId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * manufacturerName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * manufacturerName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * manufacturerCode 속성의 값을 가져옵니다.
     * 
     */
    public long getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * manufacturerCode 속성의 값을 설정합니다.
     * 
     */
    public void setManufacturerCode(long value) {
        this.manufacturerCode = value;
    }

    /**
     * brandName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * brandName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * brandCode 속성의 값을 가져옵니다.
     * 
     */
    public long getBrandCode() {
        return brandCode;
    }

    /**
     * brandCode 속성의 값을 설정합니다.
     * 
     */
    public void setBrandCode(long value) {
        this.brandCode = value;
    }

}
