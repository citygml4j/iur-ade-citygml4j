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
