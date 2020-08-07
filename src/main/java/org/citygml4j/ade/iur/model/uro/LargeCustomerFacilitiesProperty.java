package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class LargeCustomerFacilitiesProperty extends AssociationByRep<LargeCustomerFacilities> implements ADEModelObject {

    public LargeCustomerFacilitiesProperty() {
        super();
    }

    public LargeCustomerFacilitiesProperty(LargeCustomerFacilities object) {
        super(object);
    }

    @Override
    public Class<LargeCustomerFacilities> getAssociableClass() {
        return LargeCustomerFacilities.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LargeCustomerFacilitiesProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LargeCustomerFacilitiesProperty copy = (target == null) ? new LargeCustomerFacilitiesProperty() : (LargeCustomerFacilitiesProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
