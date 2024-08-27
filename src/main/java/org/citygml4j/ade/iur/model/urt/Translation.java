/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Virtual City Systems
 * https://vc.systems/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
