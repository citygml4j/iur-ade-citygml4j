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

public class FeatureFunctionWalker<T> implements ADEWalker<org.citygml4j.util.walker.FeatureFunctionWalker<T>> {
    private org.citygml4j.util.walker.FeatureFunctionWalker<T> walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.FeatureFunctionWalker<T> walker) {
        this.walker = walker;
    }

    public T apply(UrbanFunction urbanFunction) {
        T object = walker.apply((AbstractCityObject) urbanFunction);
        if (object != null)
            return object;

        for (TargetProperty property : new ArrayList<>(urbanFunction.getTargets())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Zone zone) {
        return apply((UrbanFunction) zone);
    }

    public T apply(Administration administration) {
        return apply((UrbanFunction) administration);
    }

    public T apply(Agreement agreement) {
        return apply((Zone) agreement);
    }

    public T apply(AreaClassification areaClassification) {
        return apply((Zone) areaClassification);
    }

    public T apply(CensusBlock censusBlock) {
        return apply((UrbanFunction) censusBlock);
    }

    public T apply(DevelopmentProject developmentProject) {
        return apply((Zone) developmentProject);
    }

    public T apply(DisasterDamage disasterDamage) {
        return apply((UrbanFunction) disasterDamage);
    }

    public T apply(DisasterPreventionBase disasterPreventionBase) {
        return apply((UrbanFunction) disasterPreventionBase);
    }

    public T apply(DistrictsAndZones districtsAndZones) {
        return apply((Zone) districtsAndZones);
    }

    public T apply(HubCity hubCity) {
        return apply((UrbanFunction) hubCity);
    }

    public T apply(LandUseDiversion landUseDiversion) {
        return apply((UrbanFunction) landUseDiversion);
    }

    public T apply(LandUsePlan landUsePlan) {
        return apply((Zone) landUsePlan);
    }

    public T apply(Pollution pollution) {
        return apply((UrbanFunction) pollution);
    }

    public T apply(PublicTransportationFacility publicTransit) {
        return apply((UrbanFunction) publicTransit);
    }

    public T apply(Recreations recreations) {
        return apply((UrbanFunction) recreations);
    }

    public T apply(Urbanization urbanization) {
        return apply((UrbanFunction) urbanization);
    }

    public T apply(UrbanPlan urbanPlan) {
        return apply((Zone) urbanPlan);
    }

    public T apply(StatisticalGrid statisticalGrid) {
        return walker.apply((AbstractCityObject) statisticalGrid);
    }

    public T apply(Households households) {
        return apply((StatisticalGrid) households);
    }

    public T apply(LandPrice landPrice) {
        return apply((StatisticalGrid) landPrice);
    }

    public T apply(org.citygml4j.ade.iur.model.urg.LandUseDiversion landUseDiversion) {
        return apply((StatisticalGrid) landUseDiversion);
    }

    public T apply(OfficesAndEmployees officesAndEmployees) {
        return apply((StatisticalGrid) officesAndEmployees);
    }

    public T apply(Population population) {
        return apply((StatisticalGrid) population);
    }

    public T apply(PublicTransitAccessibility publicTransitAccessibility) {
        return apply((StatisticalGrid) publicTransitAccessibility);
    }

    public T apply(GenericGridCell genericGridCell) {
        return apply((StatisticalGrid) genericGridCell);
    }

    public T apply(PublicTransit publicTransit) {
        T object = walker.apply((AbstractCityObject) publicTransit);
        if (object != null)
            return object;

        if (publicTransit.getTarget() != null)
            return walker.apply((FeatureProperty<?>) publicTransit.getTarget());

        return null;
    }

    public T apply(Agency agency) {
        return apply((PublicTransit) agency);
    }

    public T apply(Attribution attribution) {
        T object = apply((PublicTransit) attribution);
        if (object != null)
            return object;

        if (attribution.getAgency() != null) {
            object = walker.apply((FeatureProperty<?>) attribution.getAgency());
            if (object != null)
                return object;
        }

        if (attribution.getRoute() != null) {
            object = walker.apply((FeatureProperty<?>) attribution.getRoute());
            if (object != null)
                return object;
        }

        if (attribution.getTrip() != null)
            return walker.apply((FeatureProperty<?>) attribution.getTrip());

        return null;
    }

    public T apply(Calendar calendar) {
        return apply((PublicTransit) calendar);
    }

    public T apply(CalendarDate calendarDate) {
        T object = apply((PublicTransit) calendarDate);
        if (object != null)
            return object;

        if (calendarDate.getCalendar() != null)
            return walker.apply((FeatureProperty<?>) calendarDate.getCalendar());

        return null;
    }

    public T apply(FareAttribute fareAttribute) {
        T object = apply((PublicTransit) fareAttribute);
        if (object != null)
            return object;

        if (fareAttribute.getAgency() != null)
            return walker.apply((FeatureProperty<?>) fareAttribute.getAgency());

        return null;
    }

    public T apply(Level level) {
        return apply((PublicTransit) level);
    }

    public T apply(Office office) {
        return apply((PublicTransit) office);
    }

    public T apply(Pathway pathway) {
        T object = apply((PublicTransit) pathway);
        if (object != null)
            return object;

        if (pathway.getFrom() != null) {
            object = walker.apply((FeatureProperty<?>) pathway.getFrom());
            if (object != null)
                return object;
        }

        if (pathway.getTo() != null)
            return walker.apply((FeatureProperty<?>) pathway.getTo());

        return null;
    }

    public T apply(Route route) {
        T object = apply((PublicTransit) route);
        if (object != null)
            return object;

        if (route.getAgency() != null) {
            object = walker.apply((FeatureProperty<?>) route.getAgency());
            if (object != null)
                return object;
        }

        if (route.getParentRoute() != null)
            return walker.apply((FeatureProperty<?>) route.getParentRoute());

        return null;
    }

    public T apply(Shape shape) {
        return apply((PublicTransit) shape);
    }

    public T apply(Stop stop) {
        T object = apply((PublicTransit) stop);
        if (object != null)
            return object;

        if (stop.getParentStation() != null) {
            object = walker.apply((FeatureProperty<?>) stop.getParentStation());
            if (object != null)
                return object;
        }

        if (stop.getLevel() != null)
            return walker.apply((FeatureProperty<?>) stop.getLevel());

        return null;
    }

    public T apply(TranslationJP translationJP) {
        return apply((PublicTransit) translationJP);
    }

    public T apply(Trip trip) {
        T object = apply((PublicTransit) trip);
        if (object != null)
            return object;

        if (trip.getRoute() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getRoute());
            if (object != null)
                return object;
        }

        if (trip.getCalendar() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getCalendar());
            if (object != null)
                return object;
        }

        if (trip.getCalendarDate() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getCalendarDate());
            if (object != null)
                return object;
        }

        if (trip.getOffice() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getOffice());
            if (object != null)
                return object;
        }

        if (trip.getShape() != null)
            return walker.apply((FeatureProperty<?>) trip.getShape());

        return null;
    }
}
