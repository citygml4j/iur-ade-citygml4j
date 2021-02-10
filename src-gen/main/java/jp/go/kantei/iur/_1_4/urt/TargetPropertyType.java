//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Sep 09 19:42:42 CEST 2020
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.go.kantei.iur._1_4.urf.AdministrationType;
import jp.go.kantei.iur._1_4.urf.AgreementType;
import jp.go.kantei.iur._1_4.urf.AreaClassificationType;
import jp.go.kantei.iur._1_4.urf.CensusBlockType;
import jp.go.kantei.iur._1_4.urf.DevelopmentProjectType;
import jp.go.kantei.iur._1_4.urf.DisasterDamageType;
import jp.go.kantei.iur._1_4.urf.DisasterPreventionBaseType;
import jp.go.kantei.iur._1_4.urf.DistrictsAndZonesType;
import jp.go.kantei.iur._1_4.urf.HubCityType;
import jp.go.kantei.iur._1_4.urf.LandUsePlanType;
import jp.go.kantei.iur._1_4.urf.PollutionType;
import jp.go.kantei.iur._1_4.urf.PublicTransportationFacilityType;
import jp.go.kantei.iur._1_4.urf.RecreationsType;
import jp.go.kantei.iur._1_4.urf.RegulationType;
import jp.go.kantei.iur._1_4.urf.UrbanFunctionType;
import jp.go.kantei.iur._1_4.urf.UrbanPlanType;
import jp.go.kantei.iur._1_4.urf.UrbanizationType;
import jp.go.kantei.iur._1_4.urf.ZoneType;
import jp.go.kantei.iur._1_4.urg.GenericGridCellType;
import jp.go.kantei.iur._1_4.urg.HouseholdsType;
import jp.go.kantei.iur._1_4.urg.LandPriceType;
import jp.go.kantei.iur._1_4.urg.OfficesAndEmployeesType;
import jp.go.kantei.iur._1_4.urg.PopulationType;
import jp.go.kantei.iur._1_4.urg.PublicTransitAccessibilityType;
import jp.go.kantei.iur._1_4.urg.StatisticalGridType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.citygml._2.AbstractSiteType;
import net.opengis.citygml.bridge._2.AbstractBridgeType;
import net.opengis.citygml.bridge._2.BridgeConstructionElementType;
import net.opengis.citygml.bridge._2.BridgeFurnitureType;
import net.opengis.citygml.bridge._2.BridgeInstallationType;
import net.opengis.citygml.bridge._2.BridgePartType;
import net.opengis.citygml.bridge._2.BridgeRoomType;
import net.opengis.citygml.bridge._2.BridgeType;
import net.opengis.citygml.bridge._2.IntBridgeInstallationType;
import net.opengis.citygml.building._2.AbstractBuildingType;
import net.opengis.citygml.building._2.BuildingFurnitureType;
import net.opengis.citygml.building._2.BuildingInstallationType;
import net.opengis.citygml.building._2.BuildingPartType;
import net.opengis.citygml.building._2.BuildingType;
import net.opengis.citygml.building._2.IntBuildingInstallationType;
import net.opengis.citygml.building._2.RoomType;
import net.opengis.citygml.cityfurniture._2.CityFurnitureType;
import net.opengis.citygml.cityobjectgroup._2.CityObjectGroupType;
import net.opengis.citygml.generics._2.GenericCityObjectType;
import net.opengis.citygml.landuse._2.LandUseType;
import net.opengis.citygml.relief._2.AbstractReliefComponentType;
import net.opengis.citygml.relief._2.BreaklineReliefType;
import net.opengis.citygml.relief._2.MassPointReliefType;
import net.opengis.citygml.relief._2.RasterReliefType;
import net.opengis.citygml.relief._2.ReliefFeatureType;
import net.opengis.citygml.relief._2.TINReliefType;
import net.opengis.citygml.transportation._2.AbstractTransportationObjectType;
import net.opengis.citygml.transportation._2.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation._2.RailwayType;
import net.opengis.citygml.transportation._2.RoadType;
import net.opengis.citygml.transportation._2.SquareType;
import net.opengis.citygml.transportation._2.TrackType;
import net.opengis.citygml.transportation._2.TrafficAreaType;
import net.opengis.citygml.transportation._2.TransportationComplexType;
import net.opengis.citygml.tunnel._2.AbstractTunnelType;
import net.opengis.citygml.tunnel._2.HollowSpaceType;
import net.opengis.citygml.tunnel._2.IntTunnelInstallationType;
import net.opengis.citygml.tunnel._2.TunnelFurnitureType;
import net.opengis.citygml.tunnel._2.TunnelInstallationType;
import net.opengis.citygml.tunnel._2.TunnelPartType;
import net.opengis.citygml.tunnel._2.TunnelType;
import net.opengis.citygml.vegetation._2.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation._2.PlantCoverType;
import net.opengis.citygml.vegetation._2.SolitaryVegetationObjectType;
import net.opengis.citygml.waterbody._2.AbstractWaterBoundarySurfaceType;
import net.opengis.citygml.waterbody._2.AbstractWaterObjectType;
import net.opengis.citygml.waterbody._2.WaterBodyType;
import net.opengis.citygml.waterbody._2.WaterClosureSurfaceType;
import net.opengis.citygml.waterbody._2.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody._2.WaterSurfaceType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java-Klasse für TargetPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TargetPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/citygml/2.0}_CityObject"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPropertyType", propOrder = {
    "_CityObject"
})
public class TargetPropertyType {

    @XmlElementRef(name = "_CityObject", namespace = "http://www.opengis.net/citygml/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCityObjectType> _CityObject;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der _CityObject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterGroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolitaryVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlantCoverType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUsePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.go.kantei.iur._1_4.urf.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassPointReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TINReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BreaklineReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractReliefComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuxiliaryTrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SquareType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportationComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTransportationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericCityObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HollowSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntTunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityObjectGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeConstructionElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeRoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.go.kantei.iur._1_4.urg.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCityObjectType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCityObjectType> get_CityObject() {
        return _CityObject;
    }

    /**
     * Legt den Wert der _CityObject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterGroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolitaryVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlantCoverType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUsePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.go.kantei.iur._1_4.urf.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassPointReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TINReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BreaklineReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractReliefComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuxiliaryTrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SquareType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportationComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTransportationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericCityObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HollowSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntTunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityObjectGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeConstructionElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeRoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.go.kantei.iur._1_4.urg.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCityObjectType }{@code >}
     *     
     */
    public void set_CityObject(JAXBElement<? extends AbstractCityObjectType> value) {
        this._CityObject = value;
    }

    public boolean isSet_CityObject() {
        return (this._CityObject!= null);
    }

    /**
     * Ruft den Wert der remoteSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Legt den Wert der remoteSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}
