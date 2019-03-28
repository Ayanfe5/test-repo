
package com.seamfix.integrations.nimc.stubs.verification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nin"/>
 *     &lt;enumeration value="ninbio"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="bio"/>
 *     &lt;enumeration value="demo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestTypeEnum")
@XmlEnum
public enum RequestTypeEnum {

    @XmlEnumValue("nin")
    NIN("nin"),
    @XmlEnumValue("ninbio")
    NINBIO("ninbio"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("bio")
    BIO("bio"),
    @XmlEnumValue("demo")
    DEMO("demo");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
