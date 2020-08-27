//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.11 at 11:03:22 AM WAT 
//


package com.seamfix.nimc.jaxb.enrollment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.seamfix.nimc.jaxb.enrollment.update.DOCUMENTDATA;
import com.seamfix.nimc.jaxb.enrollment.update.GUARDIANDATA;


/**
 * <p>Java class for ENROLLMENT_DATAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENROLLMENT_DATAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APPLICATION_DATA" type="{}APPLICATION_DATAType"/&gt;
 *         &lt;element name="DEMOGRAPHIC_DATA" type="{}DEMOGRAPHIC_DATAType"/&gt;
 *         &lt;element name="RESIDENCE_ADDRESS_DATA" type="{}RESIDENCE_ADDRESS_DATAType"/&gt;
 *         &lt;element name="ORIGIN_DATA" type="{}ORIGIN_DATAType"/&gt;
 *         &lt;element name="BIOMETRIC_DATA" type="{}BIOMETRIC_DATAType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ENROLLMENT_DATA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENROLLMENT_DATAType", propOrder = {
        "applicationdata",
        "demographicdata",
        "documentdata",
        "residenceaddressdata",
        "origindata",
        "guardiandata",
        "biometricdata",
        "applicantsignature"
})
public class ENROLLMENTDATAType {

    @XmlElement(name = "APPLICATION_DATA", required = true)
    public APPLICATIONDATAType applicationdata;
    @XmlElement(name = "DEMOGRAPHIC_DATA", required = true)
    public DEMOGRAPHICDATAType demographicdata;
    
    @XmlElement(name = "DOCUMENT_DATA", nillable = true)
    public List<DOCUMENTDATA> documentdata;
    
    @XmlElement(name = "RESIDENCE_ADDRESS_DATA", required = true)
    public RESIDENCEADDRESSDATAType residenceaddressdata;
    @XmlElement(name = "ORIGIN_DATA", required = true)
    public ORIGINDATAType origindata;

    @XmlElement(name = "GUARDIAN_DATA", required = false)
    public GUARDIANDATA guardiandata;

    @XmlElement(name = "BIOMETRIC_DATA", required = true)
    public BIOMETRICDATAType biometricdata;
    
    @XmlElement(name = "APPLICANT_SIGNATURE", required = true)
    public APPLICANTSIGNATUREDATAType applicantsignature;


    /**
     * Gets the value of the applicationdata property.
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONDATAType }
     *     
     */
    public APPLICATIONDATAType getAPPLICATIONDATA() {
        return applicationdata;
    }

    /**
     * Sets the value of the applicationdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONDATAType }
     *     
     */
    public void setAPPLICATIONDATA(APPLICATIONDATAType value) {
        this.applicationdata = value;
    }

    /**
     * Gets the value of the demographicdata property.
     * 
     * @return
     *     possible object is
     *     {@link DEMOGRAPHICDATAType }
     *     
     */
    public DEMOGRAPHICDATAType getDEMOGRAPHICDATA() {
        return demographicdata;
    }
    
    /**
     * Gets the value of the documentdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENTDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENTDATA }
     * 
     * 
     */
    public List<DOCUMENTDATA> getDOCUMENTDATA() {
        if (documentdata == null) {
            documentdata = new ArrayList<DOCUMENTDATA>();
        }
        return this.documentdata;
    }

    /**
     * Sets the value of the demographicdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEMOGRAPHICDATAType }
     *     
     */
    public void setDEMOGRAPHICDATA(DEMOGRAPHICDATAType value) {
        this.demographicdata = value;
    }

    /**
     * Gets the value of the residenceaddressdata property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCEADDRESSDATAType }
     *     
     */
    public RESIDENCEADDRESSDATAType getRESIDENCEADDRESSDATA() {
        return residenceaddressdata;
    }

    /**
     * Sets the value of the residenceaddressdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCEADDRESSDATAType }
     *     
     */
    public void setRESIDENCEADDRESSDATA(RESIDENCEADDRESSDATAType value) {
        this.residenceaddressdata = value;
    }

    /**
     * Gets the value of the origindata property.
     * 
     * @return
     *     possible object is
     *     {@link ORIGINDATAType }
     *     
     */
    public ORIGINDATAType getORIGINDATA() {
        return origindata;
    }

    /**
     * Sets the value of the origindata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORIGINDATAType }
     *     
     */
    public void setORIGINDATA(ORIGINDATAType value) {
        this.origindata = value;
    }

    /**
     * Gets the value of the biometricdata property.
     * 
     * @return
     *     possible object is
     *     {@link BIOMETRICDATAType }
     *     
     */
    public BIOMETRICDATAType getBIOMETRICDATA() {
        return biometricdata;
    }

    /**
     * Sets the value of the biometricdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIOMETRICDATAType }
     *     
     */
    public void setBIOMETRICDATA(BIOMETRICDATAType value) {
        this.biometricdata = value;
    }
    
    /**
     * Gets the value of the biometricdata property.
     * 
     * @return
     *     possible object is
     *     {@link APPLICANTSIGNATUREDATAType }
     *     
     */
    public APPLICANTSIGNATUREDATAType getAPPLICANTSIGNATUREDATA() {
        return applicantsignature;
    }

    /**
     * Sets the value of the biometricdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICANTSIGNATUREDATAType }
     *     
     */
    public void setAPPLICANTSIGNATUREDATA(APPLICANTSIGNATUREDATAType value) {
        this.applicantsignature = value;
    }

    /**
     * Gets the value of the guardiandata property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GUARDIANDATA }{@code >}
     *
     */
    public GUARDIANDATA getGUARDIANDATA() {
        return guardiandata;
    }

    /**
     * Sets the value of the guardiandata property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GUARDIANDATA }{@code >}
     *
     */
    public void setGUARDIANDATA(GUARDIANDATA value) {
        this.guardiandata = value;
    }

}
