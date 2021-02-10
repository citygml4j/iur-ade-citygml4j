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
import net.opengis.gml.CodeType;


/**
 * <p>Java-Klasse für TranslationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TranslationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tableName" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="recordSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationType", propOrder = {
    "tableName",
    "fieldName",
    "language",
    "translation",
    "fieldValue",
    "recordId",
    "recordSubId"
})
public class TranslationType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    protected CodeType tableName;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected CodeType language;
    @XmlElement(required = true)
    protected String translation;
    protected String fieldValue;
    protected PublicTransitPropertyType recordId;
    protected String recordSubId;

    /**
     * Ruft den Wert der tableName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTableName() {
        return tableName;
    }

    /**
     * Legt den Wert der tableName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTableName(CodeType value) {
        this.tableName = value;
    }

    public boolean isSetTableName() {
        return (this.tableName!= null);
    }

    /**
     * Ruft den Wert der fieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Legt den Wert der fieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public boolean isSetFieldName() {
        return (this.fieldName!= null);
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLanguage(CodeType value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Ruft den Wert der translation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Legt den Wert der translation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    public boolean isSetTranslation() {
        return (this.translation!= null);
    }

    /**
     * Ruft den Wert der fieldValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Legt den Wert der fieldValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    public boolean isSetFieldValue() {
        return (this.fieldValue!= null);
    }

    /**
     * Ruft den Wert der recordId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicTransitPropertyType }
     *     
     */
    public PublicTransitPropertyType getRecordId() {
        return recordId;
    }

    /**
     * Legt den Wert der recordId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicTransitPropertyType }
     *     
     */
    public void setRecordId(PublicTransitPropertyType value) {
        this.recordId = value;
    }

    public boolean isSetRecordId() {
        return (this.recordId!= null);
    }

    /**
     * Ruft den Wert der recordSubId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSubId() {
        return recordSubId;
    }

    /**
     * Legt den Wert der recordSubId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSubId(String value) {
        this.recordSubId = value;
    }

    public boolean isSetRecordSubId() {
        return (this.recordSubId!= null);
    }

}
