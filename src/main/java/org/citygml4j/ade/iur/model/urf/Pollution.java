package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Measure;

public class Pollution extends UrbanFunction {
    private Measure damagedArea;
    private String cause;

    public Measure getDamagedArea() {
        return damagedArea;
    }

    public void setDamagedArea(Measure damagedArea) {
        this.damagedArea = ModelObjects.setParent(damagedArea, this);
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Pollution copy = target == null ? new Pollution() : (Pollution) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Pollution(), copyBuilder);
    }
}
