
package com.example.localtest.smartstoreapi.customer.type;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nhncorp.platform.shopn.customerinquiry package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerInquiryListRequest_QNAME = new QName("http://customerinquiry.shopn.platform.nhncorp.com/", "GetCustomerInquiryListRequest");
    private final static QName _GetCustomerInquiryListResponse_QNAME = new QName("http://customerinquiry.shopn.platform.nhncorp.com/", "GetCustomerInquiryListResponse");
    private final static QName _AnswerCustomerInquiryResponse_QNAME = new QName("http://customerinquiry.shopn.platform.nhncorp.com/", "AnswerCustomerInquiryResponse");
    private final static QName _AnswerCustomerInquiryRequest_QNAME = new QName("http://customerinquiry.shopn.platform.nhncorp.com/", "AnswerCustomerInquiryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nhncorp.platform.shopn.customerinquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerInquiryListResponseType }
     * 
     */
    public GetCustomerInquiryListResponseType createGetCustomerInquiryListResponseType() {
        return new GetCustomerInquiryListResponseType();
    }

    /**
     * Create an instance of {@link GetCustomerInquiryListRequestType }
     * 
     */
    public GetCustomerInquiryListRequestType createGetCustomerInquiryListRequestType() {
        return new GetCustomerInquiryListRequestType();
    }

    /**
     * Create an instance of {@link AnswerCustomerInquiryResponseType }
     * 
     */
    public AnswerCustomerInquiryResponseType createAnswerCustomerInquiryResponseType() {
        return new AnswerCustomerInquiryResponseType();
    }

    /**
     * Create an instance of {@link AnswerCustomerInquiryRequestType }
     * 
     */
    public AnswerCustomerInquiryRequestType createAnswerCustomerInquiryRequestType() {
        return new AnswerCustomerInquiryRequestType();
    }

    /**
     * Create an instance of {@link WarningListType }
     * 
     */
    public WarningListType createWarningListType() {
        return new WarningListType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link InquiryType }
     * 
     */
    public InquiryType createInquiryType() {
        return new InquiryType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AccessCredentialsType }
     * 
     */
    public AccessCredentialsType createAccessCredentialsType() {
        return new AccessCredentialsType();
    }

    /**
     * Create an instance of {@link QuotaStatusType }
     * 
     */
    public QuotaStatusType createQuotaStatusType() {
        return new QuotaStatusType();
    }

    /**
     * Create an instance of {@link GetCustomerInquiryListResponseType.CustomerInquiryList }
     * 
     */
    public GetCustomerInquiryListResponseType.CustomerInquiryList createGetCustomerInquiryListResponseTypeCustomerInquiryList() {
        return new GetCustomerInquiryListResponseType.CustomerInquiryList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerInquiryListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerinquiry.shopn.platform.nhncorp.com/", name = "GetCustomerInquiryListRequest")
    public JAXBElement<GetCustomerInquiryListRequestType> createGetCustomerInquiryListRequest(GetCustomerInquiryListRequestType value) {
        return new JAXBElement<GetCustomerInquiryListRequestType>(_GetCustomerInquiryListRequest_QNAME, GetCustomerInquiryListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerInquiryListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerinquiry.shopn.platform.nhncorp.com/", name = "GetCustomerInquiryListResponse")
    public JAXBElement<GetCustomerInquiryListResponseType> createGetCustomerInquiryListResponse(GetCustomerInquiryListResponseType value) {
        return new JAXBElement<GetCustomerInquiryListResponseType>(_GetCustomerInquiryListResponse_QNAME, GetCustomerInquiryListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerCustomerInquiryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerinquiry.shopn.platform.nhncorp.com/", name = "AnswerCustomerInquiryResponse")
    public JAXBElement<AnswerCustomerInquiryResponseType> createAnswerCustomerInquiryResponse(AnswerCustomerInquiryResponseType value) {
        return new JAXBElement<AnswerCustomerInquiryResponseType>(_AnswerCustomerInquiryResponse_QNAME, AnswerCustomerInquiryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerCustomerInquiryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerinquiry.shopn.platform.nhncorp.com/", name = "AnswerCustomerInquiryRequest")
    public JAXBElement<AnswerCustomerInquiryRequestType> createAnswerCustomerInquiryRequest(AnswerCustomerInquiryRequestType value) {
        return new JAXBElement<AnswerCustomerInquiryRequestType>(_AnswerCustomerInquiryRequest_QNAME, AnswerCustomerInquiryRequestType.class, null, value);
    }

}
