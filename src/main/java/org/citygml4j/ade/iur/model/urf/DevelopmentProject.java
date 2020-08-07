package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;

public class DevelopmentProject extends Zone {
    private Code status;
    private Code mainPurpose;
    private Measure benefitArea;
    private String benefitPeriod;
    private Integer cost;
    private Measure plannedArea;
    private Measure ongoingArea;
    private Measure completedArea;
    private LocalDate dateOfDecision;
    private LocalDate dateOfDesignationForTemporaryReplotting;

    public Code getStatus() {
        return status;
    }

    public void setStatus(Code status) {
        this.status = ModelObjects.setParent(status, this);
    }

    public Code getMainPurpose() {
        return mainPurpose;
    }

    public void setMainPurpose(Code mainPurpose) {
        this.mainPurpose = ModelObjects.setParent(mainPurpose, this);
    }

    public Measure getBenefitArea() {
        return benefitArea;
    }

    public void setBenefitArea(Measure benefitArea) {
        this.benefitArea = ModelObjects.setParent(benefitArea, this);
    }

    public String getBenefitPeriod() {
        return benefitPeriod;
    }

    public void setBenefitPeriod(String benefitPeriod) {
        this.benefitPeriod = benefitPeriod;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Measure getPlannedArea() {
        return plannedArea;
    }

    public void setPlannedArea(Measure plannedArea) {
        this.plannedArea = ModelObjects.setParent(plannedArea, this);
    }

    public Measure getOngoingArea() {
        return ongoingArea;
    }

    public void setOngoingArea(Measure ongoingArea) {
        this.ongoingArea = ModelObjects.setParent(ongoingArea, this);
    }

    public Measure getCompletedArea() {
        return completedArea;
    }

    public void setCompletedArea(Measure completedArea) {
        this.completedArea = ModelObjects.setParent(completedArea, this);
    }

    public LocalDate getDateOfDecision() {
        return dateOfDecision;
    }

    public void setDateOfDecision(LocalDate dateOfDecision) {
        this.dateOfDecision = dateOfDecision;
    }

    public LocalDate getDateOfDesignationForTemporaryReplotting() {
        return dateOfDesignationForTemporaryReplotting;
    }

    public void setDateOfDesignationForTemporaryReplotting(LocalDate dateOfDesignationForTemporaryReplotting) {
        this.dateOfDesignationForTemporaryReplotting = dateOfDesignationForTemporaryReplotting;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DevelopmentProject copy = target == null ? new DevelopmentProject() : (DevelopmentProject) target;
        super.copyTo(target, copyBuilder);

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DevelopmentProject(), copyBuilder);
    }
}
