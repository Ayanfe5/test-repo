
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for verifyFingerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyFingerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://IdentitySearch.nimc/}searchResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyFingerResponse", propOrder = {
    "_return"
})
public class VerifyFingerResponse {

    @XmlElement(name = "return")
    protected SearchResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse }
     *     
     */
    public SearchResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse }
     *     
     */
    public void setReturn(SearchResponse value) {
        this._return = value;
    }

}
