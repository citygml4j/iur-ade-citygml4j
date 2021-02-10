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


/**
 * <p>Java-Klasse für TransferType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="minTransferTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "TransferType", propOrder = {
    "transferType",
    "minTransferTime",
    "from",
    "to"
})
public class TransferType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    protected CodeType transferType;
    protected BigInteger minTransferTime;
    @XmlElement(required = true)
    protected StopPropertyType from;
    @XmlElement(required = true)
    protected StopPropertyType to;

    /**
     * Ruft den Wert der transferType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransferType() {
        return transferType;
    }

    /**
     * Legt den Wert der transferType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransferType(CodeType value) {
        this.transferType = value;
    }

    public boolean isSetTransferType() {
        return (this.transferType!= null);
    }

    /**
     * Ruft den Wert der minTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTransferTime() {
        return minTransferTime;
    }

    /**
     * Legt den Wert der minTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTransferTime(BigInteger value) {
        this.minTransferTime = value;
    }

    public boolean isSetMinTransferTime() {
        return (this.minTransferTime!= null);
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
