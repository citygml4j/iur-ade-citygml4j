/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2020 virtualcitySYSTEMS GmbH
 * https://www.virtualcitysystems.de/
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
import jp.go.kantei.iur._1_4.urg.ObjectFactory;
import jp.go.kantei.iur._1_4.urg.OfficesAndEmployeesType;
import jp.go.kantei.iur._1_4.urg.PopulationByAgeAndSexPropertyType;
import jp.go.kantei.iur._1_4.urg.PopulationByAgeAndSexType;
import jp.go.kantei.iur._1_4.urg.PopulationType;
import jp.go.kantei.iur._1_4.urg.PublicTransitAccessibilityType;
import jp.go.kantei.iur._1_4.urg.StatisticalGridType;
import org.citygml4j.ade.iur.bind.Marshaller;
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
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import java.math.BigInteger;

public class StatisticalGridMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public StatisticalGridMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(Households.class, this::createHouseholds)
                    .with(LandPrice.class, this::createLandPrice)
                    .with(LandPricePerLandUse.class, this::createLandPricePerLandUse)
                    .with(LandUseDiversion.class, this::createLandUseDiversion)
                    .with(NumberOfAnnualDiversions.class, this::createNumberOfAnnualDiversions)
                    .with(AreaOfAnnualDiversions.class, this::createAreaOfAnnualDiversions)
                    .with(NumberOfHouseholds.class, this::createNumberOfHouseholds)
                    .with(OfficesAndEmployees.class, this::createOfficesAndEmployees)
                    .with(Population.class, this::createPopulation)
                    .with(PopulationByAgeAndSex.class, this::createPopulationByAgeAndSex)
                    .with(PublicTransitAccessibility.class, this::createPublicTransitAccessibility)
                    .with(GenericGridCell.class, this::createGenericGridCell)
                    .with(KeyValuePair.class, this::createKeyValuePair)
                    .with(FiscalYearOfPublicationProperty.class, this::createFiscalYearOfPublicationProperty)
                    .with(LanguageProperty.class, this::createLanguageProperty);;
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Households.class, this::marshalHouseholds)
                    .with(LandPrice.class, this::marshalLandPrice)
                    .with(LandPricePerLandUse.class, this::marshalLandPricePerLandUse)
                    .with(LandPricePerLandUseProperty.class, this::marshalLandPricePerLandUseProperty)
                    .with(LandUseDiversion.class, this::marshalLandUseDiversion)
                    .with(NumberOfAnnualDiversions.class, this::marshalNumberOfAnnualDiversions)
                    .with(NumberOfAnnualDiversionsProperty.class, this::marshalNumberOfAnnualDiversionsProperty)
                    .with(AreaOfAnnualDiversions.class, this::marshalAreaOfAnnualDiversions)
                    .with(AreaOfAnnualDiversionsProperty.class, this::marshalAreaOfAnnualDiversionsProperty)
                    .with(NumberOfHouseholds.class, this::marshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsProperty.class, this::marshalNumberOfHouseholdsProperty)
                    .with(OfficesAndEmployees.class, this::marshalOfficesAndEmployees)
                    .with(Population.class, this::marshalPopulation)
                    .with(PopulationByAgeAndSex.class, this::marshalPopulationByAgeAndSex)
                    .with(PopulationByAgeAndSexProperty.class, this::marshalPopulationByAgeAndSexProperty)
                    .with(PublicTransitAccessibility.class, this::marshalPublicTransitAccessibility)
                    .with(GenericGridCell.class, this::marshalGenericGridCell)
                    .with(KeyValuePair.class, this::marshalKeyValuePair)
                    .with(KeyValuePairProperty.class, this::marshalKeyValuePairProperty);
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

    private void marshalStatisticalGrid(StatisticalGrid src, StatisticalGridType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        for (Element value : src.getValues())
            dest.getValue().add(value);

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        if (src.getLod1MultiSurface() != null)
            dest.setLod1MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod1MultiSurface()));

        if (src.getLod2MultiSurface() != null)
            dest.setLod2MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod2MultiSurface()));
    }

    private HouseholdsType marshalHouseholds(Households src) {
        HouseholdsType dest = factory.createHouseholdsType();
        marshalStatisticalGrid(src, dest);

        if (src.getNumberOfOrdinaryHouseholds() != null)
            dest.setNumberOfOrdinaryHousehold(BigInteger.valueOf(src.getNumberOfOrdinaryHouseholds()));

        for (NumberOfHouseholdsProperty property : src.getNumberOfHouseholdsByOwnership()) {
            dest.getNumberOfHouseholdsByOwnership().add(marshalNumberOfHouseholdsProperty(property));
        }

        for (NumberOfHouseholdsProperty property : src.getNumberOfHouseholdsByStructure())
            dest.getNumberOfHouseholdsByStructure().add(marshalNumberOfHouseholdsProperty(property));

        if (src.getNumberOfMainHouseholds() != null)
            dest.setNumberOfMainHousehold(BigInteger.valueOf(src.getNumberOfMainHouseholds()));

        return dest;
    }

    private LandPriceType marshalLandPrice(LandPrice src) {
        LandPriceType dest = factory.createLandPriceType();
        marshalStatisticalGrid(src, dest);

        for (LandPricePerLandUseProperty property : src.getLandPrices())
            dest.getLandPrice().add(marshalLandPricePerLandUseProperty(property));

        if (src.getCurrencyUnit() != null)
            dest.setCurrencyUnit(helper.getGMLMarshaller().marshalCode(src.getCurrencyUnit()));

        return dest;
    }

    private LandPricePerLandUseType marshalLandPricePerLandUse(LandPricePerLandUse src) {
        LandPricePerLandUseType dest = factory.createLandPricePerLandUseType();

        if (src.getLandUse() != null)
            dest.setLandUse(helper.getGMLMarshaller().marshalCode(src.getLandUse()));

        if (src.getLandPrice() != null)
            dest.setLandPrice(BigInteger.valueOf(src.getLandPrice()));

        return dest;
    }

    private LandPricePerLandUsePropertyType marshalLandPricePerLandUseProperty(LandPricePerLandUseProperty src) {
        LandPricePerLandUsePropertyType dest = factory.createLandPricePerLandUsePropertyType();

        if (src.isSetObject())
            dest.setLandPricePerLandUse(marshalLandPricePerLandUse(src.getObject()));

        return dest;
    }

    private LandUseDiversionType marshalLandUseDiversion(LandUseDiversion src) {
        LandUseDiversionType dest = factory.createLandUseDiversionType();
        marshalStatisticalGrid(src, dest);

        for (NumberOfAnnualDiversionsProperty property : src.getNumberOfAnnualDiversions())
            dest.getNumberOfAnnualDiversion().add(marshalNumberOfAnnualDiversionsProperty(property));

        for (AreaOfAnnualDiversionsProperty property : src.getAreaOfAnnualDiversions())
            dest.getAreaOfAnnualDiversion().add(marshalAreaOfAnnualDiversionsProperty(property));

        return dest;
    }

    private NumberOfAnnualDiversionsType marshalNumberOfAnnualDiversions(NumberOfAnnualDiversions src) {
        NumberOfAnnualDiversionsType dest = factory.createNumberOfAnnualDiversionsType();

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        if (src.getCount() != null)
            dest.setCount(BigInteger.valueOf(src.getCount()));

        return dest;
    }

    private NumberOfAnnualDiversionsPropertyType marshalNumberOfAnnualDiversionsProperty(NumberOfAnnualDiversionsProperty src) {
        NumberOfAnnualDiversionsPropertyType dest = factory.createNumberOfAnnualDiversionsPropertyType();

        if (src.isSetObject())
            dest.setNumberOfAnnualDiversions(marshalNumberOfAnnualDiversions(src.getObject()));

        return dest;
    }

    private AreaOfAnnualDiversionsType marshalAreaOfAnnualDiversions(AreaOfAnnualDiversions src) {
        AreaOfAnnualDiversionsType dest = factory.createAreaOfAnnualDiversionsType();

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        return dest;
    }

    private AreaOfAnnualDiversionsPropertyType marshalAreaOfAnnualDiversionsProperty(AreaOfAnnualDiversionsProperty src) {
        AreaOfAnnualDiversionsPropertyType dest = factory.createAreaOfAnnualDiversionsPropertyType();

        if (src.isSetObject())
            dest.setAreaOfAnnualDiversions(marshalAreaOfAnnualDiversions(src.getObject()));

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

    private OfficesAndEmployeesType marshalOfficesAndEmployees(OfficesAndEmployees src) {
        OfficesAndEmployeesType dest = factory.createOfficesAndEmployeesType();
        marshalStatisticalGrid(src, dest);

        if (src.getNumberOfOffices() != null)
            dest.setNumberOfOffices(BigInteger.valueOf(src.getNumberOfOffices()));

        if (src.getNumberOfEmployees() != null)
            dest.setNumberOfEmployees(BigInteger.valueOf(src.getNumberOfEmployees()));

        return dest;
    }

    private PopulationType marshalPopulation(Population src) {
        PopulationType dest = factory.createPopulationType();
        marshalStatisticalGrid(src, dest);

        if (src.getTotal() != null)
            dest.setTotal(BigInteger.valueOf(src.getTotal()));

        if (src.getDaytimePopulation() != null)
            dest.setDaytimePopulation(BigInteger.valueOf(src.getDaytimePopulation()));

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.getNaturalIncrease() != null)
            dest.setNaturalIncrease(BigInteger.valueOf(src.getNaturalIncrease()));

        if (src.getBirths() != null)
            dest.setBirths(BigInteger.valueOf(src.getBirths()));

        if (src.getDeaths() != null)
            dest.setDeaths(BigInteger.valueOf(src.getDeaths()));

        if (src.getSocialIncrease() != null)
            dest.setSocialIncrease(BigInteger.valueOf(src.getSocialIncrease()));

        if (src.getMoveFrom() != null)
            dest.setMoveFrom(BigInteger.valueOf(src.getMoveFrom()));

        if (src.getMoveTo() != null)
            dest.setMoveTo(BigInteger.valueOf(src.getMoveTo()));

        if (src.getIncreasement() != null)
            dest.setIncreasement(BigInteger.valueOf(src.getIncreasement()));

        if (src.getMalePopulation() != null)
            dest.setMalePopulation(BigInteger.valueOf(src.getMalePopulation()));

        if (src.getFemalePopulation() != null)
            dest.setFemalePopulation(BigInteger.valueOf(src.getFemalePopulation()));

        for (PopulationByAgeAndSexProperty property : src.getPopulationByAgeAndSex())
            dest.getPopulationByAgeAndSex().add(marshalPopulationByAgeAndSexProperty(property));

        return dest;
    }

    private PopulationByAgeAndSexType marshalPopulationByAgeAndSex(PopulationByAgeAndSex src) {
        PopulationByAgeAndSexType dest = factory.createPopulationByAgeAndSexType();

        if (src.getAgeAndSex() != null)
            dest.setAgeAndSex(helper.getGMLMarshaller().marshalCode(src.getAgeAndSex()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private PopulationByAgeAndSexPropertyType marshalPopulationByAgeAndSexProperty(PopulationByAgeAndSexProperty src) {
        PopulationByAgeAndSexPropertyType dest = factory.createPopulationByAgeAndSexPropertyType();

        if (src.isSetObject())
            dest.setPopulationByAgeAndSex(marshalPopulationByAgeAndSex(src.getObject()));

        return dest;
    }

    private PublicTransitAccessibilityType marshalPublicTransitAccessibility(PublicTransitAccessibility src) {
        PublicTransitAccessibilityType dest = factory.createPublicTransitAccessibilityType();
        marshalStatisticalGrid(src, dest);

        dest.setAvailability(src.getAvailability());

        return dest;
    }

    private GenericGridCellType marshalGenericGridCell(GenericGridCell src) {
        GenericGridCellType dest = factory.createGenericGridCellType();
        marshalStatisticalGrid(src, dest);

        for (KeyValuePairProperty property : src.getGenericValues())
            dest.getGenericValue().add(marshalKeyValuePairProperty(property));

        return dest;
    }

    private KeyValuePairType marshalKeyValuePair(KeyValuePair src) {
        KeyValuePairType dest = factory.createKeyValuePairType();

        if (src.getKey() != null)
            dest.setKey(helper.getGMLMarshaller().marshalCode(src.getKey()));

        if (src.isSetStringValue())
            dest.setStringValue(src.getStringValue());
        else if (src.isSetIntValue())
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));
        else if (src.isSetDoubleValue())
            dest.setDoubleValue(src.getDoubleValue());
        else if (src.isSetCodeValue())
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));
        else if (src.isSetMeasuredValue())
            dest.setMeasuredValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasuredValue()));
        else if (src.isSetDateValue())
            dest.setDateValue(marshaller.toCalendar(src.getDateValue()));
        else if (src.isSetUriValue())
            dest.setUriValue(src.getUriValue());

        return dest;
    }

    private KeyValuePairPropertyType marshalKeyValuePairProperty(KeyValuePairProperty src) {
        KeyValuePairPropertyType dest = factory.createKeyValuePairPropertyType();

        if (src.isSetObject())
            dest.setKeyValuePair(marshalKeyValuePair(src.getObject()));

        return dest;
    }

    private JAXBElement<?> createHouseholds(Households src) {
        return factory.createHouseholds(marshalHouseholds(src));
    }

    private JAXBElement<?> createLandPrice(LandPrice src) {
        return factory.createLandPrice(marshalLandPrice(src));
    }

    private JAXBElement<?> createLandPricePerLandUse(LandPricePerLandUse src) {
        return factory.createLandPricePerLandUse(marshalLandPricePerLandUse(src));
    }

    private JAXBElement<?> createLandUseDiversion(LandUseDiversion src) {
        return factory.createLandUseDiversion(marshalLandUseDiversion(src));
    }

    private JAXBElement<?> createNumberOfAnnualDiversions(NumberOfAnnualDiversions src) {
        return factory.createNumberOfAnnualDiversions(marshalNumberOfAnnualDiversions(src));
    }

    private JAXBElement<?> createAreaOfAnnualDiversions(AreaOfAnnualDiversions src) {
        return factory.createAreaOfAnnualDiversions(marshalAreaOfAnnualDiversions(src));
    }

    private JAXBElement<?> createNumberOfHouseholds(NumberOfHouseholds src) {
        return factory.createNumberOfHouseholds(marshalNumberOfHouseholds(src));
    }

    private JAXBElement<?> createOfficesAndEmployees(OfficesAndEmployees src) {
        return factory.createOfficesAndEmployees(marshalOfficesAndEmployees(src));
    }

    private JAXBElement<?> createPopulation(Population src) {
        return factory.createPopulation(marshalPopulation(src));
    }

    private JAXBElement<?> createPopulationByAgeAndSex(PopulationByAgeAndSex src) {
        return factory.createPopulationByAgeAndSex(marshalPopulationByAgeAndSex(src));
    }

    private JAXBElement<?> createPublicTransitAccessibility(PublicTransitAccessibility src) {
        return factory.createPublicTransitAccessibility(marshalPublicTransitAccessibility(src));
    }

    private JAXBElement<?> createGenericGridCell(GenericGridCell src) {
        return factory.createGenericGridCell(marshalGenericGridCell(src));
    }

    private JAXBElement<?> createKeyValuePair(KeyValuePair src) {
        return factory.createKeyValuePair(marshalKeyValuePair(src));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarDate(src.getValue().getValue(),
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
