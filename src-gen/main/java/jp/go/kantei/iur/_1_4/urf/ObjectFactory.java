//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kantei.iur._1_4.urf package. 
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

    private final static QName __UrbanFunction_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "_UrbanFunction");
    private final static QName _LegalGrounds_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "LegalGrounds");
    private final static QName _Administration_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Administration");
    private final static QName __Zone_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "_Zone");
    private final static QName _LandUsePlan_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "LandUsePlan");
    private final static QName _UrbanPlan_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "UrbanPlan");
    private final static QName _Agreement_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Agreement");
    private final static QName _Regulation_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Regulation");
    private final static QName _AreaClassification_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "AreaClassification");
    private final static QName _DistrictsAndZones_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "DistrictsAndZones");
    private final static QName _DevelopmentProject_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "DevelopmentProject");
    private final static QName _CensusBlock_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "CensusBlock");
    private final static QName _NumberOfHouseholds_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "NumberOfHouseholds");
    private final static QName _DisasterDamage_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "DisasterDamage");
    private final static QName _Pollution_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Pollution");
    private final static QName _DisasterPreventionBase_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "DisasterPreventionBase");
    private final static QName _Recreations_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Recreations");
    private final static QName _HubCity_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "HubCity");
    private final static QName _LandUseDiversion_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "LandUseDiversion");
    private final static QName _Urbanization_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "Urbanization");
    private final static QName _PublicTransportationFacility_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "PublicTransportationFacility");
    private final static QName _FiscalYearOfPublication_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "fiscalYearOfPublication");
    private final static QName _Language_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", "language");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kantei.iur._1_4.urf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LegalGroundsType }
     * 
     */
    public LegalGroundsType createLegalGroundsType() {
        return new LegalGroundsType();
    }

    /**
     * Create an instance of {@link AdministrationType }
     * 
     */
    public AdministrationType createAdministrationType() {
        return new AdministrationType();
    }

    /**
     * Create an instance of {@link LandUsePlanType }
     * 
     */
    public LandUsePlanType createLandUsePlanType() {
        return new LandUsePlanType();
    }

    /**
     * Create an instance of {@link UrbanPlanType }
     * 
     */
    public UrbanPlanType createUrbanPlanType() {
        return new UrbanPlanType();
    }

    /**
     * Create an instance of {@link AgreementType }
     * 
     */
    public AgreementType createAgreementType() {
        return new AgreementType();
    }

    /**
     * Create an instance of {@link RegulationType }
     * 
     */
    public RegulationType createRegulationType() {
        return new RegulationType();
    }

    /**
     * Create an instance of {@link AreaClassificationType }
     * 
     */
    public AreaClassificationType createAreaClassificationType() {
        return new AreaClassificationType();
    }

    /**
     * Create an instance of {@link DistrictsAndZonesType }
     * 
     */
    public DistrictsAndZonesType createDistrictsAndZonesType() {
        return new DistrictsAndZonesType();
    }

    /**
     * Create an instance of {@link DevelopmentProjectType }
     * 
     */
    public DevelopmentProjectType createDevelopmentProjectType() {
        return new DevelopmentProjectType();
    }

    /**
     * Create an instance of {@link CensusBlockType }
     * 
     */
    public CensusBlockType createCensusBlockType() {
        return new CensusBlockType();
    }

    /**
     * Create an instance of {@link NumberOfHouseholdsType }
     * 
     */
    public NumberOfHouseholdsType createNumberOfHouseholdsType() {
        return new NumberOfHouseholdsType();
    }

    /**
     * Create an instance of {@link DisasterDamageType }
     * 
     */
    public DisasterDamageType createDisasterDamageType() {
        return new DisasterDamageType();
    }

    /**
     * Create an instance of {@link PollutionType }
     * 
     */
    public PollutionType createPollutionType() {
        return new PollutionType();
    }

    /**
     * Create an instance of {@link DisasterPreventionBaseType }
     * 
     */
    public DisasterPreventionBaseType createDisasterPreventionBaseType() {
        return new DisasterPreventionBaseType();
    }

    /**
     * Create an instance of {@link RecreationsType }
     * 
     */
    public RecreationsType createRecreationsType() {
        return new RecreationsType();
    }

    /**
     * Create an instance of {@link HubCityType }
     * 
     */
    public HubCityType createHubCityType() {
        return new HubCityType();
    }

    /**
     * Create an instance of {@link LandUseDiversionType }
     * 
     */
    public LandUseDiversionType createLandUseDiversionType() {
        return new LandUseDiversionType();
    }

    /**
     * Create an instance of {@link UrbanizationType }
     * 
     */
    public UrbanizationType createUrbanizationType() {
        return new UrbanizationType();
    }

    /**
     * Create an instance of {@link PublicTransportationFacilityType }
     * 
     */
    public PublicTransportationFacilityType createPublicTransportationFacilityType() {
        return new PublicTransportationFacilityType();
    }

    /**
     * Create an instance of {@link LegalGroundsPropertyType }
     * 
     */
    public LegalGroundsPropertyType createLegalGroundsPropertyType() {
        return new LegalGroundsPropertyType();
    }

    /**
     * Create an instance of {@link TargetPropertyType }
     * 
     */
    public TargetPropertyType createTargetPropertyType() {
        return new TargetPropertyType();
    }

    /**
     * Create an instance of {@link LandUsePlanPropertyType }
     * 
     */
    public LandUsePlanPropertyType createLandUsePlanPropertyType() {
        return new LandUsePlanPropertyType();
    }

    /**
     * Create an instance of {@link UrbanPlanPropertyType }
     * 
     */
    public UrbanPlanPropertyType createUrbanPlanPropertyType() {
        return new UrbanPlanPropertyType();
    }

    /**
     * Create an instance of {@link AgreementPropertyType }
     * 
     */
    public AgreementPropertyType createAgreementPropertyType() {
        return new AgreementPropertyType();
    }

    /**
     * Create an instance of {@link RegulationPropertyType }
     * 
     */
    public RegulationPropertyType createRegulationPropertyType() {
        return new RegulationPropertyType();
    }

    /**
     * Create an instance of {@link AreaClassificationPropertyType }
     * 
     */
    public AreaClassificationPropertyType createAreaClassificationPropertyType() {
        return new AreaClassificationPropertyType();
    }

    /**
     * Create an instance of {@link DistrictsAndZonesPropertyType }
     * 
     */
    public DistrictsAndZonesPropertyType createDistrictsAndZonesPropertyType() {
        return new DistrictsAndZonesPropertyType();
    }

    /**
     * Create an instance of {@link DevelopmentProjectPropertyType }
     * 
     */
    public DevelopmentProjectPropertyType createDevelopmentProjectPropertyType() {
        return new DevelopmentProjectPropertyType();
    }

    /**
     * Create an instance of {@link CensusBlockPropertyType }
     * 
     */
    public CensusBlockPropertyType createCensusBlockPropertyType() {
        return new CensusBlockPropertyType();
    }

    /**
     * Create an instance of {@link NumberOfHouseholdsPropertyType }
     * 
     */
    public NumberOfHouseholdsPropertyType createNumberOfHouseholdsPropertyType() {
        return new NumberOfHouseholdsPropertyType();
    }

    /**
     * Create an instance of {@link DisasterDamagePropertyType }
     * 
     */
    public DisasterDamagePropertyType createDisasterDamagePropertyType() {
        return new DisasterDamagePropertyType();
    }

    /**
     * Create an instance of {@link PollutionPropertyType }
     * 
     */
    public PollutionPropertyType createPollutionPropertyType() {
        return new PollutionPropertyType();
    }

    /**
     * Create an instance of {@link DisasterPreventionBasePropertyType }
     * 
     */
    public DisasterPreventionBasePropertyType createDisasterPreventionBasePropertyType() {
        return new DisasterPreventionBasePropertyType();
    }

    /**
     * Create an instance of {@link RecreationsPropertyType }
     * 
     */
    public RecreationsPropertyType createRecreationsPropertyType() {
        return new RecreationsPropertyType();
    }

    /**
     * Create an instance of {@link HubCityPropertyType }
     * 
     */
    public HubCityPropertyType createHubCityPropertyType() {
        return new HubCityPropertyType();
    }

    /**
     * Create an instance of {@link LandUseDiversionPropertyType }
     * 
     */
    public LandUseDiversionPropertyType createLandUseDiversionPropertyType() {
        return new LandUseDiversionPropertyType();
    }

    /**
     * Create an instance of {@link UrbanizationPropertyType }
     * 
     */
    public UrbanizationPropertyType createUrbanizationPropertyType() {
        return new UrbanizationPropertyType();
    }

    /**
     * Create an instance of {@link PublicTransportationFacilityPropertyType }
     * 
     */
    public PublicTransportationFacilityPropertyType createPublicTransportationFacilityPropertyType() {
        return new PublicTransportationFacilityPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "_UrbanFunction", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<UrbanFunctionType> create_UrbanFunction(UrbanFunctionType value) {
        return new JAXBElement<UrbanFunctionType>(__UrbanFunction_QNAME, UrbanFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalGroundsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LegalGroundsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "LegalGrounds")
    public JAXBElement<LegalGroundsType> createLegalGrounds(LegalGroundsType value) {
        return new JAXBElement<LegalGroundsType>(_LegalGrounds_QNAME, LegalGroundsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Administration", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<AdministrationType> createAdministration(AdministrationType value) {
        return new JAXBElement<AdministrationType>(_Administration_QNAME, AdministrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "_Zone", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<ZoneType> create_Zone(ZoneType value) {
        return new JAXBElement<ZoneType>(__Zone_QNAME, ZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUsePlanType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUsePlanType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "LandUsePlan", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<LandUsePlanType> createLandUsePlan(LandUsePlanType value) {
        return new JAXBElement<LandUsePlanType>(_LandUsePlan_QNAME, LandUsePlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanPlanType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrbanPlanType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "UrbanPlan", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<UrbanPlanType> createUrbanPlan(UrbanPlanType value) {
        return new JAXBElement<UrbanPlanType>(_UrbanPlan_QNAME, UrbanPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Agreement", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<AgreementType> createAgreement(AgreementType value) {
        return new JAXBElement<AgreementType>(_Agreement_QNAME, AgreementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Regulation", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<RegulationType> createRegulation(RegulationType value) {
        return new JAXBElement<RegulationType>(_Regulation_QNAME, RegulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "AreaClassification", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<AreaClassificationType> createAreaClassification(AreaClassificationType value) {
        return new JAXBElement<AreaClassificationType>(_AreaClassification_QNAME, AreaClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "DistrictsAndZones", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<DistrictsAndZonesType> createDistrictsAndZones(DistrictsAndZonesType value) {
        return new JAXBElement<DistrictsAndZonesType>(_DistrictsAndZones_QNAME, DistrictsAndZonesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "DevelopmentProject", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_Zone")
    public JAXBElement<DevelopmentProjectType> createDevelopmentProject(DevelopmentProjectType value) {
        return new JAXBElement<DevelopmentProjectType>(_DevelopmentProject_QNAME, DevelopmentProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "CensusBlock", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<CensusBlockType> createCensusBlock(CensusBlockType value) {
        return new JAXBElement<CensusBlockType>(_CensusBlock_QNAME, CensusBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOfHouseholdsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberOfHouseholdsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "NumberOfHouseholds")
    public JAXBElement<NumberOfHouseholdsType> createNumberOfHouseholds(NumberOfHouseholdsType value) {
        return new JAXBElement<NumberOfHouseholdsType>(_NumberOfHouseholds_QNAME, NumberOfHouseholdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "DisasterDamage", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<DisasterDamageType> createDisasterDamage(DisasterDamageType value) {
        return new JAXBElement<DisasterDamageType>(_DisasterDamage_QNAME, DisasterDamageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Pollution", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<PollutionType> createPollution(PollutionType value) {
        return new JAXBElement<PollutionType>(_Pollution_QNAME, PollutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "DisasterPreventionBase", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<DisasterPreventionBaseType> createDisasterPreventionBase(DisasterPreventionBaseType value) {
        return new JAXBElement<DisasterPreventionBaseType>(_DisasterPreventionBase_QNAME, DisasterPreventionBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Recreations", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<RecreationsType> createRecreations(RecreationsType value) {
        return new JAXBElement<RecreationsType>(_Recreations_QNAME, RecreationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "HubCity", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<HubCityType> createHubCity(HubCityType value) {
        return new JAXBElement<HubCityType>(_HubCity_QNAME, HubCityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "LandUseDiversion", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<LandUseDiversionType> createLandUseDiversion(LandUseDiversionType value) {
        return new JAXBElement<LandUseDiversionType>(_LandUseDiversion_QNAME, LandUseDiversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "Urbanization", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<UrbanizationType> createUrbanization(UrbanizationType value) {
        return new JAXBElement<UrbanizationType>(_Urbanization_QNAME, UrbanizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransportationFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransportationFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "PublicTransportationFacility", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", substitutionHeadName = "_UrbanFunction")
    public JAXBElement<PublicTransportationFacilityType> createPublicTransportationFacility(PublicTransportationFacilityType value) {
        return new JAXBElement<PublicTransportationFacilityType>(_PublicTransportationFacility_QNAME, PublicTransportationFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "fiscalYearOfPublication", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
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
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.4", name = "language", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<CodeType> createLanguage(CodeType value) {
        return new JAXBElement<CodeType>(_Language_QNAME, CodeType.class, null, value);
    }

}
