package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;

public class Agreement extends Zone {

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Agreement(), copyBuilder);
    }
}
