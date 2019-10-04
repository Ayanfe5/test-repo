
package com.seamfix.nimc.wsdl.stubs.verification.prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByDemo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByDemo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MachineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demodata" type="{http://IdentitySearch.nimc/}demoData" minOccurs="0"/>
 *         &lt;element name="birthrange" type="{http://IdentitySearch.nimc/}birthDateRangeType" minOccurs="0"/>
 *         &lt;element name="heigthrange" type="{http://IdentitySearch.nimc/}heigthRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByDemo", propOrder = {
    "machineAddress",
    "username",
    "password",
    "orgid",
    "demodata",
    "birthrange",
    "heigthrange"
})
public class SearchByDemo {

    @XmlElement(name = "MachineAddress")
    protected String machineAddress;
    protected String username;
    protected String password;
    protected String orgid;
    protected DemoData demodata;
    protected BirthDateRangeType birthrange;
    protected HeigthRangeType heigthrange;

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
     * Gets the value of the demodata property.
     * 
     * @return
     *     possible object is
     *     {@link DemoData }
     *     
     */
    public DemoData getDemodata() {
        return demodata;
    }

    /**
     * Sets the value of the demodata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemoData }
     *     
     */
    public void setDemodata(DemoData value) {
        this.demodata = value;
    }

    /**
     * Gets the value of the birthrange property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDateRangeType }
     *     
     */
    public BirthDateRangeType getBirthrange() {
        return birthrange;
    }

    /**
     * Sets the value of the birthrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDateRangeType }
     *     
     */
    public void setBirthrange(BirthDateRangeType value) {
        this.birthrange = value;
    }

    /**
     * Gets the value of the heigthrange property.
     * 
     * @return
     *     possible object is
     *     {@link HeigthRangeType }
     *     
     */
    public HeigthRangeType getHeigthrange() {
        return heigthrange;
    }

    /**
     * Sets the value of the heigthrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeigthRangeType }
     *     
     */
    public void setHeigthrange(HeigthRangeType value) {
        this.heigthrange = value;
    }

}
