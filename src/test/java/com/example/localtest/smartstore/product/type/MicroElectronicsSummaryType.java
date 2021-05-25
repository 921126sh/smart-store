
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MicroElectronicsSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MicroElectronicsSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Certified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RatedVoltage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PowerConsumption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Specification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarrantyPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AfterServiceDirector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicroElectronicsSummaryType", propOrder = {
    "itemName",
    "modelName",
    "certified",
    "ratedVoltage",
    "powerConsumption",
    "releaseDate",
    "releaseDateText",
    "manufacturer",
    "size",
    "weight",
    "specification",
    "warrantyPolicy",
    "afterServiceDirector"
})
public class MicroElectronicsSummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "ModelName", required = true)
    protected String modelName;
    @XmlElement(name = "Certified", required = true)
    protected String certified;
    @XmlElement(name = "RatedVoltage", required = true)
    protected String ratedVoltage;
    @XmlElement(name = "PowerConsumption", required = true)
    protected String powerConsumption;
    @XmlElement(name = "ReleaseDate")
    protected String releaseDate;
    @XmlElement(name = "ReleaseDateText")
    protected String releaseDateText;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Size", required = true)
    protected String size;
    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "Specification", required = true)
    protected String specification;
    @XmlElement(name = "WarrantyPolicy", required = true)
    protected String warrantyPolicy;
    @XmlElement(name = "AfterServiceDirector", required = true)
    protected String afterServiceDirector;

    /**
     * itemName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * itemName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

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
     * certified 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertified() {
        return certified;
    }

    /**
     * certified 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertified(String value) {
        this.certified = value;
    }

    /**
     * ratedVoltage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * ratedVoltage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatedVoltage(String value) {
        this.ratedVoltage = value;
    }

    /**
     * powerConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * powerConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerConsumption(String value) {
        this.powerConsumption = value;
    }

    /**
     * releaseDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * releaseDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    /**
     * releaseDateText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDateText() {
        return releaseDateText;
    }

    /**
     * releaseDateText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDateText(String value) {
        this.releaseDateText = value;
    }

    /**
     * manufacturer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * manufacturer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * size 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * size 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * weight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * weight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * specification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * specification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

    /**
     * warrantyPolicy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyPolicy() {
        return warrantyPolicy;
    }

    /**
     * warrantyPolicy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyPolicy(String value) {
        this.warrantyPolicy = value;
    }

    /**
     * afterServiceDirector 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterServiceDirector() {
        return afterServiceDirector;
    }

    /**
     * afterServiceDirector 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterServiceDirector(String value) {
        this.afterServiceDirector = value;
    }

}
