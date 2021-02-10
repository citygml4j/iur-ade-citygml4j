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
