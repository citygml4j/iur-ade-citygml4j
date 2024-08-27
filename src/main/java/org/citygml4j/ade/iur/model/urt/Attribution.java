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

package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;

public class Attribution extends PublicTransit {
    private String organizationName;
    private Boolean isProducer;
    private Boolean isOperator;
    private Boolean isAuthority;
    private String url;
    private String email;
    private String phoneNumber;
    private AgencyProperty agency;
    private RouteProperty route;
    private TripProperty trip;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Boolean getIsProducer() {
        return isProducer;
    }

    public void setIsProducer(Boolean producer) {
        isProducer = producer;
    }

    public Boolean getIsOperator() {
        return isOperator;
    }

    public void setIsOperator(Boolean operator) {
        isOperator = operator;
    }

    public Boolean getIsAuthority() {
        return isAuthority;
    }

    public void setIsAuthority(Boolean authority) {
        isAuthority = authority;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AgencyProperty getAgency() {
        return agency;
    }

    public void setAgency(AgencyProperty agency) {
        this.agency = ModelObjects.setParent(agency, this);
    }

    public RouteProperty getRoute() {
        return route;
    }

    public void setRoute(RouteProperty route) {
        this.route = ModelObjects.setParent(route, this);
    }

    public TripProperty getTrip() {
        return trip;
    }

    public void setTrip(TripProperty trip) {
        this.trip = ModelObjects.setParent(trip, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Attribution copy = target == null ? new Attribution() : (Attribution) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Attribution(), copyBuilder);
    }
}
