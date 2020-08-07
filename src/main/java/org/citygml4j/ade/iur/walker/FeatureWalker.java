package org.citygml4j.ade.iur.walker;

import org.citygml4j.ade.iur.model.urf.Administration;
import org.citygml4j.ade.iur.model.urf.Agreement;
import org.citygml4j.ade.iur.model.urf.AreaClassification;
import org.citygml4j.ade.iur.model.urf.CensusBlock;
import org.citygml4j.ade.iur.model.urf.DevelopmentProject;
import org.citygml4j.ade.iur.model.urf.DisasterDamage;
import org.citygml4j.ade.iur.model.urf.DisasterPreventionBase;
import org.citygml4j.ade.iur.model.urf.DistrictsAndZones;
import org.citygml4j.ade.iur.model.urf.HubCity;
import org.citygml4j.ade.iur.model.urf.LandUseDiversion;
import org.citygml4j.ade.iur.model.urf.LandUsePlan;
import org.citygml4j.ade.iur.model.urf.Pollution;
import org.citygml4j.ade.iur.model.urf.PublicTransit;
import org.citygml4j.ade.iur.model.urf.Recreations;
import org.citygml4j.ade.iur.model.urf.TargetProperty;
import org.citygml4j.ade.iur.model.urf.UrbanFunction;
import org.citygml4j.ade.iur.model.urf.UrbanPlan;
import org.citygml4j.ade.iur.model.urf.Urbanization;
import org.citygml4j.ade.iur.model.urf.Zone;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.LandPrice;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PublicTransportationAccessibility;
import org.citygml4j.ade.iur.model.urg.StatisticalGrid;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class FeatureWalker implements ADEWalker<org.citygml4j.util.walker.FeatureWalker> {
    private org.citygml4j.util.walker.FeatureWalker walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.FeatureWalker walker) {
        this.walker = walker;
    }

    public void visit(UrbanFunction urbanFunction) {
        walker.visit((AbstractCityObject) urbanFunction);

        for (TargetProperty property : urbanFunction.getTargets())
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(Zone zone) {
        visit((UrbanFunction) zone);
    }

    public void visit(Administration administration) {
        visit((UrbanFunction) administration);
    }

    public void visit(Agreement agreement) {
        visit((Zone) agreement);
    }

    public void visit(AreaClassification areaClassification) {
        visit((Zone) areaClassification);
    }

    public void visit(CensusBlock censusBlock) {
        visit((UrbanFunction) censusBlock);
    }

    public void visit(DevelopmentProject developmentProject) {
        visit((Zone) developmentProject);
    }

    public void visit(DisasterDamage disasterDamage) {
        visit((UrbanFunction) disasterDamage);
    }

    public void visit(DisasterPreventionBase disasterPreventionBase) {
        visit((UrbanFunction) disasterPreventionBase);
    }

    public void visit(DistrictsAndZones districtsAndZones) {
        visit((Zone) districtsAndZones);
    }

    public void visit(HubCity hubCity) {
        visit((UrbanFunction) hubCity);
    }

    public void visit(LandUseDiversion landUseDiversion) {
        visit((UrbanFunction) landUseDiversion);
    }

    public void visit(LandUsePlan landUsePlan) {
        visit((Zone) landUsePlan);
    }

    public void visit(Pollution pollution) {
        visit((UrbanFunction) pollution);
    }

    public void visit(PublicTransit publicTransit) {
        visit((UrbanFunction) publicTransit);
    }

    public void visit(Recreations recreations) {
        visit((UrbanFunction) recreations);
    }

    public void visit(Urbanization urbanization) {
        visit((UrbanFunction) urbanization);
    }

    public void visit(UrbanPlan urbanPlan) {
        visit((Zone) urbanPlan);
    }

    public void visit(StatisticalGrid statisticalGrid) {
        walker.visit((AbstractCityObject) statisticalGrid);
    }

    public void visit(Households households) {
        visit((StatisticalGrid) households);
    }

    public void visit(LandPrice landPrice) {
        visit((StatisticalGrid) landPrice);
    }

    public void visit(org.citygml4j.ade.iur.model.urg.LandUseDiversion landUseDiversion) {
        visit((StatisticalGrid) landUseDiversion);
    }

    public void visit(OfficesAndEmployees officesAndEmployees) {
        visit((StatisticalGrid) officesAndEmployees);
    }

    public void visit(Population population) {
        visit((StatisticalGrid) population);
    }

    public void visit(PublicTransportationAccessibility publicTransportationAccessibility) {
        visit((StatisticalGrid) publicTransportationAccessibility);
    }
}
