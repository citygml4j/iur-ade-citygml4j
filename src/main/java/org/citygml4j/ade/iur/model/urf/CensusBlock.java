package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class CensusBlock extends UrbanFunction {
    private Integer daytimePopulation;
    private Double daytimePopulationDensity;
    private Integer numberOfOrdinaryHouseholds;
    private List<NumberOfHouseholdsProperty> numberOfHouseholdsByOwnership;
    private Integer numberOfMainHouseholds;
    private List<NumberOfHouseholdsProperty> numberOfHouseholdsByStructure;

    public Integer getDaytimePopulation() {
        return daytimePopulation;
    }

    public void setDaytimePopulation(Integer daytimePopulation) {
        this.daytimePopulation = daytimePopulation;
    }

    public Double getDaytimePopulationDensity() {
        return daytimePopulationDensity;
    }

    public void setDaytimePopulationDensity(Double daytimePopulationDensity) {
        this.daytimePopulationDensity = daytimePopulationDensity;
    }

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

    public Integer getNumberOfMainHouseholds() {
        return numberOfMainHouseholds;
    }

    public void setNumberOfMainHouseholds(Integer numberOfMainHouseholds) {
        this.numberOfMainHouseholds = numberOfMainHouseholds;
    }

    public List<NumberOfHouseholdsProperty> getNumberOfHouseholdsByStructure() {
        if (numberOfHouseholdsByStructure == null)
            numberOfHouseholdsByStructure = new ChildList<>(this);

        return numberOfHouseholdsByStructure;
    }

    public void setNumberOfHouseholdsByStructure(List<NumberOfHouseholdsProperty> numberOfHouseholdsByStructure) {
        this.numberOfHouseholdsByStructure = ModelObjects.setParent(numberOfHouseholdsByStructure, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        CensusBlock copy = target == null ? new CensusBlock() : (CensusBlock) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CensusBlock(), copyBuilder);
    }
}
