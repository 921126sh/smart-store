
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BaseProductResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BaseProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductResponseType", propOrder = {
    "version",
    "timestamp"
})
@XmlSeeAlso({
    GetAddressBookListResponseType.class,
    GetSubCategoryListResponseType.class,
    GetGalleryResponseType.class,
    GetModelListResponseType.class,
    GetAttributeListResponseType.class,
    ManageHopeDeliveryGroupResponseType.class,
    GetMobileImageInfoResponseType.class,
    ApplySellerNoticeResponseType.class,
    GetHopeDeliveryGroupListResponseType.class,
    GetBrandListResponseType.class,
    ChangeProductSaleStatusResponseType.class,
    GetManufacturerListResponseType.class,
    GetCategoryInfoResponseType.class,
    GetSellerNoticeResponseType.class,
    ManageStandardOptionResponseType.class,
    GetOptionResponseType.class,
    GetProductListResponseType.class,
    GetSupplementProductResponseType.class,
    GetStandardOptionResponseType.class,
    GetQuestionAnswerListResponseType.class,
    GetQuestionAnswerTemplateListResponseType.class,
    GetAllCategoryListResponseType.class,
    ManageBundleGroupResponseType.class,
    GetReturnsCompanyListResponseType.class,
    AuthenticateSellerResponseType.class,
    DeleteProductResponseType.class,
    GetBundleGroupResponseType.class,
    RegisterSellerResponseType.class,
    ApplyGalleryResponseType.class,
    GetGalleryListResponseType.class,
    ManageMobileImageInfoResponseType.class,
    RestoreProductResponseType.class,
    ManageQuestionAnswerResponseType.class,
    ManageSellerNoticeResponseType.class,
    GetProductResponseType.class,
    GetSellerNoticeListResponseType.class,
    GetHopeDeliveryGroupResponseType.class,
    ManageProductResponseType.class,
    GetAllOriginAreaListResponseType.class,
    GetAttributeValueListResponseType.class,
    DeleteSellerNoticeResponseType.class,
    UploadImageResponseType.class,
    ManageGalleryResponseType.class,
    GetModificationRequiredProductListResponseType.class,
    ManageOptionResponseType.class,
    ManageSupplementProductResponseType.class,
    GetSubOriginAreaListResponseType.class,
    GetStandardOptionCategoryResponseType.class,
    GetOriginAreaListResponseType.class,
    GetBundleGroupListResponseType.class,
    GetAttributeValueUnitListResponseType.class
})
public abstract class BaseProductResponseType
    extends BaseResponseType
{

    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

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

    /**
     * timestamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * timestamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
