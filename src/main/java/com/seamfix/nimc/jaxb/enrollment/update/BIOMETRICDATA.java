//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:36:32 PM WAT 
//


package com.seamfix.nimc.jaxb.enrollment.update;

import java.math.BigDecimal;

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
 *         &lt;element name="USER_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_THUMB_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_INDEX_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_MIDDLE_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_RING_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_LITTLE_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_THUMB_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_INDEX_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_MIDDLE_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_RING_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_LITTLE_STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="t"/>
 *               &lt;enumeration value="f"/>
 *               &lt;enumeration value="b"/>
 *               &lt;enumeration value="i"/>
 *               &lt;enumeration value="j"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_THUMB_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_INDEX_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_MIDDLE_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_RING_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_LITTLE_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_THUMB_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_INDEX_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_MIDDLE_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_RING_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_LITTLE_QUALITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="38"/>
 *               &lt;fractionDigits value="0"/>
 *               &lt;minExclusive value="-1"/>
 *               &lt;maxExclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_THUMB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_INDEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_MIDDLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_RING" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LEFT_LITTLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_THUMB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_INDEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_MIDDLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_RING" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGHT_LITTLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PHOTOGRAPH">
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
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userid",
    "leftthumbstatus",
    "leftindexstatus",
    "leftmiddlestatus",
    "leftringstatus",
    "leftlittlestatus",
    "rightthumbstatus",
    "rightindexstatus",
    "rightmiddlestatus",
    "rightringstatus",
    "rightlittlestatus",
    "leftthumbquality",
    "leftindexquality",
    "leftmiddlequality",
    "leftringquality",
    "leftlittlequality",
    "rightthumbquality",
    "rightindexquality",
    "rightmiddlequality",
    "rightringquality",
    "rightlittlequality",
    "leftthumb",
    "leftindex",
    "leftmiddle",
    "leftring",
    "leftlittle",
    "rightthumb",
    "rightindex",
    "rightmiddle",
    "rightring",
     "rightlittle",
     "photograph",
     "lefteyestatus",
      "lefteye",
      "righteyestatus",
      "righteye",
})
@SuppressWarnings({"PMD.ExcessivePublicCount","PMD.MethodReturnsInternalArray","PMD.ArrayIsStoredDirectly"})
public class BIOMETRICDATA {

    @XmlElement(name = "USER_ID", required = false)
    public String userid;
    @XmlElement(name = "LEFT_THUMB_STATUS", required = true)
    public String leftthumbstatus;
    @XmlElement(name = "LEFT_INDEX_STATUS", required = true)
    public String leftindexstatus;
    @XmlElement(name = "LEFT_MIDDLE_STATUS", required = true)
    public String leftmiddlestatus;
    @XmlElement(name = "LEFT_RING_STATUS", required = true)
    public String leftringstatus;
    @XmlElement(name = "LEFT_LITTLE_STATUS", required = true)
    public String leftlittlestatus;
    @XmlElement(name = "RIGHT_THUMB_STATUS", required = true)
    public String rightthumbstatus;
    @XmlElement(name = "RIGHT_INDEX_STATUS", required = true)
    public String rightindexstatus;
    @XmlElement(name = "RIGHT_MIDDLE_STATUS", required = true)
    public String rightmiddlestatus;
    @XmlElement(name = "RIGHT_RING_STATUS", required = true)
    public String rightringstatus;
    @XmlElement(name = "RIGHT_LITTLE_STATUS", required = true)
    public String rightlittlestatus;
    @XmlElement(name = "LEFT_THUMB_QUALITY", required = false)
    public BigDecimal leftthumbquality;
    @XmlElement(name = "LEFT_INDEX_QUALITY", required = false)
    public BigDecimal leftindexquality;
    @XmlElement(name = "LEFT_MIDDLE_QUALITY", required = false)
    public BigDecimal leftmiddlequality;
    @XmlElement(name = "LEFT_RING_QUALITY", required = false)
    public BigDecimal leftringquality;
    @XmlElement(name = "LEFT_LITTLE_QUALITY", required = false)
    public BigDecimal leftlittlequality;
    @XmlElement(name = "RIGHT_THUMB_QUALITY", required = false)
    public BigDecimal rightthumbquality;
    @XmlElement(name = "RIGHT_INDEX_QUALITY", required = false)
    public BigDecimal rightindexquality;
    @XmlElement(name = "RIGHT_MIDDLE_QUALITY", required = false)
    public BigDecimal rightmiddlequality;
    @XmlElement(name = "RIGHT_RING_QUALITY", required = false)
    public BigDecimal rightringquality;
    @XmlElement(name = "RIGHT_LITTLE_QUALITY", required = false)
    public BigDecimal rightlittlequality;
    @XmlElement(name = "LEFT_THUMB", required = false)
    public byte[] leftthumb;
    @XmlElement(name = "LEFT_INDEX", required = false)
    public byte[] leftindex;
    @XmlElement(name = "LEFT_MIDDLE", required = false)
    public byte[] leftmiddle;
    @XmlElement(name = "LEFT_RING", required = false)
    public byte[] leftring;
    @XmlElement(name = "LEFT_LITTLE", required = false)
    public byte[] leftlittle;
    @XmlElement(name = "RIGHT_THUMB", required = false)
    public byte[] rightthumb;
    @XmlElement(name = "RIGHT_INDEX", required = false)
    public byte[] rightindex;
    @XmlElement(name = "RIGHT_MIDDLE", required = false)
    public byte[] rightmiddle;
    @XmlElement(name = "RIGHT_RING", required = false)
    public byte[] rightring;
    @XmlElement(name = "RIGHT_LITTLE", required = false)
    public byte[] rightlittle;
    @XmlElement(name = "PHOTOGRAPH", required = true)
    public byte[] photograph;
    @XmlElement(name = "LEFT_EYE_STATUS", required = true)
    public String lefteyestatus;
    @XmlElement(name = "LEFT_EYE")
    public String lefteye;
    @XmlElement(name = "RIGHT_EYE_STATUS", required = true)
    public String righteyestatus;
    @XmlElement(name = "RIGHT_EYE")
    public String righteye;


    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the leftthumbstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTTHUMBSTATUS() {
        return leftthumbstatus;
    }

    /**
     * Sets the value of the leftthumbstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTTHUMBSTATUS(String value) {
        this.leftthumbstatus = value;
    }

    /**
     * Gets the value of the leftindexstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTINDEXSTATUS() {
        return leftindexstatus;
    }

    /**
     * Sets the value of the leftindexstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTINDEXSTATUS(String value) {
        this.leftindexstatus = value;
    }

    /**
     * Gets the value of the leftmiddlestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTMIDDLESTATUS() {
        return leftmiddlestatus;
    }

    /**
     * Sets the value of the leftmiddlestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTMIDDLESTATUS(String value) {
        this.leftmiddlestatus = value;
    }

    /**
     * Gets the value of the leftringstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTRINGSTATUS() {
        return leftringstatus;
    }

    /**
     * Sets the value of the leftringstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTRINGSTATUS(String value) {
        this.leftringstatus = value;
    }

    /**
     * Gets the value of the leftlittlestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEFTLITTLESTATUS() {
        return leftlittlestatus;
    }

    /**
     * Sets the value of the leftlittlestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEFTLITTLESTATUS(String value) {
        this.leftlittlestatus = value;
    }

    /**
     * Gets the value of the rightthumbstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTTHUMBSTATUS() {
        return rightthumbstatus;
    }

    /**
     * Sets the value of the rightthumbstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTTHUMBSTATUS(String value) {
        this.rightthumbstatus = value;
    }

    /**
     * Gets the value of the rightindexstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTINDEXSTATUS() {
        return rightindexstatus;
    }

    /**
     * Sets the value of the rightindexstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTINDEXSTATUS(String value) {
        this.rightindexstatus = value;
    }

    /**
     * Gets the value of the rightmiddlestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTMIDDLESTATUS() {
        return rightmiddlestatus;
    }

    /**
     * Sets the value of the rightmiddlestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTMIDDLESTATUS(String value) {
        this.rightmiddlestatus = value;
    }

    /**
     * Gets the value of the rightringstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTRINGSTATUS() {
        return rightringstatus;
    }

    /**
     * Sets the value of the rightringstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTRINGSTATUS(String value) {
        this.rightringstatus = value;
    }

    /**
     * Gets the value of the rightlittlestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGHTLITTLESTATUS() {
        return rightlittlestatus;
    }

    /**
     * Sets the value of the rightlittlestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGHTLITTLESTATUS(String value) {
        this.rightlittlestatus = value;
    }

    /**
     * Gets the value of the leftthumbquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getLEFTTHUMBQUALITY() {
        return leftthumbquality;
    }

    /**
     * Sets the value of the leftthumbquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLEFTTHUMBQUALITY(BigDecimal value) {
        this.leftthumbquality = value;
    }

    /**
     * Gets the value of the leftindexquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getLEFTINDEXQUALITY() {
        return leftindexquality;
    }

    /**
     * Sets the value of the leftindexquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLEFTINDEXQUALITY(BigDecimal value) {
        this.leftindexquality = value;
    }

    /**
     * Gets the value of the leftmiddlequality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getLEFTMIDDLEQUALITY() {
        return leftmiddlequality;
    }

    /**
     * Sets the value of the leftmiddlequality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLEFTMIDDLEQUALITY(BigDecimal value) {
        this.leftmiddlequality = value;
    }

    /**
     * Gets the value of the leftringquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getLEFTRINGQUALITY() {
        return leftringquality;
    }

    /**
     * Sets the value of the leftringquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLEFTRINGQUALITY(BigDecimal value) {
        this.leftringquality = value;
    }

    /**
     * Gets the value of the leftlittlequality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getLEFTLITTLEQUALITY() {
        return leftlittlequality;
    }

    /**
     * Sets the value of the leftlittlequality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLEFTLITTLEQUALITY(BigDecimal value) {
        this.leftlittlequality = value;
    }

    /**
     * Gets the value of the rightthumbquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getRIGHTTHUMBQUALITY() {
        return rightthumbquality;
    }

    /**
     * Sets the value of the rightthumbquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIGHTTHUMBQUALITY(BigDecimal value) {
        this.rightthumbquality = value;
    }

    /**
     * Gets the value of the rightindexquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getRIGHTINDEXQUALITY() {
        return rightindexquality;
    }

    /**
     * Sets the value of the rightindexquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIGHTINDEXQUALITY(BigDecimal value) {
        this.rightindexquality = value;
    }

    /**
     * Gets the value of the rightmiddlequality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getRIGHTMIDDLEQUALITY() {
        return rightmiddlequality;
    }

    /**
     * Sets the value of the rightmiddlequality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIGHTMIDDLEQUALITY(BigDecimal value) {
        this.rightmiddlequality = value;
    }

    /**
     * Gets the value of the rightringquality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getRIGHTRINGQUALITY() {
        return rightringquality;
    }

    /**
     * Sets the value of the rightringquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIGHTRINGQUALITY(BigDecimal value) {
        this.rightringquality = value;
    }

    /**
     * Gets the value of the rightlittlequality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public BigDecimal getRIGHTLITTLEQUALITY() {
        return rightlittlequality;
    }

    /**
     * Sets the value of the rightlittlequality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIGHTLITTLEQUALITY(BigDecimal value) {
        this.rightlittlequality = value;
    }

    /**
     * Gets the value of the leftthumb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getLEFTTHUMB() {
        return leftthumb;
    }

    /**
     * Sets the value of the leftthumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLEFTTHUMB(byte[] value) {
        this.leftthumb = value;
    }

    /**
     * Gets the value of the leftindex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getLEFTINDEX() {
        return leftindex;
    }

    /**
     * Sets the value of the leftindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLEFTINDEX(byte[] value) {
        this.leftindex = value;
    }

    /**
     * Gets the value of the leftmiddle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getLEFTMIDDLE() {
        return leftmiddle;
    }

    /**
     * Sets the value of the leftmiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLEFTMIDDLE(byte[] value) {
        this.leftmiddle = value;
    }

    /**
     * Gets the value of the leftring property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getLEFTRING() {
        return leftring;
    }

    /**
     * Sets the value of the leftring property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLEFTRING(byte[] value) {
        this.leftring = value;
    }

    /**
     * Gets the value of the leftlittle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getLEFTLITTLE() {
        return leftlittle;
    }

    /**
     * Sets the value of the leftlittle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLEFTLITTLE(byte[] value) {
        this.leftlittle = value;
    }

    /**
     * Gets the value of the rightthumb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getRIGHTTHUMB() {
        return rightthumb;
    }

    /**
     * Sets the value of the rightthumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRIGHTTHUMB(byte[] value) {
        this.rightthumb = value;
    }

    /**
     * Gets the value of the rightindex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getRIGHTINDEX() {
        return rightindex;
    }

    /**
     * Sets the value of the rightindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRIGHTINDEX(byte[] value) {
        this.rightindex = value;
    }

    /**
     * Gets the value of the rightmiddle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getRIGHTMIDDLE() {
        return rightmiddle;
    }

    /**
     * Sets the value of the rightmiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRIGHTMIDDLE(byte[] value) {
        this.rightmiddle = value;
    }

    /**
     * Gets the value of the rightring property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getRIGHTRING() {
        return rightring;
    }

    /**
     * Sets the value of the rightring property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRIGHTRING(byte[] value) {
        this.rightring = value;
    }

    /**
     * Gets the value of the rightlittle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public byte[] getRIGHTLITTLE() {
        return rightlittle;
    }

    /**
     * Sets the value of the rightlittle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRIGHTLITTLE(byte[] value) {
        this.rightlittle = value;
    }

    /**
     * Gets the value of the photograph property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPHOTOGRAPH() {
        return photograph;
    }

    /**
     * Sets the value of the photograph property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPHOTOGRAPH(byte[] value) {
        this.photograph = value;
    } /**

     * Gets the value of the left eye property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public String getLEFTEYE() {
        return lefteye;
    }

    /**
     * Sets the value of the left eye property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLEFTEYE(String value) {
        this.lefteye = value;
    }

    /**
     * Gets the value of the right eye property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public String getRIGHTEYE() {
        return righteye;
    }

    /**
     * Sets the value of the right eye property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRIGHTEYE(String value) {
        this.righteye = value;
    }

    /**
     * Gets the value of the righteyestatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRIGHTEYESTATUS() {
        return righteyestatus;
    }

    /**
     * Sets the value of the righteyestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRIGHTEYESTATUS(String value) {
        this.righteyestatus = value;
    }

    /**
     * Gets the value of the lefteyestatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLEFTEYESTATUS() {
        return lefteyestatus;
    }

    /**
     * Sets the value of the lefteyestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLEFTEYESTATUS(String value) {
        this.lefteyestatus = value;
    }


}
