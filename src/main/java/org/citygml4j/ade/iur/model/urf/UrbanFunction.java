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
    private MultiSurfaceProperty area;
    private MultiCurveProperty boundary;
    private MultiPointProperty pointLocation;
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

    public MultiSurfaceProperty getArea() {
        return area;
    }

    public void setArea(MultiSurfaceProperty area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public MultiCurveProperty getBoundary() {
        return boundary;
    }

    public void setBoundary(MultiCurveProperty boundary) {
        this.boundary = ModelObjects.setParent(boundary, this);
    }

    public MultiPointProperty getPointLocation() {
        return pointLocation;
    }

    public void setPointLocation(MultiPointProperty pointLocation) {
        this.pointLocation = ModelObjects.setParent(pointLocation, this);
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
        lodRepresentation.addRepresentation(area);
        lodRepresentation.addRepresentation(boundary);
        lodRepresentation.addRepresentation(pointLocation);

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
