/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Virtual City Systems
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

package org.citygml4j.ade.iur.bind.uro;

import jp.go.kantei.iur._1_4.uro.*;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.uro.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import java.math.BigInteger;

public class UrbanObjectMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public UrbanObjectMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(BuildingDetails.class, this::createBuildingDetails)
                    .with(BuildingDetailsPropertyElement.class, this::createBuildingDetailsPropertyElement)
                    .with(LargeCustomerFacilities.class, this::createLargeCustomerFacilities)
                    .with(LargeCustomerFacilitiesPropertyElement.class, this::createLargeCustomerFacilitiesPropertyElement)
                    .with(KeyValuePair.class, this::createKeyValuePair)
                    .with(ExtendedAttributeProperty.class, this::createExtendedAttribute)
                    .with(NominalAreaProperty.class, this::createNominalAreaProperty)
                    .with(OwnerTypeProperty.class, this::createOwnerTypeProperty)
                    .with(OwnerProperty.class, this::createOwnerProperty)
                    .with(AreaInSquareMeterProperty.class, this::createAreaInSquareMeterProperty)
                    .with(AreaInHaProperty.class, this::createAreaInHaProperty)
                    .with(UrbanPlanTypeProperty.class, this::createUrbanPlanTypeProperty)
                    .with(DistrictsAndZonesTypeProperty.class, this::createDistrictsAndZonesTypeProperty)
                    .with(LandUsePlanTypeProperty.class, this::createLandUsePlanTypeProperty)
                    .with(AreaClassificationTypeProperty.class, this::createAreaClassificationTypeProperty)
                    .with(PrefectureProperty.class, this::createPrefectureProperty)
                    .with(CityProperty.class, this::createCityProperty)
                    .with(ReferenceProperty.class, this::createReferenceProperty)
                    .with(NoteProperty.class, this::createNoteProperty)
                    .with(SurveyYearProperty.class, this::createSurveyYearProperty)
                    .with(WidthProperty.class, this::createWidthProperty)
                    .with(WidthTypeProperty.class, this::createWidthTypeProperty)
                    .with(TrafficVolume.class, this::createTrafficVolume)
                    .with(TrafficVolumePropertyElement.class, this::createTrafficVolumePropertyElement)
                    .with(FiscalYearOfPublicationProperty.class, this::createFiscalYearOfPublicationProperty)
                    .with(LanguageProperty.class, this::createLanguageProperty);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(BuildingDetails.class, this::marshalBuildingDetails)
                    .with(BuildingDetailsProperty.class, this::marshalBuildingDetailsProperty)
                    .with(LargeCustomerFacilities.class, this::marshalLargeCustomerFacilities)
                    .with(LargeCustomerFacilitiesProperty.class, this::marshalLargeCustomerFacilitiesProperty)
                    .with(KeyValuePair.class, this::marshalKeyValuePair)
                    .with(KeyValuePairProperty.class, this::marshalKeyValuePairProperty)
                    .with(TrafficVolume.class, this::marshalTrafficVolume)
                    .with(TrafficVolumeProperty.class, this::marshalTrafficVolumeProperty);
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

    private BuildingDetailsType marshalBuildingDetails(BuildingDetails src) {
        BuildingDetailsType dest = factory.createBuildingDetailsType();

        dest.setSerialNumberOfBuildingCertification(src.getSerialNumberOfBuildingCertification());

        if (src.getSiteArea() != null)
            dest.setSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getSiteArea()));

        if (src.getBuildingFootprintArea() != null)
            dest.setBuildingFootprintArea(helper.getGMLMarshaller().marshalMeasure(src.getBuildingFootprintArea()));

        if (src.getBuildingRoofEdgeArea() != null)
            dest.setBuildingRoofEdgeArea(helper.getGMLMarshaller().marshalMeasure(src.getBuildingRoofEdgeArea()));

        if (src.getDevelopmentArea() != null)
            dest.setDevelopmentArea(helper.getGMLMarshaller().marshalMeasure(src.getDevelopmentArea()));

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getBuildingStructureType() != null)
            dest.setBuildingStructureType(helper.getGMLMarshaller().marshalCode(src.getBuildingStructureType()));

        if (src.getFireproofStructureType() != null)
            dest.setFireproofStructureType(helper.getGMLMarshaller().marshalCode(src.getFireproofStructureType()));

        dest.setImplementingBody(src.getImplementingBody());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getDistrictsAndZonesType() != null)
            dest.setDistrictsAndZonesType(helper.getGMLMarshaller().marshalCode(src.getDistrictsAndZonesType()));

        if (src.getLandUsePlanType() != null)
            dest.setLandUsePlanType(helper.getGMLMarshaller().marshalCode(src.getLandUsePlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        dest.setReference(src.getReference());

        if (src.getNote() != null)
            dest.setNote(src.getNote());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        return dest;
    }

    private BuildingDetailsPropertyType marshalBuildingDetailsProperty(BuildingDetailsProperty src) {
        BuildingDetailsPropertyType dest = factory.createBuildingDetailsPropertyType();

        if (src.isSetObject())
            dest.setBuildingDetails(marshalBuildingDetails(src.getObject()));

        return dest;
    }

    private LargeCustomerFacilitiesType marshalLargeCustomerFacilities(LargeCustomerFacilities src) {
        LargeCustomerFacilitiesType dest = factory.createLargeCustomerFacilitiesType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        dest.setName(src.getName());

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        dest.setOwner(src.getOwner());

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getTotalStoreFloorArea() != null)
            dest.setTotalStoreFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalStoreFloorArea()));

        if (src.getInauguralDate() != null)
            dest.setInauguralDate(marshaller.toCalendar(src.getInauguralDate()));

        dest.setKeyTenants(src.getKeyTenants());
        dest.setAvailability(src.getAvailability());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getDistrictsAndZonesType() != null)
            dest.setDistrictsAndZonesType(helper.getGMLMarshaller().marshalCode(src.getDistrictsAndZonesType()));

        if (src.getLandUsePlanType() != null)
            dest.setLandUsePlanType(helper.getGMLMarshaller().marshalCode(src.getLandUsePlanType()));

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

        return dest;
    }

    private LargeCustomerFacilitiesPropertyType marshalLargeCustomerFacilitiesProperty(LargeCustomerFacilitiesProperty src) {
        LargeCustomerFacilitiesPropertyType dest = factory.createLargeCustomerFacilitiesPropertyType();

        if (src.isSetObject())
            dest.setLargeCustomerFacilities(marshalLargeCustomerFacilities(src.getObject()));

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

    private TrafficVolumeType marshalTrafficVolume(TrafficVolume src) {
        TrafficVolumeType dest = factory.createTrafficVolumeType();

        if (src.getWeekday12hourTrafficVolume() != null)
            dest.setWeekday12HourTrafficVolume(BigInteger.valueOf(src.getWeekday12hourTrafficVolume()));

        if (src.getWeekday24hourTrafficVolume() != null)
            dest.setWeekday24HourTrafficVolume(BigInteger.valueOf(src.getWeekday24hourTrafficVolume()));

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setObservationPointName(src.getObservationPointName());

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

        return dest;
    }

    private TrafficVolumePropertyType marshalTrafficVolumeProperty(TrafficVolumeProperty src) {
        TrafficVolumePropertyType dest = factory.createTrafficVolumePropertyType();

        if (src.isSetObject())
            dest.setTrafficVolume(marshalTrafficVolume(src.getObject()));

        return dest;
    }

    private JAXBElement<?> createBuildingDetails(BuildingDetails src) {
        return factory.createBuildingDetails(marshalBuildingDetails(src));
    }

    private JAXBElement<?> createBuildingDetailsPropertyElement(BuildingDetailsPropertyElement src) {
        return factory.createBuildingDetailsProperty(marshalBuildingDetailsProperty(src.getValue()));
    }

    private JAXBElement<?> createLargeCustomerFacilities(LargeCustomerFacilities src) {
        return factory.createLargeCustomerFacilities(marshalLargeCustomerFacilities(src));
    }

    private JAXBElement<?> createLargeCustomerFacilitiesPropertyElement(LargeCustomerFacilitiesPropertyElement src) {
        return factory.createLargeCustomerFacilitiesProperty(marshalLargeCustomerFacilitiesProperty(src.getValue()));
    }

    private JAXBElement<?> createKeyValuePair(KeyValuePair src) {
        return factory.createKeyValuePair(marshalKeyValuePair(src));
    }

    private JAXBElement<?> createExtendedAttribute(ExtendedAttributeProperty src) {
        return factory.createExtendedAttribute(marshalKeyValuePairProperty(src.getValue()));
    }

    private JAXBElement<?> createNominalAreaProperty(NominalAreaProperty src) {
        return factory.createNominalArea(helper.getGMLMarshaller().marshalMeasure(src.getValue()));
    }

    private JAXBElement<?> createOwnerTypeProperty(OwnerTypeProperty src) {
        return factory.createOwnerType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createOwnerProperty(OwnerProperty src) {
        return factory.createOwner(src.getValue());
    }

    private JAXBElement<?> createAreaInSquareMeterProperty(AreaInSquareMeterProperty src) {
        return factory.createAreaInSquareMeter(helper.getGMLMarshaller().marshalMeasure(src.getValue()));
    }

    private JAXBElement<?> createAreaInHaProperty(AreaInHaProperty src) {
        return factory.createAreaInHa(helper.getGMLMarshaller().marshalMeasure(src.getValue()));
    }

    private JAXBElement<?> createUrbanPlanTypeProperty(UrbanPlanTypeProperty src) {
        return factory.createUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createDistrictsAndZonesTypeProperty(DistrictsAndZonesTypeProperty src) {
        return factory.createDistrictsAndZonesType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createLandUsePlanTypeProperty(LandUsePlanTypeProperty src) {
        return factory.createLandUsePlanType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createAreaClassificationTypeProperty(AreaClassificationTypeProperty src) {
        return factory.createAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createPrefectureProperty(PrefectureProperty src) {
        return factory.createPrefecture(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createCityProperty(CityProperty src) {
        return factory.createCity(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createReferenceProperty(ReferenceProperty src) {
        return factory.createReference(src.getValue());
    }

    private JAXBElement<?> createNoteProperty(NoteProperty src) {
        return factory.createNote(src.getValue());
    }

    private JAXBElement<?> createSurveyYearProperty(SurveyYearProperty src) {
        return factory.createSurveyYear(helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarDate(src.getValue().getValue(),
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED));
    }

    private JAXBElement<?> createWidthProperty(WidthProperty src) {
        return factory.createWidth(helper.getGMLMarshaller().marshalLength(src.getValue()));
    }

    private JAXBElement<?> createWidthTypeProperty(WidthTypeProperty src) {
        return factory.createWidthType(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }

    private JAXBElement<?> createTrafficVolume(TrafficVolume src) {
        return factory.createTrafficVolume(marshalTrafficVolume(src));
    }

    private JAXBElement<?> createTrafficVolumePropertyElement(TrafficVolumePropertyElement src) {
        return factory.createTrafficVolumeProperty(marshalTrafficVolumeProperty(src.getValue()));
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
