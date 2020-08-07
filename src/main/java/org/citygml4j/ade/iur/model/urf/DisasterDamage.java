package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.gml.basicTypes.Measure;

public class DisasterDamage extends UrbanFunction {
    private Measure damagedArea;
    private Integer numberOfDamagedHouses;
    private Integer numberOfHousesFloodedAboveFloorLevel;
    private Integer numberOfHousesFloodedBelowFloorLevel;
    private Integer maximumRainfallPerHour;
    private Integer totalRainfall;

    public Measure getDamagedArea() {
        return damagedArea;
    }

    public void setDamagedArea(Measure damagedArea) {
        this.damagedArea = damagedArea;
    }

    public Integer getNumberOfDamagedHouses() {
        return numberOfDamagedHouses;
    }

    public void setNumberOfDamagedHouses(Integer numberOfDamagedHouses) {
        this.numberOfDamagedHouses = numberOfDamagedHouses != null && numberOfDamagedHouses >= 0 ?
                numberOfDamagedHouses : null;
    }

    public Integer getNumberOfHousesFloodedAboveFloorLevel() {
        return numberOfHousesFloodedAboveFloorLevel;
    }

    public void setNumberOfHousesFloodedAboveFloorLevel(Integer numberOfHousesFloodedAboveFloorLevel) {
        this.numberOfHousesFloodedAboveFloorLevel = numberOfHousesFloodedAboveFloorLevel != null && numberOfHousesFloodedAboveFloorLevel >= 0 ?
                numberOfHousesFloodedAboveFloorLevel : null;
    }

    public Integer getNumberOfHousesFloodedBelowFloorLevel() {
        return numberOfHousesFloodedBelowFloorLevel;
    }

    public void setNumberOfHousesFloodedBelowFloorLevel(Integer numberOfHousesFloodedBelowFloorLevel) {
        this.numberOfHousesFloodedBelowFloorLevel = numberOfHousesFloodedBelowFloorLevel != null && numberOfHousesFloodedBelowFloorLevel >= 0 ?
                numberOfHousesFloodedBelowFloorLevel : null;
    }

    public Integer getMaximumRainfallPerHour() {
        return maximumRainfallPerHour;
    }

    public void setMaximumRainfallPerHour(Integer maximumRainfallPerHour) {
        this.maximumRainfallPerHour = maximumRainfallPerHour != null && maximumRainfallPerHour >= 0 ?
                maximumRainfallPerHour : null;
    }

    public Integer getTotalRainfall() {
        return totalRainfall;
    }

    public void setTotalRainfall(Integer totalRainfall) {
        this.totalRainfall = totalRainfall != null && totalRainfall >= 0 ?
                totalRainfall : null;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DisasterDamage copy = target == null ? new DisasterDamage() : (DisasterDamage) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DisasterDamage(), copyBuilder);
    }
}
