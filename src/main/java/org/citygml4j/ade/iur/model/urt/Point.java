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

package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

public class Point extends AbstractDataType {
    private Double latitude;
    private Double longitude;
    private PointProperty point;
    private Integer pointSequence;
    private Double pointDistanceTraveled;

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

    public PointProperty getPoint() {
        return point;
    }

    public void setPoint(PointProperty point) {
        this.point = ModelObjects.setParent(point, this);
    }

    public Integer getPointSequence() {
        return pointSequence;
    }

    public void setPointSequence(Integer pointSequence) {
        this.pointSequence = pointSequence != null && pointSequence >= 0 ? pointSequence : null;
    }

    public Double getPointDistanceTraveled() {
        return pointDistanceTraveled;
    }

    public void setPointDistanceTraveled(Double pointDistanceTraveled) {
        this.pointDistanceTraveled = pointDistanceTraveled;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Point copy = target == null ? new Point() : (Point) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Point(), copyBuilder);
    }
}
