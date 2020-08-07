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

package org.citygml4j.ade.iur.model.module;

import org.citygml4j.ade.iur.model.urf.LandUseDiversion;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.LandPrice;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PublicTransportationAccessibility;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticalGridModule extends ADEModule {
    public static final StatisticalGridModule v1_3 = new StatisticalGridModule();
    private final HashMap<String, Class<? extends AbstractFeature>> features;

    private StatisticalGridModule() {
        super("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.3",
                "urg",
                "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/schemas/urg/1.3/statisticalGrid.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Households", Households.class);
        features.put("LandPrice", LandPrice.class);
        features.put("LandUseDiversion", LandUseDiversion.class);
        features.put("OfficesAndEmployees", OfficesAndEmployees.class);
        features.put("Population", Population.class);
        features.put("PublicTransportationAccessibility", PublicTransportationAccessibility.class);
    }

    @Override
    public URL getSchemaResource() {
        return StatisticalGridModule.class.getResource("/org/citygml4j/ade/iur/schema/statisticalGrid.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.go.kantei.iur._1_3.urg");
    }

    public String getModelPackageName() {
        return "vcs.citygml4j.ade.iur.model.urg";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return false;
    }

    @Override
    public boolean hasFeature(String name) {
        return features.containsKey(name);
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return features.get(name);
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        for (Map.Entry<String, Class<? extends AbstractFeature>> entry : features.entrySet()) {
            if (entry.getValue() == featureClass)
                return new QName(getNamespaceURI(), entry.getKey());
        }

        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return new HashMap<>(features);
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return true;
    }
}
