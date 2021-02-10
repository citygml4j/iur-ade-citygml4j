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


/**
 * <p>Java-Klasse für CalendarType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarType", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday",
    "startDate",
    "endDate"
})
public class CalendarType
    extends PublicTransitType
{

    protected boolean monday;
    protected boolean tuesday;
    protected boolean wednesday;
    protected boolean thursday;
    protected boolean friday;
    protected boolean saturday;
    protected boolean sunday;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Ruft den Wert der monday-Eigenschaft ab.
     * 
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * Legt den Wert der monday-Eigenschaft fest.
     * 
     */
    public void setMonday(boolean value) {
        this.monday = value;
    }

    public boolean isSetMonday() {
        return true;
    }

    /**
     * Ruft den Wert der tuesday-Eigenschaft ab.
     * 
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * Legt den Wert der tuesday-Eigenschaft fest.
     * 
     */
    public void setTuesday(boolean value) {
        this.tuesday = value;
    }

    public boolean isSetTuesday() {
        return true;
    }

    /**
     * Ruft den Wert der wednesday-Eigenschaft ab.
     * 
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * Legt den Wert der wednesday-Eigenschaft fest.
     * 
     */
    public void setWednesday(boolean value) {
        this.wednesday = value;
    }

    public boolean isSetWednesday() {
        return true;
    }

    /**
     * Ruft den Wert der thursday-Eigenschaft ab.
     * 
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * Legt den Wert der thursday-Eigenschaft fest.
     * 
     */
    public void setThursday(boolean value) {
        this.thursday = value;
    }

    public boolean isSetThursday() {
        return true;
    }

    /**
     * Ruft den Wert der friday-Eigenschaft ab.
     * 
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * Legt den Wert der friday-Eigenschaft fest.
     * 
     */
    public void setFriday(boolean value) {
        this.friday = value;
    }

    public boolean isSetFriday() {
        return true;
    }

    /**
     * Ruft den Wert der saturday-Eigenschaft ab.
     * 
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * Legt den Wert der saturday-Eigenschaft fest.
     * 
     */
    public void setSaturday(boolean value) {
        this.saturday = value;
    }

    public boolean isSetSaturday() {
        return true;
    }

    /**
     * Ruft den Wert der sunday-Eigenschaft ab.
     * 
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * Legt den Wert der sunday-Eigenschaft fest.
     * 
     */
    public void setSunday(boolean value) {
        this.sunday = value;
    }

    public boolean isSetSunday() {
        return true;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

}
