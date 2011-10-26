//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.26 at 12:27:28 PM EDT 
//


package org.mitre.eren.protocol.edxl_rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;


/**
 * <p>Java class for OwnershipInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnershipInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}OwnerType" minOccurs="0"/>
 *         &lt;element name="OwningJurisdiction" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}OwningJurisdictionType" minOccurs="0"/>
 *         &lt;element name="HomeDispatch" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}HomeDispatchType" minOccurs="0"/>
 *         &lt;element name="HomeUnit" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}HomeUnitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipInformationType", namespace = "urn:oasis:names:tc:emergency:EDXL:RM:1.0", propOrder = {
    "owner",
    "owningJurisdiction",
    "homeDispatch",
    "homeUnit"
})
public interface OwnershipInformationType extends Element, ExtensibleElement, EDXLRMConstants{

   
    public String getOwner();
    public void setOwner(String value);
    public String getOwningJurisdiction();
    public void setOwningJurisdiction(String value);
    public String getHomeDispatch();
    public void setHomeDispatch(String value);
    public String getHomeUnit();
    public void setHomeUnit(String value);
}
