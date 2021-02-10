package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalDate;

public class FeedInfo extends PublicTransitDataType {
    private String publisherName;
    private String publisherUrl;
    private Code language;
    private Code defaultLanguage;
    private LocalDate startDate;
    private LocalDate endDate;
    private String version;
    private String contactEmail;
    private String contactURL;
    private String detailedInfo;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherUrl() {
        return publisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }

    public Code getLanguage() {
        return language;
    }

    public void setLanguage(Code language) {
        this.language = ModelObjects.setParent(language, this);
    }

    public Code getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(Code defaultLanguage) {
        this.defaultLanguage = ModelObjects.setParent(defaultLanguage, this);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactURL() {
        return contactURL;
    }

    public void setContactURL(String contactURL) {
        this.contactURL = contactURL;
    }

    public String getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(String detailedInfo) {
        this.detailedInfo = detailedInfo;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FeedInfo copy = target == null ? new FeedInfo() : (FeedInfo) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FeedInfo(), copyBuilder);
    }
}
