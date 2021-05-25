
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>getProductOrderInfoListResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="getProductOrderInfoListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}ListResponseType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderInfoList" type="{http://seller.shopn.platform.nhncorp.com/}productOrderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FailedProductOrderIDList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductOrderInfoListResponse", propOrder = {
    "productOrderInfoList",
    "failedProductOrderIDList"
})
public class GetProductOrderInfoListResponse
    extends ListResponseType
{

    @XmlElement(name = "ProductOrderInfoList")
    protected List<ProductOrderInfo> productOrderInfoList;
    @XmlElement(name = "FailedProductOrderIDList")
    protected List<String> failedProductOrderIDList;

    /**
     * Gets the value of the productOrderInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrderInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrderInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOrderInfo }
     * 
     * 
     */
    public List<ProductOrderInfo> getProductOrderInfoList() {
        if (productOrderInfoList == null) {
            productOrderInfoList = new ArrayList<ProductOrderInfo>();
        }
        return this.productOrderInfoList;
    }

    /**
     * Gets the value of the failedProductOrderIDList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedProductOrderIDList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailedProductOrderIDList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFailedProductOrderIDList() {
        if (failedProductOrderIDList == null) {
            failedProductOrderIDList = new ArrayList<String>();
        }
        return this.failedProductOrderIDList;
    }

}
