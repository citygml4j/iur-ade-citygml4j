package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class PublicTransportationAccessibility extends StatisticalGrid {
    private Boolean availability;

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicTransportationAccessibility copy = target == null ? new PublicTransportationAccessibility() : (PublicTransportationAccessibility) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PublicTransportationAccessibility(), copyBuilder);
    }
}
