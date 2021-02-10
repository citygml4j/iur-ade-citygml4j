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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.Year;

public class BuildingDetails extends AbstractDataType {
    private String serialNumberOfBuildingCertification;
    private Measure siteArea;
    private Measure buildingFootprintArea;
    private Measure buildingRoofEdgeArea;
    private Measure developmentArea;
    private Measure totalFloorArea;
    private Code buildingStructureType;
    private Code fireproofStructureType;
    private String implementingBody;
    private Code urbanPlanType;
    private Code districtsAndZonesType;
    private Code landUsePlanType;
    private Code areaClassificationType;
    private Code prefecture;
    private Code city;
    private String reference;
    private String note;
    private Year surveyYear;

    public String getSerialNumberOfBuildingCertification() {
        return serialNumberOfBuildingCertification;
    }

    public void setSerialNumberOfBuildingCertification(String serialNumberOfBuildingCertification) {
        this.serialNumberOfBuildingCertification = serialNumberOfBuildingCertification;
    }

    public Measure getSiteArea() {
        return siteArea;
    }

    public void setSiteArea(Measure siteArea) {
        this.siteArea = ModelObjects.setParent(siteArea, this);
    }

    public Measure getBuildingFootprintArea() {
        return buildingFootprintArea;
    }

    public void setBuildingFootprintArea(Measure buildingFootprintArea) {
        this.buildingFootprintArea = ModelObjects.setParent(buildingFootprintArea, this);
    }

    public Measure getBuildingRoofEdgeArea() {
        return buildingRoofEdgeArea;
    }

    public void setBuildingRoofEdgeArea(Measure buildingRoofEdgeArea) {
        this.buildingRoofEdgeArea = ModelObjects.setParent(buildingRoofEdgeArea, this);
    }

    public Measure getDevelopmentArea() {
        return developmentArea;
    }

    public void setDevelopmentArea(Measure developmentArea) {
        this.developmentArea = ModelObjects.setParent(developmentArea, this);
    }

    public Measure getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(Measure totalFloorArea) {
        this.totalFloorArea = ModelObjects.setParent(totalFloorArea, this);
    }

    public Code getBuildingStructureType() {
        return buildingStructureType;
    }

    public void setBuildingStructureType(Code buildingStructureType) {
        this.buildingStructureType = ModelObjects.setParent(buildingStructureType, this);
    }

    public Code getFireproofStructureType() {
        return fireproofStructureType;
    }

    public void setFireproofStructureType(Code fireproofStructureType) {
        this.fireproofStructureType = ModelObjects.setParent(fireproofStructureType, this);
    }

    public String getImplementingBody() {
        return implementingBody;
    }

    public void setImplementingBody(String implementingBody) {
        this.implementingBody = implementingBody;
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
        BuildingDetails copy = target == null ? new BuildingDetails() : (BuildingDetails) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingDetails(), copyBuilder);
    }
}
