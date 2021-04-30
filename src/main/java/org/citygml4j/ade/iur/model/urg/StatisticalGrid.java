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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;
import org.w3c.dom.Element;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public abstract class StatisticalGrid extends AbstractCityObject implements ADEModelObject {
    private Code classifier;
    private List<Element> values;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private Code prefecture;
    private Code city;
    private Year surveyYear;
    private MultiSurfaceProperty lod1MultiSurface;
    private MultiSurfaceProperty lod2MultiSurface;

    public Code getClassifier() {
        return classifier;
    }

    public void setClassifier(Code classifier) {
        this.classifier = classifier;
    }

    public List<Element> getValues() {
        if (values == null)
            values = new ArrayList<>();

        return values;
    }

    public void setValues(List<Element> values) {
        this.values = values;
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

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    public MultiSurfaceProperty getLod1MultiSurface() {
        return lod1MultiSurface;
    }

    public void setLod1MultiSurface(MultiSurfaceProperty lod1MultiSurface) {
        this.lod1MultiSurface = ModelObjects.setParent(lod1MultiSurface, this);
    }

    public MultiSurfaceProperty getLod2MultiSurface() {
        return lod2MultiSurface;
    }

    public void setLod2MultiSurface(MultiSurfaceProperty lod2MultiSurface) {
        this.lod2MultiSurface = ModelObjects.setParent(lod2MultiSurface, this);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(lod1MultiSurface);
        lodRepresentation.addRepresentation(lod2MultiSurface);
        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        StatisticalGrid copy = (StatisticalGrid) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, StatisticalGrid.class, copyBuilder);
    }

    @Override
    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
