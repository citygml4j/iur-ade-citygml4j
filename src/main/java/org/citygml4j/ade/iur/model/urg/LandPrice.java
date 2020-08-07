package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class LandPrice extends StatisticalGrid {
    private List<LandPricePerLandUseProperty> landPrices;

    public List<LandPricePerLandUseProperty> getLandPrices() {
        if (landPrices == null)
            landPrices = new ChildList<>(this);

        return landPrices;
    }

    public void setLandPrices(List<LandPricePerLandUseProperty> landPrices) {
        this.landPrices = ModelObjects.setParent(landPrices, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPrice copy = target == null ? new LandPrice() : (LandPrice) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPrice(), copyBuilder);
    }
}
