
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JewellerySummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="JewellerySummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Purity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BandMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Caution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Specification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProvideWarranty" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "JewellerySummaryType", propOrder = {
    "material",
    "purity",
    "bandMaterial",
    "weight",
    "manufacturer",
    "producer",
    "size",
    "caution",
    "specification",
    "provideWarranty",
    "warrantyPolicy",
    "afterServiceDirector"
})
public class JewellerySummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "Purity", required = true)
    protected String purity;
    @XmlElement(name = "BandMaterial")
    protected String bandMaterial;
    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Producer")
    protected String producer;
    @XmlElement(name = "Size", required = true)
    protected String size;
    @XmlElement(name = "Caution", required = true)
    protected String caution;
    @XmlElement(name = "Specification", required = true)
    protected String specification;
    @XmlElement(name = "ProvideWarranty", required = true)
    protected String provideWarranty;
    @XmlElement(name = "WarrantyPolicy", required = true)
    protected String warrantyPolicy;
    @XmlElement(name = "AfterServiceDirector", required = true)
    protected String afterServiceDirector;

    /**
     * material 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * material 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * purity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurity() {
        return purity;
    }

    /**
     * purity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurity(String value) {
        this.purity = value;
    }

    /**
     * bandMaterial 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandMaterial() {
        return bandMaterial;
    }

    /**
     * bandMaterial 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandMaterial(String value) {
        this.bandMaterial = value;
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
     * producer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * producer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
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
     * caution 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaution() {
        return caution;
    }

    /**
     * caution 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaution(String value) {
        this.caution = value;
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
     * provideWarranty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideWarranty() {
        return provideWarranty;
    }

    /**
     * provideWarranty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideWarranty(String value) {
        this.provideWarranty = value;
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
