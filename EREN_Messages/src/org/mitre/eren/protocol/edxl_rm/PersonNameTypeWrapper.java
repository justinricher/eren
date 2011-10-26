//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.26 at 12:27:28 PM EDT 
//


package org.mitre.eren.protocol.edxl_rm;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;


/**
 * Reusable complex type
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameElement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oasis:names:tc:ciq:ct:3>String">
 *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grAbbreviation"/>
 *                 &lt;attribute name="ElementType" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameElementList" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xnl:3}grNameKey"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grValidityDate"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grLanguageCode"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attribute name="Type1" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameTypeList" />
 *       &lt;attribute name="PersonID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PersonIDType" type="{urn:oasis:names:tc:ciq:xnl:3}PersonIDTypeList" />
 *       &lt;attribute name="ID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="Usage" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameUsageList" />
 *       &lt;attribute name="Status" type="{urn:oasis:names:tc:ciq:ct:3}StatusList" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink1}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink1}label"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink1}href"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", namespace = "urn:oasis:names:tc:ciq:xnl:3", propOrder = {
    "nameElement"
})
@XmlSeeAlso({
    org.mitre.eren.protocol.edxl_rm.PersonName.class
})
public class PersonNameTypeWrapper extends BaseWrapper implements PersonNameType {


    public PersonNameTypeWrapper(Element internal) {
    super(internal);
    // TODO Auto-generated constructor stub
  }

  public PersonNameTypeWrapper(Factory factory, QName qname) {
    super(factory, qname);
    // TODO Auto-generated constructor stub
  }

    /**
     * Gets the value of the nameElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameTypeWrapper.NameElement }
     * 
     * 
     */
    @Override
	public List<NameElement> getNameElement() {
        return getExtensions(XNL_NAMEELEMENT);
    }
    
    @Override
	public NameElement addNameElement() { 
      return addExtension(XNL_NAMEELEMENT);
    }

    @Override
	public NameElement getFirstName () { 
      for (NameElement ne : getNameElement()) { 
        if (ne.getAttributeValue(XNL_ELEMENTTYPE).equals(RM_FIRSTNAME)) { 
          return ne;
        }
      }
      return null;
    }
    
    @Override
	public NameElement getLastName () { 
      for (NameElement ne : getNameElement()) { 
        if (ne.getAttributeValue(XNL_ELEMENTTYPE).equals(RM_LASTNAME)) { 
          return ne;
        }
      }
      return null;
    }
     
    @Override
	public void setFirstName (String firstName) { 
      NameElement ne = addNameElement();
      ne.setElementType(PersonNameElementList.FIRST_NAME);
      ne.setText(firstName);
    }
    
    @Override
	public void setLastName (String lastName) { 
      NameElement ne = addNameElement();
      ne.setElementType(PersonNameElementList.LAST_NAME);
      ne.setText(lastName);
    }


//    /**
//     * Gets the value of the type1 property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link PersonNameTypeList }
//     *     
//     */
//    public PersonNameTypeList getType() {
//        return type;
//    }
//
//    /**
//     * Sets the value of the type1 property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link PersonNameTypeList }
//     *     
//     */
//    public void setType1(PersonNameTypeList value) {
//        this.type1 = value;
//    }
//
//    /**
//     * Gets the value of the personID property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getPersonID() {
//        return personID;
//    }
//
//    /**
//     * Sets the value of the personID property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setPersonID(String value) {
//        this.personID = value;
//    }
//
//    /**
//     * Gets the value of the personIDType property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getPersonIDType() {
//        return personIDType;
//    }
//
//    /**
//     * Sets the value of the personIDType property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setPersonIDType(String value) {
//        this.personIDType = value;
//    }
//
//    /**
//     * Gets the value of the id property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getID() {
//        return id;
//    }
//
//    /**
//     * Sets the value of the id property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setID(String value) {
//        this.id = value;
//    }
//
//    /**
//     * Gets the value of the usage property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getUsage() {
//        return usage;
//    }
//
//    /**
//     * Sets the value of the usage property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setUsage(String value) {
//        this.usage = value;
//    }
//
//    /**
//     * Gets the value of the status property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getStatus() {
//        return status;
//    }
//
//    /**
//     * Sets the value of the status property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setStatus(String value) {
//        this.status = value;
//    }
//
//    /**
//     * Gets the value of the type property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getType() {
//        return type;
//    }
//
//    /**
//     * Sets the value of the type property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setType(String value) {
//        this.type = value;
//    }
//
//    /**
//     * Gets the value of the label property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getLabel() {
//        return label;
//    }
//
//    /**
//     * Sets the value of the label property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setLabel(String value) {
//        this.label = value;
//    }
//
//    /**
//     * Gets the value of the href property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getHref() {
//        return href;
//    }
//
//    /**
//     * Sets the value of the href property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setHref(String value) {
//        this.href = value;
//    }
//
//    /**
//     * Gets the value of the nameKey property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getNameKey() {
//        return nameKey;
//    }
//
//    /**
//     * Sets the value of the nameKey property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setNameKey(String value) {
//        this.nameKey = value;
//    }
//
//    /**
//     * Gets the value of the nameKeyRef property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getNameKeyRef() {
//        return nameKeyRef;
//    }
//
//    /**
//     * Sets the value of the nameKeyRef property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setNameKeyRef(String value) {
//        this.nameKeyRef = value;
//    }
//
//    /**
//     * Gets the value of the dateValidFrom property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public XMLGregorianCalendar getDateValidFrom() {
//        return dateValidFrom;
//    }
//
//    /**
//     * Sets the value of the dateValidFrom property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public void setDateValidFrom(XMLGregorianCalendar value) {
//        this.dateValidFrom = value;
//    }
//
//    /**
//     * Gets the value of the dateValidTo property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public XMLGregorianCalendar getDateValidTo() {
//        return dateValidTo;
//    }
//
//    /**
//     * Sets the value of the dateValidTo property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public void setDateValidTo(XMLGregorianCalendar value) {
//        this.dateValidTo = value;
//    }
//
//    /**
//     * Gets the value of the languageCode property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getLanguageCode() {
//        return languageCode;
//    }
//
//    /**
//     * Sets the value of the languageCode property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setLanguageCode(String value) {
//        this.languageCode = value;
//    }
//
//    /**
//     * Gets the value of the dataQualityType property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link DataQualityTypeList }
//     *     
//     */
//    public DataQualityTypeList getDataQualityType() {
//        return dataQualityType;
//    }
//
//    /**
//     * Sets the value of the dataQualityType property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link DataQualityTypeList }
//     *     
//     */
//    public void setDataQualityType(DataQualityTypeList value) {
//        this.dataQualityType = value;
//    }
//
//    /**
//     * Gets the value of the validFrom property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public XMLGregorianCalendar getValidFrom() {
//        return validFrom;
//    }
//
//    /**
//     * Sets the value of the validFrom property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public void setValidFrom(XMLGregorianCalendar value) {
//        this.validFrom = value;
//    }
//
//    /**
//     * Gets the value of the validTo property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public XMLGregorianCalendar getValidTo() {
//        return validTo;
//    }
//
//    /**
//     * Sets the value of the validTo property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link XMLGregorianCalendar }
//     *     
//     */
//    public void setValidTo(XMLGregorianCalendar value) {
//        this.validTo = value;
//    }
//
//    /**
//     * Gets a map that contains attributes that aren't bound to any typed property on this class.
//     * 
//     * <p>
//     * the map is keyed by the name of the attribute and 
//     * the value is the string value of the attribute.
//     * 
//     * the map returned by this method is live, and you can add new attribute
//     * by updating the map directly. Because of this design, there's no setter.
//     * 
//     * 
//     * @return
//     *     always non-null
//     */
//    public Map<QName, String> getOtherAttributes() {
//        return otherAttributes;
//    }




}