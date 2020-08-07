//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urg;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell with the number of households
 * 
 * <p>Java-Klasse für HouseholdsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HouseholdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOrdinaryHousehold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numberOfHouseholdsByOwnership" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByStructure" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMainHousehold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}_GenericApplicationPropertyOfHouseholds" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdsType", propOrder = {
    "numberOfOrdinaryHousehold",
    "numberOfHouseholdsByOwnership",
    "numberOfHouseholdsByStructure",
    "numberOfMainHousehold",
    "_GenericApplicationPropertyOfHouseholds"
})
public class HouseholdsType
    extends StatisticalGridType
{

    @XmlElement(required = true)
    protected BigInteger numberOfOrdinaryHousehold;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByOwnership;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByStructure;
    @XmlElement(required = true)
    protected BigInteger numberOfMainHousehold;
    @XmlElementRef(name = "_GenericApplicationPropertyOfHouseholds", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfHouseholds;

    /**
     * Ruft den Wert der numberOfOrdinaryHousehold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOrdinaryHousehold() {
        return numberOfOrdinaryHousehold;
    }

    /**
     * Legt den Wert der numberOfOrdinaryHousehold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOrdinaryHousehold(BigInteger value) {
        this.numberOfOrdinaryHousehold = value;
    }

    public boolean isSetNumberOfOrdinaryHousehold() {
        return (this.numberOfOrdinaryHousehold!= null);
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
     * Gets the value of the numberOfHouseholdsByStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByStructure() {
        if (numberOfHouseholdsByStructure == null) {
            numberOfHouseholdsByStructure = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByStructure;
    }

    public boolean isSetNumberOfHouseholdsByStructure() {
        return ((this.numberOfHouseholdsByStructure!= null)&&(!this.numberOfHouseholdsByStructure.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByStructure() {
        this.numberOfHouseholdsByStructure = null;
    }

    /**
     * Ruft den Wert der numberOfMainHousehold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMainHousehold() {
        return numberOfMainHousehold;
    }

    /**
     * Legt den Wert der numberOfMainHousehold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMainHousehold(BigInteger value) {
        this.numberOfMainHousehold = value;
    }

    public boolean isSetNumberOfMainHousehold() {
        return (this.numberOfMainHousehold!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfHouseholds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfHouseholds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfHouseholds().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfHouseholds() {
        if (_GenericApplicationPropertyOfHouseholds == null) {
            _GenericApplicationPropertyOfHouseholds = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfHouseholds;
    }

    public boolean isSet_GenericApplicationPropertyOfHouseholds() {
        return ((this._GenericApplicationPropertyOfHouseholds!= null)&&(!this._GenericApplicationPropertyOfHouseholds.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfHouseholds() {
        this._GenericApplicationPropertyOfHouseholds = null;
    }

}
