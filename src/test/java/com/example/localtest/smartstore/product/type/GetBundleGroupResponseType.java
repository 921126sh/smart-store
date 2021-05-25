
package com.example.localtest.smartstore.product.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetBundleGroupResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetBundleGroupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shopn.platform.nhncorp.com/}BaseProductResponseType">
 *       &lt;sequence>
 *         &lt;element name="BundleGroup" type="{http://shopn.platform.nhncorp.com/}BundleGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBundleGroupResponseType", propOrder = {
    "bundleGroup"
})
public class GetBundleGroupResponseType
    extends BaseProductResponseType
{

    @XmlElement(name = "BundleGroup", namespace = "")
    protected BundleGroupType bundleGroup;

    /**
     * bundleGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BundleGroupType }
     *     
     */
    public BundleGroupType getBundleGroup() {
        return bundleGroup;
    }

    /**
     * bundleGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleGroupType }
     *     
     */
    public void setBundleGroup(BundleGroupType value) {
        this.bundleGroup = value;
    }

}
