package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

public class Translation extends PublicTransitDataType {
    private Code tableName;
    private String fieldName;
    private Code language;
    private String translation;
    private String fieldValue;
    private PublicTransitProperty recordId;
    private String recordSubId;

    public Code getTableName() {
        return tableName;
    }

    public void setTableName(Code tableName) {
        this.tableName = ModelObjects.setParent(tableName, this);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

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

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public PublicTransitProperty getRecordId() {
        return recordId;
    }

    public void setRecordId(PublicTransitProperty recordId) {
        this.recordId = ModelObjects.setParent(recordId, this);
    }

    public String getRecordSubId() {
        return recordSubId;
    }

    public void setRecordSubId(String recordSubId) {
        this.recordSubId = recordSubId;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Translation copy = target == null ? new Translation() : (Translation) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Translation(), copyBuilder);
    }
}
