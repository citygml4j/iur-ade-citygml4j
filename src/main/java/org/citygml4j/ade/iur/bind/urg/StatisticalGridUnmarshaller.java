package org.citygml4j.ade.iur.bind.urg;

import jp.go.kantei.iur._1_3.urg.HouseholdsType;
import jp.go.kantei.iur._1_3.urg.LandPricePerLandUsePropertyType;
import jp.go.kantei.iur._1_3.urg.LandPricePerLandUseType;
import jp.go.kantei.iur._1_3.urg.LandPriceType;
import jp.go.kantei.iur._1_3.urg.LandUseDiversionType;
import jp.go.kantei.iur._1_3.urg.NumberOfAnnualDiversionsPropertyType;
import jp.go.kantei.iur._1_3.urg.NumberOfAnnualDiversionsType;
import jp.go.kantei.iur._1_3.urg.NumberOfHouseholdsPropertyType;
import jp.go.kantei.iur._1_3.urg.NumberOfHouseholdsType;
import jp.go.kantei.iur._1_3.urg.OfficesAndEmployeesType;
import jp.go.kantei.iur._1_3.urg.PopulationByAgeAndSexPropertyType;
import jp.go.kantei.iur._1_3.urg.PopulationByAgeAndSexType;
import jp.go.kantei.iur._1_3.urg.PopulationType;
import jp.go.kantei.iur._1_3.urg.PublicTransportationAccessibilityType;
import jp.go.kantei.iur._1_3.urg.StatisticalGridType;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.LandPrice;
import org.citygml4j.ade.iur.model.urg.LandPricePerLandUse;
import org.citygml4j.ade.iur.model.urg.LandPricePerLandUseProperty;
import org.citygml4j.ade.iur.model.urg.LandUseDiversion;
import org.citygml4j.ade.iur.model.urg.NumberOfAnnualDiversions;
import org.citygml4j.ade.iur.model.urg.NumberOfAnnualDiversionsProperty;
import org.citygml4j.ade.iur.model.urg.NumberOfHouseholds;
import org.citygml4j.ade.iur.model.urg.NumberOfHouseholdsProperty;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PopulationByAgeAndSex;
import org.citygml4j.ade.iur.model.urg.PopulationByAgeAndSexProperty;
import org.citygml4j.ade.iur.model.urg.PublicTransportationAccessibility;
import org.citygml4j.ade.iur.model.urg.StatisticalGrid;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBElement;
import java.time.LocalDate;
import java.time.Year;

public class StatisticalGridUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(HouseholdsType.class, this::unmarshalHouseholds)
                    .with(LandPriceType.class, this::unmarshalLandPrice)
                    .with(LandPricePerLandUseType.class, this::unmarshalLandPricePerLandUse)
                    .with(LandPricePerLandUsePropertyType.class, this::unmarshalLandPricePerLandUseProperty)
                    .with(LandUseDiversionType.class, this::unmarshalLandUseDiversion)
                    .with(NumberOfAnnualDiversionsType.class, this::unmarshalNumberOfAnnualDiversions)
                    .with(NumberOfAnnualDiversionsPropertyType.class, this::unmarshalNumberOfAnnualDiversionsProperty)
                    .with(NumberOfHouseholdsType.class, this::unmarshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsPropertyType.class, this::unmarshalNumberOfHouseholdsProperty)
                    .with(OfficesAndEmployeesType.class, this::unmarshalOfficesAndEmployees)
                    .with(PopulationType.class, this::unmarshalPopulation)
                    .with(PopulationByAgeAndSexType.class, this::unmarshalPopulationByAgeAndSex)
                    .with(PopulationByAgeAndSexPropertyType.class, this::unmarshalPopulationByAgeAndSexProperty)
                    .with(PublicTransportationAccessibilityType.class, this::unmarshalPublicTransportationAccessibility);
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

    private void unmarshalStatisticalGrid(StatisticalGridType src, StatisticalGrid dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetValue()) {
            for (Object value : src.getValue()) {
                if (value instanceof Element)
                    dest.getValues().add((Element) value);
            }
        }

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        if (src.isSetLod1MultiSurfaceGeometry())
            dest.setLod1MultiSurfaceGeometry(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod1MultiSurfaceGeometry()));

        if (src.isSetLod2MultiSurfaceGeometry())
            dest.setLod2MultiSurfaceGeometry(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod2MultiSurfaceGeometry()));
    }

    private Households unmarshalHouseholds(HouseholdsType src) throws MissingADESchemaException {
        Households dest = new Households();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetNumberOfOrdinaryHousehold())
            dest.setNumberOfOrdinaryHouseholds(src.getNumberOfOrdinaryHousehold().intValue());

        if (src.isSetNumberOfHouseholdsByOwnership()) {
            for (NumberOfHouseholdsPropertyType property : src.getNumberOfHouseholdsByOwnership())
                dest.getNumberOfHouseholdsByOwnership().add(unmarshalNumberOfHouseholdsProperty(property));
        }

        if (src.isSetNumberOfHouseholdsByStructure()) {
            for (NumberOfHouseholdsPropertyType property : src.getNumberOfHouseholdsByStructure())
                dest.getNumberOfHouseholdsByStructure().add(unmarshalNumberOfHouseholdsProperty(property));
        }

        if (src.isSetNumberOfMainHousehold())
            dest.setNumberOfMainHouseholds(src.getNumberOfMainHousehold().intValue());

        return dest;
    }

    private LandPrice unmarshalLandPrice(LandPriceType src) throws MissingADESchemaException {
        LandPrice dest = new LandPrice();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetLandPrice()) {
            for (LandPricePerLandUsePropertyType property : src.getLandPrice())
                dest.getLandPrices().add(unmarshalLandPricePerLandUseProperty(property));
        }

        return dest;
    }

    private LandPricePerLandUse unmarshalLandPricePerLandUse(LandPricePerLandUseType src) throws MissingADESchemaException {
        LandPricePerLandUse dest = new LandPricePerLandUse();

        if (src.isSetLandUse())
            dest.setLandUse(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUse()));

        if (src.isSetLandPrice())
            dest.setLandPrice(src.getLandPrice().intValue());

        if (src.isSetCurrencyUnit())
            dest.setCurrencyUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getCurrencyUnit()));

        return dest;
    }

    private LandPricePerLandUseProperty unmarshalLandPricePerLandUseProperty(LandPricePerLandUsePropertyType src) throws MissingADESchemaException {
        LandPricePerLandUseProperty dest = new LandPricePerLandUseProperty();

        if (src.isSetLandPricePerLandUse())
            dest.setObject(unmarshalLandPricePerLandUse(src.getLandPricePerLandUse()));

        return dest;
    }

    private LandUseDiversion unmarshalLandUseDiversion(LandUseDiversionType src) throws MissingADESchemaException {
        LandUseDiversion dest = new LandUseDiversion();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetNumberOfAnnualDiversion()) {
            for (NumberOfAnnualDiversionsPropertyType property : src.getNumberOfAnnualDiversion())
                dest.getNumberOfAnnualDiversions().add(unmarshalNumberOfAnnualDiversionsProperty(property));
        }

        return dest;
    }

    private NumberOfAnnualDiversions unmarshalNumberOfAnnualDiversions(NumberOfAnnualDiversionsType src) throws MissingADESchemaException {
        NumberOfAnnualDiversions dest = new NumberOfAnnualDiversions();

        if (src.isSetYear()) {
            LocalDate date = src.getYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setYear(Year.of(date.getYear()));
        }

        if (src.isSetCount())
            dest.setCount(src.getCount().intValue());

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        return dest;
    }

    private NumberOfAnnualDiversionsProperty unmarshalNumberOfAnnualDiversionsProperty(NumberOfAnnualDiversionsPropertyType src) throws MissingADESchemaException {
        NumberOfAnnualDiversionsProperty dest = new NumberOfAnnualDiversionsProperty();

        if (src.isSetNumberOfAnnualDiversions())
            dest.setObject(unmarshalNumberOfAnnualDiversions(src.getNumberOfAnnualDiversions()));

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

    private OfficesAndEmployees unmarshalOfficesAndEmployees(OfficesAndEmployeesType src) throws MissingADESchemaException {
        OfficesAndEmployees dest = new OfficesAndEmployees();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetNumberOfOffices())
            dest.setNumberOfOffices(src.getNumberOfOffices().intValue());

        if (src.isSetNumberOfEmployees())
            dest.setNumberOfEmployees(src.getNumberOfEmployees().intValue());

        return dest;
    }

    private Population unmarshalPopulation(PopulationType src) throws MissingADESchemaException {
        Population dest = new Population();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetTotal())
            dest.setTotal(src.getTotal().intValue());

        if (src.isSetDaytimePopulation())
            dest.setDaytimePopulation(src.getDaytimePopulation().intValue());

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.isSetNaturalIncrease())
            dest.setNaturalIncrease(src.getNaturalIncrease().intValue());

        if (src.isSetBirths())
            dest.setBirths(src.getBirths().intValue());

        if (src.isSetDeaths())
            dest.setDeaths(src.getDeaths().intValue());

        if (src.isSetSocialIncrease())
            dest.setSocialIncrease(src.getSocialIncrease().intValue());

        if (src.isSetMoveFrom())
            dest.setMoveFrom(src.getMoveFrom().intValue());

        if (src.isSetMoveTo())
            dest.setMoveTo(src.getMoveTo().intValue());

        if (src.isSetIncreasement())
            dest.setIncreasement(src.getIncreasement().intValue());

        if (src.isSetMalePopulation())
            dest.setMalePopulation(src.getMalePopulation().intValue());

        if (src.isSetFemalePopulation())
            dest.setFemalePopulation(src.getFemalePopulation().intValue());

        if (src.isSetPopulationByAgeAndSex()) {
            for (PopulationByAgeAndSexPropertyType property : src.getPopulationByAgeAndSex())
                dest.getPopulationByAgeAndSex().add(unmarshalPopulationByAgeAndSexProperty(property));
        }

        return dest;
    }

    private PopulationByAgeAndSex unmarshalPopulationByAgeAndSex(PopulationByAgeAndSexType src) throws MissingADESchemaException {
        PopulationByAgeAndSex dest = new PopulationByAgeAndSex();

        if (src.isSetAge())
            dest.setAge(helper.getGMLUnmarshaller().unmarshalCode(src.getAge()));

        if (src.isSetSex())
            dest.setSex(helper.getGMLUnmarshaller().unmarshalCode(src.getSex()));

        if (src.isSetNumber())
            dest.setNumber(src.getNumber().intValue());

        return dest;
    }

    private PopulationByAgeAndSexProperty unmarshalPopulationByAgeAndSexProperty(PopulationByAgeAndSexPropertyType src) throws MissingADESchemaException {
        PopulationByAgeAndSexProperty dest = new PopulationByAgeAndSexProperty();

        if (src.isSetPopulationByAgeAndSex())
            dest.setObject(unmarshalPopulationByAgeAndSex(src.getPopulationByAgeAndSex()));

        return dest;
    }

    private PublicTransportationAccessibility unmarshalPublicTransportationAccessibility(PublicTransportationAccessibilityType src) throws MissingADESchemaException {
        PublicTransportationAccessibility dest = new PublicTransportationAccessibility();
        unmarshalStatisticalGrid(src, dest);

        dest.setAvailability(src.isAvailability());

        return dest;
    }
}
