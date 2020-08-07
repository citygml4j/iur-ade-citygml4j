package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

public class PopulationByAgeAndSex extends AbstractDataType {
    private Code age;
    private Code sex;
    private Integer number;

    public Code getAge() {
        return age;
    }

    public void setAge(Code age) {
        this.age = ModelObjects.setParent(age, this);
    }

    public Code getSex() {
        return sex;
    }

    public void setSex(Code sex) {
        this.sex = ModelObjects.setParent(sex, this);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PopulationByAgeAndSex copy = target == null ? new PopulationByAgeAndSex() : (PopulationByAgeAndSex) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PopulationByAgeAndSex(), copyBuilder);
    }
}
