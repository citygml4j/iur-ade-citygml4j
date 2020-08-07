package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class OfficesAndEmployees extends StatisticalGrid {
    private Integer numberOfOffices;
    private Integer numberOfEmployees;

    public Integer getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(Integer numberOfOffices) {
        this.numberOfOffices = numberOfOffices != null && numberOfOffices >= 0 ? numberOfOffices : null;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees != null && numberOfEmployees >= 0 ? numberOfEmployees : null;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        OfficesAndEmployees copy = target == null ? new OfficesAndEmployees() : (OfficesAndEmployees) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new OfficesAndEmployees(), copyBuilder);
    }
}
