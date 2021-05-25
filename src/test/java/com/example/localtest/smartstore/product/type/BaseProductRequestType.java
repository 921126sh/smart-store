
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.*;


/**
 * <p>BaseProductRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductRequestType", propOrder = {
    "version"
})
@XmlSeeAlso({
    GetSupplementProductRequestType.class,
    GetManufacturerListRequestType.class,
    GetSellerNoticeListRequestType.class,
    GetCategoryInfoRequestType.class,
    GetAttributeValueListRequestType.class,
    GetModelListRequestType.class,
    UploadImageRequestType.class,
    GetAllCategoryListRequestType.class,
    ManageHopeDeliveryGroupRequestType.class,
    GetBundleGroupRequestType.class,
    GetOriginAreaListRequestType.class,
    ManageMobileImageInfoRequestType.class,
    GetAttributeValueUnitListRequestType.class,
    ManageBundleGroupRequestType.class,
    DeleteProductRequestType.class,
    GetMobileImageInfoRequestType.class,
    GetBrandListRequestType.class,
    ManageGalleryRequestType.class,
    GetBundleGroupListRequestType.class,
    ManageQuestionAnswerRequestType.class,
    ChangeProductSaleStatusRequestType.class,
    GetSubOriginAreaListRequestType.class,
    ApplySellerNoticeRequestType.class,
    GetAddressBookListRequestType.class,
    ApplyGalleryRequestType.class,
    ManageSupplementProductRequestType.class,
    AuthenticateSellerRequestType.class,
    GetQuestionAnswerListRequestType.class,
    GetSubCategoryListRequestType.class,
    GetStandardOptionRequestType.class,
    ManageProductRequestType.class,
    GetGalleryRequestType.class,
    GetStandardOptionCategoryRequestType.class,
    GetOptionRequestType.class,
    GetAllOriginAreaListRequestType.class,
    DeleteSellerNoticeRequestType.class,
    GetHopeDeliveryGroupListRequestType.class,
    ManageOptionRequestType.class,
    GetReturnsCompanyListRequestType.class,
    GetGalleryListRequestType.class,
    RegisterSellerRequestType.class,
    GetProductRequestType.class,
    ManageSellerNoticeRequestType.class,
    GetHopeDeliveryGroupRequestType.class,
    ManageStandardOptionRequestType.class,
    GetQuestionAnswerTemplateListRequestType.class,
    GetSellerNoticeRequestType.class,
    RestoreProductRequestType.class,
    GetModificationRequiredProductListRequestType.class,
    GetProductListRequestType.class,
    GetAttributeListRequestType.class
})
public abstract class BaseProductRequestType
    extends BaseRequestType
{

    @XmlElement(name = "Version", required = true)
    protected String version;

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
