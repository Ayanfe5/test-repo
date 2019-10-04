
package com.seamfix.nimc.wsdl.stubs.verification.prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAccessList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAccessList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginmessage" type="{http://IdentitySearch.nimc/}loginMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccessList", propOrder = {
    "loginmessage"
})
public class GetAccessList {

    protected LoginMessage loginmessage;

    /**
     * Gets the value of the loginmessage property.
     * 
     * @return
     *     possible object is
     *     {@link LoginMessage }
     *     
     */
    public LoginMessage getLoginmessage() {
        return loginmessage;
    }

    /**
     * Sets the value of the loginmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginMessage }
     *     
     */
    public void setLoginmessage(LoginMessage value) {
        this.loginmessage = value;
    }

}
