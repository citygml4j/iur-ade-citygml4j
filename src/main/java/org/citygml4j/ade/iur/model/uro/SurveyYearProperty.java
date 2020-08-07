package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

import java.time.Year;

public class SurveyYearProperty extends ADEGenericApplicationProperty<Year> {

    public SurveyYearProperty() {
        super();
    }

    public SurveyYearProperty(Year value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SurveyYearProperty(), copyBuilder);
    }
}
