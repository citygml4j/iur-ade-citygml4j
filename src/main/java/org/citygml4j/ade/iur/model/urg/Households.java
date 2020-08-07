package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class Households extends StatisticalGrid {
    private Integer numberOfOrdinaryHouseholds;
    private List<NumberOfHouseholdsProperty> numberOfHouseholdsByOwnership;
    private List<NumberOfHouseholdsProperty> numberOfHouseholdsByStructure;
    private Integer numberOfMainHouseholds;

    public Integer getNumberOfOrdinaryHouseholds() {
        return numberOfOrdinaryHouseholds;
    }

    public void setNumberOfOrdinaryHouseholds(Integer numberOfOrdinaryHouseholds) {
        this.numberOfOrdinaryHouseholds = numberOfOrdinaryHouseholds;
    }

    public List<NumberOfHouseholdsProperty> getNumberOfHouseholdsByOwnership() {
        if (numberOfHouseholdsByOwnership == null)
            numberOfHouseholdsByOwnership = new ChildList<>(this);

        return numberOfHouseholdsByOwnership;
    }

    public void setNumberOfHouseholdsByOwnership(List<NumberOfHouseholdsProperty> numberOfHouseholdsByOwnership) {
        this.numberOfHouseholdsByOwnership = ModelObjects.setParent(numberOfHouseholdsByOwnership, this);
    }

    public List<NumberOfHouseholdsProperty> getNumberOfHouseholdsByStructure() {
        if (numberOfHouseholdsByStructure == null)
            numberOfHouseholdsByStructure = new ChildList<>(this);

        return numberOfHouseholdsByStructure;
    }

    public void setNumberOfHouseholdsByStructure(List<NumberOfHouseholdsProperty> numberOfHouseholdsByStructure) {
        this.numberOfHouseholdsByStructure = ModelObjects.setParent(numberOfHouseholdsByStructure, this);
    }

    public Integer getNumberOfMainHouseholds() {
        return numberOfMainHouseholds;
    }

    public void setNumberOfMainHouseholds(Integer numberOfMainHouseholds) {
        this.numberOfMainHouseholds = numberOfMainHouseholds;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Households copy = target == null ? new Households() : (Households) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Households(), copyBuilder);
    }
}
