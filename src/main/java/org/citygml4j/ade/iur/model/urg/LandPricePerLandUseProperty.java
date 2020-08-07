package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class LandPricePerLandUseProperty extends AssociationByRep<LandPricePerLandUse> implements ADEModelObject {

    public LandPricePerLandUseProperty() {
        super();
    }

    public LandPricePerLandUseProperty(LandPricePerLandUse object) {
        super(object);
    }

    @Override
    public Class<LandPricePerLandUse> getAssociableClass() {
        return LandPricePerLandUse.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPricePerLandUseProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPricePerLandUseProperty copy = (target == null) ? new LandPricePerLandUseProperty() : (LandPricePerLandUseProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
