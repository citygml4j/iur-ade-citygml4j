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

import org.citygml4j.ade.iur.bind.urf.UrbanFunctionMarshaller;
import org.citygml4j.ade.iur.bind.urg.StatisticalGridMarshaller;
import org.citygml4j.ade.iur.bind.uro.UrbanObjectMarshaller;
import org.citygml4j.ade.iur.bind.urt.PublicTransitMarshaller;
import org.citygml4j.ade.iur.model.module.PublicTransitModule;
import org.citygml4j.ade.iur.model.module.StatisticalGridModule;
import org.citygml4j.ade.iur.model.module.UrbanFunctionModule;
import org.citygml4j.ade.iur.model.module.UrbanObjectModule;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;

public class Marshaller implements ADEMarshaller {
    private final UrbanFunctionMarshaller urbanFunction = new UrbanFunctionMarshaller(this);
    private final StatisticalGridMarshaller statisticalGrid = new StatisticalGridMarshaller(this);
    private final UrbanObjectMarshaller urbanObject = new UrbanObjectMarshaller(this);
    private final PublicTransitMarshaller publicTransit = new PublicTransitMarshaller(this);
    private ADEMarshallerHelper helper;

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
        urbanFunction.setADEMarshallerHelper(helper);
        statisticalGrid.setADEMarshallerHelper(helper);
        urbanObject.setADEMarshallerHelper(helper);
        publicTransit.setADEMarshallerHelper(helper);
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_4.getModelPackageName().equals(packageName))
            return urbanFunction.marshalJAXBElement(src);
        else if (StatisticalGridModule.v1_4.getModelPackageName().equals(packageName))
            return statisticalGrid.marshalJAXBElement(src);
        else if (UrbanObjectModule.v1_4.getModelPackageName().equals(packageName))
            return urbanObject.marshalJAXBElement(src);
        else if (PublicTransitModule.v1_4.getModelPackageName().equals(packageName))
            return publicTransit.marshalJAXBElement(src);

        return null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_4.getModelPackageName().equals(packageName))
            return urbanFunction.marshal(src);
        else if (StatisticalGridModule.v1_4.getModelPackageName().equals(packageName))
            return statisticalGrid.marshal(src);
        else if (UrbanObjectModule.v1_4.getModelPackageName().equals(packageName))
            return urbanObject.marshal(src);
        else if (PublicTransitModule.v1_4.getModelPackageName().equals(packageName))
            return publicTransit.marshal(src);

        return null;
    }

    public XMLGregorianCalendar toCalendar(LocalDate date) {
        return helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarDate(
                        date.getYear(),
                        date.getMonthValue(),
                        date.getDayOfMonth(),
                        DatatypeConstants.FIELD_UNDEFINED);
    }

    public XMLGregorianCalendar toCalendar(LocalTime time) {
        return helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarTime(
                        time.getHour(),
                        time.getMinute(),
                        time.getSecond(),
                        BigDecimal.valueOf(time.getNano(), 9).stripTrailingZeros(),
                        DatatypeConstants.FIELD_UNDEFINED);
    }

    public XMLGregorianCalendar toCalendar(Year year) {
        return helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarDate(year.getValue(),
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED);
    }
}
