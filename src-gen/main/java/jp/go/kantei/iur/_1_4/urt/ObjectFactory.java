//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kantei.iur._1_4.urt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName __PublicTransit_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "_PublicTransit");
    private final static QName _Route_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Route");
    private final static QName _Description_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Description");
    private final static QName _Agency_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Agency");
    private final static QName _Stop_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Stop");
    private final static QName _Level_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Level");
    private final static QName _Trip_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Trip");
    private final static QName _Shape_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Shape");
    private final static QName _Point_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Point");
    private final static QName _Office_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Office");
    private final static QName _Calendar_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Calendar");
    private final static QName _CalendarDate_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "CalendarDate");
    private final static QName _FareAttribute_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "FareAttribute");
    private final static QName _Pathway_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Pathway");
    private final static QName _TranslationJP_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "TranslationJP");
    private final static QName _Attribution_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Attribution");
    private final static QName __PublicTransitDataType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "_PublicTransitDataType");
    private final static QName _FeedInfo_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "FeedInfo");
    private final static QName _Translation_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Translation");
    private final static QName _Transfer_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Transfer");
    private final static QName _Frequency_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "Frequency");
    private final static QName _StopTime_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "StopTime");
    private final static QName _FareRule_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "FareRule");
    private final static QName _DataType_QNAME = new QName("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", "dataType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kantei.iur._1_4.urt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteType }
     * 
     */
    public RouteType createRouteType() {
        return new RouteType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link AgencyType }
     * 
     */
    public AgencyType createAgencyType() {
        return new AgencyType();
    }

    /**
     * Create an instance of {@link StopType }
     * 
     */
    public StopType createStopType() {
        return new StopType();
    }

    /**
     * Create an instance of {@link LevelType }
     * 
     */
    public LevelType createLevelType() {
        return new LevelType();
    }

    /**
     * Create an instance of {@link TripType }
     * 
     */
    public TripType createTripType() {
        return new TripType();
    }

    /**
     * Create an instance of {@link ShapeType }
     * 
     */
    public ShapeType createShapeType() {
        return new ShapeType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link OfficeType }
     * 
     */
    public OfficeType createOfficeType() {
        return new OfficeType();
    }

    /**
     * Create an instance of {@link CalendarType }
     * 
     */
    public CalendarType createCalendarType() {
        return new CalendarType();
    }

    /**
     * Create an instance of {@link CalendarDateType }
     * 
     */
    public CalendarDateType createCalendarDateType() {
        return new CalendarDateType();
    }

    /**
     * Create an instance of {@link FareAttributeType }
     * 
     */
    public FareAttributeType createFareAttributeType() {
        return new FareAttributeType();
    }

    /**
     * Create an instance of {@link PathwayType }
     * 
     */
    public PathwayType createPathwayType() {
        return new PathwayType();
    }

    /**
     * Create an instance of {@link TranslationJPType }
     * 
     */
    public TranslationJPType createTranslationJPType() {
        return new TranslationJPType();
    }

    /**
     * Create an instance of {@link AttributionType }
     * 
     */
    public AttributionType createAttributionType() {
        return new AttributionType();
    }

    /**
     * Create an instance of {@link FeedInfoType }
     * 
     */
    public FeedInfoType createFeedInfoType() {
        return new FeedInfoType();
    }

    /**
     * Create an instance of {@link TranslationType }
     * 
     */
    public TranslationType createTranslationType() {
        return new TranslationType();
    }

    /**
     * Create an instance of {@link TransferType }
     * 
     */
    public TransferType createTransferType() {
        return new TransferType();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link StopTimeType }
     * 
     */
    public StopTimeType createStopTimeType() {
        return new StopTimeType();
    }

    /**
     * Create an instance of {@link FareRuleType }
     * 
     */
    public FareRuleType createFareRuleType() {
        return new FareRuleType();
    }

    /**
     * Create an instance of {@link PublicTransitDataTypePropertyType }
     * 
     */
    public PublicTransitDataTypePropertyType createPublicTransitDataTypePropertyType() {
        return new PublicTransitDataTypePropertyType();
    }

    /**
     * Create an instance of {@link PublicTransitPropertyType }
     * 
     */
    public PublicTransitPropertyType createPublicTransitPropertyType() {
        return new PublicTransitPropertyType();
    }

    /**
     * Create an instance of {@link TargetPropertyType }
     * 
     */
    public TargetPropertyType createTargetPropertyType() {
        return new TargetPropertyType();
    }

    /**
     * Create an instance of {@link RoutePropertyType }
     * 
     */
    public RoutePropertyType createRoutePropertyType() {
        return new RoutePropertyType();
    }

    /**
     * Create an instance of {@link DescriptionPropertyType }
     * 
     */
    public DescriptionPropertyType createDescriptionPropertyType() {
        return new DescriptionPropertyType();
    }

    /**
     * Create an instance of {@link AgencyPropertyType }
     * 
     */
    public AgencyPropertyType createAgencyPropertyType() {
        return new AgencyPropertyType();
    }

    /**
     * Create an instance of {@link StopPropertyType }
     * 
     */
    public StopPropertyType createStopPropertyType() {
        return new StopPropertyType();
    }

    /**
     * Create an instance of {@link LevelPropertyType }
     * 
     */
    public LevelPropertyType createLevelPropertyType() {
        return new LevelPropertyType();
    }

    /**
     * Create an instance of {@link TripPropertyType }
     * 
     */
    public TripPropertyType createTripPropertyType() {
        return new TripPropertyType();
    }

    /**
     * Create an instance of {@link ShapePropertyType }
     * 
     */
    public ShapePropertyType createShapePropertyType() {
        return new ShapePropertyType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link OfficePropertyType }
     * 
     */
    public OfficePropertyType createOfficePropertyType() {
        return new OfficePropertyType();
    }

    /**
     * Create an instance of {@link CalendarPropertyType }
     * 
     */
    public CalendarPropertyType createCalendarPropertyType() {
        return new CalendarPropertyType();
    }

    /**
     * Create an instance of {@link CalendarDatePropertyType }
     * 
     */
    public CalendarDatePropertyType createCalendarDatePropertyType() {
        return new CalendarDatePropertyType();
    }

    /**
     * Create an instance of {@link FareAttributePropertyType }
     * 
     */
    public FareAttributePropertyType createFareAttributePropertyType() {
        return new FareAttributePropertyType();
    }

    /**
     * Create an instance of {@link PathwayPropertyType }
     * 
     */
    public PathwayPropertyType createPathwayPropertyType() {
        return new PathwayPropertyType();
    }

    /**
     * Create an instance of {@link TranslationJPPropertyType }
     * 
     */
    public TranslationJPPropertyType createTranslationJPPropertyType() {
        return new TranslationJPPropertyType();
    }

    /**
     * Create an instance of {@link AttributionPropertyType }
     * 
     */
    public AttributionPropertyType createAttributionPropertyType() {
        return new AttributionPropertyType();
    }

    /**
     * Create an instance of {@link FeedInfoPropertyType }
     * 
     */
    public FeedInfoPropertyType createFeedInfoPropertyType() {
        return new FeedInfoPropertyType();
    }

    /**
     * Create an instance of {@link TranslationPropertyType }
     * 
     */
    public TranslationPropertyType createTranslationPropertyType() {
        return new TranslationPropertyType();
    }

    /**
     * Create an instance of {@link TransferPropertyType }
     * 
     */
    public TransferPropertyType createTransferPropertyType() {
        return new TransferPropertyType();
    }

    /**
     * Create an instance of {@link FrequencyPropertyType }
     * 
     */
    public FrequencyPropertyType createFrequencyPropertyType() {
        return new FrequencyPropertyType();
    }

    /**
     * Create an instance of {@link StopTimePropertyType }
     * 
     */
    public StopTimePropertyType createStopTimePropertyType() {
        return new StopTimePropertyType();
    }

    /**
     * Create an instance of {@link FareRulePropertyType }
     * 
     */
    public FareRulePropertyType createFareRulePropertyType() {
        return new FareRulePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "_PublicTransit", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<PublicTransitType> create_PublicTransit(PublicTransitType value) {
        return new JAXBElement<PublicTransitType>(__PublicTransit_QNAME, PublicTransitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Route", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<RouteType> createRoute(RouteType value) {
        return new JAXBElement<RouteType>(_Route_QNAME, RouteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Agency", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<AgencyType> createAgency(AgencyType value) {
        return new JAXBElement<AgencyType>(_Agency_QNAME, AgencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Stop", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<StopType> createStop(StopType value) {
        return new JAXBElement<StopType>(_Stop_QNAME, StopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Level", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<LevelType> createLevel(LevelType value) {
        return new JAXBElement<LevelType>(_Level_QNAME, LevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Trip", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<TripType> createTrip(TripType value) {
        return new JAXBElement<TripType>(_Trip_QNAME, TripType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Shape", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<ShapeType> createShape(ShapeType value) {
        return new JAXBElement<ShapeType>(_Shape_QNAME, ShapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Point")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Office", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<OfficeType> createOffice(OfficeType value) {
        return new JAXBElement<OfficeType>(_Office_QNAME, OfficeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Calendar", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<CalendarType> createCalendar(CalendarType value) {
        return new JAXBElement<CalendarType>(_Calendar_QNAME, CalendarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "CalendarDate", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<CalendarDateType> createCalendarDate(CalendarDateType value) {
        return new JAXBElement<CalendarDateType>(_CalendarDate_QNAME, CalendarDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "FareAttribute", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<FareAttributeType> createFareAttribute(FareAttributeType value) {
        return new JAXBElement<FareAttributeType>(_FareAttribute_QNAME, FareAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Pathway", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<PathwayType> createPathway(PathwayType value) {
        return new JAXBElement<PathwayType>(_Pathway_QNAME, PathwayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "TranslationJP", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<TranslationJPType> createTranslationJP(TranslationJPType value) {
        return new JAXBElement<TranslationJPType>(_TranslationJP_QNAME, TranslationJPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Attribution", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransit")
    public JAXBElement<AttributionType> createAttribution(AttributionType value) {
        return new JAXBElement<AttributionType>(_Attribution_QNAME, AttributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "_PublicTransitDataType")
    public JAXBElement<PublicTransitDataTypeType> create_PublicTransitDataType(PublicTransitDataTypeType value) {
        return new JAXBElement<PublicTransitDataTypeType>(__PublicTransitDataType_QNAME, PublicTransitDataTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "FeedInfo", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<FeedInfoType> createFeedInfo(FeedInfoType value) {
        return new JAXBElement<FeedInfoType>(_FeedInfo_QNAME, FeedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Translation", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<TranslationType> createTranslation(TranslationType value) {
        return new JAXBElement<TranslationType>(_Translation_QNAME, TranslationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Transfer", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<TransferType> createTransfer(TransferType value) {
        return new JAXBElement<TransferType>(_Transfer_QNAME, TransferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "Frequency", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<FrequencyType> createFrequency(FrequencyType value) {
        return new JAXBElement<FrequencyType>(_Frequency_QNAME, FrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "StopTime", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<StopTimeType> createStopTime(StopTimeType value) {
        return new JAXBElement<StopTimeType>(_StopTime_QNAME, StopTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "FareRule", substitutionHeadNamespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", substitutionHeadName = "_PublicTransitDataType")
    public JAXBElement<FareRuleType> createFareRule(FareRuleType value) {
        return new JAXBElement<FareRuleType>(_FareRule_QNAME, FareRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransitDataTypePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransitDataTypePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4", name = "dataType", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<PublicTransitDataTypePropertyType> createDataType(PublicTransitDataTypePropertyType value) {
        return new JAXBElement<PublicTransitDataTypePropertyType>(_DataType_QNAME, PublicTransitDataTypePropertyType.class, null, value);
    }

}
