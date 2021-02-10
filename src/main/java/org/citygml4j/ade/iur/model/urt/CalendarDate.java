package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalDate;

public class CalendarDate extends PublicTransit {
    private LocalDate date;
    private Code exceptionType;
    private CalendarProperty calendar;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Code getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Code exceptionType) {
        this.exceptionType = ModelObjects.setParent(exceptionType, this);
    }

    public CalendarProperty getCalendar() {
        return calendar;
    }

    public void setCalendar(CalendarProperty calendar) {
        this.calendar = ModelObjects.setParent(calendar, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Level copy = target == null ? new Level() : (Level) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Level(), copyBuilder);
    }
}
