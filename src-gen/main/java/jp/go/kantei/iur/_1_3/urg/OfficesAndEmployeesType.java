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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OfficesAndEmployeesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OfficesAndEmployeesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOffices" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3}_GenericApplicationPropertyOfOfficesAndEmployees" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficesAndEmployeesType", propOrder = {
    "numberOfOffices",
    "numberOfEmployees",
    "_GenericApplicationPropertyOfOfficesAndEmployees"
})
public class OfficesAndEmployeesType
    extends StatisticalGridType
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfOffices;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfEmployees;
    @XmlElementRef(name = "_GenericApplicationPropertyOfOfficesAndEmployees", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfOfficesAndEmployees;

    /**
     * Ruft den Wert der numberOfOffices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * Legt den Wert der numberOfOffices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOffices(BigInteger value) {
        this.numberOfOffices = value;
    }

    public boolean isSetNumberOfOffices() {
        return (this.numberOfOffices!= null);
    }

    /**
     * Ruft den Wert der numberOfEmployees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Legt den Wert der numberOfEmployees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEmployees(BigInteger value) {
        this.numberOfEmployees = value;
    }

    public boolean isSetNumberOfEmployees() {
        return (this.numberOfEmployees!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfOfficesAndEmployees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfOfficesAndEmployees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfOfficesAndEmployees().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfOfficesAndEmployees() {
        if (_GenericApplicationPropertyOfOfficesAndEmployees == null) {
            _GenericApplicationPropertyOfOfficesAndEmployees = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfOfficesAndEmployees;
    }

    public boolean isSet_GenericApplicationPropertyOfOfficesAndEmployees() {
        return ((this._GenericApplicationPropertyOfOfficesAndEmployees!= null)&&(!this._GenericApplicationPropertyOfOfficesAndEmployees.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfOfficesAndEmployees() {
        this._GenericApplicationPropertyOfOfficesAndEmployees = null;
    }

}
