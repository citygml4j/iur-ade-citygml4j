//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * grid cell with land prices
 * 
 * <p>Java-Klasse für LandPriceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LandPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landPrice" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}LandPricePerLandUsePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currencyUnit" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandPriceType", propOrder = {
    "landPrice",
    "currencyUnit"
})
public class LandPriceType
    extends StatisticalGridType
{

    protected List<LandPricePerLandUsePropertyType> landPrice;
    protected CodeType currencyUnit;

    /**
     * Gets the value of the landPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandPricePerLandUsePropertyType }
     * 
     * 
     */
    public List<LandPricePerLandUsePropertyType> getLandPrice() {
        if (landPrice == null) {
            landPrice = new ArrayList<LandPricePerLandUsePropertyType>();
        }
        return this.landPrice;
    }

    public boolean isSetLandPrice() {
        return ((this.landPrice!= null)&&(!this.landPrice.isEmpty()));
    }

    public void unsetLandPrice() {
        this.landPrice = null;
    }

    /**
     * Ruft den Wert der currencyUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCurrencyUnit() {
        return currencyUnit;
    }

    /**
     * Legt den Wert der currencyUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCurrencyUnit(CodeType value) {
        this.currencyUnit = value;
    }

    public boolean isSetCurrencyUnit() {
        return (this.currencyUnit!= null);
    }

}
