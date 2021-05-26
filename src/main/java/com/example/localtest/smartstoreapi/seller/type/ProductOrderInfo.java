
package com.example.localtest.smartstoreapi.seller.type;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>productOrderInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="productOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelInfo" type="{http://seller.shopn.platform.nhncorp.com/}cancelInfo" minOccurs="0"/>
 *         &lt;element name="DecisionHoldbackInfo" type="{http://seller.shopn.platform.nhncorp.com/}decisionHoldbackInfo" minOccurs="0"/>
 *         &lt;element name="Delivery" type="{http://seller.shopn.platform.nhncorp.com/}delivery" minOccurs="0"/>
 *         &lt;element name="ExchangeInfo" type="{http://seller.shopn.platform.nhncorp.com/}exchangeInfo" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://seller.shopn.platform.nhncorp.com/}order" minOccurs="0"/>
 *         &lt;element name="ProductOrder" type="{http://seller.shopn.platform.nhncorp.com/}productOrder" minOccurs="0"/>
 *         &lt;element name="ReturnInfo" type="{http://seller.shopn.platform.nhncorp.com/}returnInfo" minOccurs="0"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productOrderInfo", propOrder = {
    "cancelInfo",
    "decisionHoldbackInfo",
    "delivery",
    "exchangeInfo",
    "order",
    "productOrder",
    "returnInfo",
    "any"
})
public class ProductOrderInfo {

    @XmlElement(name = "CancelInfo")
    protected CancelInfo cancelInfo;
    @XmlElement(name = "DecisionHoldbackInfo")
    protected DecisionHoldbackInfo decisionHoldbackInfo;
    @XmlElement(name = "Delivery")
    protected Delivery delivery;
    @XmlElement(name = "ExchangeInfo")
    protected ExchangeInfo exchangeInfo;
    @XmlElement(name = "Order")
    protected Order order;
    @XmlElement(name = "ProductOrder")
    protected ProductOrder productOrder;
    @XmlElement(name = "ReturnInfo")
    protected ReturnInfo returnInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * cancelInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CancelInfo }
     *     
     */
    public CancelInfo getCancelInfo() {
        return cancelInfo;
    }

    /**
     * cancelInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelInfo }
     *     
     */
    public void setCancelInfo(CancelInfo value) {
        this.cancelInfo = value;
    }

    /**
     * decisionHoldbackInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DecisionHoldbackInfo }
     *     
     */
    public DecisionHoldbackInfo getDecisionHoldbackInfo() {
        return decisionHoldbackInfo;
    }

    /**
     * decisionHoldbackInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionHoldbackInfo }
     *     
     */
    public void setDecisionHoldbackInfo(DecisionHoldbackInfo value) {
        this.decisionHoldbackInfo = value;
    }

    /**
     * delivery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * delivery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setDelivery(Delivery value) {
        this.delivery = value;
    }

    /**
     * exchangeInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeInfo }
     *     
     */
    public ExchangeInfo getExchangeInfo() {
        return exchangeInfo;
    }

    /**
     * exchangeInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeInfo }
     *     
     */
    public void setExchangeInfo(ExchangeInfo value) {
        this.exchangeInfo = value;
    }

    /**
     * order 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * order 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * productOrder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrder }
     *     
     */
    public ProductOrder getProductOrder() {
        return productOrder;
    }

    /**
     * productOrder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrder }
     *     
     */
    public void setProductOrder(ProductOrder value) {
        this.productOrder = value;
    }

    /**
     * returnInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInfo }
     *     
     */
    public ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    /**
     * returnInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInfo }
     *     
     */
    public void setReturnInfo(ReturnInfo value) {
        this.returnInfo = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
