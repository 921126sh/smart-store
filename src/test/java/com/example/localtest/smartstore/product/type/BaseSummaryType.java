
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.*;


/**
 * <p>BaseSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoRefundReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnCostReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QualityAssuranceStandard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompensationProcedure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TroubleShootingContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSummaryType", propOrder = {
    "noRefundReason",
    "returnCostReason",
    "qualityAssuranceStandard",
    "compensationProcedure",
    "troubleShootingContents"
})
@XmlSeeAlso({
    GiftCardSummaryType.class,
    RentalHaSummaryType.class,
    LodgmentReservationSummaryType.class,
    MedicalAppliancesSummaryType.class,
    HomeAppliancesSummaryType.class,
    OpticsAppliancesSummaryType.class,
    SportsEquipmentSummaryType.class,
    RentalEtcSummaryType.class,
    BiochemistrySummaryType.class,
    RentCarSummaryType.class,
    KidsSummaryType.class,
    BiocidalSummaryType.class,
    FashionItemsSummaryType.class,
    TravelPackageSummaryType.class,
    FoodSummaryType.class,
    AirlineTicketSummaryType.class,
    KitchenUtensilsSummaryType.class,
    ImageAppliancesSummaryType.class,
    BagSummaryType.class,
    MovieShowSummaryType.class,
    GeneralFoodSummaryType.class,
    CarArticlesSummaryType.class,
    MicroElectronicsSummaryType.class,
    EtcServiceSummaryType.class,
    ShoesSummaryType.class,
    CosmeticSummaryType.class,
    SleepingGearSummaryType.class,
    FurnitureSummaryType.class,
    CellphoneSummaryType.class,
    WearSummaryType.class,
    EtcSummaryType.class,
    OfficeAppliancesSummaryType.class,
    JewellerySummaryType.class,
    MusicalInstrumentSummaryType.class,
    BooksSummaryType.class,
    MobileCouponSummaryType.class,
    DietFoodSummaryType.class,
    NavigationSummaryType.class,
    DigitalContentsSummaryType.class,
    SeasonAppliancesSummaryType.class
})
public abstract class BaseSummaryType {

    @XmlElement(name = "NoRefundReason", required = true)
    protected String noRefundReason;
    @XmlElement(name = "ReturnCostReason", required = true)
    protected String returnCostReason;
    @XmlElement(name = "QualityAssuranceStandard", required = true)
    protected String qualityAssuranceStandard;
    @XmlElement(name = "CompensationProcedure", required = true)
    protected String compensationProcedure;
    @XmlElement(name = "TroubleShootingContents", required = true)
    protected String troubleShootingContents;

    /**
     * noRefundReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRefundReason() {
        return noRefundReason;
    }

    /**
     * noRefundReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRefundReason(String value) {
        this.noRefundReason = value;
    }

    /**
     * returnCostReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCostReason() {
        return returnCostReason;
    }

    /**
     * returnCostReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCostReason(String value) {
        this.returnCostReason = value;
    }

    /**
     * qualityAssuranceStandard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityAssuranceStandard() {
        return qualityAssuranceStandard;
    }

    /**
     * qualityAssuranceStandard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityAssuranceStandard(String value) {
        this.qualityAssuranceStandard = value;
    }

    /**
     * compensationProcedure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationProcedure() {
        return compensationProcedure;
    }

    /**
     * compensationProcedure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationProcedure(String value) {
        this.compensationProcedure = value;
    }

    /**
     * troubleShootingContents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleShootingContents() {
        return troubleShootingContents;
    }

    /**
     * troubleShootingContents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleShootingContents(String value) {
        this.troubleShootingContents = value;
    }

}
