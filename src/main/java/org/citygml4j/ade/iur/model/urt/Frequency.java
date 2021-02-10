package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalTime;

public class Frequency extends PublicTransitDataType {
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer headwaySecs;
    private Code exactTimes;
    private TripProperty trip;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getHeadwaySecs() {
        return headwaySecs;
    }

    public void setHeadwaySecs(Integer headwaySecs) {
        this.headwaySecs = headwaySecs;
    }

    public Code getExactTimes() {
        return exactTimes;
    }

    public void setExactTimes(Code exactTimes) {
        this.exactTimes = ModelObjects.setParent(exactTimes, this);
    }

    public TripProperty getTrip() {
        return trip;
    }

    public void setTrip(TripProperty trip) {
        this.trip = ModelObjects.setParent(trip, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Frequency copy = target == null ? new Frequency() : (Frequency) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Frequency(), copyBuilder);
    }
}
