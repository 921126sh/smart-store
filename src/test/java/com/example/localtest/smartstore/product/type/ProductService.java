
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
@WebServiceClient(name = "ProductService", targetNamespace = "http://shopn.platform.nhncorp.com/", wsdlLocation = "file:/Users/sh/Documents/private/worspaces/local-test/src/main/resources/wsdl/product/ShopNAPI.wsdl")
public class ProductService
    extends Service
{

    private final static URL PRODUCTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICE_QNAME = new QName("http://shopn.platform.nhncorp.com/", "ProductService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/sh/Documents/private/worspaces/local-test/src/main/resources/wsdl/product/ShopNAPI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICE_EXCEPTION = e;
    }

    public ProductService() {
        super(__getWsdlLocation(), PRODUCTSERVICE_QNAME);
    }

    public ProductService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSERVICE_QNAME, features);
    }

    public ProductService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSERVICE_QNAME);
    }

    public ProductService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSERVICE_QNAME, features);
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "ProductServiceSOAP11port_http")
    public ProductServicePortType getProductServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ProductServiceSOAP11port_http"), ProductServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "ProductServiceSOAP11port_http")
    public ProductServicePortType getProductServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ProductServiceSOAP11port_http"), ProductServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "ProductServiceSOAP12port_http")
    public ProductServicePortType getProductServiceSOAP12PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ProductServiceSOAP12port_http"), ProductServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServicePortType
     */
    @WebEndpoint(name = "ProductServiceSOAP12port_http")
    public ProductServicePortType getProductServiceSOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ProductServiceSOAP12port_http"), ProductServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICE_EXCEPTION;
        }
        return PRODUCTSERVICE_WSDL_LOCATION;
    }

}