
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for searchByDemoNINResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByDemoNINResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://IdentitySearch.nimc/}searchResponseDemo2" minOccurs="0"/>
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
@XmlType(name = "searchByDemoNINResponse", propOrder = {
    "_return"
})
public class SearchByDemoNINResponse {

    @XmlElement(name = "return")
    protected SearchResponseDemo2 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResponseDemo2 }
     *     
     */
    public SearchResponseDemo2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponseDemo2 }
     *     
     */
    public void setReturn(SearchResponseDemo2 value) {
        this._return = value;
    }

}
