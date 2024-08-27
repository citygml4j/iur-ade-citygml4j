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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class PopulationByAgeAndSexProperty extends AssociationByRep<PopulationByAgeAndSex> implements ADEModelObject {

    public PopulationByAgeAndSexProperty() {
        super();
    }

    public PopulationByAgeAndSexProperty(PopulationByAgeAndSex object) {
        super(object);
    }

    @Override
    public Class<PopulationByAgeAndSex> getAssociableClass() {
        return PopulationByAgeAndSex.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PopulationByAgeAndSexProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PopulationByAgeAndSexProperty copy = (target == null) ? new PopulationByAgeAndSexProperty() : (PopulationByAgeAndSexProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
