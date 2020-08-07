package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;

public class Administration extends UrbanFunction {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Administration(), copyBuilder);
    }
}
