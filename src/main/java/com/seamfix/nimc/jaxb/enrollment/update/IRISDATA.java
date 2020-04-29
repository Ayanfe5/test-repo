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
 *         &lt;element name="USER_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_IRIS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 *  &lt;element name="RIGHT_IRIS">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                 &lt;maxLength value="2147483647"/>
 *                 &lt;minLength value="0"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userid",
        "rightiris",
        "leftiris"
})
public class IRISDATA {
    @XmlElement(name = "USER_ID")
    public String userid;

    @XmlElement(name = "LEFT_IRIS")
    public byte[] leftiris;

    @XmlElement(name = "RIGHT_IRIS")
    public byte[] rightiris;

    /**
     * Gets the value of the leftringstatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param userid allowed object is
     *               {@link String }
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Gets the value of the leftthumb property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    public byte[] getLeftiris() {
        return leftiris;
    }

    /**
     * Sets the value of the leftthumb property.
     *
     * @param leftiris allowed object is
     *                 {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    public void setLeftiris(byte[] leftiris) {
        this.leftiris = leftiris;
    }

    /**
     * Gets the value of the leftthumb property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    public byte[] getRightiris() {
        return rightiris;
    }

    /**
     * Sets the value of the leftthumb property.
     *
     * @param rightiris allowed object is
     *                  {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    public void setRightiris(byte[] rightiris) {
        this.rightiris = rightiris;
    }
}
