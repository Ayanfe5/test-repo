//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.12 at 12:26:06 PM WAT 
//


package com.seamfix.nimc.wsdl.stubs.personalization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivePersonalizationFeedbackResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivePersonalizationFeedbackResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personalizationFeedback" type="{http://frontend.ws.nimc.gov.ng/}personalizationFeedback" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivePersonalizationFeedbackResponse", propOrder = {
    "personalizationFeedback"
})
public class ReceivePersonalizationFeedbackResponse {

    @XmlElement(namespace = "http://frontend.ws.nimc.gov.ng/")
    protected PersonalizationFeedback personalizationFeedback;

    /**
     * Gets the value of the personalizationFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalizationFeedback }
     *     
     */
    public PersonalizationFeedback getPersonalizationFeedback() {
        return personalizationFeedback;
    }

    /**
     * Sets the value of the personalizationFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalizationFeedback }
     *     
     */
    public void setPersonalizationFeedback(PersonalizationFeedback value) {
        this.personalizationFeedback = value;
    }

}
