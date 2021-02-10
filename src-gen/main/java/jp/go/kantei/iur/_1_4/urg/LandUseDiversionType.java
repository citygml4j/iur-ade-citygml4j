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


/**
 * grid cell with the number and area of land use diversion
 * 
 * <p>Java-Klasse für LandUseDiversionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LandUseDiversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfAnnualDiversion" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}NumberOfAnnualDiversionsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaOfAnnualDiversion" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}AreaOfAnnualDiversionsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandUseDiversionType", propOrder = {
    "numberOfAnnualDiversion",
    "areaOfAnnualDiversion"
})
public class LandUseDiversionType
    extends StatisticalGridType
{

    protected List<NumberOfAnnualDiversionsPropertyType> numberOfAnnualDiversion;
    protected List<AreaOfAnnualDiversionsPropertyType> areaOfAnnualDiversion;

    /**
     * Gets the value of the numberOfAnnualDiversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAnnualDiversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAnnualDiversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAnnualDiversionsPropertyType }
     * 
     * 
     */
    public List<NumberOfAnnualDiversionsPropertyType> getNumberOfAnnualDiversion() {
        if (numberOfAnnualDiversion == null) {
            numberOfAnnualDiversion = new ArrayList<NumberOfAnnualDiversionsPropertyType>();
        }
        return this.numberOfAnnualDiversion;
    }

    public boolean isSetNumberOfAnnualDiversion() {
        return ((this.numberOfAnnualDiversion!= null)&&(!this.numberOfAnnualDiversion.isEmpty()));
    }

    public void unsetNumberOfAnnualDiversion() {
        this.numberOfAnnualDiversion = null;
    }

    /**
     * Gets the value of the areaOfAnnualDiversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaOfAnnualDiversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaOfAnnualDiversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaOfAnnualDiversionsPropertyType }
     * 
     * 
     */
    public List<AreaOfAnnualDiversionsPropertyType> getAreaOfAnnualDiversion() {
        if (areaOfAnnualDiversion == null) {
            areaOfAnnualDiversion = new ArrayList<AreaOfAnnualDiversionsPropertyType>();
        }
        return this.areaOfAnnualDiversion;
    }

    public boolean isSetAreaOfAnnualDiversion() {
        return ((this.areaOfAnnualDiversion!= null)&&(!this.areaOfAnnualDiversion.isEmpty()));
    }

    public void unsetAreaOfAnnualDiversion() {
        this.areaOfAnnualDiversion = null;
    }

}
