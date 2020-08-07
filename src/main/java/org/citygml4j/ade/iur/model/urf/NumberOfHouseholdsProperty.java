package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class NumberOfHouseholdsProperty extends AssociationByRep<NumberOfHouseholds> implements ADEModelObject {

    public NumberOfHouseholdsProperty() {
        super();
    }

    public NumberOfHouseholdsProperty(NumberOfHouseholds object) {
        super(object);
    }

    @Override
    public Class<NumberOfHouseholds> getAssociableClass() {
        return NumberOfHouseholds.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NumberOfHouseholdsProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        NumberOfHouseholdsProperty copy = (target == null) ? new NumberOfHouseholdsProperty() : (NumberOfHouseholdsProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
