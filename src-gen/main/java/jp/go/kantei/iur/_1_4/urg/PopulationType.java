//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urg;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell with population values
 * 
 * <p>Java-Klasse für PopulationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PopulationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="naturalIncrease" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="births" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deaths" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="socialIncrease" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="moveFrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="moveTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="increasement" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="malePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="femalePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="populationByAgeAndSex" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}PopulationByAgeAndSexPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationType", propOrder = {
    "total",
    "daytimePopulation",
    "daytimePopulationDensity",
    "naturalIncrease",
    "births",
    "deaths",
    "socialIncrease",
    "moveFrom",
    "moveTo",
    "increasement",
    "malePopulation",
    "femalePopulation",
    "populationByAgeAndSex"
})
public class PopulationType
    extends StatisticalGridType
{

    protected BigInteger total;
    protected BigInteger daytimePopulation;
    protected Double daytimePopulationDensity;
    protected BigInteger naturalIncrease;
    protected BigInteger births;
    protected BigInteger deaths;
    protected BigInteger socialIncrease;
    protected BigInteger moveFrom;
    protected BigInteger moveTo;
    protected BigInteger increasement;
    protected BigInteger malePopulation;
    protected BigInteger femalePopulation;
    protected List<PopulationByAgeAndSexPropertyType> populationByAgeAndSex;

    /**
     * Ruft den Wert der total-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Legt den Wert der total-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    public boolean isSetTotal() {
        return (this.total!= null);
    }

    /**
     * Ruft den Wert der daytimePopulation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimePopulation() {
        return daytimePopulation;
    }

    /**
     * Legt den Wert der daytimePopulation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimePopulation(BigInteger value) {
        this.daytimePopulation = value;
    }

    public boolean isSetDaytimePopulation() {
        return (this.daytimePopulation!= null);
    }

    /**
     * Ruft den Wert der daytimePopulationDensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaytimePopulationDensity() {
        return daytimePopulationDensity;
    }

    /**
     * Legt den Wert der daytimePopulationDensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaytimePopulationDensity(Double value) {
        this.daytimePopulationDensity = value;
    }

    public boolean isSetDaytimePopulationDensity() {
        return (this.daytimePopulationDensity!= null);
    }

    /**
     * Ruft den Wert der naturalIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNaturalIncrease() {
        return naturalIncrease;
    }

    /**
     * Legt den Wert der naturalIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNaturalIncrease(BigInteger value) {
        this.naturalIncrease = value;
    }

    public boolean isSetNaturalIncrease() {
        return (this.naturalIncrease!= null);
    }

    /**
     * Ruft den Wert der births-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBirths() {
        return births;
    }

    /**
     * Legt den Wert der births-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBirths(BigInteger value) {
        this.births = value;
    }

    public boolean isSetBirths() {
        return (this.births!= null);
    }

    /**
     * Ruft den Wert der deaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeaths() {
        return deaths;
    }

    /**
     * Legt den Wert der deaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeaths(BigInteger value) {
        this.deaths = value;
    }

    public boolean isSetDeaths() {
        return (this.deaths!= null);
    }

    /**
     * Ruft den Wert der socialIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSocialIncrease() {
        return socialIncrease;
    }

    /**
     * Legt den Wert der socialIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSocialIncrease(BigInteger value) {
        this.socialIncrease = value;
    }

    public boolean isSetSocialIncrease() {
        return (this.socialIncrease!= null);
    }

    /**
     * Ruft den Wert der moveFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveFrom() {
        return moveFrom;
    }

    /**
     * Legt den Wert der moveFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveFrom(BigInteger value) {
        this.moveFrom = value;
    }

    public boolean isSetMoveFrom() {
        return (this.moveFrom!= null);
    }

    /**
     * Ruft den Wert der moveTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveTo() {
        return moveTo;
    }

    /**
     * Legt den Wert der moveTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveTo(BigInteger value) {
        this.moveTo = value;
    }

    public boolean isSetMoveTo() {
        return (this.moveTo!= null);
    }

    /**
     * Ruft den Wert der increasement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncreasement() {
        return increasement;
    }

    /**
     * Legt den Wert der increasement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncreasement(BigInteger value) {
        this.increasement = value;
    }

    public boolean isSetIncreasement() {
        return (this.increasement!= null);
    }

    /**
     * Ruft den Wert der malePopulation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePopulation() {
        return malePopulation;
    }

    /**
     * Legt den Wert der malePopulation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePopulation(BigInteger value) {
        this.malePopulation = value;
    }

    public boolean isSetMalePopulation() {
        return (this.malePopulation!= null);
    }

    /**
     * Ruft den Wert der femalePopulation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePopulation() {
        return femalePopulation;
    }

    /**
     * Legt den Wert der femalePopulation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePopulation(BigInteger value) {
        this.femalePopulation = value;
    }

    public boolean isSetFemalePopulation() {
        return (this.femalePopulation!= null);
    }

    /**
     * Gets the value of the populationByAgeAndSex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the populationByAgeAndSex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulationByAgeAndSex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopulationByAgeAndSexPropertyType }
     * 
     * 
     */
    public List<PopulationByAgeAndSexPropertyType> getPopulationByAgeAndSex() {
        if (populationByAgeAndSex == null) {
            populationByAgeAndSex = new ArrayList<PopulationByAgeAndSexPropertyType>();
        }
        return this.populationByAgeAndSex;
    }

    public boolean isSetPopulationByAgeAndSex() {
        return ((this.populationByAgeAndSex!= null)&&(!this.populationByAgeAndSex.isEmpty()));
    }

    public void unsetPopulationByAgeAndSex() {
        this.populationByAgeAndSex = null;
    }

}
