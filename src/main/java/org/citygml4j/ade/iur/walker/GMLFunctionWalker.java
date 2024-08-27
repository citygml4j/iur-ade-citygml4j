/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Virtual City Systems
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

public class GMLFunctionWalker<T> implements ADEWalker<org.citygml4j.util.walker.GMLFunctionWalker<T>> {
    private org.citygml4j.util.walker.GMLFunctionWalker<T> walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.GMLFunctionWalker<T> walker) {
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

        if (urbanFunction.getLod0MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLod0MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod1MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLod1MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod2MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLod2MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod0MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLod0MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod1MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLod1MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod2MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLod2MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod0MultiPoint() != null) {
            object = walker.apply(urbanFunction.getLod0MultiPoint());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod1MultiPoint() != null) {
            object = walker.apply(urbanFunction.getLod1MultiPoint());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod2MultiPoint() != null)
            return walker.apply(urbanFunction.getLod2MultiPoint());

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
        T object = walker.apply((AbstractCityObject) statisticalGrid);
        if (object != null)
            return object;

        if (statisticalGrid.getLod1MultiSurface() != null) {
            object = walker.apply(statisticalGrid.getLod1MultiSurface());
            if (object != null)
                return object;
        }

        if (statisticalGrid.getLod2MultiSurface() != null)
            return walker.apply(statisticalGrid.getLod2MultiSurface());

        return null;
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

        if (route.getParentRoute() != null) {
            object = walker.apply((FeatureProperty<?>) route.getParentRoute());
            if (object != null)
                return object;
        }

        if (route.getLod0MultiCurve() != null)
            return walker.apply(route.getLod0MultiCurve());

        return null;
    }

    public T apply(Shape shape) {
        T object = apply((PublicTransit) shape);
        if (object != null)
            return object;

        for (PointProperty property : new ArrayList<>(shape.getPoints())) {
            if (property.getObject() != null && property.getObject().getPoint() != null) {
                object = walker.apply(property.getObject().getPoint());
                if (object != null)
                    return object;
            }
        }

        return null;
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

        if (stop.getLevel() != null) {
            object = walker.apply((FeatureProperty<?>) stop.getLevel());
            if (object != null)
                return object;
        }

        if (stop.getPoint() != null)
            return walker.apply(stop.getPoint());

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

        if (trip.getShape() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getShape());
            if (object != null)
                return object;
        }

        if (trip.getLod0MultiCurve() != null)
            return walker.apply(trip.getLod0MultiCurve());

        return null;
    }

    public T apply(DataTypeProperty property) {
        return property.isSetValue() ?
                walker.apply(property.getValue()) :
                null;
    }

    public T apply(FareRule fareRule) {
        if (fareRule.getFare() != null) {
            T object = walker.apply((FeatureProperty<?>) fareRule.getFare());
            if (object != null)
                return object;
        }

        if (fareRule.getRoute() != null)
            return walker.apply((FeatureProperty<?>) fareRule.getRoute());

        return null;
    }

    public T apply(Frequency frequency) {
        return frequency.getTrip() != null ?
                walker.apply((FeatureProperty<?>) frequency.getTrip()) :
                null;
    }

    public T apply(StopTime stopTime) {
        if (stopTime.getTrip() != null) {
            T object = walker.apply((FeatureProperty<?>) stopTime.getTrip());
            if (object != null)
                return object;
        }

        if (stopTime.getStop() != null)
            return walker.apply((FeatureProperty<?>) stopTime.getStop());

        return null;
    }

    public T apply(Transfer transfer) {
        if (transfer.getFrom() != null) {
            T object = walker.apply((FeatureProperty<?>) transfer.getFrom());
            if (object != null)
                return object;
        }

        if (transfer.getTo() != null)
            return walker.apply((FeatureProperty<?>) transfer.getTo());

        return null;
    }

    public T apply(Translation translation) {
        return translation.getRecordId() != null ?
                walker.apply((FeatureProperty<?>) translation.getRecordId()) :
                null;
    }
}
