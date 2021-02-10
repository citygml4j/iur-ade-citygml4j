package org.citygml4j.ade.iur.bind.urt;

import jp.go.kantei.iur._1_4.urt.AgencyPropertyType;
import jp.go.kantei.iur._1_4.urt.AgencyType;
import jp.go.kantei.iur._1_4.urt.AttributionType;
import jp.go.kantei.iur._1_4.urt.CalendarDatePropertyType;
import jp.go.kantei.iur._1_4.urt.CalendarDateType;
import jp.go.kantei.iur._1_4.urt.CalendarPropertyType;
import jp.go.kantei.iur._1_4.urt.CalendarType;
import jp.go.kantei.iur._1_4.urt.DescriptionPropertyType;
import jp.go.kantei.iur._1_4.urt.DescriptionType;
import jp.go.kantei.iur._1_4.urt.FareAttributePropertyType;
import jp.go.kantei.iur._1_4.urt.FareAttributeType;
import jp.go.kantei.iur._1_4.urt.FareRuleType;
import jp.go.kantei.iur._1_4.urt.FeedInfoType;
import jp.go.kantei.iur._1_4.urt.FrequencyType;
import jp.go.kantei.iur._1_4.urt.LevelPropertyType;
import jp.go.kantei.iur._1_4.urt.LevelType;
import jp.go.kantei.iur._1_4.urt.OfficePropertyType;
import jp.go.kantei.iur._1_4.urt.OfficeType;
import jp.go.kantei.iur._1_4.urt.PathwayType;
import jp.go.kantei.iur._1_4.urt.PointPropertyType;
import jp.go.kantei.iur._1_4.urt.PointType;
import jp.go.kantei.iur._1_4.urt.PublicTransitDataTypePropertyType;
import jp.go.kantei.iur._1_4.urt.PublicTransitPropertyType;
import jp.go.kantei.iur._1_4.urt.PublicTransitType;
import jp.go.kantei.iur._1_4.urt.RoutePropertyType;
import jp.go.kantei.iur._1_4.urt.RouteType;
import jp.go.kantei.iur._1_4.urt.ShapePropertyType;
import jp.go.kantei.iur._1_4.urt.ShapeType;
import jp.go.kantei.iur._1_4.urt.StopPropertyType;
import jp.go.kantei.iur._1_4.urt.StopTimeType;
import jp.go.kantei.iur._1_4.urt.StopType;
import jp.go.kantei.iur._1_4.urt.TargetPropertyType;
import jp.go.kantei.iur._1_4.urt.TransferType;
import jp.go.kantei.iur._1_4.urt.TranslationJPType;
import jp.go.kantei.iur._1_4.urt.TranslationType;
import jp.go.kantei.iur._1_4.urt.TripPropertyType;
import jp.go.kantei.iur._1_4.urt.TripType;
import org.citygml4j.ade.iur.model.urf.TargetProperty;
import org.citygml4j.ade.iur.model.urt.Agency;
import org.citygml4j.ade.iur.model.urt.AgencyProperty;
import org.citygml4j.ade.iur.model.urt.Attribution;
import org.citygml4j.ade.iur.model.urt.Calendar;
import org.citygml4j.ade.iur.model.urt.CalendarDate;
import org.citygml4j.ade.iur.model.urt.CalendarDateProperty;
import org.citygml4j.ade.iur.model.urt.CalendarProperty;
import org.citygml4j.ade.iur.model.urt.DataTypeProperty;
import org.citygml4j.ade.iur.model.urt.Description;
import org.citygml4j.ade.iur.model.urt.DescriptionProperty;
import org.citygml4j.ade.iur.model.urt.FareAttribute;
import org.citygml4j.ade.iur.model.urt.FareAttributeProperty;
import org.citygml4j.ade.iur.model.urt.FareRule;
import org.citygml4j.ade.iur.model.urt.FeedInfo;
import org.citygml4j.ade.iur.model.urt.Frequency;
import org.citygml4j.ade.iur.model.urt.Level;
import org.citygml4j.ade.iur.model.urt.LevelProperty;
import org.citygml4j.ade.iur.model.urt.Office;
import org.citygml4j.ade.iur.model.urt.OfficeProperty;
import org.citygml4j.ade.iur.model.urt.Pathway;
import org.citygml4j.ade.iur.model.urt.Point;
import org.citygml4j.ade.iur.model.urt.PointProperty;
import org.citygml4j.ade.iur.model.urt.PublicTransit;
import org.citygml4j.ade.iur.model.urt.PublicTransitDataType;
import org.citygml4j.ade.iur.model.urt.PublicTransitDataTypeProperty;
import org.citygml4j.ade.iur.model.urt.PublicTransitProperty;
import org.citygml4j.ade.iur.model.urt.Route;
import org.citygml4j.ade.iur.model.urt.RouteProperty;
import org.citygml4j.ade.iur.model.urt.Shape;
import org.citygml4j.ade.iur.model.urt.ShapeProperty;
import org.citygml4j.ade.iur.model.urt.Stop;
import org.citygml4j.ade.iur.model.urt.StopProperty;
import org.citygml4j.ade.iur.model.urt.StopTime;
import org.citygml4j.ade.iur.model.urt.Transfer;
import org.citygml4j.ade.iur.model.urt.Translation;
import org.citygml4j.ade.iur.model.urt.TranslationJP;
import org.citygml4j.ade.iur.model.urt.Trip;
import org.citygml4j.ade.iur.model.urt.TripProperty;
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

public class PublicTransitUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(AgencyType.class, this::unmarshalAgency)
                    .with(AgencyPropertyType.class, this::unmarshalAgencyProperty)
                    .with(AttributionType.class, this::unmarshalAttribution)
                    .with(CalendarType.class, this::unmarshalCalendar)
                    .with(CalendarPropertyType.class, this::unmarshalCalendarProperty)
                    .with(CalendarDateType.class, this::unmarshalCalendarDate)
                    .with(CalendarDatePropertyType.class, this::unmarshalCalendarDateProperty)
                    .with(DescriptionType.class, this::unmarshalDescription)
                    .with(DescriptionPropertyType.class, this::unmarshalDescriptionProperty)
                    .with(FareAttributeType.class, this::unmarshalFareAttribute)
                    .with(FareAttributePropertyType.class, this::unmarshalFareAttributeProperty)
                    .with(FareRuleType.class, this::unmarshalFareRule)
                    .with(FeedInfoType.class, this::unmarshalFeedInfo)
                    .with(FrequencyType.class, this::unmarshalFrequency)
                    .with(LevelType.class, this::unmarshalLevel)
                    .with(LevelPropertyType.class, this::unmarshalLevelProperty)
                    .with(OfficeType.class, this::unmarshalOffice)
                    .with(OfficePropertyType.class, this::unmarshalOfficeProperty)
                    .with(PathwayType.class, this::unmarshalPathway)
                    .with(PointType.class, this::unmarshalPoint)
                    .with(PointPropertyType.class, this::unmarshalPointProperty)
                    .with(PublicTransitDataTypePropertyType.class, this::unmarshalPublicTransitDataTypeProperty)
                    .with(PublicTransitPropertyType.class, this::unmarshalPublicTransitProperty)
                    .with(RouteType.class, this::unmarshalRoute)
                    .with(RoutePropertyType.class, this::unmarshalRouteProperty)
                    .with(ShapeType.class, this::unmarshalShape)
                    .with(ShapePropertyType.class, this::unmarshalShapeProperty)
                    .with(StopType.class, this::unmarshalStop)
                    .with(StopPropertyType.class, this::unmarshalStopProperty)
                    .with(StopTimeType.class, this::unmarshalStopTime)
                    .with(TargetPropertyType.class, this::unmarshalTargetProperty)
                    .with(TransferType.class, this::unmarshalTransfer)
                    .with(TranslationType.class, this::unmarshalTranslation)
                    .with(TranslationJPType.class, this::unmarshalTranslationJP)
                    .with(TripType.class, this::unmarshalTrip)
                    .with(TripPropertyType.class, this::unmarshalTripProperty);
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
        if (src.getName().getLocalPart().equals("dataType"))
            return new DataTypeProperty(unmarshalPublicTransitDataTypeProperty((PublicTransitDataTypePropertyType) src.getValue()));

        // all other types
        return unmarshal(value);
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        CheckedTypeMapper<ADEModelObject> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void unmarshalPublicTransit(PublicTransitType src, PublicTransit dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        dest.setOrgId(src.getOrgId());
    }

    public Agency unmarshalAgency(AgencyType src) throws MissingADESchemaException {
        Agency dest = new Agency();
        unmarshalPublicTransit(src, dest);

        dest.setAgencyName(src.getAgencyName());
        dest.setUrl(src.getUrl());

        if (src.isSetTimeZone())
            dest.setTimeZone(helper.getGMLUnmarshaller().unmarshalCode(src.getTimeZone()));

        if (src.isSetLanguage())
            dest.setLanguage(helper.getGMLUnmarshaller().unmarshalCode(src.getLanguage()));

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

    public AgencyProperty unmarshalAgencyProperty(AgencyPropertyType src) throws MissingADESchemaException {
        AgencyProperty dest = new AgencyProperty();

        if (src.isSetAgency()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getAgency());
            if (object instanceof Agency)
                dest.setObject((Agency) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Attribution unmarshalAttribution(AttributionType src) throws MissingADESchemaException {
        Attribution dest = new Attribution();
        unmarshalPublicTransit(src, dest);

        dest.setOrganizationName(src.getOrganizationName());
        dest.setIsProducer(src.isIsProducer());
        dest.setIsOperator(src.isIsOperator());
        dest.setIsAuthority(src.isIsAuthority());
        dest.setUrl(src.getUrl());
        dest.setEmail(src.getEmail());
        dest.setPhoneNumber(src.getPhoneNumber());

        if (src.isSetAgency())
            dest.setAgency(unmarshalAgencyProperty(src.getAgency()));

        if (src.isSetRoute())
            dest.setRoute(unmarshalRouteProperty(src.getRoute()));

        if (src.isSetTrip())
            dest.setTrip(unmarshalTripProperty(src.getTrip()));

        return dest;
    }

    public Calendar unmarshalCalendar(CalendarType src) throws MissingADESchemaException {
        Calendar dest = new Calendar();
        unmarshalPublicTransit(src, dest);

        dest.setMonday(src.isMonday());
        dest.setTuesday(src.isTuesday());
        dest.setWednesday(src.isWednesday());
        dest.setThursday(src.isThursday());
        dest.setFriday(src.isFriday());
        dest.setSaturday(src.isSaturday());
        dest.setSunday(src.isSunday());

        if (src.isSetStartDate())
            dest.setStartDate(src.getStartDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetEndDate())
            dest.setEndDate(src.getEndDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    public CalendarProperty unmarshalCalendarProperty(CalendarPropertyType src) throws MissingADESchemaException {
        CalendarProperty dest = new CalendarProperty();

        if (src.isSetCalendar()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getCalendar());
            if (object instanceof Calendar)
                dest.setObject((Calendar) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public CalendarDate unmarshalCalendarDate(CalendarDateType src) throws MissingADESchemaException {
        CalendarDate dest = new CalendarDate();
        unmarshalPublicTransit(src, dest);

        if (src.isSetDate())
            dest.setDate(src.getDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetExceptionType())
            dest.setExceptionType(helper.getGMLUnmarshaller().unmarshalCode(src.getExceptionType()));

        if (src.isSetCalendar())
            dest.setCalendar(unmarshalCalendarProperty(src.getCalendar()));

        return dest;
    }

    public CalendarDateProperty unmarshalCalendarDateProperty(CalendarDatePropertyType src) throws MissingADESchemaException {
        CalendarDateProperty dest = new CalendarDateProperty();

        if (src.isSetCalendarDate()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getCalendarDate());
            if (object instanceof CalendarDate)
                dest.setObject((CalendarDate) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Description unmarshalDescription(DescriptionType src) throws MissingADESchemaException {
        Description dest = new Description();

        dest.setDescription(src.getDescription());

        if (src.isSetFrequencyOfService())
            dest.setFrequencyOfService(src.getFrequencyOfService().intValue());

        if (src.isSetNumberOfCustomers())
            dest.setNumberOfCustomers(src.getNumberOfCustomers().intValue());

        return dest;
    }

    private DescriptionProperty unmarshalDescriptionProperty(DescriptionPropertyType src) throws MissingADESchemaException {
        DescriptionProperty dest = new DescriptionProperty();

        if (src.isSetDescription())
            dest.setObject(unmarshalDescription(src.getDescription()));

        return dest;
    }

    public FareAttribute unmarshalFareAttribute(FareAttributeType src) throws MissingADESchemaException {
        FareAttribute dest = new FareAttribute();
        unmarshalPublicTransit(src, dest);

        dest.setPrice(src.getPrice());

        if (src.isSetCurrencyType())
            dest.setCurrencyType(helper.getGMLUnmarshaller().unmarshalCode(src.getCurrencyType()));

        if (src.isSetPaymentMethod())
            dest.setPaymentMethod(helper.getGMLUnmarshaller().unmarshalCode(src.getPaymentMethod()));

        if (src.isSetTransfers())
            dest.setTransfers(helper.getGMLUnmarshaller().unmarshalCode(src.getTransfers()));

        if (src.isSetTransferDuration())
            dest.setTransferDuration(src.getTransferDuration().intValue());

        if (src.isSetAgency())
            dest.setAgency(unmarshalAgencyProperty(src.getAgency()));

        return dest;
    }

    public FareAttributeProperty unmarshalFareAttributeProperty(FareAttributePropertyType src) throws MissingADESchemaException {
        FareAttributeProperty dest = new FareAttributeProperty();

        if (src.isSetFareAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getFareAttribute());
            if (object instanceof FareAttribute)
                dest.setObject((FareAttribute) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private FareRule unmarshalFareRule(FareRuleType src) throws MissingADESchemaException {
        FareRule dest = new FareRule();

        if (src.isSetOriginId())
            dest.setOriginId(helper.getGMLUnmarshaller().unmarshalCode(src.getOriginId()));

        if (src.isSetDestinationId())
            dest.setDestinationId(helper.getGMLUnmarshaller().unmarshalCode(src.getDestinationId()));

        if (src.isSetContainsId())
            dest.setContainsId(helper.getGMLUnmarshaller().unmarshalCode(src.getContainsId()));

        if (src.isSetFare())
            dest.setFare(unmarshalFareAttributeProperty(src.getFare()));

        if (src.isSetRoute())
            dest.setRoute(unmarshalRouteProperty(src.getRoute()));

        return dest;
    }

    private FeedInfo unmarshalFeedInfo(FeedInfoType src) throws MissingADESchemaException {
        FeedInfo dest = new FeedInfo();

        dest.setPublisherName(src.getPublisherName());
        dest.setPublisherUrl(src.getPublisherUrl());

        if (src.isSetLanguage())
            dest.setLanguage(helper.getGMLUnmarshaller().unmarshalCode(src.getLanguage()));

        if (src.isSetDefaultLanguage())
            dest.setDefaultLanguage(helper.getGMLUnmarshaller().unmarshalCode(src.getDefaultLanguage()));

        if (src.isSetStartDate())
            dest.setStartDate(src.getStartDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetEndDate())
            dest.setEndDate(src.getEndDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setVersion(src.getVersion());
        dest.setContactEmail(src.getContactEmail());
        dest.setContactURL(src.getContactURL());
        dest.setDetailedInfo(src.getDetailedInfo());

        return dest;
    }

    private Frequency unmarshalFrequency(FrequencyType src) throws MissingADESchemaException {
        Frequency dest = new Frequency();

        if (src.isSetStartTime())
            dest.setStartTime(src.getStartTime().toGregorianCalendar().toZonedDateTime().toLocalTime());

        if (src.isSetEndTime())
            dest.setEndTime(src.getEndTime().toGregorianCalendar().toZonedDateTime().toLocalTime());

        if (src.isSetHeadwaySecs())
            dest.setHeadwaySecs(src.getHeadwaySecs().intValue());

        if (src.isSetExactTimes())
            dest.setExactTimes(helper.getGMLUnmarshaller().unmarshalCode(src.getExactTimes()));

        if (src.isSetTrip())
            dest.setTrip(unmarshalTripProperty(src.getTrip()));

        return dest;
    }

    public Level unmarshalLevel(LevelType src) throws MissingADESchemaException {
        Level dest = new Level();
        unmarshalPublicTransit(src, dest);

        dest.setIndex(src.getIndex());

        return dest;
    }

    public LevelProperty unmarshalLevelProperty(LevelPropertyType src) throws MissingADESchemaException {
        LevelProperty dest = new LevelProperty();

        if (src.isSetLevel()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getLevel());
            if (object instanceof Level)
                dest.setObject((Level) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Office unmarshalOffice(OfficeType src) throws MissingADESchemaException {
        Office dest = new Office();
        unmarshalPublicTransit(src, dest);

        dest.setOfficeName(src.getOfficeName());
        dest.setUrl(src.getUrl());
        dest.setPhone(src.getPhone());

        return dest;
    }

    public OfficeProperty unmarshalOfficeProperty(OfficePropertyType src) throws MissingADESchemaException {
        OfficeProperty dest = new OfficeProperty();

        if (src.isSetOffice()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getOffice());
            if (object instanceof Office)
                dest.setObject((Office) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Pathway unmarshalPathway(PathwayType src) throws MissingADESchemaException {
        Pathway dest = new Pathway();
        unmarshalPublicTransit(src, dest);

        if (src.isSetMode())
            dest.setMode(helper.getGMLUnmarshaller().unmarshalCode(src.getMode()));

        if (src.isSetIsBidirectional())
            dest.setIsBidirectional(helper.getGMLUnmarshaller().unmarshalCode(src.getIsBidirectional()));

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetTraversalTime())
            dest.setTraversalTime(src.getTraversalTime().intValue());

        if (src.isSetStairCount())
            dest.setStairCount(src.getStairCount().intValue());

        dest.setMaxSlope(src.getMaxSlope());
        dest.setMinWidth(src.getMinWidth());
        dest.setSignpostedAs(src.getSignpostedAs());
        dest.setReversedSignpostedAs(src.getReversedSignpostedAs());

        if (src.isSetFrom())
            dest.setFrom(unmarshalStopProperty(src.getFrom()));

        if (src.isSetTo())
            dest.setTo(unmarshalStopProperty(src.getTo()));

        return dest;
    }

    private Point unmarshalPoint(PointType src) throws MissingADESchemaException {
        Point dest = new Point();

        dest.setLatitude(src.getLatitude());
        dest.setLongitude(src.getLongitude());

        if (src.isSetPoint())
            dest.setPoint(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getPoint()));

        if (src.isSetPointSequence())
            dest.setPointSequence(src.getPointSequence().intValue());

        dest.setPointDistanceTraveled(src.getPointDistanceTraveled());

        return dest;
    }

    private PointProperty unmarshalPointProperty(PointPropertyType src) throws MissingADESchemaException {
        PointProperty dest = new PointProperty();

        if (src.isSetPoint())
            dest.setObject(unmarshalPoint(src.getPoint()));

        return dest;
    }

    private PublicTransitDataTypeProperty unmarshalPublicTransitDataTypeProperty(PublicTransitDataTypePropertyType src) throws MissingADESchemaException {
        PublicTransitDataTypeProperty dest = new PublicTransitDataTypeProperty();

        if (src.isSet_PublicTransitDataType()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.get_PublicTransitDataType());
            if (object instanceof PublicTransitDataType)
                dest.setObject((PublicTransitDataType) object);
        }

        return dest;
    }

    public PublicTransitProperty unmarshalPublicTransitProperty(PublicTransitPropertyType src) throws MissingADESchemaException {
        PublicTransitProperty dest = new PublicTransitProperty();

        if (src.isSet_PublicTransit()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.get_PublicTransit());
            if (object instanceof PublicTransit)
                dest.setObject((PublicTransit) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Route unmarshalRoute(RouteType src) throws MissingADESchemaException {
        Route dest = new Route();
        unmarshalPublicTransit(src, dest);

        dest.setShortName(src.getShortName());
        dest.setLongName(src.getLongName());

        if (src.isSetRouteDescription())
            dest.setRouteDescription(unmarshalDescriptionProperty(src.getRouteDescription()));

        if (src.isSetType())
            dest.setType(helper.getGMLUnmarshaller().unmarshalCode(src.getType()));

        dest.setUrl(src.getUrl());
        dest.setColor(src.getColor());
        dest.setTextColor(src.getTextColor());

        if (src.isSetUpdateDate())
            dest.setUpdateDate(src.getUpdateDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setOriginStop(src.getOriginStop());
        dest.setViaStop(src.getViaStop());
        dest.setDestinationStop(src.getDestinationStop());

        if (src.isSetRouteSortOrder())
            dest.setRouteSortOrder(src.getRouteSortOrder().intValue());

        if (src.isSetContinuousPickup())
            dest.setContinuousPickup(helper.getGMLUnmarshaller().unmarshalCode(src.getContinuousPickup()));

        if (src.isSetContinuousDropOff())
            dest.setContinuousDropOff(helper.getGMLUnmarshaller().unmarshalCode(src.getContinuousDropOff()));

        if (src.isSetAgency())
            dest.setAgency(unmarshalAgencyProperty(src.getAgency()));

        if (src.isSetParentRoute())
            dest.setParentRoute(unmarshalRouteProperty(src.getParentRoute()));

        if (src.isSetLod0MultiCurve())
            dest.setLod0MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod0MultiCurve()));

        return dest;
    }

    public RouteProperty unmarshalRouteProperty(RoutePropertyType src) throws MissingADESchemaException {
        RouteProperty dest = new RouteProperty();

        if (src.isSetRoute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getRoute());
            if (object instanceof Route)
                dest.setObject((Route) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Shape unmarshalShape(ShapeType src) throws MissingADESchemaException {
        Shape dest = new Shape();
        unmarshalPublicTransit(src, dest);

        if (src.isSetPoint()) {
            for (PointPropertyType property : src.getPoint())
                dest.getPoints().add(unmarshalPointProperty(property));
        }

        return dest;
    }

    public ShapeProperty unmarshalShapeProperty(ShapePropertyType src) throws MissingADESchemaException {
        ShapeProperty dest = new ShapeProperty();

        if (src.isSetShape()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getShape());
            if (object instanceof Shape)
                dest.setObject((Shape) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    public Stop unmarshalStop(StopType src) throws MissingADESchemaException {
        Stop dest = new Stop();
        unmarshalPublicTransit(src, dest);

        if (src.isSetCode())
            dest.setCode(helper.getGMLUnmarshaller().unmarshalCode(src.getCode()));

        dest.setTtsName(src.getTtsName());
        dest.setLatitude(src.getLatitude());
        dest.setLongitude(src.getLongitude());

        if (src.isSetZoneId())
            dest.setZoneId(helper.getGMLUnmarshaller().unmarshalCode(src.getZoneId()));

        dest.setUrl(src.getUrl());

        if (src.isSetLocationType())
            dest.setLocationType(helper.getGMLUnmarshaller().unmarshalCode(src.getLocationType()));

        if (src.isSetTimeZone())
            dest.setTimeZone(helper.getGMLUnmarshaller().unmarshalCode(src.getTimeZone()));

        if (src.isSetWheelchairBoarding())
            dest.setWheelchairBoarding(helper.getGMLUnmarshaller().unmarshalCode(src.getWheelchairBoarding()));

        dest.setPlatformCode(src.getPlatformCode());

        if (src.isSetPoint())
            dest.setPoint(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getPoint()));

        if (src.isSetParentStation())
            dest.setParentStation(unmarshalStopProperty(src.getParentStation()));

        if (src.isSetLevel())
            dest.setLevel(unmarshalLevelProperty(src.getLevel()));

        return dest;
    }

    public StopProperty unmarshalStopProperty(StopPropertyType src) throws MissingADESchemaException {
        StopProperty dest = new StopProperty();

        if (src.isSetStop()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getStop());
            if (object instanceof Stop)
                dest.setObject((Stop) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private StopTime unmarshalStopTime(StopTimeType src) throws MissingADESchemaException {
        StopTime dest = new StopTime();

        if (src.isSetArrivalTime())
            dest.setArrivalTime(src.getArrivalTime().toGregorianCalendar().toZonedDateTime().toLocalTime());

        if (src.isSetDepartureTime())
            dest.setDepartureTime(src.getDepartureTime().toGregorianCalendar().toZonedDateTime().toLocalTime());

        if (src.isSetStopSequence())
            dest.setStopSequence(src.getStopSequence().intValue());

        dest.setHeadsign(src.getHeadsign());

        if (src.isSetPickupType())
            dest.setPickupType(helper.getGMLUnmarshaller().unmarshalCode(src.getPickupType()));

        if (src.isSetDropoffType())
            dest.setDropoffType(helper.getGMLUnmarshaller().unmarshalCode(src.getDropoffType()));

        if (src.isSetContinuousPickupType())
            dest.setContinuousDropoffType(helper.getGMLUnmarshaller().unmarshalCode(src.getContinuousPickupType()));

        if (src.isSetContinuousDropoffType())
            dest.setContinuousDropoffType(helper.getGMLUnmarshaller().unmarshalCode(src.getContinuousDropoffType()));

        dest.setShapeDistanceTraveled(src.getShapeDistanceTraveled());

        if (src.isSetTimePoint())
            dest.setTimePoint(helper.getGMLUnmarshaller().unmarshalCode(src.getTimePoint()));

        if (src.isSetTrip())
            dest.setTrip(unmarshalTripProperty(src.getTrip()));

        if (src.isSetStop())
            dest.setStop(unmarshalStopProperty(src.getStop()));

        return dest;
    }

    public TargetProperty unmarshalTargetProperty(TargetPropertyType src) throws MissingADESchemaException {
        TargetProperty dest = new TargetProperty();

        if (src.isSet_CityObject()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.get_CityObject());
            if (object instanceof AbstractCityObject)
                dest.setObject((AbstractCityObject) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Transfer unmarshalTransfer(TransferType src) throws MissingADESchemaException {
        Transfer dest = new Transfer();

        if (src.isSetTransferType())
            dest.setTransferType(helper.getGMLUnmarshaller().unmarshalCode(src.getTransferType()));

        if (src.isSetMinTransferTime())
            dest.setMinTransferTime(src.getMinTransferTime().intValue());

        if (src.isSetFrom())
            dest.setFrom(unmarshalStopProperty(src.getFrom()));

        if (src.isSetTo())
            dest.setTo(unmarshalStopProperty(src.getTo()));

        return dest;
    }

    private Translation unmarshalTranslation(TranslationType src) throws MissingADESchemaException {
        Translation dest = new Translation();

        if (src.isSetTableName())
            dest.setTableName(helper.getGMLUnmarshaller().unmarshalCode(src.getTableName()));

        dest.setFieldName(src.getFieldName());

        if (src.isSetLanguage())
            dest.setLanguage(helper.getGMLUnmarshaller().unmarshalCode(src.getLanguage()));

        dest.setTranslation(src.getTranslation());
        dest.setFieldValue(src.getFieldValue());

        if (src.isSetRecordId())
            dest.setRecordId(unmarshalPublicTransitProperty(src.getRecordId()));

        dest.setRecordSubId(src.getRecordSubId());

        return dest;
    }

    public TranslationJP unmarshalTranslationJP(TranslationJPType src) throws MissingADESchemaException {
        TranslationJP dest = new TranslationJP();
        unmarshalPublicTransit(src, dest);

        if (src.isSetLanguage())
            dest.setLanguage(helper.getGMLUnmarshaller().unmarshalCode(src.getLanguage()));

        dest.setTranslation(src.getTranslation());

        return dest;
    }

    public Trip unmarshalTrip(TripType src) throws MissingADESchemaException {
        Trip dest = new Trip();
        unmarshalPublicTransit(src, dest);

        dest.setHeadsign(src.getHeadsign());
        dest.setShortName(src.getShortName());

        if (src.isSetDirectionId())
            dest.setDirectionId(helper.getGMLUnmarshaller().unmarshalCode(src.getDirectionId()));

        dest.setBlockId(src.getBlockId());

        if (src.isSetWheelchairAccessible())
            dest.setWheelchairAccessible(helper.getGMLUnmarshaller().unmarshalCode(src.getWheelchairAccessible()));

        if (src.isSetBikeAllowed())
            dest.setBikeAllowed(helper.getGMLUnmarshaller().unmarshalCode(src.getBikeAllowed()));

        dest.setSymbol(src.getSymbol());

        if (src.isSetRoute())
            dest.setRoute(unmarshalRouteProperty(src.getRoute()));

        if (src.isSetCalendar())
            dest.setCalendar(unmarshalCalendarProperty(src.getCalendar()));

        if (src.isSetCalendarDate())
            dest.setCalendarDate(unmarshalCalendarDateProperty(src.getCalendarDate()));

        if (src.isSetOffice())
            dest.setOffice(unmarshalOfficeProperty(src.getOffice()));

        if (src.isSetShape())
            dest.setShape(unmarshalShapeProperty(src.getShape()));

        if (src.isSetLod0MultiCurve())
            dest.setLod0MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod0MultiCurve()));

        return dest;
    }

    public TripProperty unmarshalTripProperty(TripPropertyType src) throws MissingADESchemaException {
        TripProperty dest = new TripProperty();

        if (src.isSetTrip()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getTrip());
            if (object instanceof Trip)
                dest.setObject((Trip) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }
}
