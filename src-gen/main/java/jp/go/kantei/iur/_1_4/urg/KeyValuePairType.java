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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für KeyValuePairType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="intValue" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="doubleValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *           &lt;element name="codeValue" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *           &lt;element name="measuredValue" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *           &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="uriValue" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairType", propOrder = {
    "key",
    "stringValue",
    "intValue",
    "doubleValue",
    "codeValue",
    "measuredValue",
    "dateValue",
    "uriValue"
})
public class KeyValuePairType {

    @XmlElement(required = true)
    protected CodeType key;
    protected String stringValue;
    protected BigInteger intValue;
    protected Double doubleValue;
    protected CodeType codeValue;
    protected MeasureType measuredValue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    @XmlSchemaType(name = "anyURI")
    protected String uriValue;

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setKey(CodeType value) {
        this.key = value;
    }

    public boolean isSetKey() {
        return (this.key!= null);
    }

    /**
     * Ruft den Wert der stringValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Legt den Wert der stringValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    public boolean isSetStringValue() {
        return (this.stringValue!= null);
    }

    /**
     * Ruft den Wert der intValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntValue() {
        return intValue;
    }

    /**
     * Legt den Wert der intValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntValue(BigInteger value) {
        this.intValue = value;
    }

    public boolean isSetIntValue() {
        return (this.intValue!= null);
    }

    /**
     * Ruft den Wert der doubleValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Legt den Wert der doubleValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleValue(Double value) {
        this.doubleValue = value;
    }

    public boolean isSetDoubleValue() {
        return (this.doubleValue!= null);
    }

    /**
     * Ruft den Wert der codeValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCodeValue() {
        return codeValue;
    }

    /**
     * Legt den Wert der codeValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCodeValue(CodeType value) {
        this.codeValue = value;
    }

    public boolean isSetCodeValue() {
        return (this.codeValue!= null);
    }

    /**
     * Ruft den Wert der measuredValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMeasuredValue() {
        return measuredValue;
    }

    /**
     * Legt den Wert der measuredValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMeasuredValue(MeasureType value) {
        this.measuredValue = value;
    }

    public boolean isSetMeasuredValue() {
        return (this.measuredValue!= null);
    }

    /**
     * Ruft den Wert der dateValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Legt den Wert der dateValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    public boolean isSetDateValue() {
        return (this.dateValue!= null);
    }

    /**
     * Ruft den Wert der uriValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriValue() {
        return uriValue;
    }

    /**
     * Legt den Wert der uriValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriValue(String value) {
        this.uriValue = value;
    }

    public boolean isSetUriValue() {
        return (this.uriValue!= null);
    }

}
