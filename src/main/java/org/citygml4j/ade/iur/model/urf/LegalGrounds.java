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
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.ade.iur.model.common.AbstractDataType;

import java.time.LocalDate;

public class LegalGrounds extends AbstractDataType {
    private Code nameOfRegulation;
    private Code articlesOfRegulation;
    private LocalDate date;

    public LegalGrounds() {
    }

    public LegalGrounds(LocalDate date) {
        this.date = date;
    }

    public Code getNameOfRegulation() {
        return nameOfRegulation;
    }

    public void setNameOfRegulation(Code nameOfRegulation) {
        this.nameOfRegulation = ModelObjects.setParent(nameOfRegulation, this);
    }

    public Code getArticlesOfRegulation() {
        return articlesOfRegulation;
    }

    public void setArticlesOfRegulation(Code articlesOfRegulation) {
        this.articlesOfRegulation = ModelObjects.setParent(articlesOfRegulation, this);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LegalGrounds copy = target == null ? new LegalGrounds() : (LegalGrounds) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LegalGrounds(), copyBuilder);
    }
}
