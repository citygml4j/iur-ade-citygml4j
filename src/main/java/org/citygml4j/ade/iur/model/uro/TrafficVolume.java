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

package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.Year;

public class TrafficVolume extends AbstractDataType {
    private Integer weekday12hourTrafficVolume;
    private Integer weekday24hourTrafficVolume;
    private Double largeVehicleRate;
    private Double congestionRate;
    private Double averageTravelSpeedInCongestion;
    private String observationPointName;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private Code prefecture;
    private Code city;
    private String reference;
    private String note;
    private Year surveyYear;

    public Integer getWeekday12hourTrafficVolume() {
        return weekday12hourTrafficVolume;
    }

    public void setWeekday12hourTrafficVolume(Integer weekday12hourTrafficVolume) {
        this.weekday12hourTrafficVolume = weekday12hourTrafficVolume;
    }

    public Integer getWeekday24hourTrafficVolume() {
        return weekday24hourTrafficVolume;
    }

    public void setWeekday24hourTrafficVolume(Integer weekday24hourTrafficVolume) {
        this.weekday24hourTrafficVolume = weekday24hourTrafficVolume;
    }

    public Double getLargeVehicleRate() {
        return largeVehicleRate;
    }

    public void setLargeVehicleRate(Double largeVehicleRate) {
        this.largeVehicleRate = largeVehicleRate;
    }

    public Double getCongestionRate() {
        return congestionRate;
    }

    public void setCongestionRate(Double congestionRate) {
        this.congestionRate = congestionRate;
    }

    public Double getAverageTravelSpeedInCongestion() {
        return averageTravelSpeedInCongestion;
    }

    public void setAverageTravelSpeedInCongestion(Double averageTravelSpeedInCongestion) {
        this.averageTravelSpeedInCongestion = averageTravelSpeedInCongestion;
    }

    public String getObservationPointName() {
        return observationPointName;
    }

    public void setObservationPointName(String observationPointName) {
        this.observationPointName = observationPointName;
    }

    public Code getUrbanPlanType() {
        return urbanPlanType;
    }

    public void setUrbanPlanType(Code urbanPlanType) {
        this.urbanPlanType = ModelObjects.setParent(urbanPlanType, this);
    }

    public Code getAreaClassificationType() {
        return areaClassificationType;
    }

    public void setAreaClassificationType(Code areaClassificationType) {
        this.areaClassificationType = ModelObjects.setParent(areaClassificationType, this);
    }

    public Code getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(Code prefecture) {
        this.prefecture = ModelObjects.setParent(prefecture, this);
    }

    public Code getCity() {
        return city;
    }

    public void setCity(Code city) {
        this.city = ModelObjects.setParent(city, this);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TrafficVolume copy = target == null ? new TrafficVolume() : (TrafficVolume) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrafficVolume(), copyBuilder);
    }
}
