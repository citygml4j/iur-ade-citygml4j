/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Virtual City Systems
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

package org.citygml4j.ade.iur.model.common;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;

public abstract class AbstractKeyValuePair extends AbstractDataType {
    private Code key;
    private String stringValue;
    private Integer intValue;
    private Double doubleValue;
    private Code codeValue;
    private Measure measuredValue;
    private LocalDate dateValue;
    private String uriValue;

    public AbstractKeyValuePair() {
    }

    public AbstractKeyValuePair(Code key) {
        this.key = key;
    }

    public Code getKey() {
        return key;
    }

    public void setKey(Code key) {
        this.key = ModelObjects.setParent(key, this);
    }

    public String getStringValue() {
        return stringValue;
    }

    public boolean isSetStringValue() {
        return stringValue != null;
    }

    public void setStringValue(String stringValue) {
        unsetValue();
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public boolean isSetIntValue() {
        return intValue != null;
    }

    public void setIntValue(Integer intValue) {
        unsetValue();
        this.intValue = intValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public boolean isSetDoubleValue() {
        return doubleValue != null;
    }

    public void setDoubleValue(Double doubleValue) {
        unsetValue();
        this.doubleValue = doubleValue;
    }

    public Code getCodeValue() {
        return codeValue;
    }

    public boolean isSetCodeValue() {
        return codeValue != null;
    }

    public void setCodeValue(Code codeValue) {
        unsetValue();
        this.codeValue = ModelObjects.setParent(codeValue, this);
    }

    public Measure getMeasuredValue() {
        return measuredValue;
    }

    public boolean isSetMeasuredValue() {
        return measuredValue != null;
    }

    public void setMeasuredValue(Measure measuredValue) {
        unsetValue();
        this.measuredValue = ModelObjects.setParent(measuredValue, this);
    }

    public LocalDate getDateValue() {
        return dateValue;
    }

    public boolean isSetDateValue() {
        return dateValue != null;
    }

    public void setDateValue(LocalDate dateValue) {
        unsetValue();
        this.dateValue = dateValue;
    }

    public String getUriValue() {
        return uriValue;
    }

    public boolean isSetUriValue() {
        return uriValue != null;
    }

    public void setUriValue(String uriValue) {
        unsetValue();
        this.uriValue = uriValue;
    }

    public boolean isSetValue() {
        return stringValue != null
                || intValue != null
                || doubleValue != null
                || codeValue != null
                || measuredValue != null
                || dateValue != null
                || uriValue != null;
    }

    public void unsetValue() {
        stringValue = null;
        intValue = null;
        doubleValue = null;
        codeValue = null;
        measuredValue = null;
        dateValue = null;
        uriValue = null;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        AbstractKeyValuePair copy = (AbstractKeyValuePair) target;
        return ObjectCopier.copyTo(this, copy, AbstractKeyValuePair.class, copyBuilder);
    }
}
