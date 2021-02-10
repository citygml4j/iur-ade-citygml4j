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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * <p>Java-Klasse für PublicTransitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicTransitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="target" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}TargetPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicTransitType", propOrder = {
    "orgId",
    "target"
})
@XmlSeeAlso({
    RouteType.class,
    AgencyType.class,
    StopType.class,
    LevelType.class,
    TripType.class,
    ShapeType.class,
    OfficeType.class,
    CalendarType.class,
    CalendarDateType.class,
    FareAttributeType.class,
    PathwayType.class,
    TranslationJPType.class,
    AttributionType.class
})
public abstract class PublicTransitType
    extends AbstractCityObjectType
{

    @XmlElement(required = true)
    protected String orgId;
    protected TargetPropertyType target;

    /**
     * Ruft den Wert der orgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Legt den Wert der orgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

    public boolean isSetOrgId() {
        return (this.orgId!= null);
    }

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetPropertyType }
     *     
     */
    public TargetPropertyType getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPropertyType }
     *     
     */
    public void setTarget(TargetPropertyType value) {
        this.target = value;
    }

    public boolean isSetTarget() {
        return (this.target!= null);
    }

}
