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
 * <p>Java-Klasse für FareAttributeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currencyType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="transfers" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="transferDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="agency" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}AgencyPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareAttributeType", propOrder = {
    "price",
    "currencyType",
    "paymentMethod",
    "transfers",
    "transferDuration",
    "agency"
})
public class FareAttributeType
    extends PublicTransitType
{

    protected double price;
    @XmlElement(required = true)
    protected CodeType currencyType;
    @XmlElement(required = true)
    protected CodeType paymentMethod;
    @XmlElement(required = true)
    protected CodeType transfers;
    protected BigInteger transferDuration;
    protected AgencyPropertyType agency;

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return true;
    }

    /**
     * Ruft den Wert der currencyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCurrencyType() {
        return currencyType;
    }

    /**
     * Legt den Wert der currencyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCurrencyType(CodeType value) {
        this.currencyType = value;
    }

    public boolean isSetCurrencyType() {
        return (this.currencyType!= null);
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPaymentMethod(CodeType value) {
        this.paymentMethod = value;
    }

    public boolean isSetPaymentMethod() {
        return (this.paymentMethod!= null);
    }

    /**
     * Ruft den Wert der transfers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransfers() {
        return transfers;
    }

    /**
     * Legt den Wert der transfers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransfers(CodeType value) {
        this.transfers = value;
    }

    public boolean isSetTransfers() {
        return (this.transfers!= null);
    }

    /**
     * Ruft den Wert der transferDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferDuration() {
        return transferDuration;
    }

    /**
     * Legt den Wert der transferDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferDuration(BigInteger value) {
        this.transferDuration = value;
    }

    public boolean isSetTransferDuration() {
        return (this.transferDuration!= null);
    }

    /**
     * Ruft den Wert der agency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPropertyType }
     *     
     */
    public AgencyPropertyType getAgency() {
        return agency;
    }

    /**
     * Legt den Wert der agency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPropertyType }
     *     
     */
    public void setAgency(AgencyPropertyType value) {
        this.agency = value;
    }

    public boolean isSetAgency() {
        return (this.agency!= null);
    }

}
