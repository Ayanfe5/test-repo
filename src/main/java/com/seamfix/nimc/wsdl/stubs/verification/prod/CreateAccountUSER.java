
package com.seamfix.nimc.wsdl.stubs.verification.prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAccountUSER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccountUSER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="org_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg11" type="{http://IdentitySearch.nimc/}accessObject" minOccurs="0"/>
 *         &lt;element name="arg12" type="{http://IdentitySearch.nimc/}status" minOccurs="0"/>
 *         &lt;element name="arg13" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccountUSER", propOrder = {
    "orgUsername",
    "orgPwd",
    "orgid",
    "userUsername",
    "orgname",
    "orgAddress",
    "phone",
    "surname",
    "firstname",
    "nin",
    "email",
    "arg11",
    "arg12",
    "arg13"
})
public class CreateAccountUSER {

    @XmlElement(name = "org_username")
    protected String orgUsername;
    @XmlElement(name = "org_pwd")
    protected String orgPwd;
    protected String orgid;
    @XmlElement(name = "user_username")
    protected String userUsername;
    protected String orgname;
    @XmlElement(name = "org_address")
    protected String orgAddress;
    protected String phone;
    protected String surname;
    protected String firstname;
    protected String nin;
    protected String email;
    protected AccessObject arg11;
    @XmlSchemaType(name = "string")
    protected Status arg12;
    protected int arg13;

    /**
     * Gets the value of the orgUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUsername() {
        return orgUsername;
    }

    /**
     * Sets the value of the orgUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUsername(String value) {
        this.orgUsername = value;
    }

    /**
     * Gets the value of the orgPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPwd() {
        return orgPwd;
    }

    /**
     * Sets the value of the orgPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPwd(String value) {
        this.orgPwd = value;
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
     * Gets the value of the userUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUsername() {
        return userUsername;
    }

    /**
     * Sets the value of the userUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUsername(String value) {
        this.userUsername = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the orgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * Sets the value of the orgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAddress(String value) {
        this.orgAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the nin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNin() {
        return nin;
    }

    /**
     * Sets the value of the nin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNin(String value) {
        this.nin = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the arg11 property.
     * 
     * @return
     *     possible object is
     *     {@link AccessObject }
     *     
     */
    public AccessObject getArg11() {
        return arg11;
    }

    /**
     * Sets the value of the arg11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessObject }
     *     
     */
    public void setArg11(AccessObject value) {
        this.arg11 = value;
    }

    /**
     * Gets the value of the arg12 property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getArg12() {
        return arg12;
    }

    /**
     * Sets the value of the arg12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setArg12(Status value) {
        this.arg12 = value;
    }

    /**
     * Gets the value of the arg13 property.
     * 
     */
    public int getArg13() {
        return arg13;
    }

    /**
     * Sets the value of the arg13 property.
     * 
     */
    public void setArg13(int value) {
        this.arg13 = value;
    }

}
