package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

import java.time.Year;

public class NumberOfAnnualDiversions extends AbstractDataType {
    private Year year;
    private Integer count;
    private Measure area;

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count != null && count >= 0 ? count : null;
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        NumberOfAnnualDiversions copy = target == null ? new NumberOfAnnualDiversions() : (NumberOfAnnualDiversions) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NumberOfAnnualDiversions(), copyBuilder);
    }
}
