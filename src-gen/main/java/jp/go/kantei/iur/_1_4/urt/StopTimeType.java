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
 * <p>Java-Klasse für StopTimeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="stopSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="headsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickupType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dropoffType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousPickupType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousDropoffType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="shapeDistanceTraveled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="timePoint" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}TripPropertyType"/&gt;
 *         &lt;element name="stop" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimeType", propOrder = {
    "arrivalTime",
    "departureTime",
    "stopSequence",
    "headsign",
    "pickupType",
    "dropoffType",
    "continuousPickupType",
    "continuousDropoffType",
    "shapeDistanceTraveled",
    "timePoint",
    "trip",
    "stop"
})
public class StopTimeType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(required = true)
    protected BigInteger stopSequence;
    protected String headsign;
    protected CodeType pickupType;
    protected CodeType dropoffType;
    protected CodeType continuousPickupType;
    protected CodeType continuousDropoffType;
    protected Double shapeDistanceTraveled;
    protected CodeType timePoint;
    @XmlElement(required = true)
    protected TripPropertyType trip;
    @XmlElement(required = true)
    protected StopPropertyType stop;

    /**
     * Ruft den Wert der arrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Legt den Wert der arrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    public boolean isSetArrivalTime() {
        return (this.arrivalTime!= null);
    }

    /**
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    public boolean isSetDepartureTime() {
        return (this.departureTime!= null);
    }

    /**
     * Ruft den Wert der stopSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopSequence() {
        return stopSequence;
    }

    /**
     * Legt den Wert der stopSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopSequence(BigInteger value) {
        this.stopSequence = value;
    }

    public boolean isSetStopSequence() {
        return (this.stopSequence!= null);
    }

    /**
     * Ruft den Wert der headsign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadsign() {
        return headsign;
    }

    /**
     * Legt den Wert der headsign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadsign(String value) {
        this.headsign = value;
    }

    public boolean isSetHeadsign() {
        return (this.headsign!= null);
    }

    /**
     * Ruft den Wert der pickupType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPickupType() {
        return pickupType;
    }

    /**
     * Legt den Wert der pickupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPickupType(CodeType value) {
        this.pickupType = value;
    }

    public boolean isSetPickupType() {
        return (this.pickupType!= null);
    }

    /**
     * Ruft den Wert der dropoffType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDropoffType() {
        return dropoffType;
    }

    /**
     * Legt den Wert der dropoffType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDropoffType(CodeType value) {
        this.dropoffType = value;
    }

    public boolean isSetDropoffType() {
        return (this.dropoffType!= null);
    }

    /**
     * Ruft den Wert der continuousPickupType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousPickupType() {
        return continuousPickupType;
    }

    /**
     * Legt den Wert der continuousPickupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousPickupType(CodeType value) {
        this.continuousPickupType = value;
    }

    public boolean isSetContinuousPickupType() {
        return (this.continuousPickupType!= null);
    }

    /**
     * Ruft den Wert der continuousDropoffType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousDropoffType() {
        return continuousDropoffType;
    }

    /**
     * Legt den Wert der continuousDropoffType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousDropoffType(CodeType value) {
        this.continuousDropoffType = value;
    }

    public boolean isSetContinuousDropoffType() {
        return (this.continuousDropoffType!= null);
    }

    /**
     * Ruft den Wert der shapeDistanceTraveled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShapeDistanceTraveled() {
        return shapeDistanceTraveled;
    }

    /**
     * Legt den Wert der shapeDistanceTraveled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShapeDistanceTraveled(Double value) {
        this.shapeDistanceTraveled = value;
    }

    public boolean isSetShapeDistanceTraveled() {
        return (this.shapeDistanceTraveled!= null);
    }

    /**
     * Ruft den Wert der timePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTimePoint() {
        return timePoint;
    }

    /**
     * Legt den Wert der timePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTimePoint(CodeType value) {
        this.timePoint = value;
    }

    public boolean isSetTimePoint() {
        return (this.timePoint!= null);
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

    /**
     * Ruft den Wert der stop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getStop() {
        return stop;
    }

    /**
     * Legt den Wert der stop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setStop(StopPropertyType value) {
        this.stop = value;
    }

    public boolean isSetStop() {
        return (this.stop!= null);
    }

}
