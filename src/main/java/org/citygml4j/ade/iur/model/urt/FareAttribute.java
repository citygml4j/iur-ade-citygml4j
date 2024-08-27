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
import org.citygml4j.model.gml.basicTypes.Code;

public class FareAttribute extends PublicTransit {
    private double price;
    private Code currencyType;
    private Code paymentMethod;
    private Code transfers;
    private Integer transferDuration;
    private AgencyProperty agency;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Code getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Code currencyType) {
        this.currencyType = ModelObjects.setParent(currencyType, this);
    }

    public Code getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Code paymentMethod) {
        this.paymentMethod = ModelObjects.setParent(paymentMethod, this);
    }

    public Code getTransfers() {
        return transfers;
    }

    public void setTransfers(Code transfers) {
        this.transfers = ModelObjects.setParent(transfers, this);
    }

    public Integer getTransferDuration() {
        return transferDuration;
    }

    public void setTransferDuration(Integer transferDuration) {
        this.transferDuration = transferDuration;
    }

    public AgencyProperty getAgency() {
        return agency;
    }

    public void setAgency(AgencyProperty agency) {
        this.agency = ModelObjects.setParent(agency, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FareAttribute copy = target == null ? new FareAttribute() : (FareAttribute) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FareAttribute(), copyBuilder);
    }
}
