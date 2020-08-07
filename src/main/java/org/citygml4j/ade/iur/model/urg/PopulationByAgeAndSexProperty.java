package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class PopulationByAgeAndSexProperty extends AssociationByRep<PopulationByAgeAndSex> implements ADEModelObject {

    public PopulationByAgeAndSexProperty() {
        super();
    }

    public PopulationByAgeAndSexProperty(PopulationByAgeAndSex object) {
        super(object);
    }

    @Override
    public Class<PopulationByAgeAndSex> getAssociableClass() {
        return PopulationByAgeAndSex.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PopulationByAgeAndSexProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PopulationByAgeAndSexProperty copy = (target == null) ? new PopulationByAgeAndSexProperty() : (PopulationByAgeAndSexProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
