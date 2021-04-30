/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Virtual City Systems
 * https://vc.systems/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.iur.bind.urg;

import jp.go.kantei.iur._1_4.urg.AreaOfAnnualDiversionsPropertyType;
import jp.go.kantei.iur._1_4.urg.AreaOfAnnualDiversionsType;
import jp.go.kantei.iur._1_4.urg.GenericGridCellType;
import jp.go.kantei.iur._1_4.urg.HouseholdsType;
import jp.go.kantei.iur._1_4.urg.KeyValuePairPropertyType;
import jp.go.kantei.iur._1_4.urg.KeyValuePairType;
import jp.go.kantei.iur._1_4.urg.LandPricePerLandUsePropertyType;
import jp.go.kantei.iur._1_4.urg.LandPricePerLandUseType;
import jp.go.kantei.iur._1_4.urg.LandPriceType;
import jp.go.kantei.iur._1_4.urg.LandUseDiversionType;
import jp.go.kantei.iur._1_4.urg.NumberOfAnnualDiversionsPropertyType;
import jp.go.kantei.iur._1_4.urg.NumberOfAnnualDiversionsType;
import jp.go.kantei.iur._1_4.urg.NumberOfHouseholdsPropertyType;
import jp.go.kantei.iur._1_4.urg.NumberOfHouseholdsType;
import jp.go.kantei.iur._1_4.urg.OfficesAndEmployeesType;
import jp.go.kantei.iur._1_4.urg.PopulationByAgeAndSexPropertyType;
import jp.go.kantei.iur._1_4.urg.PopulationByAgeAndSexType;
import jp.go.kantei.iur._1_4.urg.PopulationType;
import jp.go.kantei.iur._1_4.urg.PublicTransitAccessibilityType;
import jp.go.kantei.iur._1_4.urg.StatisticalGridType;
import net.opengis.gml.CodeType;
import org.citygml4j.ade.iur.model.urg.AreaOfAnnualDiversions;
import org.citygml4j.ade.iur.model.urg.AreaOfAnnualDiversionsProperty;
import org.citygml4j.ade.iur.model.urg.FiscalYearOfPublicationProperty;
import org.citygml4j.ade.iur.model.urg.GenericGridCell;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.KeyValuePair;
import org.citygml4j.ade.iur.model.urg.KeyValuePairProperty;
import org.citygml4j.ade.iur.model.urg.LandPrice;
import org.citygml4j.ade.iur.model.urg.LandPricePerLandUse;
import org.citygml4j.ade.iur.model.urg.LandPricePerLandUseProperty;
import org.citygml4j.ade.iur.model.urg.LandUseDiversion;
import org.citygml4j.ade.iur.model.urg.LanguageProperty;
import org.citygml4j.ade.iur.model.urg.NumberOfAnnualDiversions;
import org.citygml4j.ade.iur.model.urg.NumberOfAnnualDiversionsProperty;
import org.citygml4j.ade.iur.model.urg.NumberOfHouseholds;
import org.citygml4j.ade.iur.model.urg.NumberOfHouseholdsProperty;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PopulationByAgeAndSex;
import org.citygml4j.ade.iur.model.urg.PopulationByAgeAndSexProperty;
import org.citygml4j.ade.iur.model.urg.PublicTransitAccessibility;
import org.citygml4j.ade.iur.model.urg.StatisticalGrid;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
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
                    .with(AreaOfAnnualDiversionsType.class, this::unmarshalAreaOfAnnualDiversions)
                    .with(AreaOfAnnualDiversionsPropertyType.class, this::unmarshalAreaOfAnnualDiversionsProperty)
                    .with(NumberOfHouseholdsType.class, this::unmarshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsPropertyType.class, this::unmarshalNumberOfHouseholdsProperty)
                    .with(OfficesAndEmployeesType.class, this::unmarshalOfficesAndEmployees)
                    .with(PopulationType.class, this::unmarshalPopulation)
                    .with(PopulationByAgeAndSexType.class, this::unmarshalPopulationByAgeAndSex)
                    .with(PopulationByAgeAndSexPropertyType.class, this::unmarshalPopulationByAgeAndSexProperty)
                    .with(PublicTransitAccessibilityType.class, this::unmarshalPublicTransitAccessibility)
                    .with(GenericGridCellType.class, this::unmarshalGenericGridCell)
                    .with(KeyValuePairType.class, this::unmarshalKeyValuePair)
                    .with(KeyValuePairPropertyType.class, this::unmarshalKeyValuePairProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        // generic application properties
        switch (src.getName().getLocalPart()) {
            case "fiscalYearOfPublication":
                LocalDate fiscalYearOfPublication = ((XMLGregorianCalendar) value).toGregorianCalendar().toZonedDateTime().toLocalDate();
                return new FiscalYearOfPublicationProperty(Year.of(fiscalYearOfPublication.getYear()));
            case "language":
                return new LanguageProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
        }

        // all other types
        return unmarshal(value);
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

        if (src.isSetLod1MultiSurface())
            dest.setLod1MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod1MultiSurface()));

        if (src.isSetLod2MultiSurface())
            dest.setLod2MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod2MultiSurface()));
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

        if (src.isSetCurrencyUnit())
            dest.setCurrencyUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getCurrencyUnit()));

        return dest;
    }

    private LandPricePerLandUse unmarshalLandPricePerLandUse(LandPricePerLandUseType src) throws MissingADESchemaException {
        LandPricePerLandUse dest = new LandPricePerLandUse();

        if (src.isSetLandUse())
            dest.setLandUse(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUse()));

        if (src.isSetLandPrice())
            dest.setLandPrice(src.getLandPrice().intValue());

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

        if (src.isSetAreaOfAnnualDiversion()) {
            for (AreaOfAnnualDiversionsPropertyType property : src.getAreaOfAnnualDiversion())
                dest.getAreaOfAnnualDiversions().add(unmarshalAreaOfAnnualDiversionsProperty(property));
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

        return dest;
    }

    private NumberOfAnnualDiversionsProperty unmarshalNumberOfAnnualDiversionsProperty(NumberOfAnnualDiversionsPropertyType src) throws MissingADESchemaException {
        NumberOfAnnualDiversionsProperty dest = new NumberOfAnnualDiversionsProperty();

        if (src.isSetNumberOfAnnualDiversions())
            dest.setObject(unmarshalNumberOfAnnualDiversions(src.getNumberOfAnnualDiversions()));

        return dest;
    }

    private AreaOfAnnualDiversions unmarshalAreaOfAnnualDiversions(AreaOfAnnualDiversionsType src) throws MissingADESchemaException {
        AreaOfAnnualDiversions dest = new AreaOfAnnualDiversions();

        if (src.isSetYear()) {
            LocalDate date = src.getYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setYear(Year.of(date.getYear()));
        }

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        return dest;
    }

    private AreaOfAnnualDiversionsProperty unmarshalAreaOfAnnualDiversionsProperty(AreaOfAnnualDiversionsPropertyType src) throws MissingADESchemaException {
        AreaOfAnnualDiversionsProperty dest = new AreaOfAnnualDiversionsProperty();

        if (src.isSetAreaOfAnnualDiversions())
            dest.setObject(unmarshalAreaOfAnnualDiversions(src.getAreaOfAnnualDiversions()));

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

        if (src.isSetAgeAndSex())
            dest.setAgeAndSex(helper.getGMLUnmarshaller().unmarshalCode(src.getAgeAndSex()));

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

    private PublicTransitAccessibility unmarshalPublicTransitAccessibility(PublicTransitAccessibilityType src) throws MissingADESchemaException {
        PublicTransitAccessibility dest = new PublicTransitAccessibility();
        unmarshalStatisticalGrid(src, dest);

        dest.setAvailability(src.isAvailability());

        return dest;
    }

    private GenericGridCell unmarshalGenericGridCell(GenericGridCellType src) throws MissingADESchemaException {
        GenericGridCell dest = new GenericGridCell();
        unmarshalStatisticalGrid(src, dest);

        if (src.isSetGenericValue()) {
            for (KeyValuePairPropertyType property : src.getGenericValue())
                dest.getGenericValues().add(unmarshalKeyValuePairProperty(property));
        }

        return dest;
    }

    private KeyValuePair unmarshalKeyValuePair(KeyValuePairType src) throws MissingADESchemaException {
        KeyValuePair dest = new KeyValuePair();

        if (src.isSetKey())
            dest.setKey(helper.getGMLUnmarshaller().unmarshalCode(src.getKey()));

        if (src.isSetStringValue())
            dest.setStringValue(src.getStringValue());
        else if (src.isSetIntValue())
            dest.setIntValue(src.getIntValue().intValue());
        else if (src.isSetDoubleValue())
            dest.setDoubleValue(src.getDoubleValue());
        else if (src.isSetCodeValue())
            dest.setCodeValue(helper.getGMLUnmarshaller().unmarshalCode(src.getCodeValue()));
        else if (src.isSetMeasuredValue())
            dest.setMeasuredValue(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMeasuredValue()));
        else if (src.isSetDateValue())
            dest.setDateValue(src.getDateValue().toGregorianCalendar().toZonedDateTime().toLocalDate());
        else if (src.isSetUriValue())
            dest.setUriValue(src.getUriValue());

        return dest;
    }

    private KeyValuePairProperty unmarshalKeyValuePairProperty(KeyValuePairPropertyType src) throws MissingADESchemaException {
        KeyValuePairProperty dest = new KeyValuePairProperty();

        if (src.isSetKeyValuePair())
            dest.setObject(unmarshalKeyValuePair(src.getKeyValuePair()));

        return dest;
    }
}
