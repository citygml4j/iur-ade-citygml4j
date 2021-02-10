package org.citygml4j.ade.iur.model.urt;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class Office extends PublicTransit {
    private String name;
    private String url;
    private String phone;

    public String getOfficeName() {
        return name;
    }

    public void setOfficeName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Office copy = target == null ? new Office() : (Office) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Office(), copyBuilder);
    }
}
