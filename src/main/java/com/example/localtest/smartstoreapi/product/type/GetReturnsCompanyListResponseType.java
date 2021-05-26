
package com.example.localtest.smartstoreapi.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetReturnsCompanyListResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetReturnsCompanyListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="ReturnsCompanyList" type="{http://shopn.platform.nhncorp.com/}ReturnsCompanyListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReturnsCompanyListResponseType", propOrder = {
    "returnsCompanyList"
})
public class GetReturnsCompanyListResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "ReturnsCompanyList", namespace = "")
    protected ReturnsCompanyListType returnsCompanyList;

    /**
     * returnsCompanyList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsCompanyListType }
     *     
     */
    public ReturnsCompanyListType getReturnsCompanyList() {
        return returnsCompanyList;
    }

    /**
     * returnsCompanyList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsCompanyListType }
     *     
     */
    public void setReturnsCompanyList(ReturnsCompanyListType value) {
        this.returnsCompanyList = value;
    }

}
