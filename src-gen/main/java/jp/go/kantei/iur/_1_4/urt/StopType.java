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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java-Klasse für StopType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ttsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="zoneId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="locationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="wheelchairBoarding" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="platformCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="point" type="{http://www.opengis.net/gml}PointPropertyType"/&gt;
 *         &lt;element name="parentStation" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}LevelPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
    "code",
    "ttsName",
    "latitude",
    "longitude",
    "zoneId",
    "url",
    "locationType",
    "timeZone",
    "wheelchairBoarding",
    "platformCode",
    "point",
    "parentStation",
    "level"
})
public class StopType
    extends PublicTransitType
{

    protected CodeType code;
    protected String ttsName;
    protected Double latitude;
    protected Double longitude;
    protected CodeType zoneId;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected CodeType locationType;
    protected CodeType timeZone;
    protected CodeType wheelchairBoarding;
    protected String platformCode;
    @XmlElement(required = true)
    protected PointPropertyType point;
    protected StopPropertyType parentStation;
    protected LevelPropertyType level;

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code!= null);
    }

    /**
     * Ruft den Wert der ttsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtsName() {
        return ttsName;
    }

    /**
     * Legt den Wert der ttsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtsName(String value) {
        this.ttsName = value;
    }

    public boolean isSetTtsName() {
        return (this.ttsName!= null);
    }

    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return (this.latitude!= null);
    }

    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return (this.longitude!= null);
    }

    /**
     * Ruft den Wert der zoneId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getZoneId() {
        return zoneId;
    }

    /**
     * Legt den Wert der zoneId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setZoneId(CodeType value) {
        this.zoneId = value;
    }

    public boolean isSetZoneId() {
        return (this.zoneId!= null);
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Ruft den Wert der locationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationType() {
        return locationType;
    }

    /**
     * Legt den Wert der locationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationType(CodeType value) {
        this.locationType = value;
    }

    public boolean isSetLocationType() {
        return (this.locationType!= null);
    }

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTimeZone(CodeType value) {
        this.timeZone = value;
    }

    public boolean isSetTimeZone() {
        return (this.timeZone!= null);
    }

    /**
     * Ruft den Wert der wheelchairBoarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    /**
     * Legt den Wert der wheelchairBoarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWheelchairBoarding(CodeType value) {
        this.wheelchairBoarding = value;
    }

    public boolean isSetWheelchairBoarding() {
        return (this.wheelchairBoarding!= null);
    }

    /**
     * Ruft den Wert der platformCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * Legt den Wert der platformCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformCode(String value) {
        this.platformCode = value;
    }

    public boolean isSetPlatformCode() {
        return (this.platformCode!= null);
    }

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPoint(PointPropertyType value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Ruft den Wert der parentStation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getParentStation() {
        return parentStation;
    }

    /**
     * Legt den Wert der parentStation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setParentStation(StopPropertyType value) {
        this.parentStation = value;
    }

    public boolean isSetParentStation() {
        return (this.parentStation!= null);
    }

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LevelPropertyType }
     *     
     */
    public LevelPropertyType getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelPropertyType }
     *     
     */
    public void setLevel(LevelPropertyType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

}
