
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAccountORGChecker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccountORGChecker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asa_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asa_pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="arg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccountORGChecker", propOrder = {
    "asaUsername",
    "asaPwd",
    "orgid",
    "orgUsername",
    "orgname",
    "orgAddress",
    "phone",
    "surname",
    "firstname",
    "nin",
    "email",
    "arg11",
    "arg12",
    "arg13",
    "arg14",
    "arg15",
    "arg16",
    "arg17",
    "arg18",
    "arg19",
    "arg20"
})
public class CreateAccountORGChecker {

    @XmlElement(name = "asa_username")
    protected String asaUsername;
    @XmlElement(name = "asa_pwd")
    protected String asaPwd;
    protected String orgid;
    @XmlElement(name = "org_username")
    protected String orgUsername;
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
    protected String arg14;
    protected String arg15;
    protected String arg16;
    protected String arg17;
    protected String arg18;
    protected String arg19;
    protected String arg20;

    /**
     * Gets the value of the asaUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsaUsername() {
        return asaUsername;
    }

    /**
     * Sets the value of the asaUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsaUsername(String value) {
        this.asaUsername = value;
    }

    /**
     * Gets the value of the asaPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsaPwd() {
        return asaPwd;
    }

    /**
     * Sets the value of the asaPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsaPwd(String value) {
        this.asaPwd = value;
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

    /**
     * Gets the value of the arg14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg14() {
        return arg14;
    }

    /**
     * Sets the value of the arg14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg14(String value) {
        this.arg14 = value;
    }

    /**
     * Gets the value of the arg15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg15() {
        return arg15;
    }

    /**
     * Sets the value of the arg15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg15(String value) {
        this.arg15 = value;
    }

    /**
     * Gets the value of the arg16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg16() {
        return arg16;
    }

    /**
     * Sets the value of the arg16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg16(String value) {
        this.arg16 = value;
    }

    /**
     * Gets the value of the arg17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg17() {
        return arg17;
    }

    /**
     * Sets the value of the arg17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg17(String value) {
        this.arg17 = value;
    }

    /**
     * Gets the value of the arg18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg18() {
        return arg18;
    }

    /**
     * Sets the value of the arg18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg18(String value) {
        this.arg18 = value;
    }

    /**
     * Gets the value of the arg19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg19() {
        return arg19;
    }

    /**
     * Sets the value of the arg19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg19(String value) {
        this.arg19 = value;
    }

    /**
     * Gets the value of the arg20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg20() {
        return arg20;
    }

    /**
     * Sets the value of the arg20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg20(String value) {
        this.arg20 = value;
    }

}
