//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finalPublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="areaApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "areaApplied"
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

}
