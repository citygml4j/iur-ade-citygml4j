//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FeedInfoPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeedInfoPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}FeedInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedInfoPropertyType", propOrder = {
    "feedInfo"
})
public class FeedInfoPropertyType {

    @XmlElement(name = "FeedInfo", required = true)
    protected FeedInfoType feedInfo;

    /**
     * Ruft den Wert der feedInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeedInfoType }
     *     
     */
    public FeedInfoType getFeedInfo() {
        return feedInfo;
    }

    /**
     * Legt den Wert der feedInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedInfoType }
     *     
     */
    public void setFeedInfo(FeedInfoType value) {
        this.feedInfo = value;
    }

    public boolean isSetFeedInfo() {
        return (this.feedInfo!= null);
    }

}
