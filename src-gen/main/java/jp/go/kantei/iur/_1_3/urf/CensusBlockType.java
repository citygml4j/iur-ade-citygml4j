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
import javax.xml.bind.annotation.XmlType;


/**
 * Block for census survey
 * 
 * <p>Java-Klasse für CensusBlockType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CensusBlockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="daytimePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOrdinaryHouseholds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByOwnership" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMainHouseholds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByStruture" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}_GenericApplicationPropertyOfCensusBlock" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusBlockType", propOrder = {
    "daytimePopulation",
    "daytimePopulationDensity",
    "numberOfOrdinaryHouseholds",
    "numberOfHouseholdsByOwnership",
    "numberOfMainHouseholds",
    "numberOfHouseholdsByStruture",
    "_GenericApplicationPropertyOfCensusBlock"
})
public class CensusBlockType
    extends UrbanFunctionType
{

    protected BigInteger daytimePopulation;
    protected Double daytimePopulationDensity;
    protected BigInteger numberOfOrdinaryHouseholds;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByOwnership;
    protected BigInteger numberOfMainHouseholds;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByStruture;
    @XmlElementRef(name = "_GenericApplicationPropertyOfCensusBlock", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfCensusBlock;

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
     * Ruft den Wert der numberOfOrdinaryHouseholds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOrdinaryHouseholds() {
        return numberOfOrdinaryHouseholds;
    }

    /**
     * Legt den Wert der numberOfOrdinaryHouseholds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOrdinaryHouseholds(BigInteger value) {
        this.numberOfOrdinaryHouseholds = value;
    }

    public boolean isSetNumberOfOrdinaryHouseholds() {
        return (this.numberOfOrdinaryHouseholds!= null);
    }

    /**
     * Gets the value of the numberOfHouseholdsByOwnership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByOwnership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByOwnership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByOwnership() {
        if (numberOfHouseholdsByOwnership == null) {
            numberOfHouseholdsByOwnership = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByOwnership;
    }

    public boolean isSetNumberOfHouseholdsByOwnership() {
        return ((this.numberOfHouseholdsByOwnership!= null)&&(!this.numberOfHouseholdsByOwnership.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByOwnership() {
        this.numberOfHouseholdsByOwnership = null;
    }

    /**
     * Ruft den Wert der numberOfMainHouseholds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMainHouseholds() {
        return numberOfMainHouseholds;
    }

    /**
     * Legt den Wert der numberOfMainHouseholds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMainHouseholds(BigInteger value) {
        this.numberOfMainHouseholds = value;
    }

    public boolean isSetNumberOfMainHouseholds() {
        return (this.numberOfMainHouseholds!= null);
    }

    /**
     * Gets the value of the numberOfHouseholdsByStruture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByStruture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByStruture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByStruture() {
        if (numberOfHouseholdsByStruture == null) {
            numberOfHouseholdsByStruture = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByStruture;
    }

    public boolean isSetNumberOfHouseholdsByStruture() {
        return ((this.numberOfHouseholdsByStruture!= null)&&(!this.numberOfHouseholdsByStruture.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByStruture() {
        this.numberOfHouseholdsByStruture = null;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfCensusBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfCensusBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfCensusBlock().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfCensusBlock() {
        if (_GenericApplicationPropertyOfCensusBlock == null) {
            _GenericApplicationPropertyOfCensusBlock = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfCensusBlock;
    }

    public boolean isSet_GenericApplicationPropertyOfCensusBlock() {
        return ((this._GenericApplicationPropertyOfCensusBlock!= null)&&(!this._GenericApplicationPropertyOfCensusBlock.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfCensusBlock() {
        this._GenericApplicationPropertyOfCensusBlock = null;
    }

}
