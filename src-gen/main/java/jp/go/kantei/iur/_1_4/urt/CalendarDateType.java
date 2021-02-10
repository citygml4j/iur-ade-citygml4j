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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java-Klasse für CalendarDateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="exceptionType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="calendar" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateType", propOrder = {
    "date",
    "exceptionType",
    "calendar"
})
public class CalendarDateType
    extends PublicTransitType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected CodeType exceptionType;
    protected CalendarPropertyType calendar;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    public boolean isSetDate() {
        return (this.date!= null);
    }

    /**
     * Ruft den Wert der exceptionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExceptionType() {
        return exceptionType;
    }

    /**
     * Legt den Wert der exceptionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExceptionType(CodeType value) {
        this.exceptionType = value;
    }

    public boolean isSetExceptionType() {
        return (this.exceptionType!= null);
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

}
