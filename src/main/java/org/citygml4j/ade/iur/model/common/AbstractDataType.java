package org.citygml4j.ade.iur.model.common;

import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.association.Associable;
import org.citygml4j.model.common.base.ModelObject;

public abstract class AbstractDataType implements Associable, ADEModelObject {
    private ModelObject parent;

    @Override
    public ModelObject getParent() {
        return parent;
    }

    @Override
    public void setParent(ModelObject parent) {
        this.parent = parent;
    }

    @Override
    public boolean isSetParent() {
        return parent != null;
    }

    @Override
    public void unsetParent() {
        parent = null;
    }
}
