//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java-Klasse für PathwayType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathwayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="isBidirectional" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="traversalTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="stairCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maxSlope" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="signpostedAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversedSignpostedAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType"/&gt;
 *         &lt;element name="to" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathwayType", propOrder = {
    "mode",
    "isBidirectional",
    "length",
    "traversalTime",
    "stairCount",
    "maxSlope",
    "minWidth",
    "signpostedAs",
    "reversedSignpostedAs",
    "from",
    "to"
})
public class PathwayType
    extends PublicTransitType
{

    protected CodeType mode;
    @XmlElement(required = true)
    protected CodeType isBidirectional;
    protected LengthType length;
    protected BigInteger traversalTime;
    protected BigInteger stairCount;
    protected Double maxSlope;
    protected Double minWidth;
    protected String signpostedAs;
    protected String reversedSignpostedAs;
    @XmlElement(required = true)
    protected StopPropertyType from;
    @XmlElement(required = true)
    protected StopPropertyType to;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMode(CodeType value) {
        this.mode = value;
    }

    public boolean isSetMode() {
        return (this.mode!= null);
    }

    /**
     * Ruft den Wert der isBidirectional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIsBidirectional() {
        return isBidirectional;
    }

    /**
     * Legt den Wert der isBidirectional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIsBidirectional(CodeType value) {
        this.isBidirectional = value;
    }

    public boolean isSetIsBidirectional() {
        return (this.isBidirectional!= null);
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Ruft den Wert der traversalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTraversalTime() {
        return traversalTime;
    }

    /**
     * Legt den Wert der traversalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTraversalTime(BigInteger value) {
        this.traversalTime = value;
    }

    public boolean isSetTraversalTime() {
        return (this.traversalTime!= null);
    }

    /**
     * Ruft den Wert der stairCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStairCount() {
        return stairCount;
    }

    /**
     * Legt den Wert der stairCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStairCount(BigInteger value) {
        this.stairCount = value;
    }

    public boolean isSetStairCount() {
        return (this.stairCount!= null);
    }

    /**
     * Ruft den Wert der maxSlope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxSlope() {
        return maxSlope;
    }

    /**
     * Legt den Wert der maxSlope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxSlope(Double value) {
        this.maxSlope = value;
    }

    public boolean isSetMaxSlope() {
        return (this.maxSlope!= null);
    }

    /**
     * Ruft den Wert der minWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinWidth() {
        return minWidth;
    }

    /**
     * Legt den Wert der minWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinWidth(Double value) {
        this.minWidth = value;
    }

    public boolean isSetMinWidth() {
        return (this.minWidth!= null);
    }

    /**
     * Ruft den Wert der signpostedAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignpostedAs() {
        return signpostedAs;
    }

    /**
     * Legt den Wert der signpostedAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignpostedAs(String value) {
        this.signpostedAs = value;
    }

    public boolean isSetSignpostedAs() {
        return (this.signpostedAs!= null);
    }

    /**
     * Ruft den Wert der reversedSignpostedAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversedSignpostedAs() {
        return reversedSignpostedAs;
    }

    /**
     * Legt den Wert der reversedSignpostedAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversedSignpostedAs(String value) {
        this.reversedSignpostedAs = value;
    }

    public boolean isSetReversedSignpostedAs() {
        return (this.reversedSignpostedAs!= null);
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setFrom(StopPropertyType value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setTo(StopPropertyType value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
    }

}
