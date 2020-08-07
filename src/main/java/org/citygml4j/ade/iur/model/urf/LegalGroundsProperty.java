package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class LegalGroundsProperty extends AssociationByRep<LegalGrounds> implements ADEModelObject {

    public LegalGroundsProperty() {
        super();
    }

    public LegalGroundsProperty(LegalGrounds object) {
        super(object);
    }

    @Override
    public Class<LegalGrounds> getAssociableClass() {
        return LegalGrounds.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LegalGroundsProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LegalGroundsProperty copy = (target == null) ? new LegalGroundsProperty() : (LegalGroundsProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
