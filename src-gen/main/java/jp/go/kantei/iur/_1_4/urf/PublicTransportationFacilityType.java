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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PublicTransportationFacilityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicTransportationFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frequencyOfService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCustomers" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicTransportationFacilityType", propOrder = {
    "routeName",
    "sectionName",
    "companyName",
    "frequencyOfService",
    "numberOfCustomers"
})
public class PublicTransportationFacilityType
    extends UrbanFunctionType
{

    protected String routeName;
    protected String sectionName;
    protected String companyName;
    protected BigInteger frequencyOfService;
    protected Double numberOfCustomers;

    /**
     * Ruft den Wert der routeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Legt den Wert der routeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    public boolean isSetRouteName() {
        return (this.routeName!= null);
    }

    /**
     * Ruft den Wert der sectionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Legt den Wert der sectionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    public boolean isSetSectionName() {
        return (this.sectionName!= null);
    }

    /**
     * Ruft den Wert der companyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Legt den Wert der companyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public boolean isSetCompanyName() {
        return (this.companyName!= null);
    }

    /**
     * Ruft den Wert der frequencyOfService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequencyOfService() {
        return frequencyOfService;
    }

    /**
     * Legt den Wert der frequencyOfService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequencyOfService(BigInteger value) {
        this.frequencyOfService = value;
    }

    public boolean isSetFrequencyOfService() {
        return (this.frequencyOfService!= null);
    }

    /**
     * Ruft den Wert der numberOfCustomers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * Legt den Wert der numberOfCustomers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberOfCustomers(Double value) {
        this.numberOfCustomers = value;
    }

    public boolean isSetNumberOfCustomers() {
        return (this.numberOfCustomers!= null);
    }

}
