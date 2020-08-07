package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Code;

public class CityProperty extends ADEGenericApplicationProperty<Code> {

    public CityProperty() {
        super();
    }

    public CityProperty(Code value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CityProperty(), copyBuilder);
    }
}
