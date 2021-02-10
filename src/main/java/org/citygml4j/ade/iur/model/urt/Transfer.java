package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

public class Transfer extends PublicTransitDataType {
    private Code transferType;
    private Integer minTransferTime;
    private StopProperty from;
    private StopProperty to;

    public Code getTransferType() {
        return transferType;
    }

    public void setTransferType(Code transferType) {
        this.transferType = ModelObjects.setParent(transferType, this);
    }

    public Integer getMinTransferTime() {
        return minTransferTime;
    }

    public void setMinTransferTime(Integer minTransferTime) {
        this.minTransferTime = minTransferTime;
    }

    public StopProperty getFrom() {
        return from;
    }

    public void setFrom(StopProperty from) {
        this.from = ModelObjects.setParent(from, this);
    }

    public StopProperty getTo() {
        return to;
    }

    public void setTo(StopProperty to) {
        this.to = ModelObjects.setParent(to, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Transfer copy = target == null ? new Transfer() : (Transfer) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Transfer(), copyBuilder);
    }
}
