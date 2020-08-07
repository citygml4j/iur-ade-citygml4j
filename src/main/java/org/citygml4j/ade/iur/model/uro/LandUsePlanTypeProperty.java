package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Code;

public class LandUsePlanTypeProperty extends ADEGenericApplicationProperty<Code> {

    public LandUsePlanTypeProperty() {
        super();
    }

    public LandUsePlanTypeProperty(Code value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandUsePlanTypeProperty(), copyBuilder);
    }
}
