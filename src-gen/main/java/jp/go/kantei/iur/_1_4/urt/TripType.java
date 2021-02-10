//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MultiCurvePropertyType;


/**
 * <p>Java-Klasse für TripType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directionId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="blockId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wheelchairAccessible" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="bikeAllowed" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType"/&gt;
 *         &lt;element name="calendar" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="calendarDate" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarDatePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="office" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}OfficePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="shape" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}ShapePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripType", propOrder = {
    "headsign",
    "shortName",
    "directionId",
    "blockId",
    "wheelchairAccessible",
    "bikeAllowed",
    "symbol",
    "route",
    "calendar",
    "calendarDate",
    "office",
    "shape",
    "lod0MultiCurve"
})
public class TripType
    extends PublicTransitType
{

    protected String headsign;
    protected String shortName;
    protected CodeType directionId;
    protected String blockId;
    protected CodeType wheelchairAccessible;
    protected CodeType bikeAllowed;
    protected String symbol;
    @XmlElement(required = true)
    protected RoutePropertyType route;
    protected CalendarPropertyType calendar;
    protected CalendarDatePropertyType calendarDate;
    protected OfficePropertyType office;
    protected ShapePropertyType shape;
    protected MultiCurvePropertyType lod0MultiCurve;

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    public boolean isSetShortName() {
        return (this.shortName!= null);
    }

    /**
     * Ruft den Wert der directionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDirectionId() {
        return directionId;
    }

    /**
     * Legt den Wert der directionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDirectionId(CodeType value) {
        this.directionId = value;
    }

    public boolean isSetDirectionId() {
        return (this.directionId!= null);
    }

    /**
     * Ruft den Wert der blockId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockId() {
        return blockId;
    }

    /**
     * Legt den Wert der blockId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockId(String value) {
        this.blockId = value;
    }

    public boolean isSetBlockId() {
        return (this.blockId!= null);
    }

    /**
     * Ruft den Wert der wheelchairAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    /**
     * Legt den Wert der wheelchairAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWheelchairAccessible(CodeType value) {
        this.wheelchairAccessible = value;
    }

    public boolean isSetWheelchairAccessible() {
        return (this.wheelchairAccessible!= null);
    }

    /**
     * Ruft den Wert der bikeAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBikeAllowed() {
        return bikeAllowed;
    }

    /**
     * Legt den Wert der bikeAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBikeAllowed(CodeType value) {
        this.bikeAllowed = value;
    }

    public boolean isSetBikeAllowed() {
        return (this.bikeAllowed!= null);
    }

    /**
     * Ruft den Wert der symbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Legt den Wert der symbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    public boolean isSetSymbol() {
        return (this.symbol!= null);
    }

    /**
     * Ruft den Wert der route-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePropertyType }
     *     
     */
    public RoutePropertyType getRoute() {
        return route;
    }

    /**
     * Legt den Wert der route-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePropertyType }
     *     
     */
    public void setRoute(RoutePropertyType value) {
        this.route = value;
    }

    public boolean isSetRoute() {
        return (this.route!= null);
    }

    /**
     * Ruft den Wert der calendar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPropertyType }
     *     
     */
    public CalendarPropertyType getCalendar() {
        return calendar;
    }

    /**
     * Legt den Wert der calendar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPropertyType }
     *     
     */
    public void setCalendar(CalendarPropertyType value) {
        this.calendar = value;
    }

    public boolean isSetCalendar() {
        return (this.calendar!= null);
    }

    /**
     * Ruft den Wert der calendarDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDatePropertyType }
     *     
     */
    public CalendarDatePropertyType getCalendarDate() {
        return calendarDate;
    }

    /**
     * Legt den Wert der calendarDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDatePropertyType }
     *     
     */
    public void setCalendarDate(CalendarDatePropertyType value) {
        this.calendarDate = value;
    }

    public boolean isSetCalendarDate() {
        return (this.calendarDate!= null);
    }

    /**
     * Ruft den Wert der office-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OfficePropertyType }
     *     
     */
    public OfficePropertyType getOffice() {
        return office;
    }

    /**
     * Legt den Wert der office-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficePropertyType }
     *     
     */
    public void setOffice(OfficePropertyType value) {
        this.office = value;
    }

    public boolean isSetOffice() {
        return (this.office!= null);
    }

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShapePropertyType }
     *     
     */
    public ShapePropertyType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapePropertyType }
     *     
     */
    public void setShape(ShapePropertyType value) {
        this.shape = value;
    }

    public boolean isSetShape() {
        return (this.shape!= null);
    }

    /**
     * Ruft den Wert der lod0MultiCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    /**
     * Legt den Wert der lod0MultiCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod0MultiCurve(MultiCurvePropertyType value) {
        this.lod0MultiCurve = value;
    }

    public boolean isSetLod0MultiCurve() {
        return (this.lod0MultiCurve!= null);
    }

}
