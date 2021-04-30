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

package org.citygml4j.ade.iur;

import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.bind.Unmarshaller;
import org.citygml4j.ade.iur.model.module.PublicTransitModule;
import org.citygml4j.ade.iur.model.module.StatisticalGridModule;
import org.citygml4j.ade.iur.model.module.UrbanFunctionModule;
import org.citygml4j.ade.iur.model.module.UrbanObjectModule;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.walker.FeatureFunctionWalker;
import org.citygml4j.util.walker.FeatureWalker;
import org.citygml4j.util.walker.GMLFunctionWalker;
import org.citygml4j.util.walker.GMLWalker;

import java.util.Arrays;
import java.util.List;

public class UrbanRevitalizationADEContext implements ADEContext {
    private final List<ADEModule> modules = Arrays.asList(
            UrbanObjectModule.v1_4,
            UrbanFunctionModule.v1_4,
            StatisticalGridModule.v1_4,
            PublicTransitModule.v1_4
    );

    @Override
    public List<ADEModule> getADEModules() {
        return modules;
    }

    @Override
    public List<String> getModelPackageNames() {
        return Arrays.asList(
                UrbanObjectModule.v1_4.getModelPackageName(),
                UrbanFunctionModule.v1_4.getModelPackageName(),
                StatisticalGridModule.v1_4.getModelPackageName(),
                PublicTransitModule.v1_4.getModelPackageName()
        );
    }

    @Override
    public ADEMarshaller createADEMarshaller() {
        return new Marshaller();
    }

    @Override
    public ADEUnmarshaller createADEUnmarshaller() {
        return new Unmarshaller();
    }

    @Override
    public ADEWalker<FeatureWalker> createDefaultFeatureWalker() {
        return new org.citygml4j.ade.iur.walker.FeatureWalker();
    }

    @Override
    public ADEWalker<GMLWalker> createDefaultGMLWalker() {
        return new org.citygml4j.ade.iur.walker.GMLWalker();
    }

    @Override
    public <T> ADEWalker<FeatureFunctionWalker<T>> createDefaultFeatureFunctionWalker() {
        return new org.citygml4j.ade.iur.walker.FeatureFunctionWalker<>();
    }

    @Override
    public <T> ADEWalker<GMLFunctionWalker<T>> createDefaultGMLFunctionWalker() {
        return new org.citygml4j.ade.iur.walker.GMLFunctionWalker<>();
    }
}
