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
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java-Klasse für PointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="point" type="{http://www.opengis.net/gml}PointPropertyType"/&gt;
 *         &lt;element name="pointSequence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="pointDistanceTraveled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointType", propOrder = {
    "latitude",
    "longitude",
    "point",
    "pointSequence",
    "pointDistanceTraveled"
})
public class PointType {

    protected double latitude;
    protected double longitude;
    @XmlElement(required = true)
    protected PointPropertyType point;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pointSequence;
    protected Double pointDistanceTraveled;

    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return true;
    }

    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return true;
    }

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPoint(PointPropertyType value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Ruft den Wert der pointSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointSequence() {
        return pointSequence;
    }

    /**
     * Legt den Wert der pointSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointSequence(BigInteger value) {
        this.pointSequence = value;
    }

    public boolean isSetPointSequence() {
        return (this.pointSequence!= null);
    }

    /**
     * Ruft den Wert der pointDistanceTraveled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointDistanceTraveled() {
        return pointDistanceTraveled;
    }

    /**
     * Legt den Wert der pointDistanceTraveled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointDistanceTraveled(Double value) {
        this.pointDistanceTraveled = value;
    }

    public boolean isSetPointDistanceTraveled() {
        return (this.pointDistanceTraveled!= null);
    }

}
