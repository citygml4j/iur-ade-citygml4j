//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * zoning district
 * 
 * <p>Java-Klasse für ZoneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finalPublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="areaApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}_GenericApplicationPropertyOfZone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneType", propOrder = {
    "finalPublicationDate",
    "areaApplied",
    "_GenericApplicationPropertyOfZone"
})
@XmlSeeAlso({
    LandUsePlanType.class,
    UrbanPlanType.class,
    AgreementType.class,
    RegulationType.class,
    AreaClassificationType.class,
    DistrictsAndZonesType.class,
    DevelopmentProjectType.class
})
public abstract class ZoneType
    extends UrbanFunctionType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalPublicationDate;
    protected String areaApplied;
    @XmlElementRef(name = "_GenericApplicationPropertyOfZone", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfZone;

    /**
     * Ruft den Wert der finalPublicationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalPublicationDate() {
        return finalPublicationDate;
    }

    /**
     * Legt den Wert der finalPublicationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalPublicationDate(XMLGregorianCalendar value) {
        this.finalPublicationDate = value;
    }

    public boolean isSetFinalPublicationDate() {
        return (this.finalPublicationDate!= null);
    }

    /**
     * Ruft den Wert der areaApplied-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaApplied() {
        return areaApplied;
    }

    /**
     * Legt den Wert der areaApplied-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaApplied(String value) {
        this.areaApplied = value;
    }

    public boolean isSetAreaApplied() {
        return (this.areaApplied!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfZone() {
        if (_GenericApplicationPropertyOfZone == null) {
            _GenericApplicationPropertyOfZone = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfZone;
    }

    public boolean isSet_GenericApplicationPropertyOfZone() {
        return ((this._GenericApplicationPropertyOfZone!= null)&&(!this._GenericApplicationPropertyOfZone.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfZone() {
        this._GenericApplicationPropertyOfZone = null;
    }

}
