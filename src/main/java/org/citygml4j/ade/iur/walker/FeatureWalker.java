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
import org.citygml4j.ade.iur.model.urf.PublicTransportationFacility;
import org.citygml4j.ade.iur.model.urf.Recreations;
import org.citygml4j.ade.iur.model.urf.TargetProperty;
import org.citygml4j.ade.iur.model.urf.UrbanFunction;
import org.citygml4j.ade.iur.model.urf.UrbanPlan;
import org.citygml4j.ade.iur.model.urf.Urbanization;
import org.citygml4j.ade.iur.model.urf.Zone;
import org.citygml4j.ade.iur.model.urg.GenericGridCell;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.LandPrice;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PublicTransitAccessibility;
import org.citygml4j.ade.iur.model.urg.StatisticalGrid;
import org.citygml4j.ade.iur.model.urt.Agency;
import org.citygml4j.ade.iur.model.urt.Attribution;
import org.citygml4j.ade.iur.model.urt.Calendar;
import org.citygml4j.ade.iur.model.urt.CalendarDate;
import org.citygml4j.ade.iur.model.urt.FareAttribute;
import org.citygml4j.ade.iur.model.urt.Level;
import org.citygml4j.ade.iur.model.urt.Office;
import org.citygml4j.ade.iur.model.urt.Pathway;
import org.citygml4j.ade.iur.model.urt.PublicTransit;
import org.citygml4j.ade.iur.model.urt.Route;
import org.citygml4j.ade.iur.model.urt.Shape;
import org.citygml4j.ade.iur.model.urt.Stop;
import org.citygml4j.ade.iur.model.urt.TranslationJP;
import org.citygml4j.ade.iur.model.urt.Trip;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

import java.util.ArrayList;

public class FeatureWalker implements ADEWalker<org.citygml4j.util.walker.FeatureWalker> {
    private org.citygml4j.util.walker.FeatureWalker walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.FeatureWalker walker) {
        this.walker = walker;
    }

    public void visit(UrbanFunction urbanFunction) {
        walker.visit((AbstractCityObject) urbanFunction);

        for (TargetProperty property : new ArrayList<>(urbanFunction.getTargets()))
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

    public void visit(PublicTransportationFacility publicTransit) {
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

    public void visit(PublicTransitAccessibility publicTransitAccessibility) {
        visit((StatisticalGrid) publicTransitAccessibility);
    }

    public void visit(GenericGridCell genericGridCell) {
        visit((StatisticalGrid) genericGridCell);
    }

    public void visit(PublicTransit publicTransit) {
        walker.visit((AbstractCityObject) publicTransit);

        if (publicTransit.getTarget() != null)
            walker.visit((FeatureProperty<?>) publicTransit.getTarget());
    }

    public void visit(Agency agency) {
        visit((PublicTransit) agency);
    }

    public void visit(Attribution attribution) {
        visit((PublicTransit) attribution);

        if (attribution.getAgency() != null)
            walker.visit((FeatureProperty<?>) attribution.getAgency());

        if (attribution.getRoute() != null)
            walker.visit((FeatureProperty<?>) attribution.getRoute());

        if (attribution.getTrip() != null)
            walker.visit((FeatureProperty<?>) attribution.getTrip());
    }

    public void visit(Calendar calendar) {
        visit((PublicTransit) calendar);
    }

    public void visit(CalendarDate calendarDate) {
        visit((PublicTransit) calendarDate);

        if (calendarDate.getCalendar() != null)
            walker.visit((FeatureProperty<?>) calendarDate.getCalendar());
    }

    public void visit(FareAttribute fareAttribute) {
        visit((PublicTransit) fareAttribute);

        if (fareAttribute.getAgency() != null)
            walker.visit((FeatureProperty<?>) fareAttribute.getAgency());
    }

    public void visit(Level level) {
        visit((PublicTransit) level);
    }

    public void visit(Office office) {
        visit((PublicTransit) office);
    }

    public void visit(Pathway pathway) {
        visit((PublicTransit) pathway);

        if (pathway.getFrom() != null)
            walker.visit((FeatureProperty<?>) pathway.getFrom());

        if (pathway.getTo() != null)
            walker.visit((FeatureProperty<?>) pathway.getTo());
    }

    public void visit(Route route) {
        visit((PublicTransit) route);

        if (route.getAgency() != null)
            walker.visit((FeatureProperty<?>) route.getAgency());

        if (route.getParentRoute() != null)
            walker.visit((FeatureProperty<?>) route.getParentRoute());
    }

    public void visit(Shape shape) {
        visit((PublicTransit) shape);
    }

    public void visit(Stop stop) {
        visit((PublicTransit) stop);

        if (stop.getParentStation() != null)
            walker.visit((FeatureProperty<?>) stop.getParentStation());

        if (stop.getLevel() != null)
            walker.visit((FeatureProperty<?>) stop.getLevel());
    }

    public void visit(TranslationJP translationJP) {
        visit((PublicTransit) translationJP);
    }

    public void visit(Trip trip) {
        visit((PublicTransit) trip);

        if (trip.getRoute() != null)
            walker.visit((FeatureProperty<?>) trip.getRoute());

        if (trip.getCalendar() != null)
            walker.visit((FeatureProperty<?>) trip.getCalendar());

        if (trip.getCalendarDate() != null)
            walker.visit((FeatureProperty<?>) trip.getCalendarDate());

        if (trip.getOffice() != null)
            walker.visit((FeatureProperty<?>) trip.getOffice());

        if (trip.getShape() != null)
            walker.visit((FeatureProperty<?>) trip.getShape());
    }
}
