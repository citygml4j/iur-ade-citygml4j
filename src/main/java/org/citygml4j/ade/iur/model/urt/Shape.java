package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class Shape extends PublicTransit {
    private List<PointProperty> points;

    public List<PointProperty> getPoints() {
        if (points == null)
            points = new ChildList<>(this);

        return points;
    }

    public void setPoints(List<PointProperty> points) {
        this.points = ModelObjects.setParent(points, this);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        if (points != null) {
            for (PointProperty property : points) {
                if (property.isSetObject() && property.getObject().getPoint() != null)
                    lodRepresentation.addRepresentation(property.getObject().getPoint());
            }
        }

        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Shape copy = target == null ? new Shape() : (Shape) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Shape(), copyBuilder);
    }
}
