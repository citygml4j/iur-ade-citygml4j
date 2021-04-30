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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class LandUseDiversion extends StatisticalGrid {
    private List<NumberOfAnnualDiversionsProperty> numberOfAnnualDiversions;
    private List<AreaOfAnnualDiversionsProperty> areaOfAnnualDiversions;

    public List<NumberOfAnnualDiversionsProperty> getNumberOfAnnualDiversions() {
        if (numberOfAnnualDiversions == null)
            numberOfAnnualDiversions = new ChildList<>(this);

        return numberOfAnnualDiversions;
    }

    public void setNumberOfAnnualDiversions(List<NumberOfAnnualDiversionsProperty> numberOfAnnualDiversions) {
        this.numberOfAnnualDiversions = ModelObjects.setParent(numberOfAnnualDiversions, this);
    }

    public List<AreaOfAnnualDiversionsProperty> getAreaOfAnnualDiversions() {
        if (areaOfAnnualDiversions == null)
            areaOfAnnualDiversions = new ChildList<>(this);

        return areaOfAnnualDiversions;
    }

    public void setAreaOfAnnualDiversions(List<AreaOfAnnualDiversionsProperty> areaOfAnnualDiversions) {
        this.areaOfAnnualDiversions = ModelObjects.setParent(areaOfAnnualDiversions, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandUseDiversion copy = target == null ? new LandUseDiversion() : (LandUseDiversion) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandUseDiversion(), copyBuilder);
    }
}
