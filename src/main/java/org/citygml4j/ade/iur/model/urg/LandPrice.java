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
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;

import java.util.List;

public class LandPrice extends StatisticalGrid {
    private List<LandPricePerLandUseProperty> landPrices;
    private Code currencyUnit;

    public List<LandPricePerLandUseProperty> getLandPrices() {
        if (landPrices == null)
            landPrices = new ChildList<>(this);

        return landPrices;
    }

    public void setLandPrices(List<LandPricePerLandUseProperty> landPrices) {
        this.landPrices = ModelObjects.setParent(landPrices, this);
    }

    public Code getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(Code currencyUnit) {
        this.currencyUnit = ModelObjects.setParent(currencyUnit, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPrice copy = target == null ? new LandPrice() : (LandPrice) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPrice(), copyBuilder);
    }
}
