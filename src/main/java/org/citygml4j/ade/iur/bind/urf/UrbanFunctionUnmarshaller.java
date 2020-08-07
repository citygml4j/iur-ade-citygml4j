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
import jp.go.kantei.iur._1_3.urf.PollutionType;
import jp.go.kantei.iur._1_3.urf.PublicTransitType;
import jp.go.kantei.iur._1_3.urf.RecreationsType;
import jp.go.kantei.iur._1_3.urf.RegulationType;
import jp.go.kantei.iur._1_3.urf.TargetPropertyType;
import jp.go.kantei.iur._1_3.urf.UrbanFunctionType;
import jp.go.kantei.iur._1_3.urf.UrbanPlanType;
import jp.go.kantei.iur._1_3.urf.UrbanizationType;
import jp.go.kantei.iur._1_3.urf.ZoneType;
import net.opengis.gml.CodeType;
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
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import javax.xml.bind.JAXBElement;
import java.time.LocalDate;
import java.time.Year;

public class UrbanFunctionUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(AdministrationType.class, this::unmarshalAdministration)
                    .with(AgreementType.class, this::unmarshalAgreement)
                    .with(AreaClassificationType.class, this::unmarshalAreaClassification)
                    .with(CensusBlockType.class, this::unmarshalCensusBlock)
                    .with(DevelopmentProjectType.class, this::unmarshalDevelopmentProject)
                    .with(DisasterDamageType.class, this::unmarshalDisasterDamage)
                    .with(DisasterPreventionBaseType.class, this::unmarshalDisasterPreventionBase)
                    .with(DistrictsAndZonesType.class, this::unmarshalDistrictsAndZones)
                    .with(HubCityType.class, this::unmarshalHubCity)
                    .with(LandUseDiversionType.class, this::unmarshalLandUseDiversion)
                    .with(LandUsePlanType.class, this::unmarshalLandUsePlan)
                    .with(LegalGroundsType.class, this::unmarshalLegalGrounds)
                    .with(LegalGroundsPropertyType.class, this::unmarshalLegalGroundsProperty)
                    .with(NumberOfHouseholdsType.class, this::unmarshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsPropertyType.class, this::unmarshalNumberOfHouseholdsProperty)
                    .with(PollutionType.class, this::unmarshalPollution)
                    .with(PublicTransitType.class, this::unmarshalPublicTransit)
                    .with(RecreationsType.class, this::unmarshalRecreations)
                    .with(RegulationType.class, this::unmarshalRegulation)
                    .with(UrbanizationType.class, this::unmarshalUrbanization)
                    .with(UrbanPlanType.class, this::unmarshalUrbanPlan)
                    .with(TargetPropertyType.class, this::unmarshalTargetProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        return unmarshal(src.getValue());
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        CheckedTypeMapper<ADEModelObject> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void unmarshalUrbanFunction(UrbanFunctionType src, UrbanFunction dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetFunction()) {
            for (CodeType function : src.getFunction())
                dest.getFunctions().add(helper.getGMLUnmarshaller().unmarshalCode(function));
        }

        if (src.isSetEnactmentDate())
            dest.setEnactmentDate(src.getEnactmentDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetEnactmentFiscalYear()) {
            LocalDate date = src.getEnactmentFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setEnactmentFiscalYear(Year.of(date.getYear()));
        }

        if (src.isSetExpirationDate())
            dest.setExpirationDate(src.getExpirationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetExpirationFiscalYear()) {
            LocalDate date = src.getExpirationFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setExpirationFiscalYear(Year.of(date.getYear()));
        }

        if (src.isSetLegalGrounds())
            dest.setLegalGrounds(unmarshalLegalGroundsProperty(src.getLegalGrounds()));

        dest.setCustodian(src.getCustodian());

        if (src.isSetNominalArea())
            dest.setNominalArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getNominalArea()));

        dest.setAbstract(src.getAbstract());
        dest.setValidity(src.isValidity());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getArea()));

        if (src.isSetBoundary())
            dest.setBoundary(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getBoundary()));

        if (src.isSetPointLocation())
            dest.setPointLocation(helper.getGMLUnmarshaller().unmarshalMultiPointProperty(src.getPointLocation()));

        if (src.isSetTarget()) {
            for (TargetPropertyType property : src.getTarget())
                dest.getTargets().add(unmarshalTargetProperty(property));
        }
    }

    private void unmarshalZone(ZoneType src, Zone dest) throws MissingADESchemaException {
        unmarshalUrbanFunction(src, dest);

        if (src.isSetFinalPublicationDate())
            dest.setFinalPublicationDate(src.getFinalPublicationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setAreaApplied(src.getAreaApplied());
    }

    private Administration unmarshalAdministration(AdministrationType src) throws MissingADESchemaException {
        Administration dest = new Administration();
        unmarshalUrbanFunction(src, dest);

        return dest;
    }

    private Agreement unmarshalAgreement(AgreementType src) throws MissingADESchemaException {
        Agreement dest = new Agreement();
        unmarshalZone(src, dest);

        return dest;
    }

    private AreaClassification unmarshalAreaClassification(AreaClassificationType src) throws MissingADESchemaException {
        AreaClassification dest = new AreaClassification();
        unmarshalZone(src, dest);

        return dest;
    }

    private CensusBlock unmarshalCensusBlock(CensusBlockType src) throws MissingADESchemaException {
        CensusBlock dest = new CensusBlock();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDaytimePopulation())
            dest.setDaytimePopulation(src.getDaytimePopulation().intValue());

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.isSetNumberOfOrdinaryHouseholds())
            dest.setNumberOfOrdinaryHouseholds(src.getNumberOfOrdinaryHouseholds().intValue());

        if (src.isSetNumberOfHouseholdsByOwnership()) {
            for (NumberOfHouseholdsPropertyType property : src.getNumberOfHouseholdsByOwnership())
                dest.getNumberOfHouseholdsByOwnership().add(unmarshalNumberOfHouseholdsProperty(property));
        }

        if (src.isSetNumberOfMainHouseholds())
            dest.setNumberOfMainHouseholds(src.getNumberOfMainHouseholds().intValue());

        if (src.isSetNumberOfHouseholdsByStruture()) {
            for (NumberOfHouseholdsPropertyType property : src.getNumberOfHouseholdsByStruture())
                dest.getNumberOfHouseholdsByStructure().add(unmarshalNumberOfHouseholdsProperty(property));
        }

        return dest;
    }

    private DevelopmentProject unmarshalDevelopmentProject(DevelopmentProjectType src) throws MissingADESchemaException {
        DevelopmentProject dest = new DevelopmentProject();
        unmarshalZone(src, dest);

        if (src.isSetStatus())
            dest.setStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getStatus()));

        if (src.isSetMainPurpose())
            dest.setMainPurpose(helper.getGMLUnmarshaller().unmarshalCode(src.getMainPurpose()));

        if (src.isSetBenefitArea())
            dest.setBenefitArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBenefitArea()));

        dest.setBenefitPeriod(src.getBenefitPeriod());

        if (src.isSetCost())
            dest.setCost(src.getCost().intValue());

        if (src.isSetPlannedArea())
            dest.setPlannedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getPlannedArea()));

        if (src.isSetOngoingArea())
            dest.setOngoingArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOngoingArea()));

        if (src.isSetCompletedArea())
            dest.setCompletedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getCompletedArea()));

        if (src.isSetDateOfDecision())
            dest.setDateOfDecision(src.getDateOfDecision().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetDateOfDesignationForTemporaryReplotting())
            dest.setDateOfDesignationForTemporaryReplotting(src.getDateOfDesignationForTemporaryReplotting().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    private DisasterDamage unmarshalDisasterDamage(DisasterDamageType src) throws MissingADESchemaException {
        DisasterDamage dest = new DisasterDamage();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDamagedArea())
            dest.setDamagedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDamagedArea()));

        if (src.isSetNumberOfDamagedHouses())
            dest.setNumberOfDamagedHouses(src.getNumberOfDamagedHouses().intValue());

        if (src.isSetNumberOfHousesFloodedAboveFloorLevel())
            dest.setNumberOfHousesFloodedAboveFloorLevel(src.getNumberOfHousesFloodedAboveFloorLevel().intValue());

        if (src.isSetNumberOfHousesFloodedBelowFloorLevel())
            dest.setNumberOfHousesFloodedBelowFloorLevel(src.getNumberOfHousesFloodedBelowFloorLevel().intValue());

        if (src.isSetMaximumRainfallPerHour())
            dest.setMaximumRainfallPerHour(src.getMaximumRainfallPerHour().intValue());

        if (src.isSetTotalRainfall())
            dest.setTotalRainfall(src.getTotalRainfall().intValue());

        return dest;
    }

    private DisasterPreventionBase unmarshalDisasterPreventionBase(DisasterPreventionBaseType src) throws MissingADESchemaException {
        DisasterPreventionBase dest = new DisasterPreventionBase();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        return dest;
    }

    private DistrictsAndZones unmarshalDistrictsAndZones(DistrictsAndZonesType src) throws MissingADESchemaException {
        DistrictsAndZones dest = new DistrictsAndZones();
        unmarshalZone(src, dest);

        return dest;
    }

    private HubCity unmarshalHubCity(HubCityType src) throws MissingADESchemaException {
        HubCity dest = new HubCity();
        unmarshalUrbanFunction(src, dest);

        return dest;
    }

    private LandUseDiversion unmarshalLandUseDiversion(LandUseDiversionType src) throws MissingADESchemaException {
        LandUseDiversion dest = new LandUseDiversion();
        unmarshalUrbanFunction(src, dest);

        return dest;
    }

    private LandUsePlan unmarshalLandUsePlan(LandUsePlanType src) throws MissingADESchemaException {
        LandUsePlan dest = new LandUsePlan();
        unmarshalZone(src, dest);

        return dest;
    }

    private LegalGrounds unmarshalLegalGrounds(LegalGroundsType src) throws MissingADESchemaException {
        LegalGrounds dest = new LegalGrounds();

        if (src.isSetNameOfRegulation())
            dest.setNameOfRegulation(helper.getGMLUnmarshaller().unmarshalCode(src.getNameOfRegulation()));

        if (src.isSetArticlesOfRegulation())
            dest.setArticlesOfRegulation(helper.getGMLUnmarshaller().unmarshalCode(src.getArticlesOfRegulation()));

        if (src.isSetDate())
            dest.setDate(src.getDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    private LegalGroundsProperty unmarshalLegalGroundsProperty(LegalGroundsPropertyType src) throws MissingADESchemaException {
        LegalGroundsProperty dest = new LegalGroundsProperty();

        if (src.isSetLegalGrounds())
            dest.setObject(unmarshalLegalGrounds(src.getLegalGrounds()));

        return dest;
    }

    private NumberOfHouseholds unmarshalNumberOfHouseholds(NumberOfHouseholdsType src) throws MissingADESchemaException {
        NumberOfHouseholds dest = new NumberOfHouseholds();

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetNumber())
            dest.setNumber(src.getNumber().intValue());

        return dest;
    }

    private NumberOfHouseholdsProperty unmarshalNumberOfHouseholdsProperty(NumberOfHouseholdsPropertyType src) throws MissingADESchemaException {
        NumberOfHouseholdsProperty dest = new NumberOfHouseholdsProperty();

        if (src.isSetNumberOfHouseholds())
            dest.setObject(unmarshalNumberOfHouseholds(src.getNumberOfHouseholds()));

        return dest;
    }

    private Pollution unmarshalPollution(PollutionType src) throws MissingADESchemaException {
        Pollution dest = new Pollution();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDamagedArea())
            dest.setDamagedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDamagedArea()));

        dest.setCause(src.getCause());

        return dest;
    }

    private PublicTransit unmarshalPublicTransit(PublicTransitType src) throws MissingADESchemaException {
        PublicTransit dest = new PublicTransit();
        unmarshalUrbanFunction(src, dest);

        dest.setRouteName(src.getRouteName());
        dest.setSectionName(src.getSectionName());
        dest.setCompanyName(src.getCompanyName());

        if (src.isSetFrequencyOfService())
            dest.setFrequencyOfService(src.getFrequencyOfService().intValue());

        dest.setNumberOfCustomers(src.getNumberOfCustomers());

        return dest;
    }

    private Recreations unmarshalRecreations(RecreationsType src) throws MissingADESchemaException {
        Recreations dest = new Recreations();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        if (src.isSetNumberOfUsers())
            dest.setNumberOfUsers(src.getNumberOfUsers().intValue());

        return dest;
    }

    private Regulation unmarshalRegulation(RegulationType src) throws MissingADESchemaException {
        Regulation dest = new Regulation();
        unmarshalZone(src, dest);

        return dest;
    }

    public TargetProperty unmarshalTargetProperty(TargetPropertyType src) throws MissingADESchemaException {
        TargetProperty dest = new TargetProperty();

        if (src.isSet_CityObject()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.get_CityObject());
            if (object instanceof AbstractCityObject)
                dest.setCityObject((AbstractCityObject) object);
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Urbanization unmarshalUrbanization(UrbanizationType src) throws MissingADESchemaException {
        Urbanization dest = new Urbanization();
        unmarshalUrbanFunction(src, dest);

        dest.setPeriod(src.getPeriod());
        dest.setResources(src.getResources());

        return dest;
    }

    private UrbanPlan unmarshalUrbanPlan(UrbanPlanType src) throws MissingADESchemaException {
        UrbanPlan dest = new UrbanPlan();
        unmarshalZone(src, dest);

        return dest;
    }
}
