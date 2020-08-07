//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LargeCustomerFacilitiesPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LargeCustomerFacilitiesPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.3}LargeCustomerFacilities"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LargeCustomerFacilitiesPropertyType", propOrder = {
    "largeCustomerFacilities"
})
public class LargeCustomerFacilitiesPropertyType {

    @XmlElement(name = "LargeCustomerFacilities", required = true)
    protected LargeCustomerFacilitiesType largeCustomerFacilities;

    /**
     * Ruft den Wert der largeCustomerFacilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LargeCustomerFacilitiesType }
     *     
     */
    public LargeCustomerFacilitiesType getLargeCustomerFacilities() {
        return largeCustomerFacilities;
    }

    /**
     * Legt den Wert der largeCustomerFacilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeCustomerFacilitiesType }
     *     
     */
    public void setLargeCustomerFacilities(LargeCustomerFacilitiesType value) {
        this.largeCustomerFacilities = value;
    }

    public boolean isSetLargeCustomerFacilities() {
        return (this.largeCustomerFacilities!= null);
    }

}
