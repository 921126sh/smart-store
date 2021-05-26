
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetModificationRequiredProductListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetModificationRequiredProductListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="ModificationRequiredProductList" type="{http://shopn.platform.nhncorp.com/}ModificationRequiredProductListType" minOccurs="0"/>
 *         &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetModificationRequiredProductListResponseType", propOrder = {
    "modificationRequiredProductList",
    "page",
    "totalPage"
})
public class GetModificationRequiredProductListResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "ModificationRequiredProductList", namespace = "")
    protected ModificationRequiredProductListType modificationRequiredProductList;
    @XmlElement(name = "Page", namespace = "")
    protected Integer page;
    @XmlElement(name = "TotalPage", namespace = "")
    protected Integer totalPage;

    /**
     * modificationRequiredProductList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ModificationRequiredProductListType }
     *     
     */
    public ModificationRequiredProductListType getModificationRequiredProductList() {
        return modificationRequiredProductList;
    }

    /**
     * modificationRequiredProductList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationRequiredProductListType }
     *     
     */
    public void setModificationRequiredProductList(ModificationRequiredProductListType value) {
        this.modificationRequiredProductList = value;
    }

    /**
     * page 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * page 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * totalPage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * totalPage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPage(Integer value) {
        this.totalPage = value;
    }

}
