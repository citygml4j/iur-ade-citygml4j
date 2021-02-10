package org.citygml4j.ade.iur.model.uro;

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
