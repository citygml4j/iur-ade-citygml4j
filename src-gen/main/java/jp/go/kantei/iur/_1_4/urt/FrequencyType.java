//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java-Klasse für FrequencyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FrequencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="headwaySecs" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="exactTimes" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}TripPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyType", propOrder = {
    "startTime",
    "endTime",
    "headwaySecs",
    "exactTimes",
    "trip"
})
public class FrequencyType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(required = true)
    protected BigInteger headwaySecs;
    protected CodeType exactTimes;
    @XmlElement(required = true)
    protected TripPropertyType trip;

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    public boolean isSetEndTime() {
        return (this.endTime!= null);
    }

    /**
     * Ruft den Wert der headwaySecs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeadwaySecs() {
        return headwaySecs;
    }

    /**
     * Legt den Wert der headwaySecs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeadwaySecs(BigInteger value) {
        this.headwaySecs = value;
    }

    public boolean isSetHeadwaySecs() {
        return (this.headwaySecs!= null);
    }

    /**
     * Ruft den Wert der exactTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExactTimes() {
        return exactTimes;
    }

    /**
     * Legt den Wert der exactTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExactTimes(CodeType value) {
        this.exactTimes = value;
    }

    public boolean isSetExactTimes() {
        return (this.exactTimes!= null);
    }

    /**
     * Ruft den Wert der trip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripPropertyType }
     *     
     */
    public TripPropertyType getTrip() {
        return trip;
    }

    /**
     * Legt den Wert der trip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPropertyType }
     *     
     */
    public void setTrip(TripPropertyType value) {
        this.trip = value;
    }

    public boolean isSetTrip() {
        return (this.trip!= null);
    }

}
