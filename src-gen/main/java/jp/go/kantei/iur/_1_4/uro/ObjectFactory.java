//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kantei.iur._1_4.uro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuildingDetailsProperty_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "buildingDetails");
    private final static QName _BuildingDetails_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "BuildingDetails");
    private final static QName _LargeCustomerFacilitiesProperty_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "largeCustomerFacilities");
    private final static QName _LargeCustomerFacilities_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "LargeCustomerFacilities");
    private final static QName _ExtendedAttribute_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "extendedAttribute");
    private final static QName _KeyValuePair_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "KeyValuePair");
    private final static QName _NominalArea_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "nominalArea");
    private final static QName _OwnerType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "ownerType");
    private final static QName _Owner_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "owner");
    private final static QName _AreaInSquareMeter_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "areaInSquareMeter");
    private final static QName _AreaInHa_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "areaInHa");
    private final static QName _UrbanPlanType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "urbanPlanType");
    private final static QName _DistrictsAndZonesType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "districtsAndZonesType");
    private final static QName _LandUsePlanType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "landUsePlanType");
    private final static QName _AreaClassificationType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "areaClassificationType");
    private final static QName _Prefecture_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "prefecture");
    private final static QName _City_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "city");
    private final static QName _Reference_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "reference");
    private final static QName _Note_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "note");
    private final static QName _SurveyYear_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "surveyYear");
    private final static QName _Width_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "width");
    private final static QName _WidthType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "widthType");
    private final static QName _TrafficVolumeProperty_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "trafficVolume");
    private final static QName _TrafficVolume_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "TrafficVolume");
    private final static QName _FiscalYearOfPublication_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "fiscalYearOfPublication");
    private final static QName _Language_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", "language");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kantei.iur._1_4.uro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildingDetailsPropertyType }
     * 
     */
    public BuildingDetailsPropertyType createBuildingDetailsPropertyType() {
        return new BuildingDetailsPropertyType();
    }

    /**
     * Create an instance of {@link BuildingDetailsType }
     * 
     */
    public BuildingDetailsType createBuildingDetailsType() {
        return new BuildingDetailsType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilitiesPropertyType }
     * 
     */
    public LargeCustomerFacilitiesPropertyType createLargeCustomerFacilitiesPropertyType() {
        return new LargeCustomerFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilitiesType }
     * 
     */
    public LargeCustomerFacilitiesType createLargeCustomerFacilitiesType() {
        return new LargeCustomerFacilitiesType();
    }

    /**
     * Create an instance of {@link KeyValuePairPropertyType }
     * 
     */
    public KeyValuePairPropertyType createKeyValuePairPropertyType() {
        return new KeyValuePairPropertyType();
    }

    /**
     * Create an instance of {@link KeyValuePairType }
     * 
     */
    public KeyValuePairType createKeyValuePairType() {
        return new KeyValuePairType();
    }

    /**
     * Create an instance of {@link TrafficVolumePropertyType }
     * 
     */
    public TrafficVolumePropertyType createTrafficVolumePropertyType() {
        return new TrafficVolumePropertyType();
    }

    /**
     * Create an instance of {@link TrafficVolumeType }
     * 
     */
    public TrafficVolumeType createTrafficVolumeType() {
        return new TrafficVolumeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailsPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailsPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "buildingDetails", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDetailsPropertyType> createBuildingDetailsProperty(BuildingDetailsPropertyType value) {
        return new JAXBElement<BuildingDetailsPropertyType>(_BuildingDetailsProperty_QNAME, BuildingDetailsPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "BuildingDetails")
    public JAXBElement<BuildingDetailsType> createBuildingDetails(BuildingDetailsType value) {
        return new JAXBElement<BuildingDetailsType>(_BuildingDetails_QNAME, BuildingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilitiesPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilitiesPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "largeCustomerFacilities", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<LargeCustomerFacilitiesPropertyType> createLargeCustomerFacilitiesProperty(LargeCustomerFacilitiesPropertyType value) {
        return new JAXBElement<LargeCustomerFacilitiesPropertyType>(_LargeCustomerFacilitiesProperty_QNAME, LargeCustomerFacilitiesPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "LargeCustomerFacilities")
    public JAXBElement<LargeCustomerFacilitiesType> createLargeCustomerFacilities(LargeCustomerFacilitiesType value) {
        return new JAXBElement<LargeCustomerFacilitiesType>(_LargeCustomerFacilities_QNAME, LargeCustomerFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "extendedAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<KeyValuePairPropertyType> createExtendedAttribute(KeyValuePairPropertyType value) {
        return new JAXBElement<KeyValuePairPropertyType>(_ExtendedAttribute_QNAME, KeyValuePairPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "KeyValuePair")
    public JAXBElement<KeyValuePairType> createKeyValuePair(KeyValuePairType value) {
        return new JAXBElement<KeyValuePairType>(_KeyValuePair_QNAME, KeyValuePairType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "nominalArea", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<MeasureType> createNominalArea(MeasureType value) {
        return new JAXBElement<MeasureType>(_NominalArea_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "ownerType", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createOwnerType(CodeType value) {
        return new JAXBElement<CodeType>(_OwnerType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "owner", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<String> createOwner(String value) {
        return new JAXBElement<String>(_Owner_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "areaInSquareMeter", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<MeasureType> createAreaInSquareMeter(MeasureType value) {
        return new JAXBElement<MeasureType>(_AreaInSquareMeter_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "areaInHa", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<MeasureType> createAreaInHa(MeasureType value) {
        return new JAXBElement<MeasureType>(_AreaInHa_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "urbanPlanType", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createUrbanPlanType(CodeType value) {
        return new JAXBElement<CodeType>(_UrbanPlanType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "districtsAndZonesType", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createDistrictsAndZonesType(CodeType value) {
        return new JAXBElement<CodeType>(_DistrictsAndZonesType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "landUsePlanType", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createLandUsePlanType(CodeType value) {
        return new JAXBElement<CodeType>(_LandUsePlanType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "areaClassificationType", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createAreaClassificationType(CodeType value) {
        return new JAXBElement<CodeType>(_AreaClassificationType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "prefecture", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createPrefecture(CodeType value) {
        return new JAXBElement<CodeType>(_Prefecture_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "city", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<CodeType> createCity(CodeType value) {
        return new JAXBElement<CodeType>(_City_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "reference", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<String> createReference(String value) {
        return new JAXBElement<String>(_Reference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "note", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<String> createNote(String value) {
        return new JAXBElement<String>(_Note_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "surveyYear", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<XMLGregorianCalendar> createSurveyYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SurveyYear_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "width", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<LengthType> createWidth(LengthType value) {
        return new JAXBElement<LengthType>(_Width_QNAME, LengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "widthType", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<CodeType> createWidthType(CodeType value) {
        return new JAXBElement<CodeType>(_WidthType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "trafficVolume", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<TrafficVolumePropertyType> createTrafficVolumeProperty(TrafficVolumePropertyType value) {
        return new JAXBElement<TrafficVolumePropertyType>(_TrafficVolumeProperty_QNAME, TrafficVolumePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "TrafficVolume")
    public JAXBElement<TrafficVolumeType> createTrafficVolume(TrafficVolumeType value) {
        return new JAXBElement<TrafficVolumeType>(_TrafficVolume_QNAME, TrafficVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "fiscalYearOfPublication", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<XMLGregorianCalendar> createFiscalYearOfPublication(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FiscalYearOfPublication_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4", name = "language", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<CodeType> createLanguage(CodeType value) {
        return new JAXBElement<CodeType>(_Language_QNAME, CodeType.class, null, value);
    }

}
