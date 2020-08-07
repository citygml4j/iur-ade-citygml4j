package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class DisasterPreventionBase extends UrbanFunction {
    private Integer capacity;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DisasterPreventionBase copy = target == null ? new DisasterPreventionBase() : (DisasterPreventionBase) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DisasterPreventionBase(), copyBuilder);
    }
}
