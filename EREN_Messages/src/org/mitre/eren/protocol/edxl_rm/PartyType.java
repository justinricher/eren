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
 * A container for defining the unique characteristics of a party, which can be a person or organisation
 * 
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}FreeTextLines" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{urn:oasis:names:tc:ciq:xnl:3}PartyNameType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Addresses" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Accounts" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ContactNumbers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Documents" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ElectronicAddressIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Events" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Identifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Memberships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Relationships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Revenues" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Stocks" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Vehicles" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}OrganisationInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}BirthInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}CountriesOfResidence" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Favourites" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Habits" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Hobbies" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Languages" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Nationalities" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Occupations" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PhysicalInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Preferences" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Qualifications" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Visas" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grLanguageCode"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grValidityDate"/>
 *       &lt;attribute name="PartyType" type="{urn:oasis:names:tc:ciq:xpil:3}PartyTypeList" />
 *       &lt;attribute name="PartyID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PartyIDType" type="{urn:oasis:names:tc:ciq:xpil:3}PartyIDTypeList" />
 *       &lt;attribute name="ID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="Usage" type="{urn:oasis:names:tc:ciq:xpil:3}PartyUsageList" />
 *       &lt;attribute name="Status" type="{urn:oasis:names:tc:ciq:ct:3}StatusList" />
 *       &lt;attribute name="PartyKey" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PartyKeyRef" type="{urn:oasis:names:tc:ciq:ct:3}String" />
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
@XmlType(name = "PartyType", propOrder = {
    "freeTextLines",
    "partyName",
    "addresses",
    "accounts",
    "contactNumbers",
    "documents",
    "electronicAddressIdentifiers",
    "events",
    "identifiers",
    "memberships",
    "relationships",
    "revenues",
    "stocks",
    "vehicles",
    "organisationInfo",
    "personInfo",
    "birthInfo",
    "countriesOfResidence",
    "favourites",
    "habits",
    "hobbies",
    "languages",
    "nationalities",
    "occupations",
    "physicalInfo",
    "preferences",
    "qualifications",
    "visas"
})
public interface PartyType extends Element, ExtensibleElement, EDXLRMConstants {

    public PartyNameType getPartyName();
    public PartyNameType addPartyName();
    public Occupations getOccupations();
    public Occupations addOccupations();

//  public FreeTextLines getFreeTextLines();
//  public void setFreeTextLines(FreeTextLines value);
//    public Addresses getAddresses();
//    public void setAddresses(Addresses value);
//    public Accounts getAccounts();
//    public void setAccounts(Accounts value);
//    public ContactNumbers getContactNumbers();
//    public void setContactNumbers(ContactNumbers value);
//    public Documents getDocuments();
//    public void setDocuments(Documents value);
//    public ElectronicAddressIdentifiers getElectronicAddressIdentifiers();
//    public void setElectronicAddressIdentifiers(ElectronicAddressIdentifiers value);
//    public Events getEvents();
//    public void setEvents(Events value);
//    public Identifiers getIdentifiers();
//    public void setIdentifiers(Identifiers value);
//    public Memberships getMemberships();
//    public void setMemberships(Memberships value);
//    public Relationships getRelationships();
//    public void setRelationships(Relationships value);
//    public Revenues getRevenues();
//    public void setRevenues(Revenues value);
//    public Stocks getStocks();
//    public void setStocks(Stocks value);
//    public Vehicles getVehicles();
//    public void setVehicles(Vehicles value);
//    public OrganisationInfo getOrganisationInfo();
//    public void setOrganisationInfo(OrganisationInfo value);
//    public PersonInfo getPersonInfo();
//    public void setPersonInfo(PersonInfo value);
//    public BirthInfo getBirthInfo();
//    public void setBirthInfo(BirthInfo value);
//    public CountriesOfResidence getCountriesOfResidence();
//    public void setCountriesOfResidence(CountriesOfResidence value);
//    public Favourites getFavourites();
//    public void setFavourites(Favourites value);
//    public Habits getHabits();
//    public void setHabits(Habits value);
//    public Hobbies getHobbies();
//    public void setHobbies(Hobbies value);
//    public Languages getLanguages();
//    public void setLanguages(Languages value);
//    public Nationalities getNationalities();
//    public void setNationalities(Nationalities value);
//    public PhysicalInfo getPhysicalInfo();
//    public void setPhysicalInfo(PhysicalInfo value);
//    public Preferences getPreferences();
//    public void setPreferences(Preferences value);
//    public Qualifications getQualifications();
//    public void setQualifications(Qualifications value);
//    public Visas getVisas();
//    public void setVisas(Visas value);
//    public String getPartyType();
//    public void setPartyType(String value);
//    public String getPartyID();
//    public void setPartyID(String value);
//    public String getPartyIDType();
//    public void setPartyIDType(String value);
//    public String getUsage();
//    public void setUsage(String value);
//    public String getStatus();
//    public void setStatus(String value);
//    public String getPartyKey();
//    public void setPartyKey(String value);
//    public String getPartyKeyRef();
//    public void setPartyKeyRef(String value);
//    public String getType();
//    public void setType(String value);
//    public String getLabel();
//    public void setLabel(String value);
//    public String getHref();
//    public void setHref(String value);
//    public String getLanguageCode();
//    public void setLanguageCode(String value);
//    public DataQualityTypeList getDataQualityType();
//    public void setDataQualityType(DataQualityTypeList value);
//    public XMLGregorianCalendar getValidFrom();
//    public void setValidFrom(XMLGregorianCalendar value);
//    public XMLGregorianCalendar getValidTo();
//    public void setValidTo(XMLGregorianCalendar value);
//    public XMLGregorianCalendar getDateValidFrom();
//    public void setDateValidFrom(XMLGregorianCalendar value);
//    public XMLGregorianCalendar getDateValidTo();
//    public void setDateValidTo(XMLGregorianCalendar value);
//    public Map<QName, String> getOtherAttributes();
}