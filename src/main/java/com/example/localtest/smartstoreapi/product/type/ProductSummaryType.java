
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductSummaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineTicket" type="{http://shopn.platform.nhncorp.com/}AirlineTicketSummaryType" minOccurs="0"/>
 *         &lt;element name="Bag" type="{http://shopn.platform.nhncorp.com/}BagSummaryType" minOccurs="0"/>
 *         &lt;element name="Biochemistry" type="{http://shopn.platform.nhncorp.com/}BiochemistrySummaryType" minOccurs="0"/>
 *         &lt;element name="Biocidal" type="{http://shopn.platform.nhncorp.com/}BiocidalSummaryType" minOccurs="0"/>
 *         &lt;element name="Books" type="{http://shopn.platform.nhncorp.com/}BooksSummaryType" minOccurs="0"/>
 *         &lt;element name="CarArticles" type="{http://shopn.platform.nhncorp.com/}CarArticlesSummaryType" minOccurs="0"/>
 *         &lt;element name="Cellphone" type="{http://shopn.platform.nhncorp.com/}CellphoneSummaryType" minOccurs="0"/>
 *         &lt;element name="Cosmetic" type="{http://shopn.platform.nhncorp.com/}CosmeticSummaryType" minOccurs="0"/>
 *         &lt;element name="DietFood" type="{http://shopn.platform.nhncorp.com/}DietFoodSummaryType" minOccurs="0"/>
 *         &lt;element name="DigitalContents" type="{http://shopn.platform.nhncorp.com/}DigitalContentsSummaryType" minOccurs="0"/>
 *         &lt;element name="Etc" type="{http://shopn.platform.nhncorp.com/}EtcSummaryType" minOccurs="0"/>
 *         &lt;element name="EtcService" type="{http://shopn.platform.nhncorp.com/}EtcServiceSummaryType" minOccurs="0"/>
 *         &lt;element name="FashionItems" type="{http://shopn.platform.nhncorp.com/}FashionItemsSummaryType" minOccurs="0"/>
 *         &lt;element name="Food" type="{http://shopn.platform.nhncorp.com/}FoodSummaryType" minOccurs="0"/>
 *         &lt;element name="Furniture" type="{http://shopn.platform.nhncorp.com/}FurnitureSummaryType" minOccurs="0"/>
 *         &lt;element name="GeneralFood" type="{http://shopn.platform.nhncorp.com/}GeneralFoodSummaryType" minOccurs="0"/>
 *         &lt;element name="GiftCard" type="{http://shopn.platform.nhncorp.com/}GiftCardSummaryType" minOccurs="0"/>
 *         &lt;element name="HomeAppliances" type="{http://shopn.platform.nhncorp.com/}HomeAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="ImageAppliances" type="{http://shopn.platform.nhncorp.com/}ImageAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="Jewellery" type="{http://shopn.platform.nhncorp.com/}JewellerySummaryType" minOccurs="0"/>
 *         &lt;element name="Kids" type="{http://shopn.platform.nhncorp.com/}KidsSummaryType" minOccurs="0"/>
 *         &lt;element name="KitchenUtensils" type="{http://shopn.platform.nhncorp.com/}KitchenUtensilsSummaryType" minOccurs="0"/>
 *         &lt;element name="LodgmentReservation" type="{http://shopn.platform.nhncorp.com/}LodgmentReservationSummaryType" minOccurs="0"/>
 *         &lt;element name="MedicalAppliances" type="{http://shopn.platform.nhncorp.com/}MedicalAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="MicroElectronics" type="{http://shopn.platform.nhncorp.com/}MicroElectronicsSummaryType" minOccurs="0"/>
 *         &lt;element name="MobileCoupon" type="{http://shopn.platform.nhncorp.com/}MobileCouponSummaryType" minOccurs="0"/>
 *         &lt;element name="MovieShow" type="{http://shopn.platform.nhncorp.com/}MovieShowSummaryType" minOccurs="0"/>
 *         &lt;element name="MusicalInstrument" type="{http://shopn.platform.nhncorp.com/}MusicalInstrumentSummaryType" minOccurs="0"/>
 *         &lt;element name="Navigation" type="{http://shopn.platform.nhncorp.com/}NavigationSummaryType" minOccurs="0"/>
 *         &lt;element name="OfficeAppliances" type="{http://shopn.platform.nhncorp.com/}OfficeAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="OpticsAppliances" type="{http://shopn.platform.nhncorp.com/}OpticsAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="RentCar" type="{http://shopn.platform.nhncorp.com/}RentCarSummaryType" minOccurs="0"/>
 *         &lt;element name="RentalEtc" type="{http://shopn.platform.nhncorp.com/}RentalEtcSummaryType" minOccurs="0"/>
 *         &lt;element name="RentalHa" type="{http://shopn.platform.nhncorp.com/}RentalHaSummaryType" minOccurs="0"/>
 *         &lt;element name="SeasonAppliances" type="{http://shopn.platform.nhncorp.com/}SeasonAppliancesSummaryType" minOccurs="0"/>
 *         &lt;element name="Shoes" type="{http://shopn.platform.nhncorp.com/}ShoesSummaryType" minOccurs="0"/>
 *         &lt;element name="SleepingGear" type="{http://shopn.platform.nhncorp.com/}SleepingGearSummaryType" minOccurs="0"/>
 *         &lt;element name="SportsEquipment" type="{http://shopn.platform.nhncorp.com/}SportsEquipmentSummaryType" minOccurs="0"/>
 *         &lt;element name="TravelPackage" type="{http://shopn.platform.nhncorp.com/}TravelPackageSummaryType" minOccurs="0"/>
 *         &lt;element name="Wear" type="{http://shopn.platform.nhncorp.com/}WearSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSummaryType", propOrder = {
    "airlineTicket",
    "bag",
    "biochemistry",
    "biocidal",
    "books",
    "carArticles",
    "cellphone",
    "cosmetic",
    "dietFood",
    "digitalContents",
    "etc",
    "etcService",
    "fashionItems",
    "food",
    "furniture",
    "generalFood",
    "giftCard",
    "homeAppliances",
    "imageAppliances",
    "jewellery",
    "kids",
    "kitchenUtensils",
    "lodgmentReservation",
    "medicalAppliances",
    "microElectronics",
    "mobileCoupon",
    "movieShow",
    "musicalInstrument",
    "navigation",
    "officeAppliances",
    "opticsAppliances",
    "rentCar",
    "rentalEtc",
    "rentalHa",
    "seasonAppliances",
    "shoes",
    "sleepingGear",
    "sportsEquipment",
    "travelPackage",
    "wear"
})
public class ProductSummaryType {

    @XmlElement(name = "AirlineTicket")
    protected AirlineTicketSummaryType airlineTicket;
    @XmlElement(name = "Bag")
    protected BagSummaryType bag;
    @XmlElement(name = "Biochemistry")
    protected BiochemistrySummaryType biochemistry;
    @XmlElement(name = "Biocidal")
    protected BiocidalSummaryType biocidal;
    @XmlElement(name = "Books")
    protected BooksSummaryType books;
    @XmlElement(name = "CarArticles")
    protected CarArticlesSummaryType carArticles;
    @XmlElement(name = "Cellphone")
    protected CellphoneSummaryType cellphone;
    @XmlElement(name = "Cosmetic")
    protected CosmeticSummaryType cosmetic;
    @XmlElement(name = "DietFood")
    protected DietFoodSummaryType dietFood;
    @XmlElement(name = "DigitalContents")
    protected DigitalContentsSummaryType digitalContents;
    @XmlElement(name = "Etc")
    protected EtcSummaryType etc;
    @XmlElement(name = "EtcService")
    protected EtcServiceSummaryType etcService;
    @XmlElement(name = "FashionItems")
    protected FashionItemsSummaryType fashionItems;
    @XmlElement(name = "Food")
    protected FoodSummaryType food;
    @XmlElement(name = "Furniture")
    protected FurnitureSummaryType furniture;
    @XmlElement(name = "GeneralFood")
    protected GeneralFoodSummaryType generalFood;
    @XmlElement(name = "GiftCard")
    protected GiftCardSummaryType giftCard;
    @XmlElement(name = "HomeAppliances")
    protected HomeAppliancesSummaryType homeAppliances;
    @XmlElement(name = "ImageAppliances")
    protected ImageAppliancesSummaryType imageAppliances;
    @XmlElement(name = "Jewellery")
    protected JewellerySummaryType jewellery;
    @XmlElement(name = "Kids")
    protected KidsSummaryType kids;
    @XmlElement(name = "KitchenUtensils")
    protected KitchenUtensilsSummaryType kitchenUtensils;
    @XmlElement(name = "LodgmentReservation")
    protected LodgmentReservationSummaryType lodgmentReservation;
    @XmlElement(name = "MedicalAppliances")
    protected MedicalAppliancesSummaryType medicalAppliances;
    @XmlElement(name = "MicroElectronics")
    protected MicroElectronicsSummaryType microElectronics;
    @XmlElement(name = "MobileCoupon")
    protected MobileCouponSummaryType mobileCoupon;
    @XmlElement(name = "MovieShow")
    protected MovieShowSummaryType movieShow;
    @XmlElement(name = "MusicalInstrument")
    protected MusicalInstrumentSummaryType musicalInstrument;
    @XmlElement(name = "Navigation")
    protected NavigationSummaryType navigation;
    @XmlElement(name = "OfficeAppliances")
    protected OfficeAppliancesSummaryType officeAppliances;
    @XmlElement(name = "OpticsAppliances")
    protected OpticsAppliancesSummaryType opticsAppliances;
    @XmlElement(name = "RentCar")
    protected RentCarSummaryType rentCar;
    @XmlElement(name = "RentalEtc")
    protected RentalEtcSummaryType rentalEtc;
    @XmlElement(name = "RentalHa")
    protected RentalHaSummaryType rentalHa;
    @XmlElement(name = "SeasonAppliances")
    protected SeasonAppliancesSummaryType seasonAppliances;
    @XmlElement(name = "Shoes")
    protected ShoesSummaryType shoes;
    @XmlElement(name = "SleepingGear")
    protected SleepingGearSummaryType sleepingGear;
    @XmlElement(name = "SportsEquipment")
    protected SportsEquipmentSummaryType sportsEquipment;
    @XmlElement(name = "TravelPackage")
    protected TravelPackageSummaryType travelPackage;
    @XmlElement(name = "Wear")
    protected WearSummaryType wear;

    /**
     * airlineTicket 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineTicketSummaryType }
     *     
     */
    public AirlineTicketSummaryType getAirlineTicket() {
        return airlineTicket;
    }

    /**
     * airlineTicket 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineTicketSummaryType }
     *     
     */
    public void setAirlineTicket(AirlineTicketSummaryType value) {
        this.airlineTicket = value;
    }

    /**
     * bag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BagSummaryType }
     *     
     */
    public BagSummaryType getBag() {
        return bag;
    }

    /**
     * bag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BagSummaryType }
     *     
     */
    public void setBag(BagSummaryType value) {
        this.bag = value;
    }

    /**
     * biochemistry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BiochemistrySummaryType }
     *     
     */
    public BiochemistrySummaryType getBiochemistry() {
        return biochemistry;
    }

    /**
     * biochemistry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BiochemistrySummaryType }
     *     
     */
    public void setBiochemistry(BiochemistrySummaryType value) {
        this.biochemistry = value;
    }

    /**
     * biocidal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BiocidalSummaryType }
     *     
     */
    public BiocidalSummaryType getBiocidal() {
        return biocidal;
    }

    /**
     * biocidal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BiocidalSummaryType }
     *     
     */
    public void setBiocidal(BiocidalSummaryType value) {
        this.biocidal = value;
    }

    /**
     * books 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooksSummaryType }
     *     
     */
    public BooksSummaryType getBooks() {
        return books;
    }

    /**
     * books 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooksSummaryType }
     *     
     */
    public void setBooks(BooksSummaryType value) {
        this.books = value;
    }

    /**
     * carArticles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CarArticlesSummaryType }
     *     
     */
    public CarArticlesSummaryType getCarArticles() {
        return carArticles;
    }

    /**
     * carArticles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CarArticlesSummaryType }
     *     
     */
    public void setCarArticles(CarArticlesSummaryType value) {
        this.carArticles = value;
    }

    /**
     * cellphone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellphoneSummaryType }
     *     
     */
    public CellphoneSummaryType getCellphone() {
        return cellphone;
    }

    /**
     * cellphone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellphoneSummaryType }
     *     
     */
    public void setCellphone(CellphoneSummaryType value) {
        this.cellphone = value;
    }

    /**
     * cosmetic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CosmeticSummaryType }
     *     
     */
    public CosmeticSummaryType getCosmetic() {
        return cosmetic;
    }

    /**
     * cosmetic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CosmeticSummaryType }
     *     
     */
    public void setCosmetic(CosmeticSummaryType value) {
        this.cosmetic = value;
    }

    /**
     * dietFood 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DietFoodSummaryType }
     *     
     */
    public DietFoodSummaryType getDietFood() {
        return dietFood;
    }

    /**
     * dietFood 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DietFoodSummaryType }
     *     
     */
    public void setDietFood(DietFoodSummaryType value) {
        this.dietFood = value;
    }

    /**
     * digitalContents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DigitalContentsSummaryType }
     *     
     */
    public DigitalContentsSummaryType getDigitalContents() {
        return digitalContents;
    }

    /**
     * digitalContents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalContentsSummaryType }
     *     
     */
    public void setDigitalContents(DigitalContentsSummaryType value) {
        this.digitalContents = value;
    }

    /**
     * etc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EtcSummaryType }
     *     
     */
    public EtcSummaryType getEtc() {
        return etc;
    }

    /**
     * etc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EtcSummaryType }
     *     
     */
    public void setEtc(EtcSummaryType value) {
        this.etc = value;
    }

    /**
     * etcService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EtcServiceSummaryType }
     *     
     */
    public EtcServiceSummaryType getEtcService() {
        return etcService;
    }

    /**
     * etcService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EtcServiceSummaryType }
     *     
     */
    public void setEtcService(EtcServiceSummaryType value) {
        this.etcService = value;
    }

    /**
     * fashionItems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FashionItemsSummaryType }
     *     
     */
    public FashionItemsSummaryType getFashionItems() {
        return fashionItems;
    }

    /**
     * fashionItems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FashionItemsSummaryType }
     *     
     */
    public void setFashionItems(FashionItemsSummaryType value) {
        this.fashionItems = value;
    }

    /**
     * food 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FoodSummaryType }
     *     
     */
    public FoodSummaryType getFood() {
        return food;
    }

    /**
     * food 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodSummaryType }
     *     
     */
    public void setFood(FoodSummaryType value) {
        this.food = value;
    }

    /**
     * furniture 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FurnitureSummaryType }
     *     
     */
    public FurnitureSummaryType getFurniture() {
        return furniture;
    }

    /**
     * furniture 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FurnitureSummaryType }
     *     
     */
    public void setFurniture(FurnitureSummaryType value) {
        this.furniture = value;
    }

    /**
     * generalFood 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GeneralFoodSummaryType }
     *     
     */
    public GeneralFoodSummaryType getGeneralFood() {
        return generalFood;
    }

    /**
     * generalFood 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralFoodSummaryType }
     *     
     */
    public void setGeneralFood(GeneralFoodSummaryType value) {
        this.generalFood = value;
    }

    /**
     * giftCard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardSummaryType }
     *     
     */
    public GiftCardSummaryType getGiftCard() {
        return giftCard;
    }

    /**
     * giftCard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardSummaryType }
     *     
     */
    public void setGiftCard(GiftCardSummaryType value) {
        this.giftCard = value;
    }

    /**
     * homeAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HomeAppliancesSummaryType }
     *     
     */
    public HomeAppliancesSummaryType getHomeAppliances() {
        return homeAppliances;
    }

    /**
     * homeAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeAppliancesSummaryType }
     *     
     */
    public void setHomeAppliances(HomeAppliancesSummaryType value) {
        this.homeAppliances = value;
    }

    /**
     * imageAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ImageAppliancesSummaryType }
     *     
     */
    public ImageAppliancesSummaryType getImageAppliances() {
        return imageAppliances;
    }

    /**
     * imageAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAppliancesSummaryType }
     *     
     */
    public void setImageAppliances(ImageAppliancesSummaryType value) {
        this.imageAppliances = value;
    }

    /**
     * jewellery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JewellerySummaryType }
     *     
     */
    public JewellerySummaryType getJewellery() {
        return jewellery;
    }

    /**
     * jewellery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JewellerySummaryType }
     *     
     */
    public void setJewellery(JewellerySummaryType value) {
        this.jewellery = value;
    }

    /**
     * kids 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link KidsSummaryType }
     *     
     */
    public KidsSummaryType getKids() {
        return kids;
    }

    /**
     * kids 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link KidsSummaryType }
     *     
     */
    public void setKids(KidsSummaryType value) {
        this.kids = value;
    }

    /**
     * kitchenUtensils 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link KitchenUtensilsSummaryType }
     *     
     */
    public KitchenUtensilsSummaryType getKitchenUtensils() {
        return kitchenUtensils;
    }

    /**
     * kitchenUtensils 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link KitchenUtensilsSummaryType }
     *     
     */
    public void setKitchenUtensils(KitchenUtensilsSummaryType value) {
        this.kitchenUtensils = value;
    }

    /**
     * lodgmentReservation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LodgmentReservationSummaryType }
     *     
     */
    public LodgmentReservationSummaryType getLodgmentReservation() {
        return lodgmentReservation;
    }

    /**
     * lodgmentReservation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgmentReservationSummaryType }
     *     
     */
    public void setLodgmentReservation(LodgmentReservationSummaryType value) {
        this.lodgmentReservation = value;
    }

    /**
     * medicalAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MedicalAppliancesSummaryType }
     *     
     */
    public MedicalAppliancesSummaryType getMedicalAppliances() {
        return medicalAppliances;
    }

    /**
     * medicalAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalAppliancesSummaryType }
     *     
     */
    public void setMedicalAppliances(MedicalAppliancesSummaryType value) {
        this.medicalAppliances = value;
    }

    /**
     * microElectronics 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MicroElectronicsSummaryType }
     *     
     */
    public MicroElectronicsSummaryType getMicroElectronics() {
        return microElectronics;
    }

    /**
     * microElectronics 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MicroElectronicsSummaryType }
     *     
     */
    public void setMicroElectronics(MicroElectronicsSummaryType value) {
        this.microElectronics = value;
    }

    /**
     * mobileCoupon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MobileCouponSummaryType }
     *     
     */
    public MobileCouponSummaryType getMobileCoupon() {
        return mobileCoupon;
    }

    /**
     * mobileCoupon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCouponSummaryType }
     *     
     */
    public void setMobileCoupon(MobileCouponSummaryType value) {
        this.mobileCoupon = value;
    }

    /**
     * movieShow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MovieShowSummaryType }
     *     
     */
    public MovieShowSummaryType getMovieShow() {
        return movieShow;
    }

    /**
     * movieShow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieShowSummaryType }
     *     
     */
    public void setMovieShow(MovieShowSummaryType value) {
        this.movieShow = value;
    }

    /**
     * musicalInstrument 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MusicalInstrumentSummaryType }
     *     
     */
    public MusicalInstrumentSummaryType getMusicalInstrument() {
        return musicalInstrument;
    }

    /**
     * musicalInstrument 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MusicalInstrumentSummaryType }
     *     
     */
    public void setMusicalInstrument(MusicalInstrumentSummaryType value) {
        this.musicalInstrument = value;
    }

    /**
     * navigation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NavigationSummaryType }
     *     
     */
    public NavigationSummaryType getNavigation() {
        return navigation;
    }

    /**
     * navigation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationSummaryType }
     *     
     */
    public void setNavigation(NavigationSummaryType value) {
        this.navigation = value;
    }

    /**
     * officeAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OfficeAppliancesSummaryType }
     *     
     */
    public OfficeAppliancesSummaryType getOfficeAppliances() {
        return officeAppliances;
    }

    /**
     * officeAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeAppliancesSummaryType }
     *     
     */
    public void setOfficeAppliances(OfficeAppliancesSummaryType value) {
        this.officeAppliances = value;
    }

    /**
     * opticsAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OpticsAppliancesSummaryType }
     *     
     */
    public OpticsAppliancesSummaryType getOpticsAppliances() {
        return opticsAppliances;
    }

    /**
     * opticsAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticsAppliancesSummaryType }
     *     
     */
    public void setOpticsAppliances(OpticsAppliancesSummaryType value) {
        this.opticsAppliances = value;
    }

    /**
     * rentCar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RentCarSummaryType }
     *     
     */
    public RentCarSummaryType getRentCar() {
        return rentCar;
    }

    /**
     * rentCar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RentCarSummaryType }
     *     
     */
    public void setRentCar(RentCarSummaryType value) {
        this.rentCar = value;
    }

    /**
     * rentalEtc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RentalEtcSummaryType }
     *     
     */
    public RentalEtcSummaryType getRentalEtc() {
        return rentalEtc;
    }

    /**
     * rentalEtc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalEtcSummaryType }
     *     
     */
    public void setRentalEtc(RentalEtcSummaryType value) {
        this.rentalEtc = value;
    }

    /**
     * rentalHa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RentalHaSummaryType }
     *     
     */
    public RentalHaSummaryType getRentalHa() {
        return rentalHa;
    }

    /**
     * rentalHa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalHaSummaryType }
     *     
     */
    public void setRentalHa(RentalHaSummaryType value) {
        this.rentalHa = value;
    }

    /**
     * seasonAppliances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SeasonAppliancesSummaryType }
     *     
     */
    public SeasonAppliancesSummaryType getSeasonAppliances() {
        return seasonAppliances;
    }

    /**
     * seasonAppliances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonAppliancesSummaryType }
     *     
     */
    public void setSeasonAppliances(SeasonAppliancesSummaryType value) {
        this.seasonAppliances = value;
    }

    /**
     * shoes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShoesSummaryType }
     *     
     */
    public ShoesSummaryType getShoes() {
        return shoes;
    }

    /**
     * shoes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoesSummaryType }
     *     
     */
    public void setShoes(ShoesSummaryType value) {
        this.shoes = value;
    }

    /**
     * sleepingGear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SleepingGearSummaryType }
     *     
     */
    public SleepingGearSummaryType getSleepingGear() {
        return sleepingGear;
    }

    /**
     * sleepingGear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SleepingGearSummaryType }
     *     
     */
    public void setSleepingGear(SleepingGearSummaryType value) {
        this.sleepingGear = value;
    }

    /**
     * sportsEquipment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SportsEquipmentSummaryType }
     *     
     */
    public SportsEquipmentSummaryType getSportsEquipment() {
        return sportsEquipment;
    }

    /**
     * sportsEquipment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SportsEquipmentSummaryType }
     *     
     */
    public void setSportsEquipment(SportsEquipmentSummaryType value) {
        this.sportsEquipment = value;
    }

    /**
     * travelPackage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TravelPackageSummaryType }
     *     
     */
    public TravelPackageSummaryType getTravelPackage() {
        return travelPackage;
    }

    /**
     * travelPackage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPackageSummaryType }
     *     
     */
    public void setTravelPackage(TravelPackageSummaryType value) {
        this.travelPackage = value;
    }

    /**
     * wear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WearSummaryType }
     *     
     */
    public WearSummaryType getWear() {
        return wear;
    }

    /**
     * wear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WearSummaryType }
     *     
     */
    public void setWear(WearSummaryType value) {
        this.wear = value;
    }

}
