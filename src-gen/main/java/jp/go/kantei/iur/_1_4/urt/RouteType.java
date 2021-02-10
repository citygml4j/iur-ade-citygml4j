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
import net.opengis.gml.MultiCurvePropertyType;


/**
 * <p>Java-Klasse für RouteType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}DescriptionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="originStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeSortOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="continuousPickup" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousDropOff" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="agency" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}AgencyPropertyType"/&gt;
 *         &lt;element name="parentRoute" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType" minOccurs="0"/&gt;
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
@XmlType(name = "RouteType", propOrder = {
    "shortName",
    "longName",
    "routeDescription",
    "type",
    "url",
    "color",
    "textColor",
    "updateDate",
    "originStop",
    "viaStop",
    "destinationStop",
    "routeSortOrder",
    "continuousPickup",
    "continuousDropOff",
    "agency",
    "parentRoute",
    "lod0MultiCurve"
})
public class RouteType
    extends PublicTransitType
{

    protected String shortName;
    protected String longName;
    @XmlElement(name = "description")
    protected DescriptionPropertyType routeDescription;
    @XmlElement(required = true)
    protected CodeType type;
    protected String url;
    protected String color;
    protected String textColor;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    protected String originStop;
    protected String viaStop;
    protected String destinationStop;
    protected BigInteger routeSortOrder;
    protected CodeType continuousPickup;
    protected CodeType continuousDropOff;
    @XmlElement(required = true)
    protected AgencyPropertyType agency;
    protected RoutePropertyType parentRoute;
    protected MultiCurvePropertyType lod0MultiCurve;

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
     * Ruft den Wert der longName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Legt den Wert der longName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    public boolean isSetLongName() {
        return (this.longName!= null);
    }

    /**
     * Ruft den Wert der routeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionPropertyType }
     *     
     */
    public DescriptionPropertyType getRouteDescription() {
        return routeDescription;
    }

    /**
     * Legt den Wert der routeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionPropertyType }
     *     
     */
    public void setRouteDescription(DescriptionPropertyType value) {
        this.routeDescription = value;
    }

    public boolean isSetRouteDescription() {
        return (this.routeDescription!= null);
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    public boolean isSetColor() {
        return (this.color!= null);
    }

    /**
     * Ruft den Wert der textColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Legt den Wert der textColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    public boolean isSetTextColor() {
        return (this.textColor!= null);
    }

    /**
     * Ruft den Wert der updateDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Legt den Wert der updateDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    public boolean isSetUpdateDate() {
        return (this.updateDate!= null);
    }

    /**
     * Ruft den Wert der originStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStop() {
        return originStop;
    }

    /**
     * Legt den Wert der originStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStop(String value) {
        this.originStop = value;
    }

    public boolean isSetOriginStop() {
        return (this.originStop!= null);
    }

    /**
     * Ruft den Wert der viaStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaStop() {
        return viaStop;
    }

    /**
     * Legt den Wert der viaStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaStop(String value) {
        this.viaStop = value;
    }

    public boolean isSetViaStop() {
        return (this.viaStop!= null);
    }

    /**
     * Ruft den Wert der destinationStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStop() {
        return destinationStop;
    }

    /**
     * Legt den Wert der destinationStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStop(String value) {
        this.destinationStop = value;
    }

    public boolean isSetDestinationStop() {
        return (this.destinationStop!= null);
    }

    /**
     * Ruft den Wert der routeSortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteSortOrder() {
        return routeSortOrder;
    }

    /**
     * Legt den Wert der routeSortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteSortOrder(BigInteger value) {
        this.routeSortOrder = value;
    }

    public boolean isSetRouteSortOrder() {
        return (this.routeSortOrder!= null);
    }

    /**
     * Ruft den Wert der continuousPickup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousPickup() {
        return continuousPickup;
    }

    /**
     * Legt den Wert der continuousPickup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousPickup(CodeType value) {
        this.continuousPickup = value;
    }

    public boolean isSetContinuousPickup() {
        return (this.continuousPickup!= null);
    }

    /**
     * Ruft den Wert der continuousDropOff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousDropOff() {
        return continuousDropOff;
    }

    /**
     * Legt den Wert der continuousDropOff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousDropOff(CodeType value) {
        this.continuousDropOff = value;
    }

    public boolean isSetContinuousDropOff() {
        return (this.continuousDropOff!= null);
    }

    /**
     * Ruft den Wert der agency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPropertyType }
     *     
     */
    public AgencyPropertyType getAgency() {
        return agency;
    }

    /**
     * Legt den Wert der agency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPropertyType }
     *     
     */
    public void setAgency(AgencyPropertyType value) {
        this.agency = value;
    }

    public boolean isSetAgency() {
        return (this.agency!= null);
    }

    /**
     * Ruft den Wert der parentRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePropertyType }
     *     
     */
    public RoutePropertyType getParentRoute() {
        return parentRoute;
    }

    /**
     * Legt den Wert der parentRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePropertyType }
     *     
     */
    public void setParentRoute(RoutePropertyType value) {
        this.parentRoute = value;
    }

    public boolean isSetParentRoute() {
        return (this.parentRoute!= null);
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
