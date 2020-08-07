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

import jp.go.kantei.iur._1_3.urg.HouseholdsType;
import jp.go.kantei.iur._1_3.urg.LandPricePerLandUsePropertyType;
import jp.go.kantei.iur._1_3.urg.LandPricePerLandUseType;
import jp.go.kantei.iur._1_3.urg.LandPriceType;
import jp.go.kantei.iur._1_3.urg.LandUseDiversionType;
import jp.go.kantei.iur._1_3.urg.NumberOfAnnualDiversionsPropertyType;
import jp.go.kantei.iur._1_3.urg.NumberOfAnnualDiversionsType;
import jp.go.kantei.iur._1_3.urg.NumberOfHouseholdsPropertyType;
import jp.go.kantei.iur._1_3.urg.NumberOfHouseholdsType;
import jp.go.kantei.iur._1_3.urg.ObjectFactory;
import jp.go.kantei.iur._1_3.urg.OfficesAndEmployeesType;
import jp.go.kantei.iur._1_3.urg.PopulationByAgeAndSexPropertyType;
import jp.go.kantei.iur._1_3.urg.PopulationByAgeAndSexType;
import jp.go.kantei.iur._1_3.urg.PopulationType;
import jp.go.kantei.iur._1_3.urg.PublicTransportationAccessibilityType;
import jp.go.kantei.iur._1_3.urg.StatisticalGridType;
import org.citygml4j.ade.iur.bind.Marshaller;
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
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBElement;
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
                    .with(NumberOfHouseholds.class, this::createNumberOfHouseholds)
                    .with(OfficesAndEmployees.class, this::createOfficesAndEmployees)
                    .with(Population.class, this::createPopulation)
                    .with(PopulationByAgeAndSex.class, this::createPopulationByAgeAndSex)
                    .with(PublicTransportationAccessibility.class, this::createPublicTransportationAccessibility);
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
                    .with(NumberOfHouseholds.class, this::marshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsProperty.class, this::marshalNumberOfHouseholdsProperty)
                    .with(OfficesAndEmployees.class, this::marshalOfficesAndEmployees)
                    .with(Population.class, this::marshalPopulation)
                    .with(PopulationByAgeAndSex.class, this::marshalPopulationByAgeAndSex)
                    .with(PopulationByAgeAndSexProperty.class, this::marshalPopulationByAgeAndSexProperty)
                    .with(PublicTransportationAccessibility.class, this::marshalPublicTransportationAccessibility);
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

        if (src.getLod1MultiSurfaceGeometry() != null)
            dest.setLod1MultiSurfaceGeometry(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod1MultiSurfaceGeometry()));

        if (src.getLod2MultiSurfaceGeometry() != null)
            dest.setLod2MultiSurfaceGeometry(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod2MultiSurfaceGeometry()));
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

        return dest;
    }

    private LandPricePerLandUseType marshalLandPricePerLandUse(LandPricePerLandUse src) {
        LandPricePerLandUseType dest = factory.createLandPricePerLandUseType();

        if (src.getLandUse() != null)
            dest.setLandUse(helper.getGMLMarshaller().marshalCode(src.getLandUse()));

        if (src.getLandPrice() != null)
            dest.setLandPrice(BigInteger.valueOf(src.getLandPrice()));

        if (src.getCurrencyUnit() != null)
            dest.setCurrencyUnit(helper.getGMLMarshaller().marshalCode(src.getCurrencyUnit()));

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

        return dest;
    }

    private NumberOfAnnualDiversionsType marshalNumberOfAnnualDiversions(NumberOfAnnualDiversions src) {
        NumberOfAnnualDiversionsType dest = factory.createNumberOfAnnualDiversionsType();

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        if (src.getCount() != null)
            dest.setCount(BigInteger.valueOf(src.getCount()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        return dest;
    }

    private NumberOfAnnualDiversionsPropertyType marshalNumberOfAnnualDiversionsProperty(NumberOfAnnualDiversionsProperty src) {
        NumberOfAnnualDiversionsPropertyType dest = factory.createNumberOfAnnualDiversionsPropertyType();

        if (src.isSetObject())
            dest.setNumberOfAnnualDiversions(marshalNumberOfAnnualDiversions(src.getObject()));

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

        if (src.getAge() != null)
            dest.setAge(helper.getGMLMarshaller().marshalCode(src.getAge()));

        if (src.getSex() != null)
            dest.setSex(helper.getGMLMarshaller().marshalCode(src.getSex()));

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

    private PublicTransportationAccessibilityType marshalPublicTransportationAccessibility(PublicTransportationAccessibility src) {
        PublicTransportationAccessibilityType dest = factory.createPublicTransportationAccessibilityType();
        marshalStatisticalGrid(src, dest);

        dest.setAvailability(src.getAvailability());

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

    private JAXBElement<?> createPublicTransportationAccessibility(PublicTransportationAccessibility src) {
        return factory.createPublicTransportationAccessibility(marshalPublicTransportationAccessibility(src));
    }
}
