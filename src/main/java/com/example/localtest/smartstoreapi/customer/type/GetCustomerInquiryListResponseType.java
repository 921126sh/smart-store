
package com.example.localtest.smartstoreapi.customer.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GetCustomerInquiryListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerInquiryListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://customerinquiry.shopn.platform.nhncorp.com/}BaseCheckoutResponseType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInquiryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerInquiry" type="{http://customerinquiry.shopn.platform.nhncorp.com/}InquiryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReturnedDataCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasMoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerInquiryListResponseType", propOrder = {
    "customerInquiryList",
    "returnedDataCount",
    "hasMoreData"
})
public class GetCustomerInquiryListResponseType
    extends BaseCheckoutResponseType
{

    @XmlElement(name = "CustomerInquiryList", namespace = "")
    protected CustomerInquiryList customerInquiryList;
    @XmlElement(name = "ReturnedDataCount", namespace = "")
    protected Integer returnedDataCount;
    @XmlElement(name = "HasMoreData", namespace = "")
    protected Boolean hasMoreData;

    /**
     * customerInquiryList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInquiryList }
     *     
     */
    public CustomerInquiryList getCustomerInquiryList() {
        return customerInquiryList;
    }

    /**
     * customerInquiryList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInquiryList }
     *     
     */
    public void setCustomerInquiryList(CustomerInquiryList value) {
        this.customerInquiryList = value;
    }

    /**
     * returnedDataCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedDataCount() {
        return returnedDataCount;
    }

    /**
     * returnedDataCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedDataCount(Integer value) {
        this.returnedDataCount = value;
    }

    /**
     * hasMoreData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreData() {
        return hasMoreData;
    }

    /**
     * hasMoreData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreData(Boolean value) {
        this.hasMoreData = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerInquiry" type="{http://customerinquiry.shopn.platform.nhncorp.com/}InquiryType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerInquiry"
    })
    public static class CustomerInquiryList {

        @XmlElement(name = "CustomerInquiry", namespace = "")
        protected List<InquiryType> customerInquiry;

        /**
         * Gets the value of the customerInquiry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerInquiry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerInquiry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InquiryType }
         * 
         * 
         */
        public List<InquiryType> getCustomerInquiry() {
            if (customerInquiry == null) {
                customerInquiry = new ArrayList<InquiryType>();
            }
            return this.customerInquiry;
        }

    }

}
