
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactioncountRangeORG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactioncountRangeORG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="search_userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="too" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactioncountRangeORG", propOrder = {
    "username",
    "password",
    "orgid",
    "searchUserid",
    "fromm",
    "too"
})
public class TransactioncountRangeORG {

    protected String username;
    protected String password;
    protected String orgid;
    @XmlElement(name = "search_userid")
    protected String searchUserid;
    protected String fromm;
    protected String too;

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
     * Gets the value of the searchUserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchUserid() {
        return searchUserid;
    }

    /**
     * Sets the value of the searchUserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchUserid(String value) {
        this.searchUserid = value;
    }

    /**
     * Gets the value of the fromm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromm() {
        return fromm;
    }

    /**
     * Sets the value of the fromm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromm(String value) {
        this.fromm = value;
    }

    /**
     * Gets the value of the too property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToo() {
        return too;
    }

    /**
     * Sets the value of the too property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToo(String value) {
        this.too = value;
    }

}
