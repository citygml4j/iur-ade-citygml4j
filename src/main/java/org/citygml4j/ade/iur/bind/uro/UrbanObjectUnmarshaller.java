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

package org.citygml4j.ade.iur.bind.uro;

import jp.go.kantei.iur._1_4.uro.BuildingDetailsPropertyType;
import jp.go.kantei.iur._1_4.uro.BuildingDetailsType;
import jp.go.kantei.iur._1_4.uro.KeyValuePairPropertyType;
import jp.go.kantei.iur._1_4.uro.KeyValuePairType;
import jp.go.kantei.iur._1_4.uro.LargeCustomerFacilitiesPropertyType;
import jp.go.kantei.iur._1_4.uro.LargeCustomerFacilitiesType;
import jp.go.kantei.iur._1_4.uro.TrafficVolumePropertyType;
import jp.go.kantei.iur._1_4.uro.TrafficVolumeType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import org.citygml4j.ade.iur.model.uro.AreaClassificationTypeProperty;
import org.citygml4j.ade.iur.model.uro.AreaInHaProperty;
import org.citygml4j.ade.iur.model.uro.AreaInSquareMeterProperty;
import org.citygml4j.ade.iur.model.uro.BuildingDetails;
import org.citygml4j.ade.iur.model.uro.BuildingDetailsProperty;
import org.citygml4j.ade.iur.model.uro.BuildingDetailsPropertyElement;
import org.citygml4j.ade.iur.model.uro.CityProperty;
import org.citygml4j.ade.iur.model.uro.DistrictsAndZonesTypeProperty;
import org.citygml4j.ade.iur.model.uro.ExtendedAttributeProperty;
import org.citygml4j.ade.iur.model.uro.FiscalYearOfPublicationProperty;
import org.citygml4j.ade.iur.model.uro.KeyValuePair;
import org.citygml4j.ade.iur.model.uro.KeyValuePairProperty;
import org.citygml4j.ade.iur.model.uro.LandUsePlanTypeProperty;
import org.citygml4j.ade.iur.model.uro.LanguageProperty;
import org.citygml4j.ade.iur.model.uro.LargeCustomerFacilities;
import org.citygml4j.ade.iur.model.uro.LargeCustomerFacilitiesProperty;
import org.citygml4j.ade.iur.model.uro.LargeCustomerFacilitiesPropertyElement;
import org.citygml4j.ade.iur.model.uro.NominalAreaProperty;
import org.citygml4j.ade.iur.model.uro.NoteProperty;
import org.citygml4j.ade.iur.model.uro.OwnerProperty;
import org.citygml4j.ade.iur.model.uro.OwnerTypeProperty;
import org.citygml4j.ade.iur.model.uro.PrefectureProperty;
import org.citygml4j.ade.iur.model.uro.ReferenceProperty;
import org.citygml4j.ade.iur.model.uro.SurveyYearProperty;
import org.citygml4j.ade.iur.model.uro.TrafficVolume;
import org.citygml4j.ade.iur.model.uro.TrafficVolumeProperty;
import org.citygml4j.ade.iur.model.uro.TrafficVolumePropertyElement;
import org.citygml4j.ade.iur.model.uro.UrbanPlanTypeProperty;
import org.citygml4j.ade.iur.model.uro.WidthProperty;
import org.citygml4j.ade.iur.model.uro.WidthTypeProperty;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.Year;

public class UrbanObjectUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(BuildingDetailsType.class, this::unmarshalBuildingDetails)
                    .with(BuildingDetailsPropertyType.class, this::unmarshalBuildingDetailsProperty)
                    .with(LargeCustomerFacilitiesType.class, this::unmarshalLargeCustomerFacilities)
                    .with(LargeCustomerFacilitiesPropertyType.class, this::unmarshalLargeCustomerFacilitiesProperty)
                    .with(KeyValuePairType.class, this::unmarshalKeyValuePair)
                    .with(KeyValuePairPropertyType.class, this::unmarshalKeyValuePairProperty)
                    .with(TrafficVolumeType.class, this::unmarshalTrafficVolume)
                    .with(TrafficVolumePropertyType.class, this::unmarshalTrafficVolumeProperty);
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
            case "buildingDetails":
                return new BuildingDetailsPropertyElement(unmarshalBuildingDetailsProperty((BuildingDetailsPropertyType) value));
            case "largeCustomerFacilities":
                return new LargeCustomerFacilitiesPropertyElement(unmarshalLargeCustomerFacilitiesProperty((LargeCustomerFacilitiesPropertyType) value));
            case "extendedAttribute":
                return new ExtendedAttributeProperty(unmarshalKeyValuePairProperty((KeyValuePairPropertyType) value));
            case "nominalArea":
                return new NominalAreaProperty(helper.getGMLUnmarshaller().unmarshalMeasure((MeasureType) value));
            case "ownerType":
                return new OwnerTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "owner":
                return new OwnerProperty((String) value);
            case "areaInSquareMeter":
                return new AreaInSquareMeterProperty(helper.getGMLUnmarshaller().unmarshalMeasure((MeasureType) value));
            case "areaInHa":
                return new AreaInHaProperty(helper.getGMLUnmarshaller().unmarshalMeasure((MeasureType) value));
            case "urbanPlanType":
                return new UrbanPlanTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "districtsAndZonesType":
                return new DistrictsAndZonesTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "landUsePlanType":
                return new LandUsePlanTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "areaClassificationType":
                return new AreaClassificationTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "prefecture":
                return new PrefectureProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "city":
                return new CityProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "reference":
                return new ReferenceProperty((String) value);
            case "note":
                return new NoteProperty((String) value);
            case "surveyYear":
                LocalDate surveyYear = ((XMLGregorianCalendar) value).toGregorianCalendar().toZonedDateTime().toLocalDate();
                return new SurveyYearProperty(Year.of(surveyYear.getYear()));
            case "width":
                return new WidthProperty(helper.getGMLUnmarshaller().unmarshalLength((LengthType) value));
            case "widthType":
                return new WidthTypeProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
            case "trafficVolume":
                return new TrafficVolumePropertyElement(unmarshalTrafficVolumeProperty((TrafficVolumePropertyType) value));
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

    private BuildingDetails unmarshalBuildingDetails(BuildingDetailsType src) throws MissingADESchemaException {
        BuildingDetails dest = new BuildingDetails();

        dest.setSerialNumberOfBuildingCertification(src.getSerialNumberOfBuildingCertification());

        if (src.isSetSiteArea())
            dest.setSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSiteArea()));

        if (src.isSetBuildingFootprintArea())
            dest.setBuildingFootprintArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBuildingFootprintArea()));

        if (src.isSetBuildingRoofEdgeArea())
            dest.setBuildingRoofEdgeArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBuildingRoofEdgeArea()));

        if (src.isSetDevelopmentArea())
            dest.setDevelopmentArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDevelopmentArea()));

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetBuildingStructureType())
            dest.setBuildingStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getBuildingStructureType()));

        if (src.isSetFireproofStructureType())
            dest.setFireproofStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getFireproofStructureType()));

        dest.setImplementingBody(src.getImplementingBody());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetDistrictsAndZonesType())
            dest.setDistrictsAndZonesType(helper.getGMLUnmarshaller().unmarshalCode(src.getDistrictsAndZonesType()));

        if (src.isSetLandUsePlanType())
            dest.setLandUsePlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUsePlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        dest.setReference(src.getReference());

        if (src.isSetNote())
            dest.setNote(src.getNote());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private BuildingDetailsProperty unmarshalBuildingDetailsProperty(BuildingDetailsPropertyType src) throws MissingADESchemaException {
        BuildingDetailsProperty dest = new BuildingDetailsProperty();

        if (src.isSetBuildingDetails())
            dest.setObject(unmarshalBuildingDetails(src.getBuildingDetails()));

        return dest;
    }

    private LargeCustomerFacilities unmarshalLargeCustomerFacilities(LargeCustomerFacilitiesType src) throws MissingADESchemaException {
        LargeCustomerFacilities dest = new LargeCustomerFacilities();

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        dest.setName(src.getName());

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        dest.setOwner(src.getOwner());

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetTotalStoreFloorArea())
            dest.setTotalStoreFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalStoreFloorArea()));

        if (src.isSetInauguralDate())
            dest.setInauguralDate(src.getInauguralDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setKeyTenants(src.getKeyTenants());
        dest.setAvailability(src.isAvailability());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetDistrictsAndZonesType())
            dest.setDistrictsAndZonesType(helper.getGMLUnmarshaller().unmarshalCode(src.getDistrictsAndZonesType()));

        if (src.isSetLandUsePlanType())
            dest.setLandUsePlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUsePlanType()));

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

        return dest;
    }

    private LargeCustomerFacilitiesProperty unmarshalLargeCustomerFacilitiesProperty(LargeCustomerFacilitiesPropertyType src) throws MissingADESchemaException {
        LargeCustomerFacilitiesProperty dest = new LargeCustomerFacilitiesProperty();

        if (src.isSetLargeCustomerFacilities())
            dest.setObject(unmarshalLargeCustomerFacilities(src.getLargeCustomerFacilities()));

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

    private TrafficVolume unmarshalTrafficVolume(TrafficVolumeType src) throws MissingADESchemaException {
        TrafficVolume dest = new TrafficVolume();

        if (src.isSetWeekday12HourTrafficVolume())
            dest.setWeekday12hourTrafficVolume(src.getWeekday12HourTrafficVolume().intValue());

        if (src.isSetWeekday24HourTrafficVolume())
            dest.setWeekday24hourTrafficVolume(src.getWeekday24HourTrafficVolume().intValue());

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setObservationPointName(src.getObservationPointName());

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

        return dest;
    }

    private TrafficVolumeProperty unmarshalTrafficVolumeProperty(TrafficVolumePropertyType src) throws MissingADESchemaException {
        TrafficVolumeProperty dest = new TrafficVolumeProperty();

        if (src.isSetTrafficVolume())
            dest.setObject(unmarshalTrafficVolume(src.getTrafficVolume()));

        return dest;
    }
}
