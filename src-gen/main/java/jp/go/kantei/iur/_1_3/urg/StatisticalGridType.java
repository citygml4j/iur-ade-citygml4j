//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MultiSurfacePropertyType;


/**
 * The root type for statistical grid. As subclass of _CityObject, an
 * 				_StatisticalGrid inherits all attributes and relations, in particular a description,
 * 				an id and names. 
 * 
 * <p>Java-Klasse für StatisticalGridType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatisticalGridType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiSurfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiSurfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}_GenericApplicationPropertyOfStatisticalGrid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalGridType", propOrder = {
    "clazz",
    "value",
    "urbanPlanType",
    "areaClassificationType",
    "prefecture",
    "city",
    "surveyYear",
    "lod1MultiSurfaceGeometry",
    "lod2MultiSurfaceGeometry",
    "_GenericApplicationPropertyOfStatisticalGrid"
})
@XmlSeeAlso({
    PopulationType.class,
    PublicTransportationAccessibilityType.class,
    LandPriceType.class,
    LandUseDiversionType.class,
    HouseholdsType.class,
    OfficesAndEmployeesType.class
})
public abstract class StatisticalGridType
    extends AbstractCityObjectType
{

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected List<Object> value;
    protected CodeType urbanPlanType;
    protected CodeType areaClassificationType;
    protected CodeType prefecture;
    protected CodeType city;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;
    @XmlElement(name = "lod-1MultiSurfaceGeometry")
    protected MultiSurfacePropertyType lod1MultiSurfaceGeometry;
    @XmlElement(name = "lod-2MultiSurfaceGeometry")
    protected MultiSurfacePropertyType lod2MultiSurfaceGeometry;
    @XmlElementRef(name = "_GenericApplicationPropertyOfStatisticalGrid", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfStatisticalGrid;

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
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
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
     * Ruft den Wert der lod1MultiSurfaceGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod1MultiSurfaceGeometry() {
        return lod1MultiSurfaceGeometry;
    }

    /**
     * Legt den Wert der lod1MultiSurfaceGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod1MultiSurfaceGeometry(MultiSurfacePropertyType value) {
        this.lod1MultiSurfaceGeometry = value;
    }

    public boolean isSetLod1MultiSurfaceGeometry() {
        return (this.lod1MultiSurfaceGeometry!= null);
    }

    /**
     * Ruft den Wert der lod2MultiSurfaceGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod2MultiSurfaceGeometry() {
        return lod2MultiSurfaceGeometry;
    }

    /**
     * Legt den Wert der lod2MultiSurfaceGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod2MultiSurfaceGeometry(MultiSurfacePropertyType value) {
        this.lod2MultiSurfaceGeometry = value;
    }

    public boolean isSetLod2MultiSurfaceGeometry() {
        return (this.lod2MultiSurfaceGeometry!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfStatisticalGrid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfStatisticalGrid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfStatisticalGrid().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfStatisticalGrid() {
        if (_GenericApplicationPropertyOfStatisticalGrid == null) {
            _GenericApplicationPropertyOfStatisticalGrid = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfStatisticalGrid;
    }

    public boolean isSet_GenericApplicationPropertyOfStatisticalGrid() {
        return ((this._GenericApplicationPropertyOfStatisticalGrid!= null)&&(!this._GenericApplicationPropertyOfStatisticalGrid.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfStatisticalGrid() {
        this._GenericApplicationPropertyOfStatisticalGrid = null;
    }

}
