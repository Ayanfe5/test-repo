
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for birthDateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="birthDateRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthfrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "birthDateRangeType", propOrder = {
    "birthfrom",
    "birthto"
})
public class BirthDateRangeType {

    protected String birthfrom;
    protected String birthto;

    /**
     * Gets the value of the birthfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthfrom() {
        return birthfrom;
    }

    /**
     * Sets the value of the birthfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthfrom(String value) {
        this.birthfrom = value;
    }

    /**
     * Gets the value of the birthto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthto() {
        return birthto;
    }

    /**
     * Sets the value of the birthto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthto(String value) {
        this.birthto = value;
    }

}
