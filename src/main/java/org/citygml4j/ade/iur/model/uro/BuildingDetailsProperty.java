package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class BuildingDetailsProperty extends AssociationByRep<BuildingDetails> implements ADEModelObject {

    public BuildingDetailsProperty() {
        super();
    }

    public BuildingDetailsProperty(BuildingDetails object) {
        super(object);
    }

    @Override
    public Class<BuildingDetails> getAssociableClass() {
        return BuildingDetails.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingDetailsProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        BuildingDetailsProperty copy = (target == null) ? new BuildingDetailsProperty() : (BuildingDetailsProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
