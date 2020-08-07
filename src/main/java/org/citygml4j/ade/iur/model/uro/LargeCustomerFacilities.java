/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2020 virtualcitySYSTEMS GmbH
 * https://www.virtualcitysystems.de/
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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

import java.time.LocalDate;
import java.time.Year;

public class LargeCustomerFacilities extends AbstractDataType {
    private Code classifier;
    private String name;
    private Integer capacity;
    private String owner;
    private Measure totalFloorArea;
    private Measure totalStoreFloorArea;
    private LocalDate inauguralDate;
    private String keyTenants;
    private Boolean availability;
    private Code urbanPlanType;
    private Code districtsAndZonesType;
    private Code landUsePlanType;
    private Code areaClassificationType;
    private Code prefecture;
    private Code city;
    private String reference;
    private String note;
    private Year surveyYear;

    public Code getClassifier() {
        return classifier;
    }

    public void setClassifier(Code classifier) {
        this.classifier = ModelObjects.setParent(classifier, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Measure getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(Measure totalFloorArea) {
        this.totalFloorArea = ModelObjects.setParent(totalFloorArea, this);
    }

    public Measure getTotalStoreFloorArea() {
        return totalStoreFloorArea;
    }

    public void setTotalStoreFloorArea(Measure totalStoreFloorArea) {
        this.totalStoreFloorArea = ModelObjects.setParent(totalStoreFloorArea, this);
    }

    public LocalDate getInauguralDate() {
        return inauguralDate;
    }

    public void setInauguralDate(LocalDate inauguralDate) {
        this.inauguralDate = inauguralDate;
    }

    public String getKeyTenants() {
        return keyTenants;
    }

    public void setKeyTenants(String keyTenants) {
        this.keyTenants = keyTenants;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Code getUrbanPlanType() {
        return urbanPlanType;
    }

    public void setUrbanPlanType(Code urbanPlanType) {
        this.urbanPlanType = ModelObjects.setParent(urbanPlanType, this);
    }

    public Code getDistrictsAndZonesType() {
        return districtsAndZonesType;
    }

    public void setDistrictsAndZonesType(Code districtsAndZonesType) {
        this.districtsAndZonesType = ModelObjects.setParent(districtsAndZonesType, this);
    }

    public Code getLandUsePlanType() {
        return landUsePlanType;
    }

    public void setLandUsePlanType(Code landUsePlanType) {
        this.landUsePlanType = ModelObjects.setParent(landUsePlanType, this);
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
        LargeCustomerFacilities copy = target == null ? new LargeCustomerFacilities() : (LargeCustomerFacilities) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LargeCustomerFacilities(), copyBuilder);
    }
}
