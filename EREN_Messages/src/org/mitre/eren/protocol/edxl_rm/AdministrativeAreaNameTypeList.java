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
 * <p>Java class for AdministrativeAreaNameTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeAreaNameTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="ReferenceLocation"/>
 *     &lt;enumeration value="Type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeAreaNameTypeList", namespace = "urn:oasis:names:tc:ciq:xal:3")
@XmlEnum
public enum AdministrativeAreaNameTypeList {


    /**
     * Name of the administrative area
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Number")
    NUMBER("Number"),

    /**
     * Reference location information in support of the administrative area. e.g. Territory of France
     * 
     */
    @XmlEnumValue("ReferenceLocation")
    REFERENCE_LOCATION("ReferenceLocation"),

    /**
     * Other supporting information 
     * 
     */
    @XmlEnumValue("Type")
    TYPE("Type");
    private final String value;

    AdministrativeAreaNameTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeAreaNameTypeList fromValue(String v) {
        for (AdministrativeAreaNameTypeList c: AdministrativeAreaNameTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
