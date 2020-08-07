package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

import java.time.LocalDate;

public class LegalGrounds extends AbstractDataType {
    private Code nameOfRegulation;
    private Code articlesOfRegulation;
    private LocalDate date;

    public LegalGrounds() {
    }

    public LegalGrounds(LocalDate date) {
        this.date = date;
    }

    public Code getNameOfRegulation() {
        return nameOfRegulation;
    }

    public void setNameOfRegulation(Code nameOfRegulation) {
        this.nameOfRegulation = ModelObjects.setParent(nameOfRegulation, this);
    }

    public Code getArticlesOfRegulation() {
        return articlesOfRegulation;
    }

    public void setArticlesOfRegulation(Code articlesOfRegulation) {
        this.articlesOfRegulation = ModelObjects.setParent(articlesOfRegulation, this);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LegalGrounds copy = target == null ? new LegalGrounds() : (LegalGrounds) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LegalGrounds(), copyBuilder);
    }
}
