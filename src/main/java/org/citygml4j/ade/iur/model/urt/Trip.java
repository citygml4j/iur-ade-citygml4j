package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.aggregates.MultiCurveProperty;

public class Trip extends PublicTransit {
    private String headsign;
    private String shortName;
    private Code directionId;
    private String blockId;
    private Code wheelchairAccessible;
    private Code bikeAllowed;
    private String symbol;
    private RouteProperty route;
    private CalendarProperty calendar;
    private CalendarDateProperty calendarDate;
    private OfficeProperty office;
    private ShapeProperty shape;
    private MultiCurveProperty lod0MultiCurve;

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Code getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Code directionId) {
        this.directionId = ModelObjects.setParent(directionId, this);
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public Code getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(Code wheelchairAccessible) {
        this.wheelchairAccessible = ModelObjects.setParent(wheelchairAccessible, this);
    }

    public Code getBikeAllowed() {
        return bikeAllowed;
    }

    public void setBikeAllowed(Code bikeAllowed) {
        this.bikeAllowed = ModelObjects.setParent(bikeAllowed, this);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public RouteProperty getRoute() {
        return route;
    }

    public void setRoute(RouteProperty route) {
        this.route = ModelObjects.setParent(route, this);
    }

    public CalendarProperty getCalendar() {
        return calendar;
    }

    public void setCalendar(CalendarProperty calendar) {
        this.calendar = ModelObjects.setParent(calendar, this);
    }

    public CalendarDateProperty getCalendarDate() {
        return calendarDate;
    }

    public void setCalendarDate(CalendarDateProperty calendarDate) {
        this.calendarDate = ModelObjects.setParent(calendarDate, this);
    }

    public OfficeProperty getOffice() {
        return office;
    }

    public void setOffice(OfficeProperty office) {
        this.office = ModelObjects.setParent(office, this);
    }

    public ShapeProperty getShape() {
        return shape;
    }

    public void setShape(ShapeProperty shape) {
        this.shape = ModelObjects.setParent(shape, this);
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
        Trip copy = target == null ? new Trip() : (Trip) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Trip(), copyBuilder);
    }
}
