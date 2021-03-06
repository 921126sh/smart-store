
package com.example.localtest.smartstore.product.type;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AuthenticateSellerServicePortType", targetNamespace = "http://shopn.platform.nhncorp.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuthenticateSellerServicePortType {


    /**
     * 
     * @param authenticateSellerRequest
     * @return
     *     returns com.nhncorp.platform.shopn.AuthenticateSellerResponseType
     */
    @WebMethod(operationName = "AuthenticateSeller", action = "AuthenticateSellerService#AuthenticateSeller")
    @WebResult(name = "AuthenticateSellerResponse", targetNamespace = "http://shopn.platform.nhncorp.com/", partName = "AuthenticateSellerResponse")
    public AuthenticateSellerResponseType authenticateSeller(
        @WebParam(name = "AuthenticateSellerRequest", targetNamespace = "http://shopn.platform.nhncorp.com/", partName = "AuthenticateSellerRequest")
        AuthenticateSellerRequestType authenticateSellerRequest);

}
