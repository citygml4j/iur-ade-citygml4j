/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Virtual City Systems
 * https://vc.systems/
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

import org.citygml4j.ade.iur.model.urf.LandUseDiversion;
import org.citygml4j.ade.iur.model.urf.TargetProperty;
import org.citygml4j.ade.iur.model.urf.*;
import org.citygml4j.ade.iur.model.urg.*;
import org.citygml4j.ade.iur.model.urt.*;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

import java.util.ArrayList;

public class GMLWalker implements ADEWalker<org.citygml4j.util.walker.GMLWalker> {
    private org.citygml4j.util.walker.GMLWalker walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.GMLWalker walker) {
        this.walker = walker;
    }

    public void visit(UrbanFunction urbanFunction) {
        walker.visit((AbstractCityObject) urbanFunction);

        for (TargetProperty property : new ArrayList<>(urbanFunction.getTargets()))
            walker.visit((FeatureProperty<?>) property);

        if (urbanFunction.getLod0MultiSurface() != null)
            walker.visit(urbanFunction.getLod0MultiSurface());

        if (urbanFunction.getLod1MultiSurface() != null)
            walker.visit(urbanFunction.getLod1MultiSurface());

        if (urbanFunction.getLod2MultiSurface() != null)
            walker.visit(urbanFunction.getLod2MultiSurface());

        if (urbanFunction.getLod0MultiCurve() != null)
            walker.visit(urbanFunction.getLod0MultiCurve());

        if (urbanFunction.getLod1MultiCurve() != null)
            walker.visit(urbanFunction.getLod1MultiCurve());

        if (urbanFunction.getLod2MultiCurve() != null)
            walker.visit(urbanFunction.getLod2MultiCurve());

        if (urbanFunction.getLod0MultiPoint() != null)
            walker.visit(urbanFunction.getLod0MultiPoint());

        if (urbanFunction.getLod1MultiPoint() != null)
            walker.visit(urbanFunction.getLod1MultiPoint());

        if (urbanFunction.getLod2MultiPoint() != null)
            walker.visit(urbanFunction.getLod2MultiPoint());
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

        if (statisticalGrid.getLod1MultiSurface() != null)
            walker.visit(statisticalGrid.getLod1MultiSurface());

        if (statisticalGrid.getLod2MultiSurface() != null)
            walker.visit(statisticalGrid.getLod2MultiSurface());
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

        if (route.getLod0MultiCurve() != null)
            walker.visit(route.getLod0MultiCurve());
    }

    public void visit(Shape shape) {
        visit((PublicTransit) shape);

        for (PointProperty property : new ArrayList<>(shape.getPoints())) {
            if (property.getObject() != null && property.getObject().getPoint() != null)
                walker.visit(property.getObject().getPoint());
        }
    }

    public void visit(Stop stop) {
        visit((PublicTransit) stop);

        if (stop.getParentStation() != null)
            walker.visit((FeatureProperty<?>) stop.getParentStation());

        if (stop.getLevel() != null)
            walker.visit((FeatureProperty<?>) stop.getLevel());

        if (stop.getPoint() != null)
            walker.visit(stop.getPoint());
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

        if (trip.getLod0MultiCurve() != null)
            walker.visit(trip.getLod0MultiCurve());
    }

    public void visit(DataTypeProperty property) {
        if (property.isSetValue())
            walker.visit(property.getValue());
    }

    public void visit(FareRule fareRule) {
        if (fareRule.getFare() != null)
            walker.visit((FeatureProperty<?>) fareRule.getFare());

        if (fareRule.getRoute() != null)
            walker.visit((FeatureProperty<?>) fareRule.getRoute());
    }

    public void visit(Frequency frequency) {
        if (frequency.getTrip() != null)
            walker.visit((FeatureProperty<?>) frequency.getTrip());
    }

    public void visit(StopTime stopTime) {
        if (stopTime.getTrip() != null)
            walker.visit((FeatureProperty<?>) stopTime.getTrip());

        if (stopTime.getStop() != null)
            walker.visit((FeatureProperty<?>) stopTime.getStop());
    }

    public void visit(Transfer transfer) {
        if (transfer.getFrom() != null)
            walker.visit((FeatureProperty<?>) transfer.getFrom());

        if (transfer.getTo() != null)
            walker.visit((FeatureProperty<?>) transfer.getTo());
    }

    public void visit(Translation translation) {
        if (translation.getRecordId() != null)
            walker.visit((FeatureProperty<?>) translation.getRecordId());
    }
}
