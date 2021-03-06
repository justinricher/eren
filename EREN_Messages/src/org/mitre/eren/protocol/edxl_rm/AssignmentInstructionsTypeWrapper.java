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
import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;


/**
 * <p>Java class for AssignmentInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentInstructionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModeOfTransportation" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}ModeOfTransportationType" minOccurs="0"/>
 *         &lt;element name="NavigationInstructions" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}NavigationInstructionsType" minOccurs="0"/>
 *         &lt;element name="ReportingInstructions" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}ReportingInstructionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentInstructionsType", namespace = "urn:oasis:names:tc:emergency:EDXL:RM:1.0", propOrder = {
    "modeOfTransportation",
    "navigationInstructions",
    "reportingInstructions"
})
public class AssignmentInstructionsTypeWrapper extends BaseWrapper implements AssignmentInstructionsType {

    public AssignmentInstructionsTypeWrapper(Element internal) {
    super(internal);
    // TODO Auto-generated constructor stub
  }

  public AssignmentInstructionsTypeWrapper(Factory factory, QName qname) {
    super(factory, qname);
    // TODO Auto-generated constructor stub
  }


    /**
     * Gets the value of the modeOfTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getModeOfTransportation() {
      return getSimpleExtension(RM_MODEOFTRANSPORTATION);
    }

    /**
     * Sets the value of the modeOfTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setModeOfTransportation(String value) {
      setElementText(RM_MODEOFTRANSPORTATION,value);
    }

    /**
     * Gets the value of the navigationInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getNavigationInstructions() {
      return getSimpleExtension(RM_NAVIGATIONINSTRUCTIONS);
    }

    /**
     * Sets the value of the navigationInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setNavigationInstructions(String value) {
      setElementText(RM_NAVIGATIONINSTRUCTIONS,value);
    }

    /**
     * Gets the value of the reportingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getReportingInstructions() {
      return getSimpleExtension(RM_REPORTINGINSTRUCTIONS);
    }

    /**
     * Sets the value of the reportingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setReportingInstructions(String value) {
      setElementText(RM_REPORTINGINSTRUCTIONS,value);

    }

}
