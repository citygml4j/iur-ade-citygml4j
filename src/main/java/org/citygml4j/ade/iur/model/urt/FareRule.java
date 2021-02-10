package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

public class FareRule extends PublicTransitDataType {
    private Code originId;
    private Code destinationId;
    private Code containsId;
    private FareAttributeProperty fare;
    private RouteProperty route;

    public Code getOriginId() {
        return originId;
    }

    public void setOriginId(Code originId) {
        this.originId = ModelObjects.setParent(originId, this);
    }

    public Code getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Code destinationId) {
        this.destinationId = ModelObjects.setParent(destinationId, this);
    }

    public Code getContainsId() {
        return containsId;
    }

    public void setContainsId(Code containsId) {
        this.containsId = ModelObjects.setParent(containsId, this);
    }

    public FareAttributeProperty getFare() {
        return fare;
    }

    public void setFare(FareAttributeProperty fare) {
        this.fare = ModelObjects.setParent(fare, this);
    }

    public RouteProperty getRoute() {
        return route;
    }

    public void setRoute(RouteProperty route) {
        this.route = ModelObjects.setParent(route, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FareRule copy = target == null ? new FareRule() : (FareRule) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FareRule(), copyBuilder);
    }
}
