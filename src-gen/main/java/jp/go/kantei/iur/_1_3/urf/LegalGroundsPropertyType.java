//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LegalGroundsPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegalGroundsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}LegalGrounds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalGroundsPropertyType", propOrder = {
    "legalGrounds"
})
public class LegalGroundsPropertyType {

    @XmlElement(name = "LegalGrounds")
    protected LegalGroundsType legalGrounds;

    /**
     * Ruft den Wert der legalGrounds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegalGroundsType }
     *     
     */
    public LegalGroundsType getLegalGrounds() {
        return legalGrounds;
    }

    /**
     * Legt den Wert der legalGrounds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalGroundsType }
     *     
     */
    public void setLegalGrounds(LegalGroundsType value) {
        this.legalGrounds = value;
    }

    public boolean isSetLegalGrounds() {
        return (this.legalGrounds!= null);
    }

}
