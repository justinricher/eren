//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.26 at 12:27:28 PM EDT 
//


package org.mitre.eren.protocol.edxl_rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubLocalityTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubLocalityTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Municipality"/>
 *     &lt;enumeration value="Village"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubLocalityTypeList", namespace = "urn:oasis:names:tc:ciq:xal:3")
@XmlEnum
public enum SubLocalityTypeList {

    @XmlEnumValue("Municipality")
    MUNICIPALITY("Municipality"),
    @XmlEnumValue("Village")
    VILLAGE("Village");
    private final String value;

    SubLocalityTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubLocalityTypeList fromValue(String v) {
        for (SubLocalityTypeList c: SubLocalityTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
