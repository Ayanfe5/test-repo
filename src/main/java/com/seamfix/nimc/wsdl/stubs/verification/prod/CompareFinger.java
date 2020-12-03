
package com.seamfix.nimc.wsdl.stubs.verification.prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compareFinger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compareFinger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MachineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerStringInBase64One" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerStringInBase64Two" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compareFinger", propOrder = {
    "machineAddress",
    "username",
    "password",
    "orgid",
    "fingerStringInBase64One",
    "fingerStringInBase64Two"
})
public class CompareFinger {

    @XmlElement(name = "MachineAddress")
    protected String machineAddress;
    protected String username;
    protected String password;
    protected String orgid;
    protected String fingerStringInBase64One;
    protected String fingerStringInBase64Two;

    /**
     * Gets the value of the machineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineAddress() {
        return machineAddress;
    }

    /**
     * Sets the value of the machineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineAddress(String value) {
        this.machineAddress = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgid(String value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the fingerStringInBase64One property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerStringInBase64One() {
        return fingerStringInBase64One;
    }

    /**
     * Sets the value of the fingerStringInBase64One property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerStringInBase64One(String value) {
        this.fingerStringInBase64One = value;
    }

    /**
     * Gets the value of the fingerStringInBase64Two property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerStringInBase64Two() {
        return fingerStringInBase64Two;
    }

    /**
     * Sets the value of the fingerStringInBase64Two property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerStringInBase64Two(String value) {
        this.fingerStringInBase64Two = value;
    }

}
