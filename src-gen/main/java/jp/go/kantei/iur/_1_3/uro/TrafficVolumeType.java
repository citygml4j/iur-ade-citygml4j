//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java-Klasse für TrafficVolumeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficVolumeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weekday12hourTrafficVolume" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="weekday24hourTrafficVolume" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="largeVehicleRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="congestionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageTravelSpeedInCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="observationPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "TrafficVolumeType", propOrder = {
    "weekday12HourTrafficVolume",
    "weekday24HourTrafficVolume",
    "largeVehicleRate",
    "congestionRate",
    "averageTravelSpeedInCongestion",
    "observationPointName",
    "urbanPlanType",
    "areaClassificationType",
    "prefecture",
    "city",
    "reference",
    "note",
    "surveyYear"
})
public class TrafficVolumeType {

    @XmlElement(name = "weekday12hourTrafficVolume")
    protected BigInteger weekday12HourTrafficVolume;
    @XmlElement(name = "weekday24hourTrafficVolume")
    protected BigInteger weekday24HourTrafficVolume;
    protected Double largeVehicleRate;
    protected Double congestionRate;
    protected Double averageTravelSpeedInCongestion;
    protected String observationPointName;
    protected CodeType urbanPlanType;
    protected CodeType areaClassificationType;
    protected CodeType prefecture;
    protected CodeType city;
    protected String reference;
    protected String note;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;

    /**
     * Ruft den Wert der weekday12HourTrafficVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeekday12HourTrafficVolume() {
        return weekday12HourTrafficVolume;
    }

    /**
     * Legt den Wert der weekday12HourTrafficVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeekday12HourTrafficVolume(BigInteger value) {
        this.weekday12HourTrafficVolume = value;
    }

    public boolean isSetWeekday12HourTrafficVolume() {
        return (this.weekday12HourTrafficVolume!= null);
    }

    /**
     * Ruft den Wert der weekday24HourTrafficVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeekday24HourTrafficVolume() {
        return weekday24HourTrafficVolume;
    }

    /**
     * Legt den Wert der weekday24HourTrafficVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeekday24HourTrafficVolume(BigInteger value) {
        this.weekday24HourTrafficVolume = value;
    }

    public boolean isSetWeekday24HourTrafficVolume() {
        return (this.weekday24HourTrafficVolume!= null);
    }

    /**
     * Ruft den Wert der largeVehicleRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargeVehicleRate() {
        return largeVehicleRate;
    }

    /**
     * Legt den Wert der largeVehicleRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargeVehicleRate(Double value) {
        this.largeVehicleRate = value;
    }

    public boolean isSetLargeVehicleRate() {
        return (this.largeVehicleRate!= null);
    }

    /**
     * Ruft den Wert der congestionRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCongestionRate() {
        return congestionRate;
    }

    /**
     * Legt den Wert der congestionRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCongestionRate(Double value) {
        this.congestionRate = value;
    }

    public boolean isSetCongestionRate() {
        return (this.congestionRate!= null);
    }

    /**
     * Ruft den Wert der averageTravelSpeedInCongestion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageTravelSpeedInCongestion() {
        return averageTravelSpeedInCongestion;
    }

    /**
     * Legt den Wert der averageTravelSpeedInCongestion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageTravelSpeedInCongestion(Double value) {
        this.averageTravelSpeedInCongestion = value;
    }

    public boolean isSetAverageTravelSpeedInCongestion() {
        return (this.averageTravelSpeedInCongestion!= null);
    }

    /**
     * Ruft den Wert der observationPointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationPointName() {
        return observationPointName;
    }

    /**
     * Legt den Wert der observationPointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationPointName(String value) {
        this.observationPointName = value;
    }

    public boolean isSetObservationPointName() {
        return (this.observationPointName!= null);
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
