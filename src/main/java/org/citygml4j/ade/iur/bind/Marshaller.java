package org.citygml4j.ade.iur.bind;

import org.citygml4j.ade.iur.model.module.StatisticalGridModule;
import org.citygml4j.ade.iur.model.module.UrbanFunctionModule;
import org.citygml4j.ade.iur.model.module.UrbanObjectModule;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.ade.iur.bind.urf.UrbanFunctionMarshaller;
import org.citygml4j.ade.iur.bind.urg.StatisticalGridMarshaller;
import org.citygml4j.ade.iur.bind.uro.UrbanObjectMarshaller;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.Year;

public class Marshaller implements ADEMarshaller {
    private final UrbanFunctionMarshaller urbanFunction = new UrbanFunctionMarshaller(this);
    private final StatisticalGridMarshaller statisticalGrid = new StatisticalGridMarshaller(this);
    private final UrbanObjectMarshaller urbanObject = new UrbanObjectMarshaller(this);
    private ADEMarshallerHelper helper;

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
        urbanFunction.setADEMarshallerHelper(helper);
        statisticalGrid.setADEMarshallerHelper(helper);
        urbanObject.setADEMarshallerHelper(helper);
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_3.getModelPackageName().equals(packageName))
            return urbanFunction.marshalJAXBElement(src);
        else if (StatisticalGridModule.v1_3.getModelPackageName().equals(packageName))
            return statisticalGrid.marshalJAXBElement(src);
        else if (UrbanObjectModule.v1_3.getModelPackageName().equals(packageName))
            return urbanObject.marshalJAXBElement(src);

        return null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        String packageName = src.getClass().getPackage().getName();

        if (UrbanFunctionModule.v1_3.getModelPackageName().equals(packageName))
            return urbanFunction.marshal(src);
        else if (StatisticalGridModule.v1_3.getModelPackageName().equals(packageName))
            return statisticalGrid.marshal(src);
        else if (UrbanObjectModule.v1_3.getModelPackageName().equals(packageName))
            return urbanObject.marshal(src);

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

    public XMLGregorianCalendar toCalendar(Year year) {
        return helper.getJAXBMarshaller().getDataTypeFactory()
                .newXMLGregorianCalendarDate(year.getValue(),
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED,
                        DatatypeConstants.FIELD_UNDEFINED);
    }
}
