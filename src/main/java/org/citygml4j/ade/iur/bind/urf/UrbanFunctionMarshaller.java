package org.citygml4j.ade.iur.bind.urf;

import jp.go.kantei.iur._1_3.urf.AdministrationType;
import jp.go.kantei.iur._1_3.urf.AgreementType;
import jp.go.kantei.iur._1_3.urf.AreaClassificationType;
import jp.go.kantei.iur._1_3.urf.CensusBlockType;
import jp.go.kantei.iur._1_3.urf.DevelopmentProjectType;
import jp.go.kantei.iur._1_3.urf.DisasterDamageType;
import jp.go.kantei.iur._1_3.urf.DisasterPreventionBaseType;
import jp.go.kantei.iur._1_3.urf.DistrictsAndZonesType;
import jp.go.kantei.iur._1_3.urf.HubCityType;
import jp.go.kantei.iur._1_3.urf.LandUseDiversionType;
import jp.go.kantei.iur._1_3.urf.LandUsePlanType;
import jp.go.kantei.iur._1_3.urf.LegalGroundsPropertyType;
import jp.go.kantei.iur._1_3.urf.LegalGroundsType;
import jp.go.kantei.iur._1_3.urf.NumberOfHouseholdsPropertyType;
import jp.go.kantei.iur._1_3.urf.NumberOfHouseholdsType;
import jp.go.kantei.iur._1_3.urf.ObjectFactory;
import jp.go.kantei.iur._1_3.urf.PollutionType;
import jp.go.kantei.iur._1_3.urf.PublicTransitType;
import jp.go.kantei.iur._1_3.urf.RecreationsType;
import jp.go.kantei.iur._1_3.urf.RegulationType;
import jp.go.kantei.iur._1_3.urf.TargetPropertyType;
import jp.go.kantei.iur._1_3.urf.UrbanFunctionType;
import jp.go.kantei.iur._1_3.urf.UrbanPlanType;
import jp.go.kantei.iur._1_3.urf.UrbanizationType;
import jp.go.kantei.iur._1_3.urf.ZoneType;
import net.opengis.citygml._2.AbstractCityObjectType;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.urf.Administration;
import org.citygml4j.ade.iur.model.urf.Agreement;
import org.citygml4j.ade.iur.model.urf.AreaClassification;
import org.citygml4j.ade.iur.model.urf.CensusBlock;
import org.citygml4j.ade.iur.model.urf.DevelopmentProject;
import org.citygml4j.ade.iur.model.urf.DisasterDamage;
import org.citygml4j.ade.iur.model.urf.DisasterPreventionBase;
import org.citygml4j.ade.iur.model.urf.DistrictsAndZones;
import org.citygml4j.ade.iur.model.urf.HubCity;
import org.citygml4j.ade.iur.model.urf.LandUseDiversion;
import org.citygml4j.ade.iur.model.urf.LandUsePlan;
import org.citygml4j.ade.iur.model.urf.LegalGrounds;
import org.citygml4j.ade.iur.model.urf.LegalGroundsProperty;
import org.citygml4j.ade.iur.model.urf.NumberOfHouseholds;
import org.citygml4j.ade.iur.model.urf.NumberOfHouseholdsProperty;
import org.citygml4j.ade.iur.model.urf.Pollution;
import org.citygml4j.ade.iur.model.urf.PublicTransit;
import org.citygml4j.ade.iur.model.urf.Recreations;
import org.citygml4j.ade.iur.model.urf.Regulation;
import org.citygml4j.ade.iur.model.urf.TargetProperty;
import org.citygml4j.ade.iur.model.urf.UrbanFunction;
import org.citygml4j.ade.iur.model.urf.UrbanPlan;
import org.citygml4j.ade.iur.model.urf.Urbanization;
import org.citygml4j.ade.iur.model.urf.Zone;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import java.math.BigInteger;
import java.time.LocalDate;

public class UrbanFunctionMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public UrbanFunctionMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(Administration.class, this::createAdministration)
                    .with(Agreement.class, this::createAgreement)
                    .with(AreaClassification.class, this::createAreaClassification)
                    .with(CensusBlock.class, this::createCensusBlock)
                    .with(DevelopmentProject.class, this::createDevelopmentProject)
                    .with(DisasterDamage.class, this::createDisasterDamage)
                    .with(DisasterPreventionBase.class, this::createDisasterPreventionBase)
                    .with(DistrictsAndZones.class, this::createDistrictsAndZones)
                    .with(HubCity.class, this::createHubCity)
                    .with(LandUseDiversion.class, this::createLandUseDiversion)
                    .with(LandUsePlan.class, this::createLandUsePlan)
                    .with(LegalGrounds.class, this::createLegalGrounds)
                    .with(NumberOfHouseholds.class, this::createNumberOfHouseholds)
                    .with(Pollution.class, this::createPollution)
                    .with(PublicTransit.class, this::createPublicTransit)
                    .with(Recreations.class, this::createRecreations)
                    .with(Regulation.class, this::createRegulation)
                    .with(Urbanization.class, this::createUrbanization)
                    .with(UrbanPlan.class, this::createUrbanPlan);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Administration.class, this::marshalAdministration)
                    .with(Agreement.class, this::marshalAgreement)
                    .with(AreaClassification.class, this::marshalAreaClassification)
                    .with(CensusBlock.class, this::marshalCensusBlock)
                    .with(DevelopmentProject.class, this::marshalDevelopmentProject)
                    .with(DisasterDamage.class, this::marshalDisasterDamage)
                    .with(DisasterPreventionBase.class, this::marshalDisasterPreventionBase)
                    .with(DistrictsAndZones.class, this::marshalDistrictsAndZones)
                    .with(HubCity.class, this::marshalHubCity)
                    .with(LandUsePlan.class, this::marshalLandUsePlan)
                    .with(LegalGrounds.class, this::marshalLegalGrounds)
                    .with(LegalGroundsProperty.class, this::marshalLegalGroundsProperty)
                    .with(NumberOfHouseholds.class, this::marshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsProperty.class, this::marshalNumberOfHouseholdsProperty)
                    .with(Pollution.class, this::marshalPollution)
                    .with(PublicTransit.class, this::marshalPublicTransit)
                    .with(Recreations.class, this::marshalRecreations)
                    .with(Regulation.class, this::marshalRegulation)
                    .with(TargetProperty.class, this::marshalTargetProperty)
                    .with(Urbanization.class, this::marshalUrbanization)
                    .with(UrbanPlan.class, this::marshalUrbanPlan);
        }

        return typeMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        TypeMapper<JAXBElement<?>> elementMapper = getElementMapper();
        return elementMapper != null ? elementMapper.apply(src) : null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        TypeMapper<Object> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void marshalUrbanFunction(UrbanFunction src, UrbanFunctionType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        for (Code function : src.getFunctions())
            dest.getFunction().add(helper.getGMLMarshaller().marshalCode(function));

        if (src.getEnactmentDate() != null)
            dest.setEnactmentDate(marshaller.toCalendar(src.getEnactmentDate()));

        if (src.getEnactmentFiscalYear() != null)
            dest.setEnactmentFiscalYear(marshaller.toCalendar(src.getExpirationFiscalYear()));

        if (src.getExpirationDate() != null)
            dest.setExpirationDate(marshaller.toCalendar(src.getExpirationDate()));

        if (src.getExpirationFiscalYear() != null)
            dest.setExpirationFiscalYear(marshaller.toCalendar(src.getExpirationFiscalYear()));

        if (src.getLegalGrounds() != null)
            dest.setLegalGrounds(marshalLegalGroundsProperty(src.getLegalGrounds()));

        dest.setCustodian(src.getCustodian());

        if (src.getNominalArea() != null)
            dest.setNominalArea(helper.getGMLMarshaller().marshalMeasure(src.getNominalArea()));

        dest.setAbstract(src.getAbstract());
        dest.setValidity(src.getValidity());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getArea()));

        if (src.getBoundary() != null)
            dest.setBoundary(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getBoundary()));

        if (src.getPointLocation() != null)
            dest.setPointLocation(helper.getGMLMarshaller().marshalMultiPointProperty(src.getPointLocation()));

        for (TargetProperty property : src.getTargets())
            dest.getTarget().add(marshalTargetProperty(property));
    }

    private void marshalZone(Zone src, ZoneType dest) {
        marshalUrbanFunction(src, dest);

        if (src.getFinalPublicationDate() != null)
            dest.setFinalPublicationDate(marshaller.toCalendar(src.getFinalPublicationDate()));

        dest.setAreaApplied(src.getAreaApplied());
    }

    private AdministrationType marshalAdministration(Administration src) {
        AdministrationType dest = factory.createAdministrationType();
        marshalUrbanFunction(src, dest);

        return dest;
    }

    private AgreementType marshalAgreement(Agreement src) {
        AgreementType dest = factory.createAgreementType();
        marshalZone(src, dest);

        return dest;
    }

    private AreaClassificationType marshalAreaClassification(AreaClassification src) {
        AreaClassificationType dest = factory.createAreaClassificationType();
        marshalZone(src, dest);

        return dest;
    }

    private CensusBlockType marshalCensusBlock(CensusBlock src) {
        CensusBlockType dest = factory.createCensusBlockType();
        marshalUrbanFunction(src, dest);

        if (src.getDaytimePopulation() != null)
            dest.setDaytimePopulation(BigInteger.valueOf(src.getDaytimePopulation()));

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.getNumberOfOrdinaryHouseholds() != null)
            dest.setNumberOfOrdinaryHouseholds(BigInteger.valueOf(src.getNumberOfOrdinaryHouseholds()));

        for (NumberOfHouseholdsProperty property : src.getNumberOfHouseholdsByOwnership())
            dest.getNumberOfHouseholdsByOwnership().add(marshalNumberOfHouseholdsProperty(property));

        if (src.getNumberOfMainHouseholds() != null)
            dest.setNumberOfMainHouseholds(BigInteger.valueOf(src.getNumberOfMainHouseholds()));

        for (NumberOfHouseholdsProperty property : src.getNumberOfHouseholdsByStructure())
            dest.getNumberOfHouseholdsByStruture().add(marshalNumberOfHouseholdsProperty(property));

        return dest;
    }

    private DevelopmentProjectType marshalDevelopmentProject(DevelopmentProject src) {
        DevelopmentProjectType dest = factory.createDevelopmentProjectType();
        marshalZone(src, dest);

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        if (src.getMainPurpose() != null)
            dest.setMainPurpose(helper.getGMLMarshaller().marshalCode(src.getMainPurpose()));

        if (src.getBenefitArea() != null)
            dest.setBenefitArea(helper.getGMLMarshaller().marshalMeasure(src.getBenefitArea()));

        dest.setBenefitPeriod(src.getBenefitPeriod());

        if (src.getCost() != null)
            dest.setCost(BigInteger.valueOf(src.getCost()));

        if (src.getPlannedArea() != null)
            dest.setPlannedArea(helper.getGMLMarshaller().marshalMeasure(src.getPlannedArea()));

        if (src.getOngoingArea() != null)
            dest.setOngoingArea(helper.getGMLMarshaller().marshalMeasure(src.getOngoingArea()));

        if (src.getCompletedArea() != null)
            dest.setCompletedArea(helper.getGMLMarshaller().marshalMeasure(src.getCompletedArea()));

        if (src.getDateOfDecision() != null)
            dest.setDateOfDecision(marshaller.toCalendar(src.getDateOfDecision()));

        if (src.getDateOfDesignationForTemporaryReplotting() != null)
            dest.setDateOfDesignationForTemporaryReplotting(marshaller.toCalendar(src.getDateOfDesignationForTemporaryReplotting()));

        return dest;
    }

    private DisasterDamageType marshalDisasterDamage(DisasterDamage src) {
        DisasterDamageType dest = factory.createDisasterDamageType();
        marshalUrbanFunction(src, dest);

        if (src.getDamagedArea() != null)
            dest.setDamagedArea(helper.getGMLMarshaller().marshalMeasure(src.getDamagedArea()));

        if (src.getNumberOfDamagedHouses() != null)
            dest.setNumberOfDamagedHouses(BigInteger.valueOf(src.getNumberOfDamagedHouses()));

        if (src.getNumberOfHousesFloodedAboveFloorLevel() != null)
            dest.setNumberOfHousesFloodedAboveFloorLevel(BigInteger.valueOf(src.getNumberOfHousesFloodedAboveFloorLevel()));

        if (src.getNumberOfHousesFloodedBelowFloorLevel() != null)
            dest.setNumberOfHousesFloodedBelowFloorLevel(BigInteger.valueOf(src.getNumberOfHousesFloodedBelowFloorLevel()));

        if (src.getMaximumRainfallPerHour() != null)
            dest.setMaximumRainfallPerHour(BigInteger.valueOf(src.getMaximumRainfallPerHour()));

        if (src.getTotalRainfall() != null)
            dest.setTotalRainfall(BigInteger.valueOf(src.getTotalRainfall()));

        return dest;
    }

    private DisasterPreventionBaseType marshalDisasterPreventionBase(DisasterPreventionBase src) {
        DisasterPreventionBaseType dest = factory.createDisasterPreventionBaseType();
        marshalUrbanFunction(src, dest);

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        return dest;
    }

    private DistrictsAndZonesType marshalDistrictsAndZones(DistrictsAndZones src) {
        DistrictsAndZonesType dest = factory.createDistrictsAndZonesType();
        marshalZone(src, dest);

        return dest;
    }

    private HubCityType marshalHubCity(HubCity src) {
        HubCityType dest = factory.createHubCityType();
        marshalUrbanFunction(src, dest);

        return dest;
    }

    private LandUseDiversionType marshalLandUseDiversion(LandUseDiversion src) {
        LandUseDiversionType dest = factory.createLandUseDiversionType();
        marshalUrbanFunction(src, dest);

        return dest;
    }

    private LandUsePlanType marshalLandUsePlan(LandUsePlan src) {
        LandUsePlanType dest = factory.createLandUsePlanType();
        marshalZone(src, dest);

        return dest;
    }

    private LegalGroundsType marshalLegalGrounds(LegalGrounds src) {
        LegalGroundsType dest = factory.createLegalGroundsType();

        if (src.getNameOfRegulation() != null)
            dest.setNameOfRegulation(helper.getGMLMarshaller().marshalCode(src.getNameOfRegulation()));

        if (src.getArticlesOfRegulation() != null)
            dest.setArticlesOfRegulation(helper.getGMLMarshaller().marshalCode(src.getArticlesOfRegulation()));

        if (src.getDate() != null) {
            LocalDate date = src.getDate();
            dest.setDate(helper.getJAXBMarshaller().getDataTypeFactory().newXMLGregorianCalendarDate(
                    date.getYear(),
                    date.getMonthValue(),
                    date.getDayOfMonth(),
                    DatatypeConstants.FIELD_UNDEFINED));
        }

        return dest;
    }

    private LegalGroundsPropertyType marshalLegalGroundsProperty(LegalGroundsProperty src) {
        LegalGroundsPropertyType dest = factory.createLegalGroundsPropertyType();

        if (src.isSetObject())
            dest.setLegalGrounds(marshalLegalGrounds(src.getObject()));

        return dest;
    }

    private NumberOfHouseholdsType marshalNumberOfHouseholds(NumberOfHouseholds src) {
        NumberOfHouseholdsType dest = factory.createNumberOfHouseholdsType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private NumberOfHouseholdsPropertyType marshalNumberOfHouseholdsProperty(NumberOfHouseholdsProperty src) {
        NumberOfHouseholdsPropertyType dest = factory.createNumberOfHouseholdsPropertyType();

        if (src.isSetObject())
            dest.setNumberOfHouseholds(marshalNumberOfHouseholds(src.getObject()));

        return dest;
    }

    private PollutionType marshalPollution(Pollution src) {
        PollutionType dest = factory.createPollutionType();
        marshalUrbanFunction(src, dest);

        if (src.getDamagedArea() != null)
            dest.setDamagedArea(helper.getGMLMarshaller().marshalMeasure(src.getDamagedArea()));

        dest.setCause(src.getCause());

        return dest;
    }

    private PublicTransitType marshalPublicTransit(PublicTransit src) {
        PublicTransitType dest = factory.createPublicTransitType();
        marshalUrbanFunction(src, dest);

        dest.setRouteName(src.getRouteName());
        dest.setSectionName(src.getSectionName());
        dest.setCompanyName(src.getCompanyName());

        if (src.getFrequencyOfService() != null)
            dest.setFrequencyOfService(BigInteger.valueOf(src.getFrequencyOfService()));

        dest.setNumberOfCustomers(src.getNumberOfCustomers());

        return dest;
    }

    private RecreationsType marshalRecreations(Recreations src) {
        RecreationsType dest = factory.createRecreationsType();
        marshalUrbanFunction(src, dest);

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        if (src.getNumberOfUsers() != null)
            dest.setNumberOfUsers(BigInteger.valueOf(src.getNumberOfUsers()));

        return dest;
    }

    private RegulationType marshalRegulation(Regulation src) {
        RegulationType dest = factory.createRegulationType();
        marshalZone(src, dest);

        return dest;
    }

    @SuppressWarnings("unchecked")
    public TargetPropertyType marshalTargetProperty(TargetProperty src) {
        TargetPropertyType dest = factory.createTargetPropertyType();

        if (src.isSetCityObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getCityObject());
            if (elem != null && elem.getValue() instanceof AbstractCityObjectType)
                dest.set_CityObject((JAXBElement<? extends AbstractCityObjectType>) elem);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private UrbanizationType marshalUrbanization(Urbanization src) {
        UrbanizationType dest = factory.createUrbanizationType();
        marshalUrbanFunction(src, dest);

        dest.setPeriod(src.getPeriod());
        dest.setResources(src.getResources());

        return dest;
    }

    private UrbanPlanType marshalUrbanPlan(UrbanPlan src) {
        UrbanPlanType dest = factory.createUrbanPlanType();
        marshalZone(src, dest);

        return dest;
    }

    private JAXBElement<?> createAdministration(Administration src) {
        return factory.createAdministration(marshalAdministration(src));
    }

    private JAXBElement<?> createAgreement(Agreement src) {
        return factory.createAgreement(marshalAgreement(src));
    }

    private JAXBElement<?> createAreaClassification(AreaClassification src) {
        return factory.createAreaClassification(marshalAreaClassification(src));
    }

    private JAXBElement<?> createCensusBlock(CensusBlock src) {
        return factory.createCensusBlock(marshalCensusBlock(src));
    }

    private JAXBElement<?> createDevelopmentProject(DevelopmentProject src) {
        return factory.createDevelopmentProject(marshalDevelopmentProject(src));
    }

    private JAXBElement<?> createDisasterDamage(DisasterDamage src) {
        return factory.createDisasterDamage(marshalDisasterDamage(src));
    }

    private JAXBElement<?> createDisasterPreventionBase(DisasterPreventionBase src) {
        return factory.createDisasterPreventionBase(marshalDisasterPreventionBase(src));
    }

    private JAXBElement<?> createDistrictsAndZones(DistrictsAndZones src) {
        return factory.createDistrictsAndZones(marshalDistrictsAndZones(src));
    }

    private JAXBElement<?> createHubCity(HubCity src) {
        return factory.createHubCity(marshalHubCity(src));
    }

    private JAXBElement<?> createLandUseDiversion(LandUseDiversion src) {
        return factory.createLandUseDiversion(marshalLandUseDiversion(src));
    }

    private JAXBElement<?> createLandUsePlan(LandUsePlan src) {
        return factory.createLandUsePlan(marshalLandUsePlan(src));
    }

    private JAXBElement<?> createLegalGrounds(LegalGrounds src) {
        return factory.createLegalGrounds(marshalLegalGrounds(src));
    }

    private JAXBElement<?> createNumberOfHouseholds(NumberOfHouseholds src) {
        return factory.createNumberOfHouseholds(marshalNumberOfHouseholds(src));
    }

    private JAXBElement<?> createPollution(Pollution src) {
        return factory.createPollution(marshalPollution(src));
    }

    private JAXBElement<?> createPublicTransit(PublicTransit src) {
        return factory.createPublicTransit(marshalPublicTransit(src));
    }

    private JAXBElement<?> createRecreations(Recreations src) {
        return factory.createRecreations(marshalRecreations(src));
    }

    private JAXBElement<?> createRegulation(Regulation src) {
        return factory.createRegulation(marshalRegulation(src));
    }

    private JAXBElement<?> createUrbanization(Urbanization src) {
        return factory.createUrbanization(marshalUrbanization(src));
    }

    private JAXBElement<?> createUrbanPlan(UrbanPlan src) {
        return factory.createUrbanPlan(marshalUrbanPlan(src));
    }
}
