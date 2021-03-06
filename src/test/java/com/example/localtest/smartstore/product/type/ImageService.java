
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
@WebServiceClient(name = "ImageService", targetNamespace = "http://shopn.platform.nhncorp.com/", wsdlLocation = "file:./src/main/resources/wsdl/product/ShopNAPI.wsdl")
public class ImageService
    extends Service
{

    private final static URL IMAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGESERVICE_EXCEPTION;
    private final static QName IMAGESERVICE_QNAME = new QName("http://shopn.platform.nhncorp.com/", "ImageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:./src/main/resources/wsdl/product/ShopNAPI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGESERVICE_WSDL_LOCATION = url;
        IMAGESERVICE_EXCEPTION = e;
    }

    public ImageService() {
        super(__getWsdlLocation(), IMAGESERVICE_QNAME);
    }

    public ImageService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGESERVICE_QNAME, features);
    }

    public ImageService(URL wsdlLocation) {
        super(wsdlLocation, IMAGESERVICE_QNAME);
    }

    public ImageService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGESERVICE_QNAME, features);
    }

    public ImageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageServicePortType
     */
    @WebEndpoint(name = "ImageServiceSOAP11port_http")
    public ImageServicePortType getImageServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ImageServiceSOAP11port_http"), ImageServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageServicePortType
     */
    @WebEndpoint(name = "ImageServiceSOAP11port_http")
    public ImageServicePortType getImageServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ImageServiceSOAP11port_http"), ImageServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ImageServicePortType
     */
    @WebEndpoint(name = "ImageServiceSOAP12port_http")
    public ImageServicePortType getImageServiceSOAP12PortHttp() {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ImageServiceSOAP12port_http"), ImageServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageServicePortType
     */
    @WebEndpoint(name = "ImageServiceSOAP12port_http")
    public ImageServicePortType getImageServiceSOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://shopn.platform.nhncorp.com/", "ImageServiceSOAP12port_http"), ImageServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGESERVICE_EXCEPTION!= null) {
            throw IMAGESERVICE_EXCEPTION;
        }
        return IMAGESERVICE_WSDL_LOCATION;
    }

}
