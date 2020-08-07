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
    public static final UrbanObjectModule v1_3 = new UrbanObjectModule();

    private UrbanObjectModule() {
        super("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/uro/1.3",
                "uro",
                "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/schemas/uro/1.3/urbanObject.xsd",
                CityGMLVersion.v2_0_0);
    }
    
    @Override
    public URL getSchemaResource() {
        return UrbanObjectModule.class.getResource("/org/citygml4j/ade/iur/schema/urbanObject.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.go.kantei.iur._1_3.uro");
    }

    public String getModelPackageName() {
        return "vcs.citygml4j.ade.iur.model.uro";
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
