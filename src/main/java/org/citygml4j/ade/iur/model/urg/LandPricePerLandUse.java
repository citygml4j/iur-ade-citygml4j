package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

public class LandPricePerLandUse extends AbstractDataType {
    private Code landUse;
    private Integer landPrice;
    private Code currencyUnit;

    public Code getLandUse() {
        return landUse;
    }

    public void setLandUse(Code landUse) {
        this.landUse = ModelObjects.setParent(landUse, this);
    }

    public Integer getLandPrice() {
        return landPrice;
    }

    public void setLandPrice(Integer landPrice) {
        this.landPrice = landPrice;
    }

    public Code getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(Code currencyUnit) {
        this.currencyUnit = ModelObjects.setParent(currencyUnit, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPricePerLandUse copy = target == null ? new LandPricePerLandUse() : (LandPricePerLandUse) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPricePerLandUse(), copyBuilder);
    }
}
