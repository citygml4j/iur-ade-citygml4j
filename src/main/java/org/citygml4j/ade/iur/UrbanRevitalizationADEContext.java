package org.citygml4j.ade.iur;

import org.citygml4j.ade.iur.bind.Marshaller;
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
import org.citygml4j.ade.iur.bind.Unmarshaller;

import java.util.Arrays;
import java.util.List;

public class UrbanRevitalizationADEContext implements ADEContext {
    private final List<ADEModule> modules = Arrays.asList(
            UrbanObjectModule.v1_3,
            UrbanFunctionModule.v1_3,
            StatisticalGridModule.v1_3
    );

    @Override
    public List<ADEModule> getADEModules() {
        return modules;
    }

    @Override
    public List<String> getModelPackageNames() {
        return Arrays.asList(
                UrbanObjectModule.v1_3.getModelPackageName(),
                UrbanFunctionModule.v1_3.getModelPackageName(),
                StatisticalGridModule.v1_3.getModelPackageName()
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
