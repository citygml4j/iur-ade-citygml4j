package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class LandUseDiversion extends StatisticalGrid {
    private List<NumberOfAnnualDiversionsProperty> numberOfAnnualDiversions;

    public List<NumberOfAnnualDiversionsProperty> getNumberOfAnnualDiversions() {
        if (numberOfAnnualDiversions == null)
            numberOfAnnualDiversions = new ChildList<>(this);

        return numberOfAnnualDiversions;
    }

    public void setNumberOfAnnualDiversions(List<NumberOfAnnualDiversionsProperty> numberOfAnnualDiversions) {
        this.numberOfAnnualDiversions = ModelObjects.setParent(numberOfAnnualDiversions, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandUseDiversion copy = target == null ? new LandUseDiversion() : (LandUseDiversion) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandUseDiversion(), copyBuilder);
    }
}
