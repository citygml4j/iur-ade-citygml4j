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

        for (TargetProperty property : urbanFunction.getTargets()) {
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

    public T apply(PublicTransit publicTransit) {
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

    public T apply(PublicTransportationAccessibility publicTransportationAccessibility) {
        return apply((StatisticalGrid) publicTransportationAccessibility);
    }
}
