package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class OwnerProperty extends ADEGenericApplicationProperty<String> {

    public OwnerProperty() {
        super();
    }

    public OwnerProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new OwnerProperty(), copyBuilder);
    }
}
