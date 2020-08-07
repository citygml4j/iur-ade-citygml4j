package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

import java.time.LocalDate;

public abstract class Zone extends UrbanFunction {
    private LocalDate finalPublicationDate;
    private String areaApplied;

    public LocalDate getFinalPublicationDate() {
        return finalPublicationDate;
    }

    public void setFinalPublicationDate(LocalDate finalPublicationDate) {
        this.finalPublicationDate = finalPublicationDate;
    }

    public String getAreaApplied() {
        return areaApplied;
    }

    public void setAreaApplied(String areaApplied) {
        this.areaApplied = areaApplied;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        Zone copy = (Zone) target;
        super.copyTo(copy, copyBuilder);

        return ObjectCopier.copyTo(this, copy, Zone.class, copyBuilder);
    }
}
