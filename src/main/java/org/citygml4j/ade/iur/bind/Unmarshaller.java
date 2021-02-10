/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2020 virtualcitySYSTEMS GmbH
 * https://www.virtualcitysystems.de/
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

package org.citygml4j.ade.iur.bind;

import org.citygml4j.ade.iur.bind.urf.UrbanFunctionUnmarshaller;
import org.citygml4j.ade.iur.bind.urg.StatisticalGridUnmarshaller;
import org.citygml4j.ade.iur.bind.uro.UrbanObjectUnmarshaller;
import org.citygml4j.ade.iur.bind.urt.PublicTransitUnmarshaller;
import org.citygml4j.ade.iur.model.module.PublicTransitModule;
import org.citygml4j.ade.iur.model.module.StatisticalGridModule;
import org.citygml4j.ade.iur.model.module.UrbanFunctionModule;
import org.citygml4j.ade.iur.model.module.UrbanObjectModule;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import javax.xml.bind.JAXBElement;

public class Unmarshaller implements ADEUnmarshaller {
    private final UrbanFunctionUnmarshaller urbanFunction = new UrbanFunctionUnmarshaller();
    private final StatisticalGridUnmarshaller statisticalGrid = new StatisticalGridUnmarshaller();
    private final UrbanObjectUnmarshaller urbanObject = new UrbanObjectUnmarshaller();
    private final PublicTransitUnmarshaller publicTransit = new PublicTransitUnmarshaller();

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        urbanFunction.setADEUnmarshallerHelper(helper);
        statisticalGrid.setADEUnmarshallerHelper(helper);
        urbanObject.setADEUnmarshallerHelper(helper);
        publicTransit.setADEUnmarshallerHelper(helper);
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        String namespaceURI = src.getName().getNamespaceURI();

        if (UrbanFunctionModule.v1_4.getNamespaceURI().equals(namespaceURI))
            return urbanFunction.unmarshal(src);
        else if (StatisticalGridModule.v1_4.getNamespaceURI().equals(namespaceURI))
            return statisticalGrid.unmarshal(src);
        else if (UrbanObjectModule.v1_4.getNamespaceURI().equals(namespaceURI))
            return urbanObject.unmarshal(src);
        else if (PublicTransitModule.v1_4.getNamespaceURI().equals(namespaceURI))
            return publicTransit.unmarshal(src);

        return null;
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_4.getModelPackageName().equals(packageName))
            return urbanFunction.unmarshal(src);
        else if (StatisticalGridModule.v1_4.getModelPackageName().equals(packageName))
            return statisticalGrid.unmarshal(src);
        else if (UrbanObjectModule.v1_4.getModelPackageName().equals(packageName))
            return urbanObject.unmarshal(src);
        else if (PublicTransitModule.v1_4.getModelPackageName().equals(packageName))
            return publicTransit.unmarshal(src);

        return null;
    }
}
