package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

public class TranslationJP extends PublicTransit {
    private Code language;
    private String translation;

    public Code getLanguage() {
        return language;
    }

    public void setLanguage(Code language) {
        this.language = ModelObjects.setParent(language, this);
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TranslationJP copy = target == null ? new TranslationJP() : (TranslationJP) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TranslationJP(), copyBuilder);
    }
}
