//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für BuildingDetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BuildingDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumberOfBuildingCertification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingFootprintArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingRoofEdgeArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="developmentArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingStructureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="fireproofStructureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="implementingBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="districtsAndZonesType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="landUsePlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingDetailsType", propOrder = {
    "serialNumberOfBuildingCertification",
    "siteArea",
    "buildingFootprintArea",
    "buildingRoofEdgeArea",
    "developmentArea",
    "totalFloorArea",
    "buildingStructureType",
    "fireproofStructureType",
    "implementingBody",
    "urbanPlanType",
    "districtsAndZonesType",
    "landUsePlanType",
    "areaClassificationType",
    "prefecture",
    "city",
    "reference",
    "note",
    "surveyYear"
})
public class BuildingDetailsType {

    protected String serialNumberOfBuildingCertification;
    protected MeasureType siteArea;
    protected MeasureType buildingFootprintArea;
    protected MeasureType buildingRoofEdgeArea;
    protected MeasureType developmentArea;
    protected MeasureType totalFloorArea;
    protected CodeType buildingStructureType;
    protected CodeType fireproofStructureType;
    protected String implementingBody;
    protected CodeType urbanPlanType;
    protected CodeType districtsAndZonesType;
    protected CodeType landUsePlanType;
    protected CodeType areaClassificationType;
    protected CodeType prefecture;
    protected CodeType city;
    protected String reference;
    protected String note;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;

    /**
     * Ruft den Wert der serialNumberOfBuildingCertification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberOfBuildingCertification() {
        return serialNumberOfBuildingCertification;
    }

    /**
     * Legt den Wert der serialNumberOfBuildingCertification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberOfBuildingCertification(String value) {
        this.serialNumberOfBuildingCertification = value;
    }

    public boolean isSetSerialNumberOfBuildingCertification() {
        return (this.serialNumberOfBuildingCertification!= null);
    }

    /**
     * Ruft den Wert der siteArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSiteArea() {
        return siteArea;
    }

    /**
     * Legt den Wert der siteArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSiteArea(MeasureType value) {
        this.siteArea = value;
    }

    public boolean isSetSiteArea() {
        return (this.siteArea!= null);
    }

    /**
     * Ruft den Wert der buildingFootprintArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBuildingFootprintArea() {
        return buildingFootprintArea;
    }

    /**
     * Legt den Wert der buildingFootprintArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBuildingFootprintArea(MeasureType value) {
        this.buildingFootprintArea = value;
    }

    public boolean isSetBuildingFootprintArea() {
        return (this.buildingFootprintArea!= null);
    }

    /**
     * Ruft den Wert der buildingRoofEdgeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBuildingRoofEdgeArea() {
        return buildingRoofEdgeArea;
    }

    /**
     * Legt den Wert der buildingRoofEdgeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBuildingRoofEdgeArea(MeasureType value) {
        this.buildingRoofEdgeArea = value;
    }

    public boolean isSetBuildingRoofEdgeArea() {
        return (this.buildingRoofEdgeArea!= null);
    }

    /**
     * Ruft den Wert der developmentArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDevelopmentArea() {
        return developmentArea;
    }

    /**
     * Legt den Wert der developmentArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDevelopmentArea(MeasureType value) {
        this.developmentArea = value;
    }

    public boolean isSetDevelopmentArea() {
        return (this.developmentArea!= null);
    }

    /**
     * Ruft den Wert der totalFloorArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalFloorArea() {
        return totalFloorArea;
    }

    /**
     * Legt den Wert der totalFloorArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalFloorArea(MeasureType value) {
        this.totalFloorArea = value;
    }

    public boolean isSetTotalFloorArea() {
        return (this.totalFloorArea!= null);
    }

    /**
     * Ruft den Wert der buildingStructureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBuildingStructureType() {
        return buildingStructureType;
    }

    /**
     * Legt den Wert der buildingStructureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBuildingStructureType(CodeType value) {
        this.buildingStructureType = value;
    }

    public boolean isSetBuildingStructureType() {
        return (this.buildingStructureType!= null);
    }

    /**
     * Ruft den Wert der fireproofStructureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFireproofStructureType() {
        return fireproofStructureType;
    }

    /**
     * Legt den Wert der fireproofStructureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFireproofStructureType(CodeType value) {
        this.fireproofStructureType = value;
    }

    public boolean isSetFireproofStructureType() {
        return (this.fireproofStructureType!= null);
    }

    /**
     * Ruft den Wert der implementingBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementingBody() {
        return implementingBody;
    }

    /**
     * Legt den Wert der implementingBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementingBody(String value) {
        this.implementingBody = value;
    }

    public boolean isSetImplementingBody() {
        return (this.implementingBody!= null);
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
     * Ruft den Wert der districtsAndZonesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDistrictsAndZonesType() {
        return districtsAndZonesType;
    }

    /**
     * Legt den Wert der districtsAndZonesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDistrictsAndZonesType(CodeType value) {
        this.districtsAndZonesType = value;
    }

    public boolean isSetDistrictsAndZonesType() {
        return (this.districtsAndZonesType!= null);
    }

    /**
     * Ruft den Wert der landUsePlanType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLandUsePlanType() {
        return landUsePlanType;
    }

    /**
     * Legt den Wert der landUsePlanType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLandUsePlanType(CodeType value) {
        this.landUsePlanType = value;
    }

    public boolean isSetLandUsePlanType() {
        return (this.landUsePlanType!= null);
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

}
