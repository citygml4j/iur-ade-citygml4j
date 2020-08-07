package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Code;

public class WidthTypeProperty extends ADEGenericApplicationProperty<Code> {

    public WidthTypeProperty() {
        super();
    }

    public WidthTypeProperty(Code value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WidthTypeProperty(), copyBuilder);
    }
}
