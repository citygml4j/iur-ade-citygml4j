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

package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.measures.Length;

public class Pathway extends PublicTransit {
    private Code mode;
    private Code isBidirectional;
    private Length length;
    private Integer traversalTime;
    private Integer stairCount;
    private Double maxSlope;
    private Double minWidth;
    private String signpostedAs;
    private String reversedSignpostedAs;
    private StopProperty from;
    private StopProperty to;

    public Code getMode() {
        return mode;
    }

    public void setMode(Code mode) {
        this.mode = ModelObjects.setParent(mode, this);
    }

    public Code getIsBidirectional() {
        return isBidirectional;
    }

    public void setIsBidirectional(Code isBidirectional) {
        this.isBidirectional = ModelObjects.setParent(isBidirectional, this);
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public Integer getTraversalTime() {
        return traversalTime;
    }

    public void setTraversalTime(Integer traversalTime) {
        this.traversalTime = traversalTime;
    }

    public Integer getStairCount() {
        return stairCount;
    }

    public void setStairCount(Integer stairCount) {
        this.stairCount = stairCount;
    }

    public Double getMaxSlope() {
        return maxSlope;
    }

    public void setMaxSlope(Double maxSlope) {
        this.maxSlope = maxSlope;
    }

    public Double getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(Double minWidth) {
        this.minWidth = minWidth;
    }

    public String getSignpostedAs() {
        return signpostedAs;
    }

    public void setSignpostedAs(String signpostedAs) {
        this.signpostedAs = signpostedAs;
    }

    public String getReversedSignpostedAs() {
        return reversedSignpostedAs;
    }

    public void setReversedSignpostedAs(String reversedSignpostedAs) {
        this.reversedSignpostedAs = reversedSignpostedAs;
    }

    public StopProperty getFrom() {
        return from;
    }

    public void setFrom(StopProperty from) {
        this.from = ModelObjects.setParent(from, this);
    }

    public StopProperty getTo() {
        return to;
    }

    public void setTo(StopProperty to) {
        this.to = ModelObjects.setParent(to, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Pathway copy = target == null ? new Pathway() : (Pathway) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Pathway(), copyBuilder);
    }
}
