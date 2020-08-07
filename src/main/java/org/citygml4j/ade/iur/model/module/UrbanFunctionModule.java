package org.citygml4j.ade.iur.model.module;

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
import org.citygml4j.ade.iur.model.urf.Regulation;
import org.citygml4j.ade.iur.model.urf.UrbanPlan;
import org.citygml4j.ade.iur.model.urf.Urbanization;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrbanFunctionModule extends ADEModule {
    public static final UrbanFunctionModule v1_3 = new UrbanFunctionModule();
    private final HashMap<String, Class<? extends AbstractFeature>> features;

    private UrbanFunctionModule() {
        super("http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urf/1.3",
                "urf",
                "http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/schemas/urf/1.3/urbanFunction.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Administration", Administration.class);
        features.put("Agreement", Agreement.class);
        features.put("AreaClassification", AreaClassification.class);
        features.put("CensusBlock", CensusBlock.class);
        features.put("DevelopmentProject", DevelopmentProject.class);
        features.put("DisasterDamage", DisasterDamage.class);
        features.put("DisasterPreventionBase", DisasterPreventionBase.class);
        features.put("DistrictsAndZones", DistrictsAndZones.class);
        features.put("HubCity", HubCity.class);
        features.put("LandUseDiversion", LandUseDiversion.class);
        features.put("LandUsePlan", LandUsePlan.class);
        features.put("Pollution", Pollution.class);
        features.put("PublicTransit", PublicTransit.class);
        features.put("Recreations", Recreations.class);
        features.put("Regulation", Regulation.class);
        features.put("Urbanization", Urbanization.class);
        features.put("UrbanPlan", UrbanPlan.class);
    }
    
    @Override
    public URL getSchemaResource() {
        return UrbanFunctionModule.class.getResource("/org/citygml4j/ade/iur/schema/urbanFunction.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.go.kantei.iur._1_3.urf");
    }

    public String getModelPackageName() {
        return "vcs.citygml4j.ade.iur.model.urf";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return "target".equals(name);
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
