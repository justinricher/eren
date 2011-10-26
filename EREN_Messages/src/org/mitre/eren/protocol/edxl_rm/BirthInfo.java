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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


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
 *         &lt;element name="BirthInfoElement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oasis:names:tc:ciq:ct:3>String">
 *                 &lt;attribute name="Type" type="{urn:oasis:names:tc:ciq:xpil:3}BirthInfoElementList" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BirthPlaceDetails" type="{urn:oasis:names:tc:ciq:xal:3}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attribute name="BirthDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="BirthDateTimePrecision" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "birthInfoElement",
    "birthPlaceDetails"
})
@XmlRootElement(name = "BirthInfo")
public class BirthInfo {

    @XmlElement(name = "BirthInfoElement")
    protected List<BirthInfo.BirthInfoElement> birthInfoElement;
    @XmlElement(name = "BirthPlaceDetails")
    protected AddressType birthPlaceDetails;
    @XmlAttribute(name = "BirthDateTime", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDateTime;
    @XmlAttribute(name = "BirthDateTimePrecision", namespace = "urn:oasis:names:tc:ciq:xpil:3")
    protected Duration birthDateTimePrecision;
    @XmlAttribute(name = "DataQualityType", namespace = "urn:oasis:names:tc:ciq:ct:3")
    protected DataQualityTypeList dataQualityType;
    @XmlAttribute(name = "ValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "ValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the birthInfoElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthInfoElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthInfoElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BirthInfo.BirthInfoElement }
     * 
     * 
     */
    public List<BirthInfo.BirthInfoElement> getBirthInfoElement() {
        if (birthInfoElement == null) {
            birthInfoElement = new ArrayList<BirthInfo.BirthInfoElement>();
        }
        return this.birthInfoElement;
    }

    /**
     * Gets the value of the birthPlaceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBirthPlaceDetails() {
        return birthPlaceDetails;
    }

    /**
     * Sets the value of the birthPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBirthPlaceDetails(AddressType value) {
        this.birthPlaceDetails = value;
    }

    /**
     * Gets the value of the birthDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDateTime() {
        return birthDateTime;
    }

    /**
     * Sets the value of the birthDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDateTime(XMLGregorianCalendar value) {
        this.birthDateTime = value;
    }

    /**
     * Gets the value of the birthDateTimePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBirthDateTimePrecision() {
        return birthDateTimePrecision;
    }

    /**
     * Sets the value of the birthDateTimePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBirthDateTimePrecision(Duration value) {
        this.birthDateTimePrecision = value;
    }

    /**
     * Gets the value of the dataQualityType property.
     * 
     * @return
     *     possible object is
     *     {@link DataQualityTypeList }
     *     
     */
    public DataQualityTypeList getDataQualityType() {
        return dataQualityType;
    }

    /**
     * Sets the value of the dataQualityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataQualityTypeList }
     *     
     */
    public void setDataQualityType(DataQualityTypeList value) {
        this.dataQualityType = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
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
     *     &lt;extension base="&lt;urn:oasis:names:tc:ciq:ct:3>String">
     *       &lt;attribute name="Type" type="{urn:oasis:names:tc:ciq:xpil:3}BirthInfoElementList" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BirthInfoElement {

        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "Type", namespace = "urn:oasis:names:tc:ciq:xpil:3")
        protected BirthInfoElementList type;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Normalized and Collapsed String
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link BirthInfoElementList }
         *     
         */
        public BirthInfoElementList getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link BirthInfoElementList }
         *     
         */
        public void setType(BirthInfoElementList value) {
            this.type = value;
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

    }

}
