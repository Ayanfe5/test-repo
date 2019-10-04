
package com.seamfix.nimc.wsdl.stubs.verification.prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centralId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSignature", propOrder = {
    "centralId"
})
public class GetSignature {

    protected String centralId;

    /**
     * Gets the value of the centralId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralId() {
        return centralId;
    }

    /**
     * Sets the value of the centralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralId(String value) {
        this.centralId = value;
    }

}
