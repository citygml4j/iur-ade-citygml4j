//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für DisasterDamageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DisasterDamageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="damagedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDamagedHouses" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousesFloodedAboveFloorLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousesFloodedBelowFloorLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maximumRainfallPerHour" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="totalRainfall" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisasterDamageType", propOrder = {
    "damagedArea",
    "numberOfDamagedHouses",
    "numberOfHousesFloodedAboveFloorLevel",
    "numberOfHousesFloodedBelowFloorLevel",
    "maximumRainfallPerHour",
    "totalRainfall"
})
public class DisasterDamageType
    extends UrbanFunctionType
{

    protected MeasureType damagedArea;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDamagedHouses;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfHousesFloodedAboveFloorLevel;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfHousesFloodedBelowFloorLevel;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumRainfallPerHour;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRainfall;

    /**
     * Ruft den Wert der damagedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDamagedArea() {
        return damagedArea;
    }

    /**
     * Legt den Wert der damagedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDamagedArea(MeasureType value) {
        this.damagedArea = value;
    }

    public boolean isSetDamagedArea() {
        return (this.damagedArea!= null);
    }

    /**
     * Ruft den Wert der numberOfDamagedHouses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDamagedHouses() {
        return numberOfDamagedHouses;
    }

    /**
     * Legt den Wert der numberOfDamagedHouses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDamagedHouses(BigInteger value) {
        this.numberOfDamagedHouses = value;
    }

    public boolean isSetNumberOfDamagedHouses() {
        return (this.numberOfDamagedHouses!= null);
    }

    /**
     * Ruft den Wert der numberOfHousesFloodedAboveFloorLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHousesFloodedAboveFloorLevel() {
        return numberOfHousesFloodedAboveFloorLevel;
    }

    /**
     * Legt den Wert der numberOfHousesFloodedAboveFloorLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHousesFloodedAboveFloorLevel(BigInteger value) {
        this.numberOfHousesFloodedAboveFloorLevel = value;
    }

    public boolean isSetNumberOfHousesFloodedAboveFloorLevel() {
        return (this.numberOfHousesFloodedAboveFloorLevel!= null);
    }

    /**
     * Ruft den Wert der numberOfHousesFloodedBelowFloorLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHousesFloodedBelowFloorLevel() {
        return numberOfHousesFloodedBelowFloorLevel;
    }

    /**
     * Legt den Wert der numberOfHousesFloodedBelowFloorLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHousesFloodedBelowFloorLevel(BigInteger value) {
        this.numberOfHousesFloodedBelowFloorLevel = value;
    }

    public boolean isSetNumberOfHousesFloodedBelowFloorLevel() {
        return (this.numberOfHousesFloodedBelowFloorLevel!= null);
    }

    /**
     * Ruft den Wert der maximumRainfallPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRainfallPerHour() {
        return maximumRainfallPerHour;
    }

    /**
     * Legt den Wert der maximumRainfallPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRainfallPerHour(BigInteger value) {
        this.maximumRainfallPerHour = value;
    }

    public boolean isSetMaximumRainfallPerHour() {
        return (this.maximumRainfallPerHour!= null);
    }

    /**
     * Ruft den Wert der totalRainfall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRainfall() {
        return totalRainfall;
    }

    /**
     * Legt den Wert der totalRainfall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRainfall(BigInteger value) {
        this.totalRainfall = value;
    }

    public boolean isSetTotalRainfall() {
        return (this.totalRainfall!= null);
    }

}
