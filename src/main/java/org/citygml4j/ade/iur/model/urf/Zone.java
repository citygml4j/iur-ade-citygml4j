/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2020 virtualcitySYSTEMS GmbH
 * https://www.virtualcitysystems.de/
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

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

import java.time.LocalDate;

public abstract class Zone extends UrbanFunction {
    private LocalDate finalPublicationDate;
    private String areaApplied;

    public LocalDate getFinalPublicationDate() {
        return finalPublicationDate;
    }

    public void setFinalPublicationDate(LocalDate finalPublicationDate) {
        this.finalPublicationDate = finalPublicationDate;
    }

    public String getAreaApplied() {
        return areaApplied;
    }

    public void setAreaApplied(String areaApplied) {
        this.areaApplied = areaApplied;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        Zone copy = (Zone) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, Zone.class, copyBuilder);
    }
}
