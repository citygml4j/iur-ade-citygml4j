package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class PublicTransit extends UrbanFunction {
    private String routeName;
    private String sectionName;
    private String companyName;
    private Integer frequencyOfService;
    private Double numberOfCustomers;

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getFrequencyOfService() {
        return frequencyOfService;
    }

    public void setFrequencyOfService(Integer frequencyOfService) {
        this.frequencyOfService = frequencyOfService;
    }

    public Double getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(Double numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicTransit copy = target == null ? new PublicTransit() : (PublicTransit) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PublicTransit(), copyBuilder);
    }
}
