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

package org.citygml4j.ade.iur.model.module;

import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UrbanObjectModule extends ADEModule {
    public static final UrbanObjectModule v1_4 = new UrbanObjectModule();

    private UrbanObjectModule() {
        super("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.4",
                "uro",
                "https://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/schemas/uro/1.4/urbanObject.xsd",
                CityGMLVersion.v2_0_0);
    }

    @Override
    public URL getSchemaResource() {
        return UrbanObjectModule.class.getResource("/org/citygml4j/ade/iur/schema/urbanObject.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.go.kantei.iur._1_4.uro");
    }

    public String getModelPackageName() {
        return "org.citygml4j.ade.iur.model.uro";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return false;
    }

    @Override
    public boolean hasFeature(String name) {
        return false;
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return null;
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return Collections.emptyMap();
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return false;
    }
}
