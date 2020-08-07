package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class Population extends StatisticalGrid {
    private Integer total;
    private Integer daytimePopulation;
    private Double daytimePopulationDensity;
    private Integer naturalIncrease;
    private Integer births;
    private Integer deaths;
    private Integer socialIncrease;
    private Integer moveFrom;
    private Integer moveTo;
    private Integer increasement;
    private Integer malePopulation;
    private Integer femalePopulation;
    private List<PopulationByAgeAndSexProperty> populationByAgeAndSex;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

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

    public Integer getNaturalIncrease() {
        return naturalIncrease;
    }

    public void setNaturalIncrease(Integer naturalIncrease) {
        this.naturalIncrease = naturalIncrease;
    }

    public Integer getBirths() {
        return births;
    }

    public void setBirths(Integer births) {
        this.births = births;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getSocialIncrease() {
        return socialIncrease;
    }

    public void setSocialIncrease(Integer socialIncrease) {
        this.socialIncrease = socialIncrease;
    }

    public Integer getMoveFrom() {
        return moveFrom;
    }

    public void setMoveFrom(Integer moveFrom) {
        this.moveFrom = moveFrom;
    }

    public Integer getMoveTo() {
        return moveTo;
    }

    public void setMoveTo(Integer moveTo) {
        this.moveTo = moveTo;
    }

    public Integer getIncreasement() {
        return increasement;
    }

    public void setIncreasement(Integer increasement) {
        this.increasement = increasement;
    }

    public Integer getMalePopulation() {
        return malePopulation;
    }

    public void setMalePopulation(Integer malePopulation) {
        this.malePopulation = malePopulation;
    }

    public Integer getFemalePopulation() {
        return femalePopulation;
    }

    public void setFemalePopulation(Integer femalePopulation) {
        this.femalePopulation = femalePopulation;
    }

    public List<PopulationByAgeAndSexProperty> getPopulationByAgeAndSex() {
        if (populationByAgeAndSex == null)
            populationByAgeAndSex = new ChildList<>(this);

        return populationByAgeAndSex;
    }

    public void setPopulationByAgeAndSex(List<PopulationByAgeAndSexProperty> populationByAgeAndSex) {
        this.populationByAgeAndSex = ModelObjects.setParent(populationByAgeAndSex, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Population copy = target == null ? new Population() : (Population) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Population(), copyBuilder);
    }
}
