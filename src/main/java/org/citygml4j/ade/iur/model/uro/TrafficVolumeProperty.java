package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.base.AssociationByRep;

public class TrafficVolumeProperty extends AssociationByRep<TrafficVolume> implements ADEModelObject {

    public TrafficVolumeProperty() {
        super();
    }

    public TrafficVolumeProperty(TrafficVolume object) {
        super(object);
    }

    @Override
    public Class<TrafficVolume> getAssociableClass() {
        return TrafficVolume.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrafficVolumeProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TrafficVolumeProperty copy = (target == null) ? new TrafficVolumeProperty() : (TrafficVolumeProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
