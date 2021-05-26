
package com.example.localtest.smartstore.product.type;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegisterSellerService", targetNamespace = "http://shopn.platform.nhncorp.com/", wsdlLocation = "file:/Users/seotaewan/smart-store/src/main/resources/wsdl/product/ShopNAPI.wsdl")
public class RegisterSellerService
    extends Service
{

    private final static URL REGISTERSELLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGISTERSELLERSERVICE_EXCEPTION;
    private final static QName REGISTERSELLERSERVICE_QNAME = new QName("http://shopn.platform.nhncorp.com/", "RegisterSellerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/seotaewan/smart-store/src/main/resources/wsdl/product/ShopNAPI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTERSELLERSERVICE_WSDL_LOCATION = url;
        REGISTERSELLERSERVICE_EXCEPTION = e;
    }

    public RegisterSellerService() {
        super(__getWsdlLocation(), REGISTERSELLERSERVICE_QNAME);
    }

    public RegisterSellerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTERSELLERSERVICE_QNAME, features);
    }

    public RegisterSellerService(URL wsdlLocation) {
        super(wsdlLocation, REGISTERSELLERSERVICE_QNAME);
    }

    public RegisterSellerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTERSELLERSERVICE_QNAME, features);
    }

    public RegisterSellerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegisterSellerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegisterSellerServicePortType
     */
    @WebEndpoint(name = "RegisterSellerServiceSOAP11port_http")
    public RegisterSellerServicePortType getRegisterSellerServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "RegisterSellerServiceSOAP11port_http"), RegisterSellerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegisterSellerServicePortType
     */
    @WebEndpoint(name = "RegisterSellerServiceSOAP11port_http")
    public RegisterSellerServicePortType getRegisterSellerServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "RegisterSellerServiceSOAP11port_http"), RegisterSellerServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns RegisterSellerServicePortType
     */
    @WebEndpoint(name = "RegisterSellerServiceSOAP12port_http")
    public RegisterSellerServicePortType getRegisterSellerServiceSOAP12PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "RegisterSellerServiceSOAP12port_http"), RegisterSellerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegisterSellerServicePortType
     */
    @WebEndpoint(name = "RegisterSellerServiceSOAP12port_http")
    public RegisterSellerServicePortType getRegisterSellerServiceSOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "RegisterSellerServiceSOAP12port_http"), RegisterSellerServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTERSELLERSERVICE_EXCEPTION!= null) {
            throw REGISTERSELLERSERVICE_EXCEPTION;
        }
        return REGISTERSELLERSERVICE_WSDL_LOCATION;
    }

}
