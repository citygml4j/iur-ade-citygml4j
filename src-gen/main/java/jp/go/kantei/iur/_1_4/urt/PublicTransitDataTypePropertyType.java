//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PublicTransitDataTypePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicTransitDataTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}_PublicTransitDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicTransitDataTypePropertyType", propOrder = {
    "_PublicTransitDataType"
})
public class PublicTransitDataTypePropertyType {

    @XmlElementRef(name = "_PublicTransitDataType", namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", type = JAXBElement.class)
    protected JAXBElement<? extends PublicTransitDataTypeType> _PublicTransitDataType;

    /**
     * Ruft den Wert der _PublicTransitDataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     *     
     */
    public JAXBElement<? extends PublicTransitDataTypeType> get_PublicTransitDataType() {
        return _PublicTransitDataType;
    }

    /**
     * Legt den Wert der _PublicTransitDataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     *     
     */
    public void set_PublicTransitDataType(JAXBElement<? extends PublicTransitDataTypeType> value) {
        this._PublicTransitDataType = value;
    }

    public boolean isSet_PublicTransitDataType() {
        return (this._PublicTransitDataType!= null);
    }

}
