//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Fri Mar 20 09:22:40 CET 2020
//


package jp.go.kantei.iur._1_3.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Source of pollution
 * 
 * <p>Java-Klasse für PollutionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PollutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="damagedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3}_GenericApplicationPropertyOfPollution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionType", propOrder = {
    "damagedArea",
    "cause",
    "_GenericApplicationPropertyOfPollution"
})
public class PollutionType
    extends UrbanFunctionType
{

    protected MeasureType damagedArea;
    protected String cause;
    @XmlElementRef(name = "_GenericApplicationPropertyOfPollution", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfPollution;

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
     * Ruft den Wert der cause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Legt den Wert der cause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

    public boolean isSetCause() {
        return (this.cause!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfPollution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfPollution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfPollution().add(newItem);
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
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfPollution() {
        if (_GenericApplicationPropertyOfPollution == null) {
            _GenericApplicationPropertyOfPollution = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfPollution;
    }

    public boolean isSet_GenericApplicationPropertyOfPollution() {
        return ((this._GenericApplicationPropertyOfPollution!= null)&&(!this._GenericApplicationPropertyOfPollution.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfPollution() {
        this._GenericApplicationPropertyOfPollution = null;
    }

}
