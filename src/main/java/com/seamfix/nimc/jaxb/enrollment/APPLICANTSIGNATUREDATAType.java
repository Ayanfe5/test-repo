package com.seamfix.nimc.jaxb.enrollment;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLICATION_SIGNATURE_DATAType", propOrder = {
    "userid",
    "signature"
})
public class APPLICANTSIGNATUREDATAType {
	
	@XmlElement(name = "USER_ID", required = true)
    public BigDecimal userid;
    @XmlElement(name = "SIGNATURE", required = true)
    public String signature;
    
    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUSERID(BigDecimal value) {
        this.userid = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNATURE() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNATURE(String value) {
        this.signature = value;
    }

}
