//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiPointPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;


/**
 * The root type for urban function. As subclass of _CityObject, an
 * 				_UrbanFunction inherits all attributes and relations, in particular description, an
 * 				id, names and description from _AbstractFeature. 
 * 
 * <p>Java-Klasse für UrbanFunctionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UrbanFunctionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="enactmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="enactmentFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="expirationFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="legalGrounds" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4}LegalGroundsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="custodian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nominalArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4}TargetPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanFunctionType", propOrder = {
    "clazz",
    "function",
    "enactmentDate",
    "enactmentFiscalYear",
    "expirationDate",
    "expirationFiscalYear",
    "legalGrounds",
    "custodian",
    "nominalArea",
    "_abstract",
    "validity",
    "urbanPlanType",
    "areaClassificationType",
    "prefecture",
    "city",
    "reference",
    "note",
    "surveyYear",
    "lod0MultiSurface",
    "lod1MultiSurface",
    "lod2MultiSurface",
    "lod0MultiCurve",
    "lod1MultiCurve",
    "lod2MultiCurve",
    "lod0MultiPoint",
    "lod1MultiPoint",
    "lod2MultiPoint",
    "target"
})
@XmlSeeAlso({
    AdministrationType.class,
    ZoneType.class,
    CensusBlockType.class,
    DisasterDamageType.class,
    PollutionType.class,
    DisasterPreventionBaseType.class,
    RecreationsType.class,
    HubCityType.class,
    LandUseDiversionType.class,
    UrbanizationType.class,
    PublicTransportationFacilityType.class
})
public abstract class UrbanFunctionType
    extends AbstractCityObjectType
{

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected List<CodeType> function;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enactmentDate;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar enactmentFiscalYear;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar expirationFiscalYear;
    protected LegalGroundsPropertyType legalGrounds;
    protected String custodian;
    protected MeasureType nominalArea;
    @XmlElement(name = "abstract")
    protected String _abstract;
    protected Boolean validity;
    protected CodeType urbanPlanType;
    protected CodeType areaClassificationType;
    protected CodeType prefecture;
    protected CodeType city;
    protected String reference;
    protected String note;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;
    protected MultiSurfacePropertyType lod0MultiSurface;
    @XmlElement(name = "lod-1MultiSurface")
    protected MultiSurfacePropertyType lod1MultiSurface;
    @XmlElement(name = "lod-2MultiSurface")
    protected MultiSurfacePropertyType lod2MultiSurface;
    protected MultiCurvePropertyType lod0MultiCurve;
    @XmlElement(name = "lod-1MultiCurve")
    protected MultiCurvePropertyType lod1MultiCurve;
    @XmlElement(name = "lod-2MultiCurve")
    protected MultiCurvePropertyType lod2MultiCurve;
    protected MultiPointPropertyType lod0MultiPoint;
    @XmlElement(name = "lod-1MultiPoint")
    protected MultiPointPropertyType lod1MultiPoint;
    @XmlElement(name = "lod-2MultiPoint")
    protected MultiPointPropertyType lod2MultiPoint;
    protected List<TargetPropertyType> target;

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
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * Ruft den Wert der enactmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnactmentDate() {
        return enactmentDate;
    }

    /**
     * Legt den Wert der enactmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnactmentDate(XMLGregorianCalendar value) {
        this.enactmentDate = value;
    }

    public boolean isSetEnactmentDate() {
        return (this.enactmentDate!= null);
    }

    /**
     * Ruft den Wert der enactmentFiscalYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnactmentFiscalYear() {
        return enactmentFiscalYear;
    }

    /**
     * Legt den Wert der enactmentFiscalYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnactmentFiscalYear(XMLGregorianCalendar value) {
        this.enactmentFiscalYear = value;
    }

    public boolean isSetEnactmentFiscalYear() {
        return (this.enactmentFiscalYear!= null);
    }

    /**
     * Ruft den Wert der expirationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Legt den Wert der expirationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

    /**
     * Ruft den Wert der expirationFiscalYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationFiscalYear() {
        return expirationFiscalYear;
    }

    /**
     * Legt den Wert der expirationFiscalYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationFiscalYear(XMLGregorianCalendar value) {
        this.expirationFiscalYear = value;
    }

    public boolean isSetExpirationFiscalYear() {
        return (this.expirationFiscalYear!= null);
    }

    /**
     * Ruft den Wert der legalGrounds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegalGroundsPropertyType }
     *     
     */
    public LegalGroundsPropertyType getLegalGrounds() {
        return legalGrounds;
    }

    /**
     * Legt den Wert der legalGrounds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalGroundsPropertyType }
     *     
     */
    public void setLegalGrounds(LegalGroundsPropertyType value) {
        this.legalGrounds = value;
    }

    public boolean isSetLegalGrounds() {
        return (this.legalGrounds!= null);
    }

    /**
     * Ruft den Wert der custodian-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodian() {
        return custodian;
    }

    /**
     * Legt den Wert der custodian-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodian(String value) {
        this.custodian = value;
    }

    public boolean isSetCustodian() {
        return (this.custodian!= null);
    }

    /**
     * Ruft den Wert der nominalArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalArea() {
        return nominalArea;
    }

    /**
     * Legt den Wert der nominalArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalArea(MeasureType value) {
        this.nominalArea = value;
    }

    public boolean isSetNominalArea() {
        return (this.nominalArea!= null);
    }

    /**
     * Ruft den Wert der abstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Legt den Wert der abstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    public boolean isSetAbstract() {
        return (this._abstract!= null);
    }

    /**
     * Ruft den Wert der validity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidity() {
        return validity;
    }

    /**
     * Legt den Wert der validity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidity(Boolean value) {
        this.validity = value;
    }

    public boolean isSetValidity() {
        return (this.validity!= null);
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

    /**
     * Ruft den Wert der lod0MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod0MultiSurface() {
        return lod0MultiSurface;
    }

    /**
     * Legt den Wert der lod0MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod0MultiSurface(MultiSurfacePropertyType value) {
        this.lod0MultiSurface = value;
    }

    public boolean isSetLod0MultiSurface() {
        return (this.lod0MultiSurface!= null);
    }

    /**
     * Ruft den Wert der lod1MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod1MultiSurface() {
        return lod1MultiSurface;
    }

    /**
     * Legt den Wert der lod1MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod1MultiSurface(MultiSurfacePropertyType value) {
        this.lod1MultiSurface = value;
    }

    public boolean isSetLod1MultiSurface() {
        return (this.lod1MultiSurface!= null);
    }

    /**
     * Ruft den Wert der lod2MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod2MultiSurface() {
        return lod2MultiSurface;
    }

    /**
     * Legt den Wert der lod2MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod2MultiSurface(MultiSurfacePropertyType value) {
        this.lod2MultiSurface = value;
    }

    public boolean isSetLod2MultiSurface() {
        return (this.lod2MultiSurface!= null);
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

    /**
     * Ruft den Wert der lod1MultiCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod1MultiCurve() {
        return lod1MultiCurve;
    }

    /**
     * Legt den Wert der lod1MultiCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod1MultiCurve(MultiCurvePropertyType value) {
        this.lod1MultiCurve = value;
    }

    public boolean isSetLod1MultiCurve() {
        return (this.lod1MultiCurve!= null);
    }

    /**
     * Ruft den Wert der lod2MultiCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod2MultiCurve() {
        return lod2MultiCurve;
    }

    /**
     * Legt den Wert der lod2MultiCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod2MultiCurve(MultiCurvePropertyType value) {
        this.lod2MultiCurve = value;
    }

    public boolean isSetLod2MultiCurve() {
        return (this.lod2MultiCurve!= null);
    }

    /**
     * Ruft den Wert der lod0MultiPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLod0MultiPoint() {
        return lod0MultiPoint;
    }

    /**
     * Legt den Wert der lod0MultiPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLod0MultiPoint(MultiPointPropertyType value) {
        this.lod0MultiPoint = value;
    }

    public boolean isSetLod0MultiPoint() {
        return (this.lod0MultiPoint!= null);
    }

    /**
     * Ruft den Wert der lod1MultiPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLod1MultiPoint() {
        return lod1MultiPoint;
    }

    /**
     * Legt den Wert der lod1MultiPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLod1MultiPoint(MultiPointPropertyType value) {
        this.lod1MultiPoint = value;
    }

    public boolean isSetLod1MultiPoint() {
        return (this.lod1MultiPoint!= null);
    }

    /**
     * Ruft den Wert der lod2MultiPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLod2MultiPoint() {
        return lod2MultiPoint;
    }

    /**
     * Legt den Wert der lod2MultiPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLod2MultiPoint(MultiPointPropertyType value) {
        this.lod2MultiPoint = value;
    }

    public boolean isSetLod2MultiPoint() {
        return (this.lod2MultiPoint!= null);
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetPropertyType }
     * 
     * 
     */
    public List<TargetPropertyType> getTarget() {
        if (target == null) {
            target = new ArrayList<TargetPropertyType>();
        }
        return this.target;
    }

    public boolean isSetTarget() {
        return ((this.target!= null)&&(!this.target.isEmpty()));
    }

    public void unsetTarget() {
        this.target = null;
    }

}
