
package com.example.localtest.smartstore.seller.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>getChangedProductOrderListResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="getChangedProductOrderListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://seller.shopn.platform.nhncorp.com/}ListResponseType">
 *       &lt;sequence>
 *         &lt;element name="ChangedProductOrderInfoList" type="{http://seller.shopn.platform.nhncorp.com/}changedProductOrderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChangedProductOrderListResponse", propOrder = {
    "changedProductOrderInfoList"
})
public class GetChangedProductOrderListResponse
    extends ListResponseType
{

    @XmlElement(name = "ChangedProductOrderInfoList")
    protected List<ChangedProductOrderInfo> changedProductOrderInfoList;

    /**
     * Gets the value of the changedProductOrderInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedProductOrderInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedProductOrderInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangedProductOrderInfo }
     * 
     * 
     */
    public List<ChangedProductOrderInfo> getChangedProductOrderInfoList() {
        if (changedProductOrderInfoList == null) {
            changedProductOrderInfoList = new ArrayList<ChangedProductOrderInfo>();
        }
        return this.changedProductOrderInfoList;
    }

}
