//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für LargeCustomerFacilitiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LargeCustomerFacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalStoreFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="inauguralDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="keyTenants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="districtsAndZonesType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="landUsePlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LargeCustomerFacilitiesType", propOrder = {
    "clazz",
    "name",
    "capacity",
    "owner",
    "totalFloorArea",
    "totalStoreFloorArea",
    "inauguralDate",
    "keyTenants",
    "availability",
    "urbanPlanType",
    "districtsAndZonesType",
    "landUsePlanType",
    "areaClassificationType",
    "prefecture",
    "city",
    "reference",
    "note",
    "surveyYear"
})
public class LargeCustomerFacilitiesType {

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected String name;
    protected BigInteger capacity;
    protected String owner;
    protected MeasureType totalFloorArea;
    protected MeasureType totalStoreFloorArea;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inauguralDate;
    protected String keyTenants;
    protected Boolean availability;
    protected CodeType urbanPlanType;
    protected CodeType districtsAndZonesType;
    protected CodeType landUsePlanType;
    protected CodeType areaClassificationType;
    protected CodeType prefecture;
    protected CodeType city;
    protected String reference;
    protected String note;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;

    /**
     * Ruft den Wert der clazz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Legt den Wert der clazz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Ruft den Wert der capacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * Legt den Wert der capacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }

    public boolean isSetCapacity() {
        return (this.capacity!= null);
    }

    /**
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    public boolean isSetOwner() {
        return (this.owner!= null);
    }

    /**
     * Ruft den Wert der totalFloorArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalFloorArea() {
        return totalFloorArea;
    }

    /**
     * Legt den Wert der totalFloorArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalFloorArea(MeasureType value) {
        this.totalFloorArea = value;
    }

    public boolean isSetTotalFloorArea() {
        return (this.totalFloorArea!= null);
    }

    /**
     * Ruft den Wert der totalStoreFloorArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalStoreFloorArea() {
        return totalStoreFloorArea;
    }

    /**
     * Legt den Wert der totalStoreFloorArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalStoreFloorArea(MeasureType value) {
        this.totalStoreFloorArea = value;
    }

    public boolean isSetTotalStoreFloorArea() {
        return (this.totalStoreFloorArea!= null);
    }

    /**
     * Ruft den Wert der inauguralDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInauguralDate() {
        return inauguralDate;
    }

    /**
     * Legt den Wert der inauguralDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInauguralDate(XMLGregorianCalendar value) {
        this.inauguralDate = value;
    }

    public boolean isSetInauguralDate() {
        return (this.inauguralDate!= null);
    }

    /**
     * Ruft den Wert der keyTenants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyTenants() {
        return keyTenants;
    }

    /**
     * Legt den Wert der keyTenants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyTenants(String value) {
        this.keyTenants = value;
    }

    public boolean isSetKeyTenants() {
        return (this.keyTenants!= null);
    }

    /**
     * Ruft den Wert der availability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailability() {
        return availability;
    }

    /**
     * Legt den Wert der availability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailability(Boolean value) {
        this.availability = value;
    }

    public boolean isSetAvailability() {
        return (this.availability!= null);
    }

    /**
     * Ruft den Wert der urbanPlanType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUrbanPlanType() {
        return urbanPlanType;
    }

    /**
     * Legt den Wert der urbanPlanType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUrbanPlanType(CodeType value) {
        this.urbanPlanType = value;
    }

    public boolean isSetUrbanPlanType() {
        return (this.urbanPlanType!= null);
    }

    /**
     * Ruft den Wert der districtsAndZonesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDistrictsAndZonesType() {
        return districtsAndZonesType;
    }

    /**
     * Legt den Wert der districtsAndZonesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDistrictsAndZonesType(CodeType value) {
        this.districtsAndZonesType = value;
    }

    public boolean isSetDistrictsAndZonesType() {
        return (this.districtsAndZonesType!= null);
    }

    /**
     * Ruft den Wert der landUsePlanType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLandUsePlanType() {
        return landUsePlanType;
    }

    /**
     * Legt den Wert der landUsePlanType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLandUsePlanType(CodeType value) {
        this.landUsePlanType = value;
    }

    public boolean isSetLandUsePlanType() {
        return (this.landUsePlanType!= null);
    }

    /**
     * Ruft den Wert der areaClassificationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaClassificationType() {
        return areaClassificationType;
    }

    /**
     * Legt den Wert der areaClassificationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaClassificationType(CodeType value) {
        this.areaClassificationType = value;
    }

    public boolean isSetAreaClassificationType() {
        return (this.areaClassificationType!= null);
    }

    /**
     * Ruft den Wert der prefecture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPrefecture() {
        return prefecture;
    }

    /**
     * Legt den Wert der prefecture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPrefecture(CodeType value) {
        this.prefecture = value;
    }

    public boolean isSetPrefecture() {
        return (this.prefecture!= null);
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCity(CodeType value) {
        this.city = value;
    }

    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Ruft den Wert der reference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Legt den Wert der reference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

    /**
     * Ruft den Wert der surveyYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyYear() {
        return surveyYear;
    }

    /**
     * Legt den Wert der surveyYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyYear(XMLGregorianCalendar value) {
        this.surveyYear = value;
    }

    public boolean isSetSurveyYear() {
        return (this.surveyYear!= null);
    }

}
