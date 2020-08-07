package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Measure;

public class NominalAreaProperty extends ADEGenericApplicationProperty<Measure> {

    public NominalAreaProperty() {
        super();
    }

    public NominalAreaProperty(Measure value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NominalAreaProperty(), copyBuilder);
    }
}
