package org.citygml4j.ade.iur.bind;

import org.citygml4j.ade.iur.bind.urf.UrbanFunctionUnmarshaller;
import org.citygml4j.ade.iur.model.module.StatisticalGridModule;
import org.citygml4j.ade.iur.model.module.UrbanFunctionModule;
import org.citygml4j.ade.iur.model.module.UrbanObjectModule;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.citygml4j.ade.iur.bind.urg.StatisticalGridUnmarshaller;
import org.citygml4j.ade.iur.bind.uro.UrbanObjectUnmarshaller;

import javax.xml.bind.JAXBElement;

public class Unmarshaller implements ADEUnmarshaller {
    private final UrbanFunctionUnmarshaller urbanFunction = new UrbanFunctionUnmarshaller();
    private final StatisticalGridUnmarshaller statisticalGrid = new StatisticalGridUnmarshaller();
    private final UrbanObjectUnmarshaller urbanObject = new UrbanObjectUnmarshaller();

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        urbanFunction.setADEUnmarshallerHelper(helper);
        statisticalGrid.setADEUnmarshallerHelper(helper);
        urbanObject.setADEUnmarshallerHelper(helper);
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        String namespaceURI = src.getName().getNamespaceURI();

        if (UrbanFunctionModule.v1_3.getNamespaceURI().equals(namespaceURI))
            return urbanFunction.unmarshal(src);
        else if (StatisticalGridModule.v1_3.getNamespaceURI().equals(namespaceURI))
            return statisticalGrid.unmarshal(src);
        else if (UrbanObjectModule.v1_3.getNamespaceURI().equals(namespaceURI))
            return urbanObject.unmarshal(src);

        return null;
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_3.getModelPackageName().equals(packageName))
            return urbanFunction.unmarshal(src);
        else if (StatisticalGridModule.v1_3.getModelPackageName().equals(packageName))
            return statisticalGrid.unmarshal(src);
        else if (UrbanObjectModule.v1_3.getModelPackageName().equals(packageName))
            return urbanObject.unmarshal(src);

        return null;
    }
}
