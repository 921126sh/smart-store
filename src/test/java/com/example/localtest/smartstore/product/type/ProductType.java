
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StatusType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomMade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseReturnCancelNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LayoutType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PublicityPhraseContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicityPhraseStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicityPhraseEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerManagementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://shopn.platform.nhncorp.com/}ModelType" minOccurs="0"/>
 *         &lt;element name="ProductAttributeList" type="{http://shopn.platform.nhncorp.com/}ProductAttributeListType" minOccurs="0"/>
 *         &lt;element name="CertificationList" type="{http://shopn.platform.nhncorp.com/}CertificationListType" minOccurs="0"/>
 *         &lt;element name="ChildCertifiedProductExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KCCertifiedProductExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KCExemptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GreenCertifiedProductExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginArea" type="{http://shopn.platform.nhncorp.com/}OriginAreaType"/>
 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MinorPurchasable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Image" type="{http://shopn.platform.nhncorp.com/}ImageType"/>
 *         &lt;element name="DetailContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerNoticeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AfterServiceTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AfterServiceGuideContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseReviewExposure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegularCustomerExclusiveProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KnowledgeShoppingProductRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GalleryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StockQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinPurchaseQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxPurchaseQuantityPerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxPurchaseQuantityPerOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Delivery" type="{http://shopn.platform.nhncorp.com/}DeliveryType" minOccurs="0"/>
 *         &lt;element name="SellerDiscount" type="{http://shopn.platform.nhncorp.com/}SellerDiscountType" minOccurs="0"/>
 *         &lt;element name="MultiPurchaseDiscount" type="{http://shopn.platform.nhncorp.com/}MultiPurchaseDiscountType" minOccurs="0"/>
 *         &lt;element name="Mileage" type="{http://shopn.platform.nhncorp.com/}MileageType" minOccurs="0"/>
 *         &lt;element name="Stamp" type="{http://shopn.platform.nhncorp.com/}StampType" minOccurs="0"/>
 *         &lt;element name="ReviewPoint" type="{http://shopn.platform.nhncorp.com/}ReviewPointType" minOccurs="0"/>
 *         &lt;element name="FreeInterest" type="{http://shopn.platform.nhncorp.com/}FreeInterestType" minOccurs="0"/>
 *         &lt;element name="Gift" type="{http://shopn.platform.nhncorp.com/}GiftType" minOccurs="0"/>
 *         &lt;element name="ECoupon" type="{http://shopn.platform.nhncorp.com/}ECouponType" minOccurs="0"/>
 *         &lt;element name="PurchaseApplicationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellPhonePrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WifiOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSummary" type="{http://shopn.platform.nhncorp.com/}ProductSummaryType" minOccurs="0"/>
 *         &lt;element name="SellerCommentUsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerCommentContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerCustomCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerCustomCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://shopn.platform.nhncorp.com/}AdditionalInfoType" minOccurs="0"/>
 *         &lt;element name="Isbn13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndependentPublicationYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CultureCostIncomeDeductionYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomProductYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItselfProductionProductYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandCertificationYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "productId",
    "statusType",
    "saleType",
    "customMade",
    "useReturnCancelNotification",
    "estimatedDeliveryTime",
    "categoryId",
    "layoutType",
    "name",
    "publicityPhraseContent",
    "publicityPhraseStartDate",
    "publicityPhraseEndDate",
    "sellerManagementCode",
    "sellerBarCode",
    "model",
    "productAttributeList",
    "certificationList",
    "childCertifiedProductExclusion",
    "kcCertifiedProductExclusion",
    "kcExemptionType",
    "greenCertifiedProductExclusion",
    "originArea",
    "manufactureDate",
    "validDate",
    "taxType",
    "minorPurchasable",
    "image",
    "detailContent",
    "sellerNoticeId",
    "afterServiceTelephoneNumber",
    "afterServiceGuideContent",
    "purchaseReviewExposure",
    "regularCustomerExclusiveProduct",
    "knowledgeShoppingProductRegistration",
    "galleryId",
    "saleStartDate",
    "saleEndDate",
    "salePrice",
    "stockQuantity",
    "minPurchaseQuantity",
    "maxPurchaseQuantityPerId",
    "maxPurchaseQuantityPerOrder",
    "delivery",
    "sellerDiscount",
    "multiPurchaseDiscount",
    "mileage",
    "stamp",
    "reviewPoint",
    "freeInterest",
    "gift",
    "eCoupon",
    "purchaseApplicationUrl",
    "cellPhonePrice",
    "wifiOnly",
    "productSummary",
    "sellerCommentUsable",
    "sellerCommentContent",
    "sellerCustomCode1",
    "sellerCustomCode2",
    "additionalInfo",
    "isbn13",
    "independentPublicationYn",
    "cultureCostIncomeDeductionYn",
    "customProductYn",
    "itselfProductionProductYn",
    "brandCertificationYn"
})
public class ProductType {

    @XmlElement(name = "ProductId")
    protected Long productId;
    @XmlElement(name = "StatusType", required = true)
    protected String statusType;
    @XmlElement(name = "SaleType")
    protected String saleType;
    @XmlElement(name = "CustomMade")
    protected String customMade;
    @XmlElement(name = "UseReturnCancelNotification")
    protected String useReturnCancelNotification;
    @XmlElement(name = "EstimatedDeliveryTime")
    protected String estimatedDeliveryTime;
    @XmlElement(name = "CategoryId")
    protected String categoryId;
    @XmlElement(name = "LayoutType")
    protected String layoutType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "PublicityPhraseContent")
    protected String publicityPhraseContent;
    @XmlElement(name = "PublicityPhraseStartDate")
    protected String publicityPhraseStartDate;
    @XmlElement(name = "PublicityPhraseEndDate")
    protected String publicityPhraseEndDate;
    @XmlElement(name = "SellerManagementCode")
    protected String sellerManagementCode;
    @XmlElement(name = "SellerBarCode")
    protected String sellerBarCode;
    @XmlElement(name = "Model")
    protected ModelType model;
    @XmlElement(name = "ProductAttributeList")
    protected ProductAttributeListType productAttributeList;
    @XmlElement(name = "CertificationList")
    protected CertificationListType certificationList;
    @XmlElement(name = "ChildCertifiedProductExclusion")
    protected String childCertifiedProductExclusion;
    @XmlElement(name = "KCCertifiedProductExclusion")
    protected String kcCertifiedProductExclusion;
    @XmlElement(name = "KCExemptionType")
    protected String kcExemptionType;
    @XmlElement(name = "GreenCertifiedProductExclusion")
    protected String greenCertifiedProductExclusion;
    @XmlElement(name = "OriginArea", required = true)
    protected OriginAreaType originArea;
    @XmlElement(name = "ManufactureDate")
    protected String manufactureDate;
    @XmlElement(name = "ValidDate")
    protected String validDate;
    @XmlElement(name = "TaxType", required = true)
    protected String taxType;
    @XmlElement(name = "MinorPurchasable", required = true)
    protected String minorPurchasable;
    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "DetailContent")
    protected String detailContent;
    @XmlElement(name = "SellerNoticeId")
    protected Long sellerNoticeId;
    @XmlElement(name = "AfterServiceTelephoneNumber", required = true)
    protected String afterServiceTelephoneNumber;
    @XmlElement(name = "AfterServiceGuideContent", required = true)
    protected String afterServiceGuideContent;
    @XmlElement(name = "PurchaseReviewExposure")
    protected String purchaseReviewExposure;
    @XmlElement(name = "RegularCustomerExclusiveProduct")
    protected String regularCustomerExclusiveProduct;
    @XmlElement(name = "KnowledgeShoppingProductRegistration")
    protected String knowledgeShoppingProductRegistration;
    @XmlElement(name = "GalleryId")
    protected Long galleryId;
    @XmlElement(name = "SaleStartDate")
    protected String saleStartDate;
    @XmlElement(name = "SaleEndDate")
    protected String saleEndDate;
    @XmlElement(name = "SalePrice")
    protected long salePrice;
    @XmlElement(name = "StockQuantity")
    protected Long stockQuantity;
    @XmlElement(name = "MinPurchaseQuantity")
    protected Integer minPurchaseQuantity;
    @XmlElement(name = "MaxPurchaseQuantityPerId")
    protected Long maxPurchaseQuantityPerId;
    @XmlElement(name = "MaxPurchaseQuantityPerOrder")
    protected Long maxPurchaseQuantityPerOrder;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "SellerDiscount")
    protected SellerDiscountType sellerDiscount;
    @XmlElement(name = "MultiPurchaseDiscount")
    protected MultiPurchaseDiscountType multiPurchaseDiscount;
    @XmlElement(name = "Mileage")
    protected MileageType mileage;
    @XmlElement(name = "Stamp")
    protected StampType stamp;
    @XmlElement(name = "ReviewPoint")
    protected ReviewPointType reviewPoint;
    @XmlElement(name = "FreeInterest")
    protected FreeInterestType freeInterest;
    @XmlElement(name = "Gift")
    protected GiftType gift;
    @XmlElement(name = "ECoupon")
    protected ECouponType eCoupon;
    @XmlElement(name = "PurchaseApplicationUrl")
    protected String purchaseApplicationUrl;
    @XmlElement(name = "CellPhonePrice")
    protected Long cellPhonePrice;
    @XmlElement(name = "WifiOnly")
    protected String wifiOnly;
    @XmlElement(name = "ProductSummary")
    protected ProductSummaryType productSummary;
    @XmlElement(name = "SellerCommentUsable")
    protected String sellerCommentUsable;
    @XmlElement(name = "SellerCommentContent")
    protected String sellerCommentContent;
    @XmlElement(name = "SellerCustomCode1")
    protected String sellerCustomCode1;
    @XmlElement(name = "SellerCustomCode2")
    protected String sellerCustomCode2;
    @XmlElement(name = "AdditionalInfo")
    protected AdditionalInfoType additionalInfo;
    @XmlElement(name = "Isbn13")
    protected String isbn13;
    @XmlElement(name = "IndependentPublicationYn")
    protected String independentPublicationYn;
    @XmlElement(name = "CultureCostIncomeDeductionYn")
    protected String cultureCostIncomeDeductionYn;
    @XmlElement(name = "CustomProductYn")
    protected String customProductYn;
    @XmlElement(name = "ItselfProductionProductYn")
    protected String itselfProductionProductYn;
    @XmlElement(name = "BrandCertificationYn")
    protected String brandCertificationYn;

    /**
     * productId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * productId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * statusType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * statusType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusType(String value) {
        this.statusType = value;
    }

    /**
     * saleType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * saleType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleType(String value) {
        this.saleType = value;
    }

    /**
     * customMade 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomMade() {
        return customMade;
    }

    /**
     * customMade 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomMade(String value) {
        this.customMade = value;
    }

    /**
     * useReturnCancelNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseReturnCancelNotification() {
        return useReturnCancelNotification;
    }

    /**
     * useReturnCancelNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseReturnCancelNotification(String value) {
        this.useReturnCancelNotification = value;
    }

    /**
     * estimatedDeliveryTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * estimatedDeliveryTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryTime(String value) {
        this.estimatedDeliveryTime = value;
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
     * layoutType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutType() {
        return layoutType;
    }

    /**
     * layoutType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutType(String value) {
        this.layoutType = value;
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
     * publicityPhraseContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityPhraseContent() {
        return publicityPhraseContent;
    }

    /**
     * publicityPhraseContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityPhraseContent(String value) {
        this.publicityPhraseContent = value;
    }

    /**
     * publicityPhraseStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityPhraseStartDate() {
        return publicityPhraseStartDate;
    }

    /**
     * publicityPhraseStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityPhraseStartDate(String value) {
        this.publicityPhraseStartDate = value;
    }

    /**
     * publicityPhraseEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityPhraseEndDate() {
        return publicityPhraseEndDate;
    }

    /**
     * publicityPhraseEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityPhraseEndDate(String value) {
        this.publicityPhraseEndDate = value;
    }

    /**
     * sellerManagementCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerManagementCode() {
        return sellerManagementCode;
    }

    /**
     * sellerManagementCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerManagementCode(String value) {
        this.sellerManagementCode = value;
    }

    /**
     * sellerBarCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerBarCode() {
        return sellerBarCode;
    }

    /**
     * sellerBarCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerBarCode(String value) {
        this.sellerBarCode = value;
    }

    /**
     * model 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ModelType }
     *     
     */
    public ModelType getModel() {
        return model;
    }

    /**
     * model 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelType }
     *     
     */
    public void setModel(ModelType value) {
        this.model = value;
    }

    /**
     * productAttributeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeListType }
     *     
     */
    public ProductAttributeListType getProductAttributeList() {
        return productAttributeList;
    }

    /**
     * productAttributeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeListType }
     *     
     */
    public void setProductAttributeList(ProductAttributeListType value) {
        this.productAttributeList = value;
    }

    /**
     * certificationList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CertificationListType }
     *     
     */
    public CertificationListType getCertificationList() {
        return certificationList;
    }

    /**
     * certificationList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationListType }
     *     
     */
    public void setCertificationList(CertificationListType value) {
        this.certificationList = value;
    }

    /**
     * childCertifiedProductExclusion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildCertifiedProductExclusion() {
        return childCertifiedProductExclusion;
    }

    /**
     * childCertifiedProductExclusion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildCertifiedProductExclusion(String value) {
        this.childCertifiedProductExclusion = value;
    }

    /**
     * kcCertifiedProductExclusion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCCertifiedProductExclusion() {
        return kcCertifiedProductExclusion;
    }

    /**
     * kcCertifiedProductExclusion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCCertifiedProductExclusion(String value) {
        this.kcCertifiedProductExclusion = value;
    }

    /**
     * kcExemptionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCExemptionType() {
        return kcExemptionType;
    }

    /**
     * kcExemptionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCExemptionType(String value) {
        this.kcExemptionType = value;
    }

    /**
     * greenCertifiedProductExclusion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreenCertifiedProductExclusion() {
        return greenCertifiedProductExclusion;
    }

    /**
     * greenCertifiedProductExclusion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreenCertifiedProductExclusion(String value) {
        this.greenCertifiedProductExclusion = value;
    }

    /**
     * originArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OriginAreaType }
     *     
     */
    public OriginAreaType getOriginArea() {
        return originArea;
    }

    /**
     * originArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAreaType }
     *     
     */
    public void setOriginArea(OriginAreaType value) {
        this.originArea = value;
    }

    /**
     * manufactureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufactureDate() {
        return manufactureDate;
    }

    /**
     * manufactureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufactureDate(String value) {
        this.manufactureDate = value;
    }

    /**
     * validDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * validDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * taxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * taxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * minorPurchasable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorPurchasable() {
        return minorPurchasable;
    }

    /**
     * minorPurchasable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorPurchasable(String value) {
        this.minorPurchasable = value;
    }

    /**
     * image 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * image 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    /**
     * detailContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailContent() {
        return detailContent;
    }

    /**
     * detailContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailContent(String value) {
        this.detailContent = value;
    }

    /**
     * sellerNoticeId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellerNoticeId() {
        return sellerNoticeId;
    }

    /**
     * sellerNoticeId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellerNoticeId(Long value) {
        this.sellerNoticeId = value;
    }

    /**
     * afterServiceTelephoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterServiceTelephoneNumber() {
        return afterServiceTelephoneNumber;
    }

    /**
     * afterServiceTelephoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterServiceTelephoneNumber(String value) {
        this.afterServiceTelephoneNumber = value;
    }

    /**
     * afterServiceGuideContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterServiceGuideContent() {
        return afterServiceGuideContent;
    }

    /**
     * afterServiceGuideContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterServiceGuideContent(String value) {
        this.afterServiceGuideContent = value;
    }

    /**
     * purchaseReviewExposure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseReviewExposure() {
        return purchaseReviewExposure;
    }

    /**
     * purchaseReviewExposure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseReviewExposure(String value) {
        this.purchaseReviewExposure = value;
    }

    /**
     * regularCustomerExclusiveProduct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularCustomerExclusiveProduct() {
        return regularCustomerExclusiveProduct;
    }

    /**
     * regularCustomerExclusiveProduct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularCustomerExclusiveProduct(String value) {
        this.regularCustomerExclusiveProduct = value;
    }

    /**
     * knowledgeShoppingProductRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnowledgeShoppingProductRegistration() {
        return knowledgeShoppingProductRegistration;
    }

    /**
     * knowledgeShoppingProductRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnowledgeShoppingProductRegistration(String value) {
        this.knowledgeShoppingProductRegistration = value;
    }

    /**
     * galleryId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGalleryId() {
        return galleryId;
    }

    /**
     * galleryId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGalleryId(Long value) {
        this.galleryId = value;
    }

    /**
     * saleStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStartDate() {
        return saleStartDate;
    }

    /**
     * saleStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStartDate(String value) {
        this.saleStartDate = value;
    }

    /**
     * saleEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleEndDate() {
        return saleEndDate;
    }

    /**
     * saleEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleEndDate(String value) {
        this.saleEndDate = value;
    }

    /**
     * salePrice 속성의 값을 가져옵니다.
     * 
     */
    public long getSalePrice() {
        return salePrice;
    }

    /**
     * salePrice 속성의 값을 설정합니다.
     * 
     */
    public void setSalePrice(long value) {
        this.salePrice = value;
    }

    /**
     * stockQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStockQuantity() {
        return stockQuantity;
    }

    /**
     * stockQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStockQuantity(Long value) {
        this.stockQuantity = value;
    }

    /**
     * minPurchaseQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinPurchaseQuantity() {
        return minPurchaseQuantity;
    }

    /**
     * minPurchaseQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinPurchaseQuantity(Integer value) {
        this.minPurchaseQuantity = value;
    }

    /**
     * maxPurchaseQuantityPerId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPurchaseQuantityPerId() {
        return maxPurchaseQuantityPerId;
    }

    /**
     * maxPurchaseQuantityPerId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPurchaseQuantityPerId(Long value) {
        this.maxPurchaseQuantityPerId = value;
    }

    /**
     * maxPurchaseQuantityPerOrder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPurchaseQuantityPerOrder() {
        return maxPurchaseQuantityPerOrder;
    }

    /**
     * maxPurchaseQuantityPerOrder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPurchaseQuantityPerOrder(Long value) {
        this.maxPurchaseQuantityPerOrder = value;
    }

    /**
     * delivery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * delivery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * sellerDiscount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SellerDiscountType }
     *     
     */
    public SellerDiscountType getSellerDiscount() {
        return sellerDiscount;
    }

    /**
     * sellerDiscount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDiscountType }
     *     
     */
    public void setSellerDiscount(SellerDiscountType value) {
        this.sellerDiscount = value;
    }

    /**
     * multiPurchaseDiscount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MultiPurchaseDiscountType }
     *     
     */
    public MultiPurchaseDiscountType getMultiPurchaseDiscount() {
        return multiPurchaseDiscount;
    }

    /**
     * multiPurchaseDiscount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPurchaseDiscountType }
     *     
     */
    public void setMultiPurchaseDiscount(MultiPurchaseDiscountType value) {
        this.multiPurchaseDiscount = value;
    }

    /**
     * mileage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MileageType }
     *     
     */
    public MileageType getMileage() {
        return mileage;
    }

    /**
     * mileage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageType }
     *     
     */
    public void setMileage(MileageType value) {
        this.mileage = value;
    }

    /**
     * stamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StampType }
     *     
     */
    public StampType getStamp() {
        return stamp;
    }

    /**
     * stamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StampType }
     *     
     */
    public void setStamp(StampType value) {
        this.stamp = value;
    }

    /**
     * reviewPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReviewPointType }
     *     
     */
    public ReviewPointType getReviewPoint() {
        return reviewPoint;
    }

    /**
     * reviewPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewPointType }
     *     
     */
    public void setReviewPoint(ReviewPointType value) {
        this.reviewPoint = value;
    }

    /**
     * freeInterest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FreeInterestType }
     *     
     */
    public FreeInterestType getFreeInterest() {
        return freeInterest;
    }

    /**
     * freeInterest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeInterestType }
     *     
     */
    public void setFreeInterest(FreeInterestType value) {
        this.freeInterest = value;
    }

    /**
     * gift 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GiftType }
     *     
     */
    public GiftType getGift() {
        return gift;
    }

    /**
     * gift 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftType }
     *     
     */
    public void setGift(GiftType value) {
        this.gift = value;
    }

    /**
     * eCoupon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ECouponType }
     *     
     */
    public ECouponType getECoupon() {
        return eCoupon;
    }

    /**
     * eCoupon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ECouponType }
     *     
     */
    public void setECoupon(ECouponType value) {
        this.eCoupon = value;
    }

    /**
     * purchaseApplicationUrl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseApplicationUrl() {
        return purchaseApplicationUrl;
    }

    /**
     * purchaseApplicationUrl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseApplicationUrl(String value) {
        this.purchaseApplicationUrl = value;
    }

    /**
     * cellPhonePrice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCellPhonePrice() {
        return cellPhonePrice;
    }

    /**
     * cellPhonePrice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCellPhonePrice(Long value) {
        this.cellPhonePrice = value;
    }

    /**
     * wifiOnly 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifiOnly() {
        return wifiOnly;
    }

    /**
     * wifiOnly 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifiOnly(String value) {
        this.wifiOnly = value;
    }

    /**
     * productSummary 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductSummaryType }
     *     
     */
    public ProductSummaryType getProductSummary() {
        return productSummary;
    }

    /**
     * productSummary 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSummaryType }
     *     
     */
    public void setProductSummary(ProductSummaryType value) {
        this.productSummary = value;
    }

    /**
     * sellerCommentUsable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCommentUsable() {
        return sellerCommentUsable;
    }

    /**
     * sellerCommentUsable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCommentUsable(String value) {
        this.sellerCommentUsable = value;
    }

    /**
     * sellerCommentContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCommentContent() {
        return sellerCommentContent;
    }

    /**
     * sellerCommentContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCommentContent(String value) {
        this.sellerCommentContent = value;
    }

    /**
     * sellerCustomCode1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCustomCode1() {
        return sellerCustomCode1;
    }

    /**
     * sellerCustomCode1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCustomCode1(String value) {
        this.sellerCustomCode1 = value;
    }

    /**
     * sellerCustomCode2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCustomCode2() {
        return sellerCustomCode2;
    }

    /**
     * sellerCustomCode2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCustomCode2(String value) {
        this.sellerCustomCode2 = value;
    }

    /**
     * additionalInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoType }
     *     
     */
    public AdditionalInfoType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * additionalInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoType }
     *     
     */
    public void setAdditionalInfo(AdditionalInfoType value) {
        this.additionalInfo = value;
    }

    /**
     * isbn13 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * isbn13 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn13(String value) {
        this.isbn13 = value;
    }

    /**
     * independentPublicationYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndependentPublicationYn() {
        return independentPublicationYn;
    }

    /**
     * independentPublicationYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndependentPublicationYn(String value) {
        this.independentPublicationYn = value;
    }

    /**
     * cultureCostIncomeDeductionYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultureCostIncomeDeductionYn() {
        return cultureCostIncomeDeductionYn;
    }

    /**
     * cultureCostIncomeDeductionYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultureCostIncomeDeductionYn(String value) {
        this.cultureCostIncomeDeductionYn = value;
    }

    /**
     * customProductYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomProductYn() {
        return customProductYn;
    }

    /**
     * customProductYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomProductYn(String value) {
        this.customProductYn = value;
    }

    /**
     * itselfProductionProductYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItselfProductionProductYn() {
        return itselfProductionProductYn;
    }

    /**
     * itselfProductionProductYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItselfProductionProductYn(String value) {
        this.itselfProductionProductYn = value;
    }

    /**
     * brandCertificationYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCertificationYn() {
        return brandCertificationYn;
    }

    /**
     * brandCertificationYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCertificationYn(String value) {
        this.brandCertificationYn = value;
    }

}
