
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DietFoodSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DietFoodSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseSummaryType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FoodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PackDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackDateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ingredients" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NutritionFacts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Specification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CautionAndSideEffect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NonMedicinalUsesMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GeneticallyModified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImportDeclarationCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsumerSafetyCaution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DietFoodSummaryType", propOrder = {
    "productName",
    "foodType",
    "producer",
    "location",
    "packDate",
    "packDateText",
    "expirationDate",
    "expirationDateText",
    "weight",
    "amount",
    "ingredients",
    "nutritionFacts",
    "specification",
    "cautionAndSideEffect",
    "nonMedicinalUsesMessage",
    "geneticallyModified",
    "importDeclarationCheck",
    "consumerSafetyCaution",
    "customerServicePhoneNumber"
})
public class DietFoodSummaryType
    extends BaseSummaryType
{

    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "FoodType", required = true)
    protected String foodType;
    @XmlElement(name = "Producer", required = true)
    protected String producer;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "PackDate")
    protected String packDate;
    @XmlElement(name = "PackDateText")
    protected String packDateText;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "ExpirationDateText")
    protected String expirationDateText;
    @XmlElement(name = "Weight", required = true)
    protected String weight;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "Ingredients", required = true)
    protected String ingredients;
    @XmlElement(name = "NutritionFacts", required = true)
    protected String nutritionFacts;
    @XmlElement(name = "Specification", required = true)
    protected String specification;
    @XmlElement(name = "CautionAndSideEffect", required = true)
    protected String cautionAndSideEffect;
    @XmlElement(name = "NonMedicinalUsesMessage", required = true)
    protected String nonMedicinalUsesMessage;
    @XmlElement(name = "GeneticallyModified", required = true)
    protected String geneticallyModified;
    @XmlElement(name = "ImportDeclarationCheck", required = true)
    protected String importDeclarationCheck;
    @XmlElement(name = "ConsumerSafetyCaution", required = true)
    protected String consumerSafetyCaution;
    @XmlElement(name = "CustomerServicePhoneNumber", required = true)
    protected String customerServicePhoneNumber;

    /**
     * productName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * productName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * foodType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * foodType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodType(String value) {
        this.foodType = value;
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
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * packDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackDate() {
        return packDate;
    }

    /**
     * packDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackDate(String value) {
        this.packDate = value;
    }

    /**
     * packDateText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackDateText() {
        return packDateText;
    }

    /**
     * packDateText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackDateText(String value) {
        this.packDateText = value;
    }

    /**
     * expirationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * expirationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * expirationDateText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDateText() {
        return expirationDateText;
    }

    /**
     * expirationDateText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDateText(String value) {
        this.expirationDateText = value;
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
     * amount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * ingredients 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * ingredients 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredients(String value) {
        this.ingredients = value;
    }

    /**
     * nutritionFacts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionFacts() {
        return nutritionFacts;
    }

    /**
     * nutritionFacts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionFacts(String value) {
        this.nutritionFacts = value;
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
     * cautionAndSideEffect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCautionAndSideEffect() {
        return cautionAndSideEffect;
    }

    /**
     * cautionAndSideEffect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCautionAndSideEffect(String value) {
        this.cautionAndSideEffect = value;
    }

    /**
     * nonMedicinalUsesMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonMedicinalUsesMessage() {
        return nonMedicinalUsesMessage;
    }

    /**
     * nonMedicinalUsesMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonMedicinalUsesMessage(String value) {
        this.nonMedicinalUsesMessage = value;
    }

    /**
     * geneticallyModified 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneticallyModified() {
        return geneticallyModified;
    }

    /**
     * geneticallyModified 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneticallyModified(String value) {
        this.geneticallyModified = value;
    }

    /**
     * importDeclarationCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDeclarationCheck() {
        return importDeclarationCheck;
    }

    /**
     * importDeclarationCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDeclarationCheck(String value) {
        this.importDeclarationCheck = value;
    }

    /**
     * consumerSafetyCaution 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSafetyCaution() {
        return consumerSafetyCaution;
    }

    /**
     * consumerSafetyCaution 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSafetyCaution(String value) {
        this.consumerSafetyCaution = value;
    }

    /**
     * customerServicePhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * customerServicePhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

}
