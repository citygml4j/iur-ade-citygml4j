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

package org.citygml4j.ade.iur.model.module;

import org.citygml4j.ade.iur.model.urt.Calendar;
import org.citygml4j.ade.iur.model.urt.*;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.*;

public class PublicTransitModule extends ADEModule {
    public static final PublicTransitModule v1_4 = new PublicTransitModule();
    private final Map<String, Class<? extends AbstractFeature>> features;
    private final Set<String> featureProperties;

    private PublicTransitModule() {
        super("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4",
                "urt",
                "https://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/schemas/urt/1.4/publicTransit.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Agency", Agency.class);
        features.put("Attribution", Attribution.class);
        features.put("Calendar", Calendar.class);
        features.put("CalendarDate", CalendarDate.class);
        features.put("FareAttribute", FareAttribute.class);
        features.put("Level", Level.class);
        features.put("Office", Office.class);
        features.put("Pathway", Pathway.class);
        features.put("Route", Route.class);
        features.put("Shape", Shape.class);
        features.put("Stop", Stop.class);
        features.put("TranslationJP", TranslationJP.class);
        features.put("Trip", Trip.class);

        featureProperties = new HashSet<>();
        featureProperties.add("target");
        featureProperties.add("description");
        featureProperties.add("agency");
        featureProperties.add("parentRoute");
        featureProperties.add("parentStation");
        featureProperties.add("level");
        featureProperties.add("route");
        featureProperties.add("calendar");
        featureProperties.add("calendarDate");
        featureProperties.add("office");
        featureProperties.add("shape");
        featureProperties.add("from");
        featureProperties.add("to");
        featureProperties.add("trip");
        featureProperties.add("recordId");
        featureProperties.add("stop");
        featureProperties.add("fare");
    }

    @Override
    public URL getSchemaResource() {
        return PublicTransitModule.class.getResource("/org/citygml4j/ade/iur/schema/publicTransit.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.go.kantei.iur._1_4.urt");
    }

    public String getModelPackageName() {
        return "org.citygml4j.ade.iur.model.urt";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return featureProperties.contains(name);
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
        return Collections.emptyMap();
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return true;
    }
}
