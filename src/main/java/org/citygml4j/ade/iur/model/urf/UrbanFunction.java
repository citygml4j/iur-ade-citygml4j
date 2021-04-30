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

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.aggregates.MultiCurveProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiPointProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public abstract class UrbanFunction extends AbstractCityObject implements ADEModelObject {
    private Code classifier;
    private List<Code> functions;
    private LocalDate enactmentDate;
    private Year enactmentFiscalYear;
    private LocalDate expirationDate;
    private Year expirationFiscalYear;
    private LegalGroundsProperty legalGrounds;
    private String custodian;
    private Measure nominalArea;
    private String _abstract;
    private Boolean validity;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private Code prefecture;
    private Code city;
    private String reference;
    private String note;
    private Year surveyYear;
    private MultiSurfaceProperty lod0MultiSurface;
    private MultiSurfaceProperty lod1MultiSurface;
    private MultiSurfaceProperty lod2MultiSurface;
    private MultiCurveProperty lod0MultiCurve;
    private MultiCurveProperty lod1MultiCurve;
    private MultiCurveProperty lod2MultiCurve;
    private MultiPointProperty lod0MultiPoint;
    private MultiPointProperty lod1MultiPoint;
    private MultiPointProperty lod2MultiPoint;
    private List<TargetProperty> targets;

    public Code getClassifier() {
        return classifier;
    }

    public void setClassifier(Code classifier) {
        this.classifier = ModelObjects.setParent(classifier, this);
    }

    public List<Code> getFunctions() {
        if (functions == null)
            functions = new ChildList<>(this);

        return functions;
    }

    public void setFunctions(List<Code> functions) {
        this.functions = ModelObjects.setParent(functions, this);
    }

    public LocalDate getEnactmentDate() {
        return enactmentDate;
    }

    public void setEnactmentDate(LocalDate enactmentDate) {
        this.enactmentDate = enactmentDate;
    }

    public Year getEnactmentFiscalYear() {
        return enactmentFiscalYear;
    }

    public void setEnactmentFiscalYear(Year enactmentFiscalYear) {
        this.enactmentFiscalYear = enactmentFiscalYear;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Year getExpirationFiscalYear() {
        return expirationFiscalYear;
    }

    public void setExpirationFiscalYear(Year expirationFiscalYear) {
        this.expirationFiscalYear = expirationFiscalYear;
    }

    public LegalGroundsProperty getLegalGrounds() {
        return legalGrounds;
    }

    public void setLegalGrounds(LegalGroundsProperty legalGrounds) {
        this.legalGrounds = ModelObjects.setParent(legalGrounds, this);
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }

    public Measure getNominalArea() {
        return nominalArea;
    }

    public void setNominalArea(Measure nominalArea) {
        this.nominalArea = ModelObjects.setParent(nominalArea, this);
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
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

    public MultiSurfaceProperty getLod0MultiSurface() {
        return lod0MultiSurface;
    }

    public void setLod0MultiSurface(MultiSurfaceProperty lod0MultiSurface) {
        this.lod0MultiSurface = ModelObjects.setParent(lod0MultiSurface, this);
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

    public MultiCurveProperty getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    public void setLod0MultiCurve(MultiCurveProperty lod0MultiCurve) {
        this.lod0MultiCurve = ModelObjects.setParent(lod0MultiCurve, this);
    }

    public MultiCurveProperty getLod1MultiCurve() {
        return lod1MultiCurve;
    }

    public void setLod1MultiCurve(MultiCurveProperty lod1MultiCurve) {
        this.lod1MultiCurve = ModelObjects.setParent(lod1MultiCurve, this);
    }

    public MultiCurveProperty getLod2MultiCurve() {
        return lod2MultiCurve;
    }

    public void setLod2MultiCurve(MultiCurveProperty lod2MultiCurve) {
        this.lod2MultiCurve = ModelObjects.setParent(lod2MultiCurve, this);
    }

    public MultiPointProperty getLod0MultiPoint() {
        return lod0MultiPoint;
    }

    public void setLod0MultiPoint(MultiPointProperty lod0MultiPoint) {
        this.lod0MultiPoint = ModelObjects.setParent(lod0MultiPoint, this);
    }

    public MultiPointProperty getLod1MultiPoint() {
        return lod1MultiPoint;
    }

    public void setLod1MultiPoint(MultiPointProperty lod1MultiPoint) {
        this.lod1MultiPoint = ModelObjects.setParent(lod1MultiPoint, this);
    }

    public MultiPointProperty getLod2MultiPoint() {
        return lod2MultiPoint;
    }

    public void setLod2MultiPoint(MultiPointProperty lod2MultiPoint) {
        this.lod2MultiPoint = ModelObjects.setParent(lod2MultiPoint, this);
    }

    public List<TargetProperty> getTargets() {
        if (targets == null)
            targets = new ChildList<>(this);

        return targets;
    }

    public void setTargets(List<TargetProperty> targets) {
        this.targets = ModelObjects.setParent(targets, this);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(0, lod0MultiSurface);
        lodRepresentation.addRepresentation(0, lod0MultiCurve);
        lodRepresentation.addRepresentation(0, lod0MultiPoint);

        lodRepresentation.addRepresentation(lod1MultiSurface);
        lodRepresentation.addRepresentation(lod2MultiSurface);
        lodRepresentation.addRepresentation(lod1MultiCurve);
        lodRepresentation.addRepresentation(lod2MultiCurve);
        lodRepresentation.addRepresentation(lod1MultiPoint);
        lodRepresentation.addRepresentation(lod2MultiPoint);

        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        UrbanFunction copy = (UrbanFunction) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UrbanFunction.class, copyBuilder);
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
