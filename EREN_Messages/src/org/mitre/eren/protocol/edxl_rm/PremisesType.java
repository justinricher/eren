//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.26 at 12:27:28 PM EDT 
//


package org.mitre.eren.protocol.edxl_rm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;
import org.opencare.lib.model.BaseWrapper;


/**
 * Complex type for internal reuse
 * 
 * <p>Java class for PremisesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="NameElement">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oasis:names:tc:ciq:xal:3>NameType">
 *                 &lt;attribute name="NameType" type="{urn:oasis:names:tc:ciq:xal:3}PremisesElementTypeList" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Number" type="{urn:oasis:names:tc:ciq:xal:3}IdentifierType"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesType", namespace = "urn:oasis:names:tc:ciq:xal:3", propOrder = {
    "nameElementOrNumber"
})
//@XmlSeeAlso({
//    org.mitre.eren.protocol.edxl_rm.AddressType.Premises.SubPremises.class,
//    org.mitre.eren.protocol.edxl_rm.AddressType.Premises.class
//})
public class PremisesType extends BaseWrapper implements Element, ExtensibleElement, EDXLRMConstants {

    public PremisesType(Element internal) {
    super(internal);
    // TODO Auto-generated constructor stub
  }

  public PremisesType(Factory factory, QName qname) {
    super(factory, qname);
    // TODO Auto-generated constructor stub
  }


    @XmlElements({
        @XmlElement(name = "Number", type = IdentifierType.class),
        @XmlElement(name = "NameElement", type = PremisesType.NameElement.class)
    })
    protected List<Object> nameElementOrNumber;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the nameElementOrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameElementOrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameElementOrNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * {@link PremisesType.NameElement }
     * 
     * 
     */
    public List<Object> getNameElementOrNumber() {
        if (nameElementOrNumber == null) {
            nameElementOrNumber = new ArrayList<Object>();
        }
        return this.nameElementOrNumber;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oasis:names:tc:ciq:xal:3>NameType">
     *       &lt;attribute name="NameType" type="{urn:oasis:names:tc:ciq:xal:3}PremisesElementTypeList" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NameElement
        extends NameType
    {

        @XmlAttribute(name = "NameType", namespace = "urn:oasis:names:tc:ciq:xal:3")
        protected PremisesElementTypeList nameType;

        /**
         * Gets the value of the nameType property.
         * 
         * @return
         *     possible object is
         *     {@link PremisesElementTypeList }
         *     
         */
        public PremisesElementTypeList getNameType() {
            return nameType;
        }

        /**
         * Sets the value of the nameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PremisesElementTypeList }
         *     
         */
        public void setNameType(PremisesElementTypeList value) {
            this.nameType = value;
        }

    }

}
