
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revokeaccessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokeaccessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginmessage" type="{http://IdentitySearch.nimc/}loginMessage" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://IdentitySearch.nimc/}requestTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokeaccessType", propOrder = {
    "loginmessage",
    "userid",
    "requestType"
})
public class RevokeaccessType {

    protected LoginMessage loginmessage;
    protected String userid;
    @XmlSchemaType(name = "string")
    protected RequestTypeEnum requestType;

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

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

}
