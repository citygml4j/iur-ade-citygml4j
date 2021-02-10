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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell for various use
 * 
 * <p>Java-Klasse für GenericGridCellType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericGridCellType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericValue" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}KeyValuePairPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericGridCellType", propOrder = {
    "genericValue"
})
public class GenericGridCellType
    extends StatisticalGridType
{

    @XmlElement(required = true)
    protected List<KeyValuePairPropertyType> genericValue;

    /**
     * Gets the value of the genericValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairPropertyType }
     * 
     * 
     */
    public List<KeyValuePairPropertyType> getGenericValue() {
        if (genericValue == null) {
            genericValue = new ArrayList<KeyValuePairPropertyType>();
        }
        return this.genericValue;
    }

    public boolean isSetGenericValue() {
        return ((this.genericValue!= null)&&(!this.genericValue.isEmpty()));
    }

    public void unsetGenericValue() {
        this.genericValue = null;
    }

}
