package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

public class NumberOfHouseholds extends AbstractDataType {
    private Code classifier;
    private Integer number;

    public NumberOfHouseholds() {
    }

    public NumberOfHouseholds(Code classifier, Integer number) {
        this.classifier = classifier;
        this.number = number;
    }

    public Code getClassifier() {
        return classifier;
    }

    public void setClassifier(Code classifier) {
        this.classifier = ModelObjects.setParent(classifier, this);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        NumberOfHouseholds copy = target == null ? new NumberOfHouseholds() : (NumberOfHouseholds) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NumberOfHouseholds(), copyBuilder);
    }
}
