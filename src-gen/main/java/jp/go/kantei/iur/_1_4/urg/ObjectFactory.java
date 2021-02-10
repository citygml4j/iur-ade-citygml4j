//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kantei.iur._1_4.urg package. 
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

    private final static QName __StatisticalGrid_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "_StatisticalGrid");
    private final static QName _Population_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "Population");
    private final static QName _PopulationByAgeAndSex_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "PopulationByAgeAndSex");
    private final static QName _PublicTransitAccessibility_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "PublicTransitAccessibility");
    private final static QName _LandPrice_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "LandPrice");
    private final static QName _LandPricePerLandUse_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "LandPricePerLandUse");
    private final static QName _LandUseDiversion_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "LandUseDiversion");
    private final static QName _NumberOfAnnualDiversions_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "NumberOfAnnualDiversions");
    private final static QName _AreaOfAnnualDiversions_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "AreaOfAnnualDiversions");
    private final static QName _Households_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "Households");
    private final static QName _NumberOfHouseholds_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "NumberOfHouseholds");
    private final static QName _OfficesAndEmployees_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "OfficesAndEmployees");
    private final static QName _GenericGridCell_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "GenericGridCell");
    private final static QName _KeyValuePair_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "KeyValuePair");
    private final static QName _FiscalYearOfPublication_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "fiscalYearOfPublication");
    private final static QName _Language_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", "language");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kantei.iur._1_4.urg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PopulationType }
     * 
     */
    public PopulationType createPopulationType() {
        return new PopulationType();
    }

    /**
     * Create an instance of {@link PopulationByAgeAndSexType }
     * 
     */
    public PopulationByAgeAndSexType createPopulationByAgeAndSexType() {
        return new PopulationByAgeAndSexType();
    }

    /**
     * Create an instance of {@link PublicTransitAccessibilityType }
     * 
     */
    public PublicTransitAccessibilityType createPublicTransitAccessibilityType() {
        return new PublicTransitAccessibilityType();
    }

    /**
     * Create an instance of {@link LandPriceType }
     * 
     */
    public LandPriceType createLandPriceType() {
        return new LandPriceType();
    }

    /**
     * Create an instance of {@link LandPricePerLandUseType }
     * 
     */
    public LandPricePerLandUseType createLandPricePerLandUseType() {
        return new LandPricePerLandUseType();
    }

    /**
     * Create an instance of {@link LandUseDiversionType }
     * 
     */
    public LandUseDiversionType createLandUseDiversionType() {
        return new LandUseDiversionType();
    }

    /**
     * Create an instance of {@link NumberOfAnnualDiversionsType }
     * 
     */
    public NumberOfAnnualDiversionsType createNumberOfAnnualDiversionsType() {
        return new NumberOfAnnualDiversionsType();
    }

    /**
     * Create an instance of {@link AreaOfAnnualDiversionsType }
     * 
     */
    public AreaOfAnnualDiversionsType createAreaOfAnnualDiversionsType() {
        return new AreaOfAnnualDiversionsType();
    }

    /**
     * Create an instance of {@link HouseholdsType }
     * 
     */
    public HouseholdsType createHouseholdsType() {
        return new HouseholdsType();
    }

    /**
     * Create an instance of {@link NumberOfHouseholdsType }
     * 
     */
    public NumberOfHouseholdsType createNumberOfHouseholdsType() {
        return new NumberOfHouseholdsType();
    }

    /**
     * Create an instance of {@link OfficesAndEmployeesType }
     * 
     */
    public OfficesAndEmployeesType createOfficesAndEmployeesType() {
        return new OfficesAndEmployeesType();
    }

    /**
     * Create an instance of {@link GenericGridCellType }
     * 
     */
    public GenericGridCellType createGenericGridCellType() {
        return new GenericGridCellType();
    }

    /**
     * Create an instance of {@link KeyValuePairType }
     * 
     */
    public KeyValuePairType createKeyValuePairType() {
        return new KeyValuePairType();
    }

    /**
     * Create an instance of {@link StatisticalGridPropertyType }
     * 
     */
    public StatisticalGridPropertyType createStatisticalGridPropertyType() {
        return new StatisticalGridPropertyType();
    }

    /**
     * Create an instance of {@link PopulationPropertyType }
     * 
     */
    public PopulationPropertyType createPopulationPropertyType() {
        return new PopulationPropertyType();
    }

    /**
     * Create an instance of {@link PopulationByAgeAndSexPropertyType }
     * 
     */
    public PopulationByAgeAndSexPropertyType createPopulationByAgeAndSexPropertyType() {
        return new PopulationByAgeAndSexPropertyType();
    }

    /**
     * Create an instance of {@link PublicTransitAccessibilityPropertyType }
     * 
     */
    public PublicTransitAccessibilityPropertyType createPublicTransitAccessibilityPropertyType() {
        return new PublicTransitAccessibilityPropertyType();
    }

    /**
     * Create an instance of {@link LandPricePropertyType }
     * 
     */
    public LandPricePropertyType createLandPricePropertyType() {
        return new LandPricePropertyType();
    }

    /**
     * Create an instance of {@link LandPricePerLandUsePropertyType }
     * 
     */
    public LandPricePerLandUsePropertyType createLandPricePerLandUsePropertyType() {
        return new LandPricePerLandUsePropertyType();
    }

    /**
     * Create an instance of {@link LandUseDiversionPropertyType }
     * 
     */
    public LandUseDiversionPropertyType createLandUseDiversionPropertyType() {
        return new LandUseDiversionPropertyType();
    }

    /**
     * Create an instance of {@link NumberOfAnnualDiversionsPropertyType }
     * 
     */
    public NumberOfAnnualDiversionsPropertyType createNumberOfAnnualDiversionsPropertyType() {
        return new NumberOfAnnualDiversionsPropertyType();
    }

    /**
     * Create an instance of {@link AreaOfAnnualDiversionsPropertyType }
     * 
     */
    public AreaOfAnnualDiversionsPropertyType createAreaOfAnnualDiversionsPropertyType() {
        return new AreaOfAnnualDiversionsPropertyType();
    }

    /**
     * Create an instance of {@link HouseholdsPropertyType }
     * 
     */
    public HouseholdsPropertyType createHouseholdsPropertyType() {
        return new HouseholdsPropertyType();
    }

    /**
     * Create an instance of {@link NumberOfHouseholdsPropertyType }
     * 
     */
    public NumberOfHouseholdsPropertyType createNumberOfHouseholdsPropertyType() {
        return new NumberOfHouseholdsPropertyType();
    }

    /**
     * Create an instance of {@link OfficesAndEmployeesPropertyType }
     * 
     */
    public OfficesAndEmployeesPropertyType createOfficesAndEmployeesPropertyType() {
        return new OfficesAndEmployeesPropertyType();
    }

    /**
     * Create an instance of {@link GenericGridCellPropertyType }
     * 
     */
    public GenericGridCellPropertyType createGenericGridCellPropertyType() {
        return new GenericGridCellPropertyType();
    }

    /**
     * Create an instance of {@link KeyValuePairPropertyType }
     * 
     */
    public KeyValuePairPropertyType createKeyValuePairPropertyType() {
        return new KeyValuePairPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "_StatisticalGrid", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<StatisticalGridType> create_StatisticalGrid(StatisticalGridType value) {
        return new JAXBElement<StatisticalGridType>(__StatisticalGrid_QNAME, StatisticalGridType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "Population", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<PopulationType> createPopulation(PopulationType value) {
        return new JAXBElement<PopulationType>(_Population_QNAME, PopulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulationByAgeAndSexType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PopulationByAgeAndSexType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "PopulationByAgeAndSex")
    public JAXBElement<PopulationByAgeAndSexType> createPopulationByAgeAndSex(PopulationByAgeAndSexType value) {
        return new JAXBElement<PopulationByAgeAndSexType>(_PopulationByAgeAndSex_QNAME, PopulationByAgeAndSexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "PublicTransitAccessibility", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<PublicTransitAccessibilityType> createPublicTransitAccessibility(PublicTransitAccessibilityType value) {
        return new JAXBElement<PublicTransitAccessibilityType>(_PublicTransitAccessibility_QNAME, PublicTransitAccessibilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "LandPrice", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<LandPriceType> createLandPrice(LandPriceType value) {
        return new JAXBElement<LandPriceType>(_LandPrice_QNAME, LandPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandPricePerLandUseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandPricePerLandUseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "LandPricePerLandUse")
    public JAXBElement<LandPricePerLandUseType> createLandPricePerLandUse(LandPricePerLandUseType value) {
        return new JAXBElement<LandPricePerLandUseType>(_LandPricePerLandUse_QNAME, LandPricePerLandUseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "LandUseDiversion", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<LandUseDiversionType> createLandUseDiversion(LandUseDiversionType value) {
        return new JAXBElement<LandUseDiversionType>(_LandUseDiversion_QNAME, LandUseDiversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOfAnnualDiversionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberOfAnnualDiversionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "NumberOfAnnualDiversions")
    public JAXBElement<NumberOfAnnualDiversionsType> createNumberOfAnnualDiversions(NumberOfAnnualDiversionsType value) {
        return new JAXBElement<NumberOfAnnualDiversionsType>(_NumberOfAnnualDiversions_QNAME, NumberOfAnnualDiversionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaOfAnnualDiversionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreaOfAnnualDiversionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "AreaOfAnnualDiversions")
    public JAXBElement<AreaOfAnnualDiversionsType> createAreaOfAnnualDiversions(AreaOfAnnualDiversionsType value) {
        return new JAXBElement<AreaOfAnnualDiversionsType>(_AreaOfAnnualDiversions_QNAME, AreaOfAnnualDiversionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "Households", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<HouseholdsType> createHouseholds(HouseholdsType value) {
        return new JAXBElement<HouseholdsType>(_Households_QNAME, HouseholdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOfHouseholdsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberOfHouseholdsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "NumberOfHouseholds")
    public JAXBElement<NumberOfHouseholdsType> createNumberOfHouseholds(NumberOfHouseholdsType value) {
        return new JAXBElement<NumberOfHouseholdsType>(_NumberOfHouseholds_QNAME, NumberOfHouseholdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "OfficesAndEmployees", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<OfficesAndEmployeesType> createOfficesAndEmployees(OfficesAndEmployeesType value) {
        return new JAXBElement<OfficesAndEmployeesType>(_OfficesAndEmployees_QNAME, OfficesAndEmployeesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "GenericGridCell", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", substitutionHeadName = "_StatisticalGrid")
    public JAXBElement<GenericGridCellType> createGenericGridCell(GenericGridCellType value) {
        return new JAXBElement<GenericGridCellType>(_GenericGridCell_QNAME, GenericGridCellType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "KeyValuePair")
    public JAXBElement<KeyValuePairType> createKeyValuePair(KeyValuePairType value) {
        return new JAXBElement<KeyValuePairType>(_KeyValuePair_QNAME, KeyValuePairType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "fiscalYearOfPublication", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
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
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4", name = "language", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<CodeType> createLanguage(CodeType value) {
        return new JAXBElement<CodeType>(_Language_QNAME, CodeType.class, null, value);
    }

}
