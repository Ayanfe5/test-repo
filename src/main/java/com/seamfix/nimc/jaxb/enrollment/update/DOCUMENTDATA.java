//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:36:32 PM WAT 
//


package com.seamfix.nimc.jaxb.enrollment.update;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOCUMENT_TYPE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="national insurance"/>
 *               &lt;enumeration value="immigration document"/>
 *               &lt;enumeration value="nigerian passport"/>
 *               &lt;enumeration value="other passport"/>
 *               &lt;enumeration value="other travel document"/>
 *               &lt;enumeration value="other national identity card"/>
 *               &lt;enumeration value="any identity reference"/>
 *               &lt;enumeration value="nigeria driver licence"/>
 *               &lt;enumeration value="other designated document"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENT_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENT_EXPIRY_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d|(0[1-9]|1[0-9]|2[0-9]|3[01])-(0[1-9]|1[012])-((19|20)\d\d)|"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documenttype",
    "documentnumber",
    "documentexpirydate"
})
public class DOCUMENTDATA {

    @XmlElement(name = "DOCUMENT_TYPE", required = true)
    public String documenttype;
    @XmlElement(name = "DOCUMENT_NUMBER", required = false)
    public String documentnumber;
    @XmlElement(name = "DOCUMENT_EXPIRY_DATE", required = false)
    public String documentexpirydate;

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTTYPE(String value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the documentexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public String getDOCUMENTEXPIRYDATE() {
        return documentexpirydate;
    }

    /**
     * Sets the value of the documentexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOCUMENTEXPIRYDATE(String value) {
        this.documentexpirydate = value;
    }

}
