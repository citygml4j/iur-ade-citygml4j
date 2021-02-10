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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java-Klasse für FareRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="destinationId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="containsId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="fare" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}FareAttributePropertyType"/&gt;
 *         &lt;element name="route" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleType", propOrder = {
    "originId",
    "destinationId",
    "containsId",
    "fare",
    "route"
})
public class FareRuleType
    extends PublicTransitDataTypeType
{

    protected CodeType originId;
    protected CodeType destinationId;
    protected CodeType containsId;
    @XmlElement(required = true)
    protected FareAttributePropertyType fare;
    protected RoutePropertyType route;

    /**
     * Ruft den Wert der originId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOriginId() {
        return originId;
    }

    /**
     * Legt den Wert der originId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOriginId(CodeType value) {
        this.originId = value;
    }

    public boolean isSetOriginId() {
        return (this.originId!= null);
    }

    /**
     * Ruft den Wert der destinationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDestinationId() {
        return destinationId;
    }

    /**
     * Legt den Wert der destinationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDestinationId(CodeType value) {
        this.destinationId = value;
    }

    public boolean isSetDestinationId() {
        return (this.destinationId!= null);
    }

    /**
     * Ruft den Wert der containsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContainsId() {
        return containsId;
    }

    /**
     * Legt den Wert der containsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContainsId(CodeType value) {
        this.containsId = value;
    }

    public boolean isSetContainsId() {
        return (this.containsId!= null);
    }

    /**
     * Ruft den Wert der fare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareAttributePropertyType }
     *     
     */
    public FareAttributePropertyType getFare() {
        return fare;
    }

    /**
     * Legt den Wert der fare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAttributePropertyType }
     *     
     */
    public void setFare(FareAttributePropertyType value) {
        this.fare = value;
    }

    public boolean isSetFare() {
        return (this.fare!= null);
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

}
