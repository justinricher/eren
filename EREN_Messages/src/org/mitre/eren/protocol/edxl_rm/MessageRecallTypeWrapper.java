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
 * <p>Java class for MessageRecallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageRecallType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecallMessageID" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}MessageIDType"/>
 *         &lt;element name="RecallType" type="{urn:oasis:names:tc:emergency:EDXL:RM:1.0}RecallTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRecallType", namespace = "urn:oasis:names:tc:emergency:EDXL:RM:1.0", propOrder = {
    "recallMessageID",
    "recallType"
})
public class MessageRecallTypeWrapper extends BaseWrapper implements MessageRecallType, EDXLRMConstants {

    public MessageRecallTypeWrapper(Element internal) {
    super(internal);
    // TODO Auto-generated constructor stub
  }

  public MessageRecallTypeWrapper(Factory factory, QName qname) {
    super(factory, qname);
    // TODO Auto-generated constructor stub
  }

   
    /**
     * Gets the value of the recallMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getRecallMessageID() {
        return getSimpleExtension(RM_RECALLMESSAGEID);
    }

    /**
     * Sets the value of the recallMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setRecallMessageID(String value) {
      setElementText(RM_RECALLMESSAGEID,value);
    }

    /**
     * Gets the value of the recallType property.
     * 
     * @return
     *     possible object is
     *     {@link RecallTypeType }
     *     
     */
    @Override
	public RecallTypeType getRecallType() {
      return RecallTypeType.fromValue(getSimpleExtension(RM_RECALLTYPE));
    }

    /**
     * Sets the value of the recallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecallTypeType }
     *     
     */
    @Override
	public void setRecallType(RecallTypeType value) {
      setElementText(RM_RECALLMESSAGEID,value.toString());
    }

}
