package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class LargeCustomerFacilitiesPropertyElement extends ADEGenericApplicationProperty<LargeCustomerFacilitiesProperty> {

    public LargeCustomerFacilitiesPropertyElement() {
        super();
    }

    public LargeCustomerFacilitiesPropertyElement(LargeCustomerFacilitiesProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LargeCustomerFacilitiesPropertyElement(), copyBuilder);
    }
}
