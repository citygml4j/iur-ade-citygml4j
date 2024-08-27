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

package org.citygml4j.ade.iur.bind.urt;

import jp.go.kantei.iur._1_4.urt.*;
import net.opengis.citygml._2.AbstractCityObjectType;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.urt.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

import javax.xml.bind.JAXBElement;
import java.math.BigInteger;

public class PublicTransitMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public PublicTransitMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(Agency.class, this::createAgency)
                    .with(Attribution.class, this::createAttribution)
                    .with(Calendar.class, this::createCalendar)
                    .with(CalendarDate.class, this::createCalendarDate)
                    .with(DataTypeProperty.class, this::createDataTypeProperty)
                    .with(Description.class, this::createDescription)
                    .with(FareAttribute.class, this::createFareAttribute)
                    .with(FareRule.class, this::createFareRule)
                    .with(FeedInfo.class, this::createFeedInfo)
                    .with(Frequency.class, this::createFrequency)
                    .with(Level.class, this::createLevel)
                    .with(Office.class, this::createOffice)
                    .with(Pathway.class, this::createPathway)
                    .with(Point.class, this::createPoint)
                    .with(Route.class, this::createRoute)
                    .with(Shape.class, this::createShape)
                    .with(Stop.class, this::createStop)
                    .with(StopTime.class, this::createStopTime)
                    .with(Transfer.class, this::createTransfer)
                    .with(Translation.class, this::createTranslation)
                    .with(TranslationJP.class, this::createTranslationJP)
                    .with(Trip.class, this::createTrip);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Agency.class, this::marshalAgency)
                    .with(AgencyProperty.class, this::marshalAgencyProperty)
                    .with(Attribution.class, this::marshalAttribution)
                    .with(Calendar.class, this::marshalCalendar)
                    .with(CalendarProperty.class, this::marshalCalendarProperty)
                    .with(CalendarDate.class, this::marshalCalendarDate)
                    .with(CalendarDateProperty.class, this::marshalCalendarDateProperty)
                    .with(Description.class, this::marshalDescription)
                    .with(DescriptionProperty.class, this::marshalDescriptionProperty)
                    .with(FareAttribute.class, this::marshalFareAttribute)
                    .with(FareAttributeProperty.class, this::marshalFareAttributeProperty)
                    .with(FareRule.class, this::marshalFareRule)
                    .with(FeedInfo.class, this::marshalFeedInfo)
                    .with(Frequency.class, this::marshalFrequency)
                    .with(Level.class, this::marshalLevel)
                    .with(LevelProperty.class, this::marshalLevelProperty)
                    .with(Office.class, this::marshalOffice)
                    .with(OfficeProperty.class, this::marshalOfficeProperty)
                    .with(Pathway.class, this::marshalPathway)
                    .with(Point.class, this::marshalPoint)
                    .with(PointProperty.class, this::marshalPointProperty)
                    .with(PublicTransitDataTypeProperty.class, this::marshalPublicTransitDataTypeProperty)
                    .with(PublicTransitProperty.class, this::marshalPublicTransitProperty)
                    .with(Route.class, this::marshalRoute)
                    .with(RouteProperty.class, this::marshalRouteProperty)
                    .with(Shape.class, this::marshalShape)
                    .with(ShapeProperty.class, this::marshalShapeProperty)
                    .with(Stop.class, this::marshalStop)
                    .with(StopProperty.class, this::marshalStopProperty)
                    .with(StopTime.class, this::marshalStopTime)
                    .with(TargetProperty.class, this::marshalTargetProperty)
                    .with(Transfer.class, this::marshalTransfer)
                    .with(Translation.class, this::marshalTranslation)
                    .with(TranslationJP.class, this::marshalTranslationJP)
                    .with(Trip.class, this::marshalTrip)
                    .with(TripProperty.class, this::marshalTripProperty);
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

    private void marshalPublicTransit(PublicTransit src, PublicTransitType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        dest.setOrgId(src.getOrgId());
    }

    public AgencyType marshalAgency(Agency src) {
        AgencyType dest = factory.createAgencyType();
        marshalPublicTransit(src, dest);

        dest.setAgencyName(src.getAgencyName());
        dest.setUrl(src.getUrl());

        if (src.getTimeZone() != null)
            dest.setTimeZone(helper.getGMLMarshaller().marshalCode(src.getTimeZone()));

        if (src.getLanguage() != null)
            dest.setLanguage(helper.getGMLMarshaller().marshalCode(src.getLanguage()));

        dest.setPhone(src.getPhone());
        dest.setFareUrl(src.getFareUrl());
        dest.setEmail(src.getEmail());
        dest.setOfficialName(src.getOfficialName());
        dest.setZipNumber(src.getZipNumber());
        dest.setAddress(src.getAddress());
        dest.setPresidentPosition(src.getPresidentPosition());
        dest.setPresidentName(src.getPresidentName());

        return dest;
    }

    public AgencyPropertyType marshalAgencyProperty(AgencyProperty src) {
        AgencyPropertyType dest = factory.createAgencyPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof AgencyType)
                dest.setAgency((AgencyType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public AttributionType marshalAttribution(Attribution src) {
        AttributionType dest = factory.createAttributionType();
        marshalPublicTransit(src, dest);

        dest.setOrganizationName(src.getOrganizationName());
        dest.setIsProducer(src.getIsProducer());
        dest.setIsOperator(src.getIsOperator());
        dest.setIsAuthority(src.getIsAuthority());
        dest.setUrl(src.getUrl());
        dest.setEmail(src.getEmail());
        dest.setPhoneNumber(src.getPhoneNumber());

        if (src.getAgency() != null)
            dest.setAgency(marshalAgencyProperty(src.getAgency()));

        if (src.getRoute() != null)
            dest.setRoute(marshalRouteProperty(src.getRoute()));

        if (src.getTrip() != null)
            dest.setTrip(marshalTripProperty(src.getTrip()));

        return dest;
    }

    public CalendarType marshalCalendar(Calendar src) {
        CalendarType dest = factory.createCalendarType();
        marshalPublicTransit(src, dest);

        dest.setMonday(src.isMonday());
        dest.setTuesday(src.isTuesday());
        dest.setWednesday(src.isWednesday());
        dest.setThursday(src.isThursday());
        dest.setFriday(src.isFriday());
        dest.setSaturday(src.isSaturday());
        dest.setSunday(src.isSunday());

        if (src.getStartDate() != null)
            dest.setStartDate(marshaller.toCalendar(src.getStartDate()));

        if (src.getEndDate() != null)
            dest.setEndDate(marshaller.toCalendar(src.getEndDate()));

        return dest;
    }

    public CalendarPropertyType marshalCalendarProperty(CalendarProperty src) {
        CalendarPropertyType dest = factory.createCalendarPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof CalendarType)
                dest.setCalendar((CalendarType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public CalendarDateType marshalCalendarDate(CalendarDate src) {
        CalendarDateType dest = factory.createCalendarDateType();
        marshalPublicTransit(src, dest);

        if (src.getDate() != null)
            dest.setDate(marshaller.toCalendar(src.getDate()));

        if (src.getExceptionType() != null)
            dest.setExceptionType(helper.getGMLMarshaller().marshalCode(src.getExceptionType()));

        if (src.getCalendar() != null)
            dest.setCalendar(marshalCalendarProperty(src.getCalendar()));

        return dest;
    }

    public CalendarDatePropertyType marshalCalendarDateProperty(CalendarDateProperty src) {
        CalendarDatePropertyType dest = factory.createCalendarDatePropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof CalendarDateType)
                dest.setCalendarDate((CalendarDateType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private DescriptionType marshalDescription(Description src) {
        DescriptionType dest = factory.createDescriptionType();

        dest.setDescription(src.getDescription());

        if (src.getFrequencyOfService() != null)
            dest.setFrequencyOfService(BigInteger.valueOf(src.getFrequencyOfService()));

        if (src.getNumberOfCustomers() != null)
            dest.setNumberOfCustomers(BigInteger.valueOf(src.getNumberOfCustomers()));

        return dest;
    }

    private DescriptionPropertyType marshalDescriptionProperty(DescriptionProperty src) {
        DescriptionPropertyType dest = factory.createDescriptionPropertyType();

        if (src.isSetObject())
            dest.setDescription(marshalDescription(src.getObject()));

        return dest;
    }

    public FareAttributeType marshalFareAttribute(FareAttribute src) {
        FareAttributeType dest = factory.createFareAttributeType();
        marshalPublicTransit(src, dest);

        dest.setPrice(src.getPrice());

        if (src.getCurrencyType() != null)
            dest.setCurrencyType(helper.getGMLMarshaller().marshalCode(src.getCurrencyType()));

        if (src.getPaymentMethod() != null)
            dest.setPaymentMethod(helper.getGMLMarshaller().marshalCode(src.getPaymentMethod()));

        if (src.getTransfers() != null)
            dest.setTransfers(helper.getGMLMarshaller().marshalCode(src.getTransfers()));

        if (src.getTransferDuration() != null)
            dest.setTransferDuration(BigInteger.valueOf(src.getTransferDuration()));

        if (src.getAgency() != null)
            dest.setAgency(marshalAgencyProperty(src.getAgency()));

        return dest;
    }

    public FareAttributePropertyType marshalFareAttributeProperty(FareAttributeProperty src) {
        FareAttributePropertyType dest = factory.createFareAttributePropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof FareAttributeType)
                dest.setFareAttribute((FareAttributeType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private FareRuleType marshalFareRule(FareRule src) {
        FareRuleType dest = factory.createFareRuleType();

        if (src.getOriginId() != null)
            dest.setOriginId(helper.getGMLMarshaller().marshalCode(src.getOriginId()));

        if (src.getDestinationId() != null)
            dest.setDestinationId(helper.getGMLMarshaller().marshalCode(src.getDestinationId()));

        if (src.getContainsId() != null)
            dest.setContainsId(helper.getGMLMarshaller().marshalCode(src.getContainsId()));

        if (src.getFare() != null)
            dest.setFare(marshalFareAttributeProperty(src.getFare()));

        if (src.getRoute() != null)
            dest.setRoute(marshalRouteProperty(src.getRoute()));

        return dest;
    }

    private FeedInfoType marshalFeedInfo(FeedInfo src) {
        FeedInfoType dest = factory.createFeedInfoType();

        dest.setPublisherName(src.getPublisherName());
        dest.setPublisherUrl(src.getPublisherUrl());

        if (src.getLanguage() != null)
            dest.setLanguage(helper.getGMLMarshaller().marshalCode(src.getLanguage()));

        if (src.getDefaultLanguage() != null)
            dest.setDefaultLanguage(helper.getGMLMarshaller().marshalCode(src.getDefaultLanguage()));

        if (src.getStartDate() != null)
            dest.setStartDate(marshaller.toCalendar(src.getStartDate()));

        if (src.getEndDate() != null)
            dest.setEndDate(marshaller.toCalendar(src.getEndDate()));

        dest.setVersion(src.getVersion());
        dest.setContactEmail(src.getContactEmail());
        dest.setContactURL(src.getContactURL());
        dest.setDetailedInfo(src.getDetailedInfo());

        return dest;
    }

    private FrequencyType marshalFrequency(Frequency src) {
        FrequencyType dest = factory.createFrequencyType();

        if (src.getStartTime() != null)
            dest.setStartTime(marshaller.toCalendar(src.getStartTime()));

        if (src.getEndTime() != null)
            dest.setEndTime(marshaller.toCalendar(src.getEndTime()));

        if (src.getHeadwaySecs() != null)
            dest.setHeadwaySecs(BigInteger.valueOf(src.getHeadwaySecs()));

        if (src.getExactTimes() != null)
            dest.setExactTimes(helper.getGMLMarshaller().marshalCode(src.getExactTimes()));

        if (src.getTrip() != null)
            dest.setTrip(marshalTripProperty(src.getTrip()));

        return dest;
    }

    public LevelType marshalLevel(Level src) {
        LevelType dest = factory.createLevelType();
        marshalPublicTransit(src, dest);

        dest.setIndex(src.getIndex());

        return dest;
    }

    public LevelPropertyType marshalLevelProperty(LevelProperty src) {
        LevelPropertyType dest = factory.createLevelPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof LevelType)
                dest.setLevel((LevelType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public OfficeType marshalOffice(Office src) {
        OfficeType dest = factory.createOfficeType();
        marshalPublicTransit(src, dest);

        dest.setOfficeName(src.getOfficeName());
        dest.setUrl(src.getUrl());
        dest.setPhone(src.getPhone());

        return dest;
    }

    public OfficePropertyType marshalOfficeProperty(OfficeProperty src) {
        OfficePropertyType dest = factory.createOfficePropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof OfficeType)
                dest.setOffice((OfficeType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public PathwayType marshalPathway(Pathway src) {
        PathwayType dest = factory.createPathwayType();
        marshalPublicTransit(src, dest);

        if (src.getMode() != null)
            dest.setMode(helper.getGMLMarshaller().marshalCode(src.getMode()));

        if (src.getIsBidirectional() != null)
            dest.setIsBidirectional(helper.getGMLMarshaller().marshalCode(src.getIsBidirectional()));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getTraversalTime() != null)
            dest.setTraversalTime(BigInteger.valueOf(src.getTraversalTime()));

        if (src.getStairCount() != null)
            dest.setStairCount(BigInteger.valueOf(src.getStairCount()));

        dest.setMaxSlope(src.getMaxSlope());
        dest.setMinWidth(src.getMinWidth());
        dest.setSignpostedAs(src.getSignpostedAs());
        dest.setReversedSignpostedAs(src.getReversedSignpostedAs());

        if (src.getFrom() != null)
            dest.setFrom(marshalStopProperty(src.getFrom()));

        if (src.getTo() != null)
            dest.setTo(marshalStopProperty(src.getTo()));

        return dest;
    }

    private PointType marshalPoint(Point src) {
        PointType dest = factory.createPointType();

        dest.setLatitude(src.getLatitude());
        dest.setLongitude(src.getLongitude());

        if (src.getPoint() != null)
            dest.setPoint(helper.getGMLMarshaller().marshalPointProperty(src.getPoint()));

        if (src.getPointSequence() != null)
            dest.setPointSequence(BigInteger.valueOf(src.getPointSequence()));

        dest.setPointDistanceTraveled(src.getPointDistanceTraveled());

        return dest;
    }

    private PointPropertyType marshalPointProperty(PointProperty src) {
        PointPropertyType dest = factory.createPointPropertyType();

        if (src.getObject() != null)
            dest.setPoint(marshalPoint(src.getObject()));

        return dest;
    }

    @SuppressWarnings("unchecked")
    private PublicTransitDataTypePropertyType marshalPublicTransitDataTypeProperty(PublicTransitDataTypeProperty src) {
        PublicTransitDataTypePropertyType dest = factory.createPublicTransitDataTypePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof PublicTransitDataTypeType)
                dest.set_PublicTransitDataType((JAXBElement<? extends PublicTransitDataTypeType>) elem);
        }

        return dest;
    }

    @SuppressWarnings("unchecked")
    public PublicTransitPropertyType marshalPublicTransitProperty(PublicTransitProperty src) {
        PublicTransitPropertyType dest = factory.createPublicTransitPropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof PublicTransitType)
                dest.set_PublicTransit((JAXBElement<? extends PublicTransitType>) elem);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public RouteType marshalRoute(Route src) {
        RouteType dest = factory.createRouteType();
        marshalPublicTransit(src, dest);

        dest.setShortName(src.getShortName());
        dest.setLongName(src.getLongName());

        if (src.getRouteDescription() != null)
            dest.setRouteDescription(marshalDescriptionProperty(src.getRouteDescription()));

        if (src.getType() != null)
            dest.setType(helper.getGMLMarshaller().marshalCode(src.getType()));

        dest.setUrl(src.getUrl());
        dest.setColor(src.getColor());
        dest.setTextColor(src.getTextColor());

        if (src.getUpdateDate() != null)
            dest.setUpdateDate(marshaller.toCalendar(src.getUpdateDate()));

        dest.setOriginStop(src.getOriginStop());
        dest.setViaStop(src.getViaStop());
        dest.setDestinationStop(src.getDestinationStop());

        if (src.getRouteSortOrder() != null)
            dest.setRouteSortOrder(BigInteger.valueOf(src.getRouteSortOrder()));

        if (src.getContinuousPickup() != null)
            dest.setContinuousPickup(helper.getGMLMarshaller().marshalCode(src.getContinuousPickup()));

        if (src.getContinuousDropOff() != null)
            dest.setContinuousDropOff(helper.getGMLMarshaller().marshalCode(src.getContinuousDropOff()));

        if (src.getAgency() != null)
            dest.setAgency(marshalAgencyProperty(src.getAgency()));

        if (src.getParentRoute() != null)
            dest.setParentRoute(marshalRouteProperty(src.getParentRoute()));

        if (src.getLod0MultiCurve() != null)
            dest.setLod0MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLod0MultiCurve()));

        return dest;
    }

    public RoutePropertyType marshalRouteProperty(RouteProperty src) {
        RoutePropertyType dest = factory.createRoutePropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof RouteType)
                dest.setRoute((RouteType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public ShapeType marshalShape(Shape src) {
        ShapeType dest = factory.createShapeType();
        marshalPublicTransit(src, dest);

        for (PointProperty property : src.getPoints())
            dest.getPoint().add(marshalPointProperty(property));

        return dest;
    }

    public ShapePropertyType marshalShapeProperty(ShapeProperty src) {
        ShapePropertyType dest = factory.createShapePropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof ShapeType)
                dest.setShape((ShapeType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    public StopType marshalStop(Stop src) {
        StopType dest = factory.createStopType();
        marshalPublicTransit(src, dest);

        if (src.getCode() != null)
            dest.setCode(helper.getGMLMarshaller().marshalCode(src.getCode()));

        dest.setTtsName(src.getTtsName());
        dest.setLatitude(src.getLatitude());
        dest.setLongitude(src.getLongitude());

        if (src.getZoneId() != null)
            dest.setZoneId(helper.getGMLMarshaller().marshalCode(src.getZoneId()));

        dest.setUrl(src.getUrl());

        if (src.getLocationType() != null)
            dest.setLocationType(helper.getGMLMarshaller().marshalCode(src.getLocationType()));

        if (src.getTimeZone() != null)
            dest.setTimeZone(helper.getGMLMarshaller().marshalCode(src.getTimeZone()));

        if (src.getWheelchairBoarding() != null)
            dest.setWheelchairBoarding(helper.getGMLMarshaller().marshalCode(src.getWheelchairBoarding()));

        dest.setPlatformCode(src.getPlatformCode());

        if (src.getPoint() != null)
            dest.setPoint(helper.getGMLMarshaller().marshalPointProperty(src.getPoint()));

        if (src.getParentStation() != null)
            dest.setParentStation(marshalStopProperty(src.getParentStation()));

        if (src.getLevel() != null)
            dest.setLevel(marshalLevelProperty(src.getLevel()));

        return dest;
    }

    public StopPropertyType marshalStopProperty(StopProperty src) {
        StopPropertyType dest = factory.createStopPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof StopType)
                dest.setStop((StopType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private StopTimeType marshalStopTime(StopTime src) {
        StopTimeType dest = factory.createStopTimeType();

        if (src.getArrivalTime() != null)
            dest.setArrivalTime(marshaller.toCalendar(src.getArrivalTime()));

        if (src.getDepartureTime() != null)
            dest.setDepartureTime(marshaller.toCalendar(src.getDepartureTime()));

        if (src.getStopSequence() != null)
            dest.setStopSequence(BigInteger.valueOf(src.getStopSequence()));

        dest.setHeadsign(src.getHeadsign());

        if (src.getPickupType() != null)
            dest.setPickupType(helper.getGMLMarshaller().marshalCode(src.getPickupType()));

        if (src.getDropoffType() != null)
            dest.setDropoffType(helper.getGMLMarshaller().marshalCode(src.getDropoffType()));

        if (src.getContinuousPickupType() != null)
            dest.setContinuousDropoffType(helper.getGMLMarshaller().marshalCode(src.getContinuousPickupType()));

        if (src.getContinuousDropoffType() != null)
            dest.setContinuousDropoffType(helper.getGMLMarshaller().marshalCode(src.getContinuousDropoffType()));

        dest.setShapeDistanceTraveled(src.getShapeDistanceTraveled());

        if (src.getTimePoint() != null)
            dest.setTimePoint(helper.getGMLMarshaller().marshalCode(src.getTimePoint()));

        if (src.getTrip() != null)
            dest.setTrip(marshalTripProperty(src.getTrip()));

        if (src.getStop() != null)
            dest.setStop(marshalStopProperty(src.getStop()));

        return dest;
    }

    @SuppressWarnings("unchecked")
    public TargetPropertyType marshalTargetProperty(TargetProperty src) {
        TargetPropertyType dest = factory.createTargetPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof AbstractCityObjectType)
                dest.set_CityObject((JAXBElement<? extends AbstractCityObjectType>) elem);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private TransferType marshalTransfer(Transfer src) {
        TransferType dest = factory.createTransferType();

        if (src.getTransferType() != null)
            dest.setTransferType(helper.getGMLMarshaller().marshalCode(src.getTransferType()));

        if (src.getMinTransferTime() != null)
            dest.setMinTransferTime(BigInteger.valueOf(src.getMinTransferTime()));

        if (src.getFrom() != null)
            dest.setFrom(marshalStopProperty(src.getFrom()));

        if (src.getTo() != null)
            dest.setTo(marshalStopProperty(src.getTo()));

        return dest;
    }

    private TranslationType marshalTranslation(Translation src) {
        TranslationType dest = factory.createTranslationType();

        if (src.getTableName() != null)
            dest.setTableName(helper.getGMLMarshaller().marshalCode(src.getTableName()));

        dest.setFieldName(src.getFieldName());

        if (src.getLanguage() != null)
            dest.setLanguage(helper.getGMLMarshaller().marshalCode(src.getLanguage()));

        dest.setTranslation(src.getTranslation());
        dest.setFieldValue(src.getFieldValue());

        if (src.getRecordId() != null)
            dest.setRecordId(marshalPublicTransitProperty(src.getRecordId()));

        dest.setRecordSubId(src.getRecordSubId());

        return dest;
    }

    public TranslationJPType marshalTranslationJP(TranslationJP src) {
        TranslationJPType dest = factory.createTranslationJPType();
        marshalPublicTransit(src, dest);

        if (src.getLanguage() != null)
            dest.setLanguage(helper.getGMLMarshaller().marshalCode(src.getLanguage()));

        dest.setTranslation(src.getTranslation());

        return dest;
    }

    public TripType marshalTrip(Trip src) {
        TripType dest = factory.createTripType();
        marshalPublicTransit(src, dest);

        dest.setHeadsign(src.getHeadsign());
        dest.setShortName(src.getShortName());

        if (src.getDirectionId() != null)
            dest.setDirectionId(helper.getGMLMarshaller().marshalCode(src.getDirectionId()));

        dest.setBlockId(src.getBlockId());

        if (src.getWheelchairAccessible() != null)
            dest.setWheelchairAccessible(helper.getGMLMarshaller().marshalCode(src.getWheelchairAccessible()));

        if (src.getBikeAllowed() != null)
            dest.setBikeAllowed(helper.getGMLMarshaller().marshalCode(src.getBikeAllowed()));

        dest.setSymbol(src.getSymbol());

        if (src.getRoute() != null)
            dest.setRoute(marshalRouteProperty(src.getRoute()));

        if (src.getCalendar() != null)
            dest.setCalendar(marshalCalendarProperty(src.getCalendar()));

        if (src.getCalendarDate() != null)
            dest.setCalendarDate(marshalCalendarDateProperty(src.getCalendarDate()));

        if (src.getOffice() != null)
            dest.setOffice(marshalOfficeProperty(src.getOffice()));

        if (src.getShape() != null)
            dest.setShape(marshalShapeProperty(src.getShape()));

        if (src.getLod0MultiCurve() != null)
            dest.setLod0MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLod0MultiCurve()));

        return dest;
    }

    public TripPropertyType marshalTripProperty(TripProperty src) {
        TripPropertyType dest = factory.createTripPropertyType();

        if (src.isSetObject()) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof TripType)
                dest.setTrip((TripType) elem.getValue());
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private JAXBElement<?> createAgency(Agency src) {
        return factory.createAgency(marshalAgency(src));
    }

    private JAXBElement<?> createAttribution(Attribution src) {
        return factory.createAttribution(marshalAttribution(src));
    }

    private JAXBElement<?> createCalendar(Calendar src) {
        return factory.createCalendar(marshalCalendar(src));
    }

    private JAXBElement<?> createCalendarDate(CalendarDate src) {
        return factory.createCalendarDate(marshalCalendarDate(src));
    }

    private JAXBElement<?> createDataTypeProperty(DataTypeProperty src) {
        return factory.createDataType(marshalPublicTransitDataTypeProperty(src.getValue()));
    }

    private JAXBElement<?> createDescription(Description src) {
        return factory.createDescription(marshalDescription(src));
    }

    private JAXBElement<?> createFareAttribute(FareAttribute src) {
        return factory.createFareAttribute(marshalFareAttribute(src));
    }

    private JAXBElement<?> createFareRule(FareRule src) {
        return factory.createFareRule(marshalFareRule(src));
    }

    private JAXBElement<?> createFeedInfo(FeedInfo src) {
        return factory.createFeedInfo(marshalFeedInfo(src));
    }

    private JAXBElement<?> createFrequency(Frequency src) {
        return factory.createFrequency(marshalFrequency(src));
    }

    private JAXBElement<?> createLevel(Level src) {
        return factory.createLevel(marshalLevel(src));
    }

    private JAXBElement<?> createOffice(Office src) {
        return factory.createOffice(marshalOffice(src));
    }

    private JAXBElement<?> createPathway(Pathway src) {
        return factory.createPathway(marshalPathway(src));
    }

    private JAXBElement<?> createPoint(Point src) {
        return factory.createPoint(marshalPoint(src));
    }

    private JAXBElement<?> createRoute(Route src) {
        return factory.createRoute(marshalRoute(src));
    }

    private JAXBElement<?> createShape(Shape src) {
        return factory.createShape(marshalShape(src));
    }

    private JAXBElement<?> createStop(Stop src) {
        return factory.createStop(marshalStop(src));
    }

    private JAXBElement<?> createStopTime(StopTime src) {
        return factory.createStopTime(marshalStopTime(src));
    }

    private JAXBElement<?> createTransfer(Transfer src) {
        return factory.createTransfer(marshalTransfer(src));
    }

    private JAXBElement<?> createTranslation(Translation src) {
        return factory.createTranslation(marshalTranslation(src));
    }

    private JAXBElement<?> createTranslationJP(TranslationJP src) {
        return factory.createTranslationJP(marshalTranslationJP(src));
    }

    private JAXBElement<?> createTrip(Trip src) {
        return factory.createTrip(marshalTrip(src));
    }
}
