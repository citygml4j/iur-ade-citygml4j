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

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class PublicTransportationFacility extends UrbanFunction {
    private String routeName;
    private String sectionName;
    private String companyName;
    private Integer frequencyOfService;
    private Double numberOfCustomers;

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getFrequencyOfService() {
        return frequencyOfService;
    }

    public void setFrequencyOfService(Integer frequencyOfService) {
        this.frequencyOfService = frequencyOfService;
    }

    public Double getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(Double numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicTransportationFacility copy = target == null ? new PublicTransportationFacility() : (PublicTransportationFacility) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PublicTransportationFacility(), copyBuilder);
    }
}
