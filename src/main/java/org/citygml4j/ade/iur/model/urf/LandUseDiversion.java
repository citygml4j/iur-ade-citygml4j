package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;

public class LandUseDiversion extends UrbanFunction {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandUseDiversion(), copyBuilder);
    }
}
