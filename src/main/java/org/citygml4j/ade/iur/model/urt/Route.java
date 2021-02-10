package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.aggregates.MultiCurveProperty;

import java.time.LocalDate;

public class Route extends PublicTransit {
    private String shortName;
    private String longName;
    private DescriptionProperty description;
    private Code type;
    private String url;
    private String color;
    private String textColor;
    private LocalDate updateDate;
    private String originStop;
    private String viaStop;
    private String destinationStop;
    private Integer routeSortOrder;
    private Code continuousPickup;
    private Code continuousDropOff;
    private AgencyProperty agency;
    private RouteProperty parentRoute;
    private MultiCurveProperty lod0MultiCurve;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public DescriptionProperty getRouteDescription() {
        return description;
    }

    public void setRouteDescription(DescriptionProperty description) {
        this.description = ModelObjects.setParent(description, this);
    }

    public Code getType() {
        return type;
    }

    public void setType(Code type) {
        this.type = ModelObjects.setParent(type, this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getOriginStop() {
        return originStop;
    }

    public void setOriginStop(String originStop) {
        this.originStop = originStop;
    }

    public String getViaStop() {
        return viaStop;
    }

    public void setViaStop(String viaStop) {
        this.viaStop = viaStop;
    }

    public String getDestinationStop() {
        return destinationStop;
    }

    public void setDestinationStop(String destinationStop) {
        this.destinationStop = destinationStop;
    }

    public Integer getRouteSortOrder() {
        return routeSortOrder;
    }

    public void setRouteSortOrder(Integer routeSortOrder) {
        this.routeSortOrder = routeSortOrder;
    }

    public Code getContinuousPickup() {
        return continuousPickup;
    }

    public void setContinuousPickup(Code continuousPickup) {
        this.continuousPickup = ModelObjects.setParent(continuousPickup, this);
    }

    public Code getContinuousDropOff() {
        return continuousDropOff;
    }

    public void setContinuousDropOff(Code continuousDropOff) {
        this.continuousDropOff = ModelObjects.setParent(continuousDropOff, this);
    }

    public AgencyProperty getAgency() {
        return agency;
    }

    public void setAgency(AgencyProperty agency) {
        this.agency = ModelObjects.setParent(agency, this);
    }

    public RouteProperty getParentRoute() {
        return parentRoute;
    }

    public void setParentRoute(RouteProperty parentRoute) {
        this.parentRoute = ModelObjects.setParent(parentRoute, this);
    }

    public MultiCurveProperty getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    public void setLod0MultiCurve(MultiCurveProperty lod0MultiCurve) {
        this.lod0MultiCurve = ModelObjects.setParent(lod0MultiCurve, this);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(0, lod0MultiCurve);
        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Route copy = target == null ? new Route() : (Route) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Route(), copyBuilder);
    }
}
