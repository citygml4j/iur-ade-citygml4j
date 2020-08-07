package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class BuildingDetailsPropertyElement extends ADEGenericApplicationProperty<BuildingDetailsProperty> {

    public BuildingDetailsPropertyElement() {
        super();
    }

    public BuildingDetailsPropertyElement(BuildingDetailsProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingDetailsPropertyElement(), copyBuilder);
    }
}
