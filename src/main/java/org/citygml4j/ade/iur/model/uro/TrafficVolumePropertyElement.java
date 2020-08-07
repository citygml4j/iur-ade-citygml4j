package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class TrafficVolumePropertyElement extends ADEGenericApplicationProperty<TrafficVolumeProperty> {

    public TrafficVolumePropertyElement() {
        super();
    }

    public TrafficVolumePropertyElement(TrafficVolumeProperty value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrafficVolumePropertyElement(), copyBuilder);
    }
}
