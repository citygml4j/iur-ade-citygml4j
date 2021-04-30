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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.ade.iur.model.common.AbstractKeyValuePair;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;

public class KeyValuePair extends AbstractKeyValuePair {

    public KeyValuePair() {
    }

    public KeyValuePair(Code key) {
        super(key);
    }

    public static KeyValuePair ofStringValue(Code key, String value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setStringValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofIntValue(Code key, int value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setIntValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofDoubleValue(Code key, double value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setDoubleValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofCodeValue(Code key, Code value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setCodeValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofMeasuredValue(Code key, Measure value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setMeasuredValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofDateValue(Code key, LocalDate value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setDateValue(value);
        return keyValuePair;
    }

    public static KeyValuePair ofUriValue(Code key, String value) {
        KeyValuePair keyValuePair = new KeyValuePair(key);
        keyValuePair.setUriValue(value);
        return keyValuePair;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new KeyValuePair(), copyBuilder);
    }
}
