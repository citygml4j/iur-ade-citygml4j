//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOffices" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
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
    "numberOfEmployees"
})
public class OfficesAndEmployeesType
    extends StatisticalGridType
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfOffices;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfEmployees;

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

}
