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

package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalTime;

public class StopTime extends PublicTransitDataType {
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private Integer stopSequence;
    private String headsign;
    private Code pickupType;
    private Code dropoffType;
    private Code continuousPickupType;
    private Code continuousDropoffType;
    private Double shapeDistanceTraveled;
    private Code timePoint;
    private TripProperty trip;
    private StopProperty stop;

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public Code getPickupType() {
        return pickupType;
    }

    public void setPickupType(Code pickupType) {
        this.pickupType = ModelObjects.setParent(pickupType, this);
    }

    public Code getDropoffType() {
        return dropoffType;
    }

    public void setDropoffType(Code dropoffType) {
        this.dropoffType = ModelObjects.setParent(dropoffType, this);
    }

    public Code getContinuousPickupType() {
        return continuousPickupType;
    }

    public void setContinuousPickupType(Code continuousPickupType) {
        this.continuousPickupType = ModelObjects.setParent(continuousPickupType, this);
    }

    public Code getContinuousDropoffType() {
        return continuousDropoffType;
    }

    public void setContinuousDropoffType(Code continuousDropoffType) {
        this.continuousDropoffType = ModelObjects.setParent(continuousDropoffType, this);
    }

    public Double getShapeDistanceTraveled() {
        return shapeDistanceTraveled;
    }

    public void setShapeDistanceTraveled(Double shapeDistanceTraveled) {
        this.shapeDistanceTraveled = shapeDistanceTraveled;
    }

    public Code getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(Code timePoint) {
        this.timePoint = ModelObjects.setParent(timePoint, this);
    }

    public TripProperty getTrip() {
        return trip;
    }

    public void setTrip(TripProperty trip) {
        this.trip = ModelObjects.setParent(trip, this);
    }

    public StopProperty getStop() {
        return stop;
    }

    public void setStop(StopProperty stop) {
        this.stop = ModelObjects.setParent(stop, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        StopTime copy = target == null ? new StopTime() : (StopTime) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new StopTime(), copyBuilder);
    }
}
