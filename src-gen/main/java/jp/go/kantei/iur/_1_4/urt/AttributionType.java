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


/**
 * <p>Java-Klasse für AttributionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isProducer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isOperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agency" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}AgencyPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}TripPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributionType", propOrder = {
    "organizationName",
    "isProducer",
    "isOperator",
    "isAuthority",
    "url",
    "email",
    "phoneNumber",
    "agency",
    "route",
    "trip"
})
public class AttributionType
    extends PublicTransitType
{

    @XmlElement(required = true)
    protected String organizationName;
    protected Boolean isProducer;
    protected Boolean isOperator;
    protected Boolean isAuthority;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected String email;
    protected String phoneNumber;
    protected AgencyPropertyType agency;
    protected RoutePropertyType route;
    protected TripPropertyType trip;

    /**
     * Ruft den Wert der organizationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Legt den Wert der organizationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    public boolean isSetOrganizationName() {
        return (this.organizationName!= null);
    }

    /**
     * Ruft den Wert der isProducer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProducer() {
        return isProducer;
    }

    /**
     * Legt den Wert der isProducer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProducer(Boolean value) {
        this.isProducer = value;
    }

    public boolean isSetIsProducer() {
        return (this.isProducer!= null);
    }

    /**
     * Ruft den Wert der isOperator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperator() {
        return isOperator;
    }

    /**
     * Legt den Wert der isOperator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperator(Boolean value) {
        this.isOperator = value;
    }

    public boolean isSetIsOperator() {
        return (this.isOperator!= null);
    }

    /**
     * Ruft den Wert der isAuthority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAuthority() {
        return isAuthority;
    }

    /**
     * Legt den Wert der isAuthority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthority(Boolean value) {
        this.isAuthority = value;
    }

    public boolean isSetIsAuthority() {
        return (this.isAuthority!= null);
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
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    public boolean isSetEmail() {
        return (this.email!= null);
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public boolean isSetPhoneNumber() {
        return (this.phoneNumber!= null);
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
     * Ruft den Wert der trip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripPropertyType }
     *     
     */
    public TripPropertyType getTrip() {
        return trip;
    }

    /**
     * Legt den Wert der trip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPropertyType }
     *     
     */
    public void setTrip(TripPropertyType value) {
        this.trip = value;
    }

    public boolean isSetTrip() {
        return (this.trip!= null);
    }

}
