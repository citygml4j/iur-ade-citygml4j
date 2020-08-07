package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.basicTypes.Code;

public class LanguageProperty extends ADEGenericApplicationProperty<Code> {

    public LanguageProperty() {
        super();
    }

    public LanguageProperty(Code value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LanguageProperty(), copyBuilder);
    }
}
