
package com.seamfix.nimc.jaxb.enrollment2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.seamfix.nimc.jaxb.enrollment2 package. 
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
@SuppressWarnings({"PMD.TooManyMethods","PMD.AvoidDuplicateLiterals"})
public class ObjectFactory {

    private final static QName _ReceiveModificationData_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveModificationData");
    private final static QName _ReceiveDeathData_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveDeathData");
    private final static QName _ReceiveNewData_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveNewData");
    private final static QName _ReceiveReprintDataResponse_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveReprintDataResponse");
    private final static QName _InvalidRequestException_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "InvalidRequestException");
    private final static QName _InvalidXMLDataException_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "InvalidXMLDataException");
    private final static QName _ReceiveNewDataResponse_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveNewDataResponse");
    private final static QName _ReceiveModificationDataResponse_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveModificationDataResponse");
    private final static QName _ReceiveDeathDataResponse_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveDeathDataResponse");
    private final static QName _ReceiveReprintData_QNAME = new QName("http://frontend.ws.nimc.gov.ng/", "receiveReprintData");

    /**
     * Create an instance of {@link ReceiveDeathData }
     * 
     */
    public ReceiveDeathData createReceiveDeathData() {
        return new ReceiveDeathData();
    }

    /**
     * Create an instance of {@link ReceiveModificationData }
     * 
     */
    public ReceiveModificationData createReceiveModificationData() {
        return new ReceiveModificationData();
    }

    /**
     * Create an instance of {@link ReceiveNewData }
     * 
     */
    public ReceiveNewData createReceiveNewData() {
        return new ReceiveNewData();
    }

    /**
     * Create an instance of {@link ReceiveReprintDataResponse }
     * 
     */
    public ReceiveReprintDataResponse createReceiveReprintDataResponse() {
        return new ReceiveReprintDataResponse();
    }

    /**
     * Create an instance of {@link InvalidRequestException }
     * 
     */
    public InvalidRequestException createInvalidRequestException() {
        return new InvalidRequestException();
    }

    /**
     * Create an instance of {@link InvalidXMLDataException }
     * 
     */
    public InvalidXMLDataException createInvalidXMLDataException() {
        return new InvalidXMLDataException();
    }

    /**
     * Create an instance of {@link ReceiveNewDataResponse }
     * 
     */
    public ReceiveNewDataResponse createReceiveNewDataResponse() {
        return new ReceiveNewDataResponse();
    }

    /**
     * Create an instance of {@link ReceiveDeathDataResponse }
     * 
     */
    public ReceiveDeathDataResponse createReceiveDeathDataResponse() {
        return new ReceiveDeathDataResponse();
    }

    /**
     * Create an instance of {@link ReceiveReprintData }
     * 
     */
    public ReceiveReprintData createReceiveReprintData() {
        return new ReceiveReprintData();
    }

    /**
     * Create an instance of {@link ReceiveModificationDataResponse }
     * 
     */
    public ReceiveModificationDataResponse createReceiveModificationDataResponse() {
        return new ReceiveModificationDataResponse();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveModificationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveModificationData")
    public JAXBElement<ReceiveModificationData> createReceiveModificationData(ReceiveModificationData value) {
        return new JAXBElement<ReceiveModificationData>(_ReceiveModificationData_QNAME, ReceiveModificationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveDeathData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveDeathData")
    public JAXBElement<ReceiveDeathData> createReceiveDeathData(ReceiveDeathData value) {
        return new JAXBElement<ReceiveDeathData>(_ReceiveDeathData_QNAME, ReceiveDeathData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveNewData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveNewData")
    public JAXBElement<ReceiveNewData> createReceiveNewData(ReceiveNewData value) {
        return new JAXBElement<ReceiveNewData>(_ReceiveNewData_QNAME, ReceiveNewData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveReprintDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveReprintDataResponse")
    public JAXBElement<ReceiveReprintDataResponse> createReceiveReprintDataResponse(ReceiveReprintDataResponse value) {
        return new JAXBElement<ReceiveReprintDataResponse>(_ReceiveReprintDataResponse_QNAME, ReceiveReprintDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidRequestException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "InvalidRequestException")
    public JAXBElement<InvalidRequestException> createInvalidRequestException(InvalidRequestException value) {
        return new JAXBElement<InvalidRequestException>(_InvalidRequestException_QNAME, InvalidRequestException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidXMLDataException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "InvalidXMLDataException")
    public JAXBElement<InvalidXMLDataException> createInvalidXMLDataException(InvalidXMLDataException value) {
        return new JAXBElement<InvalidXMLDataException>(_InvalidXMLDataException_QNAME, InvalidXMLDataException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveNewDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveNewDataResponse")
    public JAXBElement<ReceiveNewDataResponse> createReceiveNewDataResponse(ReceiveNewDataResponse value) {
        return new JAXBElement<ReceiveNewDataResponse>(_ReceiveNewDataResponse_QNAME, ReceiveNewDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveModificationDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveModificationDataResponse")
    public JAXBElement<ReceiveModificationDataResponse> createReceiveModificationDataResponse(ReceiveModificationDataResponse value) {
        return new JAXBElement<ReceiveModificationDataResponse>(_ReceiveModificationDataResponse_QNAME, ReceiveModificationDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveDeathDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveDeathDataResponse")
    public JAXBElement<ReceiveDeathDataResponse> createReceiveDeathDataResponse(ReceiveDeathDataResponse value) {
        return new JAXBElement<ReceiveDeathDataResponse>(_ReceiveDeathDataResponse_QNAME, ReceiveDeathDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveReprintData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://frontend.ws.nimc.gov.ng/", name = "receiveReprintData")
    public JAXBElement<ReceiveReprintData> createReceiveReprintData(ReceiveReprintData value) {
        return new JAXBElement<ReceiveReprintData>(_ReceiveReprintData_QNAME, ReceiveReprintData.class, null, value);
    }

}
