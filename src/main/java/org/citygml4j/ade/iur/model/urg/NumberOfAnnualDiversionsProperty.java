package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class NumberOfAnnualDiversionsProperty extends AssociationByRep<NumberOfAnnualDiversions> implements ADEModelObject {

    public NumberOfAnnualDiversionsProperty() {
        super();
    }

    public NumberOfAnnualDiversionsProperty(NumberOfAnnualDiversions object) {
        super(object);
    }

    @Override
    public Class<NumberOfAnnualDiversions> getAssociableClass() {
        return NumberOfAnnualDiversions.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NumberOfAnnualDiversionsProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        NumberOfAnnualDiversionsProperty copy = (target == null) ? new NumberOfAnnualDiversionsProperty() : (NumberOfAnnualDiversionsProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
