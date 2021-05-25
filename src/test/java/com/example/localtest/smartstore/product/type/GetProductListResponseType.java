
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetProductListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetProductListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="ProductList" type="{http://shopn.platform.nhncorp.com/}ProductListType" minOccurs="0"/>
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
@XmlType(name = "GetProductListResponseType", propOrder = {
    "productList",
    "page",
    "totalPage"
})
public class GetProductListResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "ProductList", namespace = "")
    protected ProductListType productList;
    @XmlElement(name = "Page", namespace = "")
    protected Integer page;
    @XmlElement(name = "TotalPage", namespace = "")
    protected Integer totalPage;

    /**
     * productList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductListType }
     *     
     */
    public ProductListType getProductList() {
        return productList;
    }

    /**
     * productList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListType }
     *     
     */
    public void setProductList(ProductListType value) {
        this.productList = value;
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
