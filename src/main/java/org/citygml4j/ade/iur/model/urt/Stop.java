package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

public class Stop extends PublicTransit {
    private Code code;
    private String ttsName;
    private Double latitude;
    private Double longitude;
    private Code zoneId;
    private String url;
    private Code locationType;
    private Code timeZone;
    private Code wheelchairBoarding;
    private String platformCode;
    private PointProperty point;
    private StopProperty parentStation;
    private LevelProperty level;

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = ModelObjects.setParent(code, this);
    }

    public String getTtsName() {
        return ttsName;
    }

    public void setTtsName(String ttsName) {
        this.ttsName = ttsName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Code getZoneId() {
        return zoneId;
    }

    public void setZoneId(Code zoneId) {
        this.zoneId = ModelObjects.setParent(zoneId, this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Code getLocationType() {
        return locationType;
    }

    public void setLocationType(Code locationType) {
        this.locationType = ModelObjects.setParent(locationType, this);
    }

    public Code getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Code timeZone) {
        this.timeZone = ModelObjects.setParent(timeZone, this);
    }

    public Code getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding(Code wheelchairBoarding) {
        this.wheelchairBoarding = ModelObjects.setParent(wheelchairBoarding, this);
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public PointProperty getPoint() {
        return point;
    }

    public void setPoint(PointProperty point) {
        this.point = ModelObjects.setParent(point, this);
    }

    public StopProperty getParentStation() {
        return parentStation;
    }

    public void setParentStation(StopProperty parentStation) {
        this.parentStation = ModelObjects.setParent(parentStation, this);
    }

    public LevelProperty getLevel() {
        return level;
    }

    public void setLevel(LevelProperty level) {
        this.level = ModelObjects.setParent(level, this);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(point);
        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Stop copy = target == null ? new Stop() : (Stop) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Stop(), copyBuilder);
    }
}
