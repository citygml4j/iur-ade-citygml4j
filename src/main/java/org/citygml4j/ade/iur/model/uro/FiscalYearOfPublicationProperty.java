package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

import java.time.Year;

public class FiscalYearOfPublicationProperty extends ADEGenericApplicationProperty<Year> {

    public FiscalYearOfPublicationProperty() {
        super();
    }

    public FiscalYearOfPublicationProperty(Year value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FiscalYearOfPublicationProperty(), copyBuilder);
    }
}
