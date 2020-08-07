//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für DevelopmentProjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainPurpose" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="benefitArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="benefitPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="plannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="ongoingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="completedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDecision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDesignationForTemporaryReplotting" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}_GenericApplicationPropertyOfDevelopmentProject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentProjectType", propOrder = {
    "status",
    "mainPurpose",
    "benefitArea",
    "benefitPeriod",
    "cost",
    "plannedArea",
    "ongoingArea",
    "completedArea",
    "dateOfDecision",
    "dateOfDesignationForTemporaryReplotting",
    "_GenericApplicationPropertyOfDevelopmentProject"
})
public class DevelopmentProjectType
    extends ZoneType
{

    protected CodeType status;
    protected CodeType mainPurpose;
    protected MeasureType benefitArea;
    protected String benefitPeriod;
    protected BigInteger cost;
    protected MeasureType plannedArea;
    protected MeasureType ongoingArea;
    protected MeasureType completedArea;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecision;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDesignationForTemporaryReplotting;
    @XmlElementRef(name = "_GenericApplicationPropertyOfDevelopmentProject", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfDevelopmentProject;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Ruft den Wert der mainPurpose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainPurpose() {
        return mainPurpose;
    }

    /**
     * Legt den Wert der mainPurpose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainPurpose(CodeType value) {
        this.mainPurpose = value;
    }

    public boolean isSetMainPurpose() {
        return (this.mainPurpose!= null);
    }

    /**
     * Ruft den Wert der benefitArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBenefitArea() {
        return benefitArea;
    }

    /**
     * Legt den Wert der benefitArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBenefitArea(MeasureType value) {
        this.benefitArea = value;
    }

    public boolean isSetBenefitArea() {
        return (this.benefitArea!= null);
    }

    /**
     * Ruft den Wert der benefitPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPeriod() {
        return benefitPeriod;
    }

    /**
     * Legt den Wert der benefitPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPeriod(String value) {
        this.benefitPeriod = value;
    }

    public boolean isSetBenefitPeriod() {
        return (this.benefitPeriod!= null);
    }

    /**
     * Ruft den Wert der cost-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCost() {
        return cost;
    }

    /**
     * Legt den Wert der cost-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCost(BigInteger value) {
        this.cost = value;
    }

    public boolean isSetCost() {
        return (this.cost!= null);
    }

    /**
     * Ruft den Wert der plannedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPlannedArea() {
        return plannedArea;
    }

    /**
     * Legt den Wert der plannedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPlannedArea(MeasureType value) {
        this.plannedArea = value;
    }

    public boolean isSetPlannedArea() {
        return (this.plannedArea!= null);
    }

    /**
     * Ruft den Wert der ongoingArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOngoingArea() {
        return ongoingArea;
    }

    /**
     * Legt den Wert der ongoingArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOngoingArea(MeasureType value) {
        this.ongoingArea = value;
    }

    public boolean isSetOngoingArea() {
        return (this.ongoingArea!= null);
    }

    /**
     * Ruft den Wert der completedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCompletedArea() {
        return completedArea;
    }

    /**
     * Legt den Wert der completedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCompletedArea(MeasureType value) {
        this.completedArea = value;
    }

    public boolean isSetCompletedArea() {
        return (this.completedArea!= null);
    }

    /**
     * Ruft den Wert der dateOfDecision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDecision() {
        return dateOfDecision;
    }

    /**
     * Legt den Wert der dateOfDecision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDecision(XMLGregorianCalendar value) {
        this.dateOfDecision = value;
    }

    public boolean isSetDateOfDecision() {
        return (this.dateOfDecision!= null);
    }

    /**
     * Ruft den Wert der dateOfDesignationForTemporaryReplotting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDesignationForTemporaryReplotting() {
        return dateOfDesignationForTemporaryReplotting;
    }

    /**
     * Legt den Wert der dateOfDesignationForTemporaryReplotting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDesignationForTemporaryReplotting(XMLGregorianCalendar value) {
        this.dateOfDesignationForTemporaryReplotting = value;
    }

    public boolean isSetDateOfDesignationForTemporaryReplotting() {
        return (this.dateOfDesignationForTemporaryReplotting!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfDevelopmentProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfDevelopmentProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfDevelopmentProject().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfDevelopmentProject() {
        if (_GenericApplicationPropertyOfDevelopmentProject == null) {
            _GenericApplicationPropertyOfDevelopmentProject = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfDevelopmentProject;
    }

    public boolean isSet_GenericApplicationPropertyOfDevelopmentProject() {
        return ((this._GenericApplicationPropertyOfDevelopmentProject!= null)&&(!this._GenericApplicationPropertyOfDevelopmentProject.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfDevelopmentProject() {
        this._GenericApplicationPropertyOfDevelopmentProject = null;
    }

}
