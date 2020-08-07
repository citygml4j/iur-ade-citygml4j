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
    private MultiSurfaceProperty lod1MultiSurfaceGeometry;
    private MultiSurfaceProperty lod2MultiSurfaceGeometry;

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

    public MultiSurfaceProperty getLod1MultiSurfaceGeometry() {
        return lod1MultiSurfaceGeometry;
    }

    public void setLod1MultiSurfaceGeometry(MultiSurfaceProperty lod1MultiSurfaceGeometry) {
        this.lod1MultiSurfaceGeometry = ModelObjects.setParent(lod1MultiSurfaceGeometry, this);
    }

    public MultiSurfaceProperty getLod2MultiSurfaceGeometry() {
        return lod2MultiSurfaceGeometry;
    }

    public void setLod2MultiSurfaceGeometry(MultiSurfaceProperty lod2MultiSurfaceGeometry) {
        this.lod2MultiSurfaceGeometry = ModelObjects.setParent(lod2MultiSurfaceGeometry, this);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(1, lod1MultiSurfaceGeometry);
        lodRepresentation.addRepresentation(2, lod2MultiSurfaceGeometry);

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
